package com.example.crm.grpc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClienteWebController {

    private final ClienteServiceGrpc.ClienteServiceBlockingStub stub;

    public ClienteWebController() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
        stub = ClienteServiceGrpc.newBlockingStub(channel);
    }

    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        List<String> clientes = new ArrayList<>();
        stub.listarClientes(Empty.newBuilder().build()).forEachRemaining(resp -> clientes.add(resp.getMensaje()));
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    @PostMapping("/clientes")
    public String registrarCliente(@RequestParam String nombre,
                                   @RequestParam String correo,
                                   @RequestParam String telefono,
                                   Model model) {
        if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            model.addAttribute("error", "Todos los campos son obligatorios.");
            return listarClientes(model);
        }

        ClienteRequest request = ClienteRequest.newBuilder()
                .setNombre(nombre)
                .setCorreo(correo)
                .setTelefono(telefono)
                .build();
        stub.registrarCliente(request);
        return "redirect:/clientes";
    }

    @PostMapping("/clientes/eliminar")
    public String eliminarCliente(@RequestParam String correo) {
        EliminarClienteRequest request = EliminarClienteRequest.newBuilder()
                .setCorreo(correo)
                .build();
        stub.eliminarCliente(request);
        return "redirect:/clientes";
    }
}
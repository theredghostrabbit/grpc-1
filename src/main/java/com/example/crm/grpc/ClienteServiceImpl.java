package com.example.crm.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@GrpcService
public class ClienteServiceImpl extends ClienteServiceGrpc.ClienteServiceImplBase {

    private final Map<String, ClienteRequest> clientes = new ConcurrentHashMap<>();

    @Override
    public void registrarCliente(ClienteRequest request, StreamObserver<ClienteResponse> responseObserver) {
        clientes.put(request.getCorreo(), request);
        ClienteResponse response = ClienteResponse.newBuilder()
                .setMensaje("Cliente '" + request.getNombre() + "' registrado correctamente.")
                .setRegistrado(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void buscarCliente(BuscarClienteRequest request, StreamObserver<ClienteResponse> responseObserver) {
        ClienteRequest cliente = clientes.get(request.getCorreo());
        ClienteResponse response = (cliente != null)
                ? ClienteResponse.newBuilder().setMensaje("Cliente encontrado: " + cliente.getNombre()).setRegistrado(true).build()
                : ClienteResponse.newBuilder().setMensaje("Cliente no encontrado.").setRegistrado(false).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void eliminarCliente(EliminarClienteRequest request, StreamObserver<ClienteResponse> responseObserver) {
        ClienteRequest eliminado = clientes.remove(request.getCorreo());
        ClienteResponse response = (eliminado != null)
                ? ClienteResponse.newBuilder().setMensaje("Cliente eliminado: " + eliminado.getNombre()).setRegistrado(true).build()
                : ClienteResponse.newBuilder().setMensaje("Cliente no encontrado.").setRegistrado(false).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listarClientes(Empty request, StreamObserver<ClienteResponse> responseObserver) {
        for (ClienteRequest cliente : clientes.values()) {
            ClienteResponse response = ClienteResponse.newBuilder()
                    .setMensaje("Cliente: " + cliente.getNombre() + ", Correo: " + cliente.getCorreo())
                    .setRegistrado(true)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
}
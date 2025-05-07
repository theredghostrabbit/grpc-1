package com.example.crm.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: cliente.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClienteServiceGrpc {

  private ClienteServiceGrpc() {}

  public static final String SERVICE_NAME = "ClienteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.crm.grpc.ClienteRequest,
      com.example.crm.grpc.ClienteResponse> getRegistrarClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegistrarCliente",
      requestType = com.example.crm.grpc.ClienteRequest.class,
      responseType = com.example.crm.grpc.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.crm.grpc.ClienteRequest,
      com.example.crm.grpc.ClienteResponse> getRegistrarClienteMethod() {
    io.grpc.MethodDescriptor<com.example.crm.grpc.ClienteRequest, com.example.crm.grpc.ClienteResponse> getRegistrarClienteMethod;
    if ((getRegistrarClienteMethod = ClienteServiceGrpc.getRegistrarClienteMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getRegistrarClienteMethod = ClienteServiceGrpc.getRegistrarClienteMethod) == null) {
          ClienteServiceGrpc.getRegistrarClienteMethod = getRegistrarClienteMethod =
              io.grpc.MethodDescriptor.<com.example.crm.grpc.ClienteRequest, com.example.crm.grpc.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegistrarCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.ClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.ClienteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("RegistrarCliente"))
              .build();
        }
      }
    }
    return getRegistrarClienteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.crm.grpc.BuscarClienteRequest,
      com.example.crm.grpc.ClienteResponse> getBuscarClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuscarCliente",
      requestType = com.example.crm.grpc.BuscarClienteRequest.class,
      responseType = com.example.crm.grpc.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.crm.grpc.BuscarClienteRequest,
      com.example.crm.grpc.ClienteResponse> getBuscarClienteMethod() {
    io.grpc.MethodDescriptor<com.example.crm.grpc.BuscarClienteRequest, com.example.crm.grpc.ClienteResponse> getBuscarClienteMethod;
    if ((getBuscarClienteMethod = ClienteServiceGrpc.getBuscarClienteMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getBuscarClienteMethod = ClienteServiceGrpc.getBuscarClienteMethod) == null) {
          ClienteServiceGrpc.getBuscarClienteMethod = getBuscarClienteMethod =
              io.grpc.MethodDescriptor.<com.example.crm.grpc.BuscarClienteRequest, com.example.crm.grpc.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuscarCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.BuscarClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.ClienteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("BuscarCliente"))
              .build();
        }
      }
    }
    return getBuscarClienteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.crm.grpc.EliminarClienteRequest,
      com.example.crm.grpc.ClienteResponse> getEliminarClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EliminarCliente",
      requestType = com.example.crm.grpc.EliminarClienteRequest.class,
      responseType = com.example.crm.grpc.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.crm.grpc.EliminarClienteRequest,
      com.example.crm.grpc.ClienteResponse> getEliminarClienteMethod() {
    io.grpc.MethodDescriptor<com.example.crm.grpc.EliminarClienteRequest, com.example.crm.grpc.ClienteResponse> getEliminarClienteMethod;
    if ((getEliminarClienteMethod = ClienteServiceGrpc.getEliminarClienteMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getEliminarClienteMethod = ClienteServiceGrpc.getEliminarClienteMethod) == null) {
          ClienteServiceGrpc.getEliminarClienteMethod = getEliminarClienteMethod =
              io.grpc.MethodDescriptor.<com.example.crm.grpc.EliminarClienteRequest, com.example.crm.grpc.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EliminarCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.EliminarClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.ClienteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("EliminarCliente"))
              .build();
        }
      }
    }
    return getEliminarClienteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.crm.grpc.Empty,
      com.example.crm.grpc.ClienteResponse> getListarClientesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListarClientes",
      requestType = com.example.crm.grpc.Empty.class,
      responseType = com.example.crm.grpc.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.crm.grpc.Empty,
      com.example.crm.grpc.ClienteResponse> getListarClientesMethod() {
    io.grpc.MethodDescriptor<com.example.crm.grpc.Empty, com.example.crm.grpc.ClienteResponse> getListarClientesMethod;
    if ((getListarClientesMethod = ClienteServiceGrpc.getListarClientesMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getListarClientesMethod = ClienteServiceGrpc.getListarClientesMethod) == null) {
          ClienteServiceGrpc.getListarClientesMethod = getListarClientesMethod =
              io.grpc.MethodDescriptor.<com.example.crm.grpc.Empty, com.example.crm.grpc.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListarClientes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.crm.grpc.ClienteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("ListarClientes"))
              .build();
        }
      }
    }
    return getListarClientesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClienteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceStub>() {
        @java.lang.Override
        public ClienteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceStub(channel, callOptions);
        }
      };
    return ClienteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClienteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingStub>() {
        @java.lang.Override
        public ClienteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceBlockingStub(channel, callOptions);
        }
      };
    return ClienteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClienteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceFutureStub>() {
        @java.lang.Override
        public ClienteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceFutureStub(channel, callOptions);
        }
      };
    return ClienteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registrarCliente(com.example.crm.grpc.ClienteRequest request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegistrarClienteMethod(), responseObserver);
    }

    /**
     */
    default void buscarCliente(com.example.crm.grpc.BuscarClienteRequest request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuscarClienteMethod(), responseObserver);
    }

    /**
     */
    default void eliminarCliente(com.example.crm.grpc.EliminarClienteRequest request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEliminarClienteMethod(), responseObserver);
    }

    /**
     */
    default void listarClientes(com.example.crm.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarClientesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClienteService.
   */
  public static abstract class ClienteServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClienteServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClienteServiceStub> {
    private ClienteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceStub(channel, callOptions);
    }

    /**
     */
    public void registrarCliente(com.example.crm.grpc.ClienteRequest request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegistrarClienteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buscarCliente(com.example.crm.grpc.BuscarClienteRequest request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuscarClienteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eliminarCliente(com.example.crm.grpc.EliminarClienteRequest request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEliminarClienteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarClientes(com.example.crm.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListarClientesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClienteServiceBlockingStub> {
    private ClienteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.crm.grpc.ClienteResponse registrarCliente(com.example.crm.grpc.ClienteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegistrarClienteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.crm.grpc.ClienteResponse buscarCliente(com.example.crm.grpc.BuscarClienteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuscarClienteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.crm.grpc.ClienteResponse eliminarCliente(com.example.crm.grpc.EliminarClienteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEliminarClienteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.crm.grpc.ClienteResponse> listarClientes(
        com.example.crm.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListarClientesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClienteService.
   */
  public static final class ClienteServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClienteServiceFutureStub> {
    private ClienteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.crm.grpc.ClienteResponse> registrarCliente(
        com.example.crm.grpc.ClienteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegistrarClienteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.crm.grpc.ClienteResponse> buscarCliente(
        com.example.crm.grpc.BuscarClienteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuscarClienteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.crm.grpc.ClienteResponse> eliminarCliente(
        com.example.crm.grpc.EliminarClienteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEliminarClienteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRAR_CLIENTE = 0;
  private static final int METHODID_BUSCAR_CLIENTE = 1;
  private static final int METHODID_ELIMINAR_CLIENTE = 2;
  private static final int METHODID_LISTAR_CLIENTES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRAR_CLIENTE:
          serviceImpl.registrarCliente((com.example.crm.grpc.ClienteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse>) responseObserver);
          break;
        case METHODID_BUSCAR_CLIENTE:
          serviceImpl.buscarCliente((com.example.crm.grpc.BuscarClienteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse>) responseObserver);
          break;
        case METHODID_ELIMINAR_CLIENTE:
          serviceImpl.eliminarCliente((com.example.crm.grpc.EliminarClienteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse>) responseObserver);
          break;
        case METHODID_LISTAR_CLIENTES:
          serviceImpl.listarClientes((com.example.crm.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.crm.grpc.ClienteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegistrarClienteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.crm.grpc.ClienteRequest,
              com.example.crm.grpc.ClienteResponse>(
                service, METHODID_REGISTRAR_CLIENTE)))
        .addMethod(
          getBuscarClienteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.crm.grpc.BuscarClienteRequest,
              com.example.crm.grpc.ClienteResponse>(
                service, METHODID_BUSCAR_CLIENTE)))
        .addMethod(
          getEliminarClienteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.crm.grpc.EliminarClienteRequest,
              com.example.crm.grpc.ClienteResponse>(
                service, METHODID_ELIMINAR_CLIENTE)))
        .addMethod(
          getListarClientesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.crm.grpc.Empty,
              com.example.crm.grpc.ClienteResponse>(
                service, METHODID_LISTAR_CLIENTES)))
        .build();
  }

  private static abstract class ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClienteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.crm.grpc.Cliente.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClienteService");
    }
  }

  private static final class ClienteServiceFileDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier {
    ClienteServiceFileDescriptorSupplier() {}
  }

  private static final class ClienteServiceMethodDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClienteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClienteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClienteServiceFileDescriptorSupplier())
              .addMethod(getRegistrarClienteMethod())
              .addMethod(getBuscarClienteMethod())
              .addMethod(getEliminarClienteMethod())
              .addMethod(getListarClientesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package com.proto.saludo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.0)",
    comments = "Source: saludo/holamundo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SaludoServiceGrpc {

  private SaludoServiceGrpc() {}

  public static final String SERVICE_NAME = "saludo.SaludoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saludo",
      requestType = com.proto.saludo.SaludoRequest.class,
      responseType = com.proto.saludo.SaludoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoMethod() {
    io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse> getSaludoMethod;
    if ((getSaludoMethod = SaludoServiceGrpc.getSaludoMethod) == null) {
      synchronized (SaludoServiceGrpc.class) {
        if ((getSaludoMethod = SaludoServiceGrpc.getSaludoMethod) == null) {
          SaludoServiceGrpc.getSaludoMethod = getSaludoMethod =
              io.grpc.MethodDescriptor.<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saludo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SaludoServiceMethodDescriptorSupplier("saludo"))
              .build();
        }
      }
    }
    return getSaludoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoMuchasVecesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saludoMuchasVeces",
      requestType = com.proto.saludo.SaludoRequest.class,
      responseType = com.proto.saludo.SaludoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoMuchasVecesMethod() {
    io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse> getSaludoMuchasVecesMethod;
    if ((getSaludoMuchasVecesMethod = SaludoServiceGrpc.getSaludoMuchasVecesMethod) == null) {
      synchronized (SaludoServiceGrpc.class) {
        if ((getSaludoMuchasVecesMethod = SaludoServiceGrpc.getSaludoMuchasVecesMethod) == null) {
          SaludoServiceGrpc.getSaludoMuchasVecesMethod = getSaludoMuchasVecesMethod =
              io.grpc.MethodDescriptor.<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saludoMuchasVeces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SaludoServiceMethodDescriptorSupplier("saludoMuchasVeces"))
              .build();
        }
      }
    }
    return getSaludoMuchasVecesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saludoStream",
      requestType = com.proto.saludo.SaludoRequest.class,
      responseType = com.proto.saludo.SaludoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse> getSaludoStreamMethod;
    if ((getSaludoStreamMethod = SaludoServiceGrpc.getSaludoStreamMethod) == null) {
      synchronized (SaludoServiceGrpc.class) {
        if ((getSaludoStreamMethod = SaludoServiceGrpc.getSaludoStreamMethod) == null) {
          SaludoServiceGrpc.getSaludoStreamMethod = getSaludoStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saludoStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SaludoServiceMethodDescriptorSupplier("saludoStream"))
              .build();
        }
      }
    }
    return getSaludoStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoStreamBidireccionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saludoStreamBidireccional",
      requestType = com.proto.saludo.SaludoRequest.class,
      responseType = com.proto.saludo.SaludoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest,
      com.proto.saludo.SaludoResponse> getSaludoStreamBidireccionalMethod() {
    io.grpc.MethodDescriptor<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse> getSaludoStreamBidireccionalMethod;
    if ((getSaludoStreamBidireccionalMethod = SaludoServiceGrpc.getSaludoStreamBidireccionalMethod) == null) {
      synchronized (SaludoServiceGrpc.class) {
        if ((getSaludoStreamBidireccionalMethod = SaludoServiceGrpc.getSaludoStreamBidireccionalMethod) == null) {
          SaludoServiceGrpc.getSaludoStreamBidireccionalMethod = getSaludoStreamBidireccionalMethod =
              io.grpc.MethodDescriptor.<com.proto.saludo.SaludoRequest, com.proto.saludo.SaludoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saludoStreamBidireccional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.saludo.SaludoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SaludoServiceMethodDescriptorSupplier("saludoStreamBidireccional"))
              .build();
        }
      }
    }
    return getSaludoStreamBidireccionalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SaludoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaludoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaludoServiceStub>() {
        @java.lang.Override
        public SaludoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaludoServiceStub(channel, callOptions);
        }
      };
    return SaludoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SaludoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaludoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaludoServiceBlockingStub>() {
        @java.lang.Override
        public SaludoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaludoServiceBlockingStub(channel, callOptions);
        }
      };
    return SaludoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SaludoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaludoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaludoServiceFutureStub>() {
        @java.lang.Override
        public SaludoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaludoServiceFutureStub(channel, callOptions);
        }
      };
    return SaludoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SaludoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saludo(com.proto.saludo.SaludoRequest request,
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaludoMethod(), responseObserver);
    }

    /**
     */
    public void saludoMuchasVeces(com.proto.saludo.SaludoRequest request,
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaludoMuchasVecesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.saludo.SaludoRequest> saludoStream(
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSaludoStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.saludo.SaludoRequest> saludoStreamBidireccional(
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSaludoStreamBidireccionalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaludoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.saludo.SaludoRequest,
                com.proto.saludo.SaludoResponse>(
                  this, METHODID_SALUDO)))
          .addMethod(
            getSaludoMuchasVecesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.saludo.SaludoRequest,
                com.proto.saludo.SaludoResponse>(
                  this, METHODID_SALUDO_MUCHAS_VECES)))
          .addMethod(
            getSaludoStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.saludo.SaludoRequest,
                com.proto.saludo.SaludoResponse>(
                  this, METHODID_SALUDO_STREAM)))
          .addMethod(
            getSaludoStreamBidireccionalMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.saludo.SaludoRequest,
                com.proto.saludo.SaludoResponse>(
                  this, METHODID_SALUDO_STREAM_BIDIRECCIONAL)))
          .build();
    }
  }

  /**
   */
  public static final class SaludoServiceStub extends io.grpc.stub.AbstractAsyncStub<SaludoServiceStub> {
    private SaludoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaludoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaludoServiceStub(channel, callOptions);
    }

    /**
     */
    public void saludo(com.proto.saludo.SaludoRequest request,
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaludoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saludoMuchasVeces(com.proto.saludo.SaludoRequest request,
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSaludoMuchasVecesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.saludo.SaludoRequest> saludoStream(
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSaludoStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.saludo.SaludoRequest> saludoStreamBidireccional(
        io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSaludoStreamBidireccionalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SaludoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SaludoServiceBlockingStub> {
    private SaludoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaludoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaludoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.saludo.SaludoResponse saludo(com.proto.saludo.SaludoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaludoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.saludo.SaludoResponse> saludoMuchasVeces(
        com.proto.saludo.SaludoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSaludoMuchasVecesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SaludoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SaludoServiceFutureStub> {
    private SaludoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaludoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaludoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.saludo.SaludoResponse> saludo(
        com.proto.saludo.SaludoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaludoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALUDO = 0;
  private static final int METHODID_SALUDO_MUCHAS_VECES = 1;
  private static final int METHODID_SALUDO_STREAM = 2;
  private static final int METHODID_SALUDO_STREAM_BIDIRECCIONAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SaludoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SaludoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALUDO:
          serviceImpl.saludo((com.proto.saludo.SaludoRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse>) responseObserver);
          break;
        case METHODID_SALUDO_MUCHAS_VECES:
          serviceImpl.saludoMuchasVeces((com.proto.saludo.SaludoRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse>) responseObserver);
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
        case METHODID_SALUDO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saludoStream(
              (io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse>) responseObserver);
        case METHODID_SALUDO_STREAM_BIDIRECCIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saludoStreamBidireccional(
              (io.grpc.stub.StreamObserver<com.proto.saludo.SaludoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SaludoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SaludoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.saludo.Holamundo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SaludoService");
    }
  }

  private static final class SaludoServiceFileDescriptorSupplier
      extends SaludoServiceBaseDescriptorSupplier {
    SaludoServiceFileDescriptorSupplier() {}
  }

  private static final class SaludoServiceMethodDescriptorSupplier
      extends SaludoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SaludoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SaludoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SaludoServiceFileDescriptorSupplier())
              .addMethod(getSaludoMethod())
              .addMethod(getSaludoMuchasVecesMethod())
              .addMethod(getSaludoStreamMethod())
              .addMethod(getSaludoStreamBidireccionalMethod())
              .build();
        }
      }
    }
    return result;
  }
}

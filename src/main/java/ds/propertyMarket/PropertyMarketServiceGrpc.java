package ds.propertyMarket;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: propertyMarket.proto")
public final class PropertyMarketServiceGrpc {

  private PropertyMarketServiceGrpc() {}

  public static final String SERVICE_NAME = "propertyMarket.PropertyMarketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.propertyMarket.desiredPropertyAvailable,
      ds.propertyMarket.PropertyAvailableConfirm> getSetPropertyAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPropertyAvailability",
      requestType = ds.propertyMarket.desiredPropertyAvailable.class,
      responseType = ds.propertyMarket.PropertyAvailableConfirm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.propertyMarket.desiredPropertyAvailable,
      ds.propertyMarket.PropertyAvailableConfirm> getSetPropertyAvailabilityMethod() {
    io.grpc.MethodDescriptor<ds.propertyMarket.desiredPropertyAvailable, ds.propertyMarket.PropertyAvailableConfirm> getSetPropertyAvailabilityMethod;
    if ((getSetPropertyAvailabilityMethod = PropertyMarketServiceGrpc.getSetPropertyAvailabilityMethod) == null) {
      synchronized (PropertyMarketServiceGrpc.class) {
        if ((getSetPropertyAvailabilityMethod = PropertyMarketServiceGrpc.getSetPropertyAvailabilityMethod) == null) {
          PropertyMarketServiceGrpc.getSetPropertyAvailabilityMethod = getSetPropertyAvailabilityMethod = 
              io.grpc.MethodDescriptor.<ds.propertyMarket.desiredPropertyAvailable, ds.propertyMarket.PropertyAvailableConfirm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "propertyMarket.PropertyMarketService", "SetPropertyAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.propertyMarket.desiredPropertyAvailable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.propertyMarket.PropertyAvailableConfirm.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertyMarketServiceMethodDescriptorSupplier("SetPropertyAvailability"))
                  .build();
          }
        }
     }
     return getSetPropertyAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.propertyMarket.TenantsVolatilityRequest,
      ds.propertyMarket.TenantsVolatilityResponse> getSendTenantsVolatilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTenantsVolatility",
      requestType = ds.propertyMarket.TenantsVolatilityRequest.class,
      responseType = ds.propertyMarket.TenantsVolatilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.propertyMarket.TenantsVolatilityRequest,
      ds.propertyMarket.TenantsVolatilityResponse> getSendTenantsVolatilityMethod() {
    io.grpc.MethodDescriptor<ds.propertyMarket.TenantsVolatilityRequest, ds.propertyMarket.TenantsVolatilityResponse> getSendTenantsVolatilityMethod;
    if ((getSendTenantsVolatilityMethod = PropertyMarketServiceGrpc.getSendTenantsVolatilityMethod) == null) {
      synchronized (PropertyMarketServiceGrpc.class) {
        if ((getSendTenantsVolatilityMethod = PropertyMarketServiceGrpc.getSendTenantsVolatilityMethod) == null) {
          PropertyMarketServiceGrpc.getSendTenantsVolatilityMethod = getSendTenantsVolatilityMethod = 
              io.grpc.MethodDescriptor.<ds.propertyMarket.TenantsVolatilityRequest, ds.propertyMarket.TenantsVolatilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "propertyMarket.PropertyMarketService", "SendTenantsVolatility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.propertyMarket.TenantsVolatilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.propertyMarket.TenantsVolatilityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertyMarketServiceMethodDescriptorSupplier("SendTenantsVolatility"))
                  .build();
          }
        }
     }
     return getSendTenantsVolatilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PropertyMarketServiceStub newStub(io.grpc.Channel channel) {
    return new PropertyMarketServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PropertyMarketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PropertyMarketServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PropertyMarketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PropertyMarketServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class PropertyMarketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setPropertyAvailability(ds.propertyMarket.desiredPropertyAvailable request,
        io.grpc.stub.StreamObserver<ds.propertyMarket.PropertyAvailableConfirm> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPropertyAvailabilityMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.propertyMarket.TenantsVolatilityRequest> sendTenantsVolatility(
        io.grpc.stub.StreamObserver<ds.propertyMarket.TenantsVolatilityResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendTenantsVolatilityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetPropertyAvailabilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.propertyMarket.desiredPropertyAvailable,
                ds.propertyMarket.PropertyAvailableConfirm>(
                  this, METHODID_SET_PROPERTY_AVAILABILITY)))
          .addMethod(
            getSendTenantsVolatilityMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.propertyMarket.TenantsVolatilityRequest,
                ds.propertyMarket.TenantsVolatilityResponse>(
                  this, METHODID_SEND_TENANTS_VOLATILITY)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PropertyMarketServiceStub extends io.grpc.stub.AbstractStub<PropertyMarketServiceStub> {
    private PropertyMarketServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PropertyMarketServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyMarketServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PropertyMarketServiceStub(channel, callOptions);
    }

    /**
     */
    public void setPropertyAvailability(ds.propertyMarket.desiredPropertyAvailable request,
        io.grpc.stub.StreamObserver<ds.propertyMarket.PropertyAvailableConfirm> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPropertyAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.propertyMarket.TenantsVolatilityRequest> sendTenantsVolatility(
        io.grpc.stub.StreamObserver<ds.propertyMarket.TenantsVolatilityResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendTenantsVolatilityMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PropertyMarketServiceBlockingStub extends io.grpc.stub.AbstractStub<PropertyMarketServiceBlockingStub> {
    private PropertyMarketServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PropertyMarketServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyMarketServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PropertyMarketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.propertyMarket.PropertyAvailableConfirm setPropertyAvailability(ds.propertyMarket.desiredPropertyAvailable request) {
      return blockingUnaryCall(
          getChannel(), getSetPropertyAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PropertyMarketServiceFutureStub extends io.grpc.stub.AbstractStub<PropertyMarketServiceFutureStub> {
    private PropertyMarketServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PropertyMarketServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyMarketServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PropertyMarketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.propertyMarket.PropertyAvailableConfirm> setPropertyAvailability(
        ds.propertyMarket.desiredPropertyAvailable request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPropertyAvailabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_PROPERTY_AVAILABILITY = 0;
  private static final int METHODID_SEND_TENANTS_VOLATILITY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PropertyMarketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PropertyMarketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_PROPERTY_AVAILABILITY:
          serviceImpl.setPropertyAvailability((ds.propertyMarket.desiredPropertyAvailable) request,
              (io.grpc.stub.StreamObserver<ds.propertyMarket.PropertyAvailableConfirm>) responseObserver);
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
        case METHODID_SEND_TENANTS_VOLATILITY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendTenantsVolatility(
              (io.grpc.stub.StreamObserver<ds.propertyMarket.TenantsVolatilityResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PropertyMarketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PropertyMarketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.propertyMarket.propertyMarketImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PropertyMarketService");
    }
  }

  private static final class PropertyMarketServiceFileDescriptorSupplier
      extends PropertyMarketServiceBaseDescriptorSupplier {
    PropertyMarketServiceFileDescriptorSupplier() {}
  }

  private static final class PropertyMarketServiceMethodDescriptorSupplier
      extends PropertyMarketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PropertyMarketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PropertyMarketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PropertyMarketServiceFileDescriptorSupplier())
              .addMethod(getSetPropertyAvailabilityMethod())
              .addMethod(getSendTenantsVolatilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package ds.buildingSiteMonitoring;

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
    comments = "Source: buildingSiteMonitoring.proto")
public final class BuildingMonitoringServiceGrpc {

  private BuildingMonitoringServiceGrpc() {}

  public static final String SERVICE_NAME = "buildingSiteMonitoring.BuildingMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.buildingSiteMonitoring.AreaRequest,
      ds.buildingSiteMonitoring.AreaResponse> getMonitorAreaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorArea",
      requestType = ds.buildingSiteMonitoring.AreaRequest.class,
      responseType = ds.buildingSiteMonitoring.AreaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.buildingSiteMonitoring.AreaRequest,
      ds.buildingSiteMonitoring.AreaResponse> getMonitorAreaMethod() {
    io.grpc.MethodDescriptor<ds.buildingSiteMonitoring.AreaRequest, ds.buildingSiteMonitoring.AreaResponse> getMonitorAreaMethod;
    if ((getMonitorAreaMethod = BuildingMonitoringServiceGrpc.getMonitorAreaMethod) == null) {
      synchronized (BuildingMonitoringServiceGrpc.class) {
        if ((getMonitorAreaMethod = BuildingMonitoringServiceGrpc.getMonitorAreaMethod) == null) {
          BuildingMonitoringServiceGrpc.getMonitorAreaMethod = getMonitorAreaMethod = 
              io.grpc.MethodDescriptor.<ds.buildingSiteMonitoring.AreaRequest, ds.buildingSiteMonitoring.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "buildingSiteMonitoring.BuildingMonitoringService", "MonitorArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingSiteMonitoring.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingSiteMonitoring.AreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingMonitoringServiceMethodDescriptorSupplier("MonitorArea"))
                  .build();
          }
        }
     }
     return getMonitorAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.buildingSiteMonitoring.SensorDataRequest,
      ds.buildingSiteMonitoring.SensorDataResponse> getSendSensorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSensorData",
      requestType = ds.buildingSiteMonitoring.SensorDataRequest.class,
      responseType = ds.buildingSiteMonitoring.SensorDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.buildingSiteMonitoring.SensorDataRequest,
      ds.buildingSiteMonitoring.SensorDataResponse> getSendSensorDataMethod() {
    io.grpc.MethodDescriptor<ds.buildingSiteMonitoring.SensorDataRequest, ds.buildingSiteMonitoring.SensorDataResponse> getSendSensorDataMethod;
    if ((getSendSensorDataMethod = BuildingMonitoringServiceGrpc.getSendSensorDataMethod) == null) {
      synchronized (BuildingMonitoringServiceGrpc.class) {
        if ((getSendSensorDataMethod = BuildingMonitoringServiceGrpc.getSendSensorDataMethod) == null) {
          BuildingMonitoringServiceGrpc.getSendSensorDataMethod = getSendSensorDataMethod = 
              io.grpc.MethodDescriptor.<ds.buildingSiteMonitoring.SensorDataRequest, ds.buildingSiteMonitoring.SensorDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "buildingSiteMonitoring.BuildingMonitoringService", "SendSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingSiteMonitoring.SensorDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingSiteMonitoring.SensorDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingMonitoringServiceMethodDescriptorSupplier("SendSensorData"))
                  .build();
          }
        }
     }
     return getSendSensorDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuildingMonitoringServiceStub newStub(io.grpc.Channel channel) {
    return new BuildingMonitoringServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuildingMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BuildingMonitoringServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuildingMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BuildingMonitoringServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class BuildingMonitoringServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void monitorArea(ds.buildingSiteMonitoring.AreaRequest request,
        io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorAreaMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.SensorDataRequest> sendSensorData(
        io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.SensorDataResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendSensorDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorAreaMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.buildingSiteMonitoring.AreaRequest,
                ds.buildingSiteMonitoring.AreaResponse>(
                  this, METHODID_MONITOR_AREA)))
          .addMethod(
            getSendSensorDataMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.buildingSiteMonitoring.SensorDataRequest,
                ds.buildingSiteMonitoring.SensorDataResponse>(
                  this, METHODID_SEND_SENSOR_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BuildingMonitoringServiceStub extends io.grpc.stub.AbstractStub<BuildingMonitoringServiceStub> {
    private BuildingMonitoringServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingMonitoringServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingMonitoringServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingMonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void monitorArea(ds.buildingSiteMonitoring.AreaRequest request,
        io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.AreaResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMonitorAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.SensorDataRequest> sendSensorData(
        io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.SensorDataResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendSensorDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BuildingMonitoringServiceBlockingStub extends io.grpc.stub.AbstractStub<BuildingMonitoringServiceBlockingStub> {
    private BuildingMonitoringServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingMonitoringServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingMonitoringServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingMonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.buildingSiteMonitoring.AreaResponse> monitorArea(
        ds.buildingSiteMonitoring.AreaRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMonitorAreaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BuildingMonitoringServiceFutureStub extends io.grpc.stub.AbstractStub<BuildingMonitoringServiceFutureStub> {
    private BuildingMonitoringServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingMonitoringServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingMonitoringServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingMonitoringServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MONITOR_AREA = 0;
  private static final int METHODID_SEND_SENSOR_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuildingMonitoringServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BuildingMonitoringServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_AREA:
          serviceImpl.monitorArea((ds.buildingSiteMonitoring.AreaRequest) request,
              (io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.AreaResponse>) responseObserver);
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
        case METHODID_SEND_SENSOR_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendSensorData(
              (io.grpc.stub.StreamObserver<ds.buildingSiteMonitoring.SensorDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BuildingMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuildingMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.buildingSiteMonitoring.BuildingSiteMonitoringImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuildingMonitoringService");
    }
  }

  private static final class BuildingMonitoringServiceFileDescriptorSupplier
      extends BuildingMonitoringServiceBaseDescriptorSupplier {
    BuildingMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class BuildingMonitoringServiceMethodDescriptorSupplier
      extends BuildingMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BuildingMonitoringServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BuildingMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuildingMonitoringServiceFileDescriptorSupplier())
              .addMethod(getMonitorAreaMethod())
              .addMethod(getSendSensorDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package ds.buildingMaterial;

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
    comments = "Source: buildingMaterial.proto")
public final class BuildingMaterialGrpc {

  private BuildingMaterialGrpc() {}

  public static final String SERVICE_NAME = "buildingMaterial.BuildingMaterial";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.buildingMaterial.MaterialRequest,
      ds.buildingMaterial.MaterialResponse> getCheckMaterialLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMaterialLevel",
      requestType = ds.buildingMaterial.MaterialRequest.class,
      responseType = ds.buildingMaterial.MaterialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.buildingMaterial.MaterialRequest,
      ds.buildingMaterial.MaterialResponse> getCheckMaterialLevelMethod() {
    io.grpc.MethodDescriptor<ds.buildingMaterial.MaterialRequest, ds.buildingMaterial.MaterialResponse> getCheckMaterialLevelMethod;
    if ((getCheckMaterialLevelMethod = BuildingMaterialGrpc.getCheckMaterialLevelMethod) == null) {
      synchronized (BuildingMaterialGrpc.class) {
        if ((getCheckMaterialLevelMethod = BuildingMaterialGrpc.getCheckMaterialLevelMethod) == null) {
          BuildingMaterialGrpc.getCheckMaterialLevelMethod = getCheckMaterialLevelMethod = 
              io.grpc.MethodDescriptor.<ds.buildingMaterial.MaterialRequest, ds.buildingMaterial.MaterialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "buildingMaterial.BuildingMaterial", "CheckMaterialLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingMaterial.MaterialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingMaterial.MaterialResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingMaterialMethodDescriptorSupplier("CheckMaterialLevel"))
                  .build();
          }
        }
     }
     return getCheckMaterialLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.buildingMaterial.MonitorLevels,
      ds.buildingMaterial.LevelsResponse> getMonitorMaterialLevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorMaterialLevels",
      requestType = ds.buildingMaterial.MonitorLevels.class,
      responseType = ds.buildingMaterial.LevelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.buildingMaterial.MonitorLevels,
      ds.buildingMaterial.LevelsResponse> getMonitorMaterialLevelsMethod() {
    io.grpc.MethodDescriptor<ds.buildingMaterial.MonitorLevels, ds.buildingMaterial.LevelsResponse> getMonitorMaterialLevelsMethod;
    if ((getMonitorMaterialLevelsMethod = BuildingMaterialGrpc.getMonitorMaterialLevelsMethod) == null) {
      synchronized (BuildingMaterialGrpc.class) {
        if ((getMonitorMaterialLevelsMethod = BuildingMaterialGrpc.getMonitorMaterialLevelsMethod) == null) {
          BuildingMaterialGrpc.getMonitorMaterialLevelsMethod = getMonitorMaterialLevelsMethod = 
              io.grpc.MethodDescriptor.<ds.buildingMaterial.MonitorLevels, ds.buildingMaterial.LevelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "buildingMaterial.BuildingMaterial", "MonitorMaterialLevels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingMaterial.MonitorLevels.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingMaterial.LevelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingMaterialMethodDescriptorSupplier("MonitorMaterialLevels"))
                  .build();
          }
        }
     }
     return getMonitorMaterialLevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.buildingMaterial.OrderMaterial,
      ds.buildingMaterial.OrderMaterialResponse> getSwitchToOrderMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwitchToOrderMaterial",
      requestType = ds.buildingMaterial.OrderMaterial.class,
      responseType = ds.buildingMaterial.OrderMaterialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.buildingMaterial.OrderMaterial,
      ds.buildingMaterial.OrderMaterialResponse> getSwitchToOrderMaterialMethod() {
    io.grpc.MethodDescriptor<ds.buildingMaterial.OrderMaterial, ds.buildingMaterial.OrderMaterialResponse> getSwitchToOrderMaterialMethod;
    if ((getSwitchToOrderMaterialMethod = BuildingMaterialGrpc.getSwitchToOrderMaterialMethod) == null) {
      synchronized (BuildingMaterialGrpc.class) {
        if ((getSwitchToOrderMaterialMethod = BuildingMaterialGrpc.getSwitchToOrderMaterialMethod) == null) {
          BuildingMaterialGrpc.getSwitchToOrderMaterialMethod = getSwitchToOrderMaterialMethod = 
              io.grpc.MethodDescriptor.<ds.buildingMaterial.OrderMaterial, ds.buildingMaterial.OrderMaterialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "buildingMaterial.BuildingMaterial", "SwitchToOrderMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingMaterial.OrderMaterial.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.buildingMaterial.OrderMaterialResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingMaterialMethodDescriptorSupplier("SwitchToOrderMaterial"))
                  .build();
          }
        }
     }
     return getSwitchToOrderMaterialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuildingMaterialStub newStub(io.grpc.Channel channel) {
    return new BuildingMaterialStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuildingMaterialBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BuildingMaterialBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuildingMaterialFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BuildingMaterialFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class BuildingMaterialImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkMaterialLevel(ds.buildingMaterial.MaterialRequest request,
        io.grpc.stub.StreamObserver<ds.buildingMaterial.MaterialResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMaterialLevelMethod(), responseObserver);
    }

    /**
     */
    public void monitorMaterialLevels(ds.buildingMaterial.MonitorLevels request,
        io.grpc.stub.StreamObserver<ds.buildingMaterial.LevelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorMaterialLevelsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.buildingMaterial.OrderMaterial> switchToOrderMaterial(
        io.grpc.stub.StreamObserver<ds.buildingMaterial.OrderMaterialResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSwitchToOrderMaterialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMaterialLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.buildingMaterial.MaterialRequest,
                ds.buildingMaterial.MaterialResponse>(
                  this, METHODID_CHECK_MATERIAL_LEVEL)))
          .addMethod(
            getMonitorMaterialLevelsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.buildingMaterial.MonitorLevels,
                ds.buildingMaterial.LevelsResponse>(
                  this, METHODID_MONITOR_MATERIAL_LEVELS)))
          .addMethod(
            getSwitchToOrderMaterialMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.buildingMaterial.OrderMaterial,
                ds.buildingMaterial.OrderMaterialResponse>(
                  this, METHODID_SWITCH_TO_ORDER_MATERIAL)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BuildingMaterialStub extends io.grpc.stub.AbstractStub<BuildingMaterialStub> {
    private BuildingMaterialStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingMaterialStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingMaterialStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingMaterialStub(channel, callOptions);
    }

    /**
     */
    public void checkMaterialLevel(ds.buildingMaterial.MaterialRequest request,
        io.grpc.stub.StreamObserver<ds.buildingMaterial.MaterialResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMaterialLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void monitorMaterialLevels(ds.buildingMaterial.MonitorLevels request,
        io.grpc.stub.StreamObserver<ds.buildingMaterial.LevelsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMonitorMaterialLevelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.buildingMaterial.OrderMaterial> switchToOrderMaterial(
        io.grpc.stub.StreamObserver<ds.buildingMaterial.OrderMaterialResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSwitchToOrderMaterialMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BuildingMaterialBlockingStub extends io.grpc.stub.AbstractStub<BuildingMaterialBlockingStub> {
    private BuildingMaterialBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingMaterialBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingMaterialBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingMaterialBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.buildingMaterial.MaterialResponse checkMaterialLevel(ds.buildingMaterial.MaterialRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMaterialLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.buildingMaterial.LevelsResponse> monitorMaterialLevels(
        ds.buildingMaterial.MonitorLevels request) {
      return blockingServerStreamingCall(
          getChannel(), getMonitorMaterialLevelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BuildingMaterialFutureStub extends io.grpc.stub.AbstractStub<BuildingMaterialFutureStub> {
    private BuildingMaterialFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingMaterialFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingMaterialFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingMaterialFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.buildingMaterial.MaterialResponse> checkMaterialLevel(
        ds.buildingMaterial.MaterialRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMaterialLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_MATERIAL_LEVEL = 0;
  private static final int METHODID_MONITOR_MATERIAL_LEVELS = 1;
  private static final int METHODID_SWITCH_TO_ORDER_MATERIAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuildingMaterialImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BuildingMaterialImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_MATERIAL_LEVEL:
          serviceImpl.checkMaterialLevel((ds.buildingMaterial.MaterialRequest) request,
              (io.grpc.stub.StreamObserver<ds.buildingMaterial.MaterialResponse>) responseObserver);
          break;
        case METHODID_MONITOR_MATERIAL_LEVELS:
          serviceImpl.monitorMaterialLevels((ds.buildingMaterial.MonitorLevels) request,
              (io.grpc.stub.StreamObserver<ds.buildingMaterial.LevelsResponse>) responseObserver);
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
        case METHODID_SWITCH_TO_ORDER_MATERIAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.switchToOrderMaterial(
              (io.grpc.stub.StreamObserver<ds.buildingMaterial.OrderMaterialResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BuildingMaterialBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuildingMaterialBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.buildingMaterial.BuildingMaterialImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuildingMaterial");
    }
  }

  private static final class BuildingMaterialFileDescriptorSupplier
      extends BuildingMaterialBaseDescriptorSupplier {
    BuildingMaterialFileDescriptorSupplier() {}
  }

  private static final class BuildingMaterialMethodDescriptorSupplier
      extends BuildingMaterialBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BuildingMaterialMethodDescriptorSupplier(String methodName) {
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
      synchronized (BuildingMaterialGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuildingMaterialFileDescriptorSupplier())
              .addMethod(getCheckMaterialLevelMethod())
              .addMethod(getMonitorMaterialLevelsMethod())
              .addMethod(getSwitchToOrderMaterialMethod())
              .build();
        }
      }
    }
    return result;
  }
}

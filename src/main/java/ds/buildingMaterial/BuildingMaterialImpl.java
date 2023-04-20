// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildingMaterial.proto

package ds.buildingMaterial;

public final class BuildingMaterialImpl {
  private BuildingMaterialImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buildingMaterial_MaterialRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buildingMaterial_MaterialRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buildingMaterial_MaterialResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buildingMaterial_MaterialResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buildingMaterial_MonitorLevels_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buildingMaterial_MonitorLevels_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buildingMaterial_LevelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buildingMaterial_LevelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buildingMaterial_OrderMaterial_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buildingMaterial_OrderMaterial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buildingMaterial_OrderMaterialResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buildingMaterial_OrderMaterialResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026buildingMaterial.proto\022\020buildingMateri" +
      "al\"!\n\017MaterialRequest\022\016\n\006tankId\030\001 \001(\005\"%\n" +
      "\020MaterialResponse\022\021\n\ttankLevel\030\001 \001(\005\"\037\n\r" +
      "MonitorLevels\022\016\n\006tankId\030\001 \001(\005\"6\n\016LevelsR" +
      "esponse\022\016\n\006tankId\030\001 \001(\005\022\024\n\014currentLevel\030" +
      "\002 \001(\005\"3\n\rOrderMaterial\022\016\n\006tankId\030\001 \001(\005\022\022" +
      "\n\ntankLevels\030\002 \001(\005\"4\n\025OrderMaterialRespo" +
      "nse\022\033\n\023currentMaterialUsed\030\002 \001(\0052\270\002\n\020Bui" +
      "ldingMaterial\022]\n\022CheckMaterialLevel\022!.bu" +
      "ildingMaterial.MaterialRequest\032\".buildin" +
      "gMaterial.MaterialResponse\"\000\022^\n\025MonitorM" +
      "aterialLevels\022\037.buildingMaterial.Monitor" +
      "Levels\032 .buildingMaterial.LevelsResponse" +
      "\"\0000\001\022e\n\025SwitchToOrderMaterial\022\037.building" +
      "Material.OrderMaterial\032\'.buildingMateria" +
      "l.OrderMaterialResponse\"\000(\001B-\n\023ds.buildi" +
      "ngMaterialB\024BuildingMaterialImplP\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_buildingMaterial_MaterialRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buildingMaterial_MaterialRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buildingMaterial_MaterialRequest_descriptor,
        new java.lang.String[] { "TankId", });
    internal_static_buildingMaterial_MaterialResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buildingMaterial_MaterialResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buildingMaterial_MaterialResponse_descriptor,
        new java.lang.String[] { "TankLevel", });
    internal_static_buildingMaterial_MonitorLevels_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buildingMaterial_MonitorLevels_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buildingMaterial_MonitorLevels_descriptor,
        new java.lang.String[] { "TankId", });
    internal_static_buildingMaterial_LevelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buildingMaterial_LevelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buildingMaterial_LevelsResponse_descriptor,
        new java.lang.String[] { "TankId", "CurrentLevel", });
    internal_static_buildingMaterial_OrderMaterial_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_buildingMaterial_OrderMaterial_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buildingMaterial_OrderMaterial_descriptor,
        new java.lang.String[] { "TankId", "TankLevels", });
    internal_static_buildingMaterial_OrderMaterialResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_buildingMaterial_OrderMaterialResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buildingMaterial_OrderMaterialResponse_descriptor,
        new java.lang.String[] { "CurrentMaterialUsed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
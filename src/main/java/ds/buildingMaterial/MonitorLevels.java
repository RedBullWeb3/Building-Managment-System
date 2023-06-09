// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildingMaterial.proto

package ds.buildingMaterial;

/**
 * Protobuf type {@code buildingMaterial.MonitorLevels}
 */
public  final class MonitorLevels extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buildingMaterial.MonitorLevels)
    MonitorLevelsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonitorLevels.newBuilder() to construct.
  private MonitorLevels(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonitorLevels() {
    materialId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MonitorLevels(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            materialId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.buildingMaterial.BuildingMaterialImpl.internal_static_buildingMaterial_MonitorLevels_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.buildingMaterial.BuildingMaterialImpl.internal_static_buildingMaterial_MonitorLevels_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.buildingMaterial.MonitorLevels.class, ds.buildingMaterial.MonitorLevels.Builder.class);
  }

  public static final int MATERIALID_FIELD_NUMBER = 1;
  private int materialId_;
  /**
   * <code>int32 materialId = 1;</code>
   */
  public int getMaterialId() {
    return materialId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (materialId_ != 0) {
      output.writeInt32(1, materialId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (materialId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, materialId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.buildingMaterial.MonitorLevels)) {
      return super.equals(obj);
    }
    ds.buildingMaterial.MonitorLevels other = (ds.buildingMaterial.MonitorLevels) obj;

    boolean result = true;
    result = result && (getMaterialId()
        == other.getMaterialId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MATERIALID_FIELD_NUMBER;
    hash = (53 * hash) + getMaterialId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.buildingMaterial.MonitorLevels parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.buildingMaterial.MonitorLevels parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.buildingMaterial.MonitorLevels parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.buildingMaterial.MonitorLevels parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.buildingMaterial.MonitorLevels prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code buildingMaterial.MonitorLevels}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buildingMaterial.MonitorLevels)
      ds.buildingMaterial.MonitorLevelsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.buildingMaterial.BuildingMaterialImpl.internal_static_buildingMaterial_MonitorLevels_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.buildingMaterial.BuildingMaterialImpl.internal_static_buildingMaterial_MonitorLevels_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.buildingMaterial.MonitorLevels.class, ds.buildingMaterial.MonitorLevels.Builder.class);
    }

    // Construct using ds.buildingMaterial.MonitorLevels.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      materialId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.buildingMaterial.BuildingMaterialImpl.internal_static_buildingMaterial_MonitorLevels_descriptor;
    }

    @java.lang.Override
    public ds.buildingMaterial.MonitorLevels getDefaultInstanceForType() {
      return ds.buildingMaterial.MonitorLevels.getDefaultInstance();
    }

    @java.lang.Override
    public ds.buildingMaterial.MonitorLevels build() {
      ds.buildingMaterial.MonitorLevels result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.buildingMaterial.MonitorLevels buildPartial() {
      ds.buildingMaterial.MonitorLevels result = new ds.buildingMaterial.MonitorLevels(this);
      result.materialId_ = materialId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.buildingMaterial.MonitorLevels) {
        return mergeFrom((ds.buildingMaterial.MonitorLevels)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.buildingMaterial.MonitorLevels other) {
      if (other == ds.buildingMaterial.MonitorLevels.getDefaultInstance()) return this;
      if (other.getMaterialId() != 0) {
        setMaterialId(other.getMaterialId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.buildingMaterial.MonitorLevels parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.buildingMaterial.MonitorLevels) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int materialId_ ;
    /**
     * <code>int32 materialId = 1;</code>
     */
    public int getMaterialId() {
      return materialId_;
    }
    /**
     * <code>int32 materialId = 1;</code>
     */
    public Builder setMaterialId(int value) {
      
      materialId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 materialId = 1;</code>
     */
    public Builder clearMaterialId() {
      
      materialId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:buildingMaterial.MonitorLevels)
  }

  // @@protoc_insertion_point(class_scope:buildingMaterial.MonitorLevels)
  private static final ds.buildingMaterial.MonitorLevels DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.buildingMaterial.MonitorLevels();
  }

  public static ds.buildingMaterial.MonitorLevels getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonitorLevels>
      PARSER = new com.google.protobuf.AbstractParser<MonitorLevels>() {
    @java.lang.Override
    public MonitorLevels parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MonitorLevels(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MonitorLevels> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonitorLevels> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.buildingMaterial.MonitorLevels getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


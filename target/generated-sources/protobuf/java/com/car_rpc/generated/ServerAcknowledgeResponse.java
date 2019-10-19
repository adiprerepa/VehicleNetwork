// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: controller_proto/Controller_Interface.proto

package com.car_rpc.generated;

/**
 * <pre>
 * add cars to send back
 * </pre>
 *
 * Protobuf type {@code controller.ServerAcknowledgeResponse}
 */
public  final class ServerAcknowledgeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:controller.ServerAcknowledgeResponse)
    ServerAcknowledgeResponseOrBuilder {
  // Use ServerAcknowledgeResponse.newBuilder() to construct.
  private ServerAcknowledgeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerAcknowledgeResponse() {
    requestStatus_ = 0;
    carEntities_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerAcknowledgeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus value = com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              requestStatus_ = rawValue;
            }
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              carEntities_ = new java.util.ArrayList<com.car_rpc.generated.CarEntity>();
              mutable_bitField0_ |= 0x00000002;
            }
            carEntities_.add(
                input.readMessage(com.car_rpc.generated.CarEntity.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        carEntities_ = java.util.Collections.unmodifiableList(carEntities_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.car_rpc.generated.ControllerProto.internal_static_controller_ServerAcknowledgeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.car_rpc.generated.ControllerProto.internal_static_controller_ServerAcknowledgeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.car_rpc.generated.ServerAcknowledgeResponse.class, com.car_rpc.generated.ServerAcknowledgeResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code controller.ServerAcknowledgeResponse.RequestStatus}
   */
  public enum RequestStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SERVER_ERROR = 0;</code>
     */
    SERVER_ERROR(0),
    /**
     * <code>OK = 1;</code>
     */
    OK(1),
    ;

    /**
     * <code>SERVER_ERROR = 0;</code>
     */
    public static final int SERVER_ERROR_VALUE = 0;
    /**
     * <code>OK = 1;</code>
     */
    public static final int OK_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestStatus valueOf(int value) {
      return forNumber(value);
    }

    public static RequestStatus forNumber(int value) {
      switch (value) {
        case 0: return SERVER_ERROR;
        case 1: return OK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RequestStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RequestStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RequestStatus>() {
            public RequestStatus findValueByNumber(int number) {
              return RequestStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.car_rpc.generated.ServerAcknowledgeResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final RequestStatus[] VALUES = values();

    public static RequestStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RequestStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:controller.ServerAcknowledgeResponse.RequestStatus)
  }

  private int bitField0_;
  public static final int REQUESTSTATUS_FIELD_NUMBER = 1;
  private int requestStatus_;
  /**
   * <code>required .controller.ServerAcknowledgeResponse.RequestStatus requestStatus = 1;</code>
   */
  public boolean hasRequestStatus() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .controller.ServerAcknowledgeResponse.RequestStatus requestStatus = 1;</code>
   */
  public com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus getRequestStatus() {
    com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus result = com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus.valueOf(requestStatus_);
    return result == null ? com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus.SERVER_ERROR : result;
  }

  public static final int CARENTITIES_FIELD_NUMBER = 2;
  private java.util.List<com.car_rpc.generated.CarEntity> carEntities_;
  /**
   * <code>repeated .controller.CarEntity carEntities = 2;</code>
   */
  public java.util.List<com.car_rpc.generated.CarEntity> getCarEntitiesList() {
    return carEntities_;
  }
  /**
   * <code>repeated .controller.CarEntity carEntities = 2;</code>
   */
  public java.util.List<? extends com.car_rpc.generated.CarEntityOrBuilder> 
      getCarEntitiesOrBuilderList() {
    return carEntities_;
  }
  /**
   * <code>repeated .controller.CarEntity carEntities = 2;</code>
   */
  public int getCarEntitiesCount() {
    return carEntities_.size();
  }
  /**
   * <code>repeated .controller.CarEntity carEntities = 2;</code>
   */
  public com.car_rpc.generated.CarEntity getCarEntities(int index) {
    return carEntities_.get(index);
  }
  /**
   * <code>repeated .controller.CarEntity carEntities = 2;</code>
   */
  public com.car_rpc.generated.CarEntityOrBuilder getCarEntitiesOrBuilder(
      int index) {
    return carEntities_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasRequestStatus()) {
      memoizedIsInitialized = 0;
      return false;
    }
    for (int i = 0; i < getCarEntitiesCount(); i++) {
      if (!getCarEntities(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, requestStatus_);
    }
    for (int i = 0; i < carEntities_.size(); i++) {
      output.writeMessage(2, carEntities_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, requestStatus_);
    }
    for (int i = 0; i < carEntities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, carEntities_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.car_rpc.generated.ServerAcknowledgeResponse)) {
      return super.equals(obj);
    }
    com.car_rpc.generated.ServerAcknowledgeResponse other = (com.car_rpc.generated.ServerAcknowledgeResponse) obj;

    boolean result = true;
    result = result && (hasRequestStatus() == other.hasRequestStatus());
    if (hasRequestStatus()) {
      result = result && requestStatus_ == other.requestStatus_;
    }
    result = result && getCarEntitiesList()
        .equals(other.getCarEntitiesList());
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
    if (hasRequestStatus()) {
      hash = (37 * hash) + REQUESTSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + requestStatus_;
    }
    if (getCarEntitiesCount() > 0) {
      hash = (37 * hash) + CARENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getCarEntitiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.car_rpc.generated.ServerAcknowledgeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.car_rpc.generated.ServerAcknowledgeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * add cars to send back
   * </pre>
   *
   * Protobuf type {@code controller.ServerAcknowledgeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:controller.ServerAcknowledgeResponse)
      com.car_rpc.generated.ServerAcknowledgeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.car_rpc.generated.ControllerProto.internal_static_controller_ServerAcknowledgeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.car_rpc.generated.ControllerProto.internal_static_controller_ServerAcknowledgeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.car_rpc.generated.ServerAcknowledgeResponse.class, com.car_rpc.generated.ServerAcknowledgeResponse.Builder.class);
    }

    // Construct using com.car_rpc.generated.ServerAcknowledgeResponse.newBuilder()
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
        getCarEntitiesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      requestStatus_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (carEntitiesBuilder_ == null) {
        carEntities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        carEntitiesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.car_rpc.generated.ControllerProto.internal_static_controller_ServerAcknowledgeResponse_descriptor;
    }

    public com.car_rpc.generated.ServerAcknowledgeResponse getDefaultInstanceForType() {
      return com.car_rpc.generated.ServerAcknowledgeResponse.getDefaultInstance();
    }

    public com.car_rpc.generated.ServerAcknowledgeResponse build() {
      com.car_rpc.generated.ServerAcknowledgeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.car_rpc.generated.ServerAcknowledgeResponse buildPartial() {
      com.car_rpc.generated.ServerAcknowledgeResponse result = new com.car_rpc.generated.ServerAcknowledgeResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.requestStatus_ = requestStatus_;
      if (carEntitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          carEntities_ = java.util.Collections.unmodifiableList(carEntities_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.carEntities_ = carEntities_;
      } else {
        result.carEntities_ = carEntitiesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.car_rpc.generated.ServerAcknowledgeResponse) {
        return mergeFrom((com.car_rpc.generated.ServerAcknowledgeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.car_rpc.generated.ServerAcknowledgeResponse other) {
      if (other == com.car_rpc.generated.ServerAcknowledgeResponse.getDefaultInstance()) return this;
      if (other.hasRequestStatus()) {
        setRequestStatus(other.getRequestStatus());
      }
      if (carEntitiesBuilder_ == null) {
        if (!other.carEntities_.isEmpty()) {
          if (carEntities_.isEmpty()) {
            carEntities_ = other.carEntities_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCarEntitiesIsMutable();
            carEntities_.addAll(other.carEntities_);
          }
          onChanged();
        }
      } else {
        if (!other.carEntities_.isEmpty()) {
          if (carEntitiesBuilder_.isEmpty()) {
            carEntitiesBuilder_.dispose();
            carEntitiesBuilder_ = null;
            carEntities_ = other.carEntities_;
            bitField0_ = (bitField0_ & ~0x00000002);
            carEntitiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCarEntitiesFieldBuilder() : null;
          } else {
            carEntitiesBuilder_.addAllMessages(other.carEntities_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasRequestStatus()) {
        return false;
      }
      for (int i = 0; i < getCarEntitiesCount(); i++) {
        if (!getCarEntities(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.car_rpc.generated.ServerAcknowledgeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.car_rpc.generated.ServerAcknowledgeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int requestStatus_ = 0;
    /**
     * <code>required .controller.ServerAcknowledgeResponse.RequestStatus requestStatus = 1;</code>
     */
    public boolean hasRequestStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .controller.ServerAcknowledgeResponse.RequestStatus requestStatus = 1;</code>
     */
    public com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus getRequestStatus() {
      com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus result = com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus.valueOf(requestStatus_);
      return result == null ? com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus.SERVER_ERROR : result;
    }
    /**
     * <code>required .controller.ServerAcknowledgeResponse.RequestStatus requestStatus = 1;</code>
     */
    public Builder setRequestStatus(com.car_rpc.generated.ServerAcknowledgeResponse.RequestStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      requestStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>required .controller.ServerAcknowledgeResponse.RequestStatus requestStatus = 1;</code>
     */
    public Builder clearRequestStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestStatus_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.car_rpc.generated.CarEntity> carEntities_ =
      java.util.Collections.emptyList();
    private void ensureCarEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        carEntities_ = new java.util.ArrayList<com.car_rpc.generated.CarEntity>(carEntities_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.car_rpc.generated.CarEntity, com.car_rpc.generated.CarEntity.Builder, com.car_rpc.generated.CarEntityOrBuilder> carEntitiesBuilder_;

    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public java.util.List<com.car_rpc.generated.CarEntity> getCarEntitiesList() {
      if (carEntitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(carEntities_);
      } else {
        return carEntitiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public int getCarEntitiesCount() {
      if (carEntitiesBuilder_ == null) {
        return carEntities_.size();
      } else {
        return carEntitiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public com.car_rpc.generated.CarEntity getCarEntities(int index) {
      if (carEntitiesBuilder_ == null) {
        return carEntities_.get(index);
      } else {
        return carEntitiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder setCarEntities(
        int index, com.car_rpc.generated.CarEntity value) {
      if (carEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarEntitiesIsMutable();
        carEntities_.set(index, value);
        onChanged();
      } else {
        carEntitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder setCarEntities(
        int index, com.car_rpc.generated.CarEntity.Builder builderForValue) {
      if (carEntitiesBuilder_ == null) {
        ensureCarEntitiesIsMutable();
        carEntities_.set(index, builderForValue.build());
        onChanged();
      } else {
        carEntitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder addCarEntities(com.car_rpc.generated.CarEntity value) {
      if (carEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarEntitiesIsMutable();
        carEntities_.add(value);
        onChanged();
      } else {
        carEntitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder addCarEntities(
        int index, com.car_rpc.generated.CarEntity value) {
      if (carEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarEntitiesIsMutable();
        carEntities_.add(index, value);
        onChanged();
      } else {
        carEntitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder addCarEntities(
        com.car_rpc.generated.CarEntity.Builder builderForValue) {
      if (carEntitiesBuilder_ == null) {
        ensureCarEntitiesIsMutable();
        carEntities_.add(builderForValue.build());
        onChanged();
      } else {
        carEntitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder addCarEntities(
        int index, com.car_rpc.generated.CarEntity.Builder builderForValue) {
      if (carEntitiesBuilder_ == null) {
        ensureCarEntitiesIsMutable();
        carEntities_.add(index, builderForValue.build());
        onChanged();
      } else {
        carEntitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder addAllCarEntities(
        java.lang.Iterable<? extends com.car_rpc.generated.CarEntity> values) {
      if (carEntitiesBuilder_ == null) {
        ensureCarEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, carEntities_);
        onChanged();
      } else {
        carEntitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder clearCarEntities() {
      if (carEntitiesBuilder_ == null) {
        carEntities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        carEntitiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public Builder removeCarEntities(int index) {
      if (carEntitiesBuilder_ == null) {
        ensureCarEntitiesIsMutable();
        carEntities_.remove(index);
        onChanged();
      } else {
        carEntitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public com.car_rpc.generated.CarEntity.Builder getCarEntitiesBuilder(
        int index) {
      return getCarEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public com.car_rpc.generated.CarEntityOrBuilder getCarEntitiesOrBuilder(
        int index) {
      if (carEntitiesBuilder_ == null) {
        return carEntities_.get(index);  } else {
        return carEntitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public java.util.List<? extends com.car_rpc.generated.CarEntityOrBuilder> 
         getCarEntitiesOrBuilderList() {
      if (carEntitiesBuilder_ != null) {
        return carEntitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(carEntities_);
      }
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public com.car_rpc.generated.CarEntity.Builder addCarEntitiesBuilder() {
      return getCarEntitiesFieldBuilder().addBuilder(
          com.car_rpc.generated.CarEntity.getDefaultInstance());
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public com.car_rpc.generated.CarEntity.Builder addCarEntitiesBuilder(
        int index) {
      return getCarEntitiesFieldBuilder().addBuilder(
          index, com.car_rpc.generated.CarEntity.getDefaultInstance());
    }
    /**
     * <code>repeated .controller.CarEntity carEntities = 2;</code>
     */
    public java.util.List<com.car_rpc.generated.CarEntity.Builder> 
         getCarEntitiesBuilderList() {
      return getCarEntitiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.car_rpc.generated.CarEntity, com.car_rpc.generated.CarEntity.Builder, com.car_rpc.generated.CarEntityOrBuilder> 
        getCarEntitiesFieldBuilder() {
      if (carEntitiesBuilder_ == null) {
        carEntitiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.car_rpc.generated.CarEntity, com.car_rpc.generated.CarEntity.Builder, com.car_rpc.generated.CarEntityOrBuilder>(
                carEntities_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        carEntities_ = null;
      }
      return carEntitiesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:controller.ServerAcknowledgeResponse)
  }

  // @@protoc_insertion_point(class_scope:controller.ServerAcknowledgeResponse)
  private static final com.car_rpc.generated.ServerAcknowledgeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.car_rpc.generated.ServerAcknowledgeResponse();
  }

  public static com.car_rpc.generated.ServerAcknowledgeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ServerAcknowledgeResponse>
      PARSER = new com.google.protobuf.AbstractParser<ServerAcknowledgeResponse>() {
    public ServerAcknowledgeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerAcknowledgeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerAcknowledgeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerAcknowledgeResponse> getParserForType() {
    return PARSER;
  }

  public com.car_rpc.generated.ServerAcknowledgeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

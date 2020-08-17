// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/downwardapi/resources/proto/downward_api.proto

package com.facebook.buck.downward.model;

/**
 * Protobuf type {@code downward.api.v1.StepEvent}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:StepEvent.java.pb.meta")
public  final class StepEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:downward.api.v1.StepEvent)
    StepEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StepEvent.newBuilder() to construct.
  private StepEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StepEvent() {
    stepStatus_ = 0;
    stepType_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StepEvent(
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

            eventId_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            stepStatus_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            stepType_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 42: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (duration_ != null) {
              subBuilder = duration_.toBuilder();
            }
            duration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(duration_);
              duration_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.facebook.buck.downward.model.DownwardAPIProto.internal_static_downward_api_v1_StepEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.downward.model.DownwardAPIProto.internal_static_downward_api_v1_StepEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.downward.model.StepEvent.class, com.facebook.buck.downward.model.StepEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code downward.api.v1.StepEvent.StepStatus}
   */
  public enum StepStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>STARTED = 1;</code>
     */
    STARTED(1),
    /**
     * <code>FINISHED = 2;</code>
     */
    FINISHED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>STARTED = 1;</code>
     */
    public static final int STARTED_VALUE = 1;
    /**
     * <code>FINISHED = 2;</code>
     */
    public static final int FINISHED_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StepStatus valueOf(int value) {
      return forNumber(value);
    }

    public static StepStatus forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return STARTED;
        case 2: return FINISHED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StepStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StepStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StepStatus>() {
            public StepStatus findValueByNumber(int number) {
              return StepStatus.forNumber(number);
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
      return com.facebook.buck.downward.model.StepEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final StepStatus[] VALUES = values();

    public static StepStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private StepStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:downward.api.v1.StepEvent.StepStatus)
  }

  public static final int EVENT_ID_FIELD_NUMBER = 1;
  private int eventId_;
  /**
   * <pre>
   * required for matching start to finish events for downward API. Does not map to a field in
   * buck's StepEvent
   * </pre>
   *
   * <code>int32 event_id = 1;</code>
   */
  public int getEventId() {
    return eventId_;
  }

  public static final int STEP_STATUS_FIELD_NUMBER = 2;
  private int stepStatus_;
  /**
   * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
   */
  public int getStepStatusValue() {
    return stepStatus_;
  }
  /**
   * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
   */
  public com.facebook.buck.downward.model.StepEvent.StepStatus getStepStatus() {
    @SuppressWarnings("deprecation")
    com.facebook.buck.downward.model.StepEvent.StepStatus result = com.facebook.buck.downward.model.StepEvent.StepStatus.valueOf(stepStatus_);
    return result == null ? com.facebook.buck.downward.model.StepEvent.StepStatus.UNRECOGNIZED : result;
  }

  public static final int STEP_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object stepType_;
  /**
   * <code>string step_type = 3;</code>
   */
  public java.lang.String getStepType() {
    java.lang.Object ref = stepType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stepType_ = s;
      return s;
    }
  }
  /**
   * <code>string step_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStepTypeBytes() {
    java.lang.Object ref = stepType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stepType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 4;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 5;
  private com.google.protobuf.Duration duration_;
  /**
   * <pre>
   * relative time duration from the beginning of the tool invocation
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <pre>
   * relative time duration from the beginning of the tool invocation
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   * <pre>
   * relative time duration from the beginning of the tool invocation
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return getDuration();
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
    if (eventId_ != 0) {
      output.writeInt32(1, eventId_);
    }
    if (stepStatus_ != com.facebook.buck.downward.model.StepEvent.StepStatus.UNKNOWN.getNumber()) {
      output.writeEnum(2, stepStatus_);
    }
    if (!getStepTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, stepType_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    if (duration_ != null) {
      output.writeMessage(5, getDuration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, eventId_);
    }
    if (stepStatus_ != com.facebook.buck.downward.model.StepEvent.StepStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, stepStatus_);
    }
    if (!getStepTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, stepType_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDuration());
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
    if (!(obj instanceof com.facebook.buck.downward.model.StepEvent)) {
      return super.equals(obj);
    }
    com.facebook.buck.downward.model.StepEvent other = (com.facebook.buck.downward.model.StepEvent) obj;

    if (getEventId()
        != other.getEventId()) return false;
    if (stepStatus_ != other.stepStatus_) return false;
    if (!getStepType()
        .equals(other.getStepType())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEventId();
    hash = (37 * hash) + STEP_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + stepStatus_;
    hash = (37 * hash) + STEP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getStepType().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.downward.model.StepEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.facebook.buck.downward.model.StepEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.downward.model.StepEvent parseFrom(
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
  public static Builder newBuilder(com.facebook.buck.downward.model.StepEvent prototype) {
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
   * Protobuf type {@code downward.api.v1.StepEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:downward.api.v1.StepEvent)
      com.facebook.buck.downward.model.StepEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.downward.model.DownwardAPIProto.internal_static_downward_api_v1_StepEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.downward.model.DownwardAPIProto.internal_static_downward_api_v1_StepEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.downward.model.StepEvent.class, com.facebook.buck.downward.model.StepEvent.Builder.class);
    }

    // Construct using com.facebook.buck.downward.model.StepEvent.newBuilder()
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
      eventId_ = 0;

      stepStatus_ = 0;

      stepType_ = "";

      description_ = "";

      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.downward.model.DownwardAPIProto.internal_static_downward_api_v1_StepEvent_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.downward.model.StepEvent getDefaultInstanceForType() {
      return com.facebook.buck.downward.model.StepEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.downward.model.StepEvent build() {
      com.facebook.buck.downward.model.StepEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.downward.model.StepEvent buildPartial() {
      com.facebook.buck.downward.model.StepEvent result = new com.facebook.buck.downward.model.StepEvent(this);
      result.eventId_ = eventId_;
      result.stepStatus_ = stepStatus_;
      result.stepType_ = stepType_;
      result.description_ = description_;
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.facebook.buck.downward.model.StepEvent) {
        return mergeFrom((com.facebook.buck.downward.model.StepEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.downward.model.StepEvent other) {
      if (other == com.facebook.buck.downward.model.StepEvent.getDefaultInstance()) return this;
      if (other.getEventId() != 0) {
        setEventId(other.getEventId());
      }
      if (other.stepStatus_ != 0) {
        setStepStatusValue(other.getStepStatusValue());
      }
      if (!other.getStepType().isEmpty()) {
        stepType_ = other.stepType_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
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
      com.facebook.buck.downward.model.StepEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.facebook.buck.downward.model.StepEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int eventId_ ;
    /**
     * <pre>
     * required for matching start to finish events for downward API. Does not map to a field in
     * buck's StepEvent
     * </pre>
     *
     * <code>int32 event_id = 1;</code>
     */
    public int getEventId() {
      return eventId_;
    }
    /**
     * <pre>
     * required for matching start to finish events for downward API. Does not map to a field in
     * buck's StepEvent
     * </pre>
     *
     * <code>int32 event_id = 1;</code>
     */
    public Builder setEventId(int value) {
      
      eventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required for matching start to finish events for downward API. Does not map to a field in
     * buck's StepEvent
     * </pre>
     *
     * <code>int32 event_id = 1;</code>
     */
    public Builder clearEventId() {
      
      eventId_ = 0;
      onChanged();
      return this;
    }

    private int stepStatus_ = 0;
    /**
     * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
     */
    public int getStepStatusValue() {
      return stepStatus_;
    }
    /**
     * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
     */
    public Builder setStepStatusValue(int value) {
      stepStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
     */
    public com.facebook.buck.downward.model.StepEvent.StepStatus getStepStatus() {
      @SuppressWarnings("deprecation")
      com.facebook.buck.downward.model.StepEvent.StepStatus result = com.facebook.buck.downward.model.StepEvent.StepStatus.valueOf(stepStatus_);
      return result == null ? com.facebook.buck.downward.model.StepEvent.StepStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
     */
    public Builder setStepStatus(com.facebook.buck.downward.model.StepEvent.StepStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      stepStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
     */
    public Builder clearStepStatus() {
      
      stepStatus_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stepType_ = "";
    /**
     * <code>string step_type = 3;</code>
     */
    public java.lang.String getStepType() {
      java.lang.Object ref = stepType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stepType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string step_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStepTypeBytes() {
      java.lang.Object ref = stepType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stepType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string step_type = 3;</code>
     */
    public Builder setStepType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stepType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string step_type = 3;</code>
     */
    public Builder clearStepType() {
      
      stepType_ = getDefaultInstance().getStepType();
      onChanged();
      return this;
    }
    /**
     * <code>string step_type = 3;</code>
     */
    public Builder setStepTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stepType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 4;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder setDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
            com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {
      
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <pre>
     * relative time duration from the beginning of the tool invocation
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:downward.api.v1.StepEvent)
  }

  // @@protoc_insertion_point(class_scope:downward.api.v1.StepEvent)
  private static final com.facebook.buck.downward.model.StepEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.downward.model.StepEvent();
  }

  public static com.facebook.buck.downward.model.StepEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StepEvent>
      PARSER = new com.google.protobuf.AbstractParser<StepEvent>() {
    @java.lang.Override
    public StepEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StepEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StepEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StepEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.downward.model.StepEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


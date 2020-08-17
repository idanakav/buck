// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/downwardapi/resources/proto/downward_api.proto

package com.facebook.buck.downward.model;

@javax.annotation.Generated(value="protoc", comments="annotations:StepEventOrBuilder.java.pb.meta")
public interface StepEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:downward.api.v1.StepEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * required for matching start to finish events for downward API. Does not map to a field in
   * buck's StepEvent
   * </pre>
   *
   * <code>int32 event_id = 1;</code>
   */
  int getEventId();

  /**
   * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
   */
  int getStepStatusValue();
  /**
   * <code>.downward.api.v1.StepEvent.StepStatus step_status = 2;</code>
   */
  com.facebook.buck.downward.model.StepEvent.StepStatus getStepStatus();

  /**
   * <code>string step_type = 3;</code>
   */
  java.lang.String getStepType();
  /**
   * <code>string step_type = 3;</code>
   */
  com.google.protobuf.ByteString
      getStepTypeBytes();

  /**
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * relative time duration from the beginning of the tool invocation
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  boolean hasDuration();
  /**
   * <pre>
   * relative time duration from the beginning of the tool invocation
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <pre>
   * relative time duration from the beginning of the tool invocation
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}

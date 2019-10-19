// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: controller_proto/Controller_Interface.proto

package com.car_rpc.generated;

public interface ControlResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:controller.ControlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 hcsr04_front_distance = 1 [default = 0];</code>
   */
  boolean hasHcsr04FrontDistance();
  /**
   * <code>optional int32 hcsr04_front_distance = 1 [default = 0];</code>
   */
  int getHcsr04FrontDistance();

  /**
   * <code>optional int32 hcsr04_right_distance = 2 [default = 0];</code>
   */
  boolean hasHcsr04RightDistance();
  /**
   * <code>optional int32 hcsr04_right_distance = 2 [default = 0];</code>
   */
  int getHcsr04RightDistance();

  /**
   * <code>optional int32 hcsr04_left_distance = 3 [default = 0];</code>
   */
  boolean hasHcsr04LeftDistance();
  /**
   * <code>optional int32 hcsr04_left_distance = 3 [default = 0];</code>
   */
  int getHcsr04LeftDistance();

  /**
   * <code>required .controller.ControlResponse.RequestStatusCode requestCode = 4;</code>
   */
  boolean hasRequestCode();
  /**
   * <code>required .controller.ControlResponse.RequestStatusCode requestCode = 4;</code>
   */
  com.car_rpc.generated.ControlResponse.RequestStatusCode getRequestCode();
}

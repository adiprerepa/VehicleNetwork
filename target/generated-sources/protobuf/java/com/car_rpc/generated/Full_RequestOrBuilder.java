// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: esp8266_proto/Esp8266_Interface.proto

package com.car_rpc.generated;

public interface Full_RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Esp8266.Full_Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All for now.
   * </pre>
   *
   * <code>required .Esp8266.Command command = 1;</code>
   */
  boolean hasCommand();
  /**
   * <pre>
   * All for now.
   * </pre>
   *
   * <code>required .Esp8266.Command command = 1;</code>
   */
  com.car_rpc.generated.Command getCommand();
  /**
   * <pre>
   * All for now.
   * </pre>
   *
   * <code>required .Esp8266.Command command = 1;</code>
   */
  com.car_rpc.generated.CommandOrBuilder getCommandOrBuilder();

  /**
   * <code>required bool powerState = 2;</code>
   */
  boolean hasPowerState();
  /**
   * <code>required bool powerState = 2;</code>
   */
  boolean getPowerState();
}
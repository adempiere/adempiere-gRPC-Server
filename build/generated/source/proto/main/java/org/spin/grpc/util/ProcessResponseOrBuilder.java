// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface ProcessResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ProcessResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string instanceUuid = 1;</code>
   */
  java.lang.String getInstanceUuid();
  /**
   * <code>string instanceUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getInstanceUuidBytes();

  /**
   * <code>bool isError = 2;</code>
   */
  boolean getIsError();

  /**
   * <code>string summary = 3;</code>
   */
  java.lang.String getSummary();
  /**
   * <code>string summary = 3;</code>
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <code>int32 resultTableId = 4;</code>
   */
  int getResultTableId();

  /**
   * <code>repeated .data.ProcessInfoLog logs = 5;</code>
   */
  java.util.List<org.spin.grpc.util.ProcessInfoLog> 
      getLogsList();
  /**
   * <code>repeated .data.ProcessInfoLog logs = 5;</code>
   */
  org.spin.grpc.util.ProcessInfoLog getLogs(int index);
  /**
   * <code>repeated .data.ProcessInfoLog logs = 5;</code>
   */
  int getLogsCount();
  /**
   * <code>repeated .data.ProcessInfoLog logs = 5;</code>
   */
  java.util.List<? extends org.spin.grpc.util.ProcessInfoLogOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <code>repeated .data.ProcessInfoLog logs = 5;</code>
   */
  org.spin.grpc.util.ProcessInfoLogOrBuilder getLogsOrBuilder(
      int index);

  /**
   * <code>.data.ProcessOutput output = 6;</code>
   */
  boolean hasOutput();
  /**
   * <code>.data.ProcessOutput output = 6;</code>
   */
  org.spin.grpc.util.ProcessOutput getOutput();
  /**
   * <code>.data.ProcessOutput output = 6;</code>
   */
  org.spin.grpc.util.ProcessOutputOrBuilder getOutputOrBuilder();
}

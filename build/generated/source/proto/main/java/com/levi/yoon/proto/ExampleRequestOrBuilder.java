// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapType.proto

package com.levi.yoon.proto;

public interface ExampleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.sample.ExampleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; requests = 1;</code>
   */
  int getRequestsCount();
  /**
   * <code>map&lt;string, string&gt; requests = 1;</code>
   */
  boolean containsRequests(
      java.lang.String key);
  /**
   * Use {@link #getRequestsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRequests();
  /**
   * <code>map&lt;string, string&gt; requests = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRequestsMap();
  /**
   * <code>map&lt;string, string&gt; requests = 1;</code>
   */

  java.lang.String getRequestsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; requests = 1;</code>
   */

  java.lang.String getRequestsOrThrow(
      java.lang.String key);
}

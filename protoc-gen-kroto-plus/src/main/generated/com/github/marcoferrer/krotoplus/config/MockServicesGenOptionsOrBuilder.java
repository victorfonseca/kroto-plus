// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

public interface MockServicesGenOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:krotoplus.compiler.MockServicesGenOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  boolean hasFilter();
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  com.github.marcoferrer.krotoplus.config.FileFilter getFilter();
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder();

  /**
   * <pre>
   * By default, mock services are generated as an open class
   * but an object can be generated instead.
   * </pre>
   *
   * <code>bool implement_as_object = 2;</code>
   */
  boolean getImplementAsObject();

  /**
   * <pre>
   * Flag for generating a static collection of the Mock Services created.
   * Useful when registering mock services to a GrpcServerRule during unit tests.
   * </pre>
   *
   * <code>bool generate_service_list = 3;</code>
   */
  boolean getGenerateServiceList();

  /**
   * <pre>
   * The java package at which the mock server list should reside.
   * </pre>
   *
   * <code>string service_list_package = 4;</code>
   */
  java.lang.String getServiceListPackage();
  /**
   * <pre>
   * The java package at which the mock server list should reside.
   * </pre>
   *
   * <code>string service_list_package = 4;</code>
   */
  com.google.protobuf.ByteString
      getServiceListPackageBytes();

  /**
   * <pre>
   * The name of the property at which the mock server list will be initialized at.
   * </pre>
   *
   * <code>string service_list_name = 5;</code>
   */
  java.lang.String getServiceListName();
  /**
   * <pre>
   * The name of the property at which the mock server list will be initialized at.
   * </pre>
   *
   * <code>string service_list_name = 5;</code>
   */
  com.google.protobuf.ByteString
      getServiceListNameBytes();
}

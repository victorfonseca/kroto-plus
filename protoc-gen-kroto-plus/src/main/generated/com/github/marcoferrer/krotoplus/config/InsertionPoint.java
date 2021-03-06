// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

/**
 * Protobuf enum {@code krotoplus.compiler.InsertionPoint}
 */
public enum InsertionPoint
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>INTERFACE_EXTENDS = 1;</code>
   */
  INTERFACE_EXTENDS(1),
  /**
   * <code>MESSAGE_IMPLEMENTS = 2;</code>
   */
  MESSAGE_IMPLEMENTS(2),
  /**
   * <code>BUILDER_IMPLEMENTS = 3;</code>
   */
  BUILDER_IMPLEMENTS(3),
  /**
   * <code>BUILDER_SCOPE = 4;</code>
   */
  BUILDER_SCOPE(4),
  /**
   * <code>CLASS_SCOPE = 5;</code>
   */
  CLASS_SCOPE(5),
  /**
   * <code>ENUM_SCOPE = 6;</code>
   */
  ENUM_SCOPE(6),
  /**
   * <code>OUTER_CLASS_SCOPE = 7;</code>
   */
  OUTER_CLASS_SCOPE(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>INTERFACE_EXTENDS = 1;</code>
   */
  public static final int INTERFACE_EXTENDS_VALUE = 1;
  /**
   * <code>MESSAGE_IMPLEMENTS = 2;</code>
   */
  public static final int MESSAGE_IMPLEMENTS_VALUE = 2;
  /**
   * <code>BUILDER_IMPLEMENTS = 3;</code>
   */
  public static final int BUILDER_IMPLEMENTS_VALUE = 3;
  /**
   * <code>BUILDER_SCOPE = 4;</code>
   */
  public static final int BUILDER_SCOPE_VALUE = 4;
  /**
   * <code>CLASS_SCOPE = 5;</code>
   */
  public static final int CLASS_SCOPE_VALUE = 5;
  /**
   * <code>ENUM_SCOPE = 6;</code>
   */
  public static final int ENUM_SCOPE_VALUE = 6;
  /**
   * <code>OUTER_CLASS_SCOPE = 7;</code>
   */
  public static final int OUTER_CLASS_SCOPE_VALUE = 7;


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
  public static InsertionPoint valueOf(int value) {
    return forNumber(value);
  }

  public static InsertionPoint forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return INTERFACE_EXTENDS;
      case 2: return MESSAGE_IMPLEMENTS;
      case 3: return BUILDER_IMPLEMENTS;
      case 4: return BUILDER_SCOPE;
      case 5: return CLASS_SCOPE;
      case 6: return ENUM_SCOPE;
      case 7: return OUTER_CLASS_SCOPE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InsertionPoint>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InsertionPoint> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InsertionPoint>() {
          public InsertionPoint findValueByNumber(int number) {
            return InsertionPoint.forNumber(number);
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
    return com.github.marcoferrer.krotoplus.config.Config.getDescriptor().getEnumTypes().get(0);
  }

  private static final InsertionPoint[] VALUES = values();

  public static InsertionPoint valueOf(
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

  private InsertionPoint(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:krotoplus.compiler.InsertionPoint)
}


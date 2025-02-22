//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos_proto/cosmos.proto

package cosmos_proto;

@kotlin.jvm.JvmName("-initializescalarDescriptor")
public inline fun scalarDescriptor(block: cosmos_proto.ScalarDescriptorKt.Dsl.() -> kotlin.Unit): cosmos_proto.Cosmos.ScalarDescriptor =
  cosmos_proto.ScalarDescriptorKt.Dsl._create(cosmos_proto.Cosmos.ScalarDescriptor.newBuilder()).apply { block() }._build()
public object ScalarDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos_proto.Cosmos.ScalarDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos_proto.Cosmos.ScalarDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos_proto.Cosmos.ScalarDescriptor = _builder.build()

    /**
     * <pre>
     * name is the name of the scalar. It should be a short-name (without
     * a period) such that the fully qualified name of the scalar will be
     * package.name, ex. for the package a.b and scalar named C, the
     * fully-qualified name will be a.b.C.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * name is the name of the scalar. It should be a short-name (without
     * a period) such that the fully qualified name of the scalar will be
     * package.name, ex. for the package a.b and scalar named C, the
     * fully-qualified name will be a.b.C.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * description is a human-readable description of the scalar and its
     * encoding format. For instance a big integer or decimal scalar should
     * specify precisely the expected encoding format.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <pre>
     * description is a human-readable description of the scalar and its
     * encoding format. For instance a big integer or decimal scalar should
     * specify precisely the expected encoding format.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FieldTypeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     */
    public val fieldType: com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFieldTypeList()
      )
    /**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     * @param value The fieldType to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFieldType")
    public fun com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>.add(value: cosmos_proto.Cosmos.ScalarType) {
      _builder.addFieldType(value)
    }/**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     * @param value The fieldType to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFieldType")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>.plusAssign(value: cosmos_proto.Cosmos.ScalarType) {
      add(value)
    }/**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     * @param values The fieldType to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFieldType")
    public fun com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>.addAll(values: kotlin.collections.Iterable<cosmos_proto.Cosmos.ScalarType>) {
      _builder.addAllFieldType(values)
    }/**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     * @param values The fieldType to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFieldType")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos_proto.Cosmos.ScalarType>) {
      addAll(values)
    }/**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     * @param index The index to set the value at.
     * @param value The fieldType to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFieldType")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>.set(index: kotlin.Int, value: cosmos_proto.Cosmos.ScalarType) {
      _builder.setFieldType(index, value)
    }/**
     * <pre>
     * field_type is the type of field with which this scalar can be used.
     * Scalars can be used with one and only one type of field so that
     * encoding standards and simple and clear. Currently only string and
     * bytes fields are supported for scalars.
     * </pre>
     *
     * <code>repeated .cosmos_proto.ScalarType field_type = 3 [json_name = "fieldType"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFieldType")
    public fun com.google.protobuf.kotlin.DslList<cosmos_proto.Cosmos.ScalarType, FieldTypeProxy>.clear() {
      _builder.clearFieldType()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos_proto.Cosmos.ScalarDescriptor.copy(block: cosmos_proto.ScalarDescriptorKt.Dsl.() -> kotlin.Unit): cosmos_proto.Cosmos.ScalarDescriptor =
  cosmos_proto.ScalarDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()


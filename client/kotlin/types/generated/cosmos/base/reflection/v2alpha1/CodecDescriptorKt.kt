//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmName("-initializecodecDescriptor")
public inline fun codecDescriptor(block: cosmos.base.reflection.v2alpha1.CodecDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor =
  cosmos.base.reflection.v2alpha1.CodecDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor.newBuilder()).apply { block() }._build()
public object CodecDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InterfacesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     */
     public val interfaces: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInterfacesList()
      )
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     * @param value The interfaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInterfaces")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor) {
      _builder.addInterfaces(value)
    }
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     * @param value The interfaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInterfaces")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor) {
      add(value)
    }
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     * @param values The interfaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInterfaces")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor>) {
      _builder.addAllInterfaces(values)
    }
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     * @param values The interfaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInterfaces")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor>) {
      addAll(values)
    }
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     * @param index The index to set the value at.
     * @param value The interfaces to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInterfaces")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor) {
      _builder.setInterfaces(index, value)
    }
    /**
     * <pre>
     * interfaces is a list of the registerted interfaces descriptors
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceDescriptor interfaces = 1 [json_name = "interfaces"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInterfaces")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor, InterfacesProxy>.clear() {
      _builder.clearInterfaces()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor.copy(block: cosmos.base.reflection.v2alpha1.CodecDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor =
  cosmos.base.reflection.v2alpha1.CodecDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()


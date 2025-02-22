//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/slashing/module/v1/module.proto

package cosmos.slashing.module.v1;

@kotlin.jvm.JvmName("-initializemodule")
public inline fun module(block: cosmos.slashing.module.v1.ModuleKt.Dsl.() -> kotlin.Unit): cosmos.slashing.module.v1.ModuleOuterClass.Module =
  cosmos.slashing.module.v1.ModuleKt.Dsl._create(cosmos.slashing.module.v1.ModuleOuterClass.Module.newBuilder()).apply { block() }._build()
public object ModuleKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.slashing.module.v1.ModuleOuterClass.Module.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.slashing.module.v1.ModuleOuterClass.Module.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.slashing.module.v1.ModuleOuterClass.Module = _builder.build()

    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     */
    public var authority: kotlin.String
      @JvmName("getAuthority")
      get() = _builder.getAuthority()
      @JvmName("setAuthority")
      set(value) {
        _builder.setAuthority(value)
      }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     */
    public fun clearAuthority() {
      _builder.clearAuthority()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.slashing.module.v1.ModuleOuterClass.Module.copy(block: cosmos.slashing.module.v1.ModuleKt.Dsl.() -> kotlin.Unit): cosmos.slashing.module.v1.ModuleOuterClass.Module =
  cosmos.slashing.module.v1.ModuleKt.Dsl._create(this.toBuilder()).apply { block() }._build()


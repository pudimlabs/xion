//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/vesting/module/v1/module.proto

package cosmos.vesting.module.v1;

@kotlin.jvm.JvmName("-initializemodule")
public inline fun module(block: cosmos.vesting.module.v1.ModuleKt.Dsl.() -> kotlin.Unit): cosmos.vesting.module.v1.ModuleOuterClass.Module =
  cosmos.vesting.module.v1.ModuleKt.Dsl._create(cosmos.vesting.module.v1.ModuleOuterClass.Module.newBuilder()).apply { block() }._build()
public object ModuleKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.vesting.module.v1.ModuleOuterClass.Module.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.vesting.module.v1.ModuleOuterClass.Module.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.vesting.module.v1.ModuleOuterClass.Module = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.vesting.module.v1.ModuleOuterClass.Module.copy(block: cosmos.vesting.module.v1.ModuleKt.Dsl.() -> kotlin.Unit): cosmos.vesting.module.v1.ModuleOuterClass.Module =
  cosmos.vesting.module.v1.ModuleKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

@kotlin.jvm.JvmName("-initializegasInfo")
public inline fun gasInfo(block: cosmos.base.abci.v1beta1.GasInfoKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.GasInfo =
  cosmos.base.abci.v1beta1.GasInfoKt.Dsl._create(cosmos.base.abci.v1beta1.Abci.GasInfo.newBuilder()).apply { block() }._build()
public object GasInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.abci.v1beta1.Abci.GasInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.abci.v1beta1.Abci.GasInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.abci.v1beta1.Abci.GasInfo = _builder.build()

    /**
     * <pre>
     * GasWanted is the maximum units of work we allow this tx to perform.
     * </pre>
     *
     * <code>uint64 gas_wanted = 1 [json_name = "gasWanted"];</code>
     */
    public var gasWanted: kotlin.Long
      @JvmName("getGasWanted")
      get() = _builder.getGasWanted()
      @JvmName("setGasWanted")
      set(value) {
        _builder.setGasWanted(value)
      }
    /**
     * <pre>
     * GasWanted is the maximum units of work we allow this tx to perform.
     * </pre>
     *
     * <code>uint64 gas_wanted = 1 [json_name = "gasWanted"];</code>
     */
    public fun clearGasWanted() {
      _builder.clearGasWanted()
    }

    /**
     * <pre>
     * GasUsed is the amount of gas actually consumed.
     * </pre>
     *
     * <code>uint64 gas_used = 2 [json_name = "gasUsed"];</code>
     */
    public var gasUsed: kotlin.Long
      @JvmName("getGasUsed")
      get() = _builder.getGasUsed()
      @JvmName("setGasUsed")
      set(value) {
        _builder.setGasUsed(value)
      }
    /**
     * <pre>
     * GasUsed is the amount of gas actually consumed.
     * </pre>
     *
     * <code>uint64 gas_used = 2 [json_name = "gasUsed"];</code>
     */
    public fun clearGasUsed() {
      _builder.clearGasUsed()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.abci.v1beta1.Abci.GasInfo.copy(block: cosmos.base.abci.v1beta1.GasInfoKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.GasInfo =
  cosmos.base.abci.v1beta1.GasInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()


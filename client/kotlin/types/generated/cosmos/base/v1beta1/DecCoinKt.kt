//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/v1beta1/coin.proto

package cosmos.base.v1beta1;

@kotlin.jvm.JvmName("-initializedecCoin")
public inline fun decCoin(block: cosmos.base.v1beta1.DecCoinKt.Dsl.() -> kotlin.Unit): cosmos.base.v1beta1.CoinOuterClass.DecCoin =
  cosmos.base.v1beta1.DecCoinKt.Dsl._create(cosmos.base.v1beta1.CoinOuterClass.DecCoin.newBuilder()).apply { block() }._build()
public object DecCoinKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.v1beta1.CoinOuterClass.DecCoin.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.v1beta1.CoinOuterClass.DecCoin = _builder.build()

    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     */
    public var denom: kotlin.String
      @JvmName("getDenom")
      get() = _builder.getDenom()
      @JvmName("setDenom")
      set(value) {
        _builder.setDenom(value)
      }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     */
    public fun clearDenom() {
      _builder.clearDenom()
    }

    /**
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public var amount: kotlin.String
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.v1beta1.CoinOuterClass.DecCoin.copy(block: cosmos.base.v1beta1.DecCoinKt.Dsl.() -> kotlin.Unit): cosmos.base.v1beta1.CoinOuterClass.DecCoin =
  cosmos.base.v1beta1.DecCoinKt.Dsl._create(this.toBuilder()).apply { block() }._build()


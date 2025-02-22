//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmName("-initializequerySupplyOfResponse")
public inline fun querySupplyOfResponse(block: cosmos.bank.v1beta1.QuerySupplyOfResponseKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse =
  cosmos.bank.v1beta1.QuerySupplyOfResponseKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.newBuilder()).apply { block() }._build()
public object QuerySupplyOfResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse = _builder.build()

    /**
     * <pre>
     * amount is the supply of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var amount: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <pre>
     * amount is the supply of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }
    /**
     * <pre>
     * amount is the supply of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the amount field is set.
     */
    public fun hasAmount(): kotlin.Boolean {
      return _builder.hasAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.copy(block: cosmos.bank.v1beta1.QuerySupplyOfResponseKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse =
  cosmos.bank.v1beta1.QuerySupplyOfResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponseOrBuilder.amountOrNull: cosmos.base.v1beta1.CoinOuterClass.Coin?
  get() = if (hasAmount()) getAmount() else null


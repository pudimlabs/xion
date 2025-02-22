//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmName("-initializequerySpendableBalanceByDenomRequest")
public inline fun querySpendableBalanceByDenomRequest(block: cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest =
  cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequestKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest.newBuilder()).apply { block() }._build()
public object QuerySpendableBalanceByDenomRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest = _builder.build()

    /**
     * <pre>
     * address is the address to query balances for.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * address is the address to query balances for.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     */
    public var denom: kotlin.String
      @JvmName("getDenom")
      get() = _builder.getDenom()
      @JvmName("setDenom")
      set(value) {
        _builder.setDenom(value)
      }
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     */
    public fun clearDenom() {
      _builder.clearDenom()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest.copy(block: cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest =
  cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmName("-initializedenomOwner")
public inline fun denomOwner(block: cosmos.bank.v1beta1.DenomOwnerKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.DenomOwner =
  cosmos.bank.v1beta1.DenomOwnerKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.DenomOwner.newBuilder()).apply { block() }._build()
public object DenomOwnerKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.DenomOwner.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.DenomOwner.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.DenomOwner = _builder.build()

    /**
     * <pre>
     * address defines the address that owns a particular denomination.
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
     * address defines the address that owns a particular denomination.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * balance is the balance of the denominated coin for an account.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var balance: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getBalance")
      get() = _builder.getBalance()
      @JvmName("setBalance")
      set(value) {
        _builder.setBalance(value)
      }
    /**
     * <pre>
     * balance is the balance of the denominated coin for an account.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearBalance() {
      _builder.clearBalance()
    }
    /**
     * <pre>
     * balance is the balance of the denominated coin for an account.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the balance field is set.
     */
    public fun hasBalance(): kotlin.Boolean {
      return _builder.hasBalance()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.DenomOwner.copy(block: cosmos.bank.v1beta1.DenomOwnerKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.DenomOwner =
  cosmos.bank.v1beta1.DenomOwnerKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.bank.v1beta1.QueryOuterClass.DenomOwnerOrBuilder.balanceOrNull: cosmos.base.v1beta1.CoinOuterClass.Coin?
  get() = if (hasBalance()) getBalance() else null


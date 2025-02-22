//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmName("-initializemsgDelegate")
public inline fun msgDelegate(block: cosmos.staking.v1beta1.MsgDelegateKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgDelegate =
  cosmos.staking.v1beta1.MsgDelegateKt.Dsl._create(cosmos.staking.v1beta1.Tx.MsgDelegate.newBuilder()).apply { block() }._build()
public object MsgDelegateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Tx.MsgDelegate.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Tx.MsgDelegate.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Tx.MsgDelegate = _builder.build()

    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var amount: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the amount field is set.
     */
    public fun hasAmount(): kotlin.Boolean {
      return _builder.hasAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Tx.MsgDelegate.copy(block: cosmos.staking.v1beta1.MsgDelegateKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgDelegate =
  cosmos.staking.v1beta1.MsgDelegateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.staking.v1beta1.Tx.MsgDelegateOrBuilder.amountOrNull: cosmos.base.v1beta1.CoinOuterClass.Coin?
  get() = if (hasAmount()) getAmount() else null


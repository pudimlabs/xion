//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmName("-initializefee")
public inline fun fee(block: cosmos.tx.v1beta1.FeeKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.TxOuterClass.Fee =
  cosmos.tx.v1beta1.FeeKt.Dsl._create(cosmos.tx.v1beta1.TxOuterClass.Fee.newBuilder()).apply { block() }._build()
public object FeeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.TxOuterClass.Fee.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.TxOuterClass.Fee.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.TxOuterClass.Fee = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AmountProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     */
     public val amount: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAmountList()
      )
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addAmount(value)
    }
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllAmount(values)
    }
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The amount to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAmount")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setAmount(index, value)
    }
    /**
     * <pre>
     * amount is the amount of coins to be paid as a fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.clear() {
      _builder.clearAmount()
    }


    /**
     * <pre>
     * gas_limit is the maximum gas that can be used in transaction processing
     * before an out of gas error occurs
     * </pre>
     *
     * <code>uint64 gas_limit = 2 [json_name = "gasLimit"];</code>
     */
    public var gasLimit: kotlin.Long
      @JvmName("getGasLimit")
      get() = _builder.getGasLimit()
      @JvmName("setGasLimit")
      set(value) {
        _builder.setGasLimit(value)
      }
    /**
     * <pre>
     * gas_limit is the maximum gas that can be used in transaction processing
     * before an out of gas error occurs
     * </pre>
     *
     * <code>uint64 gas_limit = 2 [json_name = "gasLimit"];</code>
     */
    public fun clearGasLimit() {
      _builder.clearGasLimit()
    }

    /**
     * <pre>
     * if unset, the first signer is responsible for paying the fees. If set, the specified account must pay the fees.
     * the payer must be a tx signer (and thus have signed this field in AuthInfo).
     * setting this field does *not* change the ordering of required signers for the transaction.
     * </pre>
     *
     * <code>string payer = 3 [json_name = "payer", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var payer: kotlin.String
      @JvmName("getPayer")
      get() = _builder.getPayer()
      @JvmName("setPayer")
      set(value) {
        _builder.setPayer(value)
      }
    /**
     * <pre>
     * if unset, the first signer is responsible for paying the fees. If set, the specified account must pay the fees.
     * the payer must be a tx signer (and thus have signed this field in AuthInfo).
     * setting this field does *not* change the ordering of required signers for the transaction.
     * </pre>
     *
     * <code>string payer = 3 [json_name = "payer", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearPayer() {
      _builder.clearPayer()
    }

    /**
     * <pre>
     * if set, the fee payer (either the first signer or the value of the payer field) requests that a fee grant be used
     * to pay fees instead of the fee payer's own balance. If an appropriate fee grant does not exist or the chain does
     * not support fee grants, this will fail
     * </pre>
     *
     * <code>string granter = 4 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var granter: kotlin.String
      @JvmName("getGranter")
      get() = _builder.getGranter()
      @JvmName("setGranter")
      set(value) {
        _builder.setGranter(value)
      }
    /**
     * <pre>
     * if set, the fee payer (either the first signer or the value of the payer field) requests that a fee grant be used
     * to pay fees instead of the fee payer's own balance. If an appropriate fee grant does not exist or the chain does
     * not support fee grants, this will fail
     * </pre>
     *
     * <code>string granter = 4 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearGranter() {
      _builder.clearGranter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.TxOuterClass.Fee.copy(block: cosmos.tx.v1beta1.FeeKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.TxOuterClass.Fee =
  cosmos.tx.v1beta1.FeeKt.Dsl._create(this.toBuilder()).apply { block() }._build()


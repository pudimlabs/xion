//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmName("-initializemsgCommunityPoolSpend")
public inline fun msgCommunityPoolSpend(block: cosmos.distribution.v1beta1.MsgCommunityPoolSpendKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend =
  cosmos.distribution.v1beta1.MsgCommunityPoolSpendKt.Dsl._create(cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend.newBuilder()).apply { block() }._build()
public object MsgCommunityPoolSpendKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend = _builder.build()

    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAuthority() {
      _builder.clearAuthority()
    }

    /**
     * <code>string recipient = 2 [json_name = "recipient"];</code>
     */
    public var recipient: kotlin.String
      @JvmName("getRecipient")
      get() = _builder.getRecipient()
      @JvmName("setRecipient")
      set(value) {
        _builder.setRecipient(value)
      }
    /**
     * <code>string recipient = 2 [json_name = "recipient"];</code>
     */
    public fun clearRecipient() {
      _builder.clearRecipient()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AmountProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     */
     public val amount: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAmountList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addAmount(value)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllAmount(values)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The amount to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAmount")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setAmount(index, value)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.clear() {
      _builder.clearAmount()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend.copy(block: cosmos.distribution.v1beta1.MsgCommunityPoolSpendKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpend =
  cosmos.distribution.v1beta1.MsgCommunityPoolSpendKt.Dsl._create(this.toBuilder()).apply { block() }._build()


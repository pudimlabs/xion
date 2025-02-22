//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1/gov.proto

package cosmos.gov.v1;

@kotlin.jvm.JvmName("-initializedeposit")
public inline fun deposit(block: cosmos.gov.v1.DepositKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Gov.Deposit =
  cosmos.gov.v1.DepositKt.Dsl._create(cosmos.gov.v1.Gov.Deposit.newBuilder()).apply { block() }._build()
public object DepositKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1.Gov.Deposit.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1.Gov.Deposit.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1.Gov.Deposit = _builder.build()

    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public var proposalId: kotlin.Long
      @JvmName("getProposalId")
      get() = _builder.getProposalId()
      @JvmName("setProposalId")
      set(value) {
        _builder.setProposalId(value)
      }
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }

    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 2 [json_name = "depositor", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var depositor: kotlin.String
      @JvmName("getDepositor")
      get() = _builder.getDepositor()
      @JvmName("setDepositor")
      set(value) {
        _builder.setDepositor(value)
      }
    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 2 [json_name = "depositor", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDepositor() {
      _builder.clearDepositor()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AmountProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
     public val amount: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAmountList()
      )
    /**
     * <pre>
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addAmount(value)
    }
    /**
     * <pre>
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
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
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllAmount(values)
    }
    /**
     * <pre>
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
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
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
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
     * amount to be deposited by depositor.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.clear() {
      _builder.clearAmount()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1.Gov.Deposit.copy(block: cosmos.gov.v1.DepositKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Gov.Deposit =
  cosmos.gov.v1.DepositKt.Dsl._create(this.toBuilder()).apply { block() }._build()


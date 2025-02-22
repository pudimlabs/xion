//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1/tx.proto

package cosmos.gov.v1;

@kotlin.jvm.JvmName("-initializemsgSubmitProposal")
public inline fun msgSubmitProposal(block: cosmos.gov.v1.MsgSubmitProposalKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Tx.MsgSubmitProposal =
  cosmos.gov.v1.MsgSubmitProposalKt.Dsl._create(cosmos.gov.v1.Tx.MsgSubmitProposal.newBuilder()).apply { block() }._build()
public object MsgSubmitProposalKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1.Tx.MsgSubmitProposal.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1.Tx.MsgSubmitProposal.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1.Tx.MsgSubmitProposal = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MessagesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     */
     public val messages: com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMessagesList()
      )
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     * @param value The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMessages")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>.add(value: com.google.protobuf.Any) {
      _builder.addMessages(value)
    }
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     * @param value The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMessages")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>.plusAssign(value: com.google.protobuf.Any) {
      add(value)
    }
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     * @param values The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMessages")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.Any>) {
      _builder.addAllMessages(values)
    }
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     * @param values The messages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMessages")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.Any>) {
      addAll(values)
    }
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     * @param index The index to set the value at.
     * @param value The messages to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMessages")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>.set(index: kotlin.Int, value: com.google.protobuf.Any) {
      _builder.setMessages(index, value)
    }
    /**
     * <pre>
     * messages are the arbitrary messages to be executed if proposal passes.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any messages = 1 [json_name = "messages"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMessages")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, MessagesProxy>.clear() {
      _builder.clearMessages()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InitialDepositProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     */
     public val initialDeposit: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInitialDepositList()
      )
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param value The initialDeposit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInitialDeposit")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addInitialDeposit(value)
    }
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param value The initialDeposit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInitialDeposit")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param values The initialDeposit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInitialDeposit")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllInitialDeposit(values)
    }
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param values The initialDeposit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInitialDeposit")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The initialDeposit to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInitialDeposit")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setInitialDeposit(index, value)
    }
    /**
     * <pre>
     * initial_deposit is the deposit value that must be paid at proposal submission.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin initial_deposit = 2 [json_name = "initialDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInitialDeposit")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, InitialDepositProxy>.clear() {
      _builder.clearInitialDeposit()
    }


    /**
     * <pre>
     * proposer is the account address of the proposer.
     * </pre>
     *
     * <code>string proposer = 3 [json_name = "proposer", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var proposer: kotlin.String
      @JvmName("getProposer")
      get() = _builder.getProposer()
      @JvmName("setProposer")
      set(value) {
        _builder.setProposer(value)
      }
    /**
     * <pre>
     * proposer is the account address of the proposer.
     * </pre>
     *
     * <code>string proposer = 3 [json_name = "proposer", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearProposer() {
      _builder.clearProposer()
    }

    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the proposal.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     */
    public var metadata: kotlin.String
      @JvmName("getMetadata")
      get() = _builder.getMetadata()
      @JvmName("setMetadata")
      set(value) {
        _builder.setMetadata(value)
      }
    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the proposal.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }

    /**
     * <pre>
     * title is the title of the proposal.
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>string title = 5 [json_name = "title"];</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <pre>
     * title is the title of the proposal.
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>string title = 5 [json_name = "title"];</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <pre>
     * summary is the summary of the proposal
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>string summary = 6 [json_name = "summary"];</code>
     */
    public var summary: kotlin.String
      @JvmName("getSummary")
      get() = _builder.getSummary()
      @JvmName("setSummary")
      set(value) {
        _builder.setSummary(value)
      }
    /**
     * <pre>
     * summary is the summary of the proposal
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>string summary = 6 [json_name = "summary"];</code>
     */
    public fun clearSummary() {
      _builder.clearSummary()
    }

    /**
     * <pre>
     * expedited defines if the proposal is expedited or not
     * Since: cosmos-sdk 0.50
     * </pre>
     *
     * <code>bool expedited = 7 [json_name = "expedited"];</code>
     */
    public var expedited: kotlin.Boolean
      @JvmName("getExpedited")
      get() = _builder.getExpedited()
      @JvmName("setExpedited")
      set(value) {
        _builder.setExpedited(value)
      }
    /**
     * <pre>
     * expedited defines if the proposal is expedited or not
     * Since: cosmos-sdk 0.50
     * </pre>
     *
     * <code>bool expedited = 7 [json_name = "expedited"];</code>
     */
    public fun clearExpedited() {
      _builder.clearExpedited()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1.Tx.MsgSubmitProposal.copy(block: cosmos.gov.v1.MsgSubmitProposalKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Tx.MsgSubmitProposal =
  cosmos.gov.v1.MsgSubmitProposalKt.Dsl._create(this.toBuilder()).apply { block() }._build()


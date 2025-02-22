//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializerequestExtendVote")
public inline fun requestExtendVote(block: tendermint.abci.RequestExtendVoteKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestExtendVote =
  tendermint.abci.RequestExtendVoteKt.Dsl._create(tendermint.abci.Types.RequestExtendVote.newBuilder()).apply { block() }._build()
public object RequestExtendVoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.RequestExtendVote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.RequestExtendVote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.RequestExtendVote = _builder.build()

    /**
     * <pre>
     * the hash of the block that this vote may be referring to
     * </pre>
     *
     * <code>bytes hash = 1 [json_name = "hash"];</code>
     */
    public var hash: com.google.protobuf.ByteString
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <pre>
     * the hash of the block that this vote may be referring to
     * </pre>
     *
     * <code>bytes hash = 1 [json_name = "hash"];</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <pre>
     * the height of the extended vote
     * </pre>
     *
     * <code>int64 height = 2 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <pre>
     * the height of the extended vote
     * </pre>
     *
     * <code>int64 height = 2 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * info of the block that this vote may be referring to
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 3 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var time: com.google.protobuf.Timestamp
      @JvmName("getTime")
      get() = _builder.getTime()
      @JvmName("setTime")
      set(value) {
        _builder.setTime(value)
      }
    /**
     * <pre>
     * info of the block that this vote may be referring to
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 3 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearTime() {
      _builder.clearTime()
    }
    /**
     * <pre>
     * info of the block that this vote may be referring to
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 3 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the time field is set.
     */
    public fun hasTime(): kotlin.Boolean {
      return _builder.hasTime()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TxsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     */
     public val txs: com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTxsList()
      )
    /**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTxs")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.add(value: com.google.protobuf.ByteString) {
      _builder.addTxs(value)
    }/**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTxs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.plusAssign(value: com.google.protobuf.ByteString) {
      add(value)
    }/**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTxs")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      _builder.addAllTxs(values)
    }/**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTxs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      addAll(values)
    }/**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     * @param index The index to set the value at.
     * @param value The txs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTxs")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.set(index: kotlin.Int, value: com.google.protobuf.ByteString) {
      _builder.setTxs(index, value)
    }/**
     * <code>repeated bytes txs = 4 [json_name = "txs"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTxs")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.clear() {
      _builder.clearTxs()
    }
    /**
     * <code>.tendermint.abci.CommitInfo proposed_last_commit = 5 [json_name = "proposedLastCommit", (.gogoproto.nullable) = false];</code>
     */
    public var proposedLastCommit: tendermint.abci.Types.CommitInfo
      @JvmName("getProposedLastCommit")
      get() = _builder.getProposedLastCommit()
      @JvmName("setProposedLastCommit")
      set(value) {
        _builder.setProposedLastCommit(value)
      }
    /**
     * <code>.tendermint.abci.CommitInfo proposed_last_commit = 5 [json_name = "proposedLastCommit", (.gogoproto.nullable) = false];</code>
     */
    public fun clearProposedLastCommit() {
      _builder.clearProposedLastCommit()
    }
    /**
     * <code>.tendermint.abci.CommitInfo proposed_last_commit = 5 [json_name = "proposedLastCommit", (.gogoproto.nullable) = false];</code>
     * @return Whether the proposedLastCommit field is set.
     */
    public fun hasProposedLastCommit(): kotlin.Boolean {
      return _builder.hasProposedLastCommit()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MisbehaviorProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     */
     public val misbehavior: com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMisbehaviorList()
      )
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     * @param value The misbehavior to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMisbehavior")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>.add(value: tendermint.abci.Types.Misbehavior) {
      _builder.addMisbehavior(value)
    }
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     * @param value The misbehavior to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMisbehavior")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>.plusAssign(value: tendermint.abci.Types.Misbehavior) {
      add(value)
    }
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     * @param values The misbehavior to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMisbehavior")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>.addAll(values: kotlin.collections.Iterable<tendermint.abci.Types.Misbehavior>) {
      _builder.addAllMisbehavior(values)
    }
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     * @param values The misbehavior to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMisbehavior")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.abci.Types.Misbehavior>) {
      addAll(values)
    }
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The misbehavior to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMisbehavior")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>.set(index: kotlin.Int, value: tendermint.abci.Types.Misbehavior) {
      _builder.setMisbehavior(index, value)
    }
    /**
     * <code>repeated .tendermint.abci.Misbehavior misbehavior = 6 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMisbehavior")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Misbehavior, MisbehaviorProxy>.clear() {
      _builder.clearMisbehavior()
    }


    /**
     * <code>bytes next_validators_hash = 7 [json_name = "nextValidatorsHash"];</code>
     */
    public var nextValidatorsHash: com.google.protobuf.ByteString
      @JvmName("getNextValidatorsHash")
      get() = _builder.getNextValidatorsHash()
      @JvmName("setNextValidatorsHash")
      set(value) {
        _builder.setNextValidatorsHash(value)
      }
    /**
     * <code>bytes next_validators_hash = 7 [json_name = "nextValidatorsHash"];</code>
     */
    public fun clearNextValidatorsHash() {
      _builder.clearNextValidatorsHash()
    }

    /**
     * <pre>
     * address of the public key of the original proposer of the block.
     * </pre>
     *
     * <code>bytes proposer_address = 8 [json_name = "proposerAddress"];</code>
     */
    public var proposerAddress: com.google.protobuf.ByteString
      @JvmName("getProposerAddress")
      get() = _builder.getProposerAddress()
      @JvmName("setProposerAddress")
      set(value) {
        _builder.setProposerAddress(value)
      }
    /**
     * <pre>
     * address of the public key of the original proposer of the block.
     * </pre>
     *
     * <code>bytes proposer_address = 8 [json_name = "proposerAddress"];</code>
     */
    public fun clearProposerAddress() {
      _builder.clearProposerAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.RequestExtendVote.copy(block: tendermint.abci.RequestExtendVoteKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestExtendVote =
  tendermint.abci.RequestExtendVoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val tendermint.abci.Types.RequestExtendVoteOrBuilder.timeOrNull: com.google.protobuf.Timestamp?
  get() = if (hasTime()) getTime() else null

public val tendermint.abci.Types.RequestExtendVoteOrBuilder.proposedLastCommitOrNull: tendermint.abci.Types.CommitInfo?
  get() = if (hasProposedLastCommit()) getProposedLastCommit() else null


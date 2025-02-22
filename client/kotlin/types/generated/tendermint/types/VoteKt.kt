//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

@kotlin.jvm.JvmName("-initializevote")
public inline fun vote(block: tendermint.types.VoteKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Vote =
  tendermint.types.VoteKt.Dsl._create(tendermint.types.Types.Vote.newBuilder()).apply { block() }._build()
public object VoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Types.Vote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Types.Vote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Types.Vote = _builder.build()

    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     */
    public var type: tendermint.types.Types.SignedMsgType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
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
     * <code>int64 height = 2 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>int32 round = 3 [json_name = "round"];</code>
     */
    public var round: kotlin.Int
      @JvmName("getRound")
      get() = _builder.getRound()
      @JvmName("setRound")
      set(value) {
        _builder.setRound(value)
      }
    /**
     * <code>int32 round = 3 [json_name = "round"];</code>
     */
    public fun clearRound() {
      _builder.clearRound()
    }

    /**
     * <pre>
     * zero if vote is nil.
     * </pre>
     *
     * <code>.tendermint.types.BlockID block_id = 4 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public var blockId: tendermint.types.Types.BlockID
      @JvmName("getBlockId")
      get() = _builder.getBlockId()
      @JvmName("setBlockId")
      set(value) {
        _builder.setBlockId(value)
      }
    /**
     * <pre>
     * zero if vote is nil.
     * </pre>
     *
     * <code>.tendermint.types.BlockID block_id = 4 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public fun clearBlockId() {
      _builder.clearBlockId()
    }
    /**
     * <pre>
     * zero if vote is nil.
     * </pre>
     *
     * <code>.tendermint.types.BlockID block_id = 4 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     * @return Whether the blockId field is set.
     */
    public fun hasBlockId(): kotlin.Boolean {
      return _builder.hasBlockId()
    }

    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var timestamp: com.google.protobuf.Timestamp
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the timestamp field is set.
     */
    public fun hasTimestamp(): kotlin.Boolean {
      return _builder.hasTimestamp()
    }

    /**
     * <code>bytes validator_address = 6 [json_name = "validatorAddress"];</code>
     */
    public var validatorAddress: com.google.protobuf.ByteString
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>bytes validator_address = 6 [json_name = "validatorAddress"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <code>int32 validator_index = 7 [json_name = "validatorIndex"];</code>
     */
    public var validatorIndex: kotlin.Int
      @JvmName("getValidatorIndex")
      get() = _builder.getValidatorIndex()
      @JvmName("setValidatorIndex")
      set(value) {
        _builder.setValidatorIndex(value)
      }
    /**
     * <code>int32 validator_index = 7 [json_name = "validatorIndex"];</code>
     */
    public fun clearValidatorIndex() {
      _builder.clearValidatorIndex()
    }

    /**
     * <pre>
     * Vote signature by the validator if they participated in consensus for the
     * associated block.
     * </pre>
     *
     * <code>bytes signature = 8 [json_name = "signature"];</code>
     */
    public var signature: com.google.protobuf.ByteString
      @JvmName("getSignature")
      get() = _builder.getSignature()
      @JvmName("setSignature")
      set(value) {
        _builder.setSignature(value)
      }
    /**
     * <pre>
     * Vote signature by the validator if they participated in consensus for the
     * associated block.
     * </pre>
     *
     * <code>bytes signature = 8 [json_name = "signature"];</code>
     */
    public fun clearSignature() {
      _builder.clearSignature()
    }

    /**
     * <pre>
     * Vote extension provided by the application. Only valid for precommit
     * messages.
     * </pre>
     *
     * <code>bytes extension = 9 [json_name = "extension"];</code>
     */
    public var extension: com.google.protobuf.ByteString
      @JvmName("getExtension")
      get() = _builder.getExtension()
      @JvmName("setExtension")
      set(value) {
        _builder.setExtension(value)
      }
    /**
     * <pre>
     * Vote extension provided by the application. Only valid for precommit
     * messages.
     * </pre>
     *
     * <code>bytes extension = 9 [json_name = "extension"];</code>
     */
    public fun clearExtension() {
      _builder.clearExtension()
    }

    /**
     * <pre>
     * Vote extension signature by the validator if they participated in
     * consensus for the associated block.
     * Only valid for precommit messages.
     * </pre>
     *
     * <code>bytes extension_signature = 10 [json_name = "extensionSignature"];</code>
     */
    public var extensionSignature: com.google.protobuf.ByteString
      @JvmName("getExtensionSignature")
      get() = _builder.getExtensionSignature()
      @JvmName("setExtensionSignature")
      set(value) {
        _builder.setExtensionSignature(value)
      }
    /**
     * <pre>
     * Vote extension signature by the validator if they participated in
     * consensus for the associated block.
     * Only valid for precommit messages.
     * </pre>
     *
     * <code>bytes extension_signature = 10 [json_name = "extensionSignature"];</code>
     */
    public fun clearExtensionSignature() {
      _builder.clearExtensionSignature()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Types.Vote.copy(block: tendermint.types.VoteKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Vote =
  tendermint.types.VoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val tendermint.types.Types.VoteOrBuilder.blockIdOrNull: tendermint.types.Types.BlockID?
  get() = if (hasBlockId()) getBlockId() else null

public val tendermint.types.Types.VoteOrBuilder.timestampOrNull: com.google.protobuf.Timestamp?
  get() = if (hasTimestamp()) getTimestamp() else null


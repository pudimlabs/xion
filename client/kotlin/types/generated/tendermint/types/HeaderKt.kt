//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

@kotlin.jvm.JvmName("-initializeheader")
public inline fun header(block: tendermint.types.HeaderKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Header =
  tendermint.types.HeaderKt.Dsl._create(tendermint.types.Types.Header.newBuilder()).apply { block() }._build()
public object HeaderKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Types.Header.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Types.Header.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Types.Header = _builder.build()

    /**
     * <pre>
     * basic block info
     * </pre>
     *
     * <code>.tendermint.version.Consensus version = 1 [json_name = "version", (.gogoproto.nullable) = false];</code>
     */
    public var version: tendermint.version.Types.Consensus
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <pre>
     * basic block info
     * </pre>
     *
     * <code>.tendermint.version.Consensus version = 1 [json_name = "version", (.gogoproto.nullable) = false];</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
    /**
     * <pre>
     * basic block info
     * </pre>
     *
     * <code>.tendermint.version.Consensus version = 1 [json_name = "version", (.gogoproto.nullable) = false];</code>
     * @return Whether the version field is set.
     */
    public fun hasVersion(): kotlin.Boolean {
      return _builder.hasVersion()
    }

    /**
     * <code>string chain_id = 2 [json_name = "chainId", (.gogoproto.customname) = "ChainID"];</code>
     */
    public var chainId: kotlin.String
      @JvmName("getChainId")
      get() = _builder.getChainId()
      @JvmName("setChainId")
      set(value) {
        _builder.setChainId(value)
      }
    /**
     * <code>string chain_id = 2 [json_name = "chainId", (.gogoproto.customname) = "ChainID"];</code>
     */
    public fun clearChainId() {
      _builder.clearChainId()
    }

    /**
     * <code>int64 height = 3 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>int64 height = 3 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var time: com.google.protobuf.Timestamp
      @JvmName("getTime")
      get() = _builder.getTime()
      @JvmName("setTime")
      set(value) {
        _builder.setTime(value)
      }
    /**
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearTime() {
      _builder.clearTime()
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the time field is set.
     */
    public fun hasTime(): kotlin.Boolean {
      return _builder.hasTime()
    }

    /**
     * <pre>
     * prev block info
     * </pre>
     *
     * <code>.tendermint.types.BlockID last_block_id = 5 [json_name = "lastBlockId", (.gogoproto.nullable) = false];</code>
     */
    public var lastBlockId: tendermint.types.Types.BlockID
      @JvmName("getLastBlockId")
      get() = _builder.getLastBlockId()
      @JvmName("setLastBlockId")
      set(value) {
        _builder.setLastBlockId(value)
      }
    /**
     * <pre>
     * prev block info
     * </pre>
     *
     * <code>.tendermint.types.BlockID last_block_id = 5 [json_name = "lastBlockId", (.gogoproto.nullable) = false];</code>
     */
    public fun clearLastBlockId() {
      _builder.clearLastBlockId()
    }
    /**
     * <pre>
     * prev block info
     * </pre>
     *
     * <code>.tendermint.types.BlockID last_block_id = 5 [json_name = "lastBlockId", (.gogoproto.nullable) = false];</code>
     * @return Whether the lastBlockId field is set.
     */
    public fun hasLastBlockId(): kotlin.Boolean {
      return _builder.hasLastBlockId()
    }

    /**
     * <pre>
     * hashes of block data
     * </pre>
     *
     * <code>bytes last_commit_hash = 6 [json_name = "lastCommitHash"];</code>
     */
    public var lastCommitHash: com.google.protobuf.ByteString
      @JvmName("getLastCommitHash")
      get() = _builder.getLastCommitHash()
      @JvmName("setLastCommitHash")
      set(value) {
        _builder.setLastCommitHash(value)
      }
    /**
     * <pre>
     * hashes of block data
     * </pre>
     *
     * <code>bytes last_commit_hash = 6 [json_name = "lastCommitHash"];</code>
     */
    public fun clearLastCommitHash() {
      _builder.clearLastCommitHash()
    }

    /**
     * <pre>
     * transactions
     * </pre>
     *
     * <code>bytes data_hash = 7 [json_name = "dataHash"];</code>
     */
    public var dataHash: com.google.protobuf.ByteString
      @JvmName("getDataHash")
      get() = _builder.getDataHash()
      @JvmName("setDataHash")
      set(value) {
        _builder.setDataHash(value)
      }
    /**
     * <pre>
     * transactions
     * </pre>
     *
     * <code>bytes data_hash = 7 [json_name = "dataHash"];</code>
     */
    public fun clearDataHash() {
      _builder.clearDataHash()
    }

    /**
     * <pre>
     * hashes from the app output from the prev block
     * </pre>
     *
     * <code>bytes validators_hash = 8 [json_name = "validatorsHash"];</code>
     */
    public var validatorsHash: com.google.protobuf.ByteString
      @JvmName("getValidatorsHash")
      get() = _builder.getValidatorsHash()
      @JvmName("setValidatorsHash")
      set(value) {
        _builder.setValidatorsHash(value)
      }
    /**
     * <pre>
     * hashes from the app output from the prev block
     * </pre>
     *
     * <code>bytes validators_hash = 8 [json_name = "validatorsHash"];</code>
     */
    public fun clearValidatorsHash() {
      _builder.clearValidatorsHash()
    }

    /**
     * <pre>
     * validators for the next block
     * </pre>
     *
     * <code>bytes next_validators_hash = 9 [json_name = "nextValidatorsHash"];</code>
     */
    public var nextValidatorsHash: com.google.protobuf.ByteString
      @JvmName("getNextValidatorsHash")
      get() = _builder.getNextValidatorsHash()
      @JvmName("setNextValidatorsHash")
      set(value) {
        _builder.setNextValidatorsHash(value)
      }
    /**
     * <pre>
     * validators for the next block
     * </pre>
     *
     * <code>bytes next_validators_hash = 9 [json_name = "nextValidatorsHash"];</code>
     */
    public fun clearNextValidatorsHash() {
      _builder.clearNextValidatorsHash()
    }

    /**
     * <pre>
     * consensus params for current block
     * </pre>
     *
     * <code>bytes consensus_hash = 10 [json_name = "consensusHash"];</code>
     */
    public var consensusHash: com.google.protobuf.ByteString
      @JvmName("getConsensusHash")
      get() = _builder.getConsensusHash()
      @JvmName("setConsensusHash")
      set(value) {
        _builder.setConsensusHash(value)
      }
    /**
     * <pre>
     * consensus params for current block
     * </pre>
     *
     * <code>bytes consensus_hash = 10 [json_name = "consensusHash"];</code>
     */
    public fun clearConsensusHash() {
      _builder.clearConsensusHash()
    }

    /**
     * <pre>
     * state after txs from the previous block
     * </pre>
     *
     * <code>bytes app_hash = 11 [json_name = "appHash"];</code>
     */
    public var appHash: com.google.protobuf.ByteString
      @JvmName("getAppHash")
      get() = _builder.getAppHash()
      @JvmName("setAppHash")
      set(value) {
        _builder.setAppHash(value)
      }
    /**
     * <pre>
     * state after txs from the previous block
     * </pre>
     *
     * <code>bytes app_hash = 11 [json_name = "appHash"];</code>
     */
    public fun clearAppHash() {
      _builder.clearAppHash()
    }

    /**
     * <pre>
     * root hash of all results from the txs from the previous block
     * </pre>
     *
     * <code>bytes last_results_hash = 12 [json_name = "lastResultsHash"];</code>
     */
    public var lastResultsHash: com.google.protobuf.ByteString
      @JvmName("getLastResultsHash")
      get() = _builder.getLastResultsHash()
      @JvmName("setLastResultsHash")
      set(value) {
        _builder.setLastResultsHash(value)
      }
    /**
     * <pre>
     * root hash of all results from the txs from the previous block
     * </pre>
     *
     * <code>bytes last_results_hash = 12 [json_name = "lastResultsHash"];</code>
     */
    public fun clearLastResultsHash() {
      _builder.clearLastResultsHash()
    }

    /**
     * <pre>
     * consensus info
     * </pre>
     *
     * <code>bytes evidence_hash = 13 [json_name = "evidenceHash"];</code>
     */
    public var evidenceHash: com.google.protobuf.ByteString
      @JvmName("getEvidenceHash")
      get() = _builder.getEvidenceHash()
      @JvmName("setEvidenceHash")
      set(value) {
        _builder.setEvidenceHash(value)
      }
    /**
     * <pre>
     * consensus info
     * </pre>
     *
     * <code>bytes evidence_hash = 13 [json_name = "evidenceHash"];</code>
     */
    public fun clearEvidenceHash() {
      _builder.clearEvidenceHash()
    }

    /**
     * <pre>
     * original proposer of the block
     * </pre>
     *
     * <code>bytes proposer_address = 14 [json_name = "proposerAddress"];</code>
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
     * original proposer of the block
     * </pre>
     *
     * <code>bytes proposer_address = 14 [json_name = "proposerAddress"];</code>
     */
    public fun clearProposerAddress() {
      _builder.clearProposerAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Types.Header.copy(block: tendermint.types.HeaderKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Header =
  tendermint.types.HeaderKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val tendermint.types.Types.HeaderOrBuilder.versionOrNull: tendermint.version.Types.Consensus?
  get() = if (hasVersion()) getVersion() else null

public val tendermint.types.Types.HeaderOrBuilder.timeOrNull: com.google.protobuf.Timestamp?
  get() = if (hasTime()) getTime() else null

public val tendermint.types.Types.HeaderOrBuilder.lastBlockIdOrNull: tendermint.types.Types.BlockID?
  get() = if (hasLastBlockId()) getLastBlockId() else null


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializerequestVerifyVoteExtension")
public inline fun requestVerifyVoteExtension(block: tendermint.abci.RequestVerifyVoteExtensionKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestVerifyVoteExtension =
  tendermint.abci.RequestVerifyVoteExtensionKt.Dsl._create(tendermint.abci.Types.RequestVerifyVoteExtension.newBuilder()).apply { block() }._build()
public object RequestVerifyVoteExtensionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.RequestVerifyVoteExtension.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.RequestVerifyVoteExtension.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.RequestVerifyVoteExtension = _builder.build()

    /**
     * <pre>
     * the hash of the block that this received vote corresponds to
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
     * the hash of the block that this received vote corresponds to
     * </pre>
     *
     * <code>bytes hash = 1 [json_name = "hash"];</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <pre>
     * the validator that signed the vote extension
     * </pre>
     *
     * <code>bytes validator_address = 2 [json_name = "validatorAddress"];</code>
     */
    public var validatorAddress: com.google.protobuf.ByteString
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <pre>
     * the validator that signed the vote extension
     * </pre>
     *
     * <code>bytes validator_address = 2 [json_name = "validatorAddress"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
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
     * <code>bytes vote_extension = 4 [json_name = "voteExtension"];</code>
     */
    public var voteExtension: com.google.protobuf.ByteString
      @JvmName("getVoteExtension")
      get() = _builder.getVoteExtension()
      @JvmName("setVoteExtension")
      set(value) {
        _builder.setVoteExtension(value)
      }
    /**
     * <code>bytes vote_extension = 4 [json_name = "voteExtension"];</code>
     */
    public fun clearVoteExtension() {
      _builder.clearVoteExtension()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.RequestVerifyVoteExtension.copy(block: tendermint.abci.RequestVerifyVoteExtensionKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestVerifyVoteExtension =
  tendermint.abci.RequestVerifyVoteExtensionKt.Dsl._create(this.toBuilder()).apply { block() }._build()


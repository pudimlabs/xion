//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializeresponseExtendVote")
public inline fun responseExtendVote(block: tendermint.abci.ResponseExtendVoteKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseExtendVote =
  tendermint.abci.ResponseExtendVoteKt.Dsl._create(tendermint.abci.Types.ResponseExtendVote.newBuilder()).apply { block() }._build()
public object ResponseExtendVoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseExtendVote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseExtendVote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseExtendVote = _builder.build()

    /**
     * <code>bytes vote_extension = 1 [json_name = "voteExtension"];</code>
     */
    public var voteExtension: com.google.protobuf.ByteString
      @JvmName("getVoteExtension")
      get() = _builder.getVoteExtension()
      @JvmName("setVoteExtension")
      set(value) {
        _builder.setVoteExtension(value)
      }
    /**
     * <code>bytes vote_extension = 1 [json_name = "voteExtension"];</code>
     */
    public fun clearVoteExtension() {
      _builder.clearVoteExtension()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseExtendVote.copy(block: tendermint.abci.ResponseExtendVoteKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseExtendVote =
  tendermint.abci.ResponseExtendVoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()


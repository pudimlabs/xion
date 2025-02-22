//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1/types.proto

package cosmos.group.v1;

@kotlin.jvm.JvmName("-initializevote")
public inline fun vote(block: cosmos.group.v1.VoteKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Types.Vote =
  cosmos.group.v1.VoteKt.Dsl._create(cosmos.group.v1.Types.Vote.newBuilder()).apply { block() }._build()
public object VoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1.Types.Vote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1.Types.Vote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1.Types.Vote = _builder.build()

    /**
     * <pre>
     * proposal is the unique ID of the proposal.
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
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }

    /**
     * <pre>
     * voter is the account address of the voter.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var voter: kotlin.String
      @JvmName("getVoter")
      get() = _builder.getVoter()
      @JvmName("setVoter")
      set(value) {
        _builder.setVoter(value)
      }
    /**
     * <pre>
     * voter is the account address of the voter.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearVoter() {
      _builder.clearVoter()
    }

    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     */
    public var option: cosmos.group.v1.Types.VoteOption
      @JvmName("getOption")
      get() = _builder.getOption()
      @JvmName("setOption")
      set(value) {
        _builder.setOption(value)
      }
    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     */
    public fun clearOption() {
      _builder.clearOption()
    }

    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/group#vote-2
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
     * metadata is any arbitrary metadata attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/group#vote-2
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }

    /**
     * <pre>
     * submit_time is the timestamp when the vote was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5 [json_name = "submitTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
     */
    public var submitTime: com.google.protobuf.Timestamp
      @JvmName("getSubmitTime")
      get() = _builder.getSubmitTime()
      @JvmName("setSubmitTime")
      set(value) {
        _builder.setSubmitTime(value)
      }
    /**
     * <pre>
     * submit_time is the timestamp when the vote was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5 [json_name = "submitTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearSubmitTime() {
      _builder.clearSubmitTime()
    }
    /**
     * <pre>
     * submit_time is the timestamp when the vote was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5 [json_name = "submitTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
     * @return Whether the submitTime field is set.
     */
    public fun hasSubmitTime(): kotlin.Boolean {
      return _builder.hasSubmitTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1.Types.Vote.copy(block: cosmos.group.v1.VoteKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Types.Vote =
  cosmos.group.v1.VoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.group.v1.Types.VoteOrBuilder.submitTimeOrNull: com.google.protobuf.Timestamp?
  get() = if (hasSubmitTime()) getSubmitTime() else null


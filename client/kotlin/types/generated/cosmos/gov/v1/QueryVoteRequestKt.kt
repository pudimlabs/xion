//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1/query.proto

package cosmos.gov.v1;

@kotlin.jvm.JvmName("-initializequeryVoteRequest")
public inline fun queryVoteRequest(block: cosmos.gov.v1.QueryVoteRequestKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.QueryOuterClass.QueryVoteRequest =
  cosmos.gov.v1.QueryVoteRequestKt.Dsl._create(cosmos.gov.v1.QueryOuterClass.QueryVoteRequest.newBuilder()).apply { block() }._build()
public object QueryVoteRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1.QueryOuterClass.QueryVoteRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1.QueryOuterClass.QueryVoteRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1.QueryOuterClass.QueryVoteRequest = _builder.build()

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
     * voter defines the voter address for the proposals.
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
     * voter defines the voter address for the proposals.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearVoter() {
      _builder.clearVoter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1.QueryOuterClass.QueryVoteRequest.copy(block: cosmos.gov.v1.QueryVoteRequestKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.QueryOuterClass.QueryVoteRequest =
  cosmos.gov.v1.QueryVoteRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


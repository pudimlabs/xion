//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1/query.proto

package cosmos.gov.v1;

@kotlin.jvm.JvmName("-initializequeryVotesRequest")
public inline fun queryVotesRequest(block: cosmos.gov.v1.QueryVotesRequestKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.QueryOuterClass.QueryVotesRequest =
  cosmos.gov.v1.QueryVotesRequestKt.Dsl._create(cosmos.gov.v1.QueryOuterClass.QueryVotesRequest.newBuilder()).apply { block() }._build()
public object QueryVotesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1.QueryOuterClass.QueryVotesRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1.QueryOuterClass.QueryVotesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1.QueryOuterClass.QueryVotesRequest = _builder.build()

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
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1.QueryOuterClass.QueryVotesRequest.copy(block: cosmos.gov.v1.QueryVotesRequestKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.QueryOuterClass.QueryVotesRequest =
  cosmos.gov.v1.QueryVotesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.gov.v1.QueryOuterClass.QueryVotesRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null


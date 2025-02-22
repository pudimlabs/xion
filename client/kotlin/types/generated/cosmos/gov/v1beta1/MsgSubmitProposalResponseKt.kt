//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/tx.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmName("-initializemsgSubmitProposalResponse")
public inline fun msgSubmitProposalResponse(block: cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse =
  cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl._create(cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.newBuilder()).apply { block() }._build()
public object MsgSubmitProposalResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse = _builder.build()

    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.jsontag) = "proposal_id", (.amino.dont_omitempty) = true];</code>
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
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.jsontag) = "proposal_id", (.amino.dont_omitempty) = true];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse.copy(block: cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Tx.MsgSubmitProposalResponse =
  cosmos.gov.v1beta1.MsgSubmitProposalResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


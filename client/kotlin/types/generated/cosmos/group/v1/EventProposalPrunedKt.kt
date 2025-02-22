//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1/events.proto

package cosmos.group.v1;

@kotlin.jvm.JvmName("-initializeeventProposalPruned")
public inline fun eventProposalPruned(block: cosmos.group.v1.EventProposalPrunedKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Events.EventProposalPruned =
  cosmos.group.v1.EventProposalPrunedKt.Dsl._create(cosmos.group.v1.Events.EventProposalPruned.newBuilder()).apply { block() }._build()
public object EventProposalPrunedKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1.Events.EventProposalPruned.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1.Events.EventProposalPruned.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1.Events.EventProposalPruned = _builder.build()

    /**
     * <pre>
     * proposal_id is the unique ID of the proposal.
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
     * proposal_id is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }

    /**
     * <pre>
     * status is the proposal status (UNSPECIFIED, SUBMITTED, ACCEPTED, REJECTED, ABORTED, WITHDRAWN).
     * </pre>
     *
     * <code>.cosmos.group.v1.ProposalStatus status = 2 [json_name = "status"];</code>
     */
    public var status: cosmos.group.v1.Types.ProposalStatus
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <pre>
     * status is the proposal status (UNSPECIFIED, SUBMITTED, ACCEPTED, REJECTED, ABORTED, WITHDRAWN).
     * </pre>
     *
     * <code>.cosmos.group.v1.ProposalStatus status = 2 [json_name = "status"];</code>
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }

    /**
     * <pre>
     * tally_result is the proposal tally result (when applicable).
     * </pre>
     *
     * <code>.cosmos.group.v1.TallyResult tally_result = 3 [json_name = "tallyResult"];</code>
     */
    public var tallyResult: cosmos.group.v1.Types.TallyResult
      @JvmName("getTallyResult")
      get() = _builder.getTallyResult()
      @JvmName("setTallyResult")
      set(value) {
        _builder.setTallyResult(value)
      }
    /**
     * <pre>
     * tally_result is the proposal tally result (when applicable).
     * </pre>
     *
     * <code>.cosmos.group.v1.TallyResult tally_result = 3 [json_name = "tallyResult"];</code>
     */
    public fun clearTallyResult() {
      _builder.clearTallyResult()
    }
    /**
     * <pre>
     * tally_result is the proposal tally result (when applicable).
     * </pre>
     *
     * <code>.cosmos.group.v1.TallyResult tally_result = 3 [json_name = "tallyResult"];</code>
     * @return Whether the tallyResult field is set.
     */
    public fun hasTallyResult(): kotlin.Boolean {
      return _builder.hasTallyResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1.Events.EventProposalPruned.copy(block: cosmos.group.v1.EventProposalPrunedKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Events.EventProposalPruned =
  cosmos.group.v1.EventProposalPrunedKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.group.v1.Events.EventProposalPrunedOrBuilder.tallyResultOrNull: cosmos.group.v1.Types.TallyResult?
  get() = if (hasTallyResult()) getTallyResult() else null


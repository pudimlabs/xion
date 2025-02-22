//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/upgrade.proto

package cosmos.upgrade.v1beta1;

@kotlin.jvm.JvmName("-initializesoftwareUpgradeProposal")
public inline fun softwareUpgradeProposal(block: cosmos.upgrade.v1beta1.SoftwareUpgradeProposalKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal =
  cosmos.upgrade.v1beta1.SoftwareUpgradeProposalKt.Dsl._create(cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal.newBuilder()).apply { block() }._build()
public object SoftwareUpgradeProposalKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal = _builder.build()

    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <pre>
     * title of the proposal
     * </pre>
     *
     * <code>string title = 1 [json_name = "title"];</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <pre>
     * description of the proposal
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var plan: cosmos.upgrade.v1beta1.Upgrade.Plan
      @JvmName("getPlan")
      get() = _builder.getPlan()
      @JvmName("setPlan")
      set(value) {
        _builder.setPlan(value)
      }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearPlan() {
      _builder.clearPlan()
    }
    /**
     * <pre>
     * plan of the proposal
     * </pre>
     *
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the plan field is set.
     */
    public fun hasPlan(): kotlin.Boolean {
      return _builder.hasPlan()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal.copy(block: cosmos.upgrade.v1beta1.SoftwareUpgradeProposalKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposal =
  cosmos.upgrade.v1beta1.SoftwareUpgradeProposalKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.upgrade.v1beta1.Upgrade.SoftwareUpgradeProposalOrBuilder.planOrNull: cosmos.upgrade.v1beta1.Upgrade.Plan?
  get() = if (hasPlan()) getPlan() else null


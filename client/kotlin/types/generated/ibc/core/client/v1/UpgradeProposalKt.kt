//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializeupgradeProposal")
public inline fun upgradeProposal(block: ibc.core.client.v1.UpgradeProposalKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Client.UpgradeProposal =
  ibc.core.client.v1.UpgradeProposalKt.Dsl._create(ibc.core.client.v1.Client.UpgradeProposal.newBuilder()).apply { block() }._build()
public object UpgradeProposalKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Client.UpgradeProposal.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Client.UpgradeProposal.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Client.UpgradeProposal = _builder.build()

    /**
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
     * <code>string title = 1 [json_name = "title"];</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
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
     * <code>string description = 2 [json_name = "description"];</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public var plan: cosmos.upgrade.v1beta1.Upgrade.Plan
      @JvmName("getPlan")
      get() = _builder.getPlan()
      @JvmName("setPlan")
      set(value) {
        _builder.setPlan(value)
      }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public fun clearPlan() {
      _builder.clearPlan()
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 3 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     * @return Whether the plan field is set.
     */
    public fun hasPlan(): kotlin.Boolean {
      return _builder.hasPlan()
    }

    /**
     * <pre>
     * An UpgradedClientState must be provided to perform an IBC breaking upgrade.
     * This will make the chain commit to the correct upgraded (self) client state
     * before the upgrade occurs, so that connecting chains can verify that the
     * new upgraded client is valid by verifying a proof on the previous version
     * of the chain. This will allow IBC connections to persist smoothly across
     * planned chain upgrades
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 4 [json_name = "upgradedClientState", (.gogoproto.moretags) = "yaml:&#92;"upgraded_client_state&#92;""];</code>
     */
    public var upgradedClientState: com.google.protobuf.Any
      @JvmName("getUpgradedClientState")
      get() = _builder.getUpgradedClientState()
      @JvmName("setUpgradedClientState")
      set(value) {
        _builder.setUpgradedClientState(value)
      }
    /**
     * <pre>
     * An UpgradedClientState must be provided to perform an IBC breaking upgrade.
     * This will make the chain commit to the correct upgraded (self) client state
     * before the upgrade occurs, so that connecting chains can verify that the
     * new upgraded client is valid by verifying a proof on the previous version
     * of the chain. This will allow IBC connections to persist smoothly across
     * planned chain upgrades
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 4 [json_name = "upgradedClientState", (.gogoproto.moretags) = "yaml:&#92;"upgraded_client_state&#92;""];</code>
     */
    public fun clearUpgradedClientState() {
      _builder.clearUpgradedClientState()
    }
    /**
     * <pre>
     * An UpgradedClientState must be provided to perform an IBC breaking upgrade.
     * This will make the chain commit to the correct upgraded (self) client state
     * before the upgrade occurs, so that connecting chains can verify that the
     * new upgraded client is valid by verifying a proof on the previous version
     * of the chain. This will allow IBC connections to persist smoothly across
     * planned chain upgrades
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 4 [json_name = "upgradedClientState", (.gogoproto.moretags) = "yaml:&#92;"upgraded_client_state&#92;""];</code>
     * @return Whether the upgradedClientState field is set.
     */
    public fun hasUpgradedClientState(): kotlin.Boolean {
      return _builder.hasUpgradedClientState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Client.UpgradeProposal.copy(block: ibc.core.client.v1.UpgradeProposalKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Client.UpgradeProposal =
  ibc.core.client.v1.UpgradeProposalKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.Client.UpgradeProposalOrBuilder.planOrNull: cosmos.upgrade.v1beta1.Upgrade.Plan?
  get() = if (hasPlan()) getPlan() else null

public val ibc.core.client.v1.Client.UpgradeProposalOrBuilder.upgradedClientStateOrNull: com.google.protobuf.Any?
  get() = if (hasUpgradedClientState()) getUpgradedClientState() else null


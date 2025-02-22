//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializemsgIBCSoftwareUpgrade")
public inline fun msgIBCSoftwareUpgrade(block: ibc.core.client.v1.MsgIBCSoftwareUpgradeKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade =
  ibc.core.client.v1.MsgIBCSoftwareUpgradeKt.Dsl._create(ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade.newBuilder()).apply { block() }._build()
public object MsgIBCSoftwareUpgradeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade = _builder.build()

    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public var plan: cosmos.upgrade.v1beta1.Upgrade.Plan
      @JvmName("getPlan")
      get() = _builder.getPlan()
      @JvmName("setPlan")
      set(value) {
        _builder.setPlan(value)
      }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
     */
    public fun clearPlan() {
      _builder.clearPlan()
    }
    /**
     * <code>.cosmos.upgrade.v1beta1.Plan plan = 1 [json_name = "plan", (.gogoproto.nullable) = false];</code>
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
     * planned chain upgrades. Correspondingly, the UpgradedClientState field has been
     * deprecated in the Cosmos SDK to allow for this logic to exist solely in
     * the 02-client module.
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 2 [json_name = "upgradedClientState"];</code>
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
     * planned chain upgrades. Correspondingly, the UpgradedClientState field has been
     * deprecated in the Cosmos SDK to allow for this logic to exist solely in
     * the 02-client module.
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 2 [json_name = "upgradedClientState"];</code>
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
     * planned chain upgrades. Correspondingly, the UpgradedClientState field has been
     * deprecated in the Cosmos SDK to allow for this logic to exist solely in
     * the 02-client module.
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 2 [json_name = "upgradedClientState"];</code>
     * @return Whether the upgradedClientState field is set.
     */
    public fun hasUpgradedClientState(): kotlin.Boolean {
      return _builder.hasUpgradedClientState()
    }

    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     */
    public var signer: kotlin.String
      @JvmName("getSigner")
      get() = _builder.getSigner()
      @JvmName("setSigner")
      set(value) {
        _builder.setSigner(value)
      }
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     */
    public fun clearSigner() {
      _builder.clearSigner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade.copy(block: ibc.core.client.v1.MsgIBCSoftwareUpgradeKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgIBCSoftwareUpgrade =
  ibc.core.client.v1.MsgIBCSoftwareUpgradeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeOrBuilder.planOrNull: cosmos.upgrade.v1beta1.Upgrade.Plan?
  get() = if (hasPlan()) getPlan() else null

public val ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeOrBuilder.upgradedClientStateOrNull: com.google.protobuf.Any?
  get() = if (hasUpgradedClientState()) getUpgradedClientState() else null


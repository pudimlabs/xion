//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializemsgChannelUpgradeTimeout")
public inline fun msgChannelUpgradeTimeout(block: ibc.core.channel.v1.MsgChannelUpgradeTimeoutKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout =
  ibc.core.channel.v1.MsgChannelUpgradeTimeoutKt.Dsl._create(ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout.newBuilder()).apply { block() }._build()
public object MsgChannelUpgradeTimeoutKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout = _builder.build()

    /**
     * <code>string port_id = 1 [json_name = "portId"];</code>
     */
    public var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <code>string port_id = 1 [json_name = "portId"];</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     */
    public var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
    }

    /**
     * <code>.ibc.core.channel.v1.Channel counterparty_channel = 3 [json_name = "counterpartyChannel", (.gogoproto.nullable) = false];</code>
     */
    public var counterpartyChannel: ibc.core.channel.v1.ChannelOuterClass.Channel
      @JvmName("getCounterpartyChannel")
      get() = _builder.getCounterpartyChannel()
      @JvmName("setCounterpartyChannel")
      set(value) {
        _builder.setCounterpartyChannel(value)
      }
    /**
     * <code>.ibc.core.channel.v1.Channel counterparty_channel = 3 [json_name = "counterpartyChannel", (.gogoproto.nullable) = false];</code>
     */
    public fun clearCounterpartyChannel() {
      _builder.clearCounterpartyChannel()
    }
    /**
     * <code>.ibc.core.channel.v1.Channel counterparty_channel = 3 [json_name = "counterpartyChannel", (.gogoproto.nullable) = false];</code>
     * @return Whether the counterpartyChannel field is set.
     */
    public fun hasCounterpartyChannel(): kotlin.Boolean {
      return _builder.hasCounterpartyChannel()
    }

    /**
     * <code>bytes proof_channel = 4 [json_name = "proofChannel"];</code>
     */
    public var proofChannel: com.google.protobuf.ByteString
      @JvmName("getProofChannel")
      get() = _builder.getProofChannel()
      @JvmName("setProofChannel")
      set(value) {
        _builder.setProofChannel(value)
      }
    /**
     * <code>bytes proof_channel = 4 [json_name = "proofChannel"];</code>
     */
    public fun clearProofChannel() {
      _builder.clearProofChannel()
    }

    /**
     * <code>.ibc.core.client.v1.Height proof_height = 5 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public var proofHeight: ibc.core.client.v1.Client.Height
      @JvmName("getProofHeight")
      get() = _builder.getProofHeight()
      @JvmName("setProofHeight")
      set(value) {
        _builder.setProofHeight(value)
      }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 5 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public fun clearProofHeight() {
      _builder.clearProofHeight()
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 5 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     * @return Whether the proofHeight field is set.
     */
    public fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }

    /**
     * <code>string signer = 6 [json_name = "signer"];</code>
     */
    public var signer: kotlin.String
      @JvmName("getSigner")
      get() = _builder.getSigner()
      @JvmName("setSigner")
      set(value) {
        _builder.setSigner(value)
      }
    /**
     * <code>string signer = 6 [json_name = "signer"];</code>
     */
    public fun clearSigner() {
      _builder.clearSigner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout.copy(block: ibc.core.channel.v1.MsgChannelUpgradeTimeoutKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeout =
  ibc.core.channel.v1.MsgChannelUpgradeTimeoutKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeoutOrBuilder.counterpartyChannelOrNull: ibc.core.channel.v1.ChannelOuterClass.Channel?
  get() = if (hasCounterpartyChannel()) getCounterpartyChannel() else null

public val ibc.core.channel.v1.Tx.MsgChannelUpgradeTimeoutOrBuilder.proofHeightOrNull: ibc.core.client.v1.Client.Height?
  get() = if (hasProofHeight()) getProofHeight() else null


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializemsgChannelUpgradeOpenResponse")
public inline fun msgChannelUpgradeOpenResponse(block: ibc.core.channel.v1.MsgChannelUpgradeOpenResponseKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse =
  ibc.core.channel.v1.MsgChannelUpgradeOpenResponseKt.Dsl._create(ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse.newBuilder()).apply { block() }._build()
public object MsgChannelUpgradeOpenResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse.copy(block: ibc.core.channel.v1.MsgChannelUpgradeOpenResponseKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelUpgradeOpenResponse =
  ibc.core.channel.v1.MsgChannelUpgradeOpenResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


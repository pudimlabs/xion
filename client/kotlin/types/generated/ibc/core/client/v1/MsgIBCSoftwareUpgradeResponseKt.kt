//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializemsgIBCSoftwareUpgradeResponse")
public inline fun msgIBCSoftwareUpgradeResponse(block: ibc.core.client.v1.MsgIBCSoftwareUpgradeResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse =
  ibc.core.client.v1.MsgIBCSoftwareUpgradeResponseKt.Dsl._create(ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse.newBuilder()).apply { block() }._build()
public object MsgIBCSoftwareUpgradeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse.copy(block: ibc.core.client.v1.MsgIBCSoftwareUpgradeResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgIBCSoftwareUpgradeResponse =
  ibc.core.client.v1.MsgIBCSoftwareUpgradeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


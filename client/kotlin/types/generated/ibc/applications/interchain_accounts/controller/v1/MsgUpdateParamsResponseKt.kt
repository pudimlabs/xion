//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/controller/v1/tx.proto

package ibc.applications.interchain_accounts.controller.v1;

@kotlin.jvm.JvmName("-initializemsgUpdateParamsResponse")
public inline fun msgUpdateParamsResponse(block: ibc.applications.interchain_accounts.controller.v1.MsgUpdateParamsResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse =
  ibc.applications.interchain_accounts.controller.v1.MsgUpdateParamsResponseKt.Dsl._create(ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse.newBuilder()).apply { block() }._build()
public object MsgUpdateParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse.copy(block: ibc.applications.interchain_accounts.controller.v1.MsgUpdateParamsResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.Tx.MsgUpdateParamsResponse =
  ibc.applications.interchain_accounts.controller.v1.MsgUpdateParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


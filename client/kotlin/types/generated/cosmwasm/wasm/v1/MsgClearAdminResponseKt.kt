//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmName("-initializemsgClearAdminResponse")
public inline fun msgClearAdminResponse(block: cosmwasm.wasm.v1.MsgClearAdminResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgClearAdminResponse =
  cosmwasm.wasm.v1.MsgClearAdminResponseKt.Dsl._create(cosmwasm.wasm.v1.Tx.MsgClearAdminResponse.newBuilder()).apply { block() }._build()
public object MsgClearAdminResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Tx.MsgClearAdminResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Tx.MsgClearAdminResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Tx.MsgClearAdminResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Tx.MsgClearAdminResponse.copy(block: cosmwasm.wasm.v1.MsgClearAdminResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgClearAdminResponse =
  cosmwasm.wasm.v1.MsgClearAdminResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


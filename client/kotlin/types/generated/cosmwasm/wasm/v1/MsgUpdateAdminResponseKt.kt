//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmName("-initializemsgUpdateAdminResponse")
public inline fun msgUpdateAdminResponse(block: cosmwasm.wasm.v1.MsgUpdateAdminResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse =
  cosmwasm.wasm.v1.MsgUpdateAdminResponseKt.Dsl._create(cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse.newBuilder()).apply { block() }._build()
public object MsgUpdateAdminResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse.copy(block: cosmwasm.wasm.v1.MsgUpdateAdminResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgUpdateAdminResponse =
  cosmwasm.wasm.v1.MsgUpdateAdminResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


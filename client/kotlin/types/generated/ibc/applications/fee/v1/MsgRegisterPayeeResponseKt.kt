//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/tx.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmName("-initializemsgRegisterPayeeResponse")
public inline fun msgRegisterPayeeResponse(block: ibc.applications.fee.v1.MsgRegisterPayeeResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse =
  ibc.applications.fee.v1.MsgRegisterPayeeResponseKt.Dsl._create(ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse.newBuilder()).apply { block() }._build()
public object MsgRegisterPayeeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse.copy(block: ibc.applications.fee.v1.MsgRegisterPayeeResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse =
  ibc.applications.fee.v1.MsgRegisterPayeeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/tx.proto

package cosmos.feegrant.v1beta1;

@kotlin.jvm.JvmName("-initializemsgRevokeAllowanceResponse")
public inline fun msgRevokeAllowanceResponse(block: cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse =
  cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponseKt.Dsl._create(cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse.newBuilder()).apply { block() }._build()
public object MsgRevokeAllowanceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse.copy(block: cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.Tx.MsgRevokeAllowanceResponse =
  cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/tx.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmName("-initializemsgUpdateParamsResponse")
public inline fun msgUpdateParamsResponse(block: cosmos.auth.v1beta1.MsgUpdateParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse =
  cosmos.auth.v1beta1.MsgUpdateParamsResponseKt.Dsl._create(cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse.newBuilder()).apply { block() }._build()
public object MsgUpdateParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse.copy(block: cosmos.auth.v1beta1.MsgUpdateParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.Tx.MsgUpdateParamsResponse =
  cosmos.auth.v1beta1.MsgUpdateParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/consensus/v1/tx.proto

package cosmos.consensus.v1;

@kotlin.jvm.JvmName("-initializemsgUpdateParamsResponse")
public inline fun msgUpdateParamsResponse(block: cosmos.consensus.v1.MsgUpdateParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.consensus.v1.Tx.MsgUpdateParamsResponse =
  cosmos.consensus.v1.MsgUpdateParamsResponseKt.Dsl._create(cosmos.consensus.v1.Tx.MsgUpdateParamsResponse.newBuilder()).apply { block() }._build()
public object MsgUpdateParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.consensus.v1.Tx.MsgUpdateParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.consensus.v1.Tx.MsgUpdateParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.consensus.v1.Tx.MsgUpdateParamsResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.consensus.v1.Tx.MsgUpdateParamsResponse.copy(block: cosmos.consensus.v1.MsgUpdateParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.consensus.v1.Tx.MsgUpdateParamsResponse =
  cosmos.consensus.v1.MsgUpdateParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


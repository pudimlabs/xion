//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmName("-initializemsgCommunityPoolSpendResponse")
public inline fun msgCommunityPoolSpendResponse(block: cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse =
  cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponseKt.Dsl._create(cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse.newBuilder()).apply { block() }._build()
public object MsgCommunityPoolSpendResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse.copy(block: cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgCommunityPoolSpendResponse =
  cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


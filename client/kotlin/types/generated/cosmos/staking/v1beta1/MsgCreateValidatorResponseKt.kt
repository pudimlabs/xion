//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmName("-initializemsgCreateValidatorResponse")
public inline fun msgCreateValidatorResponse(block: cosmos.staking.v1beta1.MsgCreateValidatorResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse =
  cosmos.staking.v1beta1.MsgCreateValidatorResponseKt.Dsl._create(cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse.newBuilder()).apply { block() }._build()
public object MsgCreateValidatorResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse.copy(block: cosmos.staking.v1beta1.MsgCreateValidatorResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse =
  cosmos.staking.v1beta1.MsgCreateValidatorResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


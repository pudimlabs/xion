//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1/tx.proto

package cosmos.group.v1;

@kotlin.jvm.JvmName("-initializemsgLeaveGroupResponse")
public inline fun msgLeaveGroupResponse(block: cosmos.group.v1.MsgLeaveGroupResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Tx.MsgLeaveGroupResponse =
  cosmos.group.v1.MsgLeaveGroupResponseKt.Dsl._create(cosmos.group.v1.Tx.MsgLeaveGroupResponse.newBuilder()).apply { block() }._build()
public object MsgLeaveGroupResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1.Tx.MsgLeaveGroupResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1.Tx.MsgLeaveGroupResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1.Tx.MsgLeaveGroupResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1.Tx.MsgLeaveGroupResponse.copy(block: cosmos.group.v1.MsgLeaveGroupResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Tx.MsgLeaveGroupResponse =
  cosmos.group.v1.MsgLeaveGroupResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


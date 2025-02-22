//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1/tx.proto

package cosmos.group.v1;

@kotlin.jvm.JvmName("-initializemsgExecResponse")
public inline fun msgExecResponse(block: cosmos.group.v1.MsgExecResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Tx.MsgExecResponse =
  cosmos.group.v1.MsgExecResponseKt.Dsl._create(cosmos.group.v1.Tx.MsgExecResponse.newBuilder()).apply { block() }._build()
public object MsgExecResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1.Tx.MsgExecResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1.Tx.MsgExecResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1.Tx.MsgExecResponse = _builder.build()

    /**
     * <pre>
     * result is the final result of the proposal execution.
     * </pre>
     *
     * <code>.cosmos.group.v1.ProposalExecutorResult result = 2 [json_name = "result"];</code>
     */
    public var result: cosmos.group.v1.Types.ProposalExecutorResult
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <pre>
     * result is the final result of the proposal execution.
     * </pre>
     *
     * <code>.cosmos.group.v1.ProposalExecutorResult result = 2 [json_name = "result"];</code>
     */
    public fun clearResult() {
      _builder.clearResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1.Tx.MsgExecResponse.copy(block: cosmos.group.v1.MsgExecResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.Tx.MsgExecResponse =
  cosmos.group.v1.MsgExecResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package ibc.applications.transfer.v1;

@kotlin.jvm.JvmName("-initializequeryDenomTraceRequest")
public inline fun queryDenomTraceRequest(block: ibc.applications.transfer.v1.QueryDenomTraceRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest =
  ibc.applications.transfer.v1.QueryDenomTraceRequestKt.Dsl._create(ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest.newBuilder()).apply { block() }._build()
public object QueryDenomTraceRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest = _builder.build()

    /**
     * <pre>
     * hash (in hex format) or denom (full denom with ibc prefix) of the denomination trace information.
     * </pre>
     *
     * <code>string hash = 1 [json_name = "hash"];</code>
     */
    public var hash: kotlin.String
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <pre>
     * hash (in hex format) or denom (full denom with ibc prefix) of the denomination trace information.
     * </pre>
     *
     * <code>string hash = 1 [json_name = "hash"];</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest.copy(block: ibc.applications.transfer.v1.QueryDenomTraceRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTraceRequest =
  ibc.applications.transfer.v1.QueryDenomTraceRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


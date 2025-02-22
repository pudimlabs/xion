//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmName("-initializequeryConnectionRequest")
public inline fun queryConnectionRequest(block: ibc.core.connection.v1.QueryConnectionRequestKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest =
  ibc.core.connection.v1.QueryConnectionRequestKt.Dsl._create(ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest.newBuilder()).apply { block() }._build()
public object QueryConnectionRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest = _builder.build()

    /**
     * <pre>
     * connection unique identifier
     * </pre>
     *
     * <code>string connection_id = 1 [json_name = "connectionId"];</code>
     */
    public var connectionId: kotlin.String
      @JvmName("getConnectionId")
      get() = _builder.getConnectionId()
      @JvmName("setConnectionId")
      set(value) {
        _builder.setConnectionId(value)
      }
    /**
     * <pre>
     * connection unique identifier
     * </pre>
     *
     * <code>string connection_id = 1 [json_name = "connectionId"];</code>
     */
    public fun clearConnectionId() {
      _builder.clearConnectionId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest.copy(block: ibc.core.connection.v1.QueryConnectionRequestKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.QueryOuterClass.QueryConnectionRequest =
  ibc.core.connection.v1.QueryConnectionRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


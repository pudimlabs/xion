//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmName("-initializequeryFeeEnabledChannelRequest")
public inline fun queryFeeEnabledChannelRequest(block: ibc.applications.fee.v1.QueryFeeEnabledChannelRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest =
  ibc.applications.fee.v1.QueryFeeEnabledChannelRequestKt.Dsl._create(ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest.newBuilder()).apply { block() }._build()
public object QueryFeeEnabledChannelRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest = _builder.build()

    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     */
    public var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     */
    public var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest.copy(block: ibc.applications.fee.v1.QueryFeeEnabledChannelRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelRequest =
  ibc.applications.fee.v1.QueryFeeEnabledChannelRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


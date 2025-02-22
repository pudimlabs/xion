//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializequeryChannelConsensusStateRequest")
public inline fun queryChannelConsensusStateRequest(block: ibc.core.channel.v1.QueryChannelConsensusStateRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest =
  ibc.core.channel.v1.QueryChannelConsensusStateRequestKt.Dsl._create(ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest.newBuilder()).apply { block() }._build()
public object QueryChannelConsensusStateRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest = _builder.build()

    /**
     * <pre>
     * port unique identifier
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
     * port unique identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <pre>
     * channel unique identifier
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
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
    }

    /**
     * <pre>
     * revision number of the consensus state
     * </pre>
     *
     * <code>uint64 revision_number = 3 [json_name = "revisionNumber"];</code>
     */
    public var revisionNumber: kotlin.Long
      @JvmName("getRevisionNumber")
      get() = _builder.getRevisionNumber()
      @JvmName("setRevisionNumber")
      set(value) {
        _builder.setRevisionNumber(value)
      }
    /**
     * <pre>
     * revision number of the consensus state
     * </pre>
     *
     * <code>uint64 revision_number = 3 [json_name = "revisionNumber"];</code>
     */
    public fun clearRevisionNumber() {
      _builder.clearRevisionNumber()
    }

    /**
     * <pre>
     * revision height of the consensus state
     * </pre>
     *
     * <code>uint64 revision_height = 4 [json_name = "revisionHeight"];</code>
     */
    public var revisionHeight: kotlin.Long
      @JvmName("getRevisionHeight")
      get() = _builder.getRevisionHeight()
      @JvmName("setRevisionHeight")
      set(value) {
        _builder.setRevisionHeight(value)
      }
    /**
     * <pre>
     * revision height of the consensus state
     * </pre>
     *
     * <code>uint64 revision_height = 4 [json_name = "revisionHeight"];</code>
     */
    public fun clearRevisionHeight() {
      _builder.clearRevisionHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest.copy(block: ibc.core.channel.v1.QueryChannelConsensusStateRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryChannelConsensusStateRequest =
  ibc.core.channel.v1.QueryChannelConsensusStateRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


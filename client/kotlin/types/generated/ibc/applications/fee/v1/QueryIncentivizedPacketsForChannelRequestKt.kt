//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmName("-initializequeryIncentivizedPacketsForChannelRequest")
public inline fun queryIncentivizedPacketsForChannelRequest(block: ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest =
  ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequestKt.Dsl._create(ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest.newBuilder()).apply { block() }._build()
public object QueryIncentivizedPacketsForChannelRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest = _builder.build()

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }

    /**
     * <code>string port_id = 2 [json_name = "portId"];</code>
     */
    public var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <code>string port_id = 2 [json_name = "portId"];</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <code>string channel_id = 3 [json_name = "channelId"];</code>
     */
    public var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <code>string channel_id = 3 [json_name = "channelId"];</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
    }

    /**
     * <pre>
     * Height to query at
     * </pre>
     *
     * <code>uint64 query_height = 4 [json_name = "queryHeight"];</code>
     */
    public var queryHeight: kotlin.Long
      @JvmName("getQueryHeight")
      get() = _builder.getQueryHeight()
      @JvmName("setQueryHeight")
      set(value) {
        _builder.setQueryHeight(value)
      }
    /**
     * <pre>
     * Height to query at
     * </pre>
     *
     * <code>uint64 query_height = 4 [json_name = "queryHeight"];</code>
     */
    public fun clearQueryHeight() {
      _builder.clearQueryHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest.copy(block: ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequest =
  ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketsForChannelRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null


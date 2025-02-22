//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmName("-initializegetTxsEventRequest")
public inline fun getTxsEventRequest(block: cosmos.tx.v1beta1.GetTxsEventRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest =
  cosmos.tx.v1beta1.GetTxsEventRequestKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest.newBuilder()).apply { block() }._build()
public object GetTxsEventRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EventsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     * @return A list containing the events.
     */
    @kotlin.Deprecated(message = "Field events is deprecated") public val events: com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEventsList()
      )
    /**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvents")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>.add(value: kotlin.String) {
      _builder.addEvents(value)
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvents")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllEvents(values)
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     * @param index The index to set the value at.
     * @param value The events to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvents")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setEvents(index, value)
    }/**
     * <pre>
     * events is the list of transaction event type.
     * Deprecated post v0.47.x: use query instead, which should contain a valid
     * events query.
     * </pre>
     *
     * <code>repeated string events = 1 [json_name = "events", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.events is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=86
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvents")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, EventsProxy>.clear() {
      _builder.clearEvents()
    }
    /**
     * <pre>
     * pagination defines a pagination for the request.
     * Deprecated post v0.46.x: use page and limit instead.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination", deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field pagination is deprecated") public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines a pagination for the request.
     * Deprecated post v0.46.x: use page and limit instead.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.pagination is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=90
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines a pagination for the request.
     * Deprecated post v0.46.x: use page and limit instead.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination", deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.GetTxsEventRequest.pagination is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=90
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }

    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3 [json_name = "orderBy"];</code>
     */
    public var orderBy: cosmos.tx.v1beta1.ServiceOuterClass.OrderBy
      @JvmName("getOrderBy")
      get() = _builder.getOrderBy()
      @JvmName("setOrderBy")
      set(value) {
        _builder.setOrderBy(value)
      }
    /**
     * <code>.cosmos.tx.v1beta1.OrderBy order_by = 3 [json_name = "orderBy"];</code>
     */
    public fun clearOrderBy() {
      _builder.clearOrderBy()
    }

    /**
     * <pre>
     * page is the page number to query, starts at 1. If not provided, will
     * default to first page.
     * </pre>
     *
     * <code>uint64 page = 4 [json_name = "page"];</code>
     */
    public var page: kotlin.Long
      @JvmName("getPage")
      get() = _builder.getPage()
      @JvmName("setPage")
      set(value) {
        _builder.setPage(value)
      }
    /**
     * <pre>
     * page is the page number to query, starts at 1. If not provided, will
     * default to first page.
     * </pre>
     *
     * <code>uint64 page = 4 [json_name = "page"];</code>
     */
    public fun clearPage() {
      _builder.clearPage()
    }

    /**
     * <pre>
     * limit is the total number of results to be returned in the result page.
     * If left empty it will default to a value to be set by each app.
     * </pre>
     *
     * <code>uint64 limit = 5 [json_name = "limit"];</code>
     */
    public var limit: kotlin.Long
      @JvmName("getLimit")
      get() = _builder.getLimit()
      @JvmName("setLimit")
      set(value) {
        _builder.setLimit(value)
      }
    /**
     * <pre>
     * limit is the total number of results to be returned in the result page.
     * If left empty it will default to a value to be set by each app.
     * </pre>
     *
     * <code>uint64 limit = 5 [json_name = "limit"];</code>
     */
    public fun clearLimit() {
      _builder.clearLimit()
    }

    /**
     * <pre>
     * query defines the transaction event query that is proxied to Tendermint's
     * TxSearch RPC method. The query must be valid.
     * Since cosmos-sdk 0.50
     * </pre>
     *
     * <code>string query = 6 [json_name = "query"];</code>
     */
    public var query: kotlin.String
      @JvmName("getQuery")
      get() = _builder.getQuery()
      @JvmName("setQuery")
      set(value) {
        _builder.setQuery(value)
      }
    /**
     * <pre>
     * query defines the transaction event query that is proxied to Tendermint's
     * TxSearch RPC method. The query must be valid.
     * Since cosmos-sdk 0.50
     * </pre>
     *
     * <code>string query = 6 [json_name = "query"];</code>
     */
    public fun clearQuery() {
      _builder.clearQuery()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest.copy(block: cosmos.tx.v1beta1.GetTxsEventRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequest =
  cosmos.tx.v1beta1.GetTxsEventRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null


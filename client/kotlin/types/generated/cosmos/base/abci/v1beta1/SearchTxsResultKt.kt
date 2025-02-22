//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

@kotlin.jvm.JvmName("-initializesearchTxsResult")
public inline fun searchTxsResult(block: cosmos.base.abci.v1beta1.SearchTxsResultKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.SearchTxsResult =
  cosmos.base.abci.v1beta1.SearchTxsResultKt.Dsl._create(cosmos.base.abci.v1beta1.Abci.SearchTxsResult.newBuilder()).apply { block() }._build()
public object SearchTxsResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.abci.v1beta1.Abci.SearchTxsResult.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.abci.v1beta1.Abci.SearchTxsResult.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.abci.v1beta1.Abci.SearchTxsResult = _builder.build()

    /**
     * <pre>
     * Count of all txs
     * </pre>
     *
     * <code>uint64 total_count = 1 [json_name = "totalCount"];</code>
     */
    public var totalCount: kotlin.Long
      @JvmName("getTotalCount")
      get() = _builder.getTotalCount()
      @JvmName("setTotalCount")
      set(value) {
        _builder.setTotalCount(value)
      }
    /**
     * <pre>
     * Count of all txs
     * </pre>
     *
     * <code>uint64 total_count = 1 [json_name = "totalCount"];</code>
     */
    public fun clearTotalCount() {
      _builder.clearTotalCount()
    }

    /**
     * <pre>
     * Count of txs in current page
     * </pre>
     *
     * <code>uint64 count = 2 [json_name = "count"];</code>
     */
    public var count: kotlin.Long
      @JvmName("getCount")
      get() = _builder.getCount()
      @JvmName("setCount")
      set(value) {
        _builder.setCount(value)
      }
    /**
     * <pre>
     * Count of txs in current page
     * </pre>
     *
     * <code>uint64 count = 2 [json_name = "count"];</code>
     */
    public fun clearCount() {
      _builder.clearCount()
    }

    /**
     * <pre>
     * Index of current page, start from 1
     * </pre>
     *
     * <code>uint64 page_number = 3 [json_name = "pageNumber"];</code>
     */
    public var pageNumber: kotlin.Long
      @JvmName("getPageNumber")
      get() = _builder.getPageNumber()
      @JvmName("setPageNumber")
      set(value) {
        _builder.setPageNumber(value)
      }
    /**
     * <pre>
     * Index of current page, start from 1
     * </pre>
     *
     * <code>uint64 page_number = 3 [json_name = "pageNumber"];</code>
     */
    public fun clearPageNumber() {
      _builder.clearPageNumber()
    }

    /**
     * <pre>
     * Count of total pages
     * </pre>
     *
     * <code>uint64 page_total = 4 [json_name = "pageTotal"];</code>
     */
    public var pageTotal: kotlin.Long
      @JvmName("getPageTotal")
      get() = _builder.getPageTotal()
      @JvmName("setPageTotal")
      set(value) {
        _builder.setPageTotal(value)
      }
    /**
     * <pre>
     * Count of total pages
     * </pre>
     *
     * <code>uint64 page_total = 4 [json_name = "pageTotal"];</code>
     */
    public fun clearPageTotal() {
      _builder.clearPageTotal()
    }

    /**
     * <pre>
     * Max count txs per page
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
     * Max count txs per page
     * </pre>
     *
     * <code>uint64 limit = 5 [json_name = "limit"];</code>
     */
    public fun clearLimit() {
      _builder.clearLimit()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TxsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     */
     public val txs: com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTxsList()
      )
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTxs")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>.add(value: cosmos.base.abci.v1beta1.Abci.TxResponse) {
      _builder.addTxs(value)
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTxs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>.plusAssign(value: cosmos.base.abci.v1beta1.Abci.TxResponse) {
      add(value)
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTxs")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.abci.v1beta1.Abci.TxResponse>) {
      _builder.addAllTxs(values)
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTxs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.abci.v1beta1.Abci.TxResponse>) {
      addAll(values)
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     * @param index The index to set the value at.
     * @param value The txs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTxs")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>.set(index: kotlin.Int, value: cosmos.base.abci.v1beta1.Abci.TxResponse) {
      _builder.setTxs(index, value)
    }
    /**
     * <pre>
     * List of txs in current page
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse txs = 6 [json_name = "txs"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTxs")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxsProxy>.clear() {
      _builder.clearTxs()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.abci.v1beta1.Abci.SearchTxsResult.copy(block: cosmos.base.abci.v1beta1.SearchTxsResultKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.SearchTxsResult =
  cosmos.base.abci.v1beta1.SearchTxsResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()


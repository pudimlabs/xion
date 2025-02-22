//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/circuit/v1/query.proto

package cosmos.circuit.v1;

@kotlin.jvm.JvmName("-initializequeryAccountsRequest")
public inline fun queryAccountsRequest(block: cosmos.circuit.v1.QueryAccountsRequestKt.Dsl.() -> kotlin.Unit): cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest =
  cosmos.circuit.v1.QueryAccountsRequestKt.Dsl._create(cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest.newBuilder()).apply { block() }._build()
public object QueryAccountsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest = _builder.build()

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
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest.copy(block: cosmos.circuit.v1.QueryAccountsRequestKt.Dsl.() -> kotlin.Unit): cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequest =
  cosmos.circuit.v1.QueryAccountsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.circuit.v1.QueryOuterClass.QueryAccountsRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null


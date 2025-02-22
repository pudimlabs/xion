//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/wasm/v1/query.proto

package ibc.lightclients.wasm.v1;

@kotlin.jvm.JvmName("-initializequeryChecksumsRequest")
public inline fun queryChecksumsRequest(block: ibc.lightclients.wasm.v1.QueryChecksumsRequestKt.Dsl.() -> kotlin.Unit): ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest =
  ibc.lightclients.wasm.v1.QueryChecksumsRequestKt.Dsl._create(ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest.newBuilder()).apply { block() }._build()
public object QueryChecksumsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest = _builder.build()

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
public inline fun ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest.copy(block: ibc.lightclients.wasm.v1.QueryChecksumsRequestKt.Dsl.() -> kotlin.Unit): ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequest =
  ibc.lightclients.wasm.v1.QueryChecksumsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.lightclients.wasm.v1.QueryOuterClass.QueryChecksumsRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null


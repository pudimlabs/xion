//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package cosmos.group.v1;

@kotlin.jvm.JvmName("-initializequeryGroupMembersRequest")
public inline fun queryGroupMembersRequest(block: cosmos.group.v1.QueryGroupMembersRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest =
  cosmos.group.v1.QueryGroupMembersRequestKt.Dsl._create(cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest.newBuilder()).apply { block() }._build()
public object QueryGroupMembersRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest = _builder.build()

    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     */
    public var groupId: kotlin.Long
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest.copy(block: cosmos.group.v1.QueryGroupMembersRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequest =
  cosmos.group.v1.QueryGroupMembersRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.group.v1.QueryOuterClass.QueryGroupMembersRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null


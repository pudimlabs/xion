//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package cosmos.group.v1;

@kotlin.jvm.JvmName("-initializequeryGroupsResponse")
public inline fun queryGroupsResponse(block: cosmos.group.v1.QueryGroupsResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.QueryOuterClass.QueryGroupsResponse =
  cosmos.group.v1.QueryGroupsResponseKt.Dsl._create(cosmos.group.v1.QueryOuterClass.QueryGroupsResponse.newBuilder()).apply { block() }._build()
public object QueryGroupsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1.QueryOuterClass.QueryGroupsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1.QueryOuterClass.QueryGroupsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1.QueryOuterClass.QueryGroupsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class GroupsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     */
     public val groups: com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getGroupsList()
      )
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     * @param value The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addGroups")
    public fun com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>.add(value: cosmos.group.v1.Types.GroupInfo) {
      _builder.addGroups(value)
    }
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     * @param value The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignGroups")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>.plusAssign(value: cosmos.group.v1.Types.GroupInfo) {
      add(value)
    }
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     * @param values The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllGroups")
    public fun com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.group.v1.Types.GroupInfo>) {
      _builder.addAllGroups(values)
    }
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     * @param values The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllGroups")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.group.v1.Types.GroupInfo>) {
      addAll(values)
    }
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     * @param index The index to set the value at.
     * @param value The groups to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setGroups")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>.set(index: kotlin.Int, value: cosmos.group.v1.Types.GroupInfo) {
      _builder.setGroups(index, value)
    }
    /**
     * <pre>
     * `groups` is all the groups present in state.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearGroups")
    public fun com.google.protobuf.kotlin.DslList<cosmos.group.v1.Types.GroupInfo, GroupsProxy>.clear() {
      _builder.clearGroups()
    }


    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1.QueryOuterClass.QueryGroupsResponse.copy(block: cosmos.group.v1.QueryGroupsResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1.QueryOuterClass.QueryGroupsResponse =
  cosmos.group.v1.QueryGroupsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.group.v1.QueryOuterClass.QueryGroupsResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null


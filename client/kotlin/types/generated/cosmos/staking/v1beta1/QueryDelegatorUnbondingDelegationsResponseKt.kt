//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmName("-initializequeryDelegatorUnbondingDelegationsResponse")
public inline fun queryDelegatorUnbondingDelegationsResponse(block: cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse =
  cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.newBuilder()).apply { block() }._build()
public object QueryDelegatorUnbondingDelegationsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UnbondingResponsesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
     public val unbondingResponses: com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUnbondingResponsesList()
      )
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The unbondingResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUnbondingResponses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>.add(value: cosmos.staking.v1beta1.Staking.UnbondingDelegation) {
      _builder.addUnbondingResponses(value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The unbondingResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUnbondingResponses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>.plusAssign(value: cosmos.staking.v1beta1.Staking.UnbondingDelegation) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The unbondingResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUnbondingResponses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.UnbondingDelegation>) {
      _builder.addAllUnbondingResponses(values)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The unbondingResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUnbondingResponses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.UnbondingDelegation>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The unbondingResponses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUnbondingResponses")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>.set(index: kotlin.Int, value: cosmos.staking.v1beta1.Staking.UnbondingDelegation) {
      _builder.setUnbondingResponses(index, value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUnbondingResponses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.UnbondingDelegation, UnbondingResponsesProxy>.clear() {
      _builder.clearUnbondingResponses()
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
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse.copy(block: cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse =
  cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorUnbondingDelegationsResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null


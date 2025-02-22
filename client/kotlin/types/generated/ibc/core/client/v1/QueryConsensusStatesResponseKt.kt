//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializequeryConsensusStatesResponse")
public inline fun queryConsensusStatesResponse(block: ibc.core.client.v1.QueryConsensusStatesResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse =
  ibc.core.client.v1.QueryConsensusStatesResponseKt.Dsl._create(ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse.newBuilder()).apply { block() }._build()
public object QueryConsensusStatesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ConsensusStatesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     */
     public val consensusStates: com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getConsensusStatesList()
      )
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     * @param value The consensusStates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addConsensusStates")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>.add(value: ibc.core.client.v1.Client.ConsensusStateWithHeight) {
      _builder.addConsensusStates(value)
    }
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     * @param value The consensusStates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignConsensusStates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>.plusAssign(value: ibc.core.client.v1.Client.ConsensusStateWithHeight) {
      add(value)
    }
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     * @param values The consensusStates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllConsensusStates")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>.addAll(values: kotlin.collections.Iterable<ibc.core.client.v1.Client.ConsensusStateWithHeight>) {
      _builder.addAllConsensusStates(values)
    }
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     * @param values The consensusStates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllConsensusStates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.core.client.v1.Client.ConsensusStateWithHeight>) {
      addAll(values)
    }
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The consensusStates to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setConsensusStates")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>.set(index: kotlin.Int, value: ibc.core.client.v1.Client.ConsensusStateWithHeight) {
      _builder.setConsensusStates(index, value)
    }
    /**
     * <pre>
     * consensus states associated with the identifier
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearConsensusStates")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ConsensusStateWithHeight, ConsensusStatesProxy>.clear() {
      _builder.clearConsensusStates()
    }


    /**
     * <pre>
     * pagination response
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
     * pagination response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination response
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
public inline fun ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse.copy(block: ibc.core.client.v1.QueryConsensusStatesResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse =
  ibc.core.client.v1.QueryConsensusStatesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null


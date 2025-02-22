//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmName("-initializequeryContractsByCodeResponse")
public inline fun queryContractsByCodeResponse(block: cosmwasm.wasm.v1.QueryContractsByCodeResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse =
  cosmwasm.wasm.v1.QueryContractsByCodeResponseKt.Dsl._create(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.newBuilder()).apply { block() }._build()
public object QueryContractsByCodeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ContractsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return A list containing the contracts.
     */
    public val contracts: com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getContractsList()
      )
    /**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The contracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addContracts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>.add(value: kotlin.String) {
      _builder.addContracts(value)
    }
    /**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The contracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignContracts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param values The contracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllContracts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllContracts(values)
    }
    /**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param values The contracts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllContracts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param index The index to set the value at.
     * @param value The contracts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setContracts")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setContracts(index, value)
    }/**
     * <pre>
     * contracts are a set of contract addresses
     * </pre>
     *
     * <code>repeated string contracts = 1 [json_name = "contracts", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearContracts")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ContractsProxy>.clear() {
      _builder.clearContracts()
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
public inline fun cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.copy(block: cosmwasm.wasm.v1.QueryContractsByCodeResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse =
  cosmwasm.wasm.v1.QueryContractsByCodeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null


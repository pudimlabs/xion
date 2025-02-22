//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmName("-initializequeryContractInfoRequest")
public inline fun queryContractInfoRequest(block: cosmwasm.wasm.v1.QueryContractInfoRequestKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest =
  cosmwasm.wasm.v1.QueryContractInfoRequestKt.Dsl._create(cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.newBuilder()).apply { block() }._build()
public object QueryContractInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest = _builder.build()

    /**
     * <pre>
     * address is the address of the contract to query
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * address is the address of the contract to query
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.copy(block: cosmwasm.wasm.v1.QueryContractInfoRequestKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest =
  cosmwasm.wasm.v1.QueryContractInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


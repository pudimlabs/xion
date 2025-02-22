//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmName("-initializequeryDelegatorWithdrawAddressResponse")
public inline fun queryDelegatorWithdrawAddressResponse(block: cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse =
  cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponseKt.Dsl._create(cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse.newBuilder()).apply { block() }._build()
public object QueryDelegatorWithdrawAddressResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse = _builder.build()

    /**
     * <pre>
     * withdraw_address defines the delegator address to query for.
     * </pre>
     *
     * <code>string withdraw_address = 1 [json_name = "withdrawAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var withdrawAddress: kotlin.String
      @JvmName("getWithdrawAddress")
      get() = _builder.getWithdrawAddress()
      @JvmName("setWithdrawAddress")
      set(value) {
        _builder.setWithdrawAddress(value)
      }
    /**
     * <pre>
     * withdraw_address defines the delegator address to query for.
     * </pre>
     *
     * <code>string withdraw_address = 1 [json_name = "withdrawAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearWithdrawAddress() {
      _builder.clearWithdrawAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse.copy(block: cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressResponse =
  cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


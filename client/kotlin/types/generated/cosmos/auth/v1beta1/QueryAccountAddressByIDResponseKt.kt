//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAccountAddressByIDResponse")
public inline fun queryAccountAddressByIDResponse(block: cosmos.auth.v1beta1.QueryAccountAddressByIDResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse =
  cosmos.auth.v1beta1.QueryAccountAddressByIDResponseKt.Dsl._create(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse.newBuilder()).apply { block() }._build()
public object QueryAccountAddressByIDResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse = _builder.build()

    /**
     * <code>string account_address = 1 [json_name = "accountAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var accountAddress: kotlin.String
      @JvmName("getAccountAddress")
      get() = _builder.getAccountAddress()
      @JvmName("setAccountAddress")
      set(value) {
        _builder.setAccountAddress(value)
      }
    /**
     * <code>string account_address = 1 [json_name = "accountAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAccountAddress() {
      _builder.clearAccountAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse.copy(block: cosmos.auth.v1beta1.QueryAccountAddressByIDResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.QueryAccountAddressByIDResponse =
  cosmos.auth.v1beta1.QueryAccountAddressByIDResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


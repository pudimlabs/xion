//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/query.proto

package cosmos.upgrade.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAuthorityResponse")
public inline fun queryAuthorityResponse(block: cosmos.upgrade.v1beta1.QueryAuthorityResponseKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse =
  cosmos.upgrade.v1beta1.QueryAuthorityResponseKt.Dsl._create(cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse.newBuilder()).apply { block() }._build()
public object QueryAuthorityResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse = _builder.build()

    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse.copy(block: cosmos.upgrade.v1beta1.QueryAuthorityResponseKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.QueryOuterClass.QueryAuthorityResponse =
  cosmos.upgrade.v1beta1.QueryAuthorityResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


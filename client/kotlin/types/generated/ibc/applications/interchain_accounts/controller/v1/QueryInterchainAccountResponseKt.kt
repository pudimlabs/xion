//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/controller/v1/query.proto

package ibc.applications.interchain_accounts.controller.v1;

@kotlin.jvm.JvmName("-initializequeryInterchainAccountResponse")
public inline fun queryInterchainAccountResponse(block: ibc.applications.interchain_accounts.controller.v1.QueryInterchainAccountResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse =
  ibc.applications.interchain_accounts.controller.v1.QueryInterchainAccountResponseKt.Dsl._create(ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse.newBuilder()).apply { block() }._build()
public object QueryInterchainAccountResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse = _builder.build()

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
public inline fun ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse.copy(block: ibc.applications.interchain_accounts.controller.v1.QueryInterchainAccountResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryInterchainAccountResponse =
  ibc.applications.interchain_accounts.controller.v1.QueryInterchainAccountResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/host/v1/query.proto

package ibc.applications.interchain_accounts.host.v1;

@kotlin.jvm.JvmName("-initializequeryParamsRequest")
public inline fun queryParamsRequest(block: ibc.applications.interchain_accounts.host.v1.QueryParamsRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest =
  ibc.applications.interchain_accounts.host.v1.QueryParamsRequestKt.Dsl._create(ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest.newBuilder()).apply { block() }._build()
public object QueryParamsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest.copy(block: ibc.applications.interchain_accounts.host.v1.QueryParamsRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.host.v1.QueryOuterClass.QueryParamsRequest =
  ibc.applications.interchain_accounts.host.v1.QueryParamsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


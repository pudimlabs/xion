//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmName("-initializebech32PrefixRequest")
public inline fun bech32PrefixRequest(block: cosmos.auth.v1beta1.Bech32PrefixRequestKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest =
  cosmos.auth.v1beta1.Bech32PrefixRequestKt.Dsl._create(cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest.newBuilder()).apply { block() }._build()
public object Bech32PrefixRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest.copy(block: cosmos.auth.v1beta1.Bech32PrefixRequestKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.Bech32PrefixRequest =
  cosmos.auth.v1beta1.Bech32PrefixRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: xion/v1/query.proto

package xion.v1;

@kotlin.jvm.JvmName("-initializequeryPlatformPercentageRequest")
public inline fun queryPlatformPercentageRequest(block: xion.v1.QueryPlatformPercentageRequestKt.Dsl.() -> kotlin.Unit): xion.v1.QueryOuterClass.QueryPlatformPercentageRequest =
  xion.v1.QueryPlatformPercentageRequestKt.Dsl._create(xion.v1.QueryOuterClass.QueryPlatformPercentageRequest.newBuilder()).apply { block() }._build()
public object QueryPlatformPercentageRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: xion.v1.QueryOuterClass.QueryPlatformPercentageRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: xion.v1.QueryOuterClass.QueryPlatformPercentageRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): xion.v1.QueryOuterClass.QueryPlatformPercentageRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun xion.v1.QueryOuterClass.QueryPlatformPercentageRequest.copy(block: xion.v1.QueryPlatformPercentageRequestKt.Dsl.() -> kotlin.Unit): xion.v1.QueryOuterClass.QueryPlatformPercentageRequest =
  xion.v1.QueryPlatformPercentageRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


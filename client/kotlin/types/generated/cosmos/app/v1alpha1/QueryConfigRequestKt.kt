//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/app/v1alpha1/query.proto

package cosmos.app.v1alpha1;

@kotlin.jvm.JvmName("-initializequeryConfigRequest")
public inline fun queryConfigRequest(block: cosmos.app.v1alpha1.QueryConfigRequestKt.Dsl.() -> kotlin.Unit): cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest =
  cosmos.app.v1alpha1.QueryConfigRequestKt.Dsl._create(cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest.newBuilder()).apply { block() }._build()
public object QueryConfigRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest.copy(block: cosmos.app.v1alpha1.QueryConfigRequestKt.Dsl.() -> kotlin.Unit): cosmos.app.v1alpha1.QueryOuterClass.QueryConfigRequest =
  cosmos.app.v1alpha1.QueryConfigRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/controller/v1/query.proto

package ibc.applications.interchain_accounts.controller.v1;

@kotlin.jvm.JvmName("-initializequeryParamsResponse")
public inline fun queryParamsResponse(block: ibc.applications.interchain_accounts.controller.v1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse =
  ibc.applications.interchain_accounts.controller.v1.QueryParamsResponseKt.Dsl._create(ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse.newBuilder()).apply { block() }._build()
public object QueryParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse = _builder.build()

    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.applications.interchain_accounts.controller.v1.Params params = 1 [json_name = "params"];</code>
     */
    public var params: ibc.applications.interchain_accounts.controller.v1.Controller.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.applications.interchain_accounts.controller.v1.Params params = 1 [json_name = "params"];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.applications.interchain_accounts.controller.v1.Params params = 1 [json_name = "params"];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse.copy(block: ibc.applications.interchain_accounts.controller.v1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponse =
  ibc.applications.interchain_accounts.controller.v1.QueryParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.applications.interchain_accounts.controller.v1.QueryOuterClass.QueryParamsResponseOrBuilder.paramsOrNull: ibc.applications.interchain_accounts.controller.v1.Controller.Params?
  get() = if (hasParams()) getParams() else null


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmName("-initializemsgUpdateParams")
public inline fun msgUpdateParams(block: cosmwasm.wasm.v1.MsgUpdateParamsKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgUpdateParams =
  cosmwasm.wasm.v1.MsgUpdateParamsKt.Dsl._create(cosmwasm.wasm.v1.Tx.MsgUpdateParams.newBuilder()).apply { block() }._build()
public object MsgUpdateParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Tx.MsgUpdateParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Tx.MsgUpdateParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Tx.MsgUpdateParams = _builder.build()

    /**
     * <pre>
     * Authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var authority: kotlin.String
      @JvmName("getAuthority")
      get() = _builder.getAuthority()
      @JvmName("setAuthority")
      set(value) {
        _builder.setAuthority(value)
      }
    /**
     * <pre>
     * Authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAuthority() {
      _builder.clearAuthority()
    }

    /**
     * <pre>
     * params defines the x/wasm parameters to update.
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.cosmwasm.wasm.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var params: cosmwasm.wasm.v1.Types.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines the x/wasm parameters to update.
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.cosmwasm.wasm.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines the x/wasm parameters to update.
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.cosmwasm.wasm.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Tx.MsgUpdateParams.copy(block: cosmwasm.wasm.v1.MsgUpdateParamsKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgUpdateParams =
  cosmwasm.wasm.v1.MsgUpdateParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmwasm.wasm.v1.Tx.MsgUpdateParamsOrBuilder.paramsOrNull: cosmwasm.wasm.v1.Types.Params?
  get() = if (hasParams()) getParams() else null


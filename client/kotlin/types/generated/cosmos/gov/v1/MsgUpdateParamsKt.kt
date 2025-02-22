//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1/tx.proto

package cosmos.gov.v1;

@kotlin.jvm.JvmName("-initializemsgUpdateParams")
public inline fun msgUpdateParams(block: cosmos.gov.v1.MsgUpdateParamsKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Tx.MsgUpdateParams =
  cosmos.gov.v1.MsgUpdateParamsKt.Dsl._create(cosmos.gov.v1.Tx.MsgUpdateParams.newBuilder()).apply { block() }._build()
public object MsgUpdateParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1.Tx.MsgUpdateParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1.Tx.MsgUpdateParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1.Tx.MsgUpdateParams = _builder.build()

    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
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
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAuthority() {
      _builder.clearAuthority()
    }

    /**
     * <pre>
     * params defines the x/gov parameters to update.
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.cosmos.gov.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var params: cosmos.gov.v1.Gov.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines the x/gov parameters to update.
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.cosmos.gov.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines the x/gov parameters to update.
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.cosmos.gov.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1.Tx.MsgUpdateParams.copy(block: cosmos.gov.v1.MsgUpdateParamsKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Tx.MsgUpdateParams =
  cosmos.gov.v1.MsgUpdateParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.gov.v1.Tx.MsgUpdateParamsOrBuilder.paramsOrNull: cosmos.gov.v1.Gov.Params?
  get() = if (hasParams()) getParams() else null


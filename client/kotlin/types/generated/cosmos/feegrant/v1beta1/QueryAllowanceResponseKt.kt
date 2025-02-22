//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/query.proto

package cosmos.feegrant.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAllowanceResponse")
public inline fun queryAllowanceResponse(block: cosmos.feegrant.v1beta1.QueryAllowanceResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse =
  cosmos.feegrant.v1beta1.QueryAllowanceResponseKt.Dsl._create(cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse.newBuilder()).apply { block() }._build()
public object QueryAllowanceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse = _builder.build()

    /**
     * <pre>
     * allowance is a allowance granted for grantee by granter.
     * </pre>
     *
     * <code>.cosmos.feegrant.v1beta1.Grant allowance = 1 [json_name = "allowance"];</code>
     */
    public var allowance: cosmos.feegrant.v1beta1.Feegrant.Grant
      @JvmName("getAllowance")
      get() = _builder.getAllowance()
      @JvmName("setAllowance")
      set(value) {
        _builder.setAllowance(value)
      }
    /**
     * <pre>
     * allowance is a allowance granted for grantee by granter.
     * </pre>
     *
     * <code>.cosmos.feegrant.v1beta1.Grant allowance = 1 [json_name = "allowance"];</code>
     */
    public fun clearAllowance() {
      _builder.clearAllowance()
    }
    /**
     * <pre>
     * allowance is a allowance granted for grantee by granter.
     * </pre>
     *
     * <code>.cosmos.feegrant.v1beta1.Grant allowance = 1 [json_name = "allowance"];</code>
     * @return Whether the allowance field is set.
     */
    public fun hasAllowance(): kotlin.Boolean {
      return _builder.hasAllowance()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse.copy(block: cosmos.feegrant.v1beta1.QueryAllowanceResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponse =
  cosmos.feegrant.v1beta1.QueryAllowanceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowanceResponseOrBuilder.allowanceOrNull: cosmos.feegrant.v1beta1.Feegrant.Grant?
  get() = if (hasAllowance()) getAllowance() else null


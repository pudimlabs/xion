//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmName("-initializequeryDelegationRequest")
public inline fun queryDelegationRequest(block: cosmos.staking.v1beta1.QueryDelegationRequestKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest =
  cosmos.staking.v1beta1.QueryDelegationRequestKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest.newBuilder()).apply { block() }._build()
public object QueryDelegationRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest = _builder.build()

    /**
     * <pre>
     * delegator_addr defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_addr = 1 [json_name = "delegatorAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var delegatorAddr: kotlin.String
      @JvmName("getDelegatorAddr")
      get() = _builder.getDelegatorAddr()
      @JvmName("setDelegatorAddr")
      set(value) {
        _builder.setDelegatorAddr(value)
      }
    /**
     * <pre>
     * delegator_addr defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_addr = 1 [json_name = "delegatorAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDelegatorAddr() {
      _builder.clearDelegatorAddr()
    }

    /**
     * <pre>
     * validator_addr defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 2 [json_name = "validatorAddr", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     */
    public var validatorAddr: kotlin.String
      @JvmName("getValidatorAddr")
      get() = _builder.getValidatorAddr()
      @JvmName("setValidatorAddr")
      set(value) {
        _builder.setValidatorAddr(value)
      }
    /**
     * <pre>
     * validator_addr defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 2 [json_name = "validatorAddr", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     */
    public fun clearValidatorAddr() {
      _builder.clearValidatorAddr()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest.copy(block: cosmos.staking.v1beta1.QueryDelegationRequestKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationRequest =
  cosmos.staking.v1beta1.QueryDelegationRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


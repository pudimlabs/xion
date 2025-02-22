//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmName("-initializevalidatorAccumulatedCommissionRecord")
public inline fun validatorAccumulatedCommissionRecord(block: cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord =
  cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecordKt.Dsl._create(cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord.newBuilder()).apply { block() }._build()
public object ValidatorAccumulatedCommissionRecordKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord = _builder.build()

    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <pre>
     * accumulated is the accumulated commission of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission accumulated = 2 [json_name = "accumulated", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var accumulated: cosmos.distribution.v1beta1.Distribution.ValidatorAccumulatedCommission
      @JvmName("getAccumulated")
      get() = _builder.getAccumulated()
      @JvmName("setAccumulated")
      set(value) {
        _builder.setAccumulated(value)
      }
    /**
     * <pre>
     * accumulated is the accumulated commission of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission accumulated = 2 [json_name = "accumulated", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearAccumulated() {
      _builder.clearAccumulated()
    }
    /**
     * <pre>
     * accumulated is the accumulated commission of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission accumulated = 2 [json_name = "accumulated", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the accumulated field is set.
     */
    public fun hasAccumulated(): kotlin.Boolean {
      return _builder.hasAccumulated()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord.copy(block: cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecord =
  cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecordKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.distribution.v1beta1.Genesis.ValidatorAccumulatedCommissionRecordOrBuilder.accumulatedOrNull: cosmos.distribution.v1beta1.Distribution.ValidatorAccumulatedCommission?
  get() = if (hasAccumulated()) getAccumulated() else null


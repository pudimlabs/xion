//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/mint/v1beta1/mint.proto

package cosmos.mint.v1beta1;

@kotlin.jvm.JvmName("-initializeminter")
public inline fun minter(block: cosmos.mint.v1beta1.MinterKt.Dsl.() -> kotlin.Unit): cosmos.mint.v1beta1.Mint.Minter =
  cosmos.mint.v1beta1.MinterKt.Dsl._create(cosmos.mint.v1beta1.Mint.Minter.newBuilder()).apply { block() }._build()
public object MinterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.mint.v1beta1.Mint.Minter.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.mint.v1beta1.Mint.Minter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.mint.v1beta1.Mint.Minter = _builder.build()

    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public var inflation: kotlin.String
      @JvmName("getInflation")
      get() = _builder.getInflation()
      @JvmName("setInflation")
      set(value) {
        _builder.setInflation(value)
      }
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public fun clearInflation() {
      _builder.clearInflation()
    }

    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 2 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public var annualProvisions: kotlin.String
      @JvmName("getAnnualProvisions")
      get() = _builder.getAnnualProvisions()
      @JvmName("setAnnualProvisions")
      set(value) {
        _builder.setAnnualProvisions(value)
      }
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 2 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public fun clearAnnualProvisions() {
      _builder.clearAnnualProvisions()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.mint.v1beta1.Mint.Minter.copy(block: cosmos.mint.v1beta1.MinterKt.Dsl.() -> kotlin.Unit): cosmos.mint.v1beta1.Mint.Minter =
  cosmos.mint.v1beta1.MinterKt.Dsl._create(this.toBuilder()).apply { block() }._build()


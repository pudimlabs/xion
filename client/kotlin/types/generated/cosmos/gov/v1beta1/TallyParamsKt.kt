//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmName("-initializetallyParams")
public inline fun tallyParams(block: cosmos.gov.v1beta1.TallyParamsKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Gov.TallyParams =
  cosmos.gov.v1beta1.TallyParamsKt.Dsl._create(cosmos.gov.v1beta1.Gov.TallyParams.newBuilder()).apply { block() }._build()
public object TallyParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.Gov.TallyParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.Gov.TallyParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.Gov.TallyParams = _builder.build()

    /**
     * <pre>
     * Minimum percentage of total stake needed to vote for a result to be
     * considered valid.
     * </pre>
     *
     * <code>bytes quorum = 1 [json_name = "quorum", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.gogoproto.jsontag) = "quorum,omitempty", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public var quorum: com.google.protobuf.ByteString
      @JvmName("getQuorum")
      get() = _builder.getQuorum()
      @JvmName("setQuorum")
      set(value) {
        _builder.setQuorum(value)
      }
    /**
     * <pre>
     * Minimum percentage of total stake needed to vote for a result to be
     * considered valid.
     * </pre>
     *
     * <code>bytes quorum = 1 [json_name = "quorum", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.gogoproto.jsontag) = "quorum,omitempty", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public fun clearQuorum() {
      _builder.clearQuorum()
    }

    /**
     * <pre>
     * Minimum proportion of Yes votes for proposal to pass. Default value: 0.5.
     * </pre>
     *
     * <code>bytes threshold = 2 [json_name = "threshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.gogoproto.jsontag) = "threshold,omitempty", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public var threshold: com.google.protobuf.ByteString
      @JvmName("getThreshold")
      get() = _builder.getThreshold()
      @JvmName("setThreshold")
      set(value) {
        _builder.setThreshold(value)
      }
    /**
     * <pre>
     * Minimum proportion of Yes votes for proposal to pass. Default value: 0.5.
     * </pre>
     *
     * <code>bytes threshold = 2 [json_name = "threshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.gogoproto.jsontag) = "threshold,omitempty", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public fun clearThreshold() {
      _builder.clearThreshold()
    }

    /**
     * <pre>
     * Minimum value of Veto votes to Total votes ratio for proposal to be
     * vetoed. Default value: 1/3.
     * </pre>
     *
     * <code>bytes veto_threshold = 3 [json_name = "vetoThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.gogoproto.jsontag) = "veto_threshold,omitempty", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public var vetoThreshold: com.google.protobuf.ByteString
      @JvmName("getVetoThreshold")
      get() = _builder.getVetoThreshold()
      @JvmName("setVetoThreshold")
      set(value) {
        _builder.setVetoThreshold(value)
      }
    /**
     * <pre>
     * Minimum value of Veto votes to Total votes ratio for proposal to be
     * vetoed. Default value: 1/3.
     * </pre>
     *
     * <code>bytes veto_threshold = 3 [json_name = "vetoThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.gogoproto.jsontag) = "veto_threshold,omitempty", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     */
    public fun clearVetoThreshold() {
      _builder.clearVetoThreshold()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta1.Gov.TallyParams.copy(block: cosmos.gov.v1beta1.TallyParamsKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Gov.TallyParams =
  cosmos.gov.v1beta1.TallyParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()


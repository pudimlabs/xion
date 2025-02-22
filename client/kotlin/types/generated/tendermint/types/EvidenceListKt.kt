//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/evidence.proto

package tendermint.types;

@kotlin.jvm.JvmName("-initializeevidenceList")
public inline fun evidenceList(block: tendermint.types.EvidenceListKt.Dsl.() -> kotlin.Unit): tendermint.types.EvidenceOuterClass.EvidenceList =
  tendermint.types.EvidenceListKt.Dsl._create(tendermint.types.EvidenceOuterClass.EvidenceList.newBuilder()).apply { block() }._build()
public object EvidenceListKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.EvidenceOuterClass.EvidenceList.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.EvidenceOuterClass.EvidenceList.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.EvidenceOuterClass.EvidenceList = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EvidenceProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     */
     public val evidence: com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEvidenceList()
      )
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @param value The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvidence")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>.add(value: tendermint.types.EvidenceOuterClass.Evidence) {
      _builder.addEvidence(value)
    }
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @param value The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvidence")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>.plusAssign(value: tendermint.types.EvidenceOuterClass.Evidence) {
      add(value)
    }
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @param values The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvidence")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>.addAll(values: kotlin.collections.Iterable<tendermint.types.EvidenceOuterClass.Evidence>) {
      _builder.addAllEvidence(values)
    }
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @param values The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvidence")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.types.EvidenceOuterClass.Evidence>) {
      addAll(values)
    }
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The evidence to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvidence")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>.set(index: kotlin.Int, value: tendermint.types.EvidenceOuterClass.Evidence) {
      _builder.setEvidence(index, value)
    }
    /**
     * <code>repeated .tendermint.types.Evidence evidence = 1 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvidence")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.EvidenceOuterClass.Evidence, EvidenceProxy>.clear() {
      _builder.clearEvidence()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.EvidenceOuterClass.EvidenceList.copy(block: tendermint.types.EvidenceListKt.Dsl.() -> kotlin.Unit): tendermint.types.EvidenceOuterClass.EvidenceList =
  tendermint.types.EvidenceListKt.Dsl._create(this.toBuilder()).apply { block() }._build()


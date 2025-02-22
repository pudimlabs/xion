//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

@kotlin.jvm.JvmName("-initializevalidatorParams")
public inline fun validatorParams(block: tendermint.types.ValidatorParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.ValidatorParams =
  tendermint.types.ValidatorParamsKt.Dsl._create(tendermint.types.Params.ValidatorParams.newBuilder()).apply { block() }._build()
public object ValidatorParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Params.ValidatorParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Params.ValidatorParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Params.ValidatorParams = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PubKeyTypesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @return A list containing the pubKeyTypes.
     */
    public val pubKeyTypes: com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPubKeyTypesList()
      )
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param value The pubKeyTypes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPubKeyTypes")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>.add(value: kotlin.String) {
      _builder.addPubKeyTypes(value)
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param value The pubKeyTypes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPubKeyTypes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param values The pubKeyTypes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPubKeyTypes")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPubKeyTypes(values)
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param values The pubKeyTypes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPubKeyTypes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param index The index to set the value at.
     * @param value The pubKeyTypes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPubKeyTypes")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setPubKeyTypes(index, value)
    }/**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPubKeyTypes")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, PubKeyTypesProxy>.clear() {
      _builder.clearPubKeyTypes()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Params.ValidatorParams.copy(block: tendermint.types.ValidatorParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.ValidatorParams =
  tendermint.types.ValidatorParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()


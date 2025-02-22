//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: xion/jwk/v1/genesis.proto

package xion.jwk.v1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: xion.jwk.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): xion.jwk.v1.Genesis.GenesisState =
  xion.jwk.v1.GenesisStateKt.Dsl._create(xion.jwk.v1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: xion.jwk.v1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: xion.jwk.v1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): xion.jwk.v1.Genesis.GenesisState = _builder.build()

    /**
     * <code>.xion.jwk.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public var params: xion.jwk.v1.ParamsOuterClass.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <code>.xion.jwk.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <code>.xion.jwk.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AudienceListProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     */
     public val audienceList: com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAudienceListList()
      )
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     * @param value The audienceList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAudienceList")
    public fun com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>.add(value: xion.jwk.v1.AudienceOuterClass.Audience) {
      _builder.addAudienceList(value)
    }
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     * @param value The audienceList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAudienceList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>.plusAssign(value: xion.jwk.v1.AudienceOuterClass.Audience) {
      add(value)
    }
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     * @param values The audienceList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAudienceList")
    public fun com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>.addAll(values: kotlin.collections.Iterable<xion.jwk.v1.AudienceOuterClass.Audience>) {
      _builder.addAllAudienceList(values)
    }
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     * @param values The audienceList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAudienceList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>.plusAssign(values: kotlin.collections.Iterable<xion.jwk.v1.AudienceOuterClass.Audience>) {
      addAll(values)
    }
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The audienceList to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAudienceList")
    public operator fun com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>.set(index: kotlin.Int, value: xion.jwk.v1.AudienceOuterClass.Audience) {
      _builder.setAudienceList(index, value)
    }
    /**
     * <code>repeated .xion.jwk.v1.Audience audienceList = 2 [json_name = "audienceList", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAudienceList")
    public fun com.google.protobuf.kotlin.DslList<xion.jwk.v1.AudienceOuterClass.Audience, AudienceListProxy>.clear() {
      _builder.clearAudienceList()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun xion.jwk.v1.Genesis.GenesisState.copy(block: xion.jwk.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): xion.jwk.v1.Genesis.GenesisState =
  xion.jwk.v1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val xion.jwk.v1.Genesis.GenesisStateOrBuilder.paramsOrNull: xion.jwk.v1.ParamsOuterClass.Params?
  get() = if (hasParams()) getParams() else null


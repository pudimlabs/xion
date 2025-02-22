//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/slashing/v1beta1/genesis.proto

package cosmos.slashing.v1beta1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: cosmos.slashing.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.Genesis.GenesisState =
  cosmos.slashing.v1beta1.GenesisStateKt.Dsl._create(cosmos.slashing.v1beta1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.slashing.v1beta1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.slashing.v1beta1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.slashing.v1beta1.Genesis.GenesisState = _builder.build()

    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.slashing.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public var params: cosmos.slashing.v1beta1.Slashing.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.slashing.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.cosmos.slashing.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
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
    public class SigningInfosProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
     public val signingInfos: com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSigningInfosList()
      )
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The signingInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSigningInfos")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>.add(value: cosmos.slashing.v1beta1.Genesis.SigningInfo) {
      _builder.addSigningInfos(value)
    }
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The signingInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSigningInfos")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>.plusAssign(value: cosmos.slashing.v1beta1.Genesis.SigningInfo) {
      add(value)
    }
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The signingInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSigningInfos")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>.addAll(values: kotlin.collections.Iterable<cosmos.slashing.v1beta1.Genesis.SigningInfo>) {
      _builder.addAllSigningInfos(values)
    }
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The signingInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSigningInfos")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.slashing.v1beta1.Genesis.SigningInfo>) {
      addAll(values)
    }
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The signingInfos to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSigningInfos")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>.set(index: kotlin.Int, value: cosmos.slashing.v1beta1.Genesis.SigningInfo) {
      _builder.setSigningInfos(index, value)
    }
    /**
     * <pre>
     * signing_infos represents a map between validator addresses and their
     * signing infos.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.SigningInfo signing_infos = 2 [json_name = "signingInfos", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSigningInfos")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.SigningInfo, SigningInfosProxy>.clear() {
      _builder.clearSigningInfos()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MissedBlocksProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
     public val missedBlocks: com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMissedBlocksList()
      )
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMissedBlocks")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>.add(value: cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks) {
      _builder.addMissedBlocks(value)
    }
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMissedBlocks")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>.plusAssign(value: cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks) {
      add(value)
    }
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMissedBlocks")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>.addAll(values: kotlin.collections.Iterable<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks>) {
      _builder.addAllMissedBlocks(values)
    }
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMissedBlocks")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks>) {
      addAll(values)
    }
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The missedBlocks to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMissedBlocks")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>.set(index: kotlin.Int, value: cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks) {
      _builder.setMissedBlocks(index, value)
    }
    /**
     * <pre>
     * missed_blocks represents a map between validator addresses and their
     * missed blocks.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.ValidatorMissedBlocks missed_blocks = 3 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMissedBlocks")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks, MissedBlocksProxy>.clear() {
      _builder.clearMissedBlocks()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.slashing.v1beta1.Genesis.GenesisState.copy(block: cosmos.slashing.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.Genesis.GenesisState =
  cosmos.slashing.v1beta1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.slashing.v1beta1.Genesis.GenesisStateOrBuilder.paramsOrNull: cosmos.slashing.v1beta1.Slashing.Params?
  get() = if (hasParams()) getParams() else null


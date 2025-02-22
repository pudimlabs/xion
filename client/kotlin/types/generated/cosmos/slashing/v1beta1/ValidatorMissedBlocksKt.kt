//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/slashing/v1beta1/genesis.proto

package cosmos.slashing.v1beta1;

@kotlin.jvm.JvmName("-initializevalidatorMissedBlocks")
public inline fun validatorMissedBlocks(block: cosmos.slashing.v1beta1.ValidatorMissedBlocksKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks =
  cosmos.slashing.v1beta1.ValidatorMissedBlocksKt.Dsl._create(cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks.newBuilder()).apply { block() }._build()
public object ValidatorMissedBlocksKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks = _builder.build()

    /**
     * <pre>
     * address is the validator address.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.ConsensusAddressString"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * address is the validator address.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.ConsensusAddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MissedBlocksProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
     public val missedBlocks: com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMissedBlocksList()
      )
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMissedBlocks")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>.add(value: cosmos.slashing.v1beta1.Genesis.MissedBlock) {
      _builder.addMissedBlocks(value)
    }
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMissedBlocks")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>.plusAssign(value: cosmos.slashing.v1beta1.Genesis.MissedBlock) {
      add(value)
    }
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMissedBlocks")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>.addAll(values: kotlin.collections.Iterable<cosmos.slashing.v1beta1.Genesis.MissedBlock>) {
      _builder.addAllMissedBlocks(values)
    }
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The missedBlocks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMissedBlocks")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.slashing.v1beta1.Genesis.MissedBlock>) {
      addAll(values)
    }
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The missedBlocks to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMissedBlocks")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>.set(index: kotlin.Int, value: cosmos.slashing.v1beta1.Genesis.MissedBlock) {
      _builder.setMissedBlocks(index, value)
    }
    /**
     * <pre>
     * missed_blocks is an array of missed blocks by the validator.
     * </pre>
     *
     * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMissedBlocks")
    public fun com.google.protobuf.kotlin.DslList<cosmos.slashing.v1beta1.Genesis.MissedBlock, MissedBlocksProxy>.clear() {
      _builder.clearMissedBlocks()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks.copy(block: cosmos.slashing.v1beta1.ValidatorMissedBlocksKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.Genesis.ValidatorMissedBlocks =
  cosmos.slashing.v1beta1.ValidatorMissedBlocksKt.Dsl._create(this.toBuilder()).apply { block() }._build()


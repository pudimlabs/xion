//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

@kotlin.jvm.JvmName("-initializeproofOps")
public inline fun proofOps(block: cosmos.base.tendermint.v1beta1.ProofOpsKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.ProofOps =
  cosmos.base.tendermint.v1beta1.ProofOpsKt.Dsl._create(cosmos.base.tendermint.v1beta1.Query.ProofOps.newBuilder()).apply { block() }._build()
public object ProofOpsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.tendermint.v1beta1.Query.ProofOps.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.tendermint.v1beta1.Query.ProofOps.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.tendermint.v1beta1.Query.ProofOps = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OpsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
     public val ops: com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOpsList()
      )
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The ops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOps")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>.add(value: cosmos.base.tendermint.v1beta1.Query.ProofOp) {
      _builder.addOps(value)
    }
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param value The ops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>.plusAssign(value: cosmos.base.tendermint.v1beta1.Query.ProofOp) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The ops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOps")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.tendermint.v1beta1.Query.ProofOp>) {
      _builder.addAllOps(values)
    }
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param values The ops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.tendermint.v1beta1.Query.ProofOp>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @param index The index to set the value at.
     * @param value The ops to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOps")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>.set(index: kotlin.Int, value: cosmos.base.tendermint.v1beta1.Query.ProofOp) {
      _builder.setOps(index, value)
    }
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.ProofOp ops = 1 [json_name = "ops", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOps")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.ProofOp, OpsProxy>.clear() {
      _builder.clearOps()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.tendermint.v1beta1.Query.ProofOps.copy(block: cosmos.base.tendermint.v1beta1.ProofOpsKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.ProofOps =
  cosmos.base.tendermint.v1beta1.ProofOpsKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: xion/v1/genesis.proto

package xion.v1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: xion.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): xion.v1.Genesis.GenesisState =
  xion.v1.GenesisStateKt.Dsl._create(xion.v1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: xion.v1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: xion.v1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): xion.v1.Genesis.GenesisState = _builder.build()

    /**
     * <code>uint32 platform_percentage = 1 [json_name = "platformPercentage"];</code>
     */
    public var platformPercentage: kotlin.Int
      @JvmName("getPlatformPercentage")
      get() = _builder.getPlatformPercentage()
      @JvmName("setPlatformPercentage")
      set(value) {
        _builder.setPlatformPercentage(value)
      }
    /**
     * <code>uint32 platform_percentage = 1 [json_name = "platformPercentage"];</code>
     */
    public fun clearPlatformPercentage() {
      _builder.clearPlatformPercentage()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PlatformMinimumsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val platformMinimums: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPlatformMinimumsList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The platformMinimums to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPlatformMinimums")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addPlatformMinimums(value)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The platformMinimums to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPlatformMinimums")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The platformMinimums to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPlatformMinimums")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllPlatformMinimums(values)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The platformMinimums to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPlatformMinimums")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The platformMinimums to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPlatformMinimums")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setPlatformMinimums(index, value)
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin platform_minimums = 2 [json_name = "platformMinimums", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "platform_minimums,omitempty", (.gogoproto.moretags) = "yaml:&#92;"platform_minimums&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPlatformMinimums")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, PlatformMinimumsProxy>.clear() {
      _builder.clearPlatformMinimums()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun xion.v1.Genesis.GenesisState.copy(block: xion.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): xion.v1.Genesis.GenesisState =
  xion.v1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/v1beta1/coin.proto

package cosmos.base.v1beta1;

@kotlin.jvm.JvmName("-initializeintProto")
public inline fun intProto(block: cosmos.base.v1beta1.IntProtoKt.Dsl.() -> kotlin.Unit): cosmos.base.v1beta1.CoinOuterClass.IntProto =
  cosmos.base.v1beta1.IntProtoKt.Dsl._create(cosmos.base.v1beta1.CoinOuterClass.IntProto.newBuilder()).apply { block() }._build()
public object IntProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.v1beta1.CoinOuterClass.IntProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.v1beta1.CoinOuterClass.IntProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.v1beta1.CoinOuterClass.IntProto = _builder.build()

    /**
     * <code>string int = 1 [json_name = "int", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
     */
    public var int: kotlin.String
      @JvmName("getInt")
      get() = _builder.getInt()
      @JvmName("setInt")
      set(value) {
        _builder.setInt(value)
      }
    /**
     * <code>string int = 1 [json_name = "int", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
     */
    public fun clearInt() {
      _builder.clearInt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.v1beta1.CoinOuterClass.IntProto.copy(block: cosmos.base.v1beta1.IntProtoKt.Dsl.() -> kotlin.Unit): cosmos.base.v1beta1.CoinOuterClass.IntProto =
  cosmos.base.v1beta1.IntProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()


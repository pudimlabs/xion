//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

@kotlin.jvm.JvmName("-initializepartSetHeader")
public inline fun partSetHeader(block: tendermint.types.PartSetHeaderKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.PartSetHeader =
  tendermint.types.PartSetHeaderKt.Dsl._create(tendermint.types.Types.PartSetHeader.newBuilder()).apply { block() }._build()
public object PartSetHeaderKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Types.PartSetHeader.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Types.PartSetHeader.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Types.PartSetHeader = _builder.build()

    /**
     * <code>uint32 total = 1 [json_name = "total"];</code>
     */
    public var total: kotlin.Int
      @JvmName("getTotal")
      get() = _builder.getTotal()
      @JvmName("setTotal")
      set(value) {
        _builder.setTotal(value)
      }
    /**
     * <code>uint32 total = 1 [json_name = "total"];</code>
     */
    public fun clearTotal() {
      _builder.clearTotal()
    }

    /**
     * <code>bytes hash = 2 [json_name = "hash"];</code>
     */
    public var hash: com.google.protobuf.ByteString
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>bytes hash = 2 [json_name = "hash"];</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Types.PartSetHeader.copy(block: tendermint.types.PartSetHeaderKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.PartSetHeader =
  tendermint.types.PartSetHeaderKt.Dsl._create(this.toBuilder()).apply { block() }._build()


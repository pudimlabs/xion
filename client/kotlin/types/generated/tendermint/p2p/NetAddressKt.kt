//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/p2p/types.proto

package tendermint.p2p;

@kotlin.jvm.JvmName("-initializenetAddress")
public inline fun netAddress(block: tendermint.p2p.NetAddressKt.Dsl.() -> kotlin.Unit): tendermint.p2p.Types.NetAddress =
  tendermint.p2p.NetAddressKt.Dsl._create(tendermint.p2p.Types.NetAddress.newBuilder()).apply { block() }._build()
public object NetAddressKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.p2p.Types.NetAddress.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.p2p.Types.NetAddress.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.p2p.Types.NetAddress = _builder.build()

    /**
     * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string ip = 2 [json_name = "ip", (.gogoproto.customname) = "IP"];</code>
     */
    public var ip: kotlin.String
      @JvmName("getIp")
      get() = _builder.getIp()
      @JvmName("setIp")
      set(value) {
        _builder.setIp(value)
      }
    /**
     * <code>string ip = 2 [json_name = "ip", (.gogoproto.customname) = "IP"];</code>
     */
    public fun clearIp() {
      _builder.clearIp()
    }

    /**
     * <code>uint32 port = 3 [json_name = "port"];</code>
     */
    public var port: kotlin.Int
      @JvmName("getPort")
      get() = _builder.getPort()
      @JvmName("setPort")
      set(value) {
        _builder.setPort(value)
      }
    /**
     * <code>uint32 port = 3 [json_name = "port"];</code>
     */
    public fun clearPort() {
      _builder.clearPort()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.p2p.Types.NetAddress.copy(block: tendermint.p2p.NetAddressKt.Dsl.() -> kotlin.Unit): tendermint.p2p.Types.NetAddress =
  tendermint.p2p.NetAddressKt.Dsl._create(this.toBuilder()).apply { block() }._build()


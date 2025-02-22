//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/types/v1/genesis.proto

package ibc.core.types.v1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: ibc.core.types.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): ibc.core.types.v1.Genesis.GenesisState =
  ibc.core.types.v1.GenesisStateKt.Dsl._create(ibc.core.types.v1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.types.v1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.types.v1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.types.v1.Genesis.GenesisState = _builder.build()

    /**
     * <pre>
     * ICS002 - Clients genesis state
     * </pre>
     *
     * <code>.ibc.core.client.v1.GenesisState client_genesis = 1 [json_name = "clientGenesis", (.gogoproto.nullable) = false];</code>
     */
    public var clientGenesis: ibc.core.client.v1.Genesis.GenesisState
      @JvmName("getClientGenesis")
      get() = _builder.getClientGenesis()
      @JvmName("setClientGenesis")
      set(value) {
        _builder.setClientGenesis(value)
      }
    /**
     * <pre>
     * ICS002 - Clients genesis state
     * </pre>
     *
     * <code>.ibc.core.client.v1.GenesisState client_genesis = 1 [json_name = "clientGenesis", (.gogoproto.nullable) = false];</code>
     */
    public fun clearClientGenesis() {
      _builder.clearClientGenesis()
    }
    /**
     * <pre>
     * ICS002 - Clients genesis state
     * </pre>
     *
     * <code>.ibc.core.client.v1.GenesisState client_genesis = 1 [json_name = "clientGenesis", (.gogoproto.nullable) = false];</code>
     * @return Whether the clientGenesis field is set.
     */
    public fun hasClientGenesis(): kotlin.Boolean {
      return _builder.hasClientGenesis()
    }

    /**
     * <pre>
     * ICS003 - Connections genesis state
     * </pre>
     *
     * <code>.ibc.core.connection.v1.GenesisState connection_genesis = 2 [json_name = "connectionGenesis", (.gogoproto.nullable) = false];</code>
     */
    public var connectionGenesis: ibc.core.connection.v1.Genesis.GenesisState
      @JvmName("getConnectionGenesis")
      get() = _builder.getConnectionGenesis()
      @JvmName("setConnectionGenesis")
      set(value) {
        _builder.setConnectionGenesis(value)
      }
    /**
     * <pre>
     * ICS003 - Connections genesis state
     * </pre>
     *
     * <code>.ibc.core.connection.v1.GenesisState connection_genesis = 2 [json_name = "connectionGenesis", (.gogoproto.nullable) = false];</code>
     */
    public fun clearConnectionGenesis() {
      _builder.clearConnectionGenesis()
    }
    /**
     * <pre>
     * ICS003 - Connections genesis state
     * </pre>
     *
     * <code>.ibc.core.connection.v1.GenesisState connection_genesis = 2 [json_name = "connectionGenesis", (.gogoproto.nullable) = false];</code>
     * @return Whether the connectionGenesis field is set.
     */
    public fun hasConnectionGenesis(): kotlin.Boolean {
      return _builder.hasConnectionGenesis()
    }

    /**
     * <pre>
     * ICS004 - Channel genesis state
     * </pre>
     *
     * <code>.ibc.core.channel.v1.GenesisState channel_genesis = 3 [json_name = "channelGenesis", (.gogoproto.nullable) = false];</code>
     */
    public var channelGenesis: ibc.core.channel.v1.Genesis.GenesisState
      @JvmName("getChannelGenesis")
      get() = _builder.getChannelGenesis()
      @JvmName("setChannelGenesis")
      set(value) {
        _builder.setChannelGenesis(value)
      }
    /**
     * <pre>
     * ICS004 - Channel genesis state
     * </pre>
     *
     * <code>.ibc.core.channel.v1.GenesisState channel_genesis = 3 [json_name = "channelGenesis", (.gogoproto.nullable) = false];</code>
     */
    public fun clearChannelGenesis() {
      _builder.clearChannelGenesis()
    }
    /**
     * <pre>
     * ICS004 - Channel genesis state
     * </pre>
     *
     * <code>.ibc.core.channel.v1.GenesisState channel_genesis = 3 [json_name = "channelGenesis", (.gogoproto.nullable) = false];</code>
     * @return Whether the channelGenesis field is set.
     */
    public fun hasChannelGenesis(): kotlin.Boolean {
      return _builder.hasChannelGenesis()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.types.v1.Genesis.GenesisState.copy(block: ibc.core.types.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): ibc.core.types.v1.Genesis.GenesisState =
  ibc.core.types.v1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.types.v1.Genesis.GenesisStateOrBuilder.clientGenesisOrNull: ibc.core.client.v1.Genesis.GenesisState?
  get() = if (hasClientGenesis()) getClientGenesis() else null

public val ibc.core.types.v1.Genesis.GenesisStateOrBuilder.connectionGenesisOrNull: ibc.core.connection.v1.Genesis.GenesisState?
  get() = if (hasConnectionGenesis()) getConnectionGenesis() else null

public val ibc.core.types.v1.Genesis.GenesisStateOrBuilder.channelGenesisOrNull: ibc.core.channel.v1.Genesis.GenesisState?
  get() = if (hasChannelGenesis()) getChannelGenesis() else null


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/genesis/v1/genesis.proto

package ibc.applications.interchain_accounts.genesis.v1;

@kotlin.jvm.JvmName("-initializeregisteredInterchainAccount")
public inline fun registeredInterchainAccount(block: ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccountKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount =
  ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccountKt.Dsl._create(ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount.newBuilder()).apply { block() }._build()
public object RegisteredInterchainAccountKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount = _builder.build()

    /**
     * <code>string connection_id = 1 [json_name = "connectionId"];</code>
     */
    public var connectionId: kotlin.String
      @JvmName("getConnectionId")
      get() = _builder.getConnectionId()
      @JvmName("setConnectionId")
      set(value) {
        _builder.setConnectionId(value)
      }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId"];</code>
     */
    public fun clearConnectionId() {
      _builder.clearConnectionId()
    }

    /**
     * <code>string port_id = 2 [json_name = "portId"];</code>
     */
    public var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <code>string port_id = 2 [json_name = "portId"];</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <code>string account_address = 3 [json_name = "accountAddress"];</code>
     */
    public var accountAddress: kotlin.String
      @JvmName("getAccountAddress")
      get() = _builder.getAccountAddress()
      @JvmName("setAccountAddress")
      set(value) {
        _builder.setAccountAddress(value)
      }
    /**
     * <code>string account_address = 3 [json_name = "accountAddress"];</code>
     */
    public fun clearAccountAddress() {
      _builder.clearAccountAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount.copy(block: ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccountKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.genesis.v1.Genesis.RegisteredInterchainAccount =
  ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccountKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/controller/v1/tx.proto

package ibc.applications.interchain_accounts.controller.v1;

@kotlin.jvm.JvmName("-initializemsgRegisterInterchainAccountResponse")
public inline fun msgRegisterInterchainAccountResponse(block: ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccountResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse =
  ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccountResponseKt.Dsl._create(ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse.newBuilder()).apply { block() }._build()
public object MsgRegisterInterchainAccountResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse = _builder.build()

    /**
     * <code>string channel_id = 1 [json_name = "channelId"];</code>
     */
    public var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <code>string channel_id = 1 [json_name = "channelId"];</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
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
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse.copy(block: ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccountResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.controller.v1.Tx.MsgRegisterInterchainAccountResponse =
  ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccountResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


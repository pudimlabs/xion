//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializemsgUpdateClient")
public inline fun msgUpdateClient(block: ibc.core.client.v1.MsgUpdateClientKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgUpdateClient =
  ibc.core.client.v1.MsgUpdateClientKt.Dsl._create(ibc.core.client.v1.Tx.MsgUpdateClient.newBuilder()).apply { block() }._build()
public object MsgUpdateClientKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Tx.MsgUpdateClient.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Tx.MsgUpdateClient.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Tx.MsgUpdateClient = _builder.build()

    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     */
    public var clientId: kotlin.String
      @JvmName("getClientId")
      get() = _builder.getClientId()
      @JvmName("setClientId")
      set(value) {
        _builder.setClientId(value)
      }
    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     */
    public fun clearClientId() {
      _builder.clearClientId()
    }

    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public var clientMessage: com.google.protobuf.Any
      @JvmName("getClientMessage")
      get() = _builder.getClientMessage()
      @JvmName("setClientMessage")
      set(value) {
        _builder.setClientMessage(value)
      }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public fun clearClientMessage() {
      _builder.clearClientMessage()
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     * @return Whether the clientMessage field is set.
     */
    public fun hasClientMessage(): kotlin.Boolean {
      return _builder.hasClientMessage()
    }

    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     */
    public var signer: kotlin.String
      @JvmName("getSigner")
      get() = _builder.getSigner()
      @JvmName("setSigner")
      set(value) {
        _builder.setSigner(value)
      }
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     */
    public fun clearSigner() {
      _builder.clearSigner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Tx.MsgUpdateClient.copy(block: ibc.core.client.v1.MsgUpdateClientKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgUpdateClient =
  ibc.core.client.v1.MsgUpdateClientKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.Tx.MsgUpdateClientOrBuilder.clientMessageOrNull: com.google.protobuf.Any?
  get() = if (hasClientMessage()) getClientMessage() else null


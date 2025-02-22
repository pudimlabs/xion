//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/tx.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmName("-initializemsgSend")
public inline fun msgSend(block: cosmos.nft.v1beta1.MsgSendKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Tx.MsgSend =
  cosmos.nft.v1beta1.MsgSendKt.Dsl._create(cosmos.nft.v1beta1.Tx.MsgSend.newBuilder()).apply { block() }._build()
public object MsgSendKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.Tx.MsgSend.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.Tx.MsgSend.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.Tx.MsgSend = _builder.build()

    /**
     * <pre>
     * class_id defines the unique identifier of the nft classification, similar to the contract address of ERC721
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     */
    public var classId: kotlin.String
      @JvmName("getClassId")
      get() = _builder.getClassId()
      @JvmName("setClassId")
      set(value) {
        _builder.setClassId(value)
      }
    /**
     * <pre>
     * class_id defines the unique identifier of the nft classification, similar to the contract address of ERC721
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     */
    public fun clearClassId() {
      _builder.clearClassId()
    }

    /**
     * <pre>
     * id defines the unique identification of nft
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * id defines the unique identification of nft
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * sender is the address of the owner of nft
     * </pre>
     *
     * <code>string sender = 3 [json_name = "sender", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var sender: kotlin.String
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <pre>
     * sender is the address of the owner of nft
     * </pre>
     *
     * <code>string sender = 3 [json_name = "sender", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <pre>
     * receiver is the receiver address of nft
     * </pre>
     *
     * <code>string receiver = 4 [json_name = "receiver", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var receiver: kotlin.String
      @JvmName("getReceiver")
      get() = _builder.getReceiver()
      @JvmName("setReceiver")
      set(value) {
        _builder.setReceiver(value)
      }
    /**
     * <pre>
     * receiver is the receiver address of nft
     * </pre>
     *
     * <code>string receiver = 4 [json_name = "receiver", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearReceiver() {
      _builder.clearReceiver()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.Tx.MsgSend.copy(block: cosmos.nft.v1beta1.MsgSendKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Tx.MsgSend =
  cosmos.nft.v1beta1.MsgSendKt.Dsl._create(this.toBuilder()).apply { block() }._build()


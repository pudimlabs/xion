//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmName("-initializemsgStoreAndMigrateContractResponse")
public inline fun msgStoreAndMigrateContractResponse(block: cosmwasm.wasm.v1.MsgStoreAndMigrateContractResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse =
  cosmwasm.wasm.v1.MsgStoreAndMigrateContractResponseKt.Dsl._create(cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse.newBuilder()).apply { block() }._build()
public object MsgStoreAndMigrateContractResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse = _builder.build()

    /**
     * <pre>
     * CodeID is the reference to the stored WASM code
     * </pre>
     *
     * <code>uint64 code_id = 1 [json_name = "codeId", (.gogoproto.customname) = "CodeID"];</code>
     */
    public var codeId: kotlin.Long
      @JvmName("getCodeId")
      get() = _builder.getCodeId()
      @JvmName("setCodeId")
      set(value) {
        _builder.setCodeId(value)
      }
    /**
     * <pre>
     * CodeID is the reference to the stored WASM code
     * </pre>
     *
     * <code>uint64 code_id = 1 [json_name = "codeId", (.gogoproto.customname) = "CodeID"];</code>
     */
    public fun clearCodeId() {
      _builder.clearCodeId()
    }

    /**
     * <pre>
     * Checksum is the sha256 hash of the stored code
     * </pre>
     *
     * <code>bytes checksum = 2 [json_name = "checksum"];</code>
     */
    public var checksum: com.google.protobuf.ByteString
      @JvmName("getChecksum")
      get() = _builder.getChecksum()
      @JvmName("setChecksum")
      set(value) {
        _builder.setChecksum(value)
      }
    /**
     * <pre>
     * Checksum is the sha256 hash of the stored code
     * </pre>
     *
     * <code>bytes checksum = 2 [json_name = "checksum"];</code>
     */
    public fun clearChecksum() {
      _builder.clearChecksum()
    }

    /**
     * <pre>
     * Data contains bytes to returned from the contract
     * </pre>
     *
     * <code>bytes data = 3 [json_name = "data"];</code>
     */
    public var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * Data contains bytes to returned from the contract
     * </pre>
     *
     * <code>bytes data = 3 [json_name = "data"];</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse.copy(block: cosmwasm.wasm.v1.MsgStoreAndMigrateContractResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgStoreAndMigrateContractResponse =
  cosmwasm.wasm.v1.MsgStoreAndMigrateContractResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


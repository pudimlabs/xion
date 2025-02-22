//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmName("-initializeparams")
public inline fun params(block: cosmos.auth.v1beta1.ParamsKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.Auth.Params =
  cosmos.auth.v1beta1.ParamsKt.Dsl._create(cosmos.auth.v1beta1.Auth.Params.newBuilder()).apply { block() }._build()
public object ParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.Auth.Params.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.Auth.Params.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.Auth.Params = _builder.build()

    /**
     * <code>uint64 max_memo_characters = 1 [json_name = "maxMemoCharacters"];</code>
     */
    public var maxMemoCharacters: kotlin.Long
      @JvmName("getMaxMemoCharacters")
      get() = _builder.getMaxMemoCharacters()
      @JvmName("setMaxMemoCharacters")
      set(value) {
        _builder.setMaxMemoCharacters(value)
      }
    /**
     * <code>uint64 max_memo_characters = 1 [json_name = "maxMemoCharacters"];</code>
     */
    public fun clearMaxMemoCharacters() {
      _builder.clearMaxMemoCharacters()
    }

    /**
     * <code>uint64 tx_sig_limit = 2 [json_name = "txSigLimit"];</code>
     */
    public var txSigLimit: kotlin.Long
      @JvmName("getTxSigLimit")
      get() = _builder.getTxSigLimit()
      @JvmName("setTxSigLimit")
      set(value) {
        _builder.setTxSigLimit(value)
      }
    /**
     * <code>uint64 tx_sig_limit = 2 [json_name = "txSigLimit"];</code>
     */
    public fun clearTxSigLimit() {
      _builder.clearTxSigLimit()
    }

    /**
     * <code>uint64 tx_size_cost_per_byte = 3 [json_name = "txSizeCostPerByte"];</code>
     */
    public var txSizeCostPerByte: kotlin.Long
      @JvmName("getTxSizeCostPerByte")
      get() = _builder.getTxSizeCostPerByte()
      @JvmName("setTxSizeCostPerByte")
      set(value) {
        _builder.setTxSizeCostPerByte(value)
      }
    /**
     * <code>uint64 tx_size_cost_per_byte = 3 [json_name = "txSizeCostPerByte"];</code>
     */
    public fun clearTxSizeCostPerByte() {
      _builder.clearTxSizeCostPerByte()
    }

    /**
     * <code>uint64 sig_verify_cost_ed25519 = 4 [json_name = "sigVerifyCostEd25519", (.gogoproto.customname) = "SigVerifyCostED25519"];</code>
     */
    public var sigVerifyCostEd25519: kotlin.Long
      @JvmName("getSigVerifyCostEd25519")
      get() = _builder.getSigVerifyCostEd25519()
      @JvmName("setSigVerifyCostEd25519")
      set(value) {
        _builder.setSigVerifyCostEd25519(value)
      }
    /**
     * <code>uint64 sig_verify_cost_ed25519 = 4 [json_name = "sigVerifyCostEd25519", (.gogoproto.customname) = "SigVerifyCostED25519"];</code>
     */
    public fun clearSigVerifyCostEd25519() {
      _builder.clearSigVerifyCostEd25519()
    }

    /**
     * <code>uint64 sig_verify_cost_secp256k1 = 5 [json_name = "sigVerifyCostSecp256k1", (.gogoproto.customname) = "SigVerifyCostSecp256k1"];</code>
     */
    public var sigVerifyCostSecp256K1: kotlin.Long
      @JvmName("getSigVerifyCostSecp256K1")
      get() = _builder.getSigVerifyCostSecp256K1()
      @JvmName("setSigVerifyCostSecp256K1")
      set(value) {
        _builder.setSigVerifyCostSecp256K1(value)
      }
    /**
     * <code>uint64 sig_verify_cost_secp256k1 = 5 [json_name = "sigVerifyCostSecp256k1", (.gogoproto.customname) = "SigVerifyCostSecp256k1"];</code>
     */
    public fun clearSigVerifyCostSecp256K1() {
      _builder.clearSigVerifyCostSecp256K1()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.Auth.Params.copy(block: cosmos.auth.v1beta1.ParamsKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.Auth.Params =
  cosmos.auth.v1beta1.ParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()


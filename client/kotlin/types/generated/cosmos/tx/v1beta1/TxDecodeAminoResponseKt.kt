//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmName("-initializetxDecodeAminoResponse")
public inline fun txDecodeAminoResponse(block: cosmos.tx.v1beta1.TxDecodeAminoResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse =
  cosmos.tx.v1beta1.TxDecodeAminoResponseKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse.newBuilder()).apply { block() }._build()
public object TxDecodeAminoResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse = _builder.build()

    /**
     * <code>string amino_json = 1 [json_name = "aminoJson"];</code>
     */
    public var aminoJson: kotlin.String
      @JvmName("getAminoJson")
      get() = _builder.getAminoJson()
      @JvmName("setAminoJson")
      set(value) {
        _builder.setAminoJson(value)
      }
    /**
     * <code>string amino_json = 1 [json_name = "aminoJson"];</code>
     */
    public fun clearAminoJson() {
      _builder.clearAminoJson()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse.copy(block: cosmos.tx.v1beta1.TxDecodeAminoResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.TxDecodeAminoResponse =
  cosmos.tx.v1beta1.TxDecodeAminoResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()


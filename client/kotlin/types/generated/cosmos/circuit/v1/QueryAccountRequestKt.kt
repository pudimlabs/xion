//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/circuit/v1/query.proto

package cosmos.circuit.v1;

@kotlin.jvm.JvmName("-initializequeryAccountRequest")
public inline fun queryAccountRequest(block: cosmos.circuit.v1.QueryAccountRequestKt.Dsl.() -> kotlin.Unit): cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest =
  cosmos.circuit.v1.QueryAccountRequestKt.Dsl._create(cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest.newBuilder()).apply { block() }._build()
public object QueryAccountRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest = _builder.build()

    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest.copy(block: cosmos.circuit.v1.QueryAccountRequestKt.Dsl.() -> kotlin.Unit): cosmos.circuit.v1.QueryOuterClass.QueryAccountRequest =
  cosmos.circuit.v1.QueryAccountRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()


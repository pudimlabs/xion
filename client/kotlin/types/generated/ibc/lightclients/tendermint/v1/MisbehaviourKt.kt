//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package ibc.lightclients.tendermint.v1;

@kotlin.jvm.JvmName("-initializemisbehaviour")
public inline fun misbehaviour(block: ibc.lightclients.tendermint.v1.MisbehaviourKt.Dsl.() -> kotlin.Unit): ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour =
  ibc.lightclients.tendermint.v1.MisbehaviourKt.Dsl._create(ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour.newBuilder()).apply { block() }._build()
public object MisbehaviourKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour = _builder.build()

    /**
     * <pre>
     * ClientID is deprecated
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field clientId is deprecated") public var clientId: kotlin.String
      @JvmName("getClientId")
      get() = _builder.getClientId()
      @JvmName("setClientId")
      set(value) {
        _builder.setClientId(value)
      }
    /**
     * <pre>
     * ClientID is deprecated
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     * @deprecated ibc.lightclients.tendermint.v1.Misbehaviour.client_id is deprecated.
     *     See ibc/lightclients/tendermint/v1/tendermint.proto;l=70
     */
    public fun clearClientId() {
      _builder.clearClientId()
    }

    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1"];</code>
     */
    public var header1: ibc.lightclients.tendermint.v1.Tendermint.Header
      @JvmName("getHeader1")
      get() = _builder.getHeader1()
      @JvmName("setHeader1")
      set(value) {
        _builder.setHeader1(value)
      }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1"];</code>
     */
    public fun clearHeader1() {
      _builder.clearHeader1()
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1"];</code>
     * @return Whether the header1 field is set.
     */
    public fun hasHeader1(): kotlin.Boolean {
      return _builder.hasHeader1()
    }

    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2"];</code>
     */
    public var header2: ibc.lightclients.tendermint.v1.Tendermint.Header
      @JvmName("getHeader2")
      get() = _builder.getHeader2()
      @JvmName("setHeader2")
      set(value) {
        _builder.setHeader2(value)
      }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2"];</code>
     */
    public fun clearHeader2() {
      _builder.clearHeader2()
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2"];</code>
     * @return Whether the header2 field is set.
     */
    public fun hasHeader2(): kotlin.Boolean {
      return _builder.hasHeader2()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour.copy(block: ibc.lightclients.tendermint.v1.MisbehaviourKt.Dsl.() -> kotlin.Unit): ibc.lightclients.tendermint.v1.Tendermint.Misbehaviour =
  ibc.lightclients.tendermint.v1.MisbehaviourKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.lightclients.tendermint.v1.Tendermint.MisbehaviourOrBuilder.header1OrNull: ibc.lightclients.tendermint.v1.Tendermint.Header?
  get() = if (hasHeader1()) getHeader1() else null

public val ibc.lightclients.tendermint.v1.Tendermint.MisbehaviourOrBuilder.header2OrNull: ibc.lightclients.tendermint.v1.Tendermint.Header?
  get() = if (hasHeader2()) getHeader2() else null


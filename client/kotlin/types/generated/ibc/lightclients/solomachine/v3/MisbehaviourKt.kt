//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v3/solomachine.proto

package ibc.lightclients.solomachine.v3;

@kotlin.jvm.JvmName("-initializemisbehaviour")
public inline fun misbehaviour(block: ibc.lightclients.solomachine.v3.MisbehaviourKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour =
  ibc.lightclients.solomachine.v3.MisbehaviourKt.Dsl._create(ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour.newBuilder()).apply { block() }._build()
public object MisbehaviourKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour = _builder.build()

    /**
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     */
    public var sequence: kotlin.Long
      @JvmName("getSequence")
      get() = _builder.getSequence()
      @JvmName("setSequence")
      set(value) {
        _builder.setSequence(value)
      }
    /**
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     */
    public fun clearSequence() {
      _builder.clearSequence()
    }

    /**
     * <code>.ibc.lightclients.solomachine.v3.SignatureAndData signature_one = 2 [json_name = "signatureOne"];</code>
     */
    public var signatureOne: ibc.lightclients.solomachine.v3.Solomachine.SignatureAndData
      @JvmName("getSignatureOne")
      get() = _builder.getSignatureOne()
      @JvmName("setSignatureOne")
      set(value) {
        _builder.setSignatureOne(value)
      }
    /**
     * <code>.ibc.lightclients.solomachine.v3.SignatureAndData signature_one = 2 [json_name = "signatureOne"];</code>
     */
    public fun clearSignatureOne() {
      _builder.clearSignatureOne()
    }
    /**
     * <code>.ibc.lightclients.solomachine.v3.SignatureAndData signature_one = 2 [json_name = "signatureOne"];</code>
     * @return Whether the signatureOne field is set.
     */
    public fun hasSignatureOne(): kotlin.Boolean {
      return _builder.hasSignatureOne()
    }

    /**
     * <code>.ibc.lightclients.solomachine.v3.SignatureAndData signature_two = 3 [json_name = "signatureTwo"];</code>
     */
    public var signatureTwo: ibc.lightclients.solomachine.v3.Solomachine.SignatureAndData
      @JvmName("getSignatureTwo")
      get() = _builder.getSignatureTwo()
      @JvmName("setSignatureTwo")
      set(value) {
        _builder.setSignatureTwo(value)
      }
    /**
     * <code>.ibc.lightclients.solomachine.v3.SignatureAndData signature_two = 3 [json_name = "signatureTwo"];</code>
     */
    public fun clearSignatureTwo() {
      _builder.clearSignatureTwo()
    }
    /**
     * <code>.ibc.lightclients.solomachine.v3.SignatureAndData signature_two = 3 [json_name = "signatureTwo"];</code>
     * @return Whether the signatureTwo field is set.
     */
    public fun hasSignatureTwo(): kotlin.Boolean {
      return _builder.hasSignatureTwo()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour.copy(block: ibc.lightclients.solomachine.v3.MisbehaviourKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v3.Solomachine.Misbehaviour =
  ibc.lightclients.solomachine.v3.MisbehaviourKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.lightclients.solomachine.v3.Solomachine.MisbehaviourOrBuilder.signatureOneOrNull: ibc.lightclients.solomachine.v3.Solomachine.SignatureAndData?
  get() = if (hasSignatureOne()) getSignatureOne() else null

public val ibc.lightclients.solomachine.v3.Solomachine.MisbehaviourOrBuilder.signatureTwoOrNull: ibc.lightclients.solomachine.v3.Solomachine.SignatureAndData?
  get() = if (hasSignatureTwo()) getSignatureTwo() else null


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmName("-initializetx")
public inline fun tx(block: cosmos.tx.v1beta1.TxKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.TxOuterClass.Tx =
  cosmos.tx.v1beta1.TxKt.Dsl._create(cosmos.tx.v1beta1.TxOuterClass.Tx.newBuilder()).apply { block() }._build()
public object TxKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.TxOuterClass.Tx.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.TxOuterClass.Tx.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.TxOuterClass.Tx = _builder.build()

    /**
     * <pre>
     * body is the processable content of the transaction
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.TxBody body = 1 [json_name = "body"];</code>
     */
    public var body: cosmos.tx.v1beta1.TxOuterClass.TxBody
      @JvmName("getBody")
      get() = _builder.getBody()
      @JvmName("setBody")
      set(value) {
        _builder.setBody(value)
      }
    /**
     * <pre>
     * body is the processable content of the transaction
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.TxBody body = 1 [json_name = "body"];</code>
     */
    public fun clearBody() {
      _builder.clearBody()
    }
    /**
     * <pre>
     * body is the processable content of the transaction
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.TxBody body = 1 [json_name = "body"];</code>
     * @return Whether the body field is set.
     */
    public fun hasBody(): kotlin.Boolean {
      return _builder.hasBody()
    }

    /**
     * <pre>
     * auth_info is the authorization related content of the transaction,
     * specifically signers, signer modes and fee
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.AuthInfo auth_info = 2 [json_name = "authInfo"];</code>
     */
    public var authInfo: cosmos.tx.v1beta1.TxOuterClass.AuthInfo
      @JvmName("getAuthInfo")
      get() = _builder.getAuthInfo()
      @JvmName("setAuthInfo")
      set(value) {
        _builder.setAuthInfo(value)
      }
    /**
     * <pre>
     * auth_info is the authorization related content of the transaction,
     * specifically signers, signer modes and fee
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.AuthInfo auth_info = 2 [json_name = "authInfo"];</code>
     */
    public fun clearAuthInfo() {
      _builder.clearAuthInfo()
    }
    /**
     * <pre>
     * auth_info is the authorization related content of the transaction,
     * specifically signers, signer modes and fee
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.AuthInfo auth_info = 2 [json_name = "authInfo"];</code>
     * @return Whether the authInfo field is set.
     */
    public fun hasAuthInfo(): kotlin.Boolean {
      return _builder.hasAuthInfo()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SignaturesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     */
     public val signatures: com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSignaturesList()
      )
    /**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     * @param value The signatures to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSignatures")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>.add(value: com.google.protobuf.ByteString) {
      _builder.addSignatures(value)
    }/**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     * @param value The signatures to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSignatures")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>.plusAssign(value: com.google.protobuf.ByteString) {
      add(value)
    }/**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     * @param values The signatures to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSignatures")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      _builder.addAllSignatures(values)
    }/**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     * @param values The signatures to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSignatures")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      addAll(values)
    }/**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     * @param index The index to set the value at.
     * @param value The signatures to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSignatures")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>.set(index: kotlin.Int, value: com.google.protobuf.ByteString) {
      _builder.setSignatures(index, value)
    }/**
     * <pre>
     * signatures is a list of signatures that matches the length and order of
     * AuthInfo's signer_infos to allow connecting signature meta information like
     * public key and signing mode by position.
     * </pre>
     *
     * <code>repeated bytes signatures = 3 [json_name = "signatures"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSignatures")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, SignaturesProxy>.clear() {
      _builder.clearSignatures()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.TxOuterClass.Tx.copy(block: cosmos.tx.v1beta1.TxKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.TxOuterClass.Tx =
  cosmos.tx.v1beta1.TxKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.tx.v1beta1.TxOuterClass.TxOrBuilder.bodyOrNull: cosmos.tx.v1beta1.TxOuterClass.TxBody?
  get() = if (hasBody()) getBody() else null

public val cosmos.tx.v1beta1.TxOuterClass.TxOrBuilder.authInfoOrNull: cosmos.tx.v1beta1.TxOuterClass.AuthInfo?
  get() = if (hasAuthInfo()) getAuthInfo() else null


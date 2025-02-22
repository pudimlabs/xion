//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmName("-initializemoduleCredential")
public inline fun moduleCredential(block: cosmos.auth.v1beta1.ModuleCredentialKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.Auth.ModuleCredential =
  cosmos.auth.v1beta1.ModuleCredentialKt.Dsl._create(cosmos.auth.v1beta1.Auth.ModuleCredential.newBuilder()).apply { block() }._build()
public object ModuleCredentialKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.Auth.ModuleCredential.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.Auth.ModuleCredential.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.Auth.ModuleCredential = _builder.build()

    /**
     * <pre>
     * module_name is the name of the module used for address derivation (passed into address.Module).
     * </pre>
     *
     * <code>string module_name = 1 [json_name = "moduleName"];</code>
     */
    public var moduleName: kotlin.String
      @JvmName("getModuleName")
      get() = _builder.getModuleName()
      @JvmName("setModuleName")
      set(value) {
        _builder.setModuleName(value)
      }
    /**
     * <pre>
     * module_name is the name of the module used for address derivation (passed into address.Module).
     * </pre>
     *
     * <code>string module_name = 1 [json_name = "moduleName"];</code>
     */
    public fun clearModuleName() {
      _builder.clearModuleName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DerivationKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     */
     public val derivationKeys: com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDerivationKeysList()
      )
    /**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     * @param value The derivationKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDerivationKeys")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>.add(value: com.google.protobuf.ByteString) {
      _builder.addDerivationKeys(value)
    }/**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     * @param value The derivationKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDerivationKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>.plusAssign(value: com.google.protobuf.ByteString) {
      add(value)
    }/**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     * @param values The derivationKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDerivationKeys")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      _builder.addAllDerivationKeys(values)
    }/**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     * @param values The derivationKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDerivationKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      addAll(values)
    }/**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     * @param index The index to set the value at.
     * @param value The derivationKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDerivationKeys")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>.set(index: kotlin.Int, value: com.google.protobuf.ByteString) {
      _builder.setDerivationKeys(index, value)
    }/**
     * <pre>
     * derivation_keys is for deriving a module account address (passed into address.Module)
     * adding more keys creates sub-account addresses (passed into address.Derive)
     * </pre>
     *
     * <code>repeated bytes derivation_keys = 2 [json_name = "derivationKeys"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDerivationKeys")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, DerivationKeysProxy>.clear() {
      _builder.clearDerivationKeys()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.Auth.ModuleCredential.copy(block: cosmos.auth.v1beta1.ModuleCredentialKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.Auth.ModuleCredential =
  cosmos.auth.v1beta1.ModuleCredentialKt.Dsl._create(this.toBuilder()).apply { block() }._build()


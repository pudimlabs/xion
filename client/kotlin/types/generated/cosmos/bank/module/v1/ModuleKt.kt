//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/module/v1/module.proto

package cosmos.bank.module.v1;

@kotlin.jvm.JvmName("-initializemodule")
public inline fun module(block: cosmos.bank.module.v1.ModuleKt.Dsl.() -> kotlin.Unit): cosmos.bank.module.v1.ModuleOuterClass.Module =
  cosmos.bank.module.v1.ModuleKt.Dsl._create(cosmos.bank.module.v1.ModuleOuterClass.Module.newBuilder()).apply { block() }._build()
public object ModuleKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.module.v1.ModuleOuterClass.Module.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.module.v1.ModuleOuterClass.Module.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.module.v1.ModuleOuterClass.Module = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class BlockedModuleAccountsOverrideProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     * @return A list containing the blockedModuleAccountsOverride.
     */
    public val blockedModuleAccountsOverride: com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getBlockedModuleAccountsOverrideList()
      )
    /**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     * @param value The blockedModuleAccountsOverride to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addBlockedModuleAccountsOverride")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>.add(value: kotlin.String) {
      _builder.addBlockedModuleAccountsOverride(value)
    }
    /**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     * @param value The blockedModuleAccountsOverride to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignBlockedModuleAccountsOverride")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     * @param values The blockedModuleAccountsOverride to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllBlockedModuleAccountsOverride")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllBlockedModuleAccountsOverride(values)
    }
    /**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     * @param values The blockedModuleAccountsOverride to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllBlockedModuleAccountsOverride")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     * @param index The index to set the value at.
     * @param value The blockedModuleAccountsOverride to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setBlockedModuleAccountsOverride")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setBlockedModuleAccountsOverride(index, value)
    }/**
     * <pre>
     * blocked_module_accounts_override configures exceptional module accounts which should be blocked from receiving
     * funds. If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1 [json_name = "blockedModuleAccountsOverride"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearBlockedModuleAccountsOverride")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, BlockedModuleAccountsOverrideProxy>.clear() {
      _builder.clearBlockedModuleAccountsOverride()
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2 [json_name = "authority"];</code>
     */
    public var authority: kotlin.String
      @JvmName("getAuthority")
      get() = _builder.getAuthority()
      @JvmName("setAuthority")
      set(value) {
        _builder.setAuthority(value)
      }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2 [json_name = "authority"];</code>
     */
    public fun clearAuthority() {
      _builder.clearAuthority()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RestrictionsOrderProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     * @return A list containing the restrictionsOrder.
     */
    public val restrictionsOrder: com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRestrictionsOrderList()
      )
    /**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     * @param value The restrictionsOrder to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRestrictionsOrder")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>.add(value: kotlin.String) {
      _builder.addRestrictionsOrder(value)
    }
    /**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     * @param value The restrictionsOrder to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRestrictionsOrder")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     * @param values The restrictionsOrder to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRestrictionsOrder")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllRestrictionsOrder(values)
    }
    /**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     * @param values The restrictionsOrder to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRestrictionsOrder")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     * @param index The index to set the value at.
     * @param value The restrictionsOrder to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRestrictionsOrder")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setRestrictionsOrder(index, value)
    }/**
     * <pre>
     * restrictions_order specifies the order of send restrictions and should be
     * a list of module names which provide a send restriction instance. If no
     * order is provided, then restrictions will be applied in alphabetical order
     * of module names.
     * </pre>
     *
     * <code>repeated string restrictions_order = 3 [json_name = "restrictionsOrder"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRestrictionsOrder")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, RestrictionsOrderProxy>.clear() {
      _builder.clearRestrictionsOrder()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.module.v1.ModuleOuterClass.Module.copy(block: cosmos.bank.module.v1.ModuleKt.Dsl.() -> kotlin.Unit): cosmos.bank.module.v1.ModuleOuterClass.Module =
  cosmos.bank.module.v1.ModuleKt.Dsl._create(this.toBuilder()).apply { block() }._build()


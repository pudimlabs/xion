//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmName("-initializequerySendEnabledResponse")
public inline fun querySendEnabledResponse(block: cosmos.bank.v1beta1.QuerySendEnabledResponseKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse =
  cosmos.bank.v1beta1.QuerySendEnabledResponseKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse.newBuilder()).apply { block() }._build()
public object QuerySendEnabledResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SendEnabledProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     */
     public val sendEnabled: com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSendEnabledList()
      )
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     * @param value The sendEnabled to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSendEnabled")
    public fun com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>.add(value: cosmos.bank.v1beta1.Bank.SendEnabled) {
      _builder.addSendEnabled(value)
    }
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     * @param value The sendEnabled to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSendEnabled")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>.plusAssign(value: cosmos.bank.v1beta1.Bank.SendEnabled) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     * @param values The sendEnabled to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSendEnabled")
    public fun com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>.addAll(values: kotlin.collections.Iterable<cosmos.bank.v1beta1.Bank.SendEnabled>) {
      _builder.addAllSendEnabled(values)
    }
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     * @param values The sendEnabled to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSendEnabled")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.bank.v1beta1.Bank.SendEnabled>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     * @param index The index to set the value at.
     * @param value The sendEnabled to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSendEnabled")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>.set(index: kotlin.Int, value: cosmos.bank.v1beta1.Bank.SendEnabled) {
      _builder.setSendEnabled(index, value)
    }
    /**
     * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSendEnabled")
    public fun com.google.protobuf.kotlin.DslList<cosmos.bank.v1beta1.Bank.SendEnabled, SendEnabledProxy>.clear() {
      _builder.clearSendEnabled()
    }


    /**
     * <pre>
     * pagination defines the pagination in the response. This field is only
     * populated if the denoms field in the request is empty.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 99 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response. This field is only
     * populated if the denoms field in the request is empty.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 99 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response. This field is only
     * populated if the denoms field in the request is empty.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 99 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse.copy(block: cosmos.bank.v1beta1.QuerySendEnabledResponseKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse =
  cosmos.bank.v1beta1.QuerySendEnabledResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null


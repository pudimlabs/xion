//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/fee.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmName("-initializeidentifiedPacketFees")
public inline fun identifiedPacketFees(block: ibc.applications.fee.v1.IdentifiedPacketFeesKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees =
  ibc.applications.fee.v1.IdentifiedPacketFeesKt.Dsl._create(ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees.newBuilder()).apply { block() }._build()
public object IdentifiedPacketFeesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees = _builder.build()

    /**
     * <pre>
     * unique packet identifier comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [json_name = "packetId", (.gogoproto.nullable) = false];</code>
     */
    public var packetId: ibc.core.channel.v1.ChannelOuterClass.PacketId
      @JvmName("getPacketId")
      get() = _builder.getPacketId()
      @JvmName("setPacketId")
      set(value) {
        _builder.setPacketId(value)
      }
    /**
     * <pre>
     * unique packet identifier comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [json_name = "packetId", (.gogoproto.nullable) = false];</code>
     */
    public fun clearPacketId() {
      _builder.clearPacketId()
    }
    /**
     * <pre>
     * unique packet identifier comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [json_name = "packetId", (.gogoproto.nullable) = false];</code>
     * @return Whether the packetId field is set.
     */
    public fun hasPacketId(): kotlin.Boolean {
      return _builder.hasPacketId()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PacketFeesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     */
     public val packetFees: com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPacketFeesList()
      )
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     * @param value The packetFees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPacketFees")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>.add(value: ibc.applications.fee.v1.FeeOuterClass.PacketFee) {
      _builder.addPacketFees(value)
    }
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     * @param value The packetFees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPacketFees")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>.plusAssign(value: ibc.applications.fee.v1.FeeOuterClass.PacketFee) {
      add(value)
    }
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     * @param values The packetFees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPacketFees")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>.addAll(values: kotlin.collections.Iterable<ibc.applications.fee.v1.FeeOuterClass.PacketFee>) {
      _builder.addAllPacketFees(values)
    }
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     * @param values The packetFees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPacketFees")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.applications.fee.v1.FeeOuterClass.PacketFee>) {
      addAll(values)
    }
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The packetFees to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPacketFees")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>.set(index: kotlin.Int, value: ibc.applications.fee.v1.FeeOuterClass.PacketFee) {
      _builder.setPacketFees(index, value)
    }
    /**
     * <pre>
     * list of packet fees
     * </pre>
     *
     * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 2 [json_name = "packetFees", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPacketFees")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.fee.v1.FeeOuterClass.PacketFee, PacketFeesProxy>.clear() {
      _builder.clearPacketFees()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees.copy(block: ibc.applications.fee.v1.IdentifiedPacketFeesKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFees =
  ibc.applications.fee.v1.IdentifiedPacketFeesKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.applications.fee.v1.FeeOuterClass.IdentifiedPacketFeesOrBuilder.packetIdOrNull: ibc.core.channel.v1.ChannelOuterClass.PacketId?
  get() = if (hasPacketId()) getPacketId() else null


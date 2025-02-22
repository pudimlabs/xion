//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/query/v1alpha1/query.proto

package cosmos.orm.query.v1alpha1;

@kotlin.jvm.JvmName("-initializeindexValue")
public inline fun indexValue(block: cosmos.orm.query.v1alpha1.IndexValueKt.Dsl.() -> kotlin.Unit): cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue =
  cosmos.orm.query.v1alpha1.IndexValueKt.Dsl._create(cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue.newBuilder()).apply { block() }._build()
public object IndexValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue = _builder.build()

    /**
     * <pre>
     * uint specifies a value for an uint32, fixed32, uint64, or fixed64
     * index field.
     * </pre>
     *
     * <code>uint64 uint = 1 [json_name = "uint"];</code>
     */
    public var uint: kotlin.Long
      @JvmName("getUint")
      get() = _builder.getUint()
      @JvmName("setUint")
      set(value) {
        _builder.setUint(value)
      }
    /**
     * <pre>
     * uint specifies a value for an uint32, fixed32, uint64, or fixed64
     * index field.
     * </pre>
     *
     * <code>uint64 uint = 1 [json_name = "uint"];</code>
     */
    public fun clearUint() {
      _builder.clearUint()
    }
    /**
     * <pre>
     * uint specifies a value for an uint32, fixed32, uint64, or fixed64
     * index field.
     * </pre>
     *
     * <code>uint64 uint = 1 [json_name = "uint"];</code>
     * @return Whether the uint field is set.
     */
    public fun hasUint(): kotlin.Boolean {
      return _builder.hasUint()
    }

    /**
     * <pre>
     * int64 specifies a value for an int32, sfixed32, int64, or sfixed64
     * index field.
     * </pre>
     *
     * <code>int64 int = 2 [json_name = "int"];</code>
     */
    public var int: kotlin.Long
      @JvmName("getInt")
      get() = _builder.getInt()
      @JvmName("setInt")
      set(value) {
        _builder.setInt(value)
      }
    /**
     * <pre>
     * int64 specifies a value for an int32, sfixed32, int64, or sfixed64
     * index field.
     * </pre>
     *
     * <code>int64 int = 2 [json_name = "int"];</code>
     */
    public fun clearInt() {
      _builder.clearInt()
    }
    /**
     * <pre>
     * int64 specifies a value for an int32, sfixed32, int64, or sfixed64
     * index field.
     * </pre>
     *
     * <code>int64 int = 2 [json_name = "int"];</code>
     * @return Whether the int field is set.
     */
    public fun hasInt(): kotlin.Boolean {
      return _builder.hasInt()
    }

    /**
     * <pre>
     * str specifies a value for a string index field.
     * </pre>
     *
     * <code>string str = 3 [json_name = "str"];</code>
     */
    public var str: kotlin.String
      @JvmName("getStr")
      get() = _builder.getStr()
      @JvmName("setStr")
      set(value) {
        _builder.setStr(value)
      }
    /**
     * <pre>
     * str specifies a value for a string index field.
     * </pre>
     *
     * <code>string str = 3 [json_name = "str"];</code>
     */
    public fun clearStr() {
      _builder.clearStr()
    }
    /**
     * <pre>
     * str specifies a value for a string index field.
     * </pre>
     *
     * <code>string str = 3 [json_name = "str"];</code>
     * @return Whether the str field is set.
     */
    public fun hasStr(): kotlin.Boolean {
      return _builder.hasStr()
    }

    /**
     * <pre>
     * bytes specifies a value for a bytes index field.
     * </pre>
     *
     * <code>bytes bytes = 4 [json_name = "bytes"];</code>
     */
    public var bytes: com.google.protobuf.ByteString
      @JvmName("getBytes")
      get() = _builder.getBytes()
      @JvmName("setBytes")
      set(value) {
        _builder.setBytes(value)
      }
    /**
     * <pre>
     * bytes specifies a value for a bytes index field.
     * </pre>
     *
     * <code>bytes bytes = 4 [json_name = "bytes"];</code>
     */
    public fun clearBytes() {
      _builder.clearBytes()
    }
    /**
     * <pre>
     * bytes specifies a value for a bytes index field.
     * </pre>
     *
     * <code>bytes bytes = 4 [json_name = "bytes"];</code>
     * @return Whether the bytes field is set.
     */
    public fun hasBytes(): kotlin.Boolean {
      return _builder.hasBytes()
    }

    /**
     * <pre>
     * enum specifies a value for an enum index field.
     * </pre>
     *
     * <code>string enum = 5 [json_name = "enum"];</code>
     */
    public var enum: kotlin.String
      @JvmName("getEnum")
      get() = _builder.getEnum()
      @JvmName("setEnum")
      set(value) {
        _builder.setEnum(value)
      }
    /**
     * <pre>
     * enum specifies a value for an enum index field.
     * </pre>
     *
     * <code>string enum = 5 [json_name = "enum"];</code>
     */
    public fun clearEnum() {
      _builder.clearEnum()
    }
    /**
     * <pre>
     * enum specifies a value for an enum index field.
     * </pre>
     *
     * <code>string enum = 5 [json_name = "enum"];</code>
     * @return Whether the enum field is set.
     */
    public fun hasEnum(): kotlin.Boolean {
      return _builder.hasEnum()
    }

    /**
     * <pre>
     * bool specifies a value for a bool index field.
     * </pre>
     *
     * <code>bool bool = 6 [json_name = "bool"];</code>
     */
    public var bool: kotlin.Boolean
      @JvmName("getBool")
      get() = _builder.getBool()
      @JvmName("setBool")
      set(value) {
        _builder.setBool(value)
      }
    /**
     * <pre>
     * bool specifies a value for a bool index field.
     * </pre>
     *
     * <code>bool bool = 6 [json_name = "bool"];</code>
     */
    public fun clearBool() {
      _builder.clearBool()
    }
    /**
     * <pre>
     * bool specifies a value for a bool index field.
     * </pre>
     *
     * <code>bool bool = 6 [json_name = "bool"];</code>
     * @return Whether the bool field is set.
     */
    public fun hasBool(): kotlin.Boolean {
      return _builder.hasBool()
    }

    /**
     * <pre>
     * timestamp specifies a value for a timestamp index field.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 7 [json_name = "timestamp"];</code>
     */
    public var timestamp: com.google.protobuf.Timestamp
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <pre>
     * timestamp specifies a value for a timestamp index field.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 7 [json_name = "timestamp"];</code>
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
    /**
     * <pre>
     * timestamp specifies a value for a timestamp index field.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 7 [json_name = "timestamp"];</code>
     * @return Whether the timestamp field is set.
     */
    public fun hasTimestamp(): kotlin.Boolean {
      return _builder.hasTimestamp()
    }

    /**
     * <pre>
     * duration specifies a value for a duration index field.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 8 [json_name = "duration"];</code>
     */
    public var duration: com.google.protobuf.Duration
      @JvmName("getDuration")
      get() = _builder.getDuration()
      @JvmName("setDuration")
      set(value) {
        _builder.setDuration(value)
      }
    /**
     * <pre>
     * duration specifies a value for a duration index field.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 8 [json_name = "duration"];</code>
     */
    public fun clearDuration() {
      _builder.clearDuration()
    }
    /**
     * <pre>
     * duration specifies a value for a duration index field.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 8 [json_name = "duration"];</code>
     * @return Whether the duration field is set.
     */
    public fun hasDuration(): kotlin.Boolean {
      return _builder.hasDuration()
    }
    public val valueCase: cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue.ValueCase
      @JvmName("getValueCase")
      get() = _builder.getValueCase()

    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue.copy(block: cosmos.orm.query.v1alpha1.IndexValueKt.Dsl.() -> kotlin.Unit): cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValue =
  cosmos.orm.query.v1alpha1.IndexValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValueOrBuilder.timestampOrNull: com.google.protobuf.Timestamp?
  get() = if (hasTimestamp()) getTimestamp() else null

public val cosmos.orm.query.v1alpha1.QueryOuterClass.IndexValueOrBuilder.durationOrNull: com.google.protobuf.Duration?
  get() = if (hasDuration()) getDuration() else null


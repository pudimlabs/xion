//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/genesis.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: cosmos.nft.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Genesis.GenesisState =
  cosmos.nft.v1beta1.GenesisStateKt.Dsl._create(cosmos.nft.v1beta1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.Genesis.GenesisState = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ClassesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     */
     public val classes: com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getClassesList()
      )
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     * @param value The classes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addClasses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>.add(value: cosmos.nft.v1beta1.Nft.Class) {
      _builder.addClasses(value)
    }
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     * @param value The classes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignClasses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>.plusAssign(value: cosmos.nft.v1beta1.Nft.Class) {
      add(value)
    }
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     * @param values The classes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllClasses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.nft.v1beta1.Nft.Class>) {
      _builder.addAllClasses(values)
    }
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     * @param values The classes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllClasses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.nft.v1beta1.Nft.Class>) {
      addAll(values)
    }
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     * @param index The index to set the value at.
     * @param value The classes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setClasses")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>.set(index: kotlin.Int, value: cosmos.nft.v1beta1.Nft.Class) {
      _builder.setClasses(index, value)
    }
    /**
     * <pre>
     * class defines the class of the nft type.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Class classes = 1 [json_name = "classes"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearClasses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Nft.Class, ClassesProxy>.clear() {
      _builder.clearClasses()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EntriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     */
     public val entries: com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEntriesList()
      )
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     * @param value The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEntries")
    public fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>.add(value: cosmos.nft.v1beta1.Genesis.Entry) {
      _builder.addEntries(value)
    }
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     * @param value The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEntries")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>.plusAssign(value: cosmos.nft.v1beta1.Genesis.Entry) {
      add(value)
    }
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     * @param values The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEntries")
    public fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.nft.v1beta1.Genesis.Entry>) {
      _builder.addAllEntries(values)
    }
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     * @param values The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEntries")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.nft.v1beta1.Genesis.Entry>) {
      addAll(values)
    }
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     * @param index The index to set the value at.
     * @param value The entries to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEntries")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>.set(index: kotlin.Int, value: cosmos.nft.v1beta1.Genesis.Entry) {
      _builder.setEntries(index, value)
    }
    /**
     * <pre>
     * entry defines all nft owned by a person.
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.Entry entries = 2 [json_name = "entries"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEntries")
    public fun com.google.protobuf.kotlin.DslList<cosmos.nft.v1beta1.Genesis.Entry, EntriesProxy>.clear() {
      _builder.clearEntries()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.Genesis.GenesisState.copy(block: cosmos.nft.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Genesis.GenesisState =
  cosmos.nft.v1beta1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()


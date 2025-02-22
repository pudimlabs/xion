//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/v1alpha1/schema.proto

package cosmos.orm.v1alpha1;

@kotlin.jvm.JvmName("-initializemoduleSchemaDescriptor")
public inline fun moduleSchemaDescriptor(block: cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor =
  cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.Dsl._create(cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.newBuilder()).apply { block() }._build()
public object ModuleSchemaDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SchemaFileProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     */
     public val schemaFile: com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSchemaFileList()
      )
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     * @param value The schemaFile to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSchemaFile")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>.add(value: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry) {
      _builder.addSchemaFile(value)
    }
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     * @param value The schemaFile to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSchemaFile")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>.plusAssign(value: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     * @param values The schemaFile to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSchemaFile")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>.addAll(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry>) {
      _builder.addAllSchemaFile(values)
    }
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     * @param values The schemaFile to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSchemaFile")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     * @param index The index to set the value at.
     * @param value The schemaFile to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSchemaFile")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>.set(index: kotlin.Int, value: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry) {
      _builder.setSchemaFile(index, value)
    }
    /**
     * <code>repeated .cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry schema_file = 1 [json_name = "schemaFile"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSchemaFile")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry, SchemaFileProxy>.clear() {
      _builder.clearSchemaFile()
    }


    /**
     * <pre>
     * prefix is an optional prefix that precedes all keys in this module's
     * store.
     * </pre>
     *
     * <code>bytes prefix = 2 [json_name = "prefix"];</code>
     */
    public var prefix: com.google.protobuf.ByteString
      @JvmName("getPrefix")
      get() = _builder.getPrefix()
      @JvmName("setPrefix")
      set(value) {
        _builder.setPrefix(value)
      }
    /**
     * <pre>
     * prefix is an optional prefix that precedes all keys in this module's
     * store.
     * </pre>
     *
     * <code>bytes prefix = 2 [json_name = "prefix"];</code>
     */
    public fun clearPrefix() {
      _builder.clearPrefix()
    }
  }
  @kotlin.jvm.JvmName("-initializefileEntry")
  public inline fun fileEntry(block: cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.FileEntryKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry =
    cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.FileEntryKt.Dsl._create(cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry.newBuilder()).apply { block() }._build()
  public object FileEntryKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry = _builder.build()

      /**
       * <pre>
       * id is a prefix that will be varint encoded and prepended to all the
       * table keys specified in the file's tables.
       * </pre>
       *
       * <code>uint32 id = 1 [json_name = "id"];</code>
       */
      public var id: kotlin.Int
        @JvmName("getId")
        get() = _builder.getId()
        @JvmName("setId")
        set(value) {
          _builder.setId(value)
        }
      /**
       * <pre>
       * id is a prefix that will be varint encoded and prepended to all the
       * table keys specified in the file's tables.
       * </pre>
       *
       * <code>uint32 id = 1 [json_name = "id"];</code>
       */
      public fun clearId() {
        _builder.clearId()
      }

      /**
       * <pre>
       * proto_file_name is the name of a file .proto in that contains
       * table definitions. The .proto file must be in a package that the
       * module has referenced using cosmos.app.v1.ModuleDescriptor.use_package.
       * </pre>
       *
       * <code>string proto_file_name = 2 [json_name = "protoFileName"];</code>
       */
      public var protoFileName: kotlin.String
        @JvmName("getProtoFileName")
        get() = _builder.getProtoFileName()
        @JvmName("setProtoFileName")
        set(value) {
          _builder.setProtoFileName(value)
        }
      /**
       * <pre>
       * proto_file_name is the name of a file .proto in that contains
       * table definitions. The .proto file must be in a package that the
       * module has referenced using cosmos.app.v1.ModuleDescriptor.use_package.
       * </pre>
       *
       * <code>string proto_file_name = 2 [json_name = "protoFileName"];</code>
       */
      public fun clearProtoFileName() {
        _builder.clearProtoFileName()
      }

      /**
       * <pre>
       * storage_type optionally indicates the type of storage this file's
       * tables should used. If it is left unspecified, the default KV-storage
       * of the app will be used.
       * </pre>
       *
       * <code>.cosmos.orm.v1alpha1.StorageType storage_type = 3 [json_name = "storageType"];</code>
       */
      public var storageType: cosmos.orm.v1alpha1.Schema.StorageType
        @JvmName("getStorageType")
        get() = _builder.getStorageType()
        @JvmName("setStorageType")
        set(value) {
          _builder.setStorageType(value)
        }
      /**
       * <pre>
       * storage_type optionally indicates the type of storage this file's
       * tables should used. If it is left unspecified, the default KV-storage
       * of the app will be used.
       * </pre>
       *
       * <code>.cosmos.orm.v1alpha1.StorageType storage_type = 3 [json_name = "storageType"];</code>
       */
      public fun clearStorageType() {
        _builder.clearStorageType()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.copy(block: cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor =
  cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry.copy(block: cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.FileEntryKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.ModuleSchemaDescriptor.FileEntry =
  cosmos.orm.v1alpha1.ModuleSchemaDescriptorKt.FileEntryKt.Dsl._create(this.toBuilder()).apply { block() }._build()


//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/store/snapshots/v1/snapshot.proto

package cosmos.store.snapshots.v1;

@kotlin.jvm.JvmName("-initializemetadata")
public inline fun metadata(block: cosmos.store.snapshots.v1.MetadataKt.Dsl.() -> kotlin.Unit): cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata =
  cosmos.store.snapshots.v1.MetadataKt.Dsl._create(cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata.newBuilder()).apply { block() }._build()
public object MetadataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ChunkHashesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     */
     public val chunkHashes: com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getChunkHashesList()
      )
    /**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     * @param value The chunkHashes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addChunkHashes")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>.add(value: com.google.protobuf.ByteString) {
      _builder.addChunkHashes(value)
    }/**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     * @param value The chunkHashes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignChunkHashes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>.plusAssign(value: com.google.protobuf.ByteString) {
      add(value)
    }/**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     * @param values The chunkHashes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllChunkHashes")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      _builder.addAllChunkHashes(values)
    }/**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     * @param values The chunkHashes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllChunkHashes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      addAll(values)
    }/**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     * @param index The index to set the value at.
     * @param value The chunkHashes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setChunkHashes")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>.set(index: kotlin.Int, value: com.google.protobuf.ByteString) {
      _builder.setChunkHashes(index, value)
    }/**
     * <pre>
     * SHA-256 chunk hashes
     * </pre>
     *
     * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearChunkHashes")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ChunkHashesProxy>.clear() {
      _builder.clearChunkHashes()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata.copy(block: cosmos.store.snapshots.v1.MetadataKt.Dsl.() -> kotlin.Unit): cosmos.store.snapshots.v1.SnapshotOuterClass.Metadata =
  cosmos.store.snapshots.v1.MetadataKt.Dsl._create(this.toBuilder()).apply { block() }._build()


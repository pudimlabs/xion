//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/commitment/v1/commitment.proto

package ibc.core.commitment.v1;

@kotlin.jvm.JvmName("-initializemerklePrefix")
public inline fun merklePrefix(block: ibc.core.commitment.v1.MerklePrefixKt.Dsl.() -> kotlin.Unit): ibc.core.commitment.v1.Commitment.MerklePrefix =
  ibc.core.commitment.v1.MerklePrefixKt.Dsl._create(ibc.core.commitment.v1.Commitment.MerklePrefix.newBuilder()).apply { block() }._build()
public object MerklePrefixKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.commitment.v1.Commitment.MerklePrefix.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.commitment.v1.Commitment.MerklePrefix.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.commitment.v1.Commitment.MerklePrefix = _builder.build()

    /**
     * <code>bytes key_prefix = 1 [json_name = "keyPrefix"];</code>
     */
    public var keyPrefix: com.google.protobuf.ByteString
      @JvmName("getKeyPrefix")
      get() = _builder.getKeyPrefix()
      @JvmName("setKeyPrefix")
      set(value) {
        _builder.setKeyPrefix(value)
      }
    /**
     * <code>bytes key_prefix = 1 [json_name = "keyPrefix"];</code>
     */
    public fun clearKeyPrefix() {
      _builder.clearKeyPrefix()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.commitment.v1.Commitment.MerklePrefix.copy(block: ibc.core.commitment.v1.MerklePrefixKt.Dsl.() -> kotlin.Unit): ibc.core.commitment.v1.Commitment.MerklePrefix =
  ibc.core.commitment.v1.MerklePrefixKt.Dsl._create(this.toBuilder()).apply { block() }._build()


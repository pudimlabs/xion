//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/nft.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmName("-initializeclass_")
public inline fun class_(block: cosmos.nft.v1beta1.ClassKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Nft.Class =
  cosmos.nft.v1beta1.ClassKt.Dsl._create(cosmos.nft.v1beta1.Nft.Class.newBuilder()).apply { block() }._build()
public object ClassKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.Nft.Class.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.Nft.Class.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.Nft.Class = _builder.build()

    /**
     * <pre>
     * id defines the unique identifier of the NFT classification, similar to the contract address of ERC721
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * id defines the unique identifier of the NFT classification, similar to the contract address of ERC721
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * name defines the human-readable name of the NFT classification. Optional
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * name defines the human-readable name of the NFT classification. Optional
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * symbol is an abbreviated name for nft classification. Optional
     * </pre>
     *
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     */
    public var symbol: kotlin.String
      @JvmName("getSymbol")
      get() = _builder.getSymbol()
      @JvmName("setSymbol")
      set(value) {
        _builder.setSymbol(value)
      }
    /**
     * <pre>
     * symbol is an abbreviated name for nft classification. Optional
     * </pre>
     *
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     */
    public fun clearSymbol() {
      _builder.clearSymbol()
    }

    /**
     * <pre>
     * description is a brief description of nft classification. Optional
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <pre>
     * description is a brief description of nft classification. Optional
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <pre>
     * uri for the class metadata stored off chain. It can define schema for Class and NFT `Data` attributes. Optional
     * </pre>
     *
     * <code>string uri = 5 [json_name = "uri"];</code>
     */
    public var uri: kotlin.String
      @JvmName("getUri")
      get() = _builder.getUri()
      @JvmName("setUri")
      set(value) {
        _builder.setUri(value)
      }
    /**
     * <pre>
     * uri for the class metadata stored off chain. It can define schema for Class and NFT `Data` attributes. Optional
     * </pre>
     *
     * <code>string uri = 5 [json_name = "uri"];</code>
     */
    public fun clearUri() {
      _builder.clearUri()
    }

    /**
     * <pre>
     * uri_hash is a hash of the document pointed by uri. Optional
     * </pre>
     *
     * <code>string uri_hash = 6 [json_name = "uriHash"];</code>
     */
    public var uriHash: kotlin.String
      @JvmName("getUriHash")
      get() = _builder.getUriHash()
      @JvmName("setUriHash")
      set(value) {
        _builder.setUriHash(value)
      }
    /**
     * <pre>
     * uri_hash is a hash of the document pointed by uri. Optional
     * </pre>
     *
     * <code>string uri_hash = 6 [json_name = "uriHash"];</code>
     */
    public fun clearUriHash() {
      _builder.clearUriHash()
    }

    /**
     * <pre>
     * data is the app specific metadata of the NFT class. Optional
     * </pre>
     *
     * <code>.google.protobuf.Any data = 7 [json_name = "data"];</code>
     */
    public var data: com.google.protobuf.Any
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * data is the app specific metadata of the NFT class. Optional
     * </pre>
     *
     * <code>.google.protobuf.Any data = 7 [json_name = "data"];</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
    /**
     * <pre>
     * data is the app specific metadata of the NFT class. Optional
     * </pre>
     *
     * <code>.google.protobuf.Any data = 7 [json_name = "data"];</code>
     * @return Whether the data field is set.
     */
    public fun hasData(): kotlin.Boolean {
      return _builder.hasData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.Nft.Class.copy(block: cosmos.nft.v1beta1.ClassKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Nft.Class =
  cosmos.nft.v1beta1.ClassKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.nft.v1beta1.Nft.ClassOrBuilder.dataOrNull: com.google.protobuf.Any?
  get() = if (hasData()) getData() else null


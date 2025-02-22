//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmName("-initializequeryClientConnectionsResponse")
public inline fun queryClientConnectionsResponse(block: ibc.core.connection.v1.QueryClientConnectionsResponseKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse =
  ibc.core.connection.v1.QueryClientConnectionsResponseKt.Dsl._create(ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse.newBuilder()).apply { block() }._build()
public object QueryClientConnectionsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ConnectionPathsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     * @return A list containing the connectionPaths.
     */
    public val connectionPaths: com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getConnectionPathsList()
      )
    /**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     * @param value The connectionPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addConnectionPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>.add(value: kotlin.String) {
      _builder.addConnectionPaths(value)
    }
    /**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     * @param value The connectionPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignConnectionPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     * @param values The connectionPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllConnectionPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllConnectionPaths(values)
    }
    /**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     * @param values The connectionPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllConnectionPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     * @param index The index to set the value at.
     * @param value The connectionPaths to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setConnectionPaths")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setConnectionPaths(index, value)
    }/**
     * <pre>
     * slice of all the connection paths associated with a client.
     * </pre>
     *
     * <code>repeated string connection_paths = 1 [json_name = "connectionPaths"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearConnectionPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionPathsProxy>.clear() {
      _builder.clearConnectionPaths()
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     */
    public var proof: com.google.protobuf.ByteString
      @JvmName("getProof")
      get() = _builder.getProof()
      @JvmName("setProof")
      set(value) {
        _builder.setProof(value)
      }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     */
    public fun clearProof() {
      _builder.clearProof()
    }

    /**
     * <pre>
     * height at which the proof was generated
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public var proofHeight: ibc.core.client.v1.Client.Height
      @JvmName("getProofHeight")
      get() = _builder.getProofHeight()
      @JvmName("setProofHeight")
      set(value) {
        _builder.setProofHeight(value)
      }
    /**
     * <pre>
     * height at which the proof was generated
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public fun clearProofHeight() {
      _builder.clearProofHeight()
    }
    /**
     * <pre>
     * height at which the proof was generated
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     * @return Whether the proofHeight field is set.
     */
    public fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse.copy(block: ibc.core.connection.v1.QueryClientConnectionsResponseKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponse =
  ibc.core.connection.v1.QueryClientConnectionsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsResponseOrBuilder.proofHeightOrNull: ibc.core.client.v1.Client.Height?
  get() = if (hasProofHeight()) getProofHeight() else null


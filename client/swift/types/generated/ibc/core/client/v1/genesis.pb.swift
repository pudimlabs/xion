// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/core/client/v1/genesis.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// GenesisState defines the ibc client submodule's genesis state.
struct Ibc_Core_Client_V1_GenesisState: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// client states with their corresponding identifiers
  var clients: [Ibc_Core_Client_V1_IdentifiedClientState] = []

  /// consensus states from each client
  var clientsConsensus: [Ibc_Core_Client_V1_ClientConsensusStates] = []

  /// metadata from each client
  var clientsMetadata: [Ibc_Core_Client_V1_IdentifiedGenesisMetadata] = []

  var params: Ibc_Core_Client_V1_Params {
    get {return _params ?? Ibc_Core_Client_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// Deprecated: create_localhost has been deprecated.
  /// The localhost client is automatically created at genesis.
  ///
  /// NOTE: This field was marked as deprecated in the .proto file.
  var createLocalhost: Bool = false

  /// the sequence for the next generated client identifier
  var nextClientSequence: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Ibc_Core_Client_V1_Params? = nil
}

/// GenesisMetadata defines the genesis type for metadata that clients may return
/// with ExportMetadata
struct Ibc_Core_Client_V1_GenesisMetadata: @unchecked Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// store key of metadata without clientID-prefix
  var key: Data = Data()

  /// metadata value
  var value: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// IdentifiedGenesisMetadata has the client metadata with the corresponding
/// client id.
struct Ibc_Core_Client_V1_IdentifiedGenesisMetadata: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var clientID: String = String()

  var clientMetadata: [Ibc_Core_Client_V1_GenesisMetadata] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.core.client.v1"

extension Ibc_Core_Client_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "clients"),
    2: .standard(proto: "clients_consensus"),
    3: .standard(proto: "clients_metadata"),
    4: .same(proto: "params"),
    5: .standard(proto: "create_localhost"),
    6: .standard(proto: "next_client_sequence"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.clients) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.clientsConsensus) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.clientsMetadata) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.createLocalhost) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.nextClientSequence) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.clients.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.clients, fieldNumber: 1)
    }
    if !self.clientsConsensus.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.clientsConsensus, fieldNumber: 2)
    }
    if !self.clientsMetadata.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.clientsMetadata, fieldNumber: 3)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if self.createLocalhost != false {
      try visitor.visitSingularBoolField(value: self.createLocalhost, fieldNumber: 5)
    }
    if self.nextClientSequence != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextClientSequence, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_GenesisState, rhs: Ibc_Core_Client_V1_GenesisState) -> Bool {
    if lhs.clients != rhs.clients {return false}
    if lhs.clientsConsensus != rhs.clientsConsensus {return false}
    if lhs.clientsMetadata != rhs.clientsMetadata {return false}
    if lhs._params != rhs._params {return false}
    if lhs.createLocalhost != rhs.createLocalhost {return false}
    if lhs.nextClientSequence != rhs.nextClientSequence {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_GenesisMetadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisMetadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_GenesisMetadata, rhs: Ibc_Core_Client_V1_GenesisMetadata) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_IdentifiedGenesisMetadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IdentifiedGenesisMetadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "client_id"),
    2: .standard(proto: "client_metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.clientID) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.clientMetadata) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.clientID.isEmpty {
      try visitor.visitSingularStringField(value: self.clientID, fieldNumber: 1)
    }
    if !self.clientMetadata.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.clientMetadata, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_IdentifiedGenesisMetadata, rhs: Ibc_Core_Client_V1_IdentifiedGenesisMetadata) -> Bool {
    if lhs.clientID != rhs.clientID {return false}
    if lhs.clientMetadata != rhs.clientMetadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/applications/interchain_accounts/host/v1/tx.proto
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

/// MsgUpdateParams defines the payload for Msg/UpdateParams
struct Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// signer address
  var signer: String = String()

  /// params defines the 27-interchain-accounts/host parameters to update.
  ///
  /// NOTE: All parameters must be supplied.
  var params: Ibc_Applications_InterchainAccounts_Host_V1_Params {
    get {return _params ?? Ibc_Applications_InterchainAccounts_Host_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Ibc_Applications_InterchainAccounts_Host_V1_Params? = nil
}

/// MsgUpdateParamsResponse defines the response for Msg/UpdateParams
struct Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParamsResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgModuleQuerySafe defines the payload for Msg/ModuleQuerySafe
struct Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafe: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// signer address
  var signer: String = String()

  /// requests defines the module safe queries to execute.
  var requests: [Ibc_Applications_InterchainAccounts_Host_V1_QueryRequest] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgModuleQuerySafeResponse defines the response for Msg/ModuleQuerySafe
struct Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafeResponse: @unchecked Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// height at which the responses were queried
  var height: UInt64 = 0

  /// protobuf encoded responses for each query
  var responses: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.applications.interchain_accounts.host.v1"

extension Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signer"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.signer.isEmpty {
      try visitor.visitSingularStringField(value: self.signer, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParams, rhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParams) -> Bool {
    if lhs.signer != rhs.signer {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    // Load everything into unknown fields
    while try decoder.nextFieldNumber() != nil {}
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParamsResponse, rhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafe: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgModuleQuerySafe"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signer"),
    2: .same(proto: "requests"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.requests) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.signer.isEmpty {
      try visitor.visitSingularStringField(value: self.signer, fieldNumber: 1)
    }
    if !self.requests.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.requests, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafe, rhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafe) -> Bool {
    if lhs.signer != rhs.signer {return false}
    if lhs.requests != rhs.requests {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgModuleQuerySafeResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "height"),
    2: .same(proto: "responses"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 2: try { try decoder.decodeRepeatedBytesField(value: &self.responses) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 1)
    }
    if !self.responses.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.responses, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafeResponse, rhs: Ibc_Applications_InterchainAccounts_Host_V1_MsgModuleQuerySafeResponse) -> Bool {
    if lhs.height != rhs.height {return false}
    if lhs.responses != rhs.responses {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

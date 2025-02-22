// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: xion/v1/feegrant.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

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

/// AuthzAllowance creates allowance only authz message for a specific grantee
struct Xion_V1_AuthzAllowance: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// allowance can be any of basic and periodic fee allowance.
  var allowance: SwiftProtobuf.Google_Protobuf_Any {
    get {return _allowance ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_allowance = newValue}
  }
  /// Returns true if `allowance` has been explicitly set.
  var hasAllowance: Bool {return self._allowance != nil}
  /// Clears the value of `allowance`. Subsequent reads from it will return its default value.
  mutating func clearAllowance() {self._allowance = nil}

  var authzGrantee: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _allowance: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// ContractsAllowance creates allowance only for specific contracts
struct Xion_V1_ContractsAllowance: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// allowance can be any allowance interface type.
  var allowance: SwiftProtobuf.Google_Protobuf_Any {
    get {return _allowance ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_allowance = newValue}
  }
  /// Returns true if `allowance` has been explicitly set.
  var hasAllowance: Bool {return self._allowance != nil}
  /// Clears the value of `allowance`. Subsequent reads from it will return its default value.
  mutating func clearAllowance() {self._allowance = nil}

  var contractAddresses: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _allowance: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// MultiAnyAllowance creates an allowance that pays if any of the internal allowances are met
struct Xion_V1_MultiAnyAllowance: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// allowance can be any allowance interface type.
  var allowances: [SwiftProtobuf.Google_Protobuf_Any] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "xion.v1"

extension Xion_V1_AuthzAllowance: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AuthzAllowance"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "allowance"),
    2: .standard(proto: "authz_grantee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._allowance) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.authzGrantee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._allowance {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.authzGrantee.isEmpty {
      try visitor.visitSingularStringField(value: self.authzGrantee, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Xion_V1_AuthzAllowance, rhs: Xion_V1_AuthzAllowance) -> Bool {
    if lhs._allowance != rhs._allowance {return false}
    if lhs.authzGrantee != rhs.authzGrantee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Xion_V1_ContractsAllowance: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractsAllowance"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "allowance"),
    2: .standard(proto: "contract_addresses"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._allowance) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.contractAddresses) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._allowance {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.contractAddresses.isEmpty {
      try visitor.visitRepeatedStringField(value: self.contractAddresses, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Xion_V1_ContractsAllowance, rhs: Xion_V1_ContractsAllowance) -> Bool {
    if lhs._allowance != rhs._allowance {return false}
    if lhs.contractAddresses != rhs.contractAddresses {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Xion_V1_MultiAnyAllowance: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MultiAnyAllowance"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "allowances"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.allowances) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.allowances.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.allowances, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Xion_V1_MultiAnyAllowance, rhs: Xion_V1_MultiAnyAllowance) -> Bool {
    if lhs.allowances != rhs.allowances {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

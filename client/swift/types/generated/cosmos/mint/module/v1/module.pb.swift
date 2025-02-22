// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/mint/module/v1/module.proto
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

/// Module is the config object of the mint module.
struct Cosmos_Mint_Module_V1_Module: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feeCollectorName: String = String()

  /// authority defines the custom module authority. If not set, defaults to the governance module.
  var authority: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.mint.module.v1"

extension Cosmos_Mint_Module_V1_Module: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Module"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "fee_collector_name"),
    2: .same(proto: "authority"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.feeCollectorName) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.feeCollectorName.isEmpty {
      try visitor.visitSingularStringField(value: self.feeCollectorName, fieldNumber: 1)
    }
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Mint_Module_V1_Module, rhs: Cosmos_Mint_Module_V1_Module) -> Bool {
    if lhs.feeCollectorName != rhs.feeCollectorName {return false}
    if lhs.authority != rhs.authority {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

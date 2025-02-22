// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: tendermint/types/params.proto
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

/// ConsensusParams contains consensus critical parameters that determine the
/// validity of blocks.
struct Tendermint_Types_ConsensusParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var block: Tendermint_Types_BlockParams {
    get {return _block ?? Tendermint_Types_BlockParams()}
    set {_block = newValue}
  }
  /// Returns true if `block` has been explicitly set.
  var hasBlock: Bool {return self._block != nil}
  /// Clears the value of `block`. Subsequent reads from it will return its default value.
  mutating func clearBlock() {self._block = nil}

  var evidence: Tendermint_Types_EvidenceParams {
    get {return _evidence ?? Tendermint_Types_EvidenceParams()}
    set {_evidence = newValue}
  }
  /// Returns true if `evidence` has been explicitly set.
  var hasEvidence: Bool {return self._evidence != nil}
  /// Clears the value of `evidence`. Subsequent reads from it will return its default value.
  mutating func clearEvidence() {self._evidence = nil}

  var validator: Tendermint_Types_ValidatorParams {
    get {return _validator ?? Tendermint_Types_ValidatorParams()}
    set {_validator = newValue}
  }
  /// Returns true if `validator` has been explicitly set.
  var hasValidator: Bool {return self._validator != nil}
  /// Clears the value of `validator`. Subsequent reads from it will return its default value.
  mutating func clearValidator() {self._validator = nil}

  var version: Tendermint_Types_VersionParams {
    get {return _version ?? Tendermint_Types_VersionParams()}
    set {_version = newValue}
  }
  /// Returns true if `version` has been explicitly set.
  var hasVersion: Bool {return self._version != nil}
  /// Clears the value of `version`. Subsequent reads from it will return its default value.
  mutating func clearVersion() {self._version = nil}

  var abci: Tendermint_Types_ABCIParams {
    get {return _abci ?? Tendermint_Types_ABCIParams()}
    set {_abci = newValue}
  }
  /// Returns true if `abci` has been explicitly set.
  var hasAbci: Bool {return self._abci != nil}
  /// Clears the value of `abci`. Subsequent reads from it will return its default value.
  mutating func clearAbci() {self._abci = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _block: Tendermint_Types_BlockParams? = nil
  fileprivate var _evidence: Tendermint_Types_EvidenceParams? = nil
  fileprivate var _validator: Tendermint_Types_ValidatorParams? = nil
  fileprivate var _version: Tendermint_Types_VersionParams? = nil
  fileprivate var _abci: Tendermint_Types_ABCIParams? = nil
}

/// BlockParams contains limits on the block size.
struct Tendermint_Types_BlockParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Max block size, in bytes.
  /// Note: must be greater than 0
  var maxBytes: Int64 = 0

  /// Max gas per block.
  /// Note: must be greater or equal to -1
  var maxGas: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// EvidenceParams determine how we handle evidence of malfeasance.
struct Tendermint_Types_EvidenceParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Max age of evidence, in blocks.
  ///
  /// The basic formula for calculating this is: MaxAgeDuration / {average block
  /// time}.
  var maxAgeNumBlocks: Int64 = 0

  /// Max age of evidence, in time.
  ///
  /// It should correspond with an app's "unbonding period" or other similar
  /// mechanism for handling [Nothing-At-Stake
  /// attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
  var maxAgeDuration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _maxAgeDuration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_maxAgeDuration = newValue}
  }
  /// Returns true if `maxAgeDuration` has been explicitly set.
  var hasMaxAgeDuration: Bool {return self._maxAgeDuration != nil}
  /// Clears the value of `maxAgeDuration`. Subsequent reads from it will return its default value.
  mutating func clearMaxAgeDuration() {self._maxAgeDuration = nil}

  /// This sets the maximum size of total evidence in bytes that can be committed in a single block.
  /// and should fall comfortably under the max block bytes.
  /// Default is 1048576 or 1MB
  var maxBytes: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _maxAgeDuration: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// ValidatorParams restrict the public key types validators can use.
/// NOTE: uses ABCI pubkey naming, not Amino names.
struct Tendermint_Types_ValidatorParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var pubKeyTypes: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// VersionParams contains the ABCI application version.
struct Tendermint_Types_VersionParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var app: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// HashedParams is a subset of ConsensusParams.
///
/// It is hashed into the Header.ConsensusHash.
struct Tendermint_Types_HashedParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var blockMaxBytes: Int64 = 0

  var blockMaxGas: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ABCIParams configure functionality specific to the Application Blockchain Interface.
struct Tendermint_Types_ABCIParams: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// vote_extensions_enable_height configures the first height during which
  /// vote extensions will be enabled. During this specified height, and for all
  /// subsequent heights, precommit messages that do not contain valid extension data
  /// will be considered invalid. Prior to this height, vote extensions will not
  /// be used or accepted by validators on the network.
  ///
  /// Once enabled, vote extensions will be created by the application in ExtendVote,
  /// passed to the application for validation in VerifyVoteExtension and given
  /// to the application to use when proposing a block during PrepareProposal.
  var voteExtensionsEnableHeight: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "tendermint.types"

extension Tendermint_Types_ConsensusParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConsensusParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "block"),
    2: .same(proto: "evidence"),
    3: .same(proto: "validator"),
    4: .same(proto: "version"),
    5: .same(proto: "abci"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._block) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._evidence) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._validator) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._version) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._abci) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._block {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._evidence {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._validator {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._version {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._abci {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_ConsensusParams, rhs: Tendermint_Types_ConsensusParams) -> Bool {
    if lhs._block != rhs._block {return false}
    if lhs._evidence != rhs._evidence {return false}
    if lhs._validator != rhs._validator {return false}
    if lhs._version != rhs._version {return false}
    if lhs._abci != rhs._abci {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Types_BlockParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BlockParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "max_bytes"),
    2: .standard(proto: "max_gas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.maxBytes) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.maxGas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.maxBytes != 0 {
      try visitor.visitSingularInt64Field(value: self.maxBytes, fieldNumber: 1)
    }
    if self.maxGas != 0 {
      try visitor.visitSingularInt64Field(value: self.maxGas, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_BlockParams, rhs: Tendermint_Types_BlockParams) -> Bool {
    if lhs.maxBytes != rhs.maxBytes {return false}
    if lhs.maxGas != rhs.maxGas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Types_EvidenceParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EvidenceParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "max_age_num_blocks"),
    2: .standard(proto: "max_age_duration"),
    3: .standard(proto: "max_bytes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.maxAgeNumBlocks) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._maxAgeDuration) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.maxBytes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.maxAgeNumBlocks != 0 {
      try visitor.visitSingularInt64Field(value: self.maxAgeNumBlocks, fieldNumber: 1)
    }
    try { if let v = self._maxAgeDuration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.maxBytes != 0 {
      try visitor.visitSingularInt64Field(value: self.maxBytes, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_EvidenceParams, rhs: Tendermint_Types_EvidenceParams) -> Bool {
    if lhs.maxAgeNumBlocks != rhs.maxAgeNumBlocks {return false}
    if lhs._maxAgeDuration != rhs._maxAgeDuration {return false}
    if lhs.maxBytes != rhs.maxBytes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Types_ValidatorParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pub_key_types"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedStringField(value: &self.pubKeyTypes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.pubKeyTypes.isEmpty {
      try visitor.visitRepeatedStringField(value: self.pubKeyTypes, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_ValidatorParams, rhs: Tendermint_Types_ValidatorParams) -> Bool {
    if lhs.pubKeyTypes != rhs.pubKeyTypes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Types_VersionParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VersionParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "app"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.app) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.app != 0 {
      try visitor.visitSingularUInt64Field(value: self.app, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_VersionParams, rhs: Tendermint_Types_VersionParams) -> Bool {
    if lhs.app != rhs.app {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Types_HashedParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".HashedParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_max_bytes"),
    2: .standard(proto: "block_max_gas"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.blockMaxBytes) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.blockMaxGas) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.blockMaxBytes != 0 {
      try visitor.visitSingularInt64Field(value: self.blockMaxBytes, fieldNumber: 1)
    }
    if self.blockMaxGas != 0 {
      try visitor.visitSingularInt64Field(value: self.blockMaxGas, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_HashedParams, rhs: Tendermint_Types_HashedParams) -> Bool {
    if lhs.blockMaxBytes != rhs.blockMaxBytes {return false}
    if lhs.blockMaxGas != rhs.blockMaxGas {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tendermint_Types_ABCIParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ABCIParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "vote_extensions_enable_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.voteExtensionsEnableHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.voteExtensionsEnableHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.voteExtensionsEnableHeight, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tendermint_Types_ABCIParams, rhs: Tendermint_Types_ABCIParams) -> Bool {
    if lhs.voteExtensionsEnableHeight != rhs.voteExtensionsEnableHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

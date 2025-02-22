// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/lightclients/tendermint/v1/tendermint.proto
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

/// ClientState from Tendermint tracks the current validator set, latest height,
/// and a possible frozen height.
struct Ibc_Lightclients_Tendermint_V1_ClientState: @unchecked Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chainID: String {
    get {return _storage._chainID}
    set {_uniqueStorage()._chainID = newValue}
  }

  var trustLevel: Ibc_Lightclients_Tendermint_V1_Fraction {
    get {return _storage._trustLevel ?? Ibc_Lightclients_Tendermint_V1_Fraction()}
    set {_uniqueStorage()._trustLevel = newValue}
  }
  /// Returns true if `trustLevel` has been explicitly set.
  var hasTrustLevel: Bool {return _storage._trustLevel != nil}
  /// Clears the value of `trustLevel`. Subsequent reads from it will return its default value.
  mutating func clearTrustLevel() {_uniqueStorage()._trustLevel = nil}

  /// duration of the period since the LastestTimestamp during which the
  /// submitted headers are valid for upgrade
  var trustingPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _storage._trustingPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_uniqueStorage()._trustingPeriod = newValue}
  }
  /// Returns true if `trustingPeriod` has been explicitly set.
  var hasTrustingPeriod: Bool {return _storage._trustingPeriod != nil}
  /// Clears the value of `trustingPeriod`. Subsequent reads from it will return its default value.
  mutating func clearTrustingPeriod() {_uniqueStorage()._trustingPeriod = nil}

  /// duration of the staking unbonding period
  var unbondingPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _storage._unbondingPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_uniqueStorage()._unbondingPeriod = newValue}
  }
  /// Returns true if `unbondingPeriod` has been explicitly set.
  var hasUnbondingPeriod: Bool {return _storage._unbondingPeriod != nil}
  /// Clears the value of `unbondingPeriod`. Subsequent reads from it will return its default value.
  mutating func clearUnbondingPeriod() {_uniqueStorage()._unbondingPeriod = nil}

  /// defines how much new (untrusted) header's Time can drift into the future.
  var maxClockDrift: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _storage._maxClockDrift ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_uniqueStorage()._maxClockDrift = newValue}
  }
  /// Returns true if `maxClockDrift` has been explicitly set.
  var hasMaxClockDrift: Bool {return _storage._maxClockDrift != nil}
  /// Clears the value of `maxClockDrift`. Subsequent reads from it will return its default value.
  mutating func clearMaxClockDrift() {_uniqueStorage()._maxClockDrift = nil}

  /// Block height when the client was frozen due to a misbehaviour
  var frozenHeight: Ibc_Core_Client_V1_Height {
    get {return _storage._frozenHeight ?? Ibc_Core_Client_V1_Height()}
    set {_uniqueStorage()._frozenHeight = newValue}
  }
  /// Returns true if `frozenHeight` has been explicitly set.
  var hasFrozenHeight: Bool {return _storage._frozenHeight != nil}
  /// Clears the value of `frozenHeight`. Subsequent reads from it will return its default value.
  mutating func clearFrozenHeight() {_uniqueStorage()._frozenHeight = nil}

  /// Latest height the client was updated to
  var latestHeight: Ibc_Core_Client_V1_Height {
    get {return _storage._latestHeight ?? Ibc_Core_Client_V1_Height()}
    set {_uniqueStorage()._latestHeight = newValue}
  }
  /// Returns true if `latestHeight` has been explicitly set.
  var hasLatestHeight: Bool {return _storage._latestHeight != nil}
  /// Clears the value of `latestHeight`. Subsequent reads from it will return its default value.
  mutating func clearLatestHeight() {_uniqueStorage()._latestHeight = nil}

  /// Proof specifications used in verifying counterparty state
  var proofSpecs: [Cosmos_Ics23_V1_ProofSpec] {
    get {return _storage._proofSpecs}
    set {_uniqueStorage()._proofSpecs = newValue}
  }

  /// Path at which next upgraded client will be committed.
  /// Each element corresponds to the key for a single CommitmentProof in the
  /// chained proof. NOTE: ClientState must stored under
  /// `{upgradePath}/{upgradeHeight}/clientState` ConsensusState must be stored
  /// under `{upgradepath}/{upgradeHeight}/consensusState` For SDK chains using
  /// the default upgrade module, upgrade_path should be []string{"upgrade",
  /// "upgradedIBCState"}`
  var upgradePath: [String] {
    get {return _storage._upgradePath}
    set {_uniqueStorage()._upgradePath = newValue}
  }

  /// allow_update_after_expiry is deprecated
  ///
  /// NOTE: This field was marked as deprecated in the .proto file.
  var allowUpdateAfterExpiry: Bool {
    get {return _storage._allowUpdateAfterExpiry}
    set {_uniqueStorage()._allowUpdateAfterExpiry = newValue}
  }

  /// allow_update_after_misbehaviour is deprecated
  ///
  /// NOTE: This field was marked as deprecated in the .proto file.
  var allowUpdateAfterMisbehaviour: Bool {
    get {return _storage._allowUpdateAfterMisbehaviour}
    set {_uniqueStorage()._allowUpdateAfterMisbehaviour = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// ConsensusState defines the consensus state from Tendermint.
struct Ibc_Lightclients_Tendermint_V1_ConsensusState: @unchecked Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// timestamp that corresponds to the block height in which the ConsensusState
  /// was stored.
  var timestamp: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _timestamp ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_timestamp = newValue}
  }
  /// Returns true if `timestamp` has been explicitly set.
  var hasTimestamp: Bool {return self._timestamp != nil}
  /// Clears the value of `timestamp`. Subsequent reads from it will return its default value.
  mutating func clearTimestamp() {self._timestamp = nil}

  /// commitment root (i.e app hash)
  var root: Ibc_Core_Commitment_V1_MerkleRoot {
    get {return _root ?? Ibc_Core_Commitment_V1_MerkleRoot()}
    set {_root = newValue}
  }
  /// Returns true if `root` has been explicitly set.
  var hasRoot: Bool {return self._root != nil}
  /// Clears the value of `root`. Subsequent reads from it will return its default value.
  mutating func clearRoot() {self._root = nil}

  var nextValidatorsHash: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _timestamp: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _root: Ibc_Core_Commitment_V1_MerkleRoot? = nil
}

/// Misbehaviour is a wrapper over two conflicting Headers
/// that implements Misbehaviour interface expected by ICS-02
struct Ibc_Lightclients_Tendermint_V1_Misbehaviour: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// ClientID is deprecated
  ///
  /// NOTE: This field was marked as deprecated in the .proto file.
  var clientID: String = String()

  var header1: Ibc_Lightclients_Tendermint_V1_Header {
    get {return _header1 ?? Ibc_Lightclients_Tendermint_V1_Header()}
    set {_header1 = newValue}
  }
  /// Returns true if `header1` has been explicitly set.
  var hasHeader1: Bool {return self._header1 != nil}
  /// Clears the value of `header1`. Subsequent reads from it will return its default value.
  mutating func clearHeader1() {self._header1 = nil}

  var header2: Ibc_Lightclients_Tendermint_V1_Header {
    get {return _header2 ?? Ibc_Lightclients_Tendermint_V1_Header()}
    set {_header2 = newValue}
  }
  /// Returns true if `header2` has been explicitly set.
  var hasHeader2: Bool {return self._header2 != nil}
  /// Clears the value of `header2`. Subsequent reads from it will return its default value.
  mutating func clearHeader2() {self._header2 = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _header1: Ibc_Lightclients_Tendermint_V1_Header? = nil
  fileprivate var _header2: Ibc_Lightclients_Tendermint_V1_Header? = nil
}

/// Header defines the Tendermint client consensus Header.
/// It encapsulates all the information necessary to update from a trusted
/// Tendermint ConsensusState. The inclusion of TrustedHeight and
/// TrustedValidators allows this update to process correctly, so long as the
/// ConsensusState for the TrustedHeight exists, this removes race conditions
/// among relayers The SignedHeader and ValidatorSet are the new untrusted update
/// fields for the client. The TrustedHeight is the height of a stored
/// ConsensusState on the client that will be used to verify the new untrusted
/// header. The Trusted ConsensusState must be within the unbonding period of
/// current time in order to correctly verify, and the TrustedValidators must
/// hash to TrustedConsensusState.NextValidatorsHash since that is the last
/// trusted validator set at the TrustedHeight.
struct Ibc_Lightclients_Tendermint_V1_Header: @unchecked Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var signedHeader: Tendermint_Types_SignedHeader {
    get {return _storage._signedHeader ?? Tendermint_Types_SignedHeader()}
    set {_uniqueStorage()._signedHeader = newValue}
  }
  /// Returns true if `signedHeader` has been explicitly set.
  var hasSignedHeader: Bool {return _storage._signedHeader != nil}
  /// Clears the value of `signedHeader`. Subsequent reads from it will return its default value.
  mutating func clearSignedHeader() {_uniqueStorage()._signedHeader = nil}

  var validatorSet: Tendermint_Types_ValidatorSet {
    get {return _storage._validatorSet ?? Tendermint_Types_ValidatorSet()}
    set {_uniqueStorage()._validatorSet = newValue}
  }
  /// Returns true if `validatorSet` has been explicitly set.
  var hasValidatorSet: Bool {return _storage._validatorSet != nil}
  /// Clears the value of `validatorSet`. Subsequent reads from it will return its default value.
  mutating func clearValidatorSet() {_uniqueStorage()._validatorSet = nil}

  var trustedHeight: Ibc_Core_Client_V1_Height {
    get {return _storage._trustedHeight ?? Ibc_Core_Client_V1_Height()}
    set {_uniqueStorage()._trustedHeight = newValue}
  }
  /// Returns true if `trustedHeight` has been explicitly set.
  var hasTrustedHeight: Bool {return _storage._trustedHeight != nil}
  /// Clears the value of `trustedHeight`. Subsequent reads from it will return its default value.
  mutating func clearTrustedHeight() {_uniqueStorage()._trustedHeight = nil}

  var trustedValidators: Tendermint_Types_ValidatorSet {
    get {return _storage._trustedValidators ?? Tendermint_Types_ValidatorSet()}
    set {_uniqueStorage()._trustedValidators = newValue}
  }
  /// Returns true if `trustedValidators` has been explicitly set.
  var hasTrustedValidators: Bool {return _storage._trustedValidators != nil}
  /// Clears the value of `trustedValidators`. Subsequent reads from it will return its default value.
  mutating func clearTrustedValidators() {_uniqueStorage()._trustedValidators = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// Fraction defines the protobuf message type for tmmath.Fraction that only
/// supports positive values.
struct Ibc_Lightclients_Tendermint_V1_Fraction: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var numerator: UInt64 = 0

  var denominator: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.lightclients.tendermint.v1"

extension Ibc_Lightclients_Tendermint_V1_ClientState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ClientState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .standard(proto: "trust_level"),
    3: .standard(proto: "trusting_period"),
    4: .standard(proto: "unbonding_period"),
    5: .standard(proto: "max_clock_drift"),
    6: .standard(proto: "frozen_height"),
    7: .standard(proto: "latest_height"),
    8: .standard(proto: "proof_specs"),
    9: .standard(proto: "upgrade_path"),
    10: .standard(proto: "allow_update_after_expiry"),
    11: .standard(proto: "allow_update_after_misbehaviour"),
  ]

  fileprivate class _StorageClass {
    var _chainID: String = String()
    var _trustLevel: Ibc_Lightclients_Tendermint_V1_Fraction? = nil
    var _trustingPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
    var _unbondingPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
    var _maxClockDrift: SwiftProtobuf.Google_Protobuf_Duration? = nil
    var _frozenHeight: Ibc_Core_Client_V1_Height? = nil
    var _latestHeight: Ibc_Core_Client_V1_Height? = nil
    var _proofSpecs: [Cosmos_Ics23_V1_ProofSpec] = []
    var _upgradePath: [String] = []
    var _allowUpdateAfterExpiry: Bool = false
    var _allowUpdateAfterMisbehaviour: Bool = false

    #if swift(>=5.10)
      // This property is used as the initial default value for new instances of the type.
      // The type itself is protecting the reference to its storage via CoW semantics.
      // This will force a copy to be made of this reference when the first mutation occurs;
      // hence, it is safe to mark this as `nonisolated(unsafe)`.
      static nonisolated(unsafe) let defaultInstance = _StorageClass()
    #else
      static let defaultInstance = _StorageClass()
    #endif

    private init() {}

    init(copying source: _StorageClass) {
      _chainID = source._chainID
      _trustLevel = source._trustLevel
      _trustingPeriod = source._trustingPeriod
      _unbondingPeriod = source._unbondingPeriod
      _maxClockDrift = source._maxClockDrift
      _frozenHeight = source._frozenHeight
      _latestHeight = source._latestHeight
      _proofSpecs = source._proofSpecs
      _upgradePath = source._upgradePath
      _allowUpdateAfterExpiry = source._allowUpdateAfterExpiry
      _allowUpdateAfterMisbehaviour = source._allowUpdateAfterMisbehaviour
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._chainID) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._trustLevel) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._trustingPeriod) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._unbondingPeriod) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._maxClockDrift) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._frozenHeight) }()
        case 7: try { try decoder.decodeSingularMessageField(value: &_storage._latestHeight) }()
        case 8: try { try decoder.decodeRepeatedMessageField(value: &_storage._proofSpecs) }()
        case 9: try { try decoder.decodeRepeatedStringField(value: &_storage._upgradePath) }()
        case 10: try { try decoder.decodeSingularBoolField(value: &_storage._allowUpdateAfterExpiry) }()
        case 11: try { try decoder.decodeSingularBoolField(value: &_storage._allowUpdateAfterMisbehaviour) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      if !_storage._chainID.isEmpty {
        try visitor.visitSingularStringField(value: _storage._chainID, fieldNumber: 1)
      }
      try { if let v = _storage._trustLevel {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._trustingPeriod {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      try { if let v = _storage._unbondingPeriod {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._maxClockDrift {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._frozenHeight {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
      try { if let v = _storage._latestHeight {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      } }()
      if !_storage._proofSpecs.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._proofSpecs, fieldNumber: 8)
      }
      if !_storage._upgradePath.isEmpty {
        try visitor.visitRepeatedStringField(value: _storage._upgradePath, fieldNumber: 9)
      }
      if _storage._allowUpdateAfterExpiry != false {
        try visitor.visitSingularBoolField(value: _storage._allowUpdateAfterExpiry, fieldNumber: 10)
      }
      if _storage._allowUpdateAfterMisbehaviour != false {
        try visitor.visitSingularBoolField(value: _storage._allowUpdateAfterMisbehaviour, fieldNumber: 11)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Tendermint_V1_ClientState, rhs: Ibc_Lightclients_Tendermint_V1_ClientState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._chainID != rhs_storage._chainID {return false}
        if _storage._trustLevel != rhs_storage._trustLevel {return false}
        if _storage._trustingPeriod != rhs_storage._trustingPeriod {return false}
        if _storage._unbondingPeriod != rhs_storage._unbondingPeriod {return false}
        if _storage._maxClockDrift != rhs_storage._maxClockDrift {return false}
        if _storage._frozenHeight != rhs_storage._frozenHeight {return false}
        if _storage._latestHeight != rhs_storage._latestHeight {return false}
        if _storage._proofSpecs != rhs_storage._proofSpecs {return false}
        if _storage._upgradePath != rhs_storage._upgradePath {return false}
        if _storage._allowUpdateAfterExpiry != rhs_storage._allowUpdateAfterExpiry {return false}
        if _storage._allowUpdateAfterMisbehaviour != rhs_storage._allowUpdateAfterMisbehaviour {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Tendermint_V1_ConsensusState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConsensusState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "timestamp"),
    2: .same(proto: "root"),
    3: .standard(proto: "next_validators_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._timestamp) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._root) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.nextValidatorsHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._timestamp {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._root {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.nextValidatorsHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.nextValidatorsHash, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Tendermint_V1_ConsensusState, rhs: Ibc_Lightclients_Tendermint_V1_ConsensusState) -> Bool {
    if lhs._timestamp != rhs._timestamp {return false}
    if lhs._root != rhs._root {return false}
    if lhs.nextValidatorsHash != rhs.nextValidatorsHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Tendermint_V1_Misbehaviour: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Misbehaviour"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "client_id"),
    2: .standard(proto: "header_1"),
    3: .standard(proto: "header_2"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.clientID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._header1) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._header2) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.clientID.isEmpty {
      try visitor.visitSingularStringField(value: self.clientID, fieldNumber: 1)
    }
    try { if let v = self._header1 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._header2 {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Tendermint_V1_Misbehaviour, rhs: Ibc_Lightclients_Tendermint_V1_Misbehaviour) -> Bool {
    if lhs.clientID != rhs.clientID {return false}
    if lhs._header1 != rhs._header1 {return false}
    if lhs._header2 != rhs._header2 {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Tendermint_V1_Header: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Header"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "signed_header"),
    2: .standard(proto: "validator_set"),
    3: .standard(proto: "trusted_height"),
    4: .standard(proto: "trusted_validators"),
  ]

  fileprivate class _StorageClass {
    var _signedHeader: Tendermint_Types_SignedHeader? = nil
    var _validatorSet: Tendermint_Types_ValidatorSet? = nil
    var _trustedHeight: Ibc_Core_Client_V1_Height? = nil
    var _trustedValidators: Tendermint_Types_ValidatorSet? = nil

    #if swift(>=5.10)
      // This property is used as the initial default value for new instances of the type.
      // The type itself is protecting the reference to its storage via CoW semantics.
      // This will force a copy to be made of this reference when the first mutation occurs;
      // hence, it is safe to mark this as `nonisolated(unsafe)`.
      static nonisolated(unsafe) let defaultInstance = _StorageClass()
    #else
      static let defaultInstance = _StorageClass()
    #endif

    private init() {}

    init(copying source: _StorageClass) {
      _signedHeader = source._signedHeader
      _validatorSet = source._validatorSet
      _trustedHeight = source._trustedHeight
      _trustedValidators = source._trustedValidators
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._signedHeader) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._validatorSet) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._trustedHeight) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._trustedValidators) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      try { if let v = _storage._signedHeader {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._validatorSet {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._trustedHeight {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      try { if let v = _storage._trustedValidators {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Tendermint_V1_Header, rhs: Ibc_Lightclients_Tendermint_V1_Header) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._signedHeader != rhs_storage._signedHeader {return false}
        if _storage._validatorSet != rhs_storage._validatorSet {return false}
        if _storage._trustedHeight != rhs_storage._trustedHeight {return false}
        if _storage._trustedValidators != rhs_storage._trustedValidators {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Lightclients_Tendermint_V1_Fraction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Fraction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "numerator"),
    2: .same(proto: "denominator"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.numerator) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.denominator) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.numerator != 0 {
      try visitor.visitSingularUInt64Field(value: self.numerator, fieldNumber: 1)
    }
    if self.denominator != 0 {
      try visitor.visitSingularUInt64Field(value: self.denominator, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Lightclients_Tendermint_V1_Fraction, rhs: Ibc_Lightclients_Tendermint_V1_Fraction) -> Bool {
    if lhs.numerator != rhs.numerator {return false}
    if lhs.denominator != rhs.denominator {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

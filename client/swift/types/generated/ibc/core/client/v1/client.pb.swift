// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/core/client/v1/client.proto
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

/// IdentifiedClientState defines a client state with an additional client
/// identifier field.
struct Ibc_Core_Client_V1_IdentifiedClientState: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// client identifier
  var clientID: String = String()

  /// client state
  var clientState: SwiftProtobuf.Google_Protobuf_Any {
    get {return _clientState ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_clientState = newValue}
  }
  /// Returns true if `clientState` has been explicitly set.
  var hasClientState: Bool {return self._clientState != nil}
  /// Clears the value of `clientState`. Subsequent reads from it will return its default value.
  mutating func clearClientState() {self._clientState = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _clientState: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// ConsensusStateWithHeight defines a consensus state with an additional height
/// field.
struct Ibc_Core_Client_V1_ConsensusStateWithHeight: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// consensus state height
  var height: Ibc_Core_Client_V1_Height {
    get {return _height ?? Ibc_Core_Client_V1_Height()}
    set {_height = newValue}
  }
  /// Returns true if `height` has been explicitly set.
  var hasHeight: Bool {return self._height != nil}
  /// Clears the value of `height`. Subsequent reads from it will return its default value.
  mutating func clearHeight() {self._height = nil}

  /// consensus state
  var consensusState: SwiftProtobuf.Google_Protobuf_Any {
    get {return _consensusState ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_consensusState = newValue}
  }
  /// Returns true if `consensusState` has been explicitly set.
  var hasConsensusState: Bool {return self._consensusState != nil}
  /// Clears the value of `consensusState`. Subsequent reads from it will return its default value.
  mutating func clearConsensusState() {self._consensusState = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _height: Ibc_Core_Client_V1_Height? = nil
  fileprivate var _consensusState: SwiftProtobuf.Google_Protobuf_Any? = nil
}

/// ClientConsensusStates defines all the stored consensus states for a given
/// client.
struct Ibc_Core_Client_V1_ClientConsensusStates: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// client identifier
  var clientID: String = String()

  /// consensus states and their heights associated with the client
  var consensusStates: [Ibc_Core_Client_V1_ConsensusStateWithHeight] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Height is a monotonically increasing data type
/// that can be compared against another Height for the purposes of updating and
/// freezing clients
///
/// Normally the RevisionHeight is incremented at each height while keeping
/// RevisionNumber the same. However some consensus algorithms may choose to
/// reset the height in certain conditions e.g. hard forks, state-machine
/// breaking changes In these cases, the RevisionNumber is incremented so that
/// height continues to be monitonically increasing even as the RevisionHeight
/// gets reset
struct Ibc_Core_Client_V1_Height: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the revision that the client is currently on
  var revisionNumber: UInt64 = 0

  /// the height within the given revision
  var revisionHeight: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Params defines the set of IBC light client parameters.
struct Ibc_Core_Client_V1_Params: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// allowed_clients defines the list of allowed client state types which can be created
  /// and interacted with. If a client type is removed from the allowed clients list, usage
  /// of this client will be disabled until it is added again to the list.
  var allowedClients: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ClientUpdateProposal is a legacy governance proposal. If it passes, the substitute
/// client's latest consensus state is copied over to the subject client. The proposal
/// handler may fail if the subject and the substitute do not match in client and
/// chain parameters (with exception to latest height, frozen height, and chain-id).
///
/// Deprecated: Please use MsgRecoverClient in favour of this message type.
///
/// NOTE: This message was marked as deprecated in the .proto file.
struct Ibc_Core_Client_V1_ClientUpdateProposal: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the title of the update proposal
  var title: String = String()

  /// the description of the proposal
  var description_p: String = String()

  /// the client identifier for the client to be updated if the proposal passes
  var subjectClientID: String = String()

  /// the substitute client identifier for the client standing in for the subject
  /// client
  var substituteClientID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// UpgradeProposal is a gov Content type for initiating an IBC breaking
/// upgrade.
///
/// Deprecated: Please use MsgIBCSoftwareUpgrade in favour of this message type.
///
/// NOTE: This message was marked as deprecated in the .proto file.
struct Ibc_Core_Client_V1_UpgradeProposal: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var plan: Cosmos_Upgrade_V1beta1_Plan {
    get {return _plan ?? Cosmos_Upgrade_V1beta1_Plan()}
    set {_plan = newValue}
  }
  /// Returns true if `plan` has been explicitly set.
  var hasPlan: Bool {return self._plan != nil}
  /// Clears the value of `plan`. Subsequent reads from it will return its default value.
  mutating func clearPlan() {self._plan = nil}

  /// An UpgradedClientState must be provided to perform an IBC breaking upgrade.
  /// This will make the chain commit to the correct upgraded (self) client state
  /// before the upgrade occurs, so that connecting chains can verify that the
  /// new upgraded client is valid by verifying a proof on the previous version
  /// of the chain. This will allow IBC connections to persist smoothly across
  /// planned chain upgrades
  var upgradedClientState: SwiftProtobuf.Google_Protobuf_Any {
    get {return _upgradedClientState ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_upgradedClientState = newValue}
  }
  /// Returns true if `upgradedClientState` has been explicitly set.
  var hasUpgradedClientState: Bool {return self._upgradedClientState != nil}
  /// Clears the value of `upgradedClientState`. Subsequent reads from it will return its default value.
  mutating func clearUpgradedClientState() {self._upgradedClientState = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _plan: Cosmos_Upgrade_V1beta1_Plan? = nil
  fileprivate var _upgradedClientState: SwiftProtobuf.Google_Protobuf_Any? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.core.client.v1"

extension Ibc_Core_Client_V1_IdentifiedClientState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IdentifiedClientState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "client_id"),
    2: .standard(proto: "client_state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.clientID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._clientState) }()
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
    try { if let v = self._clientState {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_IdentifiedClientState, rhs: Ibc_Core_Client_V1_IdentifiedClientState) -> Bool {
    if lhs.clientID != rhs.clientID {return false}
    if lhs._clientState != rhs._clientState {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_ConsensusStateWithHeight: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConsensusStateWithHeight"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "height"),
    2: .standard(proto: "consensus_state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._height) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._consensusState) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._height {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._consensusState {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_ConsensusStateWithHeight, rhs: Ibc_Core_Client_V1_ConsensusStateWithHeight) -> Bool {
    if lhs._height != rhs._height {return false}
    if lhs._consensusState != rhs._consensusState {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_ClientConsensusStates: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ClientConsensusStates"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "client_id"),
    2: .standard(proto: "consensus_states"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.clientID) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.consensusStates) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.clientID.isEmpty {
      try visitor.visitSingularStringField(value: self.clientID, fieldNumber: 1)
    }
    if !self.consensusStates.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.consensusStates, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_ClientConsensusStates, rhs: Ibc_Core_Client_V1_ClientConsensusStates) -> Bool {
    if lhs.clientID != rhs.clientID {return false}
    if lhs.consensusStates != rhs.consensusStates {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_Height: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Height"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "revision_number"),
    2: .standard(proto: "revision_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.revisionNumber) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.revisionHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.revisionNumber != 0 {
      try visitor.visitSingularUInt64Field(value: self.revisionNumber, fieldNumber: 1)
    }
    if self.revisionHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.revisionHeight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_Height, rhs: Ibc_Core_Client_V1_Height) -> Bool {
    if lhs.revisionNumber != rhs.revisionNumber {return false}
    if lhs.revisionHeight != rhs.revisionHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "allowed_clients"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedStringField(value: &self.allowedClients) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.allowedClients.isEmpty {
      try visitor.visitRepeatedStringField(value: self.allowedClients, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_Params, rhs: Ibc_Core_Client_V1_Params) -> Bool {
    if lhs.allowedClients != rhs.allowedClients {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_ClientUpdateProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ClientUpdateProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "subject_client_id"),
    4: .standard(proto: "substitute_client_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.subjectClientID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.substituteClientID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.subjectClientID.isEmpty {
      try visitor.visitSingularStringField(value: self.subjectClientID, fieldNumber: 3)
    }
    if !self.substituteClientID.isEmpty {
      try visitor.visitSingularStringField(value: self.substituteClientID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_ClientUpdateProposal, rhs: Ibc_Core_Client_V1_ClientUpdateProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.subjectClientID != rhs.subjectClientID {return false}
    if lhs.substituteClientID != rhs.substituteClientID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Core_Client_V1_UpgradeProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpgradeProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .same(proto: "plan"),
    4: .standard(proto: "upgraded_client_state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._plan) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._upgradedClientState) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    try { if let v = self._plan {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._upgradedClientState {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Core_Client_V1_UpgradeProposal, rhs: Ibc_Core_Client_V1_UpgradeProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs._plan != rhs._plan {return false}
    if lhs._upgradedClientState != rhs._upgradedClientState {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

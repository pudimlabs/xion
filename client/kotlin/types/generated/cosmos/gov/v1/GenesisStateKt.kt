//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1/genesis.proto

package cosmos.gov.v1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: cosmos.gov.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Genesis.GenesisState =
  cosmos.gov.v1.GenesisStateKt.Dsl._create(cosmos.gov.v1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1.Genesis.GenesisState = _builder.build()

    /**
     * <pre>
     * starting_proposal_id is the ID of the starting proposal.
     * </pre>
     *
     * <code>uint64 starting_proposal_id = 1 [json_name = "startingProposalId"];</code>
     */
    public var startingProposalId: kotlin.Long
      @JvmName("getStartingProposalId")
      get() = _builder.getStartingProposalId()
      @JvmName("setStartingProposalId")
      set(value) {
        _builder.setStartingProposalId(value)
      }
    /**
     * <pre>
     * starting_proposal_id is the ID of the starting proposal.
     * </pre>
     *
     * <code>uint64 starting_proposal_id = 1 [json_name = "startingProposalId"];</code>
     */
    public fun clearStartingProposalId() {
      _builder.clearStartingProposalId()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DepositsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     */
     public val deposits: com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDepositsList()
      )
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     * @param value The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDeposits")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>.add(value: cosmos.gov.v1.Gov.Deposit) {
      _builder.addDeposits(value)
    }
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     * @param value The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDeposits")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>.plusAssign(value: cosmos.gov.v1.Gov.Deposit) {
      add(value)
    }
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     * @param values The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDeposits")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.gov.v1.Gov.Deposit>) {
      _builder.addAllDeposits(values)
    }
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     * @param values The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDeposits")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.gov.v1.Gov.Deposit>) {
      addAll(values)
    }
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     * @param index The index to set the value at.
     * @param value The deposits to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDeposits")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>.set(index: kotlin.Int, value: cosmos.gov.v1.Gov.Deposit) {
      _builder.setDeposits(index, value)
    }
    /**
     * <pre>
     * deposits defines all the deposits present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Deposit deposits = 2 [json_name = "deposits"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDeposits")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Deposit, DepositsProxy>.clear() {
      _builder.clearDeposits()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class VotesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     */
     public val votes: com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getVotesList()
      )
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     * @param value The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addVotes")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>.add(value: cosmos.gov.v1.Gov.Vote) {
      _builder.addVotes(value)
    }
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     * @param value The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignVotes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>.plusAssign(value: cosmos.gov.v1.Gov.Vote) {
      add(value)
    }
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     * @param values The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllVotes")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.gov.v1.Gov.Vote>) {
      _builder.addAllVotes(values)
    }
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     * @param values The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllVotes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.gov.v1.Gov.Vote>) {
      addAll(values)
    }
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     * @param index The index to set the value at.
     * @param value The votes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setVotes")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>.set(index: kotlin.Int, value: cosmos.gov.v1.Gov.Vote) {
      _builder.setVotes(index, value)
    }
    /**
     * <pre>
     * votes defines all the votes present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Vote votes = 3 [json_name = "votes"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearVotes")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Vote, VotesProxy>.clear() {
      _builder.clearVotes()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ProposalsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     */
     public val proposals: com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getProposalsList()
      )
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     * @param value The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>.add(value: cosmos.gov.v1.Gov.Proposal) {
      _builder.addProposals(value)
    }
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     * @param value The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignProposals")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>.plusAssign(value: cosmos.gov.v1.Gov.Proposal) {
      add(value)
    }
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     * @param values The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.gov.v1.Gov.Proposal>) {
      _builder.addAllProposals(values)
    }
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     * @param values The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllProposals")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.gov.v1.Gov.Proposal>) {
      addAll(values)
    }
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     * @param index The index to set the value at.
     * @param value The proposals to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setProposals")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>.set(index: kotlin.Int, value: cosmos.gov.v1.Gov.Proposal) {
      _builder.setProposals(index, value)
    }
    /**
     * <pre>
     * proposals defines all the proposals present at genesis.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.Proposal proposals = 4 [json_name = "proposals"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1.Gov.Proposal, ProposalsProxy>.clear() {
      _builder.clearProposals()
    }


    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * deposit_params defines all the paramaters of related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1.DepositParams deposit_params = 5 [json_name = "depositParams", deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field depositParams is deprecated") public var depositParams: cosmos.gov.v1.Gov.DepositParams
      @JvmName("getDepositParams")
      get() = _builder.getDepositParams()
      @JvmName("setDepositParams")
      set(value) {
        _builder.setDepositParams(value)
      }
    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * deposit_params defines all the paramaters of related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1.DepositParams deposit_params = 5 [json_name = "depositParams", deprecated = true];</code>
     * @deprecated cosmos.gov.v1.GenesisState.deposit_params is deprecated.
     *     See cosmos/gov/v1/genesis.proto;l=21
     */
    public fun clearDepositParams() {
      _builder.clearDepositParams()
    }
    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * deposit_params defines all the paramaters of related to deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1.DepositParams deposit_params = 5 [json_name = "depositParams", deprecated = true];</code>
     * @deprecated cosmos.gov.v1.GenesisState.deposit_params is deprecated.
     *     See cosmos/gov/v1/genesis.proto;l=21
     * @return Whether the depositParams field is set.
     */
    public fun hasDepositParams(): kotlin.Boolean {
      return _builder.hasDepositParams()
    }

    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * voting_params defines all the paramaters of related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1.VotingParams voting_params = 6 [json_name = "votingParams", deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field votingParams is deprecated") public var votingParams: cosmos.gov.v1.Gov.VotingParams
      @JvmName("getVotingParams")
      get() = _builder.getVotingParams()
      @JvmName("setVotingParams")
      set(value) {
        _builder.setVotingParams(value)
      }
    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * voting_params defines all the paramaters of related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1.VotingParams voting_params = 6 [json_name = "votingParams", deprecated = true];</code>
     * @deprecated cosmos.gov.v1.GenesisState.voting_params is deprecated.
     *     See cosmos/gov/v1/genesis.proto;l=24
     */
    public fun clearVotingParams() {
      _builder.clearVotingParams()
    }
    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * voting_params defines all the paramaters of related to voting.
     * </pre>
     *
     * <code>.cosmos.gov.v1.VotingParams voting_params = 6 [json_name = "votingParams", deprecated = true];</code>
     * @deprecated cosmos.gov.v1.GenesisState.voting_params is deprecated.
     *     See cosmos/gov/v1/genesis.proto;l=24
     * @return Whether the votingParams field is set.
     */
    public fun hasVotingParams(): kotlin.Boolean {
      return _builder.hasVotingParams()
    }

    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * tally_params defines all the paramaters of related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1.TallyParams tally_params = 7 [json_name = "tallyParams", deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field tallyParams is deprecated") public var tallyParams: cosmos.gov.v1.Gov.TallyParams
      @JvmName("getTallyParams")
      get() = _builder.getTallyParams()
      @JvmName("setTallyParams")
      set(value) {
        _builder.setTallyParams(value)
      }
    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * tally_params defines all the paramaters of related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1.TallyParams tally_params = 7 [json_name = "tallyParams", deprecated = true];</code>
     * @deprecated cosmos.gov.v1.GenesisState.tally_params is deprecated.
     *     See cosmos/gov/v1/genesis.proto;l=27
     */
    public fun clearTallyParams() {
      _builder.clearTallyParams()
    }
    /**
     * <pre>
     * Deprecated: Prefer to use `params` instead.
     * tally_params defines all the paramaters of related to tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1.TallyParams tally_params = 7 [json_name = "tallyParams", deprecated = true];</code>
     * @deprecated cosmos.gov.v1.GenesisState.tally_params is deprecated.
     *     See cosmos/gov/v1/genesis.proto;l=27
     * @return Whether the tallyParams field is set.
     */
    public fun hasTallyParams(): kotlin.Boolean {
      return _builder.hasTallyParams()
    }

    /**
     * <pre>
     * params defines all the paramaters of x/gov module.
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>.cosmos.gov.v1.Params params = 8 [json_name = "params"];</code>
     */
    public var params: cosmos.gov.v1.Gov.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines all the paramaters of x/gov module.
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>.cosmos.gov.v1.Params params = 8 [json_name = "params"];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines all the paramaters of x/gov module.
     * Since: cosmos-sdk 0.47
     * </pre>
     *
     * <code>.cosmos.gov.v1.Params params = 8 [json_name = "params"];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }

    /**
     * <pre>
     * The constitution allows builders to lay a foundation and define purpose.
     * This is an immutable string set in genesis.
     * There are no amendments, to go outside of scope, just fork.
     * constitution is an immutable string in genesis for a chain builder to lay out their vision, ideas and ideals.
     * Since: cosmos-sdk 0.50
     * </pre>
     *
     * <code>string constitution = 9 [json_name = "constitution"];</code>
     */
    public var constitution: kotlin.String
      @JvmName("getConstitution")
      get() = _builder.getConstitution()
      @JvmName("setConstitution")
      set(value) {
        _builder.setConstitution(value)
      }
    /**
     * <pre>
     * The constitution allows builders to lay a foundation and define purpose.
     * This is an immutable string set in genesis.
     * There are no amendments, to go outside of scope, just fork.
     * constitution is an immutable string in genesis for a chain builder to lay out their vision, ideas and ideals.
     * Since: cosmos-sdk 0.50
     * </pre>
     *
     * <code>string constitution = 9 [json_name = "constitution"];</code>
     */
    public fun clearConstitution() {
      _builder.clearConstitution()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1.Genesis.GenesisState.copy(block: cosmos.gov.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1.Genesis.GenesisState =
  cosmos.gov.v1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.gov.v1.Genesis.GenesisStateOrBuilder.depositParamsOrNull: cosmos.gov.v1.Gov.DepositParams?
  get() = if (hasDepositParams()) getDepositParams() else null

public val cosmos.gov.v1.Genesis.GenesisStateOrBuilder.votingParamsOrNull: cosmos.gov.v1.Gov.VotingParams?
  get() = if (hasVotingParams()) getVotingParams() else null

public val cosmos.gov.v1.Genesis.GenesisStateOrBuilder.tallyParamsOrNull: cosmos.gov.v1.Gov.TallyParams?
  get() = if (hasTallyParams()) getTallyParams() else null

public val cosmos.gov.v1.Genesis.GenesisStateOrBuilder.paramsOrNull: cosmos.gov.v1.Gov.Params?
  get() = if (hasParams()) getParams() else null


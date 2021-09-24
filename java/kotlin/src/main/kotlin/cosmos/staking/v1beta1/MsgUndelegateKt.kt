//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgUndelegate(block: cosmos.staking.v1beta1.MsgUndelegateKt.Dsl.() -> Unit): cosmos.staking.v1beta1.Tx.MsgUndelegate =
  cosmos.staking.v1beta1.MsgUndelegateKt.Dsl._create(cosmos.staking.v1beta1.Tx.MsgUndelegate.newBuilder()).apply { block() }._build()
object MsgUndelegateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.staking.v1beta1.Tx.MsgUndelegate.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Tx.MsgUndelegate.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Tx.MsgUndelegate = _builder.build()

    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <code>string validator_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>string validator_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     */
    var amount: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     */
    fun clearAmount() {
      _builder.clearAmount()
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    fun hasAmount(): kotlin.Boolean {
      return _builder.hasAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.staking.v1beta1.Tx.MsgUndelegate.copy(block: cosmos.staking.v1beta1.MsgUndelegateKt.Dsl.() -> Unit): cosmos.staking.v1beta1.Tx.MsgUndelegate =
  cosmos.staking.v1beta1.MsgUndelegateKt.Dsl._create(this.toBuilder()).apply { block() }._build()
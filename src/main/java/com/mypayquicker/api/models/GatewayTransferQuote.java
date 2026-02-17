/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for GatewayTransferQuote type.
 */
public class GatewayTransferQuote
        extends BaseModel {
    private String sourceToken;
    private String destinationToken;
    private String note;
    private String memo;
    private Boolean autoAcceptQuote;
    private String clientTransferId;
    private Double destinationAmount;
    private Currencies destinationCurrency;
    private LockSideTypes transferLockSide;
    private TransferMethodTypes transferMethodType;

    /**
     * Default constructor.
     */
    public GatewayTransferQuote() {
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        destinationCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  sourceToken  String value for sourceToken.
     * @param  destinationToken  String value for destinationToken.
     * @param  note  String value for note.
     * @param  memo  String value for memo.
     * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
     * @param  clientTransferId  String value for clientTransferId.
     * @param  destinationAmount  Double value for destinationAmount.
     * @param  destinationCurrency  Currencies value for destinationCurrency.
     * @param  transferLockSide  LockSideTypes value for transferLockSide.
     * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
     */
    public GatewayTransferQuote(
            String sourceToken,
            String destinationToken,
            String note,
            String memo,
            Boolean autoAcceptQuote,
            String clientTransferId,
            Double destinationAmount,
            Currencies destinationCurrency,
            LockSideTypes transferLockSide,
            TransferMethodTypes transferMethodType) {
        this.sourceToken = sourceToken;
        this.destinationToken = destinationToken;
        this.note = note;
        this.memo = memo;
        this.autoAcceptQuote = autoAcceptQuote;
        this.clientTransferId = clientTransferId;
        this.destinationAmount = destinationAmount;
        this.destinationCurrency = destinationCurrency;
        this.transferLockSide = transferLockSide;
        this.transferMethodType = transferMethodType;
    }

    /**
     * Getter for SourceToken.
     * Unique identifier representing the [source of funds](#/rest/models/structures/source-token)
     * @return Returns the String
     */
    @JsonGetter("sourceToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceToken() {
        return sourceToken;
    }

    /**
     * Setter for SourceToken.
     * Unique identifier representing the [source of funds](#/rest/models/structures/source-token)
     * @param sourceToken Value for String
     */
    @JsonSetter("sourceToken")
    public void setSourceToken(String sourceToken) {
        this.sourceToken = sourceToken;
    }

    /**
     * Getter for DestinationToken.
     * Unique identifier representing the [destination of
     * funds](#/rest/models/structures/destination-token)
     * @return Returns the String
     */
    @JsonGetter("destinationToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationToken() {
        return destinationToken;
    }

    /**
     * Setter for DestinationToken.
     * Unique identifier representing the [destination of
     * funds](#/rest/models/structures/destination-token)
     * @param destinationToken Value for String
     */
    @JsonSetter("destinationToken")
    public void setDestinationToken(String destinationToken) {
        this.destinationToken = destinationToken;
    }

    /**
     * Getter for Note.
     * [Optional comments](#/rest/models/structures/notes) visible to the user
     * @return Returns the String
     */
    @JsonGetter("note")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * [Optional comments](#/rest/models/structures/notes) visible to the user
     * @param note Value for String
     */
    @JsonSetter("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Getter for Memo.
     * Optional internal [memo](#/rest/models/structures/memo) not visible to the user
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * Optional internal [memo](#/rest/models/structures/memo) not visible to the user
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for AutoAcceptQuote.
     * Determines whether the quote is [automatically
     * accepted](#/rest/models/structures/auto-accept-quote) or if a `POST` utilizing the token for
     * the quote is required.
     * @return Returns the Boolean
     */
    @JsonGetter("autoAcceptQuote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoAcceptQuote() {
        return autoAcceptQuote;
    }

    /**
     * Setter for AutoAcceptQuote.
     * Determines whether the quote is [automatically
     * accepted](#/rest/models/structures/auto-accept-quote) or if a `POST` utilizing the token for
     * the quote is required.
     * @param autoAcceptQuote Value for Boolean
     */
    @JsonSetter("autoAcceptQuote")
    public void setAutoAcceptQuote(Boolean autoAcceptQuote) {
        this.autoAcceptQuote = autoAcceptQuote;
    }

    /**
     * Getter for ClientTransferId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @return Returns the String
     */
    @JsonGetter("clientTransferId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientTransferId() {
        return clientTransferId;
    }

    /**
     * Setter for ClientTransferId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @param clientTransferId Value for String
     */
    @JsonSetter("clientTransferId")
    public void setClientTransferId(String clientTransferId) {
        this.clientTransferId = clientTransferId;
    }

    /**
     * Getter for DestinationAmount.
     * Allocated money to be sent in the transaction.
     * @return Returns the Double
     */
    @JsonGetter("destinationAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDestinationAmount() {
        return destinationAmount;
    }

    /**
     * Setter for DestinationAmount.
     * Allocated money to be sent in the transaction.
     * @param destinationAmount Value for Double
     */
    @JsonSetter("destinationAmount")
    public void setDestinationAmount(Double destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    /**
     * Getter for DestinationCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("destinationCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getDestinationCurrency() {
        return destinationCurrency;
    }

    /**
     * Setter for DestinationCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param destinationCurrency Value for Currencies
     */
    @JsonSetter("destinationCurrency")
    public void setDestinationCurrency(Currencies destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }

    /**
     * Getter for TransferLockSide.
     * Type of [lockside](page:additional-api-information/transfer-lockside-types) for transfers.
     * @return Returns the LockSideTypes
     */
    @JsonGetter("transferLockSide")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LockSideTypes getTransferLockSide() {
        return transferLockSide;
    }

    /**
     * Setter for TransferLockSide.
     * Type of [lockside](page:additional-api-information/transfer-lockside-types) for transfers.
     * @param transferLockSide Value for LockSideTypes
     */
    @JsonSetter("transferLockSide")
    public void setTransferLockSide(LockSideTypes transferLockSide) {
        this.transferLockSide = transferLockSide;
    }

    /**
     * Getter for TransferMethodType.
     * Optional transfer methods applicable only to bank and e-wallet transfers.
     * @return Returns the TransferMethodTypes
     */
    @JsonGetter("transferMethodType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransferMethodTypes getTransferMethodType() {
        return transferMethodType;
    }

    /**
     * Setter for TransferMethodType.
     * Optional transfer methods applicable only to bank and e-wallet transfers.
     * @param transferMethodType Value for TransferMethodTypes
     */
    @JsonSetter("transferMethodType")
    public void setTransferMethodType(TransferMethodTypes transferMethodType) {
        this.transferMethodType = transferMethodType;
    }

    /**
     * Converts this GatewayTransferQuote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GatewayTransferQuote [" + "sourceToken=" + sourceToken + ", destinationToken="
                + destinationToken + ", note=" + note + ", memo=" + memo + ", autoAcceptQuote="
                + autoAcceptQuote + ", clientTransferId=" + clientTransferId
                + ", destinationAmount=" + destinationAmount + ", destinationCurrency="
                + destinationCurrency + ", transferLockSide=" + transferLockSide
                + ", transferMethodType=" + transferMethodType + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GatewayTransferQuote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GatewayTransferQuote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sourceToken(getSourceToken())
                .destinationToken(getDestinationToken())
                .note(getNote())
                .memo(getMemo())
                .autoAcceptQuote(getAutoAcceptQuote())
                .clientTransferId(getClientTransferId())
                .destinationAmount(getDestinationAmount())
                .destinationCurrency(getDestinationCurrency())
                .transferLockSide(getTransferLockSide())
                .transferMethodType(getTransferMethodType());
        return builder;
    }

    /**
     * Class to build instances of {@link GatewayTransferQuote}.
     */
    public static class Builder {
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private String note;
        private String memo;
        private Boolean autoAcceptQuote;
        private String clientTransferId;
        private Double destinationAmount;
        private Currencies destinationCurrency = Currencies.USD;
        private LockSideTypes transferLockSide;
        private TransferMethodTypes transferMethodType;



        /**
         * Setter for sourceToken.
         * @param  sourceToken  String value for sourceToken.
         * @return Builder
         */
        public Builder sourceToken(String sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }

        /**
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
            return this;
        }

        /**
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for autoAcceptQuote.
         * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
         * @return Builder
         */
        public Builder autoAcceptQuote(Boolean autoAcceptQuote) {
            this.autoAcceptQuote = autoAcceptQuote;
            return this;
        }

        /**
         * Setter for clientTransferId.
         * @param  clientTransferId  String value for clientTransferId.
         * @return Builder
         */
        public Builder clientTransferId(String clientTransferId) {
            this.clientTransferId = clientTransferId;
            return this;
        }

        /**
         * Setter for destinationAmount.
         * @param  destinationAmount  Double value for destinationAmount.
         * @return Builder
         */
        public Builder destinationAmount(Double destinationAmount) {
            this.destinationAmount = destinationAmount;
            return this;
        }

        /**
         * Setter for destinationCurrency.
         * @param  destinationCurrency  Currencies value for destinationCurrency.
         * @return Builder
         */
        public Builder destinationCurrency(Currencies destinationCurrency) {
            this.destinationCurrency = destinationCurrency;
            return this;
        }

        /**
         * Setter for transferLockSide.
         * @param  transferLockSide  LockSideTypes value for transferLockSide.
         * @return Builder
         */
        public Builder transferLockSide(LockSideTypes transferLockSide) {
            this.transferLockSide = transferLockSide;
            return this;
        }

        /**
         * Setter for transferMethodType.
         * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
         * @return Builder
         */
        public Builder transferMethodType(TransferMethodTypes transferMethodType) {
            this.transferMethodType = transferMethodType;
            return this;
        }

        /**
         * Builds a new {@link GatewayTransferQuote} object using the set fields.
         * @return {@link GatewayTransferQuote}
         */
        public GatewayTransferQuote build() {
            return new GatewayTransferQuote(sourceToken, destinationToken, note, memo,
                    autoAcceptQuote, clientTransferId, destinationAmount, destinationCurrency,
                    transferLockSide, transferMethodType);
        }
    }
}

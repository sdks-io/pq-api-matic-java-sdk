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
 * This is a model class for PortalTransferQuote type.
 */
public class PortalTransferQuote
        extends BaseModel {
    private String sourceToken;
    private String programUserId;
    private String email;
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
    public PortalTransferQuote() {
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        destinationCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  sourceToken  String value for sourceToken.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  note  String value for note.
     * @param  memo  String value for memo.
     * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
     * @param  clientTransferId  String value for clientTransferId.
     * @param  destinationAmount  Double value for destinationAmount.
     * @param  destinationCurrency  Currencies value for destinationCurrency.
     * @param  transferLockSide  LockSideTypes value for transferLockSide.
     * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
     */
    public PortalTransferQuote(
            String sourceToken,
            String programUserId,
            String email,
            String note,
            String memo,
            Boolean autoAcceptQuote,
            String clientTransferId,
            Double destinationAmount,
            Currencies destinationCurrency,
            LockSideTypes transferLockSide,
            TransferMethodTypes transferMethodType) {
        this.sourceToken = sourceToken;
        this.programUserId = programUserId;
        this.email = email;
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
     * Getter for ProgramUserId.
     * [Program identifier](#/rest/models/structures/program-user-id) for the user
     * @return Returns the String
     */
    @JsonGetter("programUserId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProgramUserId() {
        return programUserId;
    }

    /**
     * Setter for ProgramUserId.
     * [Program identifier](#/rest/models/structures/program-user-id) for the user
     * @param programUserId Value for String
     */
    @JsonSetter("programUserId")
    public void setProgramUserId(String programUserId) {
        this.programUserId = programUserId;
    }

    /**
     * Getter for Email.
     * Contact [email address](#/rest/models/structures/email-address) for the user account for the
     * user account
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Contact [email address](#/rest/models/structures/email-address) for the user account for the
     * user account
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
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
     * Converts this PortalTransferQuote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PortalTransferQuote [" + "sourceToken=" + sourceToken + ", programUserId="
                + programUserId + ", email=" + email + ", note=" + note + ", memo=" + memo
                + ", autoAcceptQuote=" + autoAcceptQuote + ", clientTransferId=" + clientTransferId
                + ", destinationAmount=" + destinationAmount + ", destinationCurrency="
                + destinationCurrency + ", transferLockSide=" + transferLockSide
                + ", transferMethodType=" + transferMethodType + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PortalTransferQuote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PortalTransferQuote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sourceToken(getSourceToken())
                .programUserId(getProgramUserId())
                .email(getEmail())
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
     * Class to build instances of {@link PortalTransferQuote}.
     */
    public static class Builder {
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String programUserId;
        private String email;
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
         * Setter for programUserId.
         * @param  programUserId  String value for programUserId.
         * @return Builder
         */
        public Builder programUserId(String programUserId) {
            this.programUserId = programUserId;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
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
         * Builds a new {@link PortalTransferQuote} object using the set fields.
         * @return {@link PortalTransferQuote}
         */
        public PortalTransferQuote build() {
            return new PortalTransferQuote(sourceToken, programUserId, email, note, memo,
                    autoAcceptQuote, clientTransferId, destinationAmount, destinationCurrency,
                    transferLockSide, transferMethodType);
        }
    }
}

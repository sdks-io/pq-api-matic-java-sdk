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
 * This is a model class for CreateSpendbackRefundQuote type.
 */
public class CreateSpendbackRefundQuote
        extends BaseModel {
    private Double amount;
    private String sourceToken;
    private String programUserId;
    private String email;
    private String destinationToken;
    private String memo;
    private String note;
    private String clientSpendbackRefundId;
    private Boolean autoAcceptQuote;

    /**
     * Default constructor.
     */
    public CreateSpendbackRefundQuote() {
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  sourceToken  String value for sourceToken.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  destinationToken  String value for destinationToken.
     * @param  memo  String value for memo.
     * @param  note  String value for note.
     * @param  clientSpendbackRefundId  String value for clientSpendbackRefundId.
     * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
     */
    public CreateSpendbackRefundQuote(
            Double amount,
            String sourceToken,
            String programUserId,
            String email,
            String destinationToken,
            String memo,
            String note,
            String clientSpendbackRefundId,
            Boolean autoAcceptQuote) {
        this.amount = amount;
        this.sourceToken = sourceToken;
        this.programUserId = programUserId;
        this.email = email;
        this.destinationToken = destinationToken;
        this.memo = memo;
        this.note = note;
        this.clientSpendbackRefundId = clientSpendbackRefundId;
        this.autoAcceptQuote = autoAcceptQuote;
    }

    /**
     * Getter for Amount.
     * Money to be refunded from original payment
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Money to be refunded from original payment
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
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
     * Getter for ClientSpendbackRefundId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @return Returns the String
     */
    @JsonGetter("clientSpendbackRefundId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientSpendbackRefundId() {
        return clientSpendbackRefundId;
    }

    /**
     * Setter for ClientSpendbackRefundId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @param clientSpendbackRefundId Value for String
     */
    @JsonSetter("clientSpendbackRefundId")
    public void setClientSpendbackRefundId(String clientSpendbackRefundId) {
        this.clientSpendbackRefundId = clientSpendbackRefundId;
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
     * Converts this CreateSpendbackRefundQuote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSpendbackRefundQuote [" + "amount=" + amount + ", sourceToken=" + sourceToken
                + ", programUserId=" + programUserId + ", email=" + email + ", destinationToken="
                + destinationToken + ", memo=" + memo + ", note=" + note
                + ", clientSpendbackRefundId=" + clientSpendbackRefundId + ", autoAcceptQuote="
                + autoAcceptQuote + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateSpendbackRefundQuote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSpendbackRefundQuote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .sourceToken(getSourceToken())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .destinationToken(getDestinationToken())
                .memo(getMemo())
                .note(getNote())
                .clientSpendbackRefundId(getClientSpendbackRefundId())
                .autoAcceptQuote(getAutoAcceptQuote());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSpendbackRefundQuote}.
     */
    public static class Builder {
        private Double amount;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String programUserId;
        private String email;
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private String memo;
        private String note;
        private String clientSpendbackRefundId;
        private Boolean autoAcceptQuote;



        /**
         * Setter for amount.
         * @param  amount  Double value for amount.
         * @return Builder
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

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
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
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
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * Setter for clientSpendbackRefundId.
         * @param  clientSpendbackRefundId  String value for clientSpendbackRefundId.
         * @return Builder
         */
        public Builder clientSpendbackRefundId(String clientSpendbackRefundId) {
            this.clientSpendbackRefundId = clientSpendbackRefundId;
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
         * Builds a new {@link CreateSpendbackRefundQuote} object using the set fields.
         * @return {@link CreateSpendbackRefundQuote}
         */
        public CreateSpendbackRefundQuote build() {
            return new CreateSpendbackRefundQuote(amount, sourceToken, programUserId, email,
                    destinationToken, memo, note, clientSpendbackRefundId, autoAcceptQuote);
        }
    }
}

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
 * This is a model class for PortalSpendbackQuote type.
 */
public class PortalSpendbackQuote
        extends BaseModel {
    private Double amount;
    private Currencies currency;
    private String programUserId;
    private String email;
    private String destinationToken;
    private String memo;
    private String note;
    private String clientSpendbackId;
    private Boolean autoAcceptQuote;

    /**
     * Default constructor.
     */
    public PortalSpendbackQuote() {
        amount = 1.02d;
        currency = Currencies.USD;
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  destinationToken  String value for destinationToken.
     * @param  memo  String value for memo.
     * @param  note  String value for note.
     * @param  clientSpendbackId  String value for clientSpendbackId.
     * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
     */
    public PortalSpendbackQuote(
            Double amount,
            Currencies currency,
            String programUserId,
            String email,
            String destinationToken,
            String memo,
            String note,
            String clientSpendbackId,
            Boolean autoAcceptQuote) {
        this.amount = amount;
        this.currency = currency;
        this.programUserId = programUserId;
        this.email = email;
        this.destinationToken = destinationToken;
        this.memo = memo;
        this.note = note;
        this.clientSpendbackId = clientSpendbackId;
        this.autoAcceptQuote = autoAcceptQuote;
    }

    /**
     * Getter for Amount.
     * Allocated money to be sent in the transaction.
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Allocated money to be sent in the transaction.
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param currency Value for Currencies
     */
    @JsonSetter("currency")
    public void setCurrency(Currencies currency) {
        this.currency = currency;
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
     * Getter for ClientSpendbackId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * spendback
     * @return Returns the String
     */
    @JsonGetter("clientSpendbackId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientSpendbackId() {
        return clientSpendbackId;
    }

    /**
     * Setter for ClientSpendbackId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * spendback
     * @param clientSpendbackId Value for String
     */
    @JsonSetter("clientSpendbackId")
    public void setClientSpendbackId(String clientSpendbackId) {
        this.clientSpendbackId = clientSpendbackId;
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
     * Converts this PortalSpendbackQuote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PortalSpendbackQuote [" + "amount=" + amount + ", currency=" + currency
                + ", programUserId=" + programUserId + ", email=" + email + ", destinationToken="
                + destinationToken + ", memo=" + memo + ", note=" + note + ", clientSpendbackId="
                + clientSpendbackId + ", autoAcceptQuote=" + autoAcceptQuote
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PortalSpendbackQuote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PortalSpendbackQuote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .destinationToken(getDestinationToken())
                .memo(getMemo())
                .note(getNote())
                .clientSpendbackId(getClientSpendbackId())
                .autoAcceptQuote(getAutoAcceptQuote());
        return builder;
    }

    /**
     * Class to build instances of {@link PortalSpendbackQuote}.
     */
    public static class Builder {
        private Double amount = 1.02d;
        private Currencies currency = Currencies.USD;
        private String programUserId;
        private String email;
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private String memo;
        private String note;
        private String clientSpendbackId;
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
         * Setter for currency.
         * @param  currency  Currencies value for currency.
         * @return Builder
         */
        public Builder currency(Currencies currency) {
            this.currency = currency;
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
         * Setter for clientSpendbackId.
         * @param  clientSpendbackId  String value for clientSpendbackId.
         * @return Builder
         */
        public Builder clientSpendbackId(String clientSpendbackId) {
            this.clientSpendbackId = clientSpendbackId;
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
         * Builds a new {@link PortalSpendbackQuote} object using the set fields.
         * @return {@link PortalSpendbackQuote}
         */
        public PortalSpendbackQuote build() {
            return new PortalSpendbackQuote(amount, currency, programUserId, email,
                    destinationToken, memo, note, clientSpendbackId, autoAcceptQuote);
        }
    }
}

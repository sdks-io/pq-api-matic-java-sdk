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
 * This is a model class for GatewayPaymentJobQuote type.
 */
public class GatewayPaymentJobQuote
        extends BaseModel {
    private Double amount;
    private Currencies currency;
    private String sourceToken;
    private String destinationToken;
    private String note;
    private String memo;
    private PaymentPurposes purpose;
    private String clientPaymentId;

    /**
     * Default constructor.
     */
    public GatewayPaymentJobQuote() {
        amount = 1.02d;
        currency = Currencies.USD;
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        clientPaymentId = "d4b6f130-1d1c-4ce2-903a-0c1ad128f55e";
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  sourceToken  String value for sourceToken.
     * @param  destinationToken  String value for destinationToken.
     * @param  note  String value for note.
     * @param  memo  String value for memo.
     * @param  purpose  PaymentPurposes value for purpose.
     * @param  clientPaymentId  String value for clientPaymentId.
     */
    public GatewayPaymentJobQuote(
            Double amount,
            Currencies currency,
            String sourceToken,
            String destinationToken,
            String note,
            String memo,
            PaymentPurposes purpose,
            String clientPaymentId) {
        this.amount = amount;
        this.currency = currency;
        this.sourceToken = sourceToken;
        this.destinationToken = destinationToken;
        this.note = note;
        this.memo = memo;
        this.purpose = purpose;
        this.clientPaymentId = clientPaymentId;
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
     * Getter for Purpose.
     * Used to identify the [purpose of a payment](#/models/structures/payment-object) and impacts
     * reporting and calculated taxable earnings (if utilizing tax services)
     * @return Returns the PaymentPurposes
     */
    @JsonGetter("purpose")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentPurposes getPurpose() {
        return purpose;
    }

    /**
     * Setter for Purpose.
     * Used to identify the [purpose of a payment](#/models/structures/payment-object) and impacts
     * reporting and calculated taxable earnings (if utilizing tax services)
     * @param purpose Value for PaymentPurposes
     */
    @JsonSetter("purpose")
    public void setPurpose(PaymentPurposes purpose) {
        this.purpose = purpose;
    }

    /**
     * Getter for ClientPaymentId.
     * Unique value provided by the client for the [payment](page:resources/payments), utilized for
     * reference and deduplication.
     * @return Returns the String
     */
    @JsonGetter("clientPaymentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientPaymentId() {
        return clientPaymentId;
    }

    /**
     * Setter for ClientPaymentId.
     * Unique value provided by the client for the [payment](page:resources/payments), utilized for
     * reference and deduplication.
     * @param clientPaymentId Value for String
     */
    @JsonSetter("clientPaymentId")
    public void setClientPaymentId(String clientPaymentId) {
        this.clientPaymentId = clientPaymentId;
    }

    /**
     * Converts this GatewayPaymentJobQuote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GatewayPaymentJobQuote [" + "amount=" + amount + ", currency=" + currency
                + ", sourceToken=" + sourceToken + ", destinationToken=" + destinationToken
                + ", note=" + note + ", memo=" + memo + ", purpose=" + purpose
                + ", clientPaymentId=" + clientPaymentId + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GatewayPaymentJobQuote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GatewayPaymentJobQuote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency())
                .sourceToken(getSourceToken())
                .destinationToken(getDestinationToken())
                .note(getNote())
                .memo(getMemo())
                .purpose(getPurpose())
                .clientPaymentId(getClientPaymentId());
        return builder;
    }

    /**
     * Class to build instances of {@link GatewayPaymentJobQuote}.
     */
    public static class Builder {
        private Double amount = 1.02d;
        private Currencies currency = Currencies.USD;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private String note;
        private String memo;
        private PaymentPurposes purpose;
        private String clientPaymentId = "d4b6f130-1d1c-4ce2-903a-0c1ad128f55e";



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
         * Setter for purpose.
         * @param  purpose  PaymentPurposes value for purpose.
         * @return Builder
         */
        public Builder purpose(PaymentPurposes purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * Setter for clientPaymentId.
         * @param  clientPaymentId  String value for clientPaymentId.
         * @return Builder
         */
        public Builder clientPaymentId(String clientPaymentId) {
            this.clientPaymentId = clientPaymentId;
            return this;
        }

        /**
         * Builds a new {@link GatewayPaymentJobQuote} object using the set fields.
         * @return {@link GatewayPaymentJobQuote}
         */
        public GatewayPaymentJobQuote build() {
            return new GatewayPaymentJobQuote(amount, currency, sourceToken, destinationToken, note,
                    memo, purpose, clientPaymentId);
        }
    }
}

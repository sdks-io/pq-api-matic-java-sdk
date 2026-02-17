/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mypayquicker.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for PortalPaymentQuote type.
 */
public class PortalPaymentQuote
        extends BaseModel {
    private Double amount;
    private Currencies currency;
    private String sourceToken;
    private String programUserId;
    private String email;
    private String note;
    private String memo;
    private PaymentPurposes purpose;
    private String clientPaymentId;
    private Boolean autoAcceptQuote;
    private LocalDateTime notBefore;
    private LocalDateTime notAfter;

    /**
     * Default constructor.
     */
    public PortalPaymentQuote() {
        amount = 1.02d;
        currency = Currencies.USD;
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        clientPaymentId = "d4b6f130-1d1c-4ce2-903a-0c1ad128f55e";
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  sourceToken  String value for sourceToken.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  note  String value for note.
     * @param  memo  String value for memo.
     * @param  purpose  PaymentPurposes value for purpose.
     * @param  clientPaymentId  String value for clientPaymentId.
     * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
     * @param  notBefore  LocalDateTime value for notBefore.
     * @param  notAfter  LocalDateTime value for notAfter.
     */
    public PortalPaymentQuote(
            Double amount,
            Currencies currency,
            String sourceToken,
            String programUserId,
            String email,
            String note,
            String memo,
            PaymentPurposes purpose,
            String clientPaymentId,
            Boolean autoAcceptQuote,
            LocalDateTime notBefore,
            LocalDateTime notAfter) {
        this.amount = amount;
        this.currency = currency;
        this.sourceToken = sourceToken;
        this.programUserId = programUserId;
        this.email = email;
        this.note = note;
        this.memo = memo;
        this.purpose = purpose;
        this.clientPaymentId = clientPaymentId;
        this.autoAcceptQuote = autoAcceptQuote;
        this.notBefore = notBefore;
        this.notAfter = notAfter;
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
     * Getter for NotBefore.
     * [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process
     * before this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notBefore")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotBefore() {
        return notBefore;
    }

    /**
     * Setter for NotBefore.
     * [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process
     * before this time.
     * @param notBefore Value for LocalDateTime
     */
    @JsonSetter("notBefore")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotBefore(LocalDateTime notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * Getter for NotAfter.
     * [Transfer](#/rest/models/structures/not-before-or-after) expires if not completed prior to
     * this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notAfter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotAfter() {
        return notAfter;
    }

    /**
     * Setter for NotAfter.
     * [Transfer](#/rest/models/structures/not-before-or-after) expires if not completed prior to
     * this time.
     * @param notAfter Value for LocalDateTime
     */
    @JsonSetter("notAfter")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotAfter(LocalDateTime notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * Converts this PortalPaymentQuote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PortalPaymentQuote [" + "amount=" + amount + ", currency=" + currency
                + ", sourceToken=" + sourceToken + ", programUserId=" + programUserId + ", email="
                + email + ", note=" + note + ", memo=" + memo + ", purpose=" + purpose
                + ", clientPaymentId=" + clientPaymentId + ", autoAcceptQuote=" + autoAcceptQuote
                + ", notBefore=" + notBefore + ", notAfter=" + notAfter + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PortalPaymentQuote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PortalPaymentQuote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency())
                .sourceToken(getSourceToken())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .note(getNote())
                .memo(getMemo())
                .purpose(getPurpose())
                .clientPaymentId(getClientPaymentId())
                .autoAcceptQuote(getAutoAcceptQuote())
                .notBefore(getNotBefore())
                .notAfter(getNotAfter());
        return builder;
    }

    /**
     * Class to build instances of {@link PortalPaymentQuote}.
     */
    public static class Builder {
        private Double amount = 1.02d;
        private Currencies currency = Currencies.USD;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String programUserId;
        private String email;
        private String note;
        private String memo;
        private PaymentPurposes purpose;
        private String clientPaymentId = "d4b6f130-1d1c-4ce2-903a-0c1ad128f55e";
        private Boolean autoAcceptQuote;
        private LocalDateTime notBefore;
        private LocalDateTime notAfter;



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
         * Setter for autoAcceptQuote.
         * @param  autoAcceptQuote  Boolean value for autoAcceptQuote.
         * @return Builder
         */
        public Builder autoAcceptQuote(Boolean autoAcceptQuote) {
            this.autoAcceptQuote = autoAcceptQuote;
            return this;
        }

        /**
         * Setter for notBefore.
         * @param  notBefore  LocalDateTime value for notBefore.
         * @return Builder
         */
        public Builder notBefore(LocalDateTime notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * Setter for notAfter.
         * @param  notAfter  LocalDateTime value for notAfter.
         * @return Builder
         */
        public Builder notAfter(LocalDateTime notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * Builds a new {@link PortalPaymentQuote} object using the set fields.
         * @return {@link PortalPaymentQuote}
         */
        public PortalPaymentQuote build() {
            return new PortalPaymentQuote(amount, currency, sourceToken, programUserId, email, note,
                    memo, purpose, clientPaymentId, autoAcceptQuote, notBefore, notAfter);
        }
    }
}

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
import java.util.List;

/**
 * This is a model class for AuthorizationObject type.
 */
public class AuthorizationObject
        extends BaseModel {
    private PrepaidCardAuthorizations type;
    private LocalDateTime createdOn;
    private Signs sign;
    private String sourceToken;
    private Double amount;
    private Currencies currency;
    private ReceiptStatuses status;
    private List<Translation> descriptions;
    private LocalDateTime authDate;
    private String reference;

    /**
     * Default constructor.
     */
    public AuthorizationObject() {
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        amount = 1.02d;
        currency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  type  PrepaidCardAuthorizations value for type.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  sign  Signs value for sign.
     * @param  sourceToken  String value for sourceToken.
     * @param  amount  Double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  status  ReceiptStatuses value for status.
     * @param  descriptions  List of Translation value for descriptions.
     * @param  authDate  LocalDateTime value for authDate.
     * @param  reference  String value for reference.
     */
    public AuthorizationObject(
            PrepaidCardAuthorizations type,
            LocalDateTime createdOn,
            Signs sign,
            String sourceToken,
            Double amount,
            Currencies currency,
            ReceiptStatuses status,
            List<Translation> descriptions,
            LocalDateTime authDate,
            String reference) {
        this.type = type;
        this.createdOn = createdOn;
        this.sign = sign;
        this.sourceToken = sourceToken;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.descriptions = descriptions;
        this.authDate = authDate;
        this.reference = reference;
    }

    /**
     * Getter for Type.
     * Financial types for the [prepaid card](page:resources/prepaid-cards) authorization.
     * @return Returns the PrepaidCardAuthorizations
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidCardAuthorizations getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Financial types for the [prepaid card](page:resources/prepaid-cards) authorization.
     * @param type Value for PrepaidCardAuthorizations
     */
    @JsonSetter("type")
    public void setType(PrepaidCardAuthorizations type) {
        this.type = type;
    }

    /**
     * Getter for CreatedOn.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createdOn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("createdOn")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for Sign.
     * Receipt sign types
     * @return Returns the Signs
     */
    @JsonGetter("sign")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Signs getSign() {
        return sign;
    }

    /**
     * Setter for Sign.
     * Receipt sign types
     * @param sign Value for Signs
     */
    @JsonSetter("sign")
    public void setSign(Signs sign) {
        this.sign = sign;
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
     * Getter for Status.
     * Receipt status types
     * @return Returns the ReceiptStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReceiptStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Receipt status types
     * @param status Value for ReceiptStatuses
     */
    @JsonSetter("status")
    public void setStatus(ReceiptStatuses status) {
        this.status = status;
    }

    /**
     * Getter for Descriptions.
     * @return Returns the List of Translation
     */
    @JsonGetter("descriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Translation> getDescriptions() {
        return descriptions;
    }

    /**
     * Setter for Descriptions.
     * @param descriptions Value for List of Translation
     */
    @JsonSetter("descriptions")
    public void setDescriptions(List<Translation> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Getter for AuthDate.
     * Date that the auth was created
     * @return Returns the LocalDateTime
     */
    @JsonGetter("authDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getAuthDate() {
        return authDate;
    }

    /**
     * Setter for AuthDate.
     * Date that the auth was created
     * @param authDate Value for LocalDateTime
     */
    @JsonSetter("authDate")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setAuthDate(LocalDateTime authDate) {
        this.authDate = authDate;
    }

    /**
     * Getter for Reference.
     * [Provider reference](#/rest/models/structures/identity-verification-provider-reference) used
     * for performing identity checks for the provider
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * [Provider reference](#/rest/models/structures/identity-verification-provider-reference) used
     * for performing identity checks for the provider
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Converts this AuthorizationObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizationObject [" + "type=" + type + ", createdOn=" + createdOn + ", sign="
                + sign + ", sourceToken=" + sourceToken + ", amount=" + amount + ", currency="
                + currency + ", status=" + status + ", descriptions=" + descriptions + ", authDate="
                + authDate + ", reference=" + reference + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AuthorizationObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizationObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .createdOn(getCreatedOn())
                .sign(getSign())
                .sourceToken(getSourceToken())
                .amount(getAmount())
                .currency(getCurrency())
                .status(getStatus())
                .descriptions(getDescriptions())
                .authDate(getAuthDate())
                .reference(getReference());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizationObject}.
     */
    public static class Builder {
        private PrepaidCardAuthorizations type;
        private LocalDateTime createdOn;
        private Signs sign;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private Double amount = 1.02d;
        private Currencies currency = Currencies.USD;
        private ReceiptStatuses status;
        private List<Translation> descriptions;
        private LocalDateTime authDate;
        private String reference;



        /**
         * Setter for type.
         * @param  type  PrepaidCardAuthorizations value for type.
         * @return Builder
         */
        public Builder type(PrepaidCardAuthorizations type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for sign.
         * @param  sign  Signs value for sign.
         * @return Builder
         */
        public Builder sign(Signs sign) {
            this.sign = sign;
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
         * Setter for status.
         * @param  status  ReceiptStatuses value for status.
         * @return Builder
         */
        public Builder status(ReceiptStatuses status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for descriptions.
         * @param  descriptions  List of Translation value for descriptions.
         * @return Builder
         */
        public Builder descriptions(List<Translation> descriptions) {
            this.descriptions = descriptions;
            return this;
        }

        /**
         * Setter for authDate.
         * @param  authDate  LocalDateTime value for authDate.
         * @return Builder
         */
        public Builder authDate(LocalDateTime authDate) {
            this.authDate = authDate;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Builds a new {@link AuthorizationObject} object using the set fields.
         * @return {@link AuthorizationObject}
         */
        public AuthorizationObject build() {
            return new AuthorizationObject(type, createdOn, sign, sourceToken, amount, currency,
                    status, descriptions, authDate, reference);
        }
    }
}

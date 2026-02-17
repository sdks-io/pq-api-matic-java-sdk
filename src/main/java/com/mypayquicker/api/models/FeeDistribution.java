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
import java.util.List;

/**
 * This is a model class for FeeDistribution type.
 */
public class FeeDistribution
        extends BaseModel {
    private Double amount;
    private Currencies currency;
    private List<ReceiptDescriptions> description;
    private String formattedAmount;
    private Double percentage;
    private FeeResponsibilityParties responsibility;
    private FeeResponsibilitySources responsibilitySource;
    private String sourceToken;

    /**
     * Default constructor.
     */
    public FeeDistribution() {
        amount = 1.02d;
        currency = Currencies.USD;
        formattedAmount = "$0.05 USD";
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  description  List of ReceiptDescriptions value for description.
     * @param  formattedAmount  String value for formattedAmount.
     * @param  percentage  Double value for percentage.
     * @param  responsibility  FeeResponsibilityParties value for responsibility.
     * @param  responsibilitySource  FeeResponsibilitySources value for responsibilitySource.
     * @param  sourceToken  String value for sourceToken.
     */
    public FeeDistribution(
            Double amount,
            Currencies currency,
            List<ReceiptDescriptions> description,
            String formattedAmount,
            Double percentage,
            FeeResponsibilityParties responsibility,
            FeeResponsibilitySources responsibilitySource,
            String sourceToken) {
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.formattedAmount = formattedAmount;
        this.percentage = percentage;
        this.responsibility = responsibility;
        this.responsibilitySource = responsibilitySource;
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
     * Getter for Description.
     * @return Returns the List of ReceiptDescriptions
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ReceiptDescriptions> getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for List of ReceiptDescriptions
     */
    @JsonSetter("description")
    public void setDescription(List<ReceiptDescriptions> description) {
        this.description = description;
    }

    /**
     * Getter for FormattedAmount.
     * Combination of the amount and currency type
     * @return Returns the String
     */
    @JsonGetter("formattedAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFormattedAmount() {
        return formattedAmount;
    }

    /**
     * Setter for FormattedAmount.
     * Combination of the amount and currency type
     * @param formattedAmount Value for String
     */
    @JsonSetter("formattedAmount")
    public void setFormattedAmount(String formattedAmount) {
        this.formattedAmount = formattedAmount;
    }

    /**
     * Getter for Percentage.
     * Fee percentage that the responsible account pays
     * @return Returns the Double
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * Fee percentage that the responsible account pays
     * @param percentage Value for Double
     */
    @JsonSetter("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * Getter for Responsibility.
     * Fee responsibility types
     * @return Returns the FeeResponsibilityParties
     */
    @JsonGetter("responsibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeResponsibilityParties getResponsibility() {
        return responsibility;
    }

    /**
     * Setter for Responsibility.
     * Fee responsibility types
     * @param responsibility Value for FeeResponsibilityParties
     */
    @JsonSetter("responsibility")
    public void setResponsibility(FeeResponsibilityParties responsibility) {
        this.responsibility = responsibility;
    }

    /**
     * Getter for ResponsibilitySource.
     * Fee responsibility source types
     * @return Returns the FeeResponsibilitySources
     */
    @JsonGetter("responsibilitySource")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeResponsibilitySources getResponsibilitySource() {
        return responsibilitySource;
    }

    /**
     * Setter for ResponsibilitySource.
     * Fee responsibility source types
     * @param responsibilitySource Value for FeeResponsibilitySources
     */
    @JsonSetter("responsibilitySource")
    public void setResponsibilitySource(FeeResponsibilitySources responsibilitySource) {
        this.responsibilitySource = responsibilitySource;
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
     * Converts this FeeDistribution into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeeDistribution [" + "amount=" + amount + ", currency=" + currency
                + ", description=" + description + ", formattedAmount=" + formattedAmount
                + ", percentage=" + percentage + ", responsibility=" + responsibility
                + ", responsibilitySource=" + responsibilitySource + ", sourceToken=" + sourceToken
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeeDistribution.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeeDistribution.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency())
                .description(getDescription())
                .formattedAmount(getFormattedAmount())
                .percentage(getPercentage())
                .responsibility(getResponsibility())
                .responsibilitySource(getResponsibilitySource())
                .sourceToken(getSourceToken());
        return builder;
    }

    /**
     * Class to build instances of {@link FeeDistribution}.
     */
    public static class Builder {
        private Double amount = 1.02d;
        private Currencies currency = Currencies.USD;
        private List<ReceiptDescriptions> description;
        private String formattedAmount = "$0.05 USD";
        private Double percentage;
        private FeeResponsibilityParties responsibility;
        private FeeResponsibilitySources responsibilitySource;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";



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
         * Setter for description.
         * @param  description  List of ReceiptDescriptions value for description.
         * @return Builder
         */
        public Builder description(List<ReceiptDescriptions> description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for formattedAmount.
         * @param  formattedAmount  String value for formattedAmount.
         * @return Builder
         */
        public Builder formattedAmount(String formattedAmount) {
            this.formattedAmount = formattedAmount;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  Double value for percentage.
         * @return Builder
         */
        public Builder percentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Setter for responsibility.
         * @param  responsibility  FeeResponsibilityParties value for responsibility.
         * @return Builder
         */
        public Builder responsibility(FeeResponsibilityParties responsibility) {
            this.responsibility = responsibility;
            return this;
        }

        /**
         * Setter for responsibilitySource.
         * @param  responsibilitySource  FeeResponsibilitySources value for responsibilitySource.
         * @return Builder
         */
        public Builder responsibilitySource(FeeResponsibilitySources responsibilitySource) {
            this.responsibilitySource = responsibilitySource;
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
         * Builds a new {@link FeeDistribution} object using the set fields.
         * @return {@link FeeDistribution}
         */
        public FeeDistribution build() {
            return new FeeDistribution(amount, currency, description, formattedAmount, percentage,
                    responsibility, responsibilitySource, sourceToken);
        }
    }
}

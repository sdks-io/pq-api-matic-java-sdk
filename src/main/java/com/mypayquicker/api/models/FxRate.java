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
 * This is a model class for FxRate type.
 */
public class FxRate
        extends BaseModel {
    private Double destinationAmount;
    private Currencies destinationCurrency;
    private String destinationFormattedAmount;
    private Double rate;
    private Double sourceAmount;
    private Currencies sourceCurrency;
    private String sourceFormattedAmount;

    /**
     * Default constructor.
     */
    public FxRate() {
        destinationCurrency = Currencies.USD;
        destinationFormattedAmount = "$0.05 USD";
        sourceAmount = 1.02d;
        sourceCurrency = Currencies.USD;
        sourceFormattedAmount = "$0.05 USD";
    }

    /**
     * Initialization constructor.
     * @param  destinationAmount  Double value for destinationAmount.
     * @param  destinationCurrency  Currencies value for destinationCurrency.
     * @param  destinationFormattedAmount  String value for destinationFormattedAmount.
     * @param  rate  Double value for rate.
     * @param  sourceAmount  Double value for sourceAmount.
     * @param  sourceCurrency  Currencies value for sourceCurrency.
     * @param  sourceFormattedAmount  String value for sourceFormattedAmount.
     */
    public FxRate(
            Double destinationAmount,
            Currencies destinationCurrency,
            String destinationFormattedAmount,
            Double rate,
            Double sourceAmount,
            Currencies sourceCurrency,
            String sourceFormattedAmount) {
        this.destinationAmount = destinationAmount;
        this.destinationCurrency = destinationCurrency;
        this.destinationFormattedAmount = destinationFormattedAmount;
        this.rate = rate;
        this.sourceAmount = sourceAmount;
        this.sourceCurrency = sourceCurrency;
        this.sourceFormattedAmount = sourceFormattedAmount;
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
     * Getter for DestinationFormattedAmount.
     * Combination of the amount and currency type
     * @return Returns the String
     */
    @JsonGetter("destinationFormattedAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationFormattedAmount() {
        return destinationFormattedAmount;
    }

    /**
     * Setter for DestinationFormattedAmount.
     * Combination of the amount and currency type
     * @param destinationFormattedAmount Value for String
     */
    @JsonSetter("destinationFormattedAmount")
    public void setDestinationFormattedAmount(String destinationFormattedAmount) {
        this.destinationFormattedAmount = destinationFormattedAmount;
    }

    /**
     * Getter for Rate.
     * Exchange [rate](#/rest/models/structures/rate)
     * @return Returns the Double
     */
    @JsonGetter("rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getRate() {
        return rate;
    }

    /**
     * Setter for Rate.
     * Exchange [rate](#/rest/models/structures/rate)
     * @param rate Value for Double
     */
    @JsonSetter("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * Getter for SourceAmount.
     * Allocated money to be sent in the transaction.
     * @return Returns the Double
     */
    @JsonGetter("sourceAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getSourceAmount() {
        return sourceAmount;
    }

    /**
     * Setter for SourceAmount.
     * Allocated money to be sent in the transaction.
     * @param sourceAmount Value for Double
     */
    @JsonSetter("sourceAmount")
    public void setSourceAmount(Double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    /**
     * Getter for SourceCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("sourceCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getSourceCurrency() {
        return sourceCurrency;
    }

    /**
     * Setter for SourceCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param sourceCurrency Value for Currencies
     */
    @JsonSetter("sourceCurrency")
    public void setSourceCurrency(Currencies sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    /**
     * Getter for SourceFormattedAmount.
     * Combination of the amount and currency type
     * @return Returns the String
     */
    @JsonGetter("sourceFormattedAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceFormattedAmount() {
        return sourceFormattedAmount;
    }

    /**
     * Setter for SourceFormattedAmount.
     * Combination of the amount and currency type
     * @param sourceFormattedAmount Value for String
     */
    @JsonSetter("sourceFormattedAmount")
    public void setSourceFormattedAmount(String sourceFormattedAmount) {
        this.sourceFormattedAmount = sourceFormattedAmount;
    }

    /**
     * Converts this FxRate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FxRate [" + "destinationAmount=" + destinationAmount + ", destinationCurrency="
                + destinationCurrency + ", destinationFormattedAmount=" + destinationFormattedAmount
                + ", rate=" + rate + ", sourceAmount=" + sourceAmount + ", sourceCurrency="
                + sourceCurrency + ", sourceFormattedAmount=" + sourceFormattedAmount
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FxRate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FxRate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .destinationAmount(getDestinationAmount())
                .destinationCurrency(getDestinationCurrency())
                .destinationFormattedAmount(getDestinationFormattedAmount())
                .rate(getRate())
                .sourceAmount(getSourceAmount())
                .sourceCurrency(getSourceCurrency())
                .sourceFormattedAmount(getSourceFormattedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link FxRate}.
     */
    public static class Builder {
        private Double destinationAmount;
        private Currencies destinationCurrency = Currencies.USD;
        private String destinationFormattedAmount = "$0.05 USD";
        private Double rate;
        private Double sourceAmount = 1.02d;
        private Currencies sourceCurrency = Currencies.USD;
        private String sourceFormattedAmount = "$0.05 USD";



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
         * Setter for destinationFormattedAmount.
         * @param  destinationFormattedAmount  String value for destinationFormattedAmount.
         * @return Builder
         */
        public Builder destinationFormattedAmount(String destinationFormattedAmount) {
            this.destinationFormattedAmount = destinationFormattedAmount;
            return this;
        }

        /**
         * Setter for rate.
         * @param  rate  Double value for rate.
         * @return Builder
         */
        public Builder rate(Double rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Setter for sourceAmount.
         * @param  sourceAmount  Double value for sourceAmount.
         * @return Builder
         */
        public Builder sourceAmount(Double sourceAmount) {
            this.sourceAmount = sourceAmount;
            return this;
        }

        /**
         * Setter for sourceCurrency.
         * @param  sourceCurrency  Currencies value for sourceCurrency.
         * @return Builder
         */
        public Builder sourceCurrency(Currencies sourceCurrency) {
            this.sourceCurrency = sourceCurrency;
            return this;
        }

        /**
         * Setter for sourceFormattedAmount.
         * @param  sourceFormattedAmount  String value for sourceFormattedAmount.
         * @return Builder
         */
        public Builder sourceFormattedAmount(String sourceFormattedAmount) {
            this.sourceFormattedAmount = sourceFormattedAmount;
            return this;
        }

        /**
         * Builds a new {@link FxRate} object using the set fields.
         * @return {@link FxRate}
         */
        public FxRate build() {
            return new FxRate(destinationAmount, destinationCurrency, destinationFormattedAmount,
                    rate, sourceAmount, sourceCurrency, sourceFormattedAmount);
        }
    }
}

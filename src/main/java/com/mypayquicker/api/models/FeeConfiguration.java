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
 * This is a model class for FeeConfiguration type.
 */
public class FeeConfiguration
        extends BaseModel {
    private CategoryTypes category;
    private List<FeeDistribution> distribution;
    private FeeSources source;
    private Double totalAmount;
    private Double transactionAmount;
    private Fees type;
    private String valueAmount;
    private FeeValues valueType;

    /**
     * Default constructor.
     */
    public FeeConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  category  CategoryTypes value for category.
     * @param  distribution  List of FeeDistribution value for distribution.
     * @param  source  FeeSources value for source.
     * @param  totalAmount  Double value for totalAmount.
     * @param  transactionAmount  Double value for transactionAmount.
     * @param  type  Fees value for type.
     * @param  valueAmount  String value for valueAmount.
     * @param  valueType  FeeValues value for valueType.
     */
    public FeeConfiguration(
            CategoryTypes category,
            List<FeeDistribution> distribution,
            FeeSources source,
            Double totalAmount,
            Double transactionAmount,
            Fees type,
            String valueAmount,
            FeeValues valueType) {
        this.category = category;
        this.distribution = distribution;
        this.source = source;
        this.totalAmount = totalAmount;
        this.transactionAmount = transactionAmount;
        this.type = type;
        this.valueAmount = valueAmount;
        this.valueType = valueType;
    }

    /**
     * Getter for Category.
     * Category types
     * @return Returns the CategoryTypes
     */
    @JsonGetter("category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CategoryTypes getCategory() {
        return category;
    }

    /**
     * Setter for Category.
     * Category types
     * @param category Value for CategoryTypes
     */
    @JsonSetter("category")
    public void setCategory(CategoryTypes category) {
        this.category = category;
    }

    /**
     * Getter for Distribution.
     * @return Returns the List of FeeDistribution
     */
    @JsonGetter("distribution")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FeeDistribution> getDistribution() {
        return distribution;
    }

    /**
     * Setter for Distribution.
     * @param distribution Value for List of FeeDistribution
     */
    @JsonSetter("distribution")
    public void setDistribution(List<FeeDistribution> distribution) {
        this.distribution = distribution;
    }

    /**
     * Getter for Source.
     * Fee source types
     * @return Returns the FeeSources
     */
    @JsonGetter("source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeSources getSource() {
        return source;
    }

    /**
     * Setter for Source.
     * Fee source types
     * @param source Value for FeeSources
     */
    @JsonSetter("source")
    public void setSource(FeeSources source) {
        this.source = source;
    }

    /**
     * Getter for TotalAmount.
     * Total amount of money for all transactions
     * @return Returns the Double
     */
    @JsonGetter("totalAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * Total amount of money for all transactions
     * @param totalAmount Value for Double
     */
    @JsonSetter("totalAmount")
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for TransactionAmount.
     * Total amount of money for the transaction
     * @return Returns the Double
     */
    @JsonGetter("transactionAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter for TransactionAmount.
     * Total amount of money for the transaction
     * @param transactionAmount Value for Double
     */
    @JsonSetter("transactionAmount")
    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Getter for Type.
     * Fee types
     * @return Returns the Fees
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Fees getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Fee types
     * @param type Value for Fees
     */
    @JsonSetter("type")
    public void setType(Fees type) {
        this.type = type;
    }

    /**
     * Getter for ValueAmount.
     * Value of the target resource
     * @return Returns the String
     */
    @JsonGetter("valueAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValueAmount() {
        return valueAmount;
    }

    /**
     * Setter for ValueAmount.
     * Value of the target resource
     * @param valueAmount Value for String
     */
    @JsonSetter("valueAmount")
    public void setValueAmount(String valueAmount) {
        this.valueAmount = valueAmount;
    }

    /**
     * Getter for ValueType.
     * Fee value types
     * @return Returns the FeeValues
     */
    @JsonGetter("valueType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeValues getValueType() {
        return valueType;
    }

    /**
     * Setter for ValueType.
     * Fee value types
     * @param valueType Value for FeeValues
     */
    @JsonSetter("valueType")
    public void setValueType(FeeValues valueType) {
        this.valueType = valueType;
    }

    /**
     * Converts this FeeConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeeConfiguration [" + "category=" + category + ", distribution=" + distribution
                + ", source=" + source + ", totalAmount=" + totalAmount + ", transactionAmount="
                + transactionAmount + ", type=" + type + ", valueAmount=" + valueAmount
                + ", valueType=" + valueType + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link FeeConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeeConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .category(getCategory())
                .distribution(getDistribution())
                .source(getSource())
                .totalAmount(getTotalAmount())
                .transactionAmount(getTransactionAmount())
                .type(getType())
                .valueAmount(getValueAmount())
                .valueType(getValueType());
        return builder;
    }

    /**
     * Class to build instances of {@link FeeConfiguration}.
     */
    public static class Builder {
        private CategoryTypes category;
        private List<FeeDistribution> distribution;
        private FeeSources source;
        private Double totalAmount;
        private Double transactionAmount;
        private Fees type;
        private String valueAmount;
        private FeeValues valueType;



        /**
         * Setter for category.
         * @param  category  CategoryTypes value for category.
         * @return Builder
         */
        public Builder category(CategoryTypes category) {
            this.category = category;
            return this;
        }

        /**
         * Setter for distribution.
         * @param  distribution  List of FeeDistribution value for distribution.
         * @return Builder
         */
        public Builder distribution(List<FeeDistribution> distribution) {
            this.distribution = distribution;
            return this;
        }

        /**
         * Setter for source.
         * @param  source  FeeSources value for source.
         * @return Builder
         */
        public Builder source(FeeSources source) {
            this.source = source;
            return this;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  Double value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for transactionAmount.
         * @param  transactionAmount  Double value for transactionAmount.
         * @return Builder
         */
        public Builder transactionAmount(Double transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Fees value for type.
         * @return Builder
         */
        public Builder type(Fees type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for valueAmount.
         * @param  valueAmount  String value for valueAmount.
         * @return Builder
         */
        public Builder valueAmount(String valueAmount) {
            this.valueAmount = valueAmount;
            return this;
        }

        /**
         * Setter for valueType.
         * @param  valueType  FeeValues value for valueType.
         * @return Builder
         */
        public Builder valueType(FeeValues valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * Builds a new {@link FeeConfiguration} object using the set fields.
         * @return {@link FeeConfiguration}
         */
        public FeeConfiguration build() {
            return new FeeConfiguration(category, distribution, source, totalAmount,
                    transactionAmount, type, valueAmount, valueType);
        }
    }
}

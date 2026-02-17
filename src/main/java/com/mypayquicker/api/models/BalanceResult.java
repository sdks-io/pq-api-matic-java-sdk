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
 * This is a model class for BalanceResult type.
 */
public class BalanceResult
        extends BaseModel {
    private double amount;
    private Currencies currency;
    private String formattedAmount;
    private String token;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public BalanceResult() {
        amount = 0d;
        currency = Currencies.USD;
        formattedAmount = "$0.05 USD";
    }

    /**
     * Initialization constructor.
     * @param  amount  double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  formattedAmount  String value for formattedAmount.
     * @param  token  String value for token.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public BalanceResult(
            double amount,
            Currencies currency,
            String formattedAmount,
            String token,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.amount = amount;
        this.currency = currency;
        this.formattedAmount = formattedAmount;
        this.token = token;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for Amount.
     * Amount of money in the account
     * @return Returns the double
     */
    @JsonGetter("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount of money in the account
     * @param amount Value for double
     */
    @JsonSetter("amount")
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("currency")
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
     * Getter for FormattedAmount.
     * Combination of the amount and currency type
     * @return Returns the String
     */
    @JsonGetter("formattedAmount")
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
     * Getter for Token.
     * [Token](#/rest/models/structures/token) representing the resource
     * @return Returns the String
     */
    @JsonGetter("token")
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * [Token](#/rest/models/structures/token) representing the resource
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for Links.
     * @return Returns the List of HateoasSelfRef
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<HateoasSelfRef> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for List of HateoasSelfRef
     */
    @JsonSetter("links")
    public void setLinks(List<HateoasSelfRef> links) {
        this.links = links;
    }

    /**
     * Getter for Meta.
     * @return Returns the MetadataItems
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MetadataItems getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for MetadataItems
     */
    @JsonSetter("meta")
    public void setMeta(MetadataItems meta) {
        this.meta = meta;
    }

    /**
     * Converts this BalanceResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BalanceResult [" + "amount=" + amount + ", currency=" + currency
                + ", formattedAmount=" + formattedAmount + ", token=" + token + ", links=" + links
                + ", meta=" + meta + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BalanceResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BalanceResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, currency, formattedAmount, token)
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link BalanceResult}.
     */
    public static class Builder {
        private double amount = 0d;
        private Currencies currency = Currencies.USD;
        private String formattedAmount = "$0.05 USD";
        private String token;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  double value for amount.
         * @param  currency  Currencies value for currency.
         * @param  formattedAmount  String value for formattedAmount.
         * @param  token  String value for token.
         */
        public Builder(double amount, Currencies currency, String formattedAmount, String token) {
            this.amount = amount;
            this.currency = currency;
            this.formattedAmount = formattedAmount;
            this.token = token;
        }

        /**
         * Setter for amount.
         * @param  amount  double value for amount.
         * @return Builder
         */
        public Builder amount(double amount) {
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
         * Setter for formattedAmount.
         * @param  formattedAmount  String value for formattedAmount.
         * @return Builder
         */
        public Builder formattedAmount(String formattedAmount) {
            this.formattedAmount = formattedAmount;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of HateoasSelfRef value for links.
         * @return Builder
         */
        public Builder links(List<HateoasSelfRef> links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  MetadataItems value for meta.
         * @return Builder
         */
        public Builder meta(MetadataItems meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link BalanceResult} object using the set fields.
         * @return {@link BalanceResult}
         */
        public BalanceResult build() {
            return new BalanceResult(amount, currency, formattedAmount, token, links, meta);
        }
    }
}

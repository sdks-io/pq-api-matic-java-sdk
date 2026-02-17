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
 * This is a model class for BankAccountRequirement type.
 */
public class BankAccountRequirement
        extends BaseModel {
    private Countries bankCountry;
    private Currencies bankCurrency;
    private FeeConfiguration fee;
    private Countries sourceCountry;
    private Currencies sourceCurrency;
    private List<BankAccountRequiredFields> requirements;

    /**
     * Default constructor.
     */
    public BankAccountRequirement() {
        bankCurrency = Currencies.USD;
        sourceCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  bankCountry  Countries value for bankCountry.
     * @param  bankCurrency  Currencies value for bankCurrency.
     * @param  fee  FeeConfiguration value for fee.
     * @param  sourceCountry  Countries value for sourceCountry.
     * @param  sourceCurrency  Currencies value for sourceCurrency.
     * @param  requirements  List of BankAccountRequiredFields value for requirements.
     */
    public BankAccountRequirement(
            Countries bankCountry,
            Currencies bankCurrency,
            FeeConfiguration fee,
            Countries sourceCountry,
            Currencies sourceCurrency,
            List<BankAccountRequiredFields> requirements) {
        this.bankCountry = bankCountry;
        this.bankCurrency = bankCurrency;
        this.fee = fee;
        this.sourceCountry = sourceCountry;
        this.sourceCurrency = sourceCurrency;
        this.requirements = requirements;
    }

    /**
     * Getter for BankCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("bankCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getBankCountry() {
        return bankCountry;
    }

    /**
     * Setter for BankCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param bankCountry Value for Countries
     */
    @JsonSetter("bankCountry")
    public void setBankCountry(Countries bankCountry) {
        this.bankCountry = bankCountry;
    }

    /**
     * Getter for BankCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("bankCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getBankCurrency() {
        return bankCurrency;
    }

    /**
     * Setter for BankCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param bankCurrency Value for Currencies
     */
    @JsonSetter("bankCurrency")
    public void setBankCurrency(Currencies bankCurrency) {
        this.bankCurrency = bankCurrency;
    }

    /**
     * Getter for Fee.
     * @return Returns the FeeConfiguration
     */
    @JsonGetter("fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeConfiguration getFee() {
        return fee;
    }

    /**
     * Setter for Fee.
     * @param fee Value for FeeConfiguration
     */
    @JsonSetter("fee")
    public void setFee(FeeConfiguration fee) {
        this.fee = fee;
    }

    /**
     * Getter for SourceCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("sourceCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getSourceCountry() {
        return sourceCountry;
    }

    /**
     * Setter for SourceCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param sourceCountry Value for Countries
     */
    @JsonSetter("sourceCountry")
    public void setSourceCountry(Countries sourceCountry) {
        this.sourceCountry = sourceCountry;
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
     * Getter for Requirements.
     * @return Returns the List of BankAccountRequiredFields
     */
    @JsonGetter("requirements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BankAccountRequiredFields> getRequirements() {
        return requirements;
    }

    /**
     * Setter for Requirements.
     * @param requirements Value for List of BankAccountRequiredFields
     */
    @JsonSetter("requirements")
    public void setRequirements(List<BankAccountRequiredFields> requirements) {
        this.requirements = requirements;
    }

    /**
     * Converts this BankAccountRequirement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountRequirement [" + "bankCountry=" + bankCountry + ", bankCurrency="
                + bankCurrency + ", fee=" + fee + ", sourceCountry=" + sourceCountry
                + ", sourceCurrency=" + sourceCurrency + ", requirements=" + requirements
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BankAccountRequirement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountRequirement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankCountry(getBankCountry())
                .bankCurrency(getBankCurrency())
                .fee(getFee())
                .sourceCountry(getSourceCountry())
                .sourceCurrency(getSourceCurrency())
                .requirements(getRequirements());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountRequirement}.
     */
    public static class Builder {
        private Countries bankCountry;
        private Currencies bankCurrency = Currencies.USD;
        private FeeConfiguration fee;
        private Countries sourceCountry;
        private Currencies sourceCurrency = Currencies.USD;
        private List<BankAccountRequiredFields> requirements;



        /**
         * Setter for bankCountry.
         * @param  bankCountry  Countries value for bankCountry.
         * @return Builder
         */
        public Builder bankCountry(Countries bankCountry) {
            this.bankCountry = bankCountry;
            return this;
        }

        /**
         * Setter for bankCurrency.
         * @param  bankCurrency  Currencies value for bankCurrency.
         * @return Builder
         */
        public Builder bankCurrency(Currencies bankCurrency) {
            this.bankCurrency = bankCurrency;
            return this;
        }

        /**
         * Setter for fee.
         * @param  fee  FeeConfiguration value for fee.
         * @return Builder
         */
        public Builder fee(FeeConfiguration fee) {
            this.fee = fee;
            return this;
        }

        /**
         * Setter for sourceCountry.
         * @param  sourceCountry  Countries value for sourceCountry.
         * @return Builder
         */
        public Builder sourceCountry(Countries sourceCountry) {
            this.sourceCountry = sourceCountry;
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
         * Setter for requirements.
         * @param  requirements  List of BankAccountRequiredFields value for requirements.
         * @return Builder
         */
        public Builder requirements(List<BankAccountRequiredFields> requirements) {
            this.requirements = requirements;
            return this;
        }

        /**
         * Builds a new {@link BankAccountRequirement} object using the set fields.
         * @return {@link BankAccountRequirement}
         */
        public BankAccountRequirement build() {
            return new BankAccountRequirement(bankCountry, bankCurrency, fee, sourceCountry,
                    sourceCurrency, requirements);
        }
    }
}

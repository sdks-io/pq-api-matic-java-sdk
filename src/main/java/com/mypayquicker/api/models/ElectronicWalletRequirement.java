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
 * This is a model class for ElectronicWalletRequirement type.
 */
public class ElectronicWalletRequirement
        extends BaseModel {
    private ElectronicWalletTypes electronicWalletType;
    private Countries electronicWalletCountry;
    private Currencies electronicWalletCurrency;
    private FeeConfiguration fee;
    private Countries sourceCountry;
    private Currencies sourceCurrency;
    private List<ElectronicWalletRequiredFields> requirements;

    /**
     * Default constructor.
     */
    public ElectronicWalletRequirement() {
        electronicWalletCurrency = Currencies.USD;
        sourceCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  electronicWalletType  ElectronicWalletTypes value for electronicWalletType.
     * @param  electronicWalletCountry  Countries value for electronicWalletCountry.
     * @param  electronicWalletCurrency  Currencies value for electronicWalletCurrency.
     * @param  fee  FeeConfiguration value for fee.
     * @param  sourceCountry  Countries value for sourceCountry.
     * @param  sourceCurrency  Currencies value for sourceCurrency.
     * @param  requirements  List of ElectronicWalletRequiredFields value for requirements.
     */
    public ElectronicWalletRequirement(
            ElectronicWalletTypes electronicWalletType,
            Countries electronicWalletCountry,
            Currencies electronicWalletCurrency,
            FeeConfiguration fee,
            Countries sourceCountry,
            Currencies sourceCurrency,
            List<ElectronicWalletRequiredFields> requirements) {
        this.electronicWalletType = electronicWalletType;
        this.electronicWalletCountry = electronicWalletCountry;
        this.electronicWalletCurrency = electronicWalletCurrency;
        this.fee = fee;
        this.sourceCountry = sourceCountry;
        this.sourceCurrency = sourceCurrency;
        this.requirements = requirements;
    }

    /**
     * Getter for ElectronicWalletType.
     * Name of the electronic wallet
     * @return Returns the ElectronicWalletTypes
     */
    @JsonGetter("electronicWalletType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletTypes getElectronicWalletType() {
        return electronicWalletType;
    }

    /**
     * Setter for ElectronicWalletType.
     * Name of the electronic wallet
     * @param electronicWalletType Value for ElectronicWalletTypes
     */
    @JsonSetter("electronicWalletType")
    public void setElectronicWalletType(ElectronicWalletTypes electronicWalletType) {
        this.electronicWalletType = electronicWalletType;
    }

    /**
     * Getter for ElectronicWalletCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("electronicWalletCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getElectronicWalletCountry() {
        return electronicWalletCountry;
    }

    /**
     * Setter for ElectronicWalletCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param electronicWalletCountry Value for Countries
     */
    @JsonSetter("electronicWalletCountry")
    public void setElectronicWalletCountry(Countries electronicWalletCountry) {
        this.electronicWalletCountry = electronicWalletCountry;
    }

    /**
     * Getter for ElectronicWalletCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("electronicWalletCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getElectronicWalletCurrency() {
        return electronicWalletCurrency;
    }

    /**
     * Setter for ElectronicWalletCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param electronicWalletCurrency Value for Currencies
     */
    @JsonSetter("electronicWalletCurrency")
    public void setElectronicWalletCurrency(Currencies electronicWalletCurrency) {
        this.electronicWalletCurrency = electronicWalletCurrency;
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
     * @return Returns the List of ElectronicWalletRequiredFields
     */
    @JsonGetter("requirements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElectronicWalletRequiredFields> getRequirements() {
        return requirements;
    }

    /**
     * Setter for Requirements.
     * @param requirements Value for List of ElectronicWalletRequiredFields
     */
    @JsonSetter("requirements")
    public void setRequirements(List<ElectronicWalletRequiredFields> requirements) {
        this.requirements = requirements;
    }

    /**
     * Converts this ElectronicWalletRequirement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletRequirement [" + "electronicWalletType=" + electronicWalletType
                + ", electronicWalletCountry=" + electronicWalletCountry
                + ", electronicWalletCurrency=" + electronicWalletCurrency + ", fee=" + fee
                + ", sourceCountry=" + sourceCountry + ", sourceCurrency=" + sourceCurrency
                + ", requirements=" + requirements + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletRequirement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletRequirement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .electronicWalletType(getElectronicWalletType())
                .electronicWalletCountry(getElectronicWalletCountry())
                .electronicWalletCurrency(getElectronicWalletCurrency())
                .fee(getFee())
                .sourceCountry(getSourceCountry())
                .sourceCurrency(getSourceCurrency())
                .requirements(getRequirements());
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletRequirement}.
     */
    public static class Builder {
        private ElectronicWalletTypes electronicWalletType;
        private Countries electronicWalletCountry;
        private Currencies electronicWalletCurrency = Currencies.USD;
        private FeeConfiguration fee;
        private Countries sourceCountry;
        private Currencies sourceCurrency = Currencies.USD;
        private List<ElectronicWalletRequiredFields> requirements;



        /**
         * Setter for electronicWalletType.
         * @param  electronicWalletType  ElectronicWalletTypes value for electronicWalletType.
         * @return Builder
         */
        public Builder electronicWalletType(ElectronicWalletTypes electronicWalletType) {
            this.electronicWalletType = electronicWalletType;
            return this;
        }

        /**
         * Setter for electronicWalletCountry.
         * @param  electronicWalletCountry  Countries value for electronicWalletCountry.
         * @return Builder
         */
        public Builder electronicWalletCountry(Countries electronicWalletCountry) {
            this.electronicWalletCountry = electronicWalletCountry;
            return this;
        }

        /**
         * Setter for electronicWalletCurrency.
         * @param  electronicWalletCurrency  Currencies value for electronicWalletCurrency.
         * @return Builder
         */
        public Builder electronicWalletCurrency(Currencies electronicWalletCurrency) {
            this.electronicWalletCurrency = electronicWalletCurrency;
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
         * @param  requirements  List of ElectronicWalletRequiredFields value for requirements.
         * @return Builder
         */
        public Builder requirements(List<ElectronicWalletRequiredFields> requirements) {
            this.requirements = requirements;
            return this;
        }

        /**
         * Builds a new {@link ElectronicWalletRequirement} object using the set fields.
         * @return {@link ElectronicWalletRequirement}
         */
        public ElectronicWalletRequirement build() {
            return new ElectronicWalletRequirement(electronicWalletType, electronicWalletCountry,
                    electronicWalletCurrency, fee, sourceCountry, sourceCurrency, requirements);
        }
    }
}

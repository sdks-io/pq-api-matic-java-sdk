/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ElectronicWalletType type.
 */
public class ElectronicWalletType
        extends BaseModel {
    private ElectronicWalletTypes type;
    private Countries electronicWalletCountry;
    private Currencies electronicWalletCurrency;

    /**
     * Default constructor.
     */
    public ElectronicWalletType() {
        electronicWalletCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  type  ElectronicWalletTypes value for type.
     * @param  electronicWalletCountry  Countries value for electronicWalletCountry.
     * @param  electronicWalletCurrency  Currencies value for electronicWalletCurrency.
     */
    public ElectronicWalletType(
            ElectronicWalletTypes type,
            Countries electronicWalletCountry,
            Currencies electronicWalletCurrency) {
        this.type = type;
        this.electronicWalletCountry = electronicWalletCountry;
        this.electronicWalletCurrency = electronicWalletCurrency;
    }

    /**
     * Getter for Type.
     * Name of the electronic wallet
     * @return Returns the ElectronicWalletTypes
     */
    @JsonGetter("type")
    public ElectronicWalletTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Name of the electronic wallet
     * @param type Value for ElectronicWalletTypes
     */
    @JsonSetter("type")
    public void setType(ElectronicWalletTypes type) {
        this.type = type;
    }

    /**
     * Getter for ElectronicWalletCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("electronicWalletCountry")
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
     * Converts this ElectronicWalletType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletType [" + "type=" + type + ", electronicWalletCountry="
                + electronicWalletCountry + ", electronicWalletCurrency=" + electronicWalletCurrency
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, electronicWalletCountry, electronicWalletCurrency);
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletType}.
     */
    public static class Builder {
        private ElectronicWalletTypes type;
        private Countries electronicWalletCountry;
        private Currencies electronicWalletCurrency = Currencies.USD;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  ElectronicWalletTypes value for type.
         * @param  electronicWalletCountry  Countries value for electronicWalletCountry.
         * @param  electronicWalletCurrency  Currencies value for electronicWalletCurrency.
         */
        public Builder(ElectronicWalletTypes type, Countries electronicWalletCountry,
                Currencies electronicWalletCurrency) {
            this.type = type;
            this.electronicWalletCountry = electronicWalletCountry;
            this.electronicWalletCurrency = electronicWalletCurrency;
        }

        /**
         * Setter for type.
         * @param  type  ElectronicWalletTypes value for type.
         * @return Builder
         */
        public Builder type(ElectronicWalletTypes type) {
            this.type = type;
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
         * Builds a new {@link ElectronicWalletType} object using the set fields.
         * @return {@link ElectronicWalletType}
         */
        public ElectronicWalletType build() {
            return new ElectronicWalletType(type, electronicWalletCountry,
                    electronicWalletCurrency);
        }
    }
}

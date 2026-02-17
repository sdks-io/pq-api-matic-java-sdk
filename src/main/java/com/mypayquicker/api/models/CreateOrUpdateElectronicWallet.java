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
 * This is a model class for CreateOrUpdateElectronicWallet type.
 */
public class CreateOrUpdateElectronicWallet
        extends BaseModel {
    private ElectronicWalletTypes type;
    private Countries electronicWalletCountry;
    private Currencies electronicWalletCurrency;
    private List<ElectronicWalletField> fields;

    /**
     * Default constructor.
     */
    public CreateOrUpdateElectronicWallet() {
        electronicWalletCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  type  ElectronicWalletTypes value for type.
     * @param  electronicWalletCountry  Countries value for electronicWalletCountry.
     * @param  electronicWalletCurrency  Currencies value for electronicWalletCurrency.
     * @param  fields  List of ElectronicWalletField value for fields.
     */
    public CreateOrUpdateElectronicWallet(
            ElectronicWalletTypes type,
            Countries electronicWalletCountry,
            Currencies electronicWalletCurrency,
            List<ElectronicWalletField> fields) {
        this.type = type;
        this.electronicWalletCountry = electronicWalletCountry;
        this.electronicWalletCurrency = electronicWalletCurrency;
        this.fields = fields;
    }

    /**
     * Getter for Type.
     * Name of the electronic wallet
     * @return Returns the ElectronicWalletTypes
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Fields.
     * @return Returns the List of ElectronicWalletField
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElectronicWalletField> getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * @param fields Value for List of ElectronicWalletField
     */
    @JsonSetter("fields")
    public void setFields(List<ElectronicWalletField> fields) {
        this.fields = fields;
    }

    /**
     * Converts this CreateOrUpdateElectronicWallet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateElectronicWallet [" + "type=" + type + ", electronicWalletCountry="
                + electronicWalletCountry + ", electronicWalletCurrency=" + electronicWalletCurrency
                + ", fields=" + fields + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateElectronicWallet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateElectronicWallet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .electronicWalletCountry(getElectronicWalletCountry())
                .electronicWalletCurrency(getElectronicWalletCurrency())
                .fields(getFields());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateElectronicWallet}.
     */
    public static class Builder {
        private ElectronicWalletTypes type;
        private Countries electronicWalletCountry;
        private Currencies electronicWalletCurrency = Currencies.USD;
        private List<ElectronicWalletField> fields;



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
         * Setter for fields.
         * @param  fields  List of ElectronicWalletField value for fields.
         * @return Builder
         */
        public Builder fields(List<ElectronicWalletField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateElectronicWallet} object using the set fields.
         * @return {@link CreateOrUpdateElectronicWallet}
         */
        public CreateOrUpdateElectronicWallet build() {
            return new CreateOrUpdateElectronicWallet(type, electronicWalletCountry,
                    electronicWalletCurrency, fields);
        }
    }
}

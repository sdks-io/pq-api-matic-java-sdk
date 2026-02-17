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
 * This is a model class for ProgramResult type.
 */
public class ProgramResult
        extends BaseModel {
    private String token;
    private Currencies currency;
    private BankTypes bank;
    private List<ElectronicWalletType> electronicWallets;
    private ProgramTypes type;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public ProgramResult() {
        currency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  currency  Currencies value for currency.
     * @param  bank  BankTypes value for bank.
     * @param  type  ProgramTypes value for type.
     * @param  electronicWallets  List of ElectronicWalletType value for electronicWallets.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public ProgramResult(
            String token,
            Currencies currency,
            BankTypes bank,
            ProgramTypes type,
            List<ElectronicWalletType> electronicWallets,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.currency = currency;
        this.bank = bank;
        this.electronicWallets = electronicWallets;
        this.type = type;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for Token.
     * Auto-generated unique identifier representing a program, prefixed with prog-
     * @return Returns the String
     */
    @JsonGetter("token")
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Auto-generated unique identifier representing a program, prefixed with prog-
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
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
     * Getter for Bank.
     * Name of the bank
     * @return Returns the BankTypes
     */
    @JsonGetter("bank")
    public BankTypes getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Name of the bank
     * @param bank Value for BankTypes
     */
    @JsonSetter("bank")
    public void setBank(BankTypes bank) {
        this.bank = bank;
    }

    /**
     * Getter for ElectronicWallets.
     * @return Returns the List of ElectronicWalletType
     */
    @JsonGetter("electronicWallets")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElectronicWalletType> getElectronicWallets() {
        return electronicWallets;
    }

    /**
     * Setter for ElectronicWallets.
     * @param electronicWallets Value for List of ElectronicWalletType
     */
    @JsonSetter("electronicWallets")
    public void setElectronicWallets(List<ElectronicWalletType> electronicWallets) {
        this.electronicWallets = electronicWallets;
    }

    /**
     * Getter for Type.
     * Indicates the type of program associated with a prepaid card
     * @return Returns the ProgramTypes
     */
    @JsonGetter("type")
    public ProgramTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Indicates the type of program associated with a prepaid card
     * @param type Value for ProgramTypes
     */
    @JsonSetter("type")
    public void setType(ProgramTypes type) {
        this.type = type;
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
     * Converts this ProgramResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProgramResult [" + "token=" + token + ", currency=" + currency + ", bank=" + bank
                + ", type=" + type + ", electronicWallets=" + electronicWallets + ", links=" + links
                + ", meta=" + meta + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ProgramResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProgramResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(token, currency, bank, type)
                .electronicWallets(getElectronicWallets())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link ProgramResult}.
     */
    public static class Builder {
        private String token;
        private Currencies currency = Currencies.USD;
        private BankTypes bank;
        private ProgramTypes type;
        private List<ElectronicWalletType> electronicWallets;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  token  String value for token.
         * @param  currency  Currencies value for currency.
         * @param  bank  BankTypes value for bank.
         * @param  type  ProgramTypes value for type.
         */
        public Builder(String token, Currencies currency, BankTypes bank, ProgramTypes type) {
            this.token = token;
            this.currency = currency;
            this.bank = bank;
            this.type = type;
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
         * Setter for currency.
         * @param  currency  Currencies value for currency.
         * @return Builder
         */
        public Builder currency(Currencies currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for bank.
         * @param  bank  BankTypes value for bank.
         * @return Builder
         */
        public Builder bank(BankTypes bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  ProgramTypes value for type.
         * @return Builder
         */
        public Builder type(ProgramTypes type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for electronicWallets.
         * @param  electronicWallets  List of ElectronicWalletType value for electronicWallets.
         * @return Builder
         */
        public Builder electronicWallets(List<ElectronicWalletType> electronicWallets) {
            this.electronicWallets = electronicWallets;
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
         * Builds a new {@link ProgramResult} object using the set fields.
         * @return {@link ProgramResult}
         */
        public ProgramResult build() {
            return new ProgramResult(token, currency, bank, type, electronicWallets, links, meta);
        }
    }
}

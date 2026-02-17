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
 * This is a model class for ElectronicWalletObject type.
 */
public class ElectronicWalletObject
        extends BaseModel {
    private String token;
    private ElectronicWalletTypes type;
    private Countries electronicWalletCountry;
    private Currencies electronicWalletCurrency;
    private LocalDateTime createdOn;
    private List<ElectronicWalletField> fields;
    private ElectronicWalletStatuses status;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public ElectronicWalletObject() {
        token = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        electronicWalletCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  type  ElectronicWalletTypes value for type.
     * @param  electronicWalletCountry  Countries value for electronicWalletCountry.
     * @param  electronicWalletCurrency  Currencies value for electronicWalletCurrency.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  fields  List of ElectronicWalletField value for fields.
     * @param  status  ElectronicWalletStatuses value for status.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public ElectronicWalletObject(
            String token,
            ElectronicWalletTypes type,
            Countries electronicWalletCountry,
            Currencies electronicWalletCurrency,
            LocalDateTime createdOn,
            List<ElectronicWalletField> fields,
            ElectronicWalletStatuses status,
            List<HateoasSelfRef> links) {
        this.token = token;
        this.type = type;
        this.electronicWalletCountry = electronicWalletCountry;
        this.electronicWalletCurrency = electronicWalletCurrency;
        this.createdOn = createdOn;
        this.fields = fields;
        this.status = status;
        this.links = links;
    }

    /**
     * Getter for Token.
     * Unique identifier representing the [destination of
     * funds](#/rest/models/structures/destination-token)
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Unique identifier representing the [destination of
     * funds](#/rest/models/structures/destination-token)
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
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
     * Getter for Status.
     * Current verification status type of the electronic wallet
     * @return Returns the ElectronicWalletStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current verification status type of the electronic wallet
     * @param status Value for ElectronicWalletStatuses
     */
    @JsonSetter("status")
    public void setStatus(ElectronicWalletStatuses status) {
        this.status = status;
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
     * Converts this ElectronicWalletObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletObject [" + "token=" + token + ", type=" + type
                + ", electronicWalletCountry=" + electronicWalletCountry
                + ", electronicWalletCurrency=" + electronicWalletCurrency + ", createdOn="
                + createdOn + ", fields=" + fields + ", status=" + status + ", links=" + links
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .type(getType())
                .electronicWalletCountry(getElectronicWalletCountry())
                .electronicWalletCurrency(getElectronicWalletCurrency())
                .createdOn(getCreatedOn())
                .fields(getFields())
                .status(getStatus())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletObject}.
     */
    public static class Builder {
        private String token = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private ElectronicWalletTypes type;
        private Countries electronicWalletCountry;
        private Currencies electronicWalletCurrency = Currencies.USD;
        private LocalDateTime createdOn;
        private List<ElectronicWalletField> fields;
        private ElectronicWalletStatuses status;
        private List<HateoasSelfRef> links;



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
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
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
         * Setter for status.
         * @param  status  ElectronicWalletStatuses value for status.
         * @return Builder
         */
        public Builder status(ElectronicWalletStatuses status) {
            this.status = status;
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
         * Builds a new {@link ElectronicWalletObject} object using the set fields.
         * @return {@link ElectronicWalletObject}
         */
        public ElectronicWalletObject build() {
            return new ElectronicWalletObject(token, type, electronicWalletCountry,
                    electronicWalletCurrency, createdOn, fields, status, links);
        }
    }
}

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
 * This is a model class for BankAccountObject type.
 */
public class BankAccountObject
        extends BaseModel {
    private String token;
    private BankAccountOwnership bankAccountOwnershipType;
    private Countries bankCountry;
    private Currencies bankCurrency;
    private BankAccountAddress address;
    private LocalDateTime createdOn;
    private String description;
    private List<BankAccountField> fields;
    private BankAccountStatuses status;
    private BankAccountTypes type;
    private TransferMethodTypes transferMethodType;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public BankAccountObject() {
        token = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        bankCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  bankAccountOwnershipType  BankAccountOwnership value for bankAccountOwnershipType.
     * @param  bankCountry  Countries value for bankCountry.
     * @param  bankCurrency  Currencies value for bankCurrency.
     * @param  address  BankAccountAddress value for address.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  description  String value for description.
     * @param  fields  List of BankAccountField value for fields.
     * @param  status  BankAccountStatuses value for status.
     * @param  type  BankAccountTypes value for type.
     * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public BankAccountObject(
            String token,
            BankAccountOwnership bankAccountOwnershipType,
            Countries bankCountry,
            Currencies bankCurrency,
            BankAccountAddress address,
            LocalDateTime createdOn,
            String description,
            List<BankAccountField> fields,
            BankAccountStatuses status,
            BankAccountTypes type,
            TransferMethodTypes transferMethodType,
            List<HateoasSelfRef> links) {
        this.token = token;
        this.bankAccountOwnershipType = bankAccountOwnershipType;
        this.bankCountry = bankCountry;
        this.bankCurrency = bankCurrency;
        this.address = address;
        this.createdOn = createdOn;
        this.description = description;
        this.fields = fields;
        this.status = status;
        this.type = type;
        this.transferMethodType = transferMethodType;
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
     * Getter for BankAccountOwnershipType.
     * Account [ownership types](#/rest/models/structures/bank-account-ownership)
     * @return Returns the BankAccountOwnership
     */
    @JsonGetter("bankAccountOwnershipType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountOwnership getBankAccountOwnershipType() {
        return bankAccountOwnershipType;
    }

    /**
     * Setter for BankAccountOwnershipType.
     * Account [ownership types](#/rest/models/structures/bank-account-ownership)
     * @param bankAccountOwnershipType Value for BankAccountOwnership
     */
    @JsonSetter("bankAccountOwnershipType")
    public void setBankAccountOwnershipType(BankAccountOwnership bankAccountOwnershipType) {
        this.bankAccountOwnershipType = bankAccountOwnershipType;
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
     * Getter for Address.
     * @return Returns the BankAccountAddress
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountAddress getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for BankAccountAddress
     */
    @JsonSetter("address")
    public void setAddress(BankAccountAddress address) {
        this.address = address;
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
     * Getter for Description.
     * User-supplied description of the bank account for reference
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * User-supplied description of the bank account for reference
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Fields.
     * @return Returns the List of BankAccountField
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BankAccountField> getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * @param fields Value for List of BankAccountField
     */
    @JsonSetter("fields")
    public void setFields(List<BankAccountField> fields) {
        this.fields = fields;
    }

    /**
     * Getter for Status.
     * Current verification status type of the [bank
     * account](#/rest/models/structures/bank-account-status)
     * @return Returns the BankAccountStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current verification status type of the [bank
     * account](#/rest/models/structures/bank-account-status)
     * @param status Value for BankAccountStatuses
     */
    @JsonSetter("status")
    public void setStatus(BankAccountStatuses status) {
        this.status = status;
    }

    /**
     * Getter for Type.
     * Financial purpose of the [bank account](#/rest/models/structures/bank-account-type)
     * @return Returns the BankAccountTypes
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Financial purpose of the [bank account](#/rest/models/structures/bank-account-type)
     * @param type Value for BankAccountTypes
     */
    @JsonSetter("type")
    public void setType(BankAccountTypes type) {
        this.type = type;
    }

    /**
     * Getter for TransferMethodType.
     * Optional transfer methods applicable only to bank and e-wallet transfers.
     * @return Returns the TransferMethodTypes
     */
    @JsonGetter("transferMethodType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransferMethodTypes getTransferMethodType() {
        return transferMethodType;
    }

    /**
     * Setter for TransferMethodType.
     * Optional transfer methods applicable only to bank and e-wallet transfers.
     * @param transferMethodType Value for TransferMethodTypes
     */
    @JsonSetter("transferMethodType")
    public void setTransferMethodType(TransferMethodTypes transferMethodType) {
        this.transferMethodType = transferMethodType;
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
     * Converts this BankAccountObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountObject [" + "token=" + token + ", bankAccountOwnershipType="
                + bankAccountOwnershipType + ", bankCountry=" + bankCountry + ", bankCurrency="
                + bankCurrency + ", address=" + address + ", createdOn=" + createdOn
                + ", description=" + description + ", fields=" + fields + ", status=" + status
                + ", type=" + type + ", transferMethodType=" + transferMethodType + ", links="
                + links + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BankAccountObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .bankAccountOwnershipType(getBankAccountOwnershipType())
                .bankCountry(getBankCountry())
                .bankCurrency(getBankCurrency())
                .address(getAddress())
                .createdOn(getCreatedOn())
                .description(getDescription())
                .fields(getFields())
                .status(getStatus())
                .type(getType())
                .transferMethodType(getTransferMethodType())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountObject}.
     */
    public static class Builder {
        private String token = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private BankAccountOwnership bankAccountOwnershipType;
        private Countries bankCountry;
        private Currencies bankCurrency = Currencies.USD;
        private BankAccountAddress address;
        private LocalDateTime createdOn;
        private String description;
        private List<BankAccountField> fields;
        private BankAccountStatuses status;
        private BankAccountTypes type;
        private TransferMethodTypes transferMethodType;
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
         * Setter for bankAccountOwnershipType.
         * @param  bankAccountOwnershipType  BankAccountOwnership value for
         *         bankAccountOwnershipType.
         * @return Builder
         */
        public Builder bankAccountOwnershipType(BankAccountOwnership bankAccountOwnershipType) {
            this.bankAccountOwnershipType = bankAccountOwnershipType;
            return this;
        }

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
         * Setter for address.
         * @param  address  BankAccountAddress value for address.
         * @return Builder
         */
        public Builder address(BankAccountAddress address) {
            this.address = address;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for fields.
         * @param  fields  List of BankAccountField value for fields.
         * @return Builder
         */
        public Builder fields(List<BankAccountField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  BankAccountStatuses value for status.
         * @return Builder
         */
        public Builder status(BankAccountStatuses status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  BankAccountTypes value for type.
         * @return Builder
         */
        public Builder type(BankAccountTypes type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for transferMethodType.
         * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
         * @return Builder
         */
        public Builder transferMethodType(TransferMethodTypes transferMethodType) {
            this.transferMethodType = transferMethodType;
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
         * Builds a new {@link BankAccountObject} object using the set fields.
         * @return {@link BankAccountObject}
         */
        public BankAccountObject build() {
            return new BankAccountObject(token, bankAccountOwnershipType, bankCountry, bankCurrency,
                    address, createdOn, description, fields, status, type, transferMethodType,
                    links);
        }
    }
}

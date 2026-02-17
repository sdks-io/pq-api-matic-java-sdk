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
 * This is a model class for CreateOrUpdateBankAccount type.
 */
public class CreateOrUpdateBankAccount
        extends BaseModel {
    private BankAccountOwnership bankAccountOwnershipType;
    private Countries bankCountry;
    private Currencies bankCurrency;
    private String description;
    private List<BankAccountField> fields;
    private BankAccountTypes type;
    private TransferMethodTypes transferMethodType;
    private BankAccountAddress address;

    /**
     * Default constructor.
     */
    public CreateOrUpdateBankAccount() {
        bankCurrency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  bankAccountOwnershipType  BankAccountOwnership value for bankAccountOwnershipType.
     * @param  bankCountry  Countries value for bankCountry.
     * @param  bankCurrency  Currencies value for bankCurrency.
     * @param  description  String value for description.
     * @param  fields  List of BankAccountField value for fields.
     * @param  type  BankAccountTypes value for type.
     * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
     * @param  address  BankAccountAddress value for address.
     */
    public CreateOrUpdateBankAccount(
            BankAccountOwnership bankAccountOwnershipType,
            Countries bankCountry,
            Currencies bankCurrency,
            String description,
            List<BankAccountField> fields,
            BankAccountTypes type,
            TransferMethodTypes transferMethodType,
            BankAccountAddress address) {
        this.bankAccountOwnershipType = bankAccountOwnershipType;
        this.bankCountry = bankCountry;
        this.bankCurrency = bankCurrency;
        this.description = description;
        this.fields = fields;
        this.type = type;
        this.transferMethodType = transferMethodType;
        this.address = address;
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
     * Converts this CreateOrUpdateBankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateBankAccount [" + "bankAccountOwnershipType="
                + bankAccountOwnershipType + ", bankCountry=" + bankCountry + ", bankCurrency="
                + bankCurrency + ", description=" + description + ", fields=" + fields + ", type="
                + type + ", transferMethodType=" + transferMethodType + ", address=" + address
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateBankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateBankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankAccountOwnershipType(getBankAccountOwnershipType())
                .bankCountry(getBankCountry())
                .bankCurrency(getBankCurrency())
                .description(getDescription())
                .fields(getFields())
                .type(getType())
                .transferMethodType(getTransferMethodType())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateBankAccount}.
     */
    public static class Builder {
        private BankAccountOwnership bankAccountOwnershipType;
        private Countries bankCountry;
        private Currencies bankCurrency = Currencies.USD;
        private String description;
        private List<BankAccountField> fields;
        private BankAccountTypes type;
        private TransferMethodTypes transferMethodType;
        private BankAccountAddress address;



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
         * Setter for address.
         * @param  address  BankAccountAddress value for address.
         * @return Builder
         */
        public Builder address(BankAccountAddress address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateBankAccount} object using the set fields.
         * @return {@link CreateOrUpdateBankAccount}
         */
        public CreateOrUpdateBankAccount build() {
            return new CreateOrUpdateBankAccount(bankAccountOwnershipType, bankCountry,
                    bankCurrency, description, fields, type, transferMethodType, address);
        }
    }
}

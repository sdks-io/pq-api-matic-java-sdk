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
 * This is a model class for ElectronicWalletField type.
 */
public class ElectronicWalletField
        extends BaseModel {
    private ElectronicWalletFields key;
    private String value;

    /**
     * Default constructor.
     */
    public ElectronicWalletField() {
    }

    /**
     * Initialization constructor.
     * @param  key  ElectronicWalletFields value for key.
     * @param  value  String value for value.
     */
    public ElectronicWalletField(
            ElectronicWalletFields key,
            String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for Key.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @return Returns the ElectronicWalletFields
     */
    @JsonGetter("key")
    public ElectronicWalletFields getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @param key Value for ElectronicWalletFields
     */
    @JsonSetter("key")
    public void setKey(ElectronicWalletFields key) {
        this.key = key;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this ElectronicWalletField into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletField [" + "key=" + key + ", value=" + value
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletField.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletField.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, value);
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletField}.
     */
    public static class Builder {
        private ElectronicWalletFields key;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  ElectronicWalletFields value for key.
         * @param  value  String value for value.
         */
        public Builder(ElectronicWalletFields key, String value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Setter for key.
         * @param  key  ElectronicWalletFields value for key.
         * @return Builder
         */
        public Builder key(ElectronicWalletFields key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link ElectronicWalletField} object using the set fields.
         * @return {@link ElectronicWalletField}
         */
        public ElectronicWalletField build() {
            return new ElectronicWalletField(key, value);
        }
    }
}

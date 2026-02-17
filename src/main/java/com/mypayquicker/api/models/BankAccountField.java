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
 * This is a model class for BankAccountField type.
 */
public class BankAccountField
        extends BaseModel {
    private BankAccountFields key;
    private String value;

    /**
     * Default constructor.
     */
    public BankAccountField() {
    }

    /**
     * Initialization constructor.
     * @param  key  BankAccountFields value for key.
     * @param  value  String value for value.
     */
    public BankAccountField(
            BankAccountFields key,
            String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for Key.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @return Returns the BankAccountFields
     */
    @JsonGetter("key")
    public BankAccountFields getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @param key Value for BankAccountFields
     */
    @JsonSetter("key")
    public void setKey(BankAccountFields key) {
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
     * Converts this BankAccountField into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountField [" + "key=" + key + ", value=" + value + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BankAccountField.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountField.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, value);
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountField}.
     */
    public static class Builder {
        private BankAccountFields key;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  BankAccountFields value for key.
         * @param  value  String value for value.
         */
        public Builder(BankAccountFields key, String value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Setter for key.
         * @param  key  BankAccountFields value for key.
         * @return Builder
         */
        public Builder key(BankAccountFields key) {
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
         * Builds a new {@link BankAccountField} object using the set fields.
         * @return {@link BankAccountField}
         */
        public BankAccountField build() {
            return new BankAccountField(key, value);
        }
    }
}

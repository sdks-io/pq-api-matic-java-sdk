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
 * This is a model class for DocumentDetails type.
 */
public class DocumentDetails
        extends BaseModel {
    private UploadFields key;
    private String value;

    /**
     * Default constructor.
     */
    public DocumentDetails() {
    }

    /**
     * Initialization constructor.
     * @param  key  UploadFields value for key.
     * @param  value  String value for value.
     */
    public DocumentDetails(
            UploadFields key,
            String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for Key.
     * @return Returns the UploadFields
     */
    @JsonGetter("key")
    public UploadFields getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for UploadFields
     */
    @JsonSetter("key")
    public void setKey(UploadFields key) {
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
     * Converts this DocumentDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DocumentDetails [" + "key=" + key + ", value=" + value + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DocumentDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DocumentDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, value);
        return builder;
    }

    /**
     * Class to build instances of {@link DocumentDetails}.
     */
    public static class Builder {
        private UploadFields key;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  UploadFields value for key.
         * @param  value  String value for value.
         */
        public Builder(UploadFields key, String value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Setter for key.
         * @param  key  UploadFields value for key.
         * @return Builder
         */
        public Builder key(UploadFields key) {
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
         * Builds a new {@link DocumentDetails} object using the set fields.
         * @return {@link DocumentDetails}
         */
        public DocumentDetails build() {
            return new DocumentDetails(key, value);
        }
    }
}

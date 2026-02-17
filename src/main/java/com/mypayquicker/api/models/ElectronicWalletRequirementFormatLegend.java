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
 * This is a model class for ElectronicWalletRequirementFormatLegend type.
 */
public class ElectronicWalletRequirementFormatLegend
        extends BaseModel {
    private String key;
    private List<Translation> descriptions;

    /**
     * Default constructor.
     */
    public ElectronicWalletRequirementFormatLegend() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  descriptions  List of Translation value for descriptions.
     */
    public ElectronicWalletRequirementFormatLegend(
            String key,
            List<Translation> descriptions) {
        this.key = key;
        this.descriptions = descriptions;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Descriptions.
     * Localized requirement description for display purposes
     * @return Returns the List of Translation
     */
    @JsonGetter("descriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Translation> getDescriptions() {
        return descriptions;
    }

    /**
     * Setter for Descriptions.
     * Localized requirement description for display purposes
     * @param descriptions Value for List of Translation
     */
    @JsonSetter("descriptions")
    public void setDescriptions(List<Translation> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Converts this ElectronicWalletRequirementFormatLegend into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletRequirementFormatLegend [" + "key=" + key + ", descriptions="
                + descriptions + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletRequirementFormatLegend.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletRequirementFormatLegend.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .key(getKey())
                .descriptions(getDescriptions());
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletRequirementFormatLegend}.
     */
    public static class Builder {
        private String key;
        private List<Translation> descriptions;



        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for descriptions.
         * @param  descriptions  List of Translation value for descriptions.
         * @return Builder
         */
        public Builder descriptions(List<Translation> descriptions) {
            this.descriptions = descriptions;
            return this;
        }

        /**
         * Builds a new {@link ElectronicWalletRequirementFormatLegend} object using the set fields.
         * @return {@link ElectronicWalletRequirementFormatLegend}
         */
        public ElectronicWalletRequirementFormatLegend build() {
            return new ElectronicWalletRequirementFormatLegend(key, descriptions);
        }
    }
}

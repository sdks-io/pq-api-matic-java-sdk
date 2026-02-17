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

/**
 * This is a model class for ReceiptDescriptions type.
 */
public class ReceiptDescriptions
        extends BaseModel {
    private Languages language;
    private String translation;

    /**
     * Default constructor.
     */
    public ReceiptDescriptions() {
    }

    /**
     * Initialization constructor.
     * @param  language  Languages value for language.
     * @param  translation  String value for translation.
     */
    public ReceiptDescriptions(
            Languages language,
            String translation) {
        this.language = language;
        this.translation = translation;
    }

    /**
     * Getter for Language.
     * The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format
     * @return Returns the Languages
     */
    @JsonGetter("language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Languages getLanguage() {
        return language;
    }

    /**
     * Setter for Language.
     * The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format
     * @param language Value for Languages
     */
    @JsonSetter("language")
    public void setLanguage(Languages language) {
        this.language = language;
    }

    /**
     * Getter for Translation.
     * Description translated to the indicated language
     * @return Returns the String
     */
    @JsonGetter("translation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTranslation() {
        return translation;
    }

    /**
     * Setter for Translation.
     * Description translated to the indicated language
     * @param translation Value for String
     */
    @JsonSetter("translation")
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     * Converts this ReceiptDescriptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReceiptDescriptions [" + "language=" + language + ", translation=" + translation
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ReceiptDescriptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReceiptDescriptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .language(getLanguage())
                .translation(getTranslation());
        return builder;
    }

    /**
     * Class to build instances of {@link ReceiptDescriptions}.
     */
    public static class Builder {
        private Languages language;
        private String translation;



        /**
         * Setter for language.
         * @param  language  Languages value for language.
         * @return Builder
         */
        public Builder language(Languages language) {
            this.language = language;
            return this;
        }

        /**
         * Setter for translation.
         * @param  translation  String value for translation.
         * @return Builder
         */
        public Builder translation(String translation) {
            this.translation = translation;
            return this;
        }

        /**
         * Builds a new {@link ReceiptDescriptions} object using the set fields.
         * @return {@link ReceiptDescriptions}
         */
        public ReceiptDescriptions build() {
            return new ReceiptDescriptions(language, translation);
        }
    }
}

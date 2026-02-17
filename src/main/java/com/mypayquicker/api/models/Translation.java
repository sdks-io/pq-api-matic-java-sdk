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
 * This is a model class for Translation type.
 */
public class Translation
        extends BaseModel {
    private Languages language;
    private String translation;

    /**
     * Default constructor.
     */
    public Translation() {
    }

    /**
     * Initialization constructor.
     * @param  language  Languages value for language.
     * @param  translation  String value for translation.
     */
    public Translation(
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
     * Translated string in the specified language
     * @return Returns the String
     */
    @JsonGetter("translation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTranslation() {
        return translation;
    }

    /**
     * Setter for Translation.
     * Translated string in the specified language
     * @param translation Value for String
     */
    @JsonSetter("translation")
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     * Converts this Translation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Translation [" + "language=" + language + ", translation=" + translation
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Translation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Translation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .language(getLanguage())
                .translation(getTranslation());
        return builder;
    }

    /**
     * Class to build instances of {@link Translation}.
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
         * Builds a new {@link Translation} object using the set fields.
         * @return {@link Translation}
         */
        public Translation build() {
            return new Translation(language, translation);
        }
    }
}

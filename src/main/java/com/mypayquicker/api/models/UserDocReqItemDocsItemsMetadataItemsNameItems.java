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
 * This is a model class for UserDocReqItemDocsItemsMetadataItemsNameItems type.
 */
public class UserDocReqItemDocsItemsMetadataItemsNameItems
        extends BaseModel {
    private String language;
    private String translation;

    /**
     * Default constructor.
     */
    public UserDocReqItemDocsItemsMetadataItemsNameItems() {
    }

    /**
     * Initialization constructor.
     * @param  language  String value for language.
     * @param  translation  String value for translation.
     */
    public UserDocReqItemDocsItemsMetadataItemsNameItems(
            String language,
            String translation) {
        this.language = language;
        this.translation = translation;
    }

    /**
     * Getter for Language.
     * @return Returns the String
     */
    @JsonGetter("language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLanguage() {
        return language;
    }

    /**
     * Setter for Language.
     * @param language Value for String
     */
    @JsonSetter("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Getter for Translation.
     * @return Returns the String
     */
    @JsonGetter("translation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTranslation() {
        return translation;
    }

    /**
     * Setter for Translation.
     * @param translation Value for String
     */
    @JsonSetter("translation")
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     * Converts this UserDocReqItemDocsItemsMetadataItemsNameItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserDocReqItemDocsItemsMetadataItemsNameItems [" + "language=" + language
                + ", translation=" + translation + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UserDocReqItemDocsItemsMetadataItemsNameItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserDocReqItemDocsItemsMetadataItemsNameItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .language(getLanguage())
                .translation(getTranslation());
        return builder;
    }

    /**
     * Class to build instances of {@link UserDocReqItemDocsItemsMetadataItemsNameItems}.
     */
    public static class Builder {
        private String language;
        private String translation;



        /**
         * Setter for language.
         * @param  language  String value for language.
         * @return Builder
         */
        public Builder language(String language) {
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
         * Builds a new {@link UserDocReqItemDocsItemsMetadataItemsNameItems} object using the set
         * fields.
         * @return {@link UserDocReqItemDocsItemsMetadataItemsNameItems}
         */
        public UserDocReqItemDocsItemsMetadataItemsNameItems build() {
            return new UserDocReqItemDocsItemsMetadataItemsNameItems(language, translation);
        }
    }
}

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
 * This is a model class for UserDocumentRequirementItem type.
 */
public class UserDocumentRequirementItem
        extends BaseModel {
    private String countryOfBirth;
    private String countryOfNationality;
    private List<UserDocumentRequirementItemDocumentsItems> documents;

    /**
     * Default constructor.
     */
    public UserDocumentRequirementItem() {
    }

    /**
     * Initialization constructor.
     * @param  countryOfBirth  String value for countryOfBirth.
     * @param  countryOfNationality  String value for countryOfNationality.
     * @param  documents  List of UserDocumentRequirementItemDocumentsItems value for documents.
     */
    public UserDocumentRequirementItem(
            String countryOfBirth,
            String countryOfNationality,
            List<UserDocumentRequirementItemDocumentsItems> documents) {
        this.countryOfBirth = countryOfBirth;
        this.countryOfNationality = countryOfNationality;
        this.documents = documents;
    }

    /**
     * Getter for CountryOfBirth.
     * @return Returns the String
     */
    @JsonGetter("countryOfBirth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Setter for CountryOfBirth.
     * @param countryOfBirth Value for String
     */
    @JsonSetter("countryOfBirth")
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    /**
     * Getter for CountryOfNationality.
     * @return Returns the String
     */
    @JsonGetter("countryOfNationality")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryOfNationality() {
        return countryOfNationality;
    }

    /**
     * Setter for CountryOfNationality.
     * @param countryOfNationality Value for String
     */
    @JsonSetter("countryOfNationality")
    public void setCountryOfNationality(String countryOfNationality) {
        this.countryOfNationality = countryOfNationality;
    }

    /**
     * Getter for Documents.
     * @return Returns the List of UserDocumentRequirementItemDocumentsItems
     */
    @JsonGetter("documents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserDocumentRequirementItemDocumentsItems> getDocuments() {
        return documents;
    }

    /**
     * Setter for Documents.
     * @param documents Value for List of UserDocumentRequirementItemDocumentsItems
     */
    @JsonSetter("documents")
    public void setDocuments(List<UserDocumentRequirementItemDocumentsItems> documents) {
        this.documents = documents;
    }

    /**
     * Converts this UserDocumentRequirementItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserDocumentRequirementItem [" + "countryOfBirth=" + countryOfBirth
                + ", countryOfNationality=" + countryOfNationality + ", documents=" + documents
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UserDocumentRequirementItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserDocumentRequirementItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .countryOfBirth(getCountryOfBirth())
                .countryOfNationality(getCountryOfNationality())
                .documents(getDocuments());
        return builder;
    }

    /**
     * Class to build instances of {@link UserDocumentRequirementItem}.
     */
    public static class Builder {
        private String countryOfBirth;
        private String countryOfNationality;
        private List<UserDocumentRequirementItemDocumentsItems> documents;



        /**
         * Setter for countryOfBirth.
         * @param  countryOfBirth  String value for countryOfBirth.
         * @return Builder
         */
        public Builder countryOfBirth(String countryOfBirth) {
            this.countryOfBirth = countryOfBirth;
            return this;
        }

        /**
         * Setter for countryOfNationality.
         * @param  countryOfNationality  String value for countryOfNationality.
         * @return Builder
         */
        public Builder countryOfNationality(String countryOfNationality) {
            this.countryOfNationality = countryOfNationality;
            return this;
        }

        /**
         * Setter for documents.
         * @param  documents  List of UserDocumentRequirementItemDocumentsItems value for documents.
         * @return Builder
         */
        public Builder documents(List<UserDocumentRequirementItemDocumentsItems> documents) {
            this.documents = documents;
            return this;
        }

        /**
         * Builds a new {@link UserDocumentRequirementItem} object using the set fields.
         * @return {@link UserDocumentRequirementItem}
         */
        public UserDocumentRequirementItem build() {
            return new UserDocumentRequirementItem(countryOfBirth, countryOfNationality, documents);
        }
    }
}

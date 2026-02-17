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
 * This is a model class for CreateOrUpdateDocumentFields type.
 */
public class CreateOrUpdateDocumentFields
        extends BaseModel {
    private List<DocumentDetails> fields;

    /**
     * Default constructor.
     */
    public CreateOrUpdateDocumentFields() {
    }

    /**
     * Initialization constructor.
     * @param  fields  List of DocumentDetails value for fields.
     */
    public CreateOrUpdateDocumentFields(
            List<DocumentDetails> fields) {
        this.fields = fields;
    }

    /**
     * Getter for Fields.
     * @return Returns the List of DocumentDetails
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DocumentDetails> getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * @param fields Value for List of DocumentDetails
     */
    @JsonSetter("fields")
    public void setFields(List<DocumentDetails> fields) {
        this.fields = fields;
    }

    /**
     * Converts this CreateOrUpdateDocumentFields into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateDocumentFields [" + "fields=" + fields + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateDocumentFields.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateDocumentFields.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fields(getFields());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateDocumentFields}.
     */
    public static class Builder {
        private List<DocumentDetails> fields;



        /**
         * Setter for fields.
         * @param  fields  List of DocumentDetails value for fields.
         * @return Builder
         */
        public Builder fields(List<DocumentDetails> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateDocumentFields} object using the set fields.
         * @return {@link CreateOrUpdateDocumentFields}
         */
        public CreateOrUpdateDocumentFields build() {
            return new CreateOrUpdateDocumentFields(fields);
        }
    }
}

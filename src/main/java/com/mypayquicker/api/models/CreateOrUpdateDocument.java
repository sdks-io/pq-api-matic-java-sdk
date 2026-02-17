/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.mypayquicker.api.utilities.JsonValue;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateOrUpdateDocument type.
 */
public class CreateOrUpdateDocument
        extends BaseModel {
    private CreateOrUpdateDocumentFields fields;
    private JsonValue upload;

    /**
     * Default constructor.
     */
    public CreateOrUpdateDocument() {
    }

    /**
     * Initialization constructor.
     * @param  fields  CreateOrUpdateDocumentFields value for fields.
     * @param  upload  JsonValue value for upload.
     */
    public CreateOrUpdateDocument(
            CreateOrUpdateDocumentFields fields,
            JsonValue upload) {
        this.fields = fields;
        this.upload = upload;
    }

    /**
     * Getter for Fields.
     * @return Returns the CreateOrUpdateDocumentFields
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateOrUpdateDocumentFields getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * @param fields Value for CreateOrUpdateDocumentFields
     */
    @JsonSetter("fields")
    public void setFields(CreateOrUpdateDocumentFields fields) {
        this.fields = fields;
    }

    /**
     * Getter for Upload.
     * Document to be uploaded
     * @return Returns the JsonValue
     */
    @JsonGetter("upload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonValue getUpload() {
        return upload;
    }

    /**
     * Setter for Upload.
     * Document to be uploaded
     * @param upload Value for JsonValue
     */
    @JsonSetter("upload")
    public void setUpload(JsonValue upload) {
        this.upload = upload;
    }

    /**
     * Converts this CreateOrUpdateDocument into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateDocument [" + "fields=" + fields + ", upload=" + upload
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateDocument.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateDocument.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fields(getFields())
                .upload(getUpload());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateDocument}.
     */
    public static class Builder {
        private CreateOrUpdateDocumentFields fields;
        private JsonValue upload;



        /**
         * Setter for fields.
         * @param  fields  CreateOrUpdateDocumentFields value for fields.
         * @return Builder
         */
        public Builder fields(CreateOrUpdateDocumentFields fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Setter for upload.
         * @param  upload  JsonValue value for upload.
         * @return Builder
         */
        public Builder upload(JsonValue upload) {
            this.upload = upload;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateDocument} object using the set fields.
         * @return {@link CreateOrUpdateDocument}
         */
        public CreateOrUpdateDocument build() {
            return new CreateOrUpdateDocument(fields, upload);
        }
    }
}

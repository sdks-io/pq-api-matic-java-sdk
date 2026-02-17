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
 * This is a model class for UserDocReqItemDocsItemsSupplementalDocsItems type.
 */
public class UserDocReqItemDocsItemsSupplementalDocsItems
        extends BaseModel {
    private String exampleImage;
    private DocumentStatusTypes status;
    private DocumentTypes type;

    /**
     * Default constructor.
     */
    public UserDocReqItemDocsItemsSupplementalDocsItems() {
    }

    /**
     * Initialization constructor.
     * @param  exampleImage  String value for exampleImage.
     * @param  status  DocumentStatusTypes value for status.
     * @param  type  DocumentTypes value for type.
     */
    public UserDocReqItemDocsItemsSupplementalDocsItems(
            String exampleImage,
            DocumentStatusTypes status,
            DocumentTypes type) {
        this.exampleImage = exampleImage;
        this.status = status;
        this.type = type;
    }

    /**
     * Getter for ExampleImage.
     * Full path of the URI used for this object
     * @return Returns the String
     */
    @JsonGetter("exampleImage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExampleImage() {
        return exampleImage;
    }

    /**
     * Setter for ExampleImage.
     * Full path of the URI used for this object
     * @param exampleImage Value for String
     */
    @JsonSetter("exampleImage")
    public void setExampleImage(String exampleImage) {
        this.exampleImage = exampleImage;
    }

    /**
     * Getter for Status.
     * Status Type of a document
     * @return Returns the DocumentStatusTypes
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DocumentStatusTypes getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status Type of a document
     * @param status Value for DocumentStatusTypes
     */
    @JsonSetter("status")
    public void setStatus(DocumentStatusTypes status) {
        this.status = status;
    }

    /**
     * Getter for Type.
     * Indicates the enums for KYC.
     * @return Returns the DocumentTypes
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DocumentTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Indicates the enums for KYC.
     * @param type Value for DocumentTypes
     */
    @JsonSetter("type")
    public void setType(DocumentTypes type) {
        this.type = type;
    }

    /**
     * Converts this UserDocReqItemDocsItemsSupplementalDocsItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserDocReqItemDocsItemsSupplementalDocsItems [" + "exampleImage=" + exampleImage
                + ", status=" + status + ", type=" + type + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UserDocReqItemDocsItemsSupplementalDocsItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserDocReqItemDocsItemsSupplementalDocsItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .exampleImage(getExampleImage())
                .status(getStatus())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link UserDocReqItemDocsItemsSupplementalDocsItems}.
     */
    public static class Builder {
        private String exampleImage;
        private DocumentStatusTypes status;
        private DocumentTypes type;



        /**
         * Setter for exampleImage.
         * @param  exampleImage  String value for exampleImage.
         * @return Builder
         */
        public Builder exampleImage(String exampleImage) {
            this.exampleImage = exampleImage;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  DocumentStatusTypes value for status.
         * @return Builder
         */
        public Builder status(DocumentStatusTypes status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  DocumentTypes value for type.
         * @return Builder
         */
        public Builder type(DocumentTypes type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link UserDocReqItemDocsItemsSupplementalDocsItems} object using the set
         * fields.
         * @return {@link UserDocReqItemDocsItemsSupplementalDocsItems}
         */
        public UserDocReqItemDocsItemsSupplementalDocsItems build() {
            return new UserDocReqItemDocsItemsSupplementalDocsItems(exampleImage, status, type);
        }
    }
}

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
 * This is a model class for UserDocReqItemDocsItemsMetadataItems type.
 */
public class UserDocReqItemDocsItemsMetadataItems
        extends BaseModel {
    private String dataType;
    private String fieldType;
    private List<UserDocReqItemDocsItemsMetadataItemsNameItems> name;

    /**
     * Default constructor.
     */
    public UserDocReqItemDocsItemsMetadataItems() {
    }

    /**
     * Initialization constructor.
     * @param  dataType  String value for dataType.
     * @param  fieldType  String value for fieldType.
     * @param  name  List of UserDocReqItemDocsItemsMetadataItemsNameItems value for name.
     */
    public UserDocReqItemDocsItemsMetadataItems(
            String dataType,
            String fieldType,
            List<UserDocReqItemDocsItemsMetadataItemsNameItems> name) {
        this.dataType = dataType;
        this.fieldType = fieldType;
        this.name = name;
    }

    /**
     * Getter for DataType.
     * @return Returns the String
     */
    @JsonGetter("dataType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDataType() {
        return dataType;
    }

    /**
     * Setter for DataType.
     * @param dataType Value for String
     */
    @JsonSetter("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for FieldType.
     * @return Returns the String
     */
    @JsonGetter("fieldType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Setter for FieldType.
     * @param fieldType Value for String
     */
    @JsonSetter("fieldType")
    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * Getter for Name.
     * @return Returns the List of UserDocReqItemDocsItemsMetadataItemsNameItems
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserDocReqItemDocsItemsMetadataItemsNameItems> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of UserDocReqItemDocsItemsMetadataItemsNameItems
     */
    @JsonSetter("name")
    public void setName(List<UserDocReqItemDocsItemsMetadataItemsNameItems> name) {
        this.name = name;
    }

    /**
     * Converts this UserDocReqItemDocsItemsMetadataItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserDocReqItemDocsItemsMetadataItems [" + "dataType=" + dataType + ", fieldType="
                + fieldType + ", name=" + name + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UserDocReqItemDocsItemsMetadataItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserDocReqItemDocsItemsMetadataItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dataType(getDataType())
                .fieldType(getFieldType())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link UserDocReqItemDocsItemsMetadataItems}.
     */
    public static class Builder {
        private String dataType;
        private String fieldType;
        private List<UserDocReqItemDocsItemsMetadataItemsNameItems> name;



        /**
         * Setter for dataType.
         * @param  dataType  String value for dataType.
         * @return Builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Setter for fieldType.
         * @param  fieldType  String value for fieldType.
         * @return Builder
         */
        public Builder fieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  List of UserDocReqItemDocsItemsMetadataItemsNameItems value for name.
         * @return Builder
         */
        public Builder name(List<UserDocReqItemDocsItemsMetadataItemsNameItems> name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link UserDocReqItemDocsItemsMetadataItems} object using the set fields.
         * @return {@link UserDocReqItemDocsItemsMetadataItems}
         */
        public UserDocReqItemDocsItemsMetadataItems build() {
            return new UserDocReqItemDocsItemsMetadataItems(dataType, fieldType, name);
        }
    }
}

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
 * This is a model class for DocumentRequirementsListResult type.
 */
public class DocumentRequirementsListResult
        extends BaseModel {
    private List<UserDocumentRequirementItem> id;
    private ListMetadata meta;

    /**
     * Default constructor.
     */
    public DocumentRequirementsListResult() {
    }

    /**
     * Initialization constructor.
     * @param  id  List of UserDocumentRequirementItem value for id.
     * @param  meta  ListMetadata value for meta.
     */
    public DocumentRequirementsListResult(
            List<UserDocumentRequirementItem> id,
            ListMetadata meta) {
        this.id = id;
        this.meta = meta;
    }

    /**
     * Getter for Id.
     * @return Returns the List of UserDocumentRequirementItem
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserDocumentRequirementItem> getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for List of UserDocumentRequirementItem
     */
    @JsonSetter("id")
    public void setId(List<UserDocumentRequirementItem> id) {
        this.id = id;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListMetadata
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListMetadata getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListMetadata
     */
    @JsonSetter("meta")
    public void setMeta(ListMetadata meta) {
        this.meta = meta;
    }

    /**
     * Converts this DocumentRequirementsListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DocumentRequirementsListResult [" + "id=" + id + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DocumentRequirementsListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DocumentRequirementsListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link DocumentRequirementsListResult}.
     */
    public static class Builder {
        private List<UserDocumentRequirementItem> id;
        private ListMetadata meta;



        /**
         * Setter for id.
         * @param  id  List of UserDocumentRequirementItem value for id.
         * @return Builder
         */
        public Builder id(List<UserDocumentRequirementItem> id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  ListMetadata value for meta.
         * @return Builder
         */
        public Builder meta(ListMetadata meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link DocumentRequirementsListResult} object using the set fields.
         * @return {@link DocumentRequirementsListResult}
         */
        public DocumentRequirementsListResult build() {
            return new DocumentRequirementsListResult(id, meta);
        }
    }
}

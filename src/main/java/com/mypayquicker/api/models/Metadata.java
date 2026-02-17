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
 * This is a model class for Metadata type.
 */
public class Metadata
        extends BaseModel {
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public Metadata() {
    }

    /**
     * Initialization constructor.
     * @param  meta  MetadataItems value for meta.
     */
    public Metadata(
            MetadataItems meta) {
        this.meta = meta;
    }

    /**
     * Getter for Meta.
     * @return Returns the MetadataItems
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MetadataItems getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for MetadataItems
     */
    @JsonSetter("meta")
    public void setMeta(MetadataItems meta) {
        this.meta = meta;
    }

    /**
     * Converts this Metadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metadata [" + "meta=" + meta + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Metadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Metadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link Metadata}.
     */
    public static class Builder {
        private MetadataItems meta;



        /**
         * Setter for meta.
         * @param  meta  MetadataItems value for meta.
         * @return Builder
         */
        public Builder meta(MetadataItems meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link Metadata} object using the set fields.
         * @return {@link Metadata}
         */
        public Metadata build() {
            return new Metadata(meta);
        }
    }
}

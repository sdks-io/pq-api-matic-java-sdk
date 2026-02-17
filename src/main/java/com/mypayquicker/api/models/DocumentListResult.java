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
 * This is a model class for DocumentListResult type.
 */
public class DocumentListResult
        extends BaseModel {
    private List<DocumentObject> payload;
    private ListMetadata meta;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public DocumentListResult() {
    }

    /**
     * Initialization constructor.
     * @param  payload  List of DocumentObject value for payload.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  ListMetadata value for meta.
     */
    public DocumentListResult(
            List<DocumentObject> payload,
            List<HateoasSelfRef> links,
            ListMetadata meta) {
        this.payload = payload;
        this.meta = meta;
        this.links = links;
    }

    /**
     * Getter for Payload.
     * @return Returns the List of DocumentObject
     */
    @JsonGetter("payload")
    public List<DocumentObject> getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for List of DocumentObject
     */
    @JsonSetter("payload")
    public void setPayload(List<DocumentObject> payload) {
        this.payload = payload;
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
     * Getter for Links.
     * @return Returns the List of HateoasSelfRef
     */
    @JsonGetter("links")
    public List<HateoasSelfRef> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for List of HateoasSelfRef
     */
    @JsonSetter("links")
    public void setLinks(List<HateoasSelfRef> links) {
        this.links = links;
    }

    /**
     * Converts this DocumentListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DocumentListResult [" + "payload=" + payload + ", links=" + links + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DocumentListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DocumentListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payload, links)
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link DocumentListResult}.
     */
    public static class Builder {
        private List<DocumentObject> payload;
        private List<HateoasSelfRef> links;
        private ListMetadata meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payload  List of DocumentObject value for payload.
         * @param  links  List of HateoasSelfRef value for links.
         */
        public Builder(List<DocumentObject> payload, List<HateoasSelfRef> links) {
            this.payload = payload;
            this.links = links;
        }

        /**
         * Setter for payload.
         * @param  payload  List of DocumentObject value for payload.
         * @return Builder
         */
        public Builder payload(List<DocumentObject> payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of HateoasSelfRef value for links.
         * @return Builder
         */
        public Builder links(List<HateoasSelfRef> links) {
            this.links = links;
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
         * Builds a new {@link DocumentListResult} object using the set fields.
         * @return {@link DocumentListResult}
         */
        public DocumentListResult build() {
            return new DocumentListResult(payload, links, meta);
        }
    }
}

/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for BalanceListResult type.
 */
public class BalanceListResult
        extends BaseModel {
    private List<BalanceObject> payload;
    private ListMetadata meta;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public BalanceListResult() {
    }

    /**
     * Initialization constructor.
     * @param  payload  List of BalanceObject value for payload.
     * @param  meta  ListMetadata value for meta.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public BalanceListResult(
            List<BalanceObject> payload,
            ListMetadata meta,
            List<HateoasSelfRef> links) {
        this.payload = payload;
        this.meta = meta;
        this.links = links;
    }

    /**
     * Getter for Payload.
     * @return Returns the List of BalanceObject
     */
    @JsonGetter("payload")
    public List<BalanceObject> getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for List of BalanceObject
     */
    @JsonSetter("payload")
    public void setPayload(List<BalanceObject> payload) {
        this.payload = payload;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListMetadata
     */
    @JsonGetter("meta")
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
     * Converts this BalanceListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BalanceListResult [" + "payload=" + payload + ", meta=" + meta + ", links=" + links
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BalanceListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BalanceListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payload, meta, links);
        return builder;
    }

    /**
     * Class to build instances of {@link BalanceListResult}.
     */
    public static class Builder {
        private List<BalanceObject> payload;
        private ListMetadata meta;
        private List<HateoasSelfRef> links;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payload  List of BalanceObject value for payload.
         * @param  meta  ListMetadata value for meta.
         * @param  links  List of HateoasSelfRef value for links.
         */
        public Builder(List<BalanceObject> payload, ListMetadata meta, List<HateoasSelfRef> links) {
            this.payload = payload;
            this.meta = meta;
            this.links = links;
        }

        /**
         * Setter for payload.
         * @param  payload  List of BalanceObject value for payload.
         * @return Builder
         */
        public Builder payload(List<BalanceObject> payload) {
            this.payload = payload;
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
         * Setter for links.
         * @param  links  List of HateoasSelfRef value for links.
         * @return Builder
         */
        public Builder links(List<HateoasSelfRef> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link BalanceListResult} object using the set fields.
         * @return {@link BalanceListResult}
         */
        public BalanceListResult build() {
            return new BalanceListResult(payload, meta, links);
        }
    }
}

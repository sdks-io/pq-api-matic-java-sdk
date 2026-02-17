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
 * This is a model class for WebhookSubscriptionListResult type.
 */
public class WebhookSubscriptionListResult
        extends BaseModel {
    private List<WebhookSubscriptionObject> payload;
    private ListMetadata meta;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public WebhookSubscriptionListResult() {
    }

    /**
     * Initialization constructor.
     * @param  payload  List of WebhookSubscriptionObject value for payload.
     * @param  meta  ListMetadata value for meta.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public WebhookSubscriptionListResult(
            List<WebhookSubscriptionObject> payload,
            ListMetadata meta,
            List<HateoasSelfRef> links) {
        this.payload = payload;
        this.meta = meta;
        this.links = links;
    }

    /**
     * Getter for Payload.
     * @return Returns the List of WebhookSubscriptionObject
     */
    @JsonGetter("payload")
    public List<WebhookSubscriptionObject> getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for List of WebhookSubscriptionObject
     */
    @JsonSetter("payload")
    public void setPayload(List<WebhookSubscriptionObject> payload) {
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
     * Converts this WebhookSubscriptionListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookSubscriptionListResult [" + "payload=" + payload + ", meta=" + meta
                + ", links=" + links + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WebhookSubscriptionListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookSubscriptionListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payload, meta, links);
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookSubscriptionListResult}.
     */
    public static class Builder {
        private List<WebhookSubscriptionObject> payload;
        private ListMetadata meta;
        private List<HateoasSelfRef> links;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payload  List of WebhookSubscriptionObject value for payload.
         * @param  meta  ListMetadata value for meta.
         * @param  links  List of HateoasSelfRef value for links.
         */
        public Builder(List<WebhookSubscriptionObject> payload, ListMetadata meta,
                List<HateoasSelfRef> links) {
            this.payload = payload;
            this.meta = meta;
            this.links = links;
        }

        /**
         * Setter for payload.
         * @param  payload  List of WebhookSubscriptionObject value for payload.
         * @return Builder
         */
        public Builder payload(List<WebhookSubscriptionObject> payload) {
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
         * Builds a new {@link WebhookSubscriptionListResult} object using the set fields.
         * @return {@link WebhookSubscriptionListResult}
         */
        public WebhookSubscriptionListResult build() {
            return new WebhookSubscriptionListResult(payload, meta, links);
        }
    }
}

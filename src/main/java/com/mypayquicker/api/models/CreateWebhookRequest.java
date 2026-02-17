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
 * This is a model class for CreateWebhookRequest type.
 */
public class CreateWebhookRequest
        extends BaseModel {
    private WebhookNamespaces namespace;
    private String url;

    /**
     * Default constructor.
     */
    public CreateWebhookRequest() {
    }

    /**
     * Initialization constructor.
     * @param  namespace  WebhookNamespaces value for namespace.
     * @param  url  String value for url.
     */
    public CreateWebhookRequest(
            WebhookNamespaces namespace,
            String url) {
        this.namespace = namespace;
        this.url = url;
    }

    /**
     * Getter for Namespace.
     * Namespace used to identify and refer to the object
     * @return Returns the WebhookNamespaces
     */
    @JsonGetter("namespace")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WebhookNamespaces getNamespace() {
        return namespace;
    }

    /**
     * Setter for Namespace.
     * Namespace used to identify and refer to the object
     * @param namespace Value for WebhookNamespaces
     */
    @JsonSetter("namespace")
    public void setNamespace(WebhookNamespaces namespace) {
        this.namespace = namespace;
    }

    /**
     * Getter for Url.
     * Full path of the URI used for this object
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * Full path of the URI used for this object
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this CreateWebhookRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateWebhookRequest [" + "namespace=" + namespace + ", url=" + url
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateWebhookRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateWebhookRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .namespace(getNamespace())
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateWebhookRequest}.
     */
    public static class Builder {
        private WebhookNamespaces namespace;
        private String url;



        /**
         * Setter for namespace.
         * @param  namespace  WebhookNamespaces value for namespace.
         * @return Builder
         */
        public Builder namespace(WebhookNamespaces namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link CreateWebhookRequest} object using the set fields.
         * @return {@link CreateWebhookRequest}
         */
        public CreateWebhookRequest build() {
            return new CreateWebhookRequest(namespace, url);
        }
    }
}

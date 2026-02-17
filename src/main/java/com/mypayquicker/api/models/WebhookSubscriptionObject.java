/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mypayquicker.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for WebhookSubscriptionObject type.
 */
public class WebhookSubscriptionObject
        extends BaseModel {
    private String token;
    private LocalDateTime created;
    private LocalDateTime lastUpdated;
    private String url;
    private WebhookNamespaces namespace;
    private WebhookSubscriptionStatuses status;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public WebhookSubscriptionObject() {
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  created  LocalDateTime value for created.
     * @param  lastUpdated  LocalDateTime value for lastUpdated.
     * @param  url  String value for url.
     * @param  namespace  WebhookNamespaces value for namespace.
     * @param  status  WebhookSubscriptionStatuses value for status.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public WebhookSubscriptionObject(
            String token,
            LocalDateTime created,
            LocalDateTime lastUpdated,
            String url,
            WebhookNamespaces namespace,
            WebhookSubscriptionStatuses status,
            List<HateoasSelfRef> links) {
        this.token = token;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.url = url;
        this.namespace = namespace;
        this.status = status;
        this.links = links;
    }

    /**
     * Getter for Token.
     * [Token](#/rest/models/structures/token) representing the resource
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * [Token](#/rest/models/structures/token) representing the resource
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for Created.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param created Value for LocalDateTime
     */
    @JsonSetter("created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    /**
     * Getter for LastUpdated.
     * Date and time that the object was last updated
     * @return Returns the LocalDateTime
     */
    @JsonGetter("lastUpdated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Setter for LastUpdated.
     * Date and time that the object was last updated
     * @param lastUpdated Value for LocalDateTime
     */
    @JsonSetter("lastUpdated")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
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
     * Getter for Status.
     * @return Returns the WebhookSubscriptionStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WebhookSubscriptionStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for WebhookSubscriptionStatuses
     */
    @JsonSetter("status")
    public void setStatus(WebhookSubscriptionStatuses status) {
        this.status = status;
    }

    /**
     * Getter for Links.
     * @return Returns the List of HateoasSelfRef
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this WebhookSubscriptionObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookSubscriptionObject [" + "token=" + token + ", created=" + created
                + ", lastUpdated=" + lastUpdated + ", url=" + url + ", namespace=" + namespace
                + ", status=" + status + ", links=" + links + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WebhookSubscriptionObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookSubscriptionObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .created(getCreated())
                .lastUpdated(getLastUpdated())
                .url(getUrl())
                .namespace(getNamespace())
                .status(getStatus())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookSubscriptionObject}.
     */
    public static class Builder {
        private String token;
        private LocalDateTime created;
        private LocalDateTime lastUpdated;
        private String url;
        private WebhookNamespaces namespace;
        private WebhookSubscriptionStatuses status;
        private List<HateoasSelfRef> links;



        /**
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for created.
         * @param  created  LocalDateTime value for created.
         * @return Builder
         */
        public Builder created(LocalDateTime created) {
            this.created = created;
            return this;
        }

        /**
         * Setter for lastUpdated.
         * @param  lastUpdated  LocalDateTime value for lastUpdated.
         * @return Builder
         */
        public Builder lastUpdated(LocalDateTime lastUpdated) {
            this.lastUpdated = lastUpdated;
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
         * Setter for namespace.
         * @param  namespace  WebhookNamespaces value for namespace.
         * @return Builder
         */
        public Builder namespace(WebhookNamespaces namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  WebhookSubscriptionStatuses value for status.
         * @return Builder
         */
        public Builder status(WebhookSubscriptionStatuses status) {
            this.status = status;
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
         * Builds a new {@link WebhookSubscriptionObject} object using the set fields.
         * @return {@link WebhookSubscriptionObject}
         */
        public WebhookSubscriptionObject build() {
            return new WebhookSubscriptionObject(token, created, lastUpdated, url, namespace,
                    status, links);
        }
    }
}

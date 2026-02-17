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
 * This is a model class for AgreementResult type.
 */
public class AgreementResult
        extends BaseModel {
    private String token;
    private String contentBase64;
    private String url;
    private AgreementTypes type;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public AgreementResult() {
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  contentBase64  String value for contentBase64.
     * @param  url  String value for url.
     * @param  type  AgreementTypes value for type.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public AgreementResult(
            String token,
            String contentBase64,
            String url,
            AgreementTypes type,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.contentBase64 = contentBase64;
        this.url = url;
        this.type = type;
        this.links = links;
        this.meta = meta;
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
     * Getter for ContentBase64.
     * Program agreement content
     * @return Returns the String
     */
    @JsonGetter("contentBase64")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContentBase64() {
        return contentBase64;
    }

    /**
     * Setter for ContentBase64.
     * Program agreement content
     * @param contentBase64 Value for String
     */
    @JsonSetter("contentBase64")
    public void setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
    }

    /**
     * Getter for Url.
     * Full path of the URI to the content for the program agreement
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * Full path of the URI to the content for the program agreement
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Type.
     * @return Returns the AgreementTypes
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AgreementTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for AgreementTypes
     */
    @JsonSetter("type")
    public void setType(AgreementTypes type) {
        this.type = type;
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
     * Converts this AgreementResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AgreementResult [" + "token=" + token + ", contentBase64=" + contentBase64
                + ", url=" + url + ", type=" + type + ", links=" + links + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AgreementResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AgreementResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .contentBase64(getContentBase64())
                .url(getUrl())
                .type(getType())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link AgreementResult}.
     */
    public static class Builder {
        private String token;
        private String contentBase64;
        private String url;
        private AgreementTypes type;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;



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
         * Setter for contentBase64.
         * @param  contentBase64  String value for contentBase64.
         * @return Builder
         */
        public Builder contentBase64(String contentBase64) {
            this.contentBase64 = contentBase64;
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
         * Setter for type.
         * @param  type  AgreementTypes value for type.
         * @return Builder
         */
        public Builder type(AgreementTypes type) {
            this.type = type;
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
         * @param  meta  MetadataItems value for meta.
         * @return Builder
         */
        public Builder meta(MetadataItems meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link AgreementResult} object using the set fields.
         * @return {@link AgreementResult}
         */
        public AgreementResult build() {
            return new AgreementResult(token, contentBase64, url, type, links, meta);
        }
    }
}

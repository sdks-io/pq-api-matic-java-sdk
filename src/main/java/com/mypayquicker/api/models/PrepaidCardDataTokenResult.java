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
 * This is a model class for PrepaidCardDataTokenResult type.
 */
public class PrepaidCardDataTokenResult
        extends BaseModel {
    private CardProcessors cardProcessorType;
    private String resourceValue;
    private String token;
    private TokenPurposes tokenPurposeType;
    private String url;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public PrepaidCardDataTokenResult() {
    }

    /**
     * Initialization constructor.
     * @param  cardProcessorType  CardProcessors value for cardProcessorType.
     * @param  tokenPurposeType  TokenPurposes value for tokenPurposeType.
     * @param  resourceValue  String value for resourceValue.
     * @param  token  String value for token.
     * @param  url  String value for url.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public PrepaidCardDataTokenResult(
            CardProcessors cardProcessorType,
            TokenPurposes tokenPurposeType,
            String resourceValue,
            String token,
            String url,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.cardProcessorType = cardProcessorType;
        this.resourceValue = resourceValue;
        this.token = token;
        this.tokenPurposeType = tokenPurposeType;
        this.url = url;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for CardProcessorType.
     * The processor type for the prepaid card
     * @return Returns the CardProcessors
     */
    @JsonGetter("cardProcessorType")
    public CardProcessors getCardProcessorType() {
        return cardProcessorType;
    }

    /**
     * Setter for CardProcessorType.
     * The processor type for the prepaid card
     * @param cardProcessorType Value for CardProcessors
     */
    @JsonSetter("cardProcessorType")
    public void setCardProcessorType(CardProcessors cardProcessorType) {
        this.cardProcessorType = cardProcessorType;
    }

    /**
     * Getter for ResourceValue.
     * Value of the target resource
     * @return Returns the String
     */
    @JsonGetter("resourceValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getResourceValue() {
        return resourceValue;
    }

    /**
     * Setter for ResourceValue.
     * Value of the target resource
     * @param resourceValue Value for String
     */
    @JsonSetter("resourceValue")
    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
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
     * Getter for TokenPurposeType.
     * Purpose of the token
     * @return Returns the TokenPurposes
     */
    @JsonGetter("tokenPurposeType")
    public TokenPurposes getTokenPurposeType() {
        return tokenPurposeType;
    }

    /**
     * Setter for TokenPurposeType.
     * Purpose of the token
     * @param tokenPurposeType Value for TokenPurposes
     */
    @JsonSetter("tokenPurposeType")
    public void setTokenPurposeType(TokenPurposes tokenPurposeType) {
        this.tokenPurposeType = tokenPurposeType;
    }

    /**
     * Getter for Url.
     * Full path of the URI to perform the request action against a prepaid card that replaces the
     * need to build the URL with query params.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * Full path of the URI to perform the request action against a prepaid card that replaces the
     * need to build the URL with query params.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
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
     * Converts this PrepaidCardDataTokenResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidCardDataTokenResult [" + "cardProcessorType=" + cardProcessorType
                + ", tokenPurposeType=" + tokenPurposeType + ", resourceValue=" + resourceValue
                + ", token=" + token + ", url=" + url + ", links=" + links + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaidCardDataTokenResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidCardDataTokenResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cardProcessorType, tokenPurposeType)
                .resourceValue(getResourceValue())
                .token(getToken())
                .url(getUrl())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidCardDataTokenResult}.
     */
    public static class Builder {
        private CardProcessors cardProcessorType;
        private TokenPurposes tokenPurposeType;
        private String resourceValue;
        private String token;
        private String url;
        private List<HateoasSelfRef> links;
        private MetadataItems meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cardProcessorType  CardProcessors value for cardProcessorType.
         * @param  tokenPurposeType  TokenPurposes value for tokenPurposeType.
         */
        public Builder(CardProcessors cardProcessorType, TokenPurposes tokenPurposeType) {
            this.cardProcessorType = cardProcessorType;
            this.tokenPurposeType = tokenPurposeType;
        }

        /**
         * Setter for cardProcessorType.
         * @param  cardProcessorType  CardProcessors value for cardProcessorType.
         * @return Builder
         */
        public Builder cardProcessorType(CardProcessors cardProcessorType) {
            this.cardProcessorType = cardProcessorType;
            return this;
        }

        /**
         * Setter for tokenPurposeType.
         * @param  tokenPurposeType  TokenPurposes value for tokenPurposeType.
         * @return Builder
         */
        public Builder tokenPurposeType(TokenPurposes tokenPurposeType) {
            this.tokenPurposeType = tokenPurposeType;
            return this;
        }

        /**
         * Setter for resourceValue.
         * @param  resourceValue  String value for resourceValue.
         * @return Builder
         */
        public Builder resourceValue(String resourceValue) {
            this.resourceValue = resourceValue;
            return this;
        }

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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Builds a new {@link PrepaidCardDataTokenResult} object using the set fields.
         * @return {@link PrepaidCardDataTokenResult}
         */
        public PrepaidCardDataTokenResult build() {
            return new PrepaidCardDataTokenResult(cardProcessorType, tokenPurposeType,
                    resourceValue, token, url, links, meta);
        }
    }
}

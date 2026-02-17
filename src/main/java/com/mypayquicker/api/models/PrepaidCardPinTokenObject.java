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
 * This is a model class for PrepaidCardPinTokenObject type.
 */
public class PrepaidCardPinTokenObject
        extends BaseModel {
    private CardProcessors cardProcessorType;
    private String cardPinToken;
    private String token;
    private String url;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public PrepaidCardPinTokenObject() {
    }

    /**
     * Initialization constructor.
     * @param  cardProcessorType  CardProcessors value for cardProcessorType.
     * @param  cardPinToken  String value for cardPinToken.
     * @param  token  String value for token.
     * @param  url  String value for url.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public PrepaidCardPinTokenObject(
            CardProcessors cardProcessorType,
            String cardPinToken,
            String token,
            String url,
            List<HateoasSelfRef> links) {
        this.cardProcessorType = cardProcessorType;
        this.cardPinToken = cardPinToken;
        this.token = token;
        this.url = url;
        this.links = links;
    }

    /**
     * Getter for CardProcessorType.
     * The processor type for the prepaid card
     * @return Returns the CardProcessors
     */
    @JsonGetter("cardProcessorType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for CardPinToken.
     * [Token](#/rest/models/structures/prepaid-card-pin-token) used as part of a two-leg card PIN
     * reveal request sent directly from the client that generally involves a second piece of data,
     * such as the CVV code on the back of the card.
     * @return Returns the String
     */
    @JsonGetter("cardPinToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardPinToken() {
        return cardPinToken;
    }

    /**
     * Setter for CardPinToken.
     * [Token](#/rest/models/structures/prepaid-card-pin-token) used as part of a two-leg card PIN
     * reveal request sent directly from the client that generally involves a second piece of data,
     * such as the CVV code on the back of the card.
     * @param cardPinToken Value for String
     */
    @JsonSetter("cardPinToken")
    public void setCardPinToken(String cardPinToken) {
        this.cardPinToken = cardPinToken;
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
     * Converts this PrepaidCardPinTokenObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidCardPinTokenObject [" + "cardProcessorType=" + cardProcessorType
                + ", cardPinToken=" + cardPinToken + ", token=" + token + ", url=" + url
                + ", links=" + links + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaidCardPinTokenObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidCardPinTokenObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardProcessorType(getCardProcessorType())
                .cardPinToken(getCardPinToken())
                .token(getToken())
                .url(getUrl())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidCardPinTokenObject}.
     */
    public static class Builder {
        private CardProcessors cardProcessorType;
        private String cardPinToken;
        private String token;
        private String url;
        private List<HateoasSelfRef> links;



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
         * Setter for cardPinToken.
         * @param  cardPinToken  String value for cardPinToken.
         * @return Builder
         */
        public Builder cardPinToken(String cardPinToken) {
            this.cardPinToken = cardPinToken;
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
         * Builds a new {@link PrepaidCardPinTokenObject} object using the set fields.
         * @return {@link PrepaidCardPinTokenObject}
         */
        public PrepaidCardPinTokenObject build() {
            return new PrepaidCardPinTokenObject(cardProcessorType, cardPinToken, token, url,
                    links);
        }
    }
}

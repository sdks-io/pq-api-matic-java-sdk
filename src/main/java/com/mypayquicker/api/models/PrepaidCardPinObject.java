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
 * This is a model class for PrepaidCardPinObject type.
 */
public class PrepaidCardPinObject
        extends BaseModel {
    private String cardPin;
    private String token;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public PrepaidCardPinObject() {
    }

    /**
     * Initialization constructor.
     * @param  cardPin  String value for cardPin.
     * @param  token  String value for token.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public PrepaidCardPinObject(
            String cardPin,
            String token,
            List<HateoasSelfRef> links) {
        this.cardPin = cardPin;
        this.token = token;
        this.links = links;
    }

    /**
     * Getter for CardPin.
     * [Card PIN](#/rest/models/structures/prepaid-card-pin) for ATM and Debit usage
     * @return Returns the String
     */
    @JsonGetter("cardPin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardPin() {
        return cardPin;
    }

    /**
     * Setter for CardPin.
     * [Card PIN](#/rest/models/structures/prepaid-card-pin) for ATM and Debit usage
     * @param cardPin Value for String
     */
    @JsonSetter("cardPin")
    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    /**
     * Getter for Token.
     * [Token](#/rest/models/structures/prepaid-card-pin-token) used as part of a two-leg card PIN
     * reveal request sent directly from the client that generally involves a second piece of data,
     * such as the CVV code on the back of the card.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * [Token](#/rest/models/structures/prepaid-card-pin-token) used as part of a two-leg card PIN
     * reveal request sent directly from the client that generally involves a second piece of data,
     * such as the CVV code on the back of the card.
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
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
     * Converts this PrepaidCardPinObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidCardPinObject [" + "cardPin=" + cardPin + ", token=" + token + ", links="
                + links + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaidCardPinObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidCardPinObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardPin(getCardPin())
                .token(getToken())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidCardPinObject}.
     */
    public static class Builder {
        private String cardPin;
        private String token;
        private List<HateoasSelfRef> links;



        /**
         * Setter for cardPin.
         * @param  cardPin  String value for cardPin.
         * @return Builder
         */
        public Builder cardPin(String cardPin) {
            this.cardPin = cardPin;
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
         * Setter for links.
         * @param  links  List of HateoasSelfRef value for links.
         * @return Builder
         */
        public Builder links(List<HateoasSelfRef> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link PrepaidCardPinObject} object using the set fields.
         * @return {@link PrepaidCardPinObject}
         */
        public PrepaidCardPinObject build() {
            return new PrepaidCardPinObject(cardPin, token, links);
        }
    }
}

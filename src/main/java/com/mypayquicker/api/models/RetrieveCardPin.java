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
 * This is a model class for RetrieveCardPin type.
 */
public class RetrieveCardPin
        extends BaseModel {
    private String cardPinToken;

    /**
     * Default constructor.
     */
    public RetrieveCardPin() {
    }

    /**
     * Initialization constructor.
     * @param  cardPinToken  String value for cardPinToken.
     */
    public RetrieveCardPin(
            String cardPinToken) {
        this.cardPinToken = cardPinToken;
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
     * Converts this RetrieveCardPin into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrieveCardPin [" + "cardPinToken=" + cardPinToken + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RetrieveCardPin.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveCardPin.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardPinToken(getCardPinToken());
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveCardPin}.
     */
    public static class Builder {
        private String cardPinToken;



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
         * Builds a new {@link RetrieveCardPin} object using the set fields.
         * @return {@link RetrieveCardPin}
         */
        public RetrieveCardPin build() {
            return new RetrieveCardPin(cardPinToken);
        }
    }
}

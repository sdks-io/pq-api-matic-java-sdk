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
 * This is a model class for UpdateCardPin type.
 */
public class UpdateCardPin
        extends BaseModel {
    private String cardPinToken;
    private String cardPin;

    /**
     * Default constructor.
     */
    public UpdateCardPin() {
    }

    /**
     * Initialization constructor.
     * @param  cardPinToken  String value for cardPinToken.
     * @param  cardPin  String value for cardPin.
     */
    public UpdateCardPin(
            String cardPinToken,
            String cardPin) {
        this.cardPinToken = cardPinToken;
        this.cardPin = cardPin;
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
     * Converts this UpdateCardPin into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCardPin [" + "cardPinToken=" + cardPinToken + ", cardPin=" + cardPin
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateCardPin.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCardPin.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardPinToken(getCardPinToken())
                .cardPin(getCardPin());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCardPin}.
     */
    public static class Builder {
        private String cardPinToken;
        private String cardPin;



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
         * Setter for cardPin.
         * @param  cardPin  String value for cardPin.
         * @return Builder
         */
        public Builder cardPin(String cardPin) {
            this.cardPin = cardPin;
            return this;
        }

        /**
         * Builds a new {@link UpdateCardPin} object using the set fields.
         * @return {@link UpdateCardPin}
         */
        public UpdateCardPin build() {
            return new UpdateCardPin(cardPinToken, cardPin);
        }
    }
}

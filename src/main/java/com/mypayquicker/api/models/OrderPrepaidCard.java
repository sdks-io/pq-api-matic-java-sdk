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
 * This is a model class for OrderPrepaidCard type.
 */
public class OrderPrepaidCard
        extends BaseModel {
    private String cardPackage;
    private String programToken;
    private String cardReferenceNumber;

    /**
     * Default constructor.
     */
    public OrderPrepaidCard() {
    }

    /**
     * Initialization constructor.
     * @param  cardPackage  String value for cardPackage.
     * @param  programToken  String value for programToken.
     * @param  cardReferenceNumber  String value for cardReferenceNumber.
     */
    public OrderPrepaidCard(
            String cardPackage,
            String programToken,
            String cardReferenceNumber) {
        this.cardPackage = cardPackage;
        this.programToken = programToken;
        this.cardReferenceNumber = cardReferenceNumber;
    }

    /**
     * Getter for CardPackage.
     * [Package](#/rest/models/structures/prepaid-card-package) for the card being displayed,
     * including artwork, packaging, and delivery method
     * @return Returns the String
     */
    @JsonGetter("cardPackage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardPackage() {
        return cardPackage;
    }

    /**
     * Setter for CardPackage.
     * [Package](#/rest/models/structures/prepaid-card-package) for the card being displayed,
     * including artwork, packaging, and delivery method
     * @param cardPackage Value for String
     */
    @JsonSetter("cardPackage")
    public void setCardPackage(String cardPackage) {
        this.cardPackage = cardPackage;
    }

    /**
     * Getter for ProgramToken.
     * Auto-generated unique identifier representing a program, prefixed with prog-
     * @return Returns the String
     */
    @JsonGetter("programToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProgramToken() {
        return programToken;
    }

    /**
     * Setter for ProgramToken.
     * Auto-generated unique identifier representing a program, prefixed with prog-
     * @param programToken Value for String
     */
    @JsonSetter("programToken")
    public void setProgramToken(String programToken) {
        this.programToken = programToken;
    }

    /**
     * Getter for CardReferenceNumber.
     * Number that is printed on the back of a plastic card.
     * @return Returns the String
     */
    @JsonGetter("cardReferenceNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardReferenceNumber() {
        return cardReferenceNumber;
    }

    /**
     * Setter for CardReferenceNumber.
     * Number that is printed on the back of a plastic card.
     * @param cardReferenceNumber Value for String
     */
    @JsonSetter("cardReferenceNumber")
    public void setCardReferenceNumber(String cardReferenceNumber) {
        this.cardReferenceNumber = cardReferenceNumber;
    }

    /**
     * Converts this OrderPrepaidCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderPrepaidCard [" + "cardPackage=" + cardPackage + ", programToken="
                + programToken + ", cardReferenceNumber=" + cardReferenceNumber
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrderPrepaidCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderPrepaidCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardPackage(getCardPackage())
                .programToken(getProgramToken())
                .cardReferenceNumber(getCardReferenceNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderPrepaidCard}.
     */
    public static class Builder {
        private String cardPackage;
        private String programToken;
        private String cardReferenceNumber;



        /**
         * Setter for cardPackage.
         * @param  cardPackage  String value for cardPackage.
         * @return Builder
         */
        public Builder cardPackage(String cardPackage) {
            this.cardPackage = cardPackage;
            return this;
        }

        /**
         * Setter for programToken.
         * @param  programToken  String value for programToken.
         * @return Builder
         */
        public Builder programToken(String programToken) {
            this.programToken = programToken;
            return this;
        }

        /**
         * Setter for cardReferenceNumber.
         * @param  cardReferenceNumber  String value for cardReferenceNumber.
         * @return Builder
         */
        public Builder cardReferenceNumber(String cardReferenceNumber) {
            this.cardReferenceNumber = cardReferenceNumber;
            return this;
        }

        /**
         * Builds a new {@link OrderPrepaidCard} object using the set fields.
         * @return {@link OrderPrepaidCard}
         */
        public OrderPrepaidCard build() {
            return new OrderPrepaidCard(cardPackage, programToken, cardReferenceNumber);
        }
    }
}

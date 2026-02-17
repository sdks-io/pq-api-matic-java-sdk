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
 * This is a model class for ReplacePrepaidCard type.
 */
public class ReplacePrepaidCard
        extends BaseModel {
    private String cardPackage;
    private PrepaidCardReplacementReasons cardReplacementReason;

    /**
     * Default constructor.
     */
    public ReplacePrepaidCard() {
    }

    /**
     * Initialization constructor.
     * @param  cardPackage  String value for cardPackage.
     * @param  cardReplacementReason  PrepaidCardReplacementReasons value for cardReplacementReason.
     */
    public ReplacePrepaidCard(
            String cardPackage,
            PrepaidCardReplacementReasons cardReplacementReason) {
        this.cardPackage = cardPackage;
        this.cardReplacementReason = cardReplacementReason;
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
     * Getter for CardReplacementReason.
     * Reason for [prepaid card](page:resources/prepaid-cards) replacement.
     * @return Returns the PrepaidCardReplacementReasons
     */
    @JsonGetter("cardReplacementReason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidCardReplacementReasons getCardReplacementReason() {
        return cardReplacementReason;
    }

    /**
     * Setter for CardReplacementReason.
     * Reason for [prepaid card](page:resources/prepaid-cards) replacement.
     * @param cardReplacementReason Value for PrepaidCardReplacementReasons
     */
    @JsonSetter("cardReplacementReason")
    public void setCardReplacementReason(PrepaidCardReplacementReasons cardReplacementReason) {
        this.cardReplacementReason = cardReplacementReason;
    }

    /**
     * Converts this ReplacePrepaidCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReplacePrepaidCard [" + "cardPackage=" + cardPackage + ", cardReplacementReason="
                + cardReplacementReason + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ReplacePrepaidCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReplacePrepaidCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardPackage(getCardPackage())
                .cardReplacementReason(getCardReplacementReason());
        return builder;
    }

    /**
     * Class to build instances of {@link ReplacePrepaidCard}.
     */
    public static class Builder {
        private String cardPackage;
        private PrepaidCardReplacementReasons cardReplacementReason;



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
         * Setter for cardReplacementReason.
         * @param  cardReplacementReason  PrepaidCardReplacementReasons value for
         *         cardReplacementReason.
         * @return Builder
         */
        public Builder cardReplacementReason(
                PrepaidCardReplacementReasons cardReplacementReason) {
            this.cardReplacementReason = cardReplacementReason;
            return this;
        }

        /**
         * Builds a new {@link ReplacePrepaidCard} object using the set fields.
         * @return {@link ReplacePrepaidCard}
         */
        public ReplacePrepaidCard build() {
            return new ReplacePrepaidCard(cardPackage, cardReplacementReason);
        }
    }
}

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
 * This is a model class for UpdatePrepaidCard type.
 */
public class UpdatePrepaidCard
        extends BaseModel {
    private String cardPackage;
    private PrepaidCardStatuses status;

    /**
     * Default constructor.
     */
    public UpdatePrepaidCard() {
    }

    /**
     * Initialization constructor.
     * @param  cardPackage  String value for cardPackage.
     * @param  status  PrepaidCardStatuses value for status.
     */
    public UpdatePrepaidCard(
            String cardPackage,
            PrepaidCardStatuses status) {
        this.cardPackage = cardPackage;
        this.status = status;
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
     * Getter for Status.
     * Current [status](#/rest/models/structures/prepaid-card-status) of the prepaid card
     * @return Returns the PrepaidCardStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidCardStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current [status](#/rest/models/structures/prepaid-card-status) of the prepaid card
     * @param status Value for PrepaidCardStatuses
     */
    @JsonSetter("status")
    public void setStatus(PrepaidCardStatuses status) {
        this.status = status;
    }

    /**
     * Converts this UpdatePrepaidCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePrepaidCard [" + "cardPackage=" + cardPackage + ", status=" + status
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdatePrepaidCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePrepaidCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardPackage(getCardPackage())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePrepaidCard}.
     */
    public static class Builder {
        private String cardPackage;
        private PrepaidCardStatuses status;



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
         * Setter for status.
         * @param  status  PrepaidCardStatuses value for status.
         * @return Builder
         */
        public Builder status(PrepaidCardStatuses status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link UpdatePrepaidCard} object using the set fields.
         * @return {@link UpdatePrepaidCard}
         */
        public UpdatePrepaidCard build() {
            return new UpdatePrepaidCard(cardPackage, status);
        }
    }
}

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
 * This is a model class for PrepaidCardDataObject type.
 */
public class PrepaidCardDataObject
        extends BaseModel {
    private Double cardNumber;
    private String cvvNumber;
    private String expiration;
    private String nameOnCard;
    private String token;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public PrepaidCardDataObject() {
    }

    /**
     * Initialization constructor.
     * @param  cardNumber  Double value for cardNumber.
     * @param  cvvNumber  String value for cvvNumber.
     * @param  expiration  String value for expiration.
     * @param  nameOnCard  String value for nameOnCard.
     * @param  token  String value for token.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public PrepaidCardDataObject(
            Double cardNumber,
            String cvvNumber,
            String expiration,
            String nameOnCard,
            String token,
            List<HateoasSelfRef> links) {
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.expiration = expiration;
        this.nameOnCard = nameOnCard;
        this.token = token;
        this.links = links;
    }

    /**
     * Getter for CardNumber.
     * Unique number on the prepaid card
     * @return Returns the Double
     */
    @JsonGetter("cardNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter for CardNumber.
     * Unique number on the prepaid card
     * @param cardNumber Value for Double
     */
    @JsonSetter("cardNumber")
    public void setCardNumber(Double cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Getter for CvvNumber.
     * Three- or four-digit [Card Verification Value (CVV)](#/rest/models/structures/cvv) number
     * displayed on the back of a credit or debit card
     * @return Returns the String
     */
    @JsonGetter("cvvNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCvvNumber() {
        return cvvNumber;
    }

    /**
     * Setter for CvvNumber.
     * Three- or four-digit [Card Verification Value (CVV)](#/rest/models/structures/cvv) number
     * displayed on the back of a credit or debit card
     * @param cvvNumber Value for String
     */
    @JsonSetter("cvvNumber")
    public void setCvvNumber(String cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    /**
     * Getter for Expiration.
     * Date that the card will expire
     * @return Returns the String
     */
    @JsonGetter("expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiration() {
        return expiration;
    }

    /**
     * Setter for Expiration.
     * Date that the card will expire
     * @param expiration Value for String
     */
    @JsonSetter("expiration")
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * Getter for NameOnCard.
     * Name of the card's owner
     * @return Returns the String
     */
    @JsonGetter("nameOnCard")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Setter for NameOnCard.
     * Name of the card's owner
     * @param nameOnCard Value for String
     */
    @JsonSetter("nameOnCard")
    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    /**
     * Getter for Token.
     * A token used to reveal prepaid card information in the form of image data (base64) or JSON.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * A token used to reveal prepaid card information in the form of image data (base64) or JSON.
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
     * Converts this PrepaidCardDataObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidCardDataObject [" + "cardNumber=" + cardNumber + ", cvvNumber=" + cvvNumber
                + ", expiration=" + expiration + ", nameOnCard=" + nameOnCard + ", token=" + token
                + ", links=" + links + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaidCardDataObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidCardDataObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardNumber(getCardNumber())
                .cvvNumber(getCvvNumber())
                .expiration(getExpiration())
                .nameOnCard(getNameOnCard())
                .token(getToken())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidCardDataObject}.
     */
    public static class Builder {
        private Double cardNumber;
        private String cvvNumber;
        private String expiration;
        private String nameOnCard;
        private String token;
        private List<HateoasSelfRef> links;



        /**
         * Setter for cardNumber.
         * @param  cardNumber  Double value for cardNumber.
         * @return Builder
         */
        public Builder cardNumber(Double cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * Setter for cvvNumber.
         * @param  cvvNumber  String value for cvvNumber.
         * @return Builder
         */
        public Builder cvvNumber(String cvvNumber) {
            this.cvvNumber = cvvNumber;
            return this;
        }

        /**
         * Setter for expiration.
         * @param  expiration  String value for expiration.
         * @return Builder
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * Setter for nameOnCard.
         * @param  nameOnCard  String value for nameOnCard.
         * @return Builder
         */
        public Builder nameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
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
         * Builds a new {@link PrepaidCardDataObject} object using the set fields.
         * @return {@link PrepaidCardDataObject}
         */
        public PrepaidCardDataObject build() {
            return new PrepaidCardDataObject(cardNumber, cvvNumber, expiration, nameOnCard, token,
                    links);
        }
    }
}

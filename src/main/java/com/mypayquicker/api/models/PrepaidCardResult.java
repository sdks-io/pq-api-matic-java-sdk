/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mypayquicker.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for PrepaidCardResult type.
 */
public class PrepaidCardResult
        extends BaseModel {
    private String token;
    private CardNetworks cardNetwork;
    private String cardNumber;
    private String cardPackage;
    private Countries country;
    private LocalDateTime createdOn;
    private Currencies currency;
    private String cvv;
    private String expires;
    private PrepaidCardStatuses status;
    private List<BankAccountField> bankInDetails;
    private List<PrepaidCardCapabilities> capabilities;
    private String userToken;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public PrepaidCardResult() {
        currency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  cardNetwork  CardNetworks value for cardNetwork.
     * @param  cardNumber  String value for cardNumber.
     * @param  cardPackage  String value for cardPackage.
     * @param  country  Countries value for country.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  currency  Currencies value for currency.
     * @param  cvv  String value for cvv.
     * @param  expires  String value for expires.
     * @param  status  PrepaidCardStatuses value for status.
     * @param  bankInDetails  List of BankAccountField value for bankInDetails.
     * @param  capabilities  List of PrepaidCardCapabilities value for capabilities.
     * @param  userToken  String value for userToken.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public PrepaidCardResult(
            String token,
            CardNetworks cardNetwork,
            String cardNumber,
            String cardPackage,
            Countries country,
            LocalDateTime createdOn,
            Currencies currency,
            String cvv,
            String expires,
            PrepaidCardStatuses status,
            List<BankAccountField> bankInDetails,
            List<PrepaidCardCapabilities> capabilities,
            String userToken,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.cardNetwork = cardNetwork;
        this.cardNumber = cardNumber;
        this.cardPackage = cardPackage;
        this.country = country;
        this.createdOn = createdOn;
        this.currency = currency;
        this.cvv = cvv;
        this.expires = expires;
        this.status = status;
        this.bankInDetails = bankInDetails;
        this.capabilities = capabilities;
        this.userToken = userToken;
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
     * Getter for CardNetwork.
     * Major [credit card network](#/rest/models/structures/card-network) types
     * @return Returns the CardNetworks
     */
    @JsonGetter("cardNetwork")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardNetworks getCardNetwork() {
        return cardNetwork;
    }

    /**
     * Setter for CardNetwork.
     * Major [credit card network](#/rest/models/structures/card-network) types
     * @param cardNetwork Value for CardNetworks
     */
    @JsonSetter("cardNetwork")
    public void setCardNetwork(CardNetworks cardNetwork) {
        this.cardNetwork = cardNetwork;
    }

    /**
     * Getter for CardNumber.
     * Unique number on the prepaid card
     * @return Returns the String
     */
    @JsonGetter("cardNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter for CardNumber.
     * Unique number on the prepaid card
     * @param cardNumber Value for String
     */
    @JsonSetter("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
     * Getter for Country.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param country Value for Countries
     */
    @JsonSetter("country")
    public void setCountry(Countries country) {
        this.country = country;
    }

    /**
     * Getter for CreatedOn.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createdOn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("createdOn")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param currency Value for Currencies
     */
    @JsonSetter("currency")
    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    /**
     * Getter for Cvv.
     * Three- or four-digit [Card Verification Value (CVV)](#/rest/models/structures/cvv) number
     * displayed on the back of a credit or debit card
     * @return Returns the String
     */
    @JsonGetter("cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter for Cvv.
     * Three- or four-digit [Card Verification Value (CVV)](#/rest/models/structures/cvv) number
     * displayed on the back of a credit or debit card
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * Getter for Expires.
     * Date and time the object will [expire](#/rest/models/structures/expiration)
     * @return Returns the String
     */
    @JsonGetter("expires")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpires() {
        return expires;
    }

    /**
     * Setter for Expires.
     * Date and time the object will [expire](#/rest/models/structures/expiration)
     * @param expires Value for String
     */
    @JsonSetter("expires")
    public void setExpires(String expires) {
        this.expires = expires;
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
     * Getter for BankInDetails.
     * @return Returns the List of BankAccountField
     */
    @JsonGetter("bankInDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BankAccountField> getBankInDetails() {
        return bankInDetails;
    }

    /**
     * Setter for BankInDetails.
     * @param bankInDetails Value for List of BankAccountField
     */
    @JsonSetter("bankInDetails")
    public void setBankInDetails(List<BankAccountField> bankInDetails) {
        this.bankInDetails = bankInDetails;
    }

    /**
     * Getter for Capabilities.
     * @return Returns the List of PrepaidCardCapabilities
     */
    @JsonGetter("capabilities")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PrepaidCardCapabilities> getCapabilities() {
        return capabilities;
    }

    /**
     * Setter for Capabilities.
     * @param capabilities Value for List of PrepaidCardCapabilities
     */
    @JsonSetter("capabilities")
    public void setCapabilities(List<PrepaidCardCapabilities> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Getter for UserToken.
     * Auto-generated unique identifier representing a user, prefixed with `user-`.
     * @return Returns the String
     */
    @JsonGetter("userToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserToken() {
        return userToken;
    }

    /**
     * Setter for UserToken.
     * Auto-generated unique identifier representing a user, prefixed with `user-`.
     * @param userToken Value for String
     */
    @JsonSetter("userToken")
    public void setUserToken(String userToken) {
        this.userToken = userToken;
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
     * Converts this PrepaidCardResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidCardResult [" + "token=" + token + ", cardNetwork=" + cardNetwork
                + ", cardNumber=" + cardNumber + ", cardPackage=" + cardPackage + ", country="
                + country + ", createdOn=" + createdOn + ", currency=" + currency + ", cvv=" + cvv
                + ", expires=" + expires + ", status=" + status + ", bankInDetails=" + bankInDetails
                + ", capabilities=" + capabilities + ", userToken=" + userToken + ", links=" + links
                + ", meta=" + meta + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaidCardResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidCardResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .cardNetwork(getCardNetwork())
                .cardNumber(getCardNumber())
                .cardPackage(getCardPackage())
                .country(getCountry())
                .createdOn(getCreatedOn())
                .currency(getCurrency())
                .cvv(getCvv())
                .expires(getExpires())
                .status(getStatus())
                .bankInDetails(getBankInDetails())
                .capabilities(getCapabilities())
                .userToken(getUserToken())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidCardResult}.
     */
    public static class Builder {
        private String token;
        private CardNetworks cardNetwork;
        private String cardNumber;
        private String cardPackage;
        private Countries country;
        private LocalDateTime createdOn;
        private Currencies currency = Currencies.USD;
        private String cvv;
        private String expires;
        private PrepaidCardStatuses status;
        private List<BankAccountField> bankInDetails;
        private List<PrepaidCardCapabilities> capabilities;
        private String userToken;
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
         * Setter for cardNetwork.
         * @param  cardNetwork  CardNetworks value for cardNetwork.
         * @return Builder
         */
        public Builder cardNetwork(CardNetworks cardNetwork) {
            this.cardNetwork = cardNetwork;
            return this;
        }

        /**
         * Setter for cardNumber.
         * @param  cardNumber  String value for cardNumber.
         * @return Builder
         */
        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

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
         * Setter for country.
         * @param  country  Countries value for country.
         * @return Builder
         */
        public Builder country(Countries country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  Currencies value for currency.
         * @return Builder
         */
        public Builder currency(Currencies currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for cvv.
         * @param  cvv  String value for cvv.
         * @return Builder
         */
        public Builder cvv(String cvv) {
            this.cvv = cvv;
            return this;
        }

        /**
         * Setter for expires.
         * @param  expires  String value for expires.
         * @return Builder
         */
        public Builder expires(String expires) {
            this.expires = expires;
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
         * Setter for bankInDetails.
         * @param  bankInDetails  List of BankAccountField value for bankInDetails.
         * @return Builder
         */
        public Builder bankInDetails(List<BankAccountField> bankInDetails) {
            this.bankInDetails = bankInDetails;
            return this;
        }

        /**
         * Setter for capabilities.
         * @param  capabilities  List of PrepaidCardCapabilities value for capabilities.
         * @return Builder
         */
        public Builder capabilities(List<PrepaidCardCapabilities> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * Setter for userToken.
         * @param  userToken  String value for userToken.
         * @return Builder
         */
        public Builder userToken(String userToken) {
            this.userToken = userToken;
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
         * Builds a new {@link PrepaidCardResult} object using the set fields.
         * @return {@link PrepaidCardResult}
         */
        public PrepaidCardResult build() {
            return new PrepaidCardResult(token, cardNetwork, cardNumber, cardPackage, country,
                    createdOn, currency, cvv, expires, status, bankInDetails, capabilities,
                    userToken, links, meta);
        }
    }
}

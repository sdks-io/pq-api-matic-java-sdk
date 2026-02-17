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
 * This is a model class for ReceiptObject type.
 */
public class ReceiptObject
        extends BaseModel {
    private String token;
    private TransferTypes type;
    private LocalDateTime createdOn;
    private Signs sign;
    private String sourceToken;
    private String destinationToken;
    private Double amount;
    private Currencies currency;
    private ReceiptStatuses status;
    private List<ReceiptDescriptions> descriptions;
    private DeliveryDetails deliveryDetails;
    private ReceiptDetails details;
    private FxRate fxRate;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public ReceiptObject() {
        token = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        amount = 1.02d;
        currency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  type  TransferTypes value for type.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  sign  Signs value for sign.
     * @param  sourceToken  String value for sourceToken.
     * @param  destinationToken  String value for destinationToken.
     * @param  amount  Double value for amount.
     * @param  currency  Currencies value for currency.
     * @param  status  ReceiptStatuses value for status.
     * @param  descriptions  List of ReceiptDescriptions value for descriptions.
     * @param  deliveryDetails  DeliveryDetails value for deliveryDetails.
     * @param  details  ReceiptDetails value for details.
     * @param  fxRate  FxRate value for fxRate.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public ReceiptObject(
            String token,
            TransferTypes type,
            LocalDateTime createdOn,
            Signs sign,
            String sourceToken,
            String destinationToken,
            Double amount,
            Currencies currency,
            ReceiptStatuses status,
            List<ReceiptDescriptions> descriptions,
            DeliveryDetails deliveryDetails,
            ReceiptDetails details,
            FxRate fxRate,
            List<HateoasSelfRef> links) {
        this.token = token;
        this.type = type;
        this.createdOn = createdOn;
        this.sign = sign;
        this.sourceToken = sourceToken;
        this.destinationToken = destinationToken;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.descriptions = descriptions;
        this.deliveryDetails = deliveryDetails;
        this.details = details;
        this.fxRate = fxRate;
        this.links = links;
    }

    /**
     * Getter for Token.
     * Auto-generated unique identifier representing a receipt, prefixed with `rcpt-`.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Auto-generated unique identifier representing a receipt, prefixed with `rcpt-`.
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for Type.
     * [Transfer type](#/rest/models/structures/transfer-type)
     * @return Returns the TransferTypes
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransferTypes getType() {
        return type;
    }

    /**
     * Setter for Type.
     * [Transfer type](#/rest/models/structures/transfer-type)
     * @param type Value for TransferTypes
     */
    @JsonSetter("type")
    public void setType(TransferTypes type) {
        this.type = type;
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
     * Getter for Sign.
     * Receipt sign types
     * @return Returns the Signs
     */
    @JsonGetter("sign")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Signs getSign() {
        return sign;
    }

    /**
     * Setter for Sign.
     * Receipt sign types
     * @param sign Value for Signs
     */
    @JsonSetter("sign")
    public void setSign(Signs sign) {
        this.sign = sign;
    }

    /**
     * Getter for SourceToken.
     * Unique identifier representing the [source of funds](#/rest/models/structures/source-token)
     * @return Returns the String
     */
    @JsonGetter("sourceToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceToken() {
        return sourceToken;
    }

    /**
     * Setter for SourceToken.
     * Unique identifier representing the [source of funds](#/rest/models/structures/source-token)
     * @param sourceToken Value for String
     */
    @JsonSetter("sourceToken")
    public void setSourceToken(String sourceToken) {
        this.sourceToken = sourceToken;
    }

    /**
     * Getter for DestinationToken.
     * Unique identifier representing the [destination of
     * funds](#/rest/models/structures/destination-token)
     * @return Returns the String
     */
    @JsonGetter("destinationToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationToken() {
        return destinationToken;
    }

    /**
     * Setter for DestinationToken.
     * Unique identifier representing the [destination of
     * funds](#/rest/models/structures/destination-token)
     * @param destinationToken Value for String
     */
    @JsonSetter("destinationToken")
    public void setDestinationToken(String destinationToken) {
        this.destinationToken = destinationToken;
    }

    /**
     * Getter for Amount.
     * Allocated money to be sent in the transaction.
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Allocated money to be sent in the transaction.
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
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
     * Getter for Status.
     * Receipt status types
     * @return Returns the ReceiptStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReceiptStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Receipt status types
     * @param status Value for ReceiptStatuses
     */
    @JsonSetter("status")
    public void setStatus(ReceiptStatuses status) {
        this.status = status;
    }

    /**
     * Getter for Descriptions.
     * @return Returns the List of ReceiptDescriptions
     */
    @JsonGetter("descriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ReceiptDescriptions> getDescriptions() {
        return descriptions;
    }

    /**
     * Setter for Descriptions.
     * @param descriptions Value for List of ReceiptDescriptions
     */
    @JsonSetter("descriptions")
    public void setDescriptions(List<ReceiptDescriptions> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Getter for DeliveryDetails.
     * The delivery details of a Bank transfer with the minimum and maximum delivery in minutes or
     * the expected delivery time.
     * @return Returns the DeliveryDetails
     */
    @JsonGetter("deliveryDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeliveryDetails getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * Setter for DeliveryDetails.
     * The delivery details of a Bank transfer with the minimum and maximum delivery in minutes or
     * the expected delivery time.
     * @param deliveryDetails Value for DeliveryDetails
     */
    @JsonSetter("deliveryDetails")
    public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    /**
     * Getter for Details.
     * @return Returns the ReceiptDetails
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReceiptDetails getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * @param details Value for ReceiptDetails
     */
    @JsonSetter("details")
    public void setDetails(ReceiptDetails details) {
        this.details = details;
    }

    /**
     * Getter for FxRate.
     * Exchange rate
     * @return Returns the FxRate
     */
    @JsonGetter("fxRate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FxRate getFxRate() {
        return fxRate;
    }

    /**
     * Setter for FxRate.
     * Exchange rate
     * @param fxRate Value for FxRate
     */
    @JsonSetter("fxRate")
    public void setFxRate(FxRate fxRate) {
        this.fxRate = fxRate;
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
     * Converts this ReceiptObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReceiptObject [" + "token=" + token + ", type=" + type + ", createdOn=" + createdOn
                + ", sign=" + sign + ", sourceToken=" + sourceToken + ", destinationToken="
                + destinationToken + ", amount=" + amount + ", currency=" + currency + ", status="
                + status + ", descriptions=" + descriptions + ", deliveryDetails=" + deliveryDetails
                + ", details=" + details + ", fxRate=" + fxRate + ", links=" + links
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ReceiptObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReceiptObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .type(getType())
                .createdOn(getCreatedOn())
                .sign(getSign())
                .sourceToken(getSourceToken())
                .destinationToken(getDestinationToken())
                .amount(getAmount())
                .currency(getCurrency())
                .status(getStatus())
                .descriptions(getDescriptions())
                .deliveryDetails(getDeliveryDetails())
                .details(getDetails())
                .fxRate(getFxRate())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link ReceiptObject}.
     */
    public static class Builder {
        private String token = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
        private TransferTypes type;
        private LocalDateTime createdOn;
        private Signs sign;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private Double amount = 1.02d;
        private Currencies currency = Currencies.USD;
        private ReceiptStatuses status;
        private List<ReceiptDescriptions> descriptions;
        private DeliveryDetails deliveryDetails;
        private ReceiptDetails details;
        private FxRate fxRate;
        private List<HateoasSelfRef> links;



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
         * Setter for type.
         * @param  type  TransferTypes value for type.
         * @return Builder
         */
        public Builder type(TransferTypes type) {
            this.type = type;
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
         * Setter for sign.
         * @param  sign  Signs value for sign.
         * @return Builder
         */
        public Builder sign(Signs sign) {
            this.sign = sign;
            return this;
        }

        /**
         * Setter for sourceToken.
         * @param  sourceToken  String value for sourceToken.
         * @return Builder
         */
        public Builder sourceToken(String sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }

        /**
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Double value for amount.
         * @return Builder
         */
        public Builder amount(Double amount) {
            this.amount = amount;
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
         * Setter for status.
         * @param  status  ReceiptStatuses value for status.
         * @return Builder
         */
        public Builder status(ReceiptStatuses status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for descriptions.
         * @param  descriptions  List of ReceiptDescriptions value for descriptions.
         * @return Builder
         */
        public Builder descriptions(List<ReceiptDescriptions> descriptions) {
            this.descriptions = descriptions;
            return this;
        }

        /**
         * Setter for deliveryDetails.
         * @param  deliveryDetails  DeliveryDetails value for deliveryDetails.
         * @return Builder
         */
        public Builder deliveryDetails(DeliveryDetails deliveryDetails) {
            this.deliveryDetails = deliveryDetails;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  ReceiptDetails value for details.
         * @return Builder
         */
        public Builder details(ReceiptDetails details) {
            this.details = details;
            return this;
        }

        /**
         * Setter for fxRate.
         * @param  fxRate  FxRate value for fxRate.
         * @return Builder
         */
        public Builder fxRate(FxRate fxRate) {
            this.fxRate = fxRate;
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
         * Builds a new {@link ReceiptObject} object using the set fields.
         * @return {@link ReceiptObject}
         */
        public ReceiptObject build() {
            return new ReceiptObject(token, type, createdOn, sign, sourceToken, destinationToken,
                    amount, currency, status, descriptions, deliveryDetails, details, fxRate,
                    links);
        }
    }
}

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
 * This is a model class for TransferObject type.
 */
public class TransferObject
        extends BaseModel {
    private String token;
    private String portalId;
    private String clientTransferId;
    private LocalDateTime created;
    private DeliveryDetails deliveryDetails;
    private Double destinationAmount;
    private Currencies destinationCurrency;
    private String destinationToken;
    private FeeDistribution fee;
    private FxRate fxRate;
    private String memo;
    private String note;
    private String sourceToken;
    private String programUserId;
    private String email;
    private TransferStatuses status;
    private String receiptToken;
    private LockSideTypes transferLockSide;
    private TransferMethodTypes transferMethodType;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public TransferObject() {
        destinationCurrency = Currencies.USD;
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        receiptToken = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  portalId  String value for portalId.
     * @param  clientTransferId  String value for clientTransferId.
     * @param  created  LocalDateTime value for created.
     * @param  deliveryDetails  DeliveryDetails value for deliveryDetails.
     * @param  destinationAmount  Double value for destinationAmount.
     * @param  destinationCurrency  Currencies value for destinationCurrency.
     * @param  destinationToken  String value for destinationToken.
     * @param  fee  FeeDistribution value for fee.
     * @param  fxRate  FxRate value for fxRate.
     * @param  memo  String value for memo.
     * @param  note  String value for note.
     * @param  sourceToken  String value for sourceToken.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  status  TransferStatuses value for status.
     * @param  receiptToken  String value for receiptToken.
     * @param  transferLockSide  LockSideTypes value for transferLockSide.
     * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public TransferObject(
            String token,
            String portalId,
            String clientTransferId,
            LocalDateTime created,
            DeliveryDetails deliveryDetails,
            Double destinationAmount,
            Currencies destinationCurrency,
            String destinationToken,
            FeeDistribution fee,
            FxRate fxRate,
            String memo,
            String note,
            String sourceToken,
            String programUserId,
            String email,
            TransferStatuses status,
            String receiptToken,
            LockSideTypes transferLockSide,
            TransferMethodTypes transferMethodType,
            List<HateoasSelfRef> links) {
        this.token = token;
        this.portalId = portalId;
        this.clientTransferId = clientTransferId;
        this.created = created;
        this.deliveryDetails = deliveryDetails;
        this.destinationAmount = destinationAmount;
        this.destinationCurrency = destinationCurrency;
        this.destinationToken = destinationToken;
        this.fee = fee;
        this.fxRate = fxRate;
        this.memo = memo;
        this.note = note;
        this.sourceToken = sourceToken;
        this.programUserId = programUserId;
        this.email = email;
        this.status = status;
        this.receiptToken = receiptToken;
        this.transferLockSide = transferLockSide;
        this.transferMethodType = transferMethodType;
        this.links = links;
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
     * Getter for PortalId.
     * Reference ID in the PayQuicker Hosted Portal, if applicable.
     * @return Returns the String
     */
    @JsonGetter("portalId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPortalId() {
        return portalId;
    }

    /**
     * Setter for PortalId.
     * Reference ID in the PayQuicker Hosted Portal, if applicable.
     * @param portalId Value for String
     */
    @JsonSetter("portalId")
    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * Getter for ClientTransferId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @return Returns the String
     */
    @JsonGetter("clientTransferId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientTransferId() {
        return clientTransferId;
    }

    /**
     * Setter for ClientTransferId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @param clientTransferId Value for String
     */
    @JsonSetter("clientTransferId")
    public void setClientTransferId(String clientTransferId) {
        this.clientTransferId = clientTransferId;
    }

    /**
     * Getter for Created.
     * Time object was [created](#/rest/models/structures/created-on)
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Time object was [created](#/rest/models/structures/created-on)
     * @param created Value for LocalDateTime
     */
    @JsonSetter("created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreated(LocalDateTime created) {
        this.created = created;
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
     * Getter for DestinationAmount.
     * Allocated money to be sent in the transaction.
     * @return Returns the Double
     */
    @JsonGetter("destinationAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDestinationAmount() {
        return destinationAmount;
    }

    /**
     * Setter for DestinationAmount.
     * Allocated money to be sent in the transaction.
     * @param destinationAmount Value for Double
     */
    @JsonSetter("destinationAmount")
    public void setDestinationAmount(Double destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    /**
     * Getter for DestinationCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("destinationCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getDestinationCurrency() {
        return destinationCurrency;
    }

    /**
     * Setter for DestinationCurrency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param destinationCurrency Value for Currencies
     */
    @JsonSetter("destinationCurrency")
    public void setDestinationCurrency(Currencies destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
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
     * Getter for Fee.
     * @return Returns the FeeDistribution
     */
    @JsonGetter("fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeDistribution getFee() {
        return fee;
    }

    /**
     * Setter for Fee.
     * @param fee Value for FeeDistribution
     */
    @JsonSetter("fee")
    public void setFee(FeeDistribution fee) {
        this.fee = fee;
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
     * Getter for Memo.
     * Optional internal [memo](#/rest/models/structures/memo) not visible to the user
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * Optional internal [memo](#/rest/models/structures/memo) not visible to the user
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Note.
     * [Optional comments](#/rest/models/structures/notes) visible to the user
     * @return Returns the String
     */
    @JsonGetter("note")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * [Optional comments](#/rest/models/structures/notes) visible to the user
     * @param note Value for String
     */
    @JsonSetter("note")
    public void setNote(String note) {
        this.note = note;
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
     * Getter for ProgramUserId.
     * [Program identifier](#/rest/models/structures/program-user-id) for the user
     * @return Returns the String
     */
    @JsonGetter("programUserId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProgramUserId() {
        return programUserId;
    }

    /**
     * Setter for ProgramUserId.
     * [Program identifier](#/rest/models/structures/program-user-id) for the user
     * @param programUserId Value for String
     */
    @JsonSetter("programUserId")
    public void setProgramUserId(String programUserId) {
        this.programUserId = programUserId;
    }

    /**
     * Getter for Email.
     * Contact [email address](#/rest/models/structures/email-address) for the user account for the
     * user account
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Contact [email address](#/rest/models/structures/email-address) for the user account for the
     * user account
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Status.
     * Current status of a [transfer](#/rest/models/structures/transfer)
     * @return Returns the TransferStatuses
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransferStatuses getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of a [transfer](#/rest/models/structures/transfer)
     * @param status Value for TransferStatuses
     */
    @JsonSetter("status")
    public void setStatus(TransferStatuses status) {
        this.status = status;
    }

    /**
     * Getter for ReceiptToken.
     * Auto-generated unique identifier representing a receipt, prefixed with `rcpt-`.
     * @return Returns the String
     */
    @JsonGetter("receiptToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReceiptToken() {
        return receiptToken;
    }

    /**
     * Setter for ReceiptToken.
     * Auto-generated unique identifier representing a receipt, prefixed with `rcpt-`.
     * @param receiptToken Value for String
     */
    @JsonSetter("receiptToken")
    public void setReceiptToken(String receiptToken) {
        this.receiptToken = receiptToken;
    }

    /**
     * Getter for TransferLockSide.
     * Type of [lockside](page:additional-api-information/transfer-lockside-types) for transfers.
     * @return Returns the LockSideTypes
     */
    @JsonGetter("transferLockSide")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LockSideTypes getTransferLockSide() {
        return transferLockSide;
    }

    /**
     * Setter for TransferLockSide.
     * Type of [lockside](page:additional-api-information/transfer-lockside-types) for transfers.
     * @param transferLockSide Value for LockSideTypes
     */
    @JsonSetter("transferLockSide")
    public void setTransferLockSide(LockSideTypes transferLockSide) {
        this.transferLockSide = transferLockSide;
    }

    /**
     * Getter for TransferMethodType.
     * Optional transfer methods applicable only to bank and e-wallet transfers.
     * @return Returns the TransferMethodTypes
     */
    @JsonGetter("transferMethodType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransferMethodTypes getTransferMethodType() {
        return transferMethodType;
    }

    /**
     * Setter for TransferMethodType.
     * Optional transfer methods applicable only to bank and e-wallet transfers.
     * @param transferMethodType Value for TransferMethodTypes
     */
    @JsonSetter("transferMethodType")
    public void setTransferMethodType(TransferMethodTypes transferMethodType) {
        this.transferMethodType = transferMethodType;
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
     * Converts this TransferObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransferObject [" + "token=" + token + ", portalId=" + portalId
                + ", clientTransferId=" + clientTransferId + ", created=" + created
                + ", deliveryDetails=" + deliveryDetails + ", destinationAmount="
                + destinationAmount + ", destinationCurrency=" + destinationCurrency
                + ", destinationToken=" + destinationToken + ", fee=" + fee + ", fxRate=" + fxRate
                + ", memo=" + memo + ", note=" + note + ", sourceToken=" + sourceToken
                + ", programUserId=" + programUserId + ", email=" + email + ", status=" + status
                + ", receiptToken=" + receiptToken + ", transferLockSide=" + transferLockSide
                + ", transferMethodType=" + transferMethodType + ", links=" + links
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TransferObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransferObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .portalId(getPortalId())
                .clientTransferId(getClientTransferId())
                .created(getCreated())
                .deliveryDetails(getDeliveryDetails())
                .destinationAmount(getDestinationAmount())
                .destinationCurrency(getDestinationCurrency())
                .destinationToken(getDestinationToken())
                .fee(getFee())
                .fxRate(getFxRate())
                .memo(getMemo())
                .note(getNote())
                .sourceToken(getSourceToken())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .status(getStatus())
                .receiptToken(getReceiptToken())
                .transferLockSide(getTransferLockSide())
                .transferMethodType(getTransferMethodType())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link TransferObject}.
     */
    public static class Builder {
        private String token;
        private String portalId;
        private String clientTransferId;
        private LocalDateTime created;
        private DeliveryDetails deliveryDetails;
        private Double destinationAmount;
        private Currencies destinationCurrency = Currencies.USD;
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private FeeDistribution fee;
        private FxRate fxRate;
        private String memo;
        private String note;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String programUserId;
        private String email;
        private TransferStatuses status;
        private String receiptToken = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
        private LockSideTypes transferLockSide;
        private TransferMethodTypes transferMethodType;
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
         * Setter for portalId.
         * @param  portalId  String value for portalId.
         * @return Builder
         */
        public Builder portalId(String portalId) {
            this.portalId = portalId;
            return this;
        }

        /**
         * Setter for clientTransferId.
         * @param  clientTransferId  String value for clientTransferId.
         * @return Builder
         */
        public Builder clientTransferId(String clientTransferId) {
            this.clientTransferId = clientTransferId;
            return this;
        }

        /**
         * Setter for created.
         * @param  created  LocalDateTime value for created.
         * @return Builder
         */
        public Builder created(LocalDateTime created) {
            this.created = created;
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
         * Setter for destinationAmount.
         * @param  destinationAmount  Double value for destinationAmount.
         * @return Builder
         */
        public Builder destinationAmount(Double destinationAmount) {
            this.destinationAmount = destinationAmount;
            return this;
        }

        /**
         * Setter for destinationCurrency.
         * @param  destinationCurrency  Currencies value for destinationCurrency.
         * @return Builder
         */
        public Builder destinationCurrency(Currencies destinationCurrency) {
            this.destinationCurrency = destinationCurrency;
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
         * Setter for fee.
         * @param  fee  FeeDistribution value for fee.
         * @return Builder
         */
        public Builder fee(FeeDistribution fee) {
            this.fee = fee;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
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
         * Setter for programUserId.
         * @param  programUserId  String value for programUserId.
         * @return Builder
         */
        public Builder programUserId(String programUserId) {
            this.programUserId = programUserId;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  TransferStatuses value for status.
         * @return Builder
         */
        public Builder status(TransferStatuses status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for receiptToken.
         * @param  receiptToken  String value for receiptToken.
         * @return Builder
         */
        public Builder receiptToken(String receiptToken) {
            this.receiptToken = receiptToken;
            return this;
        }

        /**
         * Setter for transferLockSide.
         * @param  transferLockSide  LockSideTypes value for transferLockSide.
         * @return Builder
         */
        public Builder transferLockSide(LockSideTypes transferLockSide) {
            this.transferLockSide = transferLockSide;
            return this;
        }

        /**
         * Setter for transferMethodType.
         * @param  transferMethodType  TransferMethodTypes value for transferMethodType.
         * @return Builder
         */
        public Builder transferMethodType(TransferMethodTypes transferMethodType) {
            this.transferMethodType = transferMethodType;
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
         * Builds a new {@link TransferObject} object using the set fields.
         * @return {@link TransferObject}
         */
        public TransferObject build() {
            return new TransferObject(token, portalId, clientTransferId, created, deliveryDetails,
                    destinationAmount, destinationCurrency, destinationToken, fee, fxRate, memo,
                    note, sourceToken, programUserId, email, status, receiptToken, transferLockSide,
                    transferMethodType, links);
        }
    }
}

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
 * This is a model class for SpendbackQuoteAcceptResult type.
 */
public class SpendbackQuoteAcceptResult
        extends BaseModel {
    private String token;
    private String portalId;
    private Double amount;
    private String clientSpendbackId;
    private LocalDateTime created;
    private Currencies currency;
    private String destinationToken;
    private FeeConfiguration fee;
    private String memo;
    private String note;
    private PaymentPurposes purpose;
    private String sourceToken;
    private String programUserId;
    private String email;
    private TransferStatuses status;
    private String receiptToken;
    private List<SpendbackRefundObject> refunds;
    private List<HateoasSelfRef> links;
    private MetadataItems meta;

    /**
     * Default constructor.
     */
    public SpendbackQuoteAcceptResult() {
        amount = 1.02d;
        currency = Currencies.USD;
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        receiptToken = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  portalId  String value for portalId.
     * @param  amount  Double value for amount.
     * @param  clientSpendbackId  String value for clientSpendbackId.
     * @param  created  LocalDateTime value for created.
     * @param  currency  Currencies value for currency.
     * @param  destinationToken  String value for destinationToken.
     * @param  fee  FeeConfiguration value for fee.
     * @param  memo  String value for memo.
     * @param  note  String value for note.
     * @param  purpose  PaymentPurposes value for purpose.
     * @param  sourceToken  String value for sourceToken.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  status  TransferStatuses value for status.
     * @param  receiptToken  String value for receiptToken.
     * @param  refunds  List of SpendbackRefundObject value for refunds.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  MetadataItems value for meta.
     */
    public SpendbackQuoteAcceptResult(
            String token,
            String portalId,
            Double amount,
            String clientSpendbackId,
            LocalDateTime created,
            Currencies currency,
            String destinationToken,
            FeeConfiguration fee,
            String memo,
            String note,
            PaymentPurposes purpose,
            String sourceToken,
            String programUserId,
            String email,
            TransferStatuses status,
            String receiptToken,
            List<SpendbackRefundObject> refunds,
            List<HateoasSelfRef> links,
            MetadataItems meta) {
        this.token = token;
        this.portalId = portalId;
        this.amount = amount;
        this.clientSpendbackId = clientSpendbackId;
        this.created = created;
        this.currency = currency;
        this.destinationToken = destinationToken;
        this.fee = fee;
        this.memo = memo;
        this.note = note;
        this.purpose = purpose;
        this.sourceToken = sourceToken;
        this.programUserId = programUserId;
        this.email = email;
        this.status = status;
        this.receiptToken = receiptToken;
        this.refunds = refunds;
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
     * Getter for ClientSpendbackId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * spendback
     * @return Returns the String
     */
    @JsonGetter("clientSpendbackId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientSpendbackId() {
        return clientSpendbackId;
    }

    /**
     * Setter for ClientSpendbackId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * spendback
     * @param clientSpendbackId Value for String
     */
    @JsonSetter("clientSpendbackId")
    public void setClientSpendbackId(String clientSpendbackId) {
        this.clientSpendbackId = clientSpendbackId;
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
     * @return Returns the FeeConfiguration
     */
    @JsonGetter("fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeeConfiguration getFee() {
        return fee;
    }

    /**
     * Setter for Fee.
     * @param fee Value for FeeConfiguration
     */
    @JsonSetter("fee")
    public void setFee(FeeConfiguration fee) {
        this.fee = fee;
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
     * Getter for Purpose.
     * Used to identify the [purpose of a payment](#/models/structures/payment-object) and impacts
     * reporting and calculated taxable earnings (if utilizing tax services)
     * @return Returns the PaymentPurposes
     */
    @JsonGetter("purpose")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentPurposes getPurpose() {
        return purpose;
    }

    /**
     * Setter for Purpose.
     * Used to identify the [purpose of a payment](#/models/structures/payment-object) and impacts
     * reporting and calculated taxable earnings (if utilizing tax services)
     * @param purpose Value for PaymentPurposes
     */
    @JsonSetter("purpose")
    public void setPurpose(PaymentPurposes purpose) {
        this.purpose = purpose;
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
     * Getter for Refunds.
     * @return Returns the List of SpendbackRefundObject
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SpendbackRefundObject> getRefunds() {
        return refunds;
    }

    /**
     * Setter for Refunds.
     * @param refunds Value for List of SpendbackRefundObject
     */
    @JsonSetter("refunds")
    public void setRefunds(List<SpendbackRefundObject> refunds) {
        this.refunds = refunds;
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
     * Converts this SpendbackQuoteAcceptResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SpendbackQuoteAcceptResult [" + "token=" + token + ", portalId=" + portalId
                + ", amount=" + amount + ", clientSpendbackId=" + clientSpendbackId + ", created="
                + created + ", currency=" + currency + ", destinationToken=" + destinationToken
                + ", fee=" + fee + ", memo=" + memo + ", note=" + note + ", purpose=" + purpose
                + ", sourceToken=" + sourceToken + ", programUserId=" + programUserId + ", email="
                + email + ", status=" + status + ", receiptToken=" + receiptToken + ", refunds="
                + refunds + ", links=" + links + ", meta=" + meta + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SpendbackQuoteAcceptResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SpendbackQuoteAcceptResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .portalId(getPortalId())
                .amount(getAmount())
                .clientSpendbackId(getClientSpendbackId())
                .created(getCreated())
                .currency(getCurrency())
                .destinationToken(getDestinationToken())
                .fee(getFee())
                .memo(getMemo())
                .note(getNote())
                .purpose(getPurpose())
                .sourceToken(getSourceToken())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .status(getStatus())
                .receiptToken(getReceiptToken())
                .refunds(getRefunds())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link SpendbackQuoteAcceptResult}.
     */
    public static class Builder {
        private String token;
        private String portalId;
        private Double amount = 1.02d;
        private String clientSpendbackId;
        private LocalDateTime created;
        private Currencies currency = Currencies.USD;
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private FeeConfiguration fee;
        private String memo;
        private String note;
        private PaymentPurposes purpose;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String programUserId;
        private String email;
        private TransferStatuses status;
        private String receiptToken = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
        private List<SpendbackRefundObject> refunds;
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
         * Setter for portalId.
         * @param  portalId  String value for portalId.
         * @return Builder
         */
        public Builder portalId(String portalId) {
            this.portalId = portalId;
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
         * Setter for clientSpendbackId.
         * @param  clientSpendbackId  String value for clientSpendbackId.
         * @return Builder
         */
        public Builder clientSpendbackId(String clientSpendbackId) {
            this.clientSpendbackId = clientSpendbackId;
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
         * Setter for currency.
         * @param  currency  Currencies value for currency.
         * @return Builder
         */
        public Builder currency(Currencies currency) {
            this.currency = currency;
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
         * @param  fee  FeeConfiguration value for fee.
         * @return Builder
         */
        public Builder fee(FeeConfiguration fee) {
            this.fee = fee;
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
         * Setter for purpose.
         * @param  purpose  PaymentPurposes value for purpose.
         * @return Builder
         */
        public Builder purpose(PaymentPurposes purpose) {
            this.purpose = purpose;
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
         * Setter for refunds.
         * @param  refunds  List of SpendbackRefundObject value for refunds.
         * @return Builder
         */
        public Builder refunds(List<SpendbackRefundObject> refunds) {
            this.refunds = refunds;
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
         * Builds a new {@link SpendbackQuoteAcceptResult} object using the set fields.
         * @return {@link SpendbackQuoteAcceptResult}
         */
        public SpendbackQuoteAcceptResult build() {
            return new SpendbackQuoteAcceptResult(token, portalId, amount, clientSpendbackId,
                    created, currency, destinationToken, fee, memo, note, purpose, sourceToken,
                    programUserId, email, status, receiptToken, refunds, links, meta);
        }
    }
}

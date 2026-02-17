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
 * This is a model class for SpendbackRefundObject type.
 */
public class SpendbackRefundObject
        extends BaseModel {
    private String token;
    private String portalId;
    private Double amount;
    private String clientSpendbackRefundId;
    private LocalDateTime created;
    private Currencies currency;
    private String memo;
    private String note;
    private String sourceToken;
    private String destinationToken;
    private String programUserId;
    private String email;
    private TransferStatuses status;
    private String receiptToken;
    private List<HateoasSelfRef> links;

    /**
     * Default constructor.
     */
    public SpendbackRefundObject() {
        currency = Currencies.USD;
        sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        receiptToken = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     * @param  portalId  String value for portalId.
     * @param  amount  Double value for amount.
     * @param  clientSpendbackRefundId  String value for clientSpendbackRefundId.
     * @param  created  LocalDateTime value for created.
     * @param  currency  Currencies value for currency.
     * @param  memo  String value for memo.
     * @param  note  String value for note.
     * @param  sourceToken  String value for sourceToken.
     * @param  destinationToken  String value for destinationToken.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  status  TransferStatuses value for status.
     * @param  receiptToken  String value for receiptToken.
     * @param  links  List of HateoasSelfRef value for links.
     */
    public SpendbackRefundObject(
            String token,
            String portalId,
            Double amount,
            String clientSpendbackRefundId,
            LocalDateTime created,
            Currencies currency,
            String memo,
            String note,
            String sourceToken,
            String destinationToken,
            String programUserId,
            String email,
            TransferStatuses status,
            String receiptToken,
            List<HateoasSelfRef> links) {
        this.token = token;
        this.portalId = portalId;
        this.amount = amount;
        this.clientSpendbackRefundId = clientSpendbackRefundId;
        this.created = created;
        this.currency = currency;
        this.memo = memo;
        this.note = note;
        this.sourceToken = sourceToken;
        this.destinationToken = destinationToken;
        this.programUserId = programUserId;
        this.email = email;
        this.status = status;
        this.receiptToken = receiptToken;
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
     * Getter for Amount.
     * Money to be refunded from original payment
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Money to be refunded from original payment
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Getter for ClientSpendbackRefundId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @return Returns the String
     */
    @JsonGetter("clientSpendbackRefundId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientSpendbackRefundId() {
        return clientSpendbackRefundId;
    }

    /**
     * Setter for ClientSpendbackRefundId.
     * [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the
     * transfer, utilized for reference and deduplication.
     * @param clientSpendbackRefundId Value for String
     */
    @JsonSetter("clientSpendbackRefundId")
    public void setClientSpendbackRefundId(String clientSpendbackRefundId) {
        this.clientSpendbackRefundId = clientSpendbackRefundId;
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
     * Converts this SpendbackRefundObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SpendbackRefundObject [" + "token=" + token + ", portalId=" + portalId + ", amount="
                + amount + ", clientSpendbackRefundId=" + clientSpendbackRefundId + ", created="
                + created + ", currency=" + currency + ", memo=" + memo + ", note=" + note
                + ", sourceToken=" + sourceToken + ", destinationToken=" + destinationToken
                + ", programUserId=" + programUserId + ", email=" + email + ", status=" + status
                + ", receiptToken=" + receiptToken + ", links=" + links + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SpendbackRefundObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SpendbackRefundObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken())
                .portalId(getPortalId())
                .amount(getAmount())
                .clientSpendbackRefundId(getClientSpendbackRefundId())
                .created(getCreated())
                .currency(getCurrency())
                .memo(getMemo())
                .note(getNote())
                .sourceToken(getSourceToken())
                .destinationToken(getDestinationToken())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .status(getStatus())
                .receiptToken(getReceiptToken())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link SpendbackRefundObject}.
     */
    public static class Builder {
        private String token;
        private String portalId;
        private Double amount;
        private String clientSpendbackRefundId;
        private LocalDateTime created;
        private Currencies currency = Currencies.USD;
        private String memo;
        private String note;
        private String sourceToken = "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        private String destinationToken = "dest-631b200f-665d-4dbe-bd01-3063c9dec97d";
        private String programUserId;
        private String email;
        private TransferStatuses status;
        private String receiptToken = "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c";
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
         * Setter for amount.
         * @param  amount  Double value for amount.
         * @return Builder
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for clientSpendbackRefundId.
         * @param  clientSpendbackRefundId  String value for clientSpendbackRefundId.
         * @return Builder
         */
        public Builder clientSpendbackRefundId(String clientSpendbackRefundId) {
            this.clientSpendbackRefundId = clientSpendbackRefundId;
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
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
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
         * Setter for links.
         * @param  links  List of HateoasSelfRef value for links.
         * @return Builder
         */
        public Builder links(List<HateoasSelfRef> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link SpendbackRefundObject} object using the set fields.
         * @return {@link SpendbackRefundObject}
         */
        public SpendbackRefundObject build() {
            return new SpendbackRefundObject(token, portalId, amount, clientSpendbackRefundId,
                    created, currency, memo, note, sourceToken, destinationToken, programUserId,
                    email, status, receiptToken, links);
        }
    }
}

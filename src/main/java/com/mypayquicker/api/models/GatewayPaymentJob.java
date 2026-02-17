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
 * This is a model class for GatewayPaymentJob type.
 */
public class GatewayPaymentJob
        extends BaseModel {
    private LocalDateTime notBefore;
    private LocalDateTime notAfter;
    private List<GatewayPaymentJobQuote> items;

    /**
     * Default constructor.
     */
    public GatewayPaymentJob() {
    }

    /**
     * Initialization constructor.
     * @param  notBefore  LocalDateTime value for notBefore.
     * @param  notAfter  LocalDateTime value for notAfter.
     * @param  items  List of GatewayPaymentJobQuote value for items.
     */
    public GatewayPaymentJob(
            LocalDateTime notBefore,
            LocalDateTime notAfter,
            List<GatewayPaymentJobQuote> items) {
        this.notBefore = notBefore;
        this.notAfter = notAfter;
        this.items = items;
    }

    /**
     * Getter for NotBefore.
     * [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process
     * before this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notBefore")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotBefore() {
        return notBefore;
    }

    /**
     * Setter for NotBefore.
     * [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process
     * before this time.
     * @param notBefore Value for LocalDateTime
     */
    @JsonSetter("notBefore")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotBefore(LocalDateTime notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * Getter for NotAfter.
     * [Transfer](#/rest/models/structures/not-before-or-after) expires if not completed prior to
     * this time.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("notAfter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNotAfter() {
        return notAfter;
    }

    /**
     * Setter for NotAfter.
     * [Transfer](#/rest/models/structures/not-before-or-after) expires if not completed prior to
     * this time.
     * @param notAfter Value for LocalDateTime
     */
    @JsonSetter("notAfter")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNotAfter(LocalDateTime notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * Getter for Items.
     * @return Returns the List of GatewayPaymentJobQuote
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GatewayPaymentJobQuote> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of GatewayPaymentJobQuote
     */
    @JsonSetter("items")
    public void setItems(List<GatewayPaymentJobQuote> items) {
        this.items = items;
    }

    /**
     * Converts this GatewayPaymentJob into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GatewayPaymentJob [" + "notBefore=" + notBefore + ", notAfter=" + notAfter
                + ", items=" + items + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GatewayPaymentJob.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GatewayPaymentJob.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .notBefore(getNotBefore())
                .notAfter(getNotAfter())
                .items(getItems());
        return builder;
    }

    /**
     * Class to build instances of {@link GatewayPaymentJob}.
     */
    public static class Builder {
        private LocalDateTime notBefore;
        private LocalDateTime notAfter;
        private List<GatewayPaymentJobQuote> items;



        /**
         * Setter for notBefore.
         * @param  notBefore  LocalDateTime value for notBefore.
         * @return Builder
         */
        public Builder notBefore(LocalDateTime notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * Setter for notAfter.
         * @param  notAfter  LocalDateTime value for notAfter.
         * @return Builder
         */
        public Builder notAfter(LocalDateTime notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of GatewayPaymentJobQuote value for items.
         * @return Builder
         */
        public Builder items(List<GatewayPaymentJobQuote> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds a new {@link GatewayPaymentJob} object using the set fields.
         * @return {@link GatewayPaymentJob}
         */
        public GatewayPaymentJob build() {
            return new GatewayPaymentJob(notBefore, notAfter, items);
        }
    }
}

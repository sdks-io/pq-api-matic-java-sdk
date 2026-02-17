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
 * This is a model class for BankAccountRequirementListResult type.
 */
public class BankAccountRequirementListResult
        extends BaseModel {
    private List<BankAccountRequirement> payload;
    private List<HateoasSelfRef> links;
    private ListMetadata meta;

    /**
     * Default constructor.
     */
    public BankAccountRequirementListResult() {
    }

    /**
     * Initialization constructor.
     * @param  payload  List of BankAccountRequirement value for payload.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  ListMetadata value for meta.
     */
    public BankAccountRequirementListResult(
            List<BankAccountRequirement> payload,
            List<HateoasSelfRef> links,
            ListMetadata meta) {
        this.payload = payload;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for Payload.
     * @return Returns the List of BankAccountRequirement
     */
    @JsonGetter("payload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BankAccountRequirement> getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for List of BankAccountRequirement
     */
    @JsonSetter("payload")
    public void setPayload(List<BankAccountRequirement> payload) {
        this.payload = payload;
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
     * @return Returns the ListMetadata
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListMetadata getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListMetadata
     */
    @JsonSetter("meta")
    public void setMeta(ListMetadata meta) {
        this.meta = meta;
    }

    /**
     * Converts this BankAccountRequirementListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountRequirementListResult [" + "payload=" + payload + ", links=" + links
                + ", meta=" + meta + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BankAccountRequirementListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountRequirementListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payload(getPayload())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountRequirementListResult}.
     */
    public static class Builder {
        private List<BankAccountRequirement> payload;
        private List<HateoasSelfRef> links;
        private ListMetadata meta;



        /**
         * Setter for payload.
         * @param  payload  List of BankAccountRequirement value for payload.
         * @return Builder
         */
        public Builder payload(List<BankAccountRequirement> payload) {
            this.payload = payload;
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
         * @param  meta  ListMetadata value for meta.
         * @return Builder
         */
        public Builder meta(ListMetadata meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link BankAccountRequirementListResult} object using the set fields.
         * @return {@link BankAccountRequirementListResult}
         */
        public BankAccountRequirementListResult build() {
            return new BankAccountRequirementListResult(payload, links, meta);
        }
    }
}

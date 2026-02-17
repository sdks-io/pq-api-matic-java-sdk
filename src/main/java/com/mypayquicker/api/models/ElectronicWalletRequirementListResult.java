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
 * This is a model class for ElectronicWalletRequirementListResult type.
 */
public class ElectronicWalletRequirementListResult
        extends BaseModel {
    private List<ElectronicWalletRequirement> payload;
    private List<HateoasSelfRef> links;
    private ListMetadata meta;

    /**
     * Default constructor.
     */
    public ElectronicWalletRequirementListResult() {
    }

    /**
     * Initialization constructor.
     * @param  payload  List of ElectronicWalletRequirement value for payload.
     * @param  links  List of HateoasSelfRef value for links.
     * @param  meta  ListMetadata value for meta.
     */
    public ElectronicWalletRequirementListResult(
            List<ElectronicWalletRequirement> payload,
            List<HateoasSelfRef> links,
            ListMetadata meta) {
        this.payload = payload;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for Payload.
     * @return Returns the List of ElectronicWalletRequirement
     */
    @JsonGetter("payload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElectronicWalletRequirement> getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for List of ElectronicWalletRequirement
     */
    @JsonSetter("payload")
    public void setPayload(List<ElectronicWalletRequirement> payload) {
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
     * Converts this ElectronicWalletRequirementListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletRequirementListResult [" + "payload=" + payload + ", links=" + links
                + ", meta=" + meta + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletRequirementListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletRequirementListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payload(getPayload())
                .links(getLinks())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletRequirementListResult}.
     */
    public static class Builder {
        private List<ElectronicWalletRequirement> payload;
        private List<HateoasSelfRef> links;
        private ListMetadata meta;



        /**
         * Setter for payload.
         * @param  payload  List of ElectronicWalletRequirement value for payload.
         * @return Builder
         */
        public Builder payload(List<ElectronicWalletRequirement> payload) {
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
         * Builds a new {@link ElectronicWalletRequirementListResult} object using the set fields.
         * @return {@link ElectronicWalletRequirementListResult}
         */
        public ElectronicWalletRequirementListResult build() {
            return new ElectronicWalletRequirementListResult(payload, links, meta);
        }
    }
}

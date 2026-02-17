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
 * This is a model class for HateoasSelfRef type.
 */
public class HateoasSelfRef
        extends BaseModel {
    private String href;
    private HateoasRelationship params;

    /**
     * Default constructor.
     */
    public HateoasSelfRef() {
    }

    /**
     * Initialization constructor.
     * @param  href  String value for href.
     * @param  params  HateoasRelationship value for params.
     */
    public HateoasSelfRef(
            String href,
            HateoasRelationship params) {
        this.href = href;
        this.params = params;
    }

    /**
     * Getter for Href.
     * @return Returns the String
     */
    @JsonGetter("href")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Getter for Params.
     * Indicates the HATEOS relationship between the target and current resources.
     * @return Returns the HateoasRelationship
     */
    @JsonGetter("params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HateoasRelationship getParams() {
        return params;
    }

    /**
     * Setter for Params.
     * Indicates the HATEOS relationship between the target and current resources.
     * @param params Value for HateoasRelationship
     */
    @JsonSetter("params")
    public void setParams(HateoasRelationship params) {
        this.params = params;
    }

    /**
     * Converts this HateoasSelfRef into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HateoasSelfRef [" + "href=" + href + ", params=" + params
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link HateoasSelfRef.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HateoasSelfRef.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .href(getHref())
                .params(getParams());
        return builder;
    }

    /**
     * Class to build instances of {@link HateoasSelfRef}.
     */
    public static class Builder {
        private String href;
        private HateoasRelationship params;



        /**
         * Setter for href.
         * @param  href  String value for href.
         * @return Builder
         */
        public Builder href(String href) {
            this.href = href;
            return this;
        }

        /**
         * Setter for params.
         * @param  params  HateoasRelationship value for params.
         * @return Builder
         */
        public Builder params(HateoasRelationship params) {
            this.params = params;
            return this;
        }

        /**
         * Builds a new {@link HateoasSelfRef} object using the set fields.
         * @return {@link HateoasSelfRef}
         */
        public HateoasSelfRef build() {
            return new HateoasSelfRef(href, params);
        }
    }
}

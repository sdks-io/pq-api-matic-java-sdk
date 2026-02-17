/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for HateoasRelationship type.
 */
public class HateoasRelationship
        extends BaseModel {
    private String rel;

    /**
     * Default constructor.
     */
    public HateoasRelationship() {
        rel = "self";
    }

    /**
     * Initialization constructor.
     * @param  rel  String value for rel.
     */
    public HateoasRelationship(
            String rel) {
        this.rel = rel;
    }

    /**
     * Getter for Rel.
     * Indicates the relationship between the target and current resources.
     * @return Returns the String
     */
    @JsonGetter("rel")
    public String getRel() {
        return rel;
    }

    /**
     * Setter for Rel.
     * Indicates the relationship between the target and current resources.
     * @param rel Value for String
     */
    @JsonSetter("rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

    /**
     * Converts this HateoasRelationship into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HateoasRelationship [" + "rel=" + rel + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link HateoasRelationship.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HateoasRelationship.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(rel);
        return builder;
    }

    /**
     * Class to build instances of {@link HateoasRelationship}.
     */
    public static class Builder {
        private String rel = "self";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  rel  String value for rel.
         */
        public Builder(String rel) {
            this.rel = rel;
        }

        /**
         * Setter for rel.
         * @param  rel  String value for rel.
         * @return Builder
         */
        public Builder rel(String rel) {
            this.rel = rel;
            return this;
        }

        /**
         * Builds a new {@link HateoasRelationship} object using the set fields.
         * @return {@link HateoasRelationship}
         */
        public HateoasRelationship build() {
            return new HateoasRelationship(rel);
        }
    }
}

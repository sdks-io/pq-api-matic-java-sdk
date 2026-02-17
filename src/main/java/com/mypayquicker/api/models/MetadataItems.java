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
 * This is a model class for MetadataItems type.
 */
public class MetadataItems
        extends BaseModel {
    private String timezone;
    private String requestRef;

    /**
     * Default constructor.
     */
    public MetadataItems() {
    }

    /**
     * Initialization constructor.
     * @param  timezone  String value for timezone.
     * @param  requestRef  String value for requestRef.
     */
    public MetadataItems(
            String timezone,
            String requestRef) {
        this.timezone = timezone;
        this.requestRef = requestRef;
    }

    /**
     * Getter for Timezone.
     * Timezone of the datetime objects in the response
     * @return Returns the String
     */
    @JsonGetter("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Setter for Timezone.
     * Timezone of the datetime objects in the response
     * @param timezone Value for String
     */
    @JsonSetter("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Getter for RequestRef.
     * @return Returns the String
     */
    @JsonGetter("requestRef")
    public String getRequestRef() {
        return requestRef;
    }

    /**
     * Setter for RequestRef.
     * @param requestRef Value for String
     */
    @JsonSetter("requestRef")
    public void setRequestRef(String requestRef) {
        this.requestRef = requestRef;
    }

    /**
     * Converts this MetadataItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MetadataItems [" + "timezone=" + timezone + ", requestRef=" + requestRef
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link MetadataItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MetadataItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(timezone, requestRef);
        return builder;
    }

    /**
     * Class to build instances of {@link MetadataItems}.
     */
    public static class Builder {
        private String timezone;
        private String requestRef;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  timezone  String value for timezone.
         * @param  requestRef  String value for requestRef.
         */
        public Builder(String timezone, String requestRef) {
            this.timezone = timezone;
            this.requestRef = requestRef;
        }

        /**
         * Setter for timezone.
         * @param  timezone  String value for timezone.
         * @return Builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Setter for requestRef.
         * @param  requestRef  String value for requestRef.
         * @return Builder
         */
        public Builder requestRef(String requestRef) {
            this.requestRef = requestRef;
            return this;
        }

        /**
         * Builds a new {@link MetadataItems} object using the set fields.
         * @return {@link MetadataItems}
         */
        public MetadataItems build() {
            return new MetadataItems(timezone, requestRef);
        }
    }
}

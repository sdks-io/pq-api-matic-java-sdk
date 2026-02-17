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

/**
 * This is a model class for DeliveryDetails type.
 */
public class DeliveryDetails
        extends BaseModel {
    private Integer minimumDeliveryMinutes;
    private Integer maximumDeliveryMinutes;
    private ExpectedDeliveryTypes expectedDelivery;
    private LocalDateTime expectedDeliveryTime;

    /**
     * Default constructor.
     */
    public DeliveryDetails() {
    }

    /**
     * Initialization constructor.
     * @param  minimumDeliveryMinutes  Integer value for minimumDeliveryMinutes.
     * @param  maximumDeliveryMinutes  Integer value for maximumDeliveryMinutes.
     * @param  expectedDelivery  ExpectedDeliveryTypes value for expectedDelivery.
     * @param  expectedDeliveryTime  LocalDateTime value for expectedDeliveryTime.
     */
    public DeliveryDetails(
            Integer minimumDeliveryMinutes,
            Integer maximumDeliveryMinutes,
            ExpectedDeliveryTypes expectedDelivery,
            LocalDateTime expectedDeliveryTime) {
        this.minimumDeliveryMinutes = minimumDeliveryMinutes;
        this.maximumDeliveryMinutes = maximumDeliveryMinutes;
        this.expectedDelivery = expectedDelivery;
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    /**
     * Getter for MinimumDeliveryMinutes.
     * @return Returns the Integer
     */
    @JsonGetter("minimumDeliveryMinutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinimumDeliveryMinutes() {
        return minimumDeliveryMinutes;
    }

    /**
     * Setter for MinimumDeliveryMinutes.
     * @param minimumDeliveryMinutes Value for Integer
     */
    @JsonSetter("minimumDeliveryMinutes")
    public void setMinimumDeliveryMinutes(Integer minimumDeliveryMinutes) {
        this.minimumDeliveryMinutes = minimumDeliveryMinutes;
    }

    /**
     * Getter for MaximumDeliveryMinutes.
     * @return Returns the Integer
     */
    @JsonGetter("maximumDeliveryMinutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMaximumDeliveryMinutes() {
        return maximumDeliveryMinutes;
    }

    /**
     * Setter for MaximumDeliveryMinutes.
     * @param maximumDeliveryMinutes Value for Integer
     */
    @JsonSetter("maximumDeliveryMinutes")
    public void setMaximumDeliveryMinutes(Integer maximumDeliveryMinutes) {
        this.maximumDeliveryMinutes = maximumDeliveryMinutes;
    }

    /**
     * Getter for ExpectedDelivery.
     * Transfer expected delivery types
     * @return Returns the ExpectedDeliveryTypes
     */
    @JsonGetter("expectedDelivery")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExpectedDeliveryTypes getExpectedDelivery() {
        return expectedDelivery;
    }

    /**
     * Setter for ExpectedDelivery.
     * Transfer expected delivery types
     * @param expectedDelivery Value for ExpectedDeliveryTypes
     */
    @JsonSetter("expectedDelivery")
    public void setExpectedDelivery(ExpectedDeliveryTypes expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    /**
     * Getter for ExpectedDeliveryTime.
     * The time of the expected delivery. Does not include the date.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expectedDeliveryTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    /**
     * Setter for ExpectedDeliveryTime.
     * The time of the expected delivery. Does not include the date.
     * @param expectedDeliveryTime Value for LocalDateTime
     */
    @JsonSetter("expectedDeliveryTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpectedDeliveryTime(LocalDateTime expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    /**
     * Converts this DeliveryDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeliveryDetails [" + "minimumDeliveryMinutes=" + minimumDeliveryMinutes
                + ", maximumDeliveryMinutes=" + maximumDeliveryMinutes + ", expectedDelivery="
                + expectedDelivery + ", expectedDeliveryTime=" + expectedDeliveryTime
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DeliveryDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeliveryDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .minimumDeliveryMinutes(getMinimumDeliveryMinutes())
                .maximumDeliveryMinutes(getMaximumDeliveryMinutes())
                .expectedDelivery(getExpectedDelivery())
                .expectedDeliveryTime(getExpectedDeliveryTime());
        return builder;
    }

    /**
     * Class to build instances of {@link DeliveryDetails}.
     */
    public static class Builder {
        private Integer minimumDeliveryMinutes;
        private Integer maximumDeliveryMinutes;
        private ExpectedDeliveryTypes expectedDelivery;
        private LocalDateTime expectedDeliveryTime;



        /**
         * Setter for minimumDeliveryMinutes.
         * @param  minimumDeliveryMinutes  Integer value for minimumDeliveryMinutes.
         * @return Builder
         */
        public Builder minimumDeliveryMinutes(Integer minimumDeliveryMinutes) {
            this.minimumDeliveryMinutes = minimumDeliveryMinutes;
            return this;
        }

        /**
         * Setter for maximumDeliveryMinutes.
         * @param  maximumDeliveryMinutes  Integer value for maximumDeliveryMinutes.
         * @return Builder
         */
        public Builder maximumDeliveryMinutes(Integer maximumDeliveryMinutes) {
            this.maximumDeliveryMinutes = maximumDeliveryMinutes;
            return this;
        }

        /**
         * Setter for expectedDelivery.
         * @param  expectedDelivery  ExpectedDeliveryTypes value for expectedDelivery.
         * @return Builder
         */
        public Builder expectedDelivery(ExpectedDeliveryTypes expectedDelivery) {
            this.expectedDelivery = expectedDelivery;
            return this;
        }

        /**
         * Setter for expectedDeliveryTime.
         * @param  expectedDeliveryTime  LocalDateTime value for expectedDeliveryTime.
         * @return Builder
         */
        public Builder expectedDeliveryTime(LocalDateTime expectedDeliveryTime) {
            this.expectedDeliveryTime = expectedDeliveryTime;
            return this;
        }

        /**
         * Builds a new {@link DeliveryDetails} object using the set fields.
         * @return {@link DeliveryDetails}
         */
        public DeliveryDetails build() {
            return new DeliveryDetails(minimumDeliveryMinutes, maximumDeliveryMinutes,
                    expectedDelivery, expectedDeliveryTime);
        }
    }
}

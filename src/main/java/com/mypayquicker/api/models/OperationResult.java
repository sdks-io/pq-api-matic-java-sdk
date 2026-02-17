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
 * This is a model class for OperationResult type.
 */
public class OperationResult
        extends BaseModel {
    private Boolean result;

    /**
     * Default constructor.
     */
    public OperationResult() {
    }

    /**
     * Initialization constructor.
     * @param  result  Boolean value for result.
     */
    public OperationResult(
            Boolean result) {
        this.result = result;
    }

    /**
     * Getter for Result.
     * The result of the api operation
     * @return Returns the Boolean
     */
    @JsonGetter("result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getResult() {
        return result;
    }

    /**
     * Setter for Result.
     * The result of the api operation
     * @param result Value for Boolean
     */
    @JsonSetter("result")
    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * Converts this OperationResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OperationResult [" + "result=" + result + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OperationResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OperationResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .result(getResult());
        return builder;
    }

    /**
     * Class to build instances of {@link OperationResult}.
     */
    public static class Builder {
        private Boolean result;



        /**
         * Setter for result.
         * @param  result  Boolean value for result.
         * @return Builder
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * Builds a new {@link OperationResult} object using the set fields.
         * @return {@link OperationResult}
         */
        public OperationResult build() {
            return new OperationResult(result);
        }
    }
}

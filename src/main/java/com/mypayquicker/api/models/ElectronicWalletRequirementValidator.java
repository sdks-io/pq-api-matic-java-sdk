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
 * This is a model class for ElectronicWalletRequirementValidator type.
 */
public class ElectronicWalletRequirementValidator
        extends BaseModel {
    private ValidatorTypes validatorType;
    private String expression;

    /**
     * Default constructor.
     */
    public ElectronicWalletRequirementValidator() {
    }

    /**
     * Initialization constructor.
     * @param  expression  String value for expression.
     * @param  validatorType  ValidatorTypes value for validatorType.
     */
    public ElectronicWalletRequirementValidator(
            String expression,
            ValidatorTypes validatorType) {
        this.validatorType = validatorType;
        this.expression = expression;
    }

    /**
     * Getter for ValidatorType.
     * [Validator types](#/rest/models/structures/bank-account-requirement-validator) for the
     * required bank account information.
     * @return Returns the ValidatorTypes
     */
    @JsonGetter("validatorType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ValidatorTypes getValidatorType() {
        return validatorType;
    }

    /**
     * Setter for ValidatorType.
     * [Validator types](#/rest/models/structures/bank-account-requirement-validator) for the
     * required bank account information.
     * @param validatorType Value for ValidatorTypes
     */
    @JsonSetter("validatorType")
    public void setValidatorType(ValidatorTypes validatorType) {
        this.validatorType = validatorType;
    }

    /**
     * Getter for Expression.
     * Validation regular expression
     * @return Returns the String
     */
    @JsonGetter("expression")
    public String getExpression() {
        return expression;
    }

    /**
     * Setter for Expression.
     * Validation regular expression
     * @param expression Value for String
     */
    @JsonSetter("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Converts this ElectronicWalletRequirementValidator into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletRequirementValidator [" + "expression=" + expression
                + ", validatorType=" + validatorType + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletRequirementValidator.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletRequirementValidator.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(expression)
                .validatorType(getValidatorType());
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletRequirementValidator}.
     */
    public static class Builder {
        private String expression;
        private ValidatorTypes validatorType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  expression  String value for expression.
         */
        public Builder(String expression) {
            this.expression = expression;
        }

        /**
         * Setter for expression.
         * @param  expression  String value for expression.
         * @return Builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Setter for validatorType.
         * @param  validatorType  ValidatorTypes value for validatorType.
         * @return Builder
         */
        public Builder validatorType(ValidatorTypes validatorType) {
            this.validatorType = validatorType;
            return this;
        }

        /**
         * Builds a new {@link ElectronicWalletRequirementValidator} object using the set fields.
         * @return {@link ElectronicWalletRequirementValidator}
         */
        public ElectronicWalletRequirementValidator build() {
            return new ElectronicWalletRequirementValidator(expression, validatorType);
        }
    }
}

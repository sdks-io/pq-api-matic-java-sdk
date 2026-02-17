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
 * This is a model class for BankAccountRequiredFields type.
 */
public class BankAccountRequiredFields
        extends BaseModel {
    private BankAccountRequirementFormat format;
    private BankAccountFields requirement;
    private List<Translation> description;
    private List<BankAccountRequirementValidator> validators;

    /**
     * Default constructor.
     */
    public BankAccountRequiredFields() {
    }

    /**
     * Initialization constructor.
     * @param  format  BankAccountRequirementFormat value for format.
     * @param  requirement  BankAccountFields value for requirement.
     * @param  description  List of Translation value for description.
     * @param  validators  List of BankAccountRequirementValidator value for validators.
     */
    public BankAccountRequiredFields(
            BankAccountRequirementFormat format,
            BankAccountFields requirement,
            List<Translation> description,
            List<BankAccountRequirementValidator> validators) {
        this.format = format;
        this.requirement = requirement;
        this.description = description;
        this.validators = validators;
    }

    /**
     * Getter for Format.
     * Classifies the [format](#/rest/models/structures/bank-account-requirement-format) of the
     * required information for a bank account
     * @return Returns the BankAccountRequirementFormat
     */
    @JsonGetter("format")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountRequirementFormat getFormat() {
        return format;
    }

    /**
     * Setter for Format.
     * Classifies the [format](#/rest/models/structures/bank-account-requirement-format) of the
     * required information for a bank account
     * @param format Value for BankAccountRequirementFormat
     */
    @JsonSetter("format")
    public void setFormat(BankAccountRequirementFormat format) {
        this.format = format;
    }

    /**
     * Getter for Requirement.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @return Returns the BankAccountFields
     */
    @JsonGetter("requirement")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountFields getRequirement() {
        return requirement;
    }

    /**
     * Setter for Requirement.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @param requirement Value for BankAccountFields
     */
    @JsonSetter("requirement")
    public void setRequirement(BankAccountFields requirement) {
        this.requirement = requirement;
    }

    /**
     * Getter for Description.
     * Localized requirement description for display purposes
     * @return Returns the List of Translation
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Translation> getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Localized requirement description for display purposes
     * @param description Value for List of Translation
     */
    @JsonSetter("description")
    public void setDescription(List<Translation> description) {
        this.description = description;
    }

    /**
     * Getter for Validators.
     * @return Returns the List of BankAccountRequirementValidator
     */
    @JsonGetter("validators")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BankAccountRequirementValidator> getValidators() {
        return validators;
    }

    /**
     * Setter for Validators.
     * @param validators Value for List of BankAccountRequirementValidator
     */
    @JsonSetter("validators")
    public void setValidators(List<BankAccountRequirementValidator> validators) {
        this.validators = validators;
    }

    /**
     * Converts this BankAccountRequiredFields into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountRequiredFields [" + "format=" + format + ", requirement=" + requirement
                + ", description=" + description + ", validators=" + validators
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BankAccountRequiredFields.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountRequiredFields.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .format(getFormat())
                .requirement(getRequirement())
                .description(getDescription())
                .validators(getValidators());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountRequiredFields}.
     */
    public static class Builder {
        private BankAccountRequirementFormat format;
        private BankAccountFields requirement;
        private List<Translation> description;
        private List<BankAccountRequirementValidator> validators;



        /**
         * Setter for format.
         * @param  format  BankAccountRequirementFormat value for format.
         * @return Builder
         */
        public Builder format(BankAccountRequirementFormat format) {
            this.format = format;
            return this;
        }

        /**
         * Setter for requirement.
         * @param  requirement  BankAccountFields value for requirement.
         * @return Builder
         */
        public Builder requirement(BankAccountFields requirement) {
            this.requirement = requirement;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  List of Translation value for description.
         * @return Builder
         */
        public Builder description(List<Translation> description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for validators.
         * @param  validators  List of BankAccountRequirementValidator value for validators.
         * @return Builder
         */
        public Builder validators(List<BankAccountRequirementValidator> validators) {
            this.validators = validators;
            return this;
        }

        /**
         * Builds a new {@link BankAccountRequiredFields} object using the set fields.
         * @return {@link BankAccountRequiredFields}
         */
        public BankAccountRequiredFields build() {
            return new BankAccountRequiredFields(format, requirement, description, validators);
        }
    }
}

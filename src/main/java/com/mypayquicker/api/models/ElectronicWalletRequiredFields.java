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
 * This is a model class for ElectronicWalletRequiredFields type.
 */
public class ElectronicWalletRequiredFields
        extends BaseModel {
    private ElectronicWalletRequirementFormat format;
    private ElectronicWalletFields requirement;
    private List<Translation> description;
    private List<ElectronicWalletRequirementValidator> validators;

    /**
     * Default constructor.
     */
    public ElectronicWalletRequiredFields() {
    }

    /**
     * Initialization constructor.
     * @param  format  ElectronicWalletRequirementFormat value for format.
     * @param  requirement  ElectronicWalletFields value for requirement.
     * @param  description  List of Translation value for description.
     * @param  validators  List of ElectronicWalletRequirementValidator value for validators.
     */
    public ElectronicWalletRequiredFields(
            ElectronicWalletRequirementFormat format,
            ElectronicWalletFields requirement,
            List<Translation> description,
            List<ElectronicWalletRequirementValidator> validators) {
        this.format = format;
        this.requirement = requirement;
        this.description = description;
        this.validators = validators;
    }

    /**
     * Getter for Format.
     * Classifies the [format](#/rest/models/structures/electronic-wallet-requirement-format) of the
     * required information for an electronic wallet
     * @return Returns the ElectronicWalletRequirementFormat
     */
    @JsonGetter("format")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletRequirementFormat getFormat() {
        return format;
    }

    /**
     * Setter for Format.
     * Classifies the [format](#/rest/models/structures/electronic-wallet-requirement-format) of the
     * required information for an electronic wallet
     * @param format Value for ElectronicWalletRequirementFormat
     */
    @JsonSetter("format")
    public void setFormat(ElectronicWalletRequirementFormat format) {
        this.format = format;
    }

    /**
     * Getter for Requirement.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @return Returns the ElectronicWalletFields
     */
    @JsonGetter("requirement")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletFields getRequirement() {
        return requirement;
    }

    /**
     * Setter for Requirement.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @param requirement Value for ElectronicWalletFields
     */
    @JsonSetter("requirement")
    public void setRequirement(ElectronicWalletFields requirement) {
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
     * @return Returns the List of ElectronicWalletRequirementValidator
     */
    @JsonGetter("validators")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElectronicWalletRequirementValidator> getValidators() {
        return validators;
    }

    /**
     * Setter for Validators.
     * @param validators Value for List of ElectronicWalletRequirementValidator
     */
    @JsonSetter("validators")
    public void setValidators(List<ElectronicWalletRequirementValidator> validators) {
        this.validators = validators;
    }

    /**
     * Converts this ElectronicWalletRequiredFields into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletRequiredFields [" + "format=" + format + ", requirement="
                + requirement + ", description=" + description + ", validators=" + validators
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletRequiredFields.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletRequiredFields.Builder} object
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
     * Class to build instances of {@link ElectronicWalletRequiredFields}.
     */
    public static class Builder {
        private ElectronicWalletRequirementFormat format;
        private ElectronicWalletFields requirement;
        private List<Translation> description;
        private List<ElectronicWalletRequirementValidator> validators;



        /**
         * Setter for format.
         * @param  format  ElectronicWalletRequirementFormat value for format.
         * @return Builder
         */
        public Builder format(ElectronicWalletRequirementFormat format) {
            this.format = format;
            return this;
        }

        /**
         * Setter for requirement.
         * @param  requirement  ElectronicWalletFields value for requirement.
         * @return Builder
         */
        public Builder requirement(ElectronicWalletFields requirement) {
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
         * @param  validators  List of ElectronicWalletRequirementValidator value for validators.
         * @return Builder
         */
        public Builder validators(List<ElectronicWalletRequirementValidator> validators) {
            this.validators = validators;
            return this;
        }

        /**
         * Builds a new {@link ElectronicWalletRequiredFields} object using the set fields.
         * @return {@link ElectronicWalletRequiredFields}
         */
        public ElectronicWalletRequiredFields build() {
            return new ElectronicWalletRequiredFields(format, requirement, description, validators);
        }
    }
}

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
 * This is a model class for ElectronicWalletRequirementFormat type.
 */
public class ElectronicWalletRequirementFormat
        extends BaseModel {
    private String example;
    private List<ElectronicWalletRequirementFormatLegend> legend;

    /**
     * Default constructor.
     */
    public ElectronicWalletRequirementFormat() {
    }

    /**
     * Initialization constructor.
     * @param  example  String value for example.
     * @param  legend  List of ElectronicWalletRequirementFormatLegend value for legend.
     */
    public ElectronicWalletRequirementFormat(
            String example,
            List<ElectronicWalletRequirementFormatLegend> legend) {
        this.example = example;
        this.legend = legend;
    }

    /**
     * Getter for Example.
     * Example of a requirement generated from the validator(s)
     * @return Returns the String
     */
    @JsonGetter("example")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExample() {
        return example;
    }

    /**
     * Setter for Example.
     * Example of a requirement generated from the validator(s)
     * @param example Value for String
     */
    @JsonSetter("example")
    public void setExample(String example) {
        this.example = example;
    }

    /**
     * Getter for Legend.
     * @return Returns the List of ElectronicWalletRequirementFormatLegend
     */
    @JsonGetter("legend")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElectronicWalletRequirementFormatLegend> getLegend() {
        return legend;
    }

    /**
     * Setter for Legend.
     * @param legend Value for List of ElectronicWalletRequirementFormatLegend
     */
    @JsonSetter("legend")
    public void setLegend(List<ElectronicWalletRequirementFormatLegend> legend) {
        this.legend = legend;
    }

    /**
     * Converts this ElectronicWalletRequirementFormat into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElectronicWalletRequirementFormat [" + "example=" + example + ", legend=" + legend
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ElectronicWalletRequirementFormat.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElectronicWalletRequirementFormat.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .example(getExample())
                .legend(getLegend());
        return builder;
    }

    /**
     * Class to build instances of {@link ElectronicWalletRequirementFormat}.
     */
    public static class Builder {
        private String example;
        private List<ElectronicWalletRequirementFormatLegend> legend;



        /**
         * Setter for example.
         * @param  example  String value for example.
         * @return Builder
         */
        public Builder example(String example) {
            this.example = example;
            return this;
        }

        /**
         * Setter for legend.
         * @param  legend  List of ElectronicWalletRequirementFormatLegend value for legend.
         * @return Builder
         */
        public Builder legend(List<ElectronicWalletRequirementFormatLegend> legend) {
            this.legend = legend;
            return this;
        }

        /**
         * Builds a new {@link ElectronicWalletRequirementFormat} object using the set fields.
         * @return {@link ElectronicWalletRequirementFormat}
         */
        public ElectronicWalletRequirementFormat build() {
            return new ElectronicWalletRequirementFormat(example, legend);
        }
    }
}

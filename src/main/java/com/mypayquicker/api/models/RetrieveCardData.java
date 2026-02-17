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
 * This is a model class for RetrieveCardData type.
 */
public class RetrieveCardData
        extends BaseModel {
    private String token;

    /**
     * Default constructor.
     */
    public RetrieveCardData() {
    }

    /**
     * Initialization constructor.
     * @param  token  String value for token.
     */
    public RetrieveCardData(
            String token) {
        this.token = token;
    }

    /**
     * Getter for Token.
     * A token used to reveal prepaid card information in the form of image data (base64) or JSON.
     * @return Returns the String
     */
    @JsonGetter("Token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * A token used to reveal prepaid card information in the form of image data (base64) or JSON.
     * @param token Value for String
     */
    @JsonSetter("Token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Converts this RetrieveCardData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrieveCardData [" + "token=" + token + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RetrieveCardData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveCardData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveCardData}.
     */
    public static class Builder {
        private String token;



        /**
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link RetrieveCardData} object using the set fields.
         * @return {@link RetrieveCardData}
         */
        public RetrieveCardData build() {
            return new RetrieveCardData(token);
        }
    }
}

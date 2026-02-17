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
 * This is a model class for BankAccountAddress type.
 */
public class BankAccountAddress
        extends BaseModel {
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String region;
    private String postalCode;
    private Countries country;

    /**
     * Default constructor.
     */
    public BankAccountAddress() {
    }

    /**
     * Initialization constructor.
     * @param  address1  String value for address1.
     * @param  city  String value for city.
     * @param  postalCode  String value for postalCode.
     * @param  country  Countries value for country.
     * @param  address2  String value for address2.
     * @param  address3  String value for address3.
     * @param  region  String value for region.
     */
    public BankAccountAddress(
            String address1,
            String city,
            String postalCode,
            Countries country,
            String address2,
            String address3,
            String region) {
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
    }

    /**
     * Getter for Address1.
     * Address Line 1
     * @return Returns the String
     */
    @JsonGetter("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * Setter for Address1.
     * Address Line 1
     * @param address1 Value for String
     */
    @JsonSetter("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * Getter for Address2.
     * @return Returns the String
     */
    @JsonGetter("address2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter for Address2.
     * @param address2 Value for String
     */
    @JsonSetter("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Getter for Address3.
     * @return Returns the String
     */
    @JsonGetter("address3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress3() {
        return address3;
    }

    /**
     * Setter for Address3.
     * @param address3 Value for String
     */
    @JsonSetter("address3")
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Region.
     * @return Returns the String
     */
    @JsonGetter("region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Setter for Region.
     * @param region Value for String
     */
    @JsonSetter("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for PostalCode.
     * @return Returns the String
     */
    @JsonGetter("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter for PostalCode.
     * @param postalCode Value for String
     */
    @JsonSetter("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for Country.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("country")
    public Countries getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param country Value for Countries
     */
    @JsonSetter("country")
    public void setCountry(Countries country) {
        this.country = country;
    }

    /**
     * Converts this BankAccountAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountAddress [" + "address1=" + address1 + ", city=" + city + ", postalCode="
                + postalCode + ", country=" + country + ", address2=" + address2 + ", address3="
                + address3 + ", region=" + region + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BankAccountAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(address1, city, postalCode, country)
                .address2(getAddress2())
                .address3(getAddress3())
                .region(getRegion());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountAddress}.
     */
    public static class Builder {
        private String address1;
        private String city;
        private String postalCode;
        private Countries country;
        private String address2;
        private String address3;
        private String region;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  address1  String value for address1.
         * @param  city  String value for city.
         * @param  postalCode  String value for postalCode.
         * @param  country  Countries value for country.
         */
        public Builder(String address1, String city, String postalCode, Countries country) {
            this.address1 = address1;
            this.city = city;
            this.postalCode = postalCode;
            this.country = country;
        }

        /**
         * Setter for address1.
         * @param  address1  String value for address1.
         * @return Builder
         */
        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for postalCode.
         * @param  postalCode  String value for postalCode.
         * @return Builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  Countries value for country.
         * @return Builder
         */
        public Builder country(Countries country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for address2.
         * @param  address2  String value for address2.
         * @return Builder
         */
        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        /**
         * Setter for address3.
         * @param  address3  String value for address3.
         * @return Builder
         */
        public Builder address3(String address3) {
            this.address3 = address3;
            return this;
        }

        /**
         * Setter for region.
         * @param  region  String value for region.
         * @return Builder
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Builds a new {@link BankAccountAddress} object using the set fields.
         * @return {@link BankAccountAddress}
         */
        public BankAccountAddress build() {
            return new BankAccountAddress(address1, city, postalCode, country, address2, address3,
                    region);
        }
    }
}

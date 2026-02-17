/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * GovernmentIds to be used.
 */
public enum GovernmentIds {
    /**
     * Identity code for both citizens and residents of Mexico.
     */
    CURP,

    /**
     * Identity card with a photo issued by an official authority.
     */
    NATIONAL_ID_CARD,

    /**
     * Travel document that certifies the identity and nationality of its holder.
     */
    PASSPORT,

    /**
     * Social Security number for citizens of the United States.
     */
    SSN;


    private static TreeMap<String, GovernmentIds> valueMap = new TreeMap<>();
    private String value;

    static {
        CURP.value = "CURP";
        NATIONAL_ID_CARD.value = "NATIONAL_ID_CARD";
        PASSPORT.value = "PASSPORT";
        SSN.value = "SSN";

        valueMap.put("CURP", CURP);
        valueMap.put("NATIONAL_ID_CARD", NATIONAL_ID_CARD);
        valueMap.put("PASSPORT", PASSPORT);
        valueMap.put("SSN", SSN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static GovernmentIds constructFromString(String toConvert) throws IOException {
        GovernmentIds enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static GovernmentIds fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of GovernmentIds values to list of string values.
     * @param toConvert The list of GovernmentIds values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GovernmentIds> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GovernmentIds enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
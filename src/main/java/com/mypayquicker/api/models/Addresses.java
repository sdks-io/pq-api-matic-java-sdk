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
 * Addresses to be used.
 */
public enum Addresses {
    /**
     * Business Address
     */
    BUSINESS,

    /**
     * Mailing Address
     */
    MAILING,

    /**
     * Residential Address
     */
    RESIDENTAL,

    /**
     * Unknown or undefined address type
     */
    UNDEFINED;


    private static TreeMap<String, Addresses> valueMap = new TreeMap<>();
    private String value;

    static {
        BUSINESS.value = "BUSINESS";
        MAILING.value = "MAILING";
        RESIDENTAL.value = "RESIDENTIAL";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("BUSINESS", BUSINESS);
        valueMap.put("MAILING", MAILING);
        valueMap.put("RESIDENTIAL", RESIDENTAL);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Addresses constructFromString(String toConvert) throws IOException {
        Addresses enumValue = fromString(toConvert);
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
    public static Addresses fromString(String toConvert) {
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
     * Convert list of Addresses values to list of string values.
     * @param toConvert The list of Addresses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Addresses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Addresses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
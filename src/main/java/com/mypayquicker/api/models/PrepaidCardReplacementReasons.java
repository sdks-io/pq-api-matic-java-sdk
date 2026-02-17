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
 * PrepaidCardReplacementReasons to be used.
 */
public enum PrepaidCardReplacementReasons {
    COMPROMISED,

    DAMAGED,

    EXPIRED,

    LOST,

    STOLEN;


    private static TreeMap<String, PrepaidCardReplacementReasons> valueMap = new TreeMap<>();
    private String value;

    static {
        COMPROMISED.value = "COMPROMISED";
        DAMAGED.value = "DAMAGED";
        EXPIRED.value = "EXPIRED";
        LOST.value = "LOST";
        STOLEN.value = "STOLEN";

        valueMap.put("COMPROMISED", COMPROMISED);
        valueMap.put("DAMAGED", DAMAGED);
        valueMap.put("EXPIRED", EXPIRED);
        valueMap.put("LOST", LOST);
        valueMap.put("STOLEN", STOLEN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PrepaidCardReplacementReasons constructFromString(String toConvert) throws IOException {
        PrepaidCardReplacementReasons enumValue = fromString(toConvert);
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
    public static PrepaidCardReplacementReasons fromString(String toConvert) {
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
     * Convert list of PrepaidCardReplacementReasons values to list of string values.
     * @param toConvert The list of PrepaidCardReplacementReasons values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PrepaidCardReplacementReasons> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PrepaidCardReplacementReasons enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
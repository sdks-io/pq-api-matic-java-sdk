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
 * ExpectedDeliveryTypes to be used.
 */
public enum ExpectedDeliveryTypes {
    SAME_DAY,

    NEXT_BANKING_DAY;


    private static TreeMap<String, ExpectedDeliveryTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        SAME_DAY.value = "SAME_DAY";
        NEXT_BANKING_DAY.value = "NEXT_BANKING_DAY";

        valueMap.put("SAME_DAY", SAME_DAY);
        valueMap.put("NEXT_BANKING_DAY", NEXT_BANKING_DAY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ExpectedDeliveryTypes constructFromString(String toConvert) throws IOException {
        ExpectedDeliveryTypes enumValue = fromString(toConvert);
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
    public static ExpectedDeliveryTypes fromString(String toConvert) {
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
     * Convert list of ExpectedDeliveryTypes values to list of string values.
     * @param toConvert The list of ExpectedDeliveryTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ExpectedDeliveryTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ExpectedDeliveryTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
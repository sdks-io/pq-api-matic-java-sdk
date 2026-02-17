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
 * TaxResidentStatuses to be used.
 */
public enum TaxResidentStatuses {
    NO,

    YES,

    UNDEFINED;


    private static TreeMap<String, TaxResidentStatuses> valueMap = new TreeMap<>();
    private String value;

    static {
        NO.value = "NO";
        YES.value = "YES";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("NO", NO);
        valueMap.put("YES", YES);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TaxResidentStatuses constructFromString(String toConvert) throws IOException {
        TaxResidentStatuses enumValue = fromString(toConvert);
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
    public static TaxResidentStatuses fromString(String toConvert) {
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
     * Convert list of TaxResidentStatuses values to list of string values.
     * @param toConvert The list of TaxResidentStatuses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TaxResidentStatuses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TaxResidentStatuses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
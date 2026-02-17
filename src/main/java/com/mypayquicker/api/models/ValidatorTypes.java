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
 * ValidatorTypes to be used.
 */
public enum ValidatorTypes {
    LENGTH,

    REGEX,

    RANGE,

    REQUIRED,

    UNDEFINED;


    private static TreeMap<String, ValidatorTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        LENGTH.value = "LENGTH";
        REGEX.value = "REGEX";
        RANGE.value = "RANGE";
        REQUIRED.value = "REQUIRED";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("LENGTH", LENGTH);
        valueMap.put("REGEX", REGEX);
        valueMap.put("RANGE", RANGE);
        valueMap.put("REQUIRED", REQUIRED);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ValidatorTypes constructFromString(String toConvert) throws IOException {
        ValidatorTypes enumValue = fromString(toConvert);
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
    public static ValidatorTypes fromString(String toConvert) {
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
     * Convert list of ValidatorTypes values to list of string values.
     * @param toConvert The list of ValidatorTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ValidatorTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ValidatorTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
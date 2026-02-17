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
 * PrepaidCardDataType to be used.
 */
public enum PrepaidCardDataType {
    TEXT,

    IMAGE;


    private static TreeMap<String, PrepaidCardDataType> valueMap = new TreeMap<>();
    private String value;

    static {
        TEXT.value = "TEXT";
        IMAGE.value = "IMAGE";

        valueMap.put("TEXT", TEXT);
        valueMap.put("IMAGE", IMAGE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PrepaidCardDataType constructFromString(String toConvert) throws IOException {
        PrepaidCardDataType enumValue = fromString(toConvert);
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
    public static PrepaidCardDataType fromString(String toConvert) {
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
     * Convert list of PrepaidCardDataType values to list of string values.
     * @param toConvert The list of PrepaidCardDataType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PrepaidCardDataType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PrepaidCardDataType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
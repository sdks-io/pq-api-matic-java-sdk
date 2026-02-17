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
 * TokenPurposes to be used.
 */
public enum TokenPurposes {
    CARD_OPERATION,

    PIN_OPERATION;


    private static TreeMap<String, TokenPurposes> valueMap = new TreeMap<>();
    private String value;

    static {
        CARD_OPERATION.value = "CARD_OPERATION";
        PIN_OPERATION.value = "PIN_OPERATION";

        valueMap.put("CARD_OPERATION", CARD_OPERATION);
        valueMap.put("PIN_OPERATION", PIN_OPERATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TokenPurposes constructFromString(String toConvert) throws IOException {
        TokenPurposes enumValue = fromString(toConvert);
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
    public static TokenPurposes fromString(String toConvert) {
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
     * Convert list of TokenPurposes values to list of string values.
     * @param toConvert The list of TokenPurposes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TokenPurposes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TokenPurposes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
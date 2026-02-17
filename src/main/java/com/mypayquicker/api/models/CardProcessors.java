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
 * CardProcessors to be used.
 */
public enum CardProcessors {
    FIS,

    FLEX,

    EPS,

    TOKA,

    QOLO,

    UNDEFINED;


    private static TreeMap<String, CardProcessors> valueMap = new TreeMap<>();
    private String value;

    static {
        FIS.value = "FIS";
        FLEX.value = "FLEX";
        EPS.value = "EPS";
        TOKA.value = "TOKA";
        QOLO.value = "QOLO";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("FIS", FIS);
        valueMap.put("FLEX", FLEX);
        valueMap.put("EPS", EPS);
        valueMap.put("TOKA", TOKA);
        valueMap.put("QOLO", QOLO);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardProcessors constructFromString(String toConvert) throws IOException {
        CardProcessors enumValue = fromString(toConvert);
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
    public static CardProcessors fromString(String toConvert) {
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
     * Convert list of CardProcessors values to list of string values.
     * @param toConvert The list of CardProcessors values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CardProcessors> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CardProcessors enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
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
 * TransferMethodTypes to be used.
 */
public enum TransferMethodTypes {
    IACH,

    WIRE,

    US_SAMEDAY_IACH,

    STANDARD_EWALLET,

    STANDARD_POST;


    private static TreeMap<String, TransferMethodTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        IACH.value = "IACH";
        WIRE.value = "WIRE";
        US_SAMEDAY_IACH.value = "US_SAMEDAY_IACH";
        STANDARD_EWALLET.value = "STANDARD_EWALLET";
        STANDARD_POST.value = "STANDARD_POST";

        valueMap.put("IACH", IACH);
        valueMap.put("WIRE", WIRE);
        valueMap.put("US_SAMEDAY_IACH", US_SAMEDAY_IACH);
        valueMap.put("STANDARD_EWALLET", STANDARD_EWALLET);
        valueMap.put("STANDARD_POST", STANDARD_POST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransferMethodTypes constructFromString(String toConvert) throws IOException {
        TransferMethodTypes enumValue = fromString(toConvert);
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
    public static TransferMethodTypes fromString(String toConvert) {
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
     * Convert list of TransferMethodTypes values to list of string values.
     * @param toConvert The list of TransferMethodTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransferMethodTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransferMethodTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
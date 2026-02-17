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
 * UatInstance to be used.
 */
public enum UatInstance {
    UAT1,

    UAT2,

    UAT3,

    UAT4,

    UAT5;


    private static TreeMap<String, UatInstance> valueMap = new TreeMap<>();
    private String value;

    static {
        UAT1.value = "uat1";
        UAT2.value = "uat2";
        UAT3.value = "uat3";
        UAT4.value = "uat4";
        UAT5.value = "uat5";

        valueMap.put("uat1", UAT1);
        valueMap.put("uat2", UAT2);
        valueMap.put("uat3", UAT3);
        valueMap.put("uat4", UAT4);
        valueMap.put("uat5", UAT5);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UatInstance constructFromString(String toConvert) throws IOException {
        UatInstance enumValue = fromString(toConvert);
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
    public static UatInstance fromString(String toConvert) {
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
     * Convert list of UatInstance values to list of string values.
     * @param toConvert The list of UatInstance values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UatInstance> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UatInstance enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
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
 * ProgramTypes to be used.
 */
public enum ProgramTypes {
    COMMERCIAL,

    CONSUMER_DISBURSEMENT,

    CONSUMER_GPR,

    CONSUMER_LOYALTY;


    private static TreeMap<String, ProgramTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        COMMERCIAL.value = "COMMERCIAL";
        CONSUMER_DISBURSEMENT.value = "CONSUMER_DISBURSEMENT";
        CONSUMER_GPR.value = "CONSUMER_GPR";
        CONSUMER_LOYALTY.value = "CONSUMER_LOYALTY";

        valueMap.put("COMMERCIAL", COMMERCIAL);
        valueMap.put("CONSUMER_DISBURSEMENT", CONSUMER_DISBURSEMENT);
        valueMap.put("CONSUMER_GPR", CONSUMER_GPR);
        valueMap.put("CONSUMER_LOYALTY", CONSUMER_LOYALTY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ProgramTypes constructFromString(String toConvert) throws IOException {
        ProgramTypes enumValue = fromString(toConvert);
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
    public static ProgramTypes fromString(String toConvert) {
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
     * Convert list of ProgramTypes values to list of string values.
     * @param toConvert The list of ProgramTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProgramTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProgramTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
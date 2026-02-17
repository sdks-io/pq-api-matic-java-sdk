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
 * IdentityVerificationResultTypes to be used.
 */
public enum IdentityVerificationResultTypes {
    PASS,

    SERVICE_OFFLINE,

    FAIL,

    PROCESSING,

    UNDEFINED,

    NOTYETEXECUTED,

    EXPIRED;


    private static TreeMap<String, IdentityVerificationResultTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        PASS.value = "PASS";
        SERVICE_OFFLINE.value = "SERVICE_OFFLINE";
        FAIL.value = "FAIL";
        PROCESSING.value = "PROCESSING";
        UNDEFINED.value = "UNDEFINED";
        NOTYETEXECUTED.value = "NOTYETEXECUTED";
        EXPIRED.value = "EXPIRED";

        valueMap.put("PASS", PASS);
        valueMap.put("SERVICE_OFFLINE", SERVICE_OFFLINE);
        valueMap.put("FAIL", FAIL);
        valueMap.put("PROCESSING", PROCESSING);
        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("NOTYETEXECUTED", NOTYETEXECUTED);
        valueMap.put("EXPIRED", EXPIRED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static IdentityVerificationResultTypes constructFromString(String toConvert) throws IOException {
        IdentityVerificationResultTypes enumValue = fromString(toConvert);
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
    public static IdentityVerificationResultTypes fromString(String toConvert) {
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
     * Convert list of IdentityVerificationResultTypes values to list of string values.
     * @param toConvert The list of IdentityVerificationResultTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<IdentityVerificationResultTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (IdentityVerificationResultTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
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
 * UserStatuses to be used.
 */
public enum UserStatuses {
    ACTIVE,

    CLOSED,

    IN_PROGRESS;


    private static TreeMap<String, UserStatuses> valueMap = new TreeMap<>();
    private String value;

    static {
        ACTIVE.value = "ACTIVE";
        CLOSED.value = "CLOSED";
        IN_PROGRESS.value = "IN_PROGRESS";

        valueMap.put("ACTIVE", ACTIVE);
        valueMap.put("CLOSED", CLOSED);
        valueMap.put("IN_PROGRESS", IN_PROGRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UserStatuses constructFromString(String toConvert) throws IOException {
        UserStatuses enumValue = fromString(toConvert);
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
    public static UserStatuses fromString(String toConvert) {
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
     * Convert list of UserStatuses values to list of string values.
     * @param toConvert The list of UserStatuses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UserStatuses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UserStatuses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
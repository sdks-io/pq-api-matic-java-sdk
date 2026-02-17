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
 * UserAction to be used.
 */
public enum UserAction {
    NO_ACTION,

    UPLOAD_DOCUMENTS,

    REVISE_DOCUMENTS;


    private static TreeMap<String, UserAction> valueMap = new TreeMap<>();
    private String value;

    static {
        NO_ACTION.value = "NO_ACTION";
        UPLOAD_DOCUMENTS.value = "UPLOAD_DOCUMENTS";
        REVISE_DOCUMENTS.value = "REVISE_DOCUMENTS";

        valueMap.put("NO_ACTION", NO_ACTION);
        valueMap.put("UPLOAD_DOCUMENTS", UPLOAD_DOCUMENTS);
        valueMap.put("REVISE_DOCUMENTS", REVISE_DOCUMENTS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UserAction constructFromString(String toConvert) throws IOException {
        UserAction enumValue = fromString(toConvert);
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
    public static UserAction fromString(String toConvert) {
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
     * Convert list of UserAction values to list of string values.
     * @param toConvert The list of UserAction values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UserAction> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UserAction enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
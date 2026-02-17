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
 * DocumentStatusTypes to be used.
 */
public enum DocumentStatusTypes {
    NOT_PROVIDED,

    PROVIDED,

    UNDER_REVIEW,

    APPROVED,

    REJECTED;


    private static TreeMap<String, DocumentStatusTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        NOT_PROVIDED.value = "NOT_PROVIDED";
        PROVIDED.value = "PROVIDED";
        UNDER_REVIEW.value = "UNDER_REVIEW";
        APPROVED.value = "APPROVED";
        REJECTED.value = "REJECTED";

        valueMap.put("NOT_PROVIDED", NOT_PROVIDED);
        valueMap.put("PROVIDED", PROVIDED);
        valueMap.put("UNDER_REVIEW", UNDER_REVIEW);
        valueMap.put("APPROVED", APPROVED);
        valueMap.put("REJECTED", REJECTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DocumentStatusTypes constructFromString(String toConvert) throws IOException {
        DocumentStatusTypes enumValue = fromString(toConvert);
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
    public static DocumentStatusTypes fromString(String toConvert) {
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
     * Convert list of DocumentStatusTypes values to list of string values.
     * @param toConvert The list of DocumentStatusTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DocumentStatusTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DocumentStatusTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
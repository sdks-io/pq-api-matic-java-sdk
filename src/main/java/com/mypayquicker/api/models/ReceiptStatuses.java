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
 * ReceiptStatuses to be used.
 */
public enum ReceiptStatuses {
    UNDEFINED,

    PENDING,

    COMPLETE,

    FAILED,

    CANCELED,

    SCHEDULED,

    REVIEW_REQUIRED,

    EXPIRED,

    REFUNDED,

    PROCESSING,

    REVERSED,

    UNSETTLED;


    private static TreeMap<String, ReceiptStatuses> valueMap = new TreeMap<>();
    private String value;

    static {
        UNDEFINED.value = "UNDEFINED";
        PENDING.value = "PENDING";
        COMPLETE.value = "COMPLETE";
        FAILED.value = "FAILED";
        CANCELED.value = "CANCELED";
        SCHEDULED.value = "SCHEDULED";
        REVIEW_REQUIRED.value = "REVIEW_REQUIRED";
        EXPIRED.value = "EXPIRED";
        REFUNDED.value = "REFUNDED";
        PROCESSING.value = "PROCESSING";
        REVERSED.value = "REVERSED";
        UNSETTLED.value = "UNSETTLED";

        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("PENDING", PENDING);
        valueMap.put("COMPLETE", COMPLETE);
        valueMap.put("FAILED", FAILED);
        valueMap.put("CANCELED", CANCELED);
        valueMap.put("SCHEDULED", SCHEDULED);
        valueMap.put("REVIEW_REQUIRED", REVIEW_REQUIRED);
        valueMap.put("EXPIRED", EXPIRED);
        valueMap.put("REFUNDED", REFUNDED);
        valueMap.put("PROCESSING", PROCESSING);
        valueMap.put("REVERSED", REVERSED);
        valueMap.put("UNSETTLED", UNSETTLED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ReceiptStatuses constructFromString(String toConvert) throws IOException {
        ReceiptStatuses enumValue = fromString(toConvert);
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
    public static ReceiptStatuses fromString(String toConvert) {
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
     * Convert list of ReceiptStatuses values to list of string values.
     * @param toConvert The list of ReceiptStatuses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ReceiptStatuses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ReceiptStatuses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
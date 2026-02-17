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
 * JobStatusTypes to be used.
 */
public enum JobStatusTypes {
    /**
     * COMPLETED.
     */
    COMPLETED,

    /**
     * APPROVED.
     */
    APPROVED,

    /**
     * CANCELLED.
     */
    CANCELLED,

    /**
     * FAILED.
     */
    FAILED,

    /**
     * IN_PROGRESS.
     */
    IN_PROGRESS,

    /**
     * PARSING.
     */
    PARSING,

    /**
     * PENDING_REVIEW.
     */
    PENDING_REVIEW,

    /**
     * PROCESSING.
     */
    PROCESSING,

    /**
     * SCHEDULED.
     */
    SCHEDULED,

    /**
     * SUBMITTED.
     */
    SUBMITTED;


    private static TreeMap<String, JobStatusTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        COMPLETED.value = "COMPLETED";
        APPROVED.value = "APPROVED";
        CANCELLED.value = "CANCELLED";
        FAILED.value = "FAILED";
        IN_PROGRESS.value = "IN_PROGRESS";
        PARSING.value = "PARSING";
        PENDING_REVIEW.value = "PENDING_REVIEW";
        PROCESSING.value = "PROCESSING";
        SCHEDULED.value = "SCHEDULED";
        SUBMITTED.value = "SUBMITTED";

        valueMap.put("COMPLETED", COMPLETED);
        valueMap.put("APPROVED", APPROVED);
        valueMap.put("CANCELLED", CANCELLED);
        valueMap.put("FAILED", FAILED);
        valueMap.put("IN_PROGRESS", IN_PROGRESS);
        valueMap.put("PARSING", PARSING);
        valueMap.put("PENDING_REVIEW", PENDING_REVIEW);
        valueMap.put("PROCESSING", PROCESSING);
        valueMap.put("SCHEDULED", SCHEDULED);
        valueMap.put("SUBMITTED", SUBMITTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static JobStatusTypes constructFromString(String toConvert) throws IOException {
        JobStatusTypes enumValue = fromString(toConvert);
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
    public static JobStatusTypes fromString(String toConvert) {
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
     * Convert list of JobStatusTypes values to list of string values.
     * @param toConvert The list of JobStatusTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<JobStatusTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (JobStatusTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
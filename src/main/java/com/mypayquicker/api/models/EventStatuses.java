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
 * EventStatuses to be used.
 */
public enum EventStatuses {
    /**
     * TO BE DONE
     */
    UNDEFINED,

    /**
     * Processing of the event has been canceled.
     */
    CANCELLED,

    /**
     * Processing of the event has been completed.
     */
    COMPLETED,

    /**
     * The event is currently being processed.
     */
    IN_PROGRESS,

    /**
     * The event is waiting to be processed.
     */
    PENDING,

    /**
     * The event processing has been suspended.
     */
    SUSPENDED;


    private static TreeMap<String, EventStatuses> valueMap = new TreeMap<>();
    private String value;

    static {
        UNDEFINED.value = "UNDEFINED";
        CANCELLED.value = "CANCELLED";
        COMPLETED.value = "COMPLETED";
        IN_PROGRESS.value = "IN_PROGRESS";
        PENDING.value = "PENDING";
        SUSPENDED.value = "SUSPENDED";

        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("CANCELLED", CANCELLED);
        valueMap.put("COMPLETED", COMPLETED);
        valueMap.put("IN_PROGRESS", IN_PROGRESS);
        valueMap.put("PENDING", PENDING);
        valueMap.put("SUSPENDED", SUSPENDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventStatuses constructFromString(String toConvert) throws IOException {
        EventStatuses enumValue = fromString(toConvert);
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
    public static EventStatuses fromString(String toConvert) {
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
     * Convert list of EventStatuses values to list of string values.
     * @param toConvert The list of EventStatuses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventStatuses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventStatuses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
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
 * EventCategoryTypes to be used.
 */
public enum EventCategoryTypes {
    WALLET_REGISTRATION,

    PREPAID_CARD_REGISTRATION,

    UPDATE_REGISTRATION;


    private static TreeMap<String, EventCategoryTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        WALLET_REGISTRATION.value = "WALLET_REGISTRATION";
        PREPAID_CARD_REGISTRATION.value = "PREPAID_CARD_REGISTRATION";
        UPDATE_REGISTRATION.value = "UPDATE_REGISTRATION";

        valueMap.put("WALLET_REGISTRATION", WALLET_REGISTRATION);
        valueMap.put("PREPAID_CARD_REGISTRATION", PREPAID_CARD_REGISTRATION);
        valueMap.put("UPDATE_REGISTRATION", UPDATE_REGISTRATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventCategoryTypes constructFromString(String toConvert) throws IOException {
        EventCategoryTypes enumValue = fromString(toConvert);
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
    public static EventCategoryTypes fromString(String toConvert) {
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
     * Convert list of EventCategoryTypes values to list of string values.
     * @param toConvert The list of EventCategoryTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventCategoryTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventCategoryTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
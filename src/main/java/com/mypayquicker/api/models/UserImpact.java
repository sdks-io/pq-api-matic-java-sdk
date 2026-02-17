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
 * UserImpact to be used.
 */
public enum UserImpact {
    NO_IMPACT,

    USER_RESTRICTIONS,

    USER_SUSPENDED,

    USER_PENDING_REGISTRATION,

    USER_CLOSED;


    private static TreeMap<String, UserImpact> valueMap = new TreeMap<>();
    private String value;

    static {
        NO_IMPACT.value = "NO_IMPACT";
        USER_RESTRICTIONS.value = "USER_RESTRICTIONS";
        USER_SUSPENDED.value = "USER_SUSPENDED";
        USER_PENDING_REGISTRATION.value = "USER_PENDING_REGISTRATION";
        USER_CLOSED.value = "USER_CLOSED";

        valueMap.put("NO_IMPACT", NO_IMPACT);
        valueMap.put("USER_RESTRICTIONS", USER_RESTRICTIONS);
        valueMap.put("USER_SUSPENDED", USER_SUSPENDED);
        valueMap.put("USER_PENDING_REGISTRATION", USER_PENDING_REGISTRATION);
        valueMap.put("USER_CLOSED", USER_CLOSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UserImpact constructFromString(String toConvert) throws IOException {
        UserImpact enumValue = fromString(toConvert);
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
    public static UserImpact fromString(String toConvert) {
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
     * Convert list of UserImpact values to list of string values.
     * @param toConvert The list of UserImpact values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UserImpact> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UserImpact enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
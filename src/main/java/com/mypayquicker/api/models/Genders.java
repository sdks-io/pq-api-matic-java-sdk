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
 * Genders to be used.
 */
public enum Genders {
    FEMALE,

    MALE,

    NOT_SPECIFIED,

    UNDEFINED,

    GENDER_NEUTRAL;


    private static TreeMap<String, Genders> valueMap = new TreeMap<>();
    private String value;

    static {
        FEMALE.value = "FEMALE";
        MALE.value = "MALE";
        NOT_SPECIFIED.value = "NOT_SPECIFIED";
        UNDEFINED.value = "UNDEFINED";
        GENDER_NEUTRAL.value = "GENDER_NEUTRAL";

        valueMap.put("FEMALE", FEMALE);
        valueMap.put("MALE", MALE);
        valueMap.put("NOT_SPECIFIED", NOT_SPECIFIED);
        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("GENDER_NEUTRAL", GENDER_NEUTRAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Genders constructFromString(String toConvert) throws IOException {
        Genders enumValue = fromString(toConvert);
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
    public static Genders fromString(String toConvert) {
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
     * Convert list of Genders values to list of string values.
     * @param toConvert The list of Genders values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Genders> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Genders enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
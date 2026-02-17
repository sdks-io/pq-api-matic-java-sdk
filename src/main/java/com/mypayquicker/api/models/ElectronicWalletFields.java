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
 * ElectronicWalletFields to be used.
 */
public enum ElectronicWalletFields {
    /**
     * Unknown or unrecognized.
     */
    UNDEFINED,

    /**
     * Used for credit party identifier. For example,`012345678`.
     */
    ACCOUNT_NUMBER,

    /**
     * Used for credit party identifier. For example,`012345678`.
     */
    GOVERNMENT_ID;


    private static TreeMap<String, ElectronicWalletFields> valueMap = new TreeMap<>();
    private String value;

    static {
        UNDEFINED.value = "UNDEFINED";
        ACCOUNT_NUMBER.value = "ACCOUNT_NUMBER";
        GOVERNMENT_ID.value = "GOVERNMENT_ID";

        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("ACCOUNT_NUMBER", ACCOUNT_NUMBER);
        valueMap.put("GOVERNMENT_ID", GOVERNMENT_ID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ElectronicWalletFields constructFromString(String toConvert) throws IOException {
        ElectronicWalletFields enumValue = fromString(toConvert);
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
    public static ElectronicWalletFields fromString(String toConvert) {
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
     * Convert list of ElectronicWalletFields values to list of string values.
     * @param toConvert The list of ElectronicWalletFields values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ElectronicWalletFields> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ElectronicWalletFields enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
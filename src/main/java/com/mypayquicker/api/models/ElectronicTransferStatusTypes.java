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
 * ElectronicTransferStatusTypes to be used.
 */
public enum ElectronicTransferStatusTypes {
    /**
     * The bank transfer has been started to the destination bank.
     */
    IN_PROGRESS,

    /**
     * The bank transfer has been performed and the funds have arrived in the destination bank.
     */
    PROCESSED,

    /**
     * The bank transfer has failed and the funds have been sent back to the source account.
     */
    FAILED,

    /**
     * The bank transfer has failed.
     */
    REFUNDED;


    private static TreeMap<String, ElectronicTransferStatusTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        IN_PROGRESS.value = "IN_PROGRESS";
        PROCESSED.value = "PROCESSED";
        FAILED.value = "REFUNDED";
        REFUNDED.value = "FAILED";

        valueMap.put("IN_PROGRESS", IN_PROGRESS);
        valueMap.put("PROCESSED", PROCESSED);
        valueMap.put("REFUNDED", FAILED);
        valueMap.put("FAILED", REFUNDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ElectronicTransferStatusTypes constructFromString(String toConvert) throws IOException {
        ElectronicTransferStatusTypes enumValue = fromString(toConvert);
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
    public static ElectronicTransferStatusTypes fromString(String toConvert) {
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
     * Convert list of ElectronicTransferStatusTypes values to list of string values.
     * @param toConvert The list of ElectronicTransferStatusTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ElectronicTransferStatusTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ElectronicTransferStatusTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
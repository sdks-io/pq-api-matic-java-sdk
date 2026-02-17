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
 * BankTypes to be used.
 */
public enum BankTypes {
    MCB,

    PEOPLES,

    PPS,

    TOKA,

    UNDEFINED,

    CHOICELTD,

    FLEX,

    REWARDS,

    PATHWARD,

    SUTTON;


    private static TreeMap<String, BankTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        MCB.value = "MCB";
        PEOPLES.value = "PEOPLES";
        PPS.value = "PPS";
        TOKA.value = "TOKA";
        UNDEFINED.value = "UNDEFINED";
        CHOICELTD.value = "CHOICELTD";
        FLEX.value = "FLEX";
        REWARDS.value = "REWARDS";
        PATHWARD.value = "PATHWARD";
        SUTTON.value = "SUTTON";

        valueMap.put("MCB", MCB);
        valueMap.put("PEOPLES", PEOPLES);
        valueMap.put("PPS", PPS);
        valueMap.put("TOKA", TOKA);
        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("CHOICELTD", CHOICELTD);
        valueMap.put("FLEX", FLEX);
        valueMap.put("REWARDS", REWARDS);
        valueMap.put("PATHWARD", PATHWARD);
        valueMap.put("SUTTON", SUTTON);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BankTypes constructFromString(String toConvert) throws IOException {
        BankTypes enumValue = fromString(toConvert);
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
    public static BankTypes fromString(String toConvert) {
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
     * Convert list of BankTypes values to list of string values.
     * @param toConvert The list of BankTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
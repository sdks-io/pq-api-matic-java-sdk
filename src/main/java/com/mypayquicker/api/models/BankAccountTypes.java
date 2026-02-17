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
 * BankAccountTypes to be used.
 */
public enum BankAccountTypes {
    /**
     * An account at a financial institution against which checks can be drawn by the account depositor.
     */
    CHECKING,

    /**
     * An interest-bearing account at a bank or credit union.
     */
    MONEY_MARKET,

    /**
     * An account at a financial institution that pays interest but cannot be used directly as money in the narrow sense of a medium of exchange.
     */
    SAVINGS,

    /**
     * Unknown or unrecognized.
     */
    UNDEFINED;


    private static TreeMap<String, BankAccountTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        CHECKING.value = "CHECKING";
        MONEY_MARKET.value = "MONEY_MARKET";
        SAVINGS.value = "SAVINGS";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("CHECKING", CHECKING);
        valueMap.put("MONEY_MARKET", MONEY_MARKET);
        valueMap.put("SAVINGS", SAVINGS);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BankAccountTypes constructFromString(String toConvert) throws IOException {
        BankAccountTypes enumValue = fromString(toConvert);
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
    public static BankAccountTypes fromString(String toConvert) {
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
     * Convert list of BankAccountTypes values to list of string values.
     * @param toConvert The list of BankAccountTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankAccountTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankAccountTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
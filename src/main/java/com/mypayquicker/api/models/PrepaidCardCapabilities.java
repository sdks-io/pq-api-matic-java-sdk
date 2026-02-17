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
 * PrepaidCardCapabilities to be used.
 */
public enum PrepaidCardCapabilities {
    /**
     * The prepaid card supports ApplePay and can be added to an iOS device.
     */
    APPLEPAY,

    /**
     * The prepaid card supports banking details that allow for loads (i.e., direct deposit).
     */
    BANK_IN,

    /**
     * The prepaid card supports transfers to external bank accounts.
     */
    BANK_OUT,

    /**
     * The prepaid card supports Google Pay and can be added to a supported Android device.
     */
    GOOGLEPAY,

    /**
     * The prepaid card supports revealing the card details or rendered card image via the API.
     */
    REVEAL_CARD,

    /**
     * TO BE DONE
     */
    REVEAL_PIN,

    /**
     * The prepaid card supports Samsung Pay and can be added to a supported Samsung device.
     */
    SAMSUNGPAY,

    /**
     * The prepaid card supports setting the PIN via the API.
     */
    SET_PIN,

    /**
     * The prepaid card supports contactless transactions at supported terminals.
     */
    CONTACTLESS;


    private static TreeMap<String, PrepaidCardCapabilities> valueMap = new TreeMap<>();
    private String value;

    static {
        APPLEPAY.value = "APPLEPAY";
        BANK_IN.value = "BANK_IN";
        BANK_OUT.value = "BANK_OUT";
        GOOGLEPAY.value = "GOOGLEPAY";
        REVEAL_CARD.value = "REVEAL_CARD";
        REVEAL_PIN.value = "REVEAL_PIN";
        SAMSUNGPAY.value = "SAMSUNGPAY";
        SET_PIN.value = "SET_PIN";
        CONTACTLESS.value = "CONTACTLESS";

        valueMap.put("APPLEPAY", APPLEPAY);
        valueMap.put("BANK_IN", BANK_IN);
        valueMap.put("BANK_OUT", BANK_OUT);
        valueMap.put("GOOGLEPAY", GOOGLEPAY);
        valueMap.put("REVEAL_CARD", REVEAL_CARD);
        valueMap.put("REVEAL_PIN", REVEAL_PIN);
        valueMap.put("SAMSUNGPAY", SAMSUNGPAY);
        valueMap.put("SET_PIN", SET_PIN);
        valueMap.put("CONTACTLESS", CONTACTLESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PrepaidCardCapabilities constructFromString(String toConvert) throws IOException {
        PrepaidCardCapabilities enumValue = fromString(toConvert);
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
    public static PrepaidCardCapabilities fromString(String toConvert) {
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
     * Convert list of PrepaidCardCapabilities values to list of string values.
     * @param toConvert The list of PrepaidCardCapabilities values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PrepaidCardCapabilities> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PrepaidCardCapabilities enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
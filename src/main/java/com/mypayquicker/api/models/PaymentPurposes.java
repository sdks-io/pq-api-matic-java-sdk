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
 * PaymentPurposes to be used.
 */
public enum PaymentPurposes {
    BONUS,

    EXPENSE,

    INCOME,

    NON_TAXABLE,

    OTHER,

    TAXABLE,

    UNDEFINED;


    private static TreeMap<String, PaymentPurposes> valueMap = new TreeMap<>();
    private String value;

    static {
        BONUS.value = "BONUS";
        EXPENSE.value = "EXPENSE";
        INCOME.value = "INCOME";
        NON_TAXABLE.value = "NON_TAXABLE";
        OTHER.value = "OTHER";
        TAXABLE.value = "TAXABLE";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("BONUS", BONUS);
        valueMap.put("EXPENSE", EXPENSE);
        valueMap.put("INCOME", INCOME);
        valueMap.put("NON_TAXABLE", NON_TAXABLE);
        valueMap.put("OTHER", OTHER);
        valueMap.put("TAXABLE", TAXABLE);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaymentPurposes constructFromString(String toConvert) throws IOException {
        PaymentPurposes enumValue = fromString(toConvert);
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
    public static PaymentPurposes fromString(String toConvert) {
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
     * Convert list of PaymentPurposes values to list of string values.
     * @param toConvert The list of PaymentPurposes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentPurposes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentPurposes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
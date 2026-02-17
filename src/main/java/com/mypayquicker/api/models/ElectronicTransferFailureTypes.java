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
 * ElectronicTransferFailureTypes to be used.
 */
public enum ElectronicTransferFailureTypes {
    /**
     * The account number is invalid or incorrect.
     */
    INCORRECT_ACCOUNT_NUMBER,

    /**
     * The sort code or account number are invalid.
     */
    INVALID_SORT_CODE,

    /**
     * No account was found with the details provided.
     */
    ACCOUNT_NOT_FOUND,

    /**
     * The destination account number is invalid.
     */
    DESTINATION_ACCOUNT_NUMBER_INVALID,

    /**
     * The destination account number is invalid.
     */
    BENEFICIARY_ACCOUNT_NUMBER_INVALID,

    /**
     * The bank account is closed.
     */
    ACCOUNT_CLOSED,

    /**
     * GENERAL_COMPLIANCE
     */
    GENERAL_COMPLIANCE,

    /**
     * INCORRECT_ROUTING_CODE
     */
    INCORRECT_ROUTING_CODE,

    /**
     * BELOW_MIN_ABOVE_MAX_ALLOWED_AMOUNT
     */
    BELOW_MIN_ABOVE_MAX_ALLOWED_AMOUNT,

    /**
     * INVALID_INSUFFICIENT_PAYMENT_DETAILS
     */
    INVALID_INSUFFICIENT_PAYMENT_DETAILS,

    /**
     * INVALID_BENEFICIARY_NAME
     */
    INVALID_BENEFICIARY_NAME,

    /**
     * INVALID_BENEFICIARY_TAX_ID
     */
    INVALID_BENEFICIARY_TAX_ID,

    /**
     * INVALID_BENEFICIARY_BANK_BRANCH_ADDRESS
     */
    INVALID_BENEFICIARY_BANK_BRANCH_ADDRESS,

    /**
     * INVALID_BENEFICIARY_ADDRESS
     */
    INVALID_BENEFICIARY_ADDRESS,

    /**
     * BANK_UNABLE_TO_APPLY
     */
    BANK_UNABLE_TO_APPLY,

    /**
     * BANK_CODE_WRONG
     */
    BANK_CODE_WRONG,

    /**
     * The transfer failed and the reason will be in the EFTFAILURECOMMENT field
     */
    OTHER;


    private static TreeMap<String, ElectronicTransferFailureTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        INCORRECT_ACCOUNT_NUMBER.value = "INCORRECT_ACCOUNT_NUMBER";
        INVALID_SORT_CODE.value = "INVALID_SORT_CODE";
        ACCOUNT_NOT_FOUND.value = "ACCOUNT_NOT_FOUND";
        DESTINATION_ACCOUNT_NUMBER_INVALID.value = "DESTINATION_ACCOUNT_NUMBER_INVALID";
        BENEFICIARY_ACCOUNT_NUMBER_INVALID.value = "BENEFICIARY_ACCOUNT_NUMBER_INVALID";
        ACCOUNT_CLOSED.value = "ACCOUNT_CLOSED";
        GENERAL_COMPLIANCE.value = "GENERAL_COMPLIANCE";
        INCORRECT_ROUTING_CODE.value = "INCORRECT_ROUTING_CODE";
        BELOW_MIN_ABOVE_MAX_ALLOWED_AMOUNT.value = "BELOW_MIN_ABOVE_MAX_ALLOWED_AMOUNT";
        INVALID_INSUFFICIENT_PAYMENT_DETAILS.value = "INVALID_INSUFFICIENT_PAYMENT_DETAILS";
        INVALID_BENEFICIARY_NAME.value = "INVALID_BENEFICIARY_NAME";
        INVALID_BENEFICIARY_TAX_ID.value = "INVALID_BENEFICIARY_TAX_ID";
        INVALID_BENEFICIARY_BANK_BRANCH_ADDRESS.value = "INVALID_BENEFICIARY_BANK_BRANCH_ADDRESS";
        INVALID_BENEFICIARY_ADDRESS.value = "INVALID_BENEFICIARY_ADDRESS";
        BANK_UNABLE_TO_APPLY.value = "BANK_UNABLE_TO_APPLY";
        BANK_CODE_WRONG.value = "BANK_CODE_WRONG";
        OTHER.value = "OTHER";

        valueMap.put("INCORRECT_ACCOUNT_NUMBER", INCORRECT_ACCOUNT_NUMBER);
        valueMap.put("INVALID_SORT_CODE", INVALID_SORT_CODE);
        valueMap.put("ACCOUNT_NOT_FOUND", ACCOUNT_NOT_FOUND);
        valueMap.put("DESTINATION_ACCOUNT_NUMBER_INVALID", DESTINATION_ACCOUNT_NUMBER_INVALID);
        valueMap.put("BENEFICIARY_ACCOUNT_NUMBER_INVALID", BENEFICIARY_ACCOUNT_NUMBER_INVALID);
        valueMap.put("ACCOUNT_CLOSED", ACCOUNT_CLOSED);
        valueMap.put("GENERAL_COMPLIANCE", GENERAL_COMPLIANCE);
        valueMap.put("INCORRECT_ROUTING_CODE", INCORRECT_ROUTING_CODE);
        valueMap.put("BELOW_MIN_ABOVE_MAX_ALLOWED_AMOUNT", BELOW_MIN_ABOVE_MAX_ALLOWED_AMOUNT);
        valueMap.put("INVALID_INSUFFICIENT_PAYMENT_DETAILS", INVALID_INSUFFICIENT_PAYMENT_DETAILS);
        valueMap.put("INVALID_BENEFICIARY_NAME", INVALID_BENEFICIARY_NAME);
        valueMap.put("INVALID_BENEFICIARY_TAX_ID", INVALID_BENEFICIARY_TAX_ID);
        valueMap.put("INVALID_BENEFICIARY_BANK_BRANCH_ADDRESS", INVALID_BENEFICIARY_BANK_BRANCH_ADDRESS);
        valueMap.put("INVALID_BENEFICIARY_ADDRESS", INVALID_BENEFICIARY_ADDRESS);
        valueMap.put("BANK_UNABLE_TO_APPLY", BANK_UNABLE_TO_APPLY);
        valueMap.put("BANK_CODE_WRONG", BANK_CODE_WRONG);
        valueMap.put("OTHER", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ElectronicTransferFailureTypes constructFromString(String toConvert) throws IOException {
        ElectronicTransferFailureTypes enumValue = fromString(toConvert);
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
    public static ElectronicTransferFailureTypes fromString(String toConvert) {
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
     * Convert list of ElectronicTransferFailureTypes values to list of string values.
     * @param toConvert The list of ElectronicTransferFailureTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ElectronicTransferFailureTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ElectronicTransferFailureTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
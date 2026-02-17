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
 * TransferTypes to be used.
 */
public enum TransferTypes {
    ACCOUNT_TO_ACCOUNT_TRANSFER,

    BANK_TRANSFER,

    BANK_TRANSFER_RETURN,

    BANK_TRANSFER_REVERSAL,

    CANCELLED_PAYMENT,

    CARD_PURCHASE,

    CARD_PURCHASE_REFUND,

    CASH_WITHDRAWAL,

    DEPOSIT,

    ESCHEATED_FUNDS_RETURN,

    FEE,

    FEE_REFUND,

    PAPER_CHECK,

    PAYMENT,

    PAYMENT_RETRACTION,

    PREPAID_CARD_LOAD,

    PREPAID_CARD_UNLOAD,

    PROVISIONAL_REFUND,

    SPENDBACK,

    SPENDBACK_RETURN,

    ELECTRONIC_WALLET_TRANSFER;


    private static TreeMap<String, TransferTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        ACCOUNT_TO_ACCOUNT_TRANSFER.value = "ACCOUNT_TO_ACCOUNT_TRANSFER";
        BANK_TRANSFER.value = "BANK_TRANSFER";
        BANK_TRANSFER_RETURN.value = "BANK_TRANSFER_RETURN";
        BANK_TRANSFER_REVERSAL.value = "BANK_TRANSFER_REVERSAL";
        CANCELLED_PAYMENT.value = "CANCELLED_PAYMENT";
        CARD_PURCHASE.value = "CARD_PURCHASE";
        CARD_PURCHASE_REFUND.value = "CARD_PURCHASE_REFUND";
        CASH_WITHDRAWAL.value = "CASH_WITHDRAWAL";
        DEPOSIT.value = "DEPOSIT";
        ESCHEATED_FUNDS_RETURN.value = "ESCHEATED_FUNDS_RETURN";
        FEE.value = "FEE";
        FEE_REFUND.value = "FEE_REFUND";
        PAPER_CHECK.value = "PAPER_CHECK";
        PAYMENT.value = "PAYMENT";
        PAYMENT_RETRACTION.value = "PAYMENT_RETRACTION";
        PREPAID_CARD_LOAD.value = "PREPAID_CARD_LOAD";
        PREPAID_CARD_UNLOAD.value = "PREPAID_CARD_UNLOAD";
        PROVISIONAL_REFUND.value = "PROVISIONAL_REFUND";
        SPENDBACK.value = "SPENDBACK";
        SPENDBACK_RETURN.value = "SPENDBACK_RETURN";
        ELECTRONIC_WALLET_TRANSFER.value = "ELECTRONIC_WALLET_TRANSFER";

        valueMap.put("ACCOUNT_TO_ACCOUNT_TRANSFER", ACCOUNT_TO_ACCOUNT_TRANSFER);
        valueMap.put("BANK_TRANSFER", BANK_TRANSFER);
        valueMap.put("BANK_TRANSFER_RETURN", BANK_TRANSFER_RETURN);
        valueMap.put("BANK_TRANSFER_REVERSAL", BANK_TRANSFER_REVERSAL);
        valueMap.put("CANCELLED_PAYMENT", CANCELLED_PAYMENT);
        valueMap.put("CARD_PURCHASE", CARD_PURCHASE);
        valueMap.put("CARD_PURCHASE_REFUND", CARD_PURCHASE_REFUND);
        valueMap.put("CASH_WITHDRAWAL", CASH_WITHDRAWAL);
        valueMap.put("DEPOSIT", DEPOSIT);
        valueMap.put("ESCHEATED_FUNDS_RETURN", ESCHEATED_FUNDS_RETURN);
        valueMap.put("FEE", FEE);
        valueMap.put("FEE_REFUND", FEE_REFUND);
        valueMap.put("PAPER_CHECK", PAPER_CHECK);
        valueMap.put("PAYMENT", PAYMENT);
        valueMap.put("PAYMENT_RETRACTION", PAYMENT_RETRACTION);
        valueMap.put("PREPAID_CARD_LOAD", PREPAID_CARD_LOAD);
        valueMap.put("PREPAID_CARD_UNLOAD", PREPAID_CARD_UNLOAD);
        valueMap.put("PROVISIONAL_REFUND", PROVISIONAL_REFUND);
        valueMap.put("SPENDBACK", SPENDBACK);
        valueMap.put("SPENDBACK_RETURN", SPENDBACK_RETURN);
        valueMap.put("ELECTRONIC_WALLET_TRANSFER", ELECTRONIC_WALLET_TRANSFER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransferTypes constructFromString(String toConvert) throws IOException {
        TransferTypes enumValue = fromString(toConvert);
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
    public static TransferTypes fromString(String toConvert) {
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
     * Convert list of TransferTypes values to list of string values.
     * @param toConvert The list of TransferTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransferTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransferTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
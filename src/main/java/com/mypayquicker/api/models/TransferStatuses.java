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
 * TransferStatuses to be used.
 */
public enum TransferStatuses {
    ACCEPTED,

    CANCELLED,

    COMPLETED,

    EXPIRED,

    FAILED,

    PENDING,

    PENDING_ACCEPTANCE,

    QUOTED,

    RETURNED,

    SCHEDULED,

    VERIFICATION_HOLD,

    VOIDED;


    private static TreeMap<String, TransferStatuses> valueMap = new TreeMap<>();
    private String value;

    static {
        ACCEPTED.value = "ACCEPTED";
        CANCELLED.value = "CANCELLED";
        COMPLETED.value = "COMPLETED";
        EXPIRED.value = "EXPIRED";
        FAILED.value = "FAILED";
        PENDING.value = "PENDING";
        PENDING_ACCEPTANCE.value = "PENDING_ACCEPTANCE";
        QUOTED.value = "QUOTED";
        RETURNED.value = "RETURNED";
        SCHEDULED.value = "SCHEDULED";
        VERIFICATION_HOLD.value = "VERIFICATION_HOLD";
        VOIDED.value = "VOIDED";

        valueMap.put("ACCEPTED", ACCEPTED);
        valueMap.put("CANCELLED", CANCELLED);
        valueMap.put("COMPLETED", COMPLETED);
        valueMap.put("EXPIRED", EXPIRED);
        valueMap.put("FAILED", FAILED);
        valueMap.put("PENDING", PENDING);
        valueMap.put("PENDING_ACCEPTANCE", PENDING_ACCEPTANCE);
        valueMap.put("QUOTED", QUOTED);
        valueMap.put("RETURNED", RETURNED);
        valueMap.put("SCHEDULED", SCHEDULED);
        valueMap.put("VERIFICATION_HOLD", VERIFICATION_HOLD);
        valueMap.put("VOIDED", VOIDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransferStatuses constructFromString(String toConvert) throws IOException {
        TransferStatuses enumValue = fromString(toConvert);
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
    public static TransferStatuses fromString(String toConvert) {
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
     * Convert list of TransferStatuses values to list of string values.
     * @param toConvert The list of TransferStatuses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransferStatuses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransferStatuses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
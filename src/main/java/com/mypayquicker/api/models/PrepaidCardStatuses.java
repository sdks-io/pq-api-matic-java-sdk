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
 * PrepaidCardStatuses to be used.
 */
public enum PrepaidCardStatuses {
    /**
     * The prepaid card is active and ready to use.
     */
    ACTIVATED,

    /**
     * The prepaid card is damaged and is no longer usable.
     */
    CLOSED,

    /**
     * The prepaid card is expired and is no longer usable.
     */
    CLOSED_LOST_STOLEN_DAMAGED,

    /**
     * The prepaid card has been suspended for compliance reasons.
     */
    COMPLIANCE_HOLD,

    /**
     * The expiration date set for the prepaid card has elapsed. The prepaid card will no longer be accepted.
     */
    EXPIRED,

    /**
     * The prepaid card has been created but has not yet been activated. Instantly issued cards are activated automatically.Plastic cards are activated upon delivery and require the CVV on the back of the prepaid card to complete.
     */
    PENDING_ACTIVATION,

    /**
     * The prepaid card is awaiting order placement and will transition to PENDING_ACTIVATION once ordered.
     */
    QUEUED,

    /**
     * TO BE DONE
     */
    STAGED,

    /**
     * The prepaid card has been suspended and may neither send nor receive funds.
     */
    SUSPENDED;


    private static TreeMap<String, PrepaidCardStatuses> valueMap = new TreeMap<>();
    private String value;

    static {
        ACTIVATED.value = "ACTIVATED";
        CLOSED.value = "CLOSED";
        CLOSED_LOST_STOLEN_DAMAGED.value = "CLOSED_LOST_STOLEN_DAMAGED";
        COMPLIANCE_HOLD.value = "COMPLIANCE_HOLD";
        EXPIRED.value = "EXPIRED";
        PENDING_ACTIVATION.value = "PENDING_ACTIVATION";
        QUEUED.value = "QUEUED";
        STAGED.value = "STAGED";
        SUSPENDED.value = "SUSPENDED";

        valueMap.put("ACTIVATED", ACTIVATED);
        valueMap.put("CLOSED", CLOSED);
        valueMap.put("CLOSED_LOST_STOLEN_DAMAGED", CLOSED_LOST_STOLEN_DAMAGED);
        valueMap.put("COMPLIANCE_HOLD", COMPLIANCE_HOLD);
        valueMap.put("EXPIRED", EXPIRED);
        valueMap.put("PENDING_ACTIVATION", PENDING_ACTIVATION);
        valueMap.put("QUEUED", QUEUED);
        valueMap.put("STAGED", STAGED);
        valueMap.put("SUSPENDED", SUSPENDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PrepaidCardStatuses constructFromString(String toConvert) throws IOException {
        PrepaidCardStatuses enumValue = fromString(toConvert);
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
    public static PrepaidCardStatuses fromString(String toConvert) {
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
     * Convert list of PrepaidCardStatuses values to list of string values.
     * @param toConvert The list of PrepaidCardStatuses values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PrepaidCardStatuses> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PrepaidCardStatuses enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
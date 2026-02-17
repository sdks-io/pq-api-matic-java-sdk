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
 * EventRequirements to be used.
 */
public enum EventRequirements {
    ACH_UPGRADE_PII_DETAILS_VALIDATED,

    AGREEMENTS_ACCEPTED,

    DOCUMENTS_REQUIRED,

    EMAIL_ADDRESS_VERIFIED,

    FINANCIAL_PROCESSOR_ACCOUNT_CREATED,

    IDENTITY_VERIFIED,

    MFA_REGISTRATION_CANCELLED,

    MFA_REGISTRATION_CHALLENGE_SENT,

    MFA_REGISTRATION_COMPLETED,

    MFA_REGISTRATION_PII_COLLECTED,

    MFA_REGISTRATION_PROCESSOR_REGISTRATION,

    MFA_REGISTRATION_TYPE_CHANGED,

    MFA_REGISTRATION_VALIDATION,

    ORDER_PLASTIC_CARD,

    PEP_SANCTIONS_SCREENING_VERIFIED,

    PERSONAL_DETAILS_COLLECTED,

    PROCESS_EXECUTED,

    TYPE_UNDEFINED,

    USER_CREATED;


    private static TreeMap<String, EventRequirements> valueMap = new TreeMap<>();
    private String value;

    static {
        ACH_UPGRADE_PII_DETAILS_VALIDATED.value = "ACH_UPGRADE_PII_DETAILS_VALIDATED";
        AGREEMENTS_ACCEPTED.value = "AGREEMENTS_ACCEPTED";
        DOCUMENTS_REQUIRED.value = "DOCUMENTS_REQUIRED";
        EMAIL_ADDRESS_VERIFIED.value = "EMAIL_ADDRESS_VERIFIED";
        FINANCIAL_PROCESSOR_ACCOUNT_CREATED.value = "FINANCIAL_PROCESSOR_ACCOUNT_CREATED";
        IDENTITY_VERIFIED.value = "IDENTITY_VERIFIED";
        MFA_REGISTRATION_CANCELLED.value = "MFA_REGISTRATION_CANCELLED";
        MFA_REGISTRATION_CHALLENGE_SENT.value = "MFA_REGISTRATION_CHALLENGE_SENT";
        MFA_REGISTRATION_COMPLETED.value = "MFA_REGISTRATION_COMPLETED";
        MFA_REGISTRATION_PII_COLLECTED.value = "MFA_REGISTRATION_PII_COLLECTED";
        MFA_REGISTRATION_PROCESSOR_REGISTRATION.value = "MFA_REGISTRATION_PROCESSOR_REGISTRATION";
        MFA_REGISTRATION_TYPE_CHANGED.value = "MFA_REGISTRATION_TYPE_CHANGED";
        MFA_REGISTRATION_VALIDATION.value = "MFA_REGISTRATION_VALIDATION";
        ORDER_PLASTIC_CARD.value = "ORDER_PLASTIC_CARD";
        PEP_SANCTIONS_SCREENING_VERIFIED.value = "PEP_SANCTIONS_SCREENING_VERIFIED";
        PERSONAL_DETAILS_COLLECTED.value = "PERSONAL_DETAILS_COLLECTED";
        PROCESS_EXECUTED.value = "PROCESS_EXECUTED";
        TYPE_UNDEFINED.value = "TYPE_UNDEFINED";
        USER_CREATED.value = "USER_CREATED";

        valueMap.put("ACH_UPGRADE_PII_DETAILS_VALIDATED", ACH_UPGRADE_PII_DETAILS_VALIDATED);
        valueMap.put("AGREEMENTS_ACCEPTED", AGREEMENTS_ACCEPTED);
        valueMap.put("DOCUMENTS_REQUIRED", DOCUMENTS_REQUIRED);
        valueMap.put("EMAIL_ADDRESS_VERIFIED", EMAIL_ADDRESS_VERIFIED);
        valueMap.put("FINANCIAL_PROCESSOR_ACCOUNT_CREATED", FINANCIAL_PROCESSOR_ACCOUNT_CREATED);
        valueMap.put("IDENTITY_VERIFIED", IDENTITY_VERIFIED);
        valueMap.put("MFA_REGISTRATION_CANCELLED", MFA_REGISTRATION_CANCELLED);
        valueMap.put("MFA_REGISTRATION_CHALLENGE_SENT", MFA_REGISTRATION_CHALLENGE_SENT);
        valueMap.put("MFA_REGISTRATION_COMPLETED", MFA_REGISTRATION_COMPLETED);
        valueMap.put("MFA_REGISTRATION_PII_COLLECTED", MFA_REGISTRATION_PII_COLLECTED);
        valueMap.put("MFA_REGISTRATION_PROCESSOR_REGISTRATION", MFA_REGISTRATION_PROCESSOR_REGISTRATION);
        valueMap.put("MFA_REGISTRATION_TYPE_CHANGED", MFA_REGISTRATION_TYPE_CHANGED);
        valueMap.put("MFA_REGISTRATION_VALIDATION", MFA_REGISTRATION_VALIDATION);
        valueMap.put("ORDER_PLASTIC_CARD", ORDER_PLASTIC_CARD);
        valueMap.put("PEP_SANCTIONS_SCREENING_VERIFIED", PEP_SANCTIONS_SCREENING_VERIFIED);
        valueMap.put("PERSONAL_DETAILS_COLLECTED", PERSONAL_DETAILS_COLLECTED);
        valueMap.put("PROCESS_EXECUTED", PROCESS_EXECUTED);
        valueMap.put("TYPE_UNDEFINED", TYPE_UNDEFINED);
        valueMap.put("USER_CREATED", USER_CREATED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventRequirements constructFromString(String toConvert) throws IOException {
        EventRequirements enumValue = fromString(toConvert);
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
    public static EventRequirements fromString(String toConvert) {
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
     * Convert list of EventRequirements values to list of string values.
     * @param toConvert The list of EventRequirements values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventRequirements> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventRequirements enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
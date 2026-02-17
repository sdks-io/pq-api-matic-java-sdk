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
 * AgreementTypes to be used.
 */
public enum AgreementTypes {
    CARD_HOLDER_AGREEMENT,

    CARD_HOLDER_AGREEMENT_CONSENT,

    CARD_LIMITS,

    E_SIGN_AND_CONSENT,

    FEE_AGREEMENT,

    PRIVACY_POLICY,

    PRIVACY_POLICY_ADDENDUM,

    TERMS_OF_USE,

    UNDEFINED;


    private static TreeMap<String, AgreementTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        CARD_HOLDER_AGREEMENT.value = "CARD_HOLDER_AGREEMENT";
        CARD_HOLDER_AGREEMENT_CONSENT.value = "CARD_HOLDER_AGREEMENT_CONSENT";
        CARD_LIMITS.value = "CARD_LIMITS";
        E_SIGN_AND_CONSENT.value = "E_SIGN_AND_CONSENT";
        FEE_AGREEMENT.value = "FEE_AGREEMENT";
        PRIVACY_POLICY.value = "PRIVACY_POLICY";
        PRIVACY_POLICY_ADDENDUM.value = "PRIVACY_POLICY_ADDENDUM";
        TERMS_OF_USE.value = "TERMS_OF_USE";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("CARD_HOLDER_AGREEMENT", CARD_HOLDER_AGREEMENT);
        valueMap.put("CARD_HOLDER_AGREEMENT_CONSENT", CARD_HOLDER_AGREEMENT_CONSENT);
        valueMap.put("CARD_LIMITS", CARD_LIMITS);
        valueMap.put("E_SIGN_AND_CONSENT", E_SIGN_AND_CONSENT);
        valueMap.put("FEE_AGREEMENT", FEE_AGREEMENT);
        valueMap.put("PRIVACY_POLICY", PRIVACY_POLICY);
        valueMap.put("PRIVACY_POLICY_ADDENDUM", PRIVACY_POLICY_ADDENDUM);
        valueMap.put("TERMS_OF_USE", TERMS_OF_USE);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AgreementTypes constructFromString(String toConvert) throws IOException {
        AgreementTypes enumValue = fromString(toConvert);
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
    public static AgreementTypes fromString(String toConvert) {
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
     * Convert list of AgreementTypes values to list of string values.
     * @param toConvert The list of AgreementTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AgreementTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AgreementTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
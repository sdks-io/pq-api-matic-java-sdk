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
 * EventRequirementCategories to be used.
 */
public enum EventRequirementCategories {
    ACKNOWLEDGEMENT,

    CATEGORY_UNDEFINED,

    EXTERNAL_REFERENCE_KYC,

    GEO_IP_VERIFICATION,

    KYC,

    TAX,

    VIDEO_CALL_KYC;


    private static TreeMap<String, EventRequirementCategories> valueMap = new TreeMap<>();
    private String value;

    static {
        ACKNOWLEDGEMENT.value = "ACKNOWLEDGEMENT";
        CATEGORY_UNDEFINED.value = "CATEGORY_UNDEFINED";
        EXTERNAL_REFERENCE_KYC.value = "EXTERNAL_REFERENCE_KYC";
        GEO_IP_VERIFICATION.value = "GEO_IP_VERIFICATION";
        KYC.value = "KYC";
        TAX.value = "TAX";
        VIDEO_CALL_KYC.value = "VIDEO_CALL_KYC";

        valueMap.put("ACKNOWLEDGEMENT", ACKNOWLEDGEMENT);
        valueMap.put("CATEGORY_UNDEFINED", CATEGORY_UNDEFINED);
        valueMap.put("EXTERNAL_REFERENCE_KYC", EXTERNAL_REFERENCE_KYC);
        valueMap.put("GEO_IP_VERIFICATION", GEO_IP_VERIFICATION);
        valueMap.put("KYC", KYC);
        valueMap.put("TAX", TAX);
        valueMap.put("VIDEO_CALL_KYC", VIDEO_CALL_KYC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventRequirementCategories constructFromString(String toConvert) throws IOException {
        EventRequirementCategories enumValue = fromString(toConvert);
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
    public static EventRequirementCategories fromString(String toConvert) {
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
     * Convert list of EventRequirementCategories values to list of string values.
     * @param toConvert The list of EventRequirementCategories values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventRequirementCategories> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventRequirementCategories enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
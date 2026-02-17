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
 * IdentityVerificationProviders to be used.
 */
public enum IdentityVerificationProviders {
    EQUIFAX,

    W2,

    FISIDOLOGY,

    OFACANALYZER,

    UNDEFINED,

    HOOYU,

    LEXISNEXISIVI,

    QOLO;


    private static TreeMap<String, IdentityVerificationProviders> valueMap = new TreeMap<>();
    private String value;

    static {
        EQUIFAX.value = "EQUIFAX";
        W2.value = "W2";
        FISIDOLOGY.value = "FISIDOLOGY";
        OFACANALYZER.value = "OFACANALYZER";
        UNDEFINED.value = "UNDEFINED";
        HOOYU.value = "HOOYU";
        LEXISNEXISIVI.value = "LEXISNEXISIVI";
        QOLO.value = "QOLO";

        valueMap.put("EQUIFAX", EQUIFAX);
        valueMap.put("W2", W2);
        valueMap.put("FISIDOLOGY", FISIDOLOGY);
        valueMap.put("OFACANALYZER", OFACANALYZER);
        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("HOOYU", HOOYU);
        valueMap.put("LEXISNEXISIVI", LEXISNEXISIVI);
        valueMap.put("QOLO", QOLO);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static IdentityVerificationProviders constructFromString(String toConvert) throws IOException {
        IdentityVerificationProviders enumValue = fromString(toConvert);
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
    public static IdentityVerificationProviders fromString(String toConvert) {
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
     * Convert list of IdentityVerificationProviders values to list of string values.
     * @param toConvert The list of IdentityVerificationProviders values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<IdentityVerificationProviders> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (IdentityVerificationProviders enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
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
 * SandboxInstance to be used.
 */
public enum SandboxInstance {
    SANDBOX,

    SBX1,

    SBX2,

    SBX3,

    SBX4,

    SBX5,

    SBX6,

    SBX7,

    SBX8,

    SBX9,

    SBX10,

    SBX11;


    private static TreeMap<String, SandboxInstance> valueMap = new TreeMap<>();
    private String value;

    static {
        SANDBOX.value = "sandbox";
        SBX1.value = "sbx1";
        SBX2.value = "sbx2";
        SBX3.value = "sbx3";
        SBX4.value = "sbx4";
        SBX5.value = "sbx5";
        SBX6.value = "sbx6";
        SBX7.value = "sbx7";
        SBX8.value = "sbx8";
        SBX9.value = "sbx9";
        SBX10.value = "sbx10";
        SBX11.value = "sbx11";

        valueMap.put("sandbox", SANDBOX);
        valueMap.put("sbx1", SBX1);
        valueMap.put("sbx2", SBX2);
        valueMap.put("sbx3", SBX3);
        valueMap.put("sbx4", SBX4);
        valueMap.put("sbx5", SBX5);
        valueMap.put("sbx6", SBX6);
        valueMap.put("sbx7", SBX7);
        valueMap.put("sbx8", SBX8);
        valueMap.put("sbx9", SBX9);
        valueMap.put("sbx10", SBX10);
        valueMap.put("sbx11", SBX11);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SandboxInstance constructFromString(String toConvert) throws IOException {
        SandboxInstance enumValue = fromString(toConvert);
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
    public static SandboxInstance fromString(String toConvert) {
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
     * Convert list of SandboxInstance values to list of string values.
     * @param toConvert The list of SandboxInstance values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SandboxInstance> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SandboxInstance enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
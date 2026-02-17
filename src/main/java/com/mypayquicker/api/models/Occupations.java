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
 * Occupations to be used.
 */
public enum Occupations {
    ARTS,

    DESIGN,

    EDUCATION,

    ENGINEERING,

    FINANCE,

    GOVERNMENT,

    HEALTHCARE,

    HOSPITALITY_AND_TOURISM,

    INDEPENDENT_BUSINESS_OWNER,

    LAW,

    MANUFACTURING,

    MATH,

    MEDIA,

    OFFICE_AND_ADMIN_SUPPORT,

    SCIENCE,

    SOCIAL_SERVICES,

    TECHNOLOGY,

    SALES;


    private static TreeMap<String, Occupations> valueMap = new TreeMap<>();
    private String value;

    static {
        ARTS.value = "ARTS";
        DESIGN.value = "DESIGN";
        EDUCATION.value = "EDUCATION";
        ENGINEERING.value = "ENGINEERING";
        FINANCE.value = "FINANCE";
        GOVERNMENT.value = "GOVERNMENT";
        HEALTHCARE.value = "HEALTHCARE";
        HOSPITALITY_AND_TOURISM.value = "HOSPITALITY_AND_TOURISM";
        INDEPENDENT_BUSINESS_OWNER.value = "INDEPENDENT_BUSINESS_OWNER";
        LAW.value = "LAW";
        MANUFACTURING.value = "MANUFACTURING";
        MATH.value = "MATH";
        MEDIA.value = "MEDIA";
        OFFICE_AND_ADMIN_SUPPORT.value = "OFFICE_AND_ADMIN_SUPPORT";
        SCIENCE.value = "SCIENCE";
        SOCIAL_SERVICES.value = "SOCIAL_SERVICES";
        TECHNOLOGY.value = "TECHNOLOGY";
        SALES.value = "SALES";

        valueMap.put("ARTS", ARTS);
        valueMap.put("DESIGN", DESIGN);
        valueMap.put("EDUCATION", EDUCATION);
        valueMap.put("ENGINEERING", ENGINEERING);
        valueMap.put("FINANCE", FINANCE);
        valueMap.put("GOVERNMENT", GOVERNMENT);
        valueMap.put("HEALTHCARE", HEALTHCARE);
        valueMap.put("HOSPITALITY_AND_TOURISM", HOSPITALITY_AND_TOURISM);
        valueMap.put("INDEPENDENT_BUSINESS_OWNER", INDEPENDENT_BUSINESS_OWNER);
        valueMap.put("LAW", LAW);
        valueMap.put("MANUFACTURING", MANUFACTURING);
        valueMap.put("MATH", MATH);
        valueMap.put("MEDIA", MEDIA);
        valueMap.put("OFFICE_AND_ADMIN_SUPPORT", OFFICE_AND_ADMIN_SUPPORT);
        valueMap.put("SCIENCE", SCIENCE);
        valueMap.put("SOCIAL_SERVICES", SOCIAL_SERVICES);
        valueMap.put("TECHNOLOGY", TECHNOLOGY);
        valueMap.put("SALES", SALES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Occupations constructFromString(String toConvert) throws IOException {
        Occupations enumValue = fromString(toConvert);
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
    public static Occupations fromString(String toConvert) {
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
     * Convert list of Occupations values to list of string values.
     * @param toConvert The list of Occupations values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Occupations> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Occupations enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
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
 * Languages to be used.
 */
public enum Languages {
    /**
     * Czech
     */
    CSCZ,

    /**
     * German
     */
    DEDE,

    /**
     * English (UK)
     */
    ENGB,

    /**
     * English (US)
     */
    ENUS,

    /**
     * Spanish (Spain)
     */
    ESES,

    /**
     * Spanish (Mexico)
     */
    ESMX,

    /**
     * French (Canadian)
     */
    FRCA,

    /**
     * French (France)
     */
    FRFR,

    /**
     * Italian
     */
    ITIT,

    /**
     * I bet you already know
     */
    JAJP,

    /**
     * Korea
     */
    KOKR,

    /**
     * Dutch
     */
    NLNL,

    /**
     * Polish
     */
    PLPL,

    /**
     * Portuguese (Brazil)
     */
    PTBR,

    /**
     * Portuguese (Portugal)
     */
    PTPT,

    /**
     * Russian
     */
    RURU,

    /**
     * Chinese (Simplified)
     */
    ZHHANS,

    /**
     * Chinese (Traditional)
     */
    ZHHANT;


    private static TreeMap<String, Languages> valueMap = new TreeMap<>();
    private String value;

    static {
        CSCZ.value = "cs-CZ";
        DEDE.value = "de-DE";
        ENGB.value = "en-GB";
        ENUS.value = "en-US";
        ESES.value = "es-ES";
        ESMX.value = "es-MX";
        FRCA.value = "fr-CA";
        FRFR.value = "fr-FR";
        ITIT.value = "it-IT";
        JAJP.value = "ja-JP";
        KOKR.value = "ko-KR";
        NLNL.value = "nl-NL";
        PLPL.value = "pl-PL";
        PTBR.value = "pt-BR";
        PTPT.value = "pt-PT";
        RURU.value = "ru-RU";
        ZHHANS.value = "zh-Hans";
        ZHHANT.value = "zh-Hant";

        valueMap.put("cs-CZ", CSCZ);
        valueMap.put("de-DE", DEDE);
        valueMap.put("en-GB", ENGB);
        valueMap.put("en-US", ENUS);
        valueMap.put("es-ES", ESES);
        valueMap.put("es-MX", ESMX);
        valueMap.put("fr-CA", FRCA);
        valueMap.put("fr-FR", FRFR);
        valueMap.put("it-IT", ITIT);
        valueMap.put("ja-JP", JAJP);
        valueMap.put("ko-KR", KOKR);
        valueMap.put("nl-NL", NLNL);
        valueMap.put("pl-PL", PLPL);
        valueMap.put("pt-BR", PTBR);
        valueMap.put("pt-PT", PTPT);
        valueMap.put("ru-RU", RURU);
        valueMap.put("zh-Hans", ZHHANS);
        valueMap.put("zh-Hant", ZHHANT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Languages constructFromString(String toConvert) throws IOException {
        Languages enumValue = fromString(toConvert);
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
    public static Languages fromString(String toConvert) {
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
     * Convert list of Languages values to list of string values.
     * @param toConvert The list of Languages values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Languages> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Languages enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
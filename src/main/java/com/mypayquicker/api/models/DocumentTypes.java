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
 * DocumentTypes to be used.
 */
public enum DocumentTypes {
    UNDEFINED,

    ARMED_FORCES_ID_CARD,

    BANK_OR_CREDIT_CARD_STATEMENT,

    BANK_REFERENCE_LETTER,

    BIRTH_CERTIFICATE,

    DEED_POLL,

    DEED_POLL_NAME_CHANGE,

    DRIVERS_LICENSE,

    DRIVERS_LICENSE_BACK,

    DRIVERS_LICENSE_NAME_CHANGE,

    FIREARMS_LICENSE,

    HEALTH_ID_CARD,

    HIGH_QUALITY_HEADSHOT,

    MARRIAGE_LICENSE,

    MARRIAGE_LICENSE_NAME_CHANGE,

    MATRICULA_CONSULAR_ID_CARD,

    NATIONAL_IDENTITY_CARD,

    NATIONAL_IDENTITY_CARD_FRONT,

    NATIONAL_IDENTITY_CARD_BACK,

    NATIONAL_INSURANCE_CARD,

    OFFICIAL_NAME_CHANGE_DOCUMENT,

    OTHER_GOVERNMENT_ISSUED_ID,

    PASSPORT,

    PAY_STUB,

    PROOF_OF_AGE_CARD,

    PROVISIONAL_DRIVERS_LICENSE,

    PUBLIC_SERVICE_CARD_FRONT,

    PUBLIC_SERVICE_CARD_BACK,

    RESIDENT_CARD,

    RESIDENT_IMMIGRATION_CARD,

    SOCIAL_SECURITY_CARD,

    TAX_IDENTIFICATION_CARD_OR_LETTER,

    TAX_STATEMENT,

    UTILITY_BILL,

    VOTERS_CARD,

    ARMED_FORCES_ID_CARD_BACK,

    TAX_DOCUMENT,

    HEALTH_ID_CARD_BACK,

    PROOF_OF_AGE_CARD_BACK,

    INDEPENDENT_PERSONAL_REFERENCE_DOCUMENT,

    VIDEO_CALL_FILE,

    HOME_OR_AUTO_INSURANCE_CERTIFICATE_OR_SCHEDULE,

    DIVORCE_DECREE_NAME_CHANGE,

    CIVIL_PARTNERSHIP_REGISTRATION_NAME_CHANGE,

    RENT_AGREEMENT,

    VEHICLE_REGISTRATION,

    BENEFITS_CONFIRMATION_LETTER,

    RESIDENT_CARD_BACK,

    LOAN_ACCOUNT_STATEMENT,

    PROCESSED_CHECK,

    RESIDENTIAL_DIRECTORY_LISTING,

    GENERIC_DOCUMENT,

    GOVERNMENT_ISSUED_PHOTOID,

    GOVERNMENT_ISSUED_PHOTO_ID_BACK,

    SOCIAL_INSURANCE_NUMBER_CARD,

    SOCIAL_INSURANCE_NUMBER_LETTER,

    OTHER_SOCIAL_INSURANCE_NUMBER_DOCUMENT,

    PLASTIC_CARD_CUSTOM_IMAGE;


    private static TreeMap<String, DocumentTypes> valueMap = new TreeMap<>();
    private String value;

    static {
        UNDEFINED.value = "UNDEFINED";
        ARMED_FORCES_ID_CARD.value = "ARMED_FORCES_ID_CARD";
        BANK_OR_CREDIT_CARD_STATEMENT.value = "BANK_OR_CREDIT_CARD_STATEMENT";
        BANK_REFERENCE_LETTER.value = "BANK_REFERENCE_LETTER";
        BIRTH_CERTIFICATE.value = "BIRTH_CERTIFICATE";
        DEED_POLL.value = "DEED_POLL";
        DEED_POLL_NAME_CHANGE.value = "DEED_POLL_NAME_CHANGE";
        DRIVERS_LICENSE.value = "DRIVERS_LICENSE";
        DRIVERS_LICENSE_BACK.value = "DRIVERS_LICENSE_BACK";
        DRIVERS_LICENSE_NAME_CHANGE.value = "DRIVERS_LICENSE_NAME_CHANGE";
        FIREARMS_LICENSE.value = "FIREARMS_LICENSE";
        HEALTH_ID_CARD.value = "HEALTH_ID_CARD";
        HIGH_QUALITY_HEADSHOT.value = "HIGH_QUALITY_HEADSHOT";
        MARRIAGE_LICENSE.value = "MARRIAGE_LICENSE";
        MARRIAGE_LICENSE_NAME_CHANGE.value = "MARRIAGE_LICENSE_NAME_CHANGE";
        MATRICULA_CONSULAR_ID_CARD.value = "MATRICULA_CONSULAR_ID_CARD";
        NATIONAL_IDENTITY_CARD.value = "NATIONAL_IDENTITY_CARD";
        NATIONAL_IDENTITY_CARD_FRONT.value = "NATIONAL_IDENTITY_CARD_FRONT";
        NATIONAL_IDENTITY_CARD_BACK.value = "NATIONAL_IDENTITY_CARD_BACK";
        NATIONAL_INSURANCE_CARD.value = "NATIONAL_INSURANCE_CARD";
        OFFICIAL_NAME_CHANGE_DOCUMENT.value = "OFFICIAL_NAME_CHANGE_DOCUMENT";
        OTHER_GOVERNMENT_ISSUED_ID.value = "OTHER_GOVERNMENT_ISSUED_ID";
        PASSPORT.value = "PASSPORT";
        PAY_STUB.value = "PAY_STUB";
        PROOF_OF_AGE_CARD.value = "PROOF_OF_AGE_CARD";
        PROVISIONAL_DRIVERS_LICENSE.value = "PROVISIONAL_DRIVERS_LICENSE";
        PUBLIC_SERVICE_CARD_FRONT.value = "PUBLIC_SERVICE_CARD_FRONT";
        PUBLIC_SERVICE_CARD_BACK.value = "PUBLIC_SERVICE_CARD_BACK";
        RESIDENT_CARD.value = "RESIDENT_CARD";
        RESIDENT_IMMIGRATION_CARD.value = "RESIDENT_IMMIGRATION_CARD";
        SOCIAL_SECURITY_CARD.value = "SOCIAL_SECURITY_CARD";
        TAX_IDENTIFICATION_CARD_OR_LETTER.value = "TAX_IDENTIFICATION_CARD_OR_LETTER";
        TAX_STATEMENT.value = "TAX_STATEMENT";
        UTILITY_BILL.value = "UTILITY_BILL";
        VOTERS_CARD.value = "VOTERS_CARD";
        ARMED_FORCES_ID_CARD_BACK.value = "ARMED_FORCES_ID_CARD_BACK";
        TAX_DOCUMENT.value = "TAX_DOCUMENT";
        HEALTH_ID_CARD_BACK.value = "HEALTH_ID_CARD_BACK";
        PROOF_OF_AGE_CARD_BACK.value = "PROOF_OF_AGE_CARD_BACK";
        INDEPENDENT_PERSONAL_REFERENCE_DOCUMENT.value = "INDEPENDENT_PERSONAL_REFERENCE_DOCUMENT";
        VIDEO_CALL_FILE.value = "VIDEO_CALL_FILE";
        HOME_OR_AUTO_INSURANCE_CERTIFICATE_OR_SCHEDULE.value = "HOME_OR_AUTO_INSURANCE_CERTIFICATE_OR_SCHEDULE";
        DIVORCE_DECREE_NAME_CHANGE.value = "DIVORCE_DECREE_NAME_CHANGE";
        CIVIL_PARTNERSHIP_REGISTRATION_NAME_CHANGE.value = "CIVIL_PARTNERSHIP_REGISTRATION_NAME_CHANGE";
        RENT_AGREEMENT.value = "RENT_AGREEMENT";
        VEHICLE_REGISTRATION.value = "VEHICLE_REGISTRATION";
        BENEFITS_CONFIRMATION_LETTER.value = "BENEFITS_CONFIRMATION_LETTER";
        RESIDENT_CARD_BACK.value = "RESIDENT_CARD_BACK";
        LOAN_ACCOUNT_STATEMENT.value = "LOAN_ACCOUNT_STATEMENT";
        PROCESSED_CHECK.value = "PROCESSED_CHECK";
        RESIDENTIAL_DIRECTORY_LISTING.value = "RESIDENTIAL_DIRECTORY_LISTING";
        GENERIC_DOCUMENT.value = "GENERIC_DOCUMENT";
        GOVERNMENT_ISSUED_PHOTOID.value = "GOVERNMENT_ISSUED_PHOTOID";
        GOVERNMENT_ISSUED_PHOTO_ID_BACK.value = "GOVERNMENT_ISSUED_PHOTO_ID_BACK";
        SOCIAL_INSURANCE_NUMBER_CARD.value = "SOCIAL_INSURANCE_NUMBER_CARD";
        SOCIAL_INSURANCE_NUMBER_LETTER.value = "SOCIAL_INSURANCE_NUMBER_LETTER";
        OTHER_SOCIAL_INSURANCE_NUMBER_DOCUMENT.value = "OTHER_SOCIAL_INSURANCE_NUMBER_DOCUMENT";
        PLASTIC_CARD_CUSTOM_IMAGE.value = "PLASTIC_CARD_CUSTOM_IMAGE";

        valueMap.put("UNDEFINED", UNDEFINED);
        valueMap.put("ARMED_FORCES_ID_CARD", ARMED_FORCES_ID_CARD);
        valueMap.put("BANK_OR_CREDIT_CARD_STATEMENT", BANK_OR_CREDIT_CARD_STATEMENT);
        valueMap.put("BANK_REFERENCE_LETTER", BANK_REFERENCE_LETTER);
        valueMap.put("BIRTH_CERTIFICATE", BIRTH_CERTIFICATE);
        valueMap.put("DEED_POLL", DEED_POLL);
        valueMap.put("DEED_POLL_NAME_CHANGE", DEED_POLL_NAME_CHANGE);
        valueMap.put("DRIVERS_LICENSE", DRIVERS_LICENSE);
        valueMap.put("DRIVERS_LICENSE_BACK", DRIVERS_LICENSE_BACK);
        valueMap.put("DRIVERS_LICENSE_NAME_CHANGE", DRIVERS_LICENSE_NAME_CHANGE);
        valueMap.put("FIREARMS_LICENSE", FIREARMS_LICENSE);
        valueMap.put("HEALTH_ID_CARD", HEALTH_ID_CARD);
        valueMap.put("HIGH_QUALITY_HEADSHOT", HIGH_QUALITY_HEADSHOT);
        valueMap.put("MARRIAGE_LICENSE", MARRIAGE_LICENSE);
        valueMap.put("MARRIAGE_LICENSE_NAME_CHANGE", MARRIAGE_LICENSE_NAME_CHANGE);
        valueMap.put("MATRICULA_CONSULAR_ID_CARD", MATRICULA_CONSULAR_ID_CARD);
        valueMap.put("NATIONAL_IDENTITY_CARD", NATIONAL_IDENTITY_CARD);
        valueMap.put("NATIONAL_IDENTITY_CARD_FRONT", NATIONAL_IDENTITY_CARD_FRONT);
        valueMap.put("NATIONAL_IDENTITY_CARD_BACK", NATIONAL_IDENTITY_CARD_BACK);
        valueMap.put("NATIONAL_INSURANCE_CARD", NATIONAL_INSURANCE_CARD);
        valueMap.put("OFFICIAL_NAME_CHANGE_DOCUMENT", OFFICIAL_NAME_CHANGE_DOCUMENT);
        valueMap.put("OTHER_GOVERNMENT_ISSUED_ID", OTHER_GOVERNMENT_ISSUED_ID);
        valueMap.put("PASSPORT", PASSPORT);
        valueMap.put("PAY_STUB", PAY_STUB);
        valueMap.put("PROOF_OF_AGE_CARD", PROOF_OF_AGE_CARD);
        valueMap.put("PROVISIONAL_DRIVERS_LICENSE", PROVISIONAL_DRIVERS_LICENSE);
        valueMap.put("PUBLIC_SERVICE_CARD_FRONT", PUBLIC_SERVICE_CARD_FRONT);
        valueMap.put("PUBLIC_SERVICE_CARD_BACK", PUBLIC_SERVICE_CARD_BACK);
        valueMap.put("RESIDENT_CARD", RESIDENT_CARD);
        valueMap.put("RESIDENT_IMMIGRATION_CARD", RESIDENT_IMMIGRATION_CARD);
        valueMap.put("SOCIAL_SECURITY_CARD", SOCIAL_SECURITY_CARD);
        valueMap.put("TAX_IDENTIFICATION_CARD_OR_LETTER", TAX_IDENTIFICATION_CARD_OR_LETTER);
        valueMap.put("TAX_STATEMENT", TAX_STATEMENT);
        valueMap.put("UTILITY_BILL", UTILITY_BILL);
        valueMap.put("VOTERS_CARD", VOTERS_CARD);
        valueMap.put("ARMED_FORCES_ID_CARD_BACK", ARMED_FORCES_ID_CARD_BACK);
        valueMap.put("TAX_DOCUMENT", TAX_DOCUMENT);
        valueMap.put("HEALTH_ID_CARD_BACK", HEALTH_ID_CARD_BACK);
        valueMap.put("PROOF_OF_AGE_CARD_BACK", PROOF_OF_AGE_CARD_BACK);
        valueMap.put("INDEPENDENT_PERSONAL_REFERENCE_DOCUMENT", INDEPENDENT_PERSONAL_REFERENCE_DOCUMENT);
        valueMap.put("VIDEO_CALL_FILE", VIDEO_CALL_FILE);
        valueMap.put("HOME_OR_AUTO_INSURANCE_CERTIFICATE_OR_SCHEDULE", HOME_OR_AUTO_INSURANCE_CERTIFICATE_OR_SCHEDULE);
        valueMap.put("DIVORCE_DECREE_NAME_CHANGE", DIVORCE_DECREE_NAME_CHANGE);
        valueMap.put("CIVIL_PARTNERSHIP_REGISTRATION_NAME_CHANGE", CIVIL_PARTNERSHIP_REGISTRATION_NAME_CHANGE);
        valueMap.put("RENT_AGREEMENT", RENT_AGREEMENT);
        valueMap.put("VEHICLE_REGISTRATION", VEHICLE_REGISTRATION);
        valueMap.put("BENEFITS_CONFIRMATION_LETTER", BENEFITS_CONFIRMATION_LETTER);
        valueMap.put("RESIDENT_CARD_BACK", RESIDENT_CARD_BACK);
        valueMap.put("LOAN_ACCOUNT_STATEMENT", LOAN_ACCOUNT_STATEMENT);
        valueMap.put("PROCESSED_CHECK", PROCESSED_CHECK);
        valueMap.put("RESIDENTIAL_DIRECTORY_LISTING", RESIDENTIAL_DIRECTORY_LISTING);
        valueMap.put("GENERIC_DOCUMENT", GENERIC_DOCUMENT);
        valueMap.put("GOVERNMENT_ISSUED_PHOTOID", GOVERNMENT_ISSUED_PHOTOID);
        valueMap.put("GOVERNMENT_ISSUED_PHOTO_ID_BACK", GOVERNMENT_ISSUED_PHOTO_ID_BACK);
        valueMap.put("SOCIAL_INSURANCE_NUMBER_CARD", SOCIAL_INSURANCE_NUMBER_CARD);
        valueMap.put("SOCIAL_INSURANCE_NUMBER_LETTER", SOCIAL_INSURANCE_NUMBER_LETTER);
        valueMap.put("OTHER_SOCIAL_INSURANCE_NUMBER_DOCUMENT", OTHER_SOCIAL_INSURANCE_NUMBER_DOCUMENT);
        valueMap.put("PLASTIC_CARD_CUSTOM_IMAGE", PLASTIC_CARD_CUSTOM_IMAGE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DocumentTypes constructFromString(String toConvert) throws IOException {
        DocumentTypes enumValue = fromString(toConvert);
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
    public static DocumentTypes fromString(String toConvert) {
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
     * Convert list of DocumentTypes values to list of string values.
     * @param toConvert The list of DocumentTypes values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DocumentTypes> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DocumentTypes enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
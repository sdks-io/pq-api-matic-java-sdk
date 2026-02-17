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
 * BankAccountFields to be used.
 */
public enum BankAccountFields {
    /**
     * The nine-digit code based on the U.S. Bank location where the account was opened.
     */
    BANK_ACH_ABA,

    /**
     * The code that identifies an individual account, at a specific financial institution, in a particular country, often referred to as the acount number.
     */
    BANK_BBAN,

    /**
     * A code of a bank helps customers and bankers identify a particular bank branch.
     */
    BANK_BRANCH_CODE,

    /**
     * Name of branch for the actual financial institution. For example,`Bank of America`.
     */
    BANK_BRANCH_NAME,

    /**
     * The 6-digit number used to identify the individual branch of a financial institution used in addition to the bank account number to identify the recipient of a transfer. For example,`082902`. where: `08` is the two-digit code for NAB bank. `2` is the branch is located in Australian Capital Territory. `902` is the NAB branch in Canberra City.
     */
    BANK_BSB_CODE,

    /**
     * The city in which the bank or financial institution associated with an account is located.
     */
    BANK_CITY,

    /**
     * CLABE (Clace Bancaria Estandarizada) The 18-digit account code containing the payee's bank account number. For example, `014027000000000008`.
     */
    BANK_CLABE,

    /**
     * Bank code of bank assigned to a bank.
     */
    BANK_CODE,

    /**
     * The ID number provided by the Mexican government to Mexican citizens and residents
     */
    BANK_CURP,

    /**
     * The standard international numbering system that identifies an overseas bank account. The number starts with a two-digit country code, then two numbers, followed by several more alphanumeric characters. For example,`Norway: NO 93 8601 1117947`.
     */
    BANK_IBAN,

    /**
     * Name of actual financial institution. For example,`Bank of America`.
     */
    BANK_NAME,

    /**
     * The 8- or 11-digit Business Identifier Code (BIC) for a bank that does not allow for sending and receiving financial transaction information. For example,`AAAABBCCDDD`.
     */
    BANK_NON_SWIFT_BIC,

    /**
     * Nigerian Uniform Bank Account Number (NUBAN) The 10-digit standard international numbering system that identifies a Nigerian bank account. For example, `0000013679`. where: `000001367` is the serial number (the first 9 digits) and is used to indicate which bank the NUBAN is associated with, as well as to point to a specific bank account at that bank. `9` (the last digit) is the [check digit](https://en.wikipedia.org/wiki/Check_digit) that determines whether the code in question is valid.
     */
    BANK_NUBAN,

    /**
     * The phone number for the actual financial institution.
     */
    BANK_PHONE_NUMBER,

    /**
     * The 5-digit postal code of the account owner's permanent residence. For example, `50314`.
     */
    BANK_POSTAL_CODE,

    /**
     * The code that represents the purpose for initiating a payment to a foreign country. For example,`/BANK/FUND TR`which is a cross-border fund transfer between banks.
     */
    BANK_PURPOSE_OF_PAYMENT_CODE,

    /**
     * The two-letter region [ISO abbreviation code](https://en.wikipedia.org/wiki/ISO_3166-1) of the bank's physical address.
     */
    BANK_REGION,

    /**
     * Resident Foreign Currency (RFC)The account maintained in foreign currencies for NRIs who have returned to India and hold funds in foreign currency. For example, `USD` and `GBP`.
     */
    BANK_RFC,

    /**
     * Identifies both the bank and the branch where the account is held. Sort codes used to route money transfers between financial institutions in the United Kingdom and in the Republic of Ireland. For example, `12-34-56`.
     */
    BANK_SORT_CODE,

    /**
     * TO BE DONE
     */
    BANK_SSN,

    /**
     * The bank address's most specific details, like `street number`, `street name`, and `building name`.
     */
    BANK_STREET_ADDRESS,

    /**
     * The 8- or 11-digit Business Identifier Code (BIC) for a bank that allows for sending and receiving financial transaction information. For example, `AAAABBCCDDD` where: `AAAA` is the 4-character bank code. `BB` is the 2-character country code. `CC` is the 2-character location code. `DD` is the 3-character branch code.
     */
    BANK_SWIFT_BIC,

    /**
     * The 9-digit code that identifies a specific financial institution. For example, `XXXXYYYYC` where: `XXXX` is the 4-digit Federal Reserve Routing Symbol. `YYYY` is the 4-digit ABA Institution Identifier. `C` is the 1-digit check digit.
     */
    BANK_TRANSIT_CODE,

    /**
     * The 9-digit value-added tax number for the bank that is designed to tax only the value added by a business on top of the services and goods it can purchase.
     */
    BANK_VALUE_ADD_TAX,

    /**
     * The unique identifier for the beneficial owner. For example,`caa81a5f-ec1e-4559-8b32-d90655bfd03c`.
     */
    BENEFICIARY_ACCOUNT_NUMBER,

    /**
     * The beneficial owner's residential address.
     */
    BENEFICIARY_ADDRESS,

    /**
     * The legal full name for the beneficial owner.
     */
    BENEFICIARY_NAME,

    /**
     * The phone number for the beneficial owner.
     */
    BENEFICIARY_PHONE_NUMBER,

    /**
     * The tax ID for the beneficial owner.
     */
    BENEFICIARY_TAX_ID,

    /**
     * Undefined or unrecognized bank account field.
     */
    UNDEFINED;


    private static TreeMap<String, BankAccountFields> valueMap = new TreeMap<>();
    private String value;

    static {
        BANK_ACH_ABA.value = "BANK_ACH_ABA";
        BANK_BBAN.value = "BANK_BBAN";
        BANK_BRANCH_CODE.value = "BANK_BRANCH_CODE";
        BANK_BRANCH_NAME.value = "BANK_BRANCH_NAME";
        BANK_BSB_CODE.value = "BANK_BSB_CODE";
        BANK_CITY.value = "BANK_CITY";
        BANK_CLABE.value = "BANK_CLABE";
        BANK_CODE.value = "BANK_CODE";
        BANK_CURP.value = "BANK_CURP";
        BANK_IBAN.value = "BANK_IBAN";
        BANK_NAME.value = "BANK_NAME";
        BANK_NON_SWIFT_BIC.value = "BANK_NON_SWIFT_BIC";
        BANK_NUBAN.value = "BANK_NUBAN";
        BANK_PHONE_NUMBER.value = "BANK_PHONE_NUMBER";
        BANK_POSTAL_CODE.value = "BANK_POSTAL_CODE";
        BANK_PURPOSE_OF_PAYMENT_CODE.value = "BANK_PURPOSE_OF_PAYMENT_CODE";
        BANK_REGION.value = "BANK_REGION";
        BANK_RFC.value = "BANK_RFC";
        BANK_SORT_CODE.value = "BANK_SORT_CODE";
        BANK_SSN.value = "BANK_SSN";
        BANK_STREET_ADDRESS.value = "BANK_STREET_ADDRESS";
        BANK_SWIFT_BIC.value = "BANK_SWIFT_BIC";
        BANK_TRANSIT_CODE.value = "BANK_TRANSIT_CODE";
        BANK_VALUE_ADD_TAX.value = "BANK_VALUE_ADD_TAX";
        BENEFICIARY_ACCOUNT_NUMBER.value = "BENEFICIARY_ACCOUNT_NUMBER";
        BENEFICIARY_ADDRESS.value = "BENEFICIARY_ADDRESS";
        BENEFICIARY_NAME.value = "BENEFICIARY_NAME";
        BENEFICIARY_PHONE_NUMBER.value = "BENEFICIARY_PHONE_NUMBER";
        BENEFICIARY_TAX_ID.value = "BENEFICIARY_TAX_ID";
        UNDEFINED.value = "UNDEFINED";

        valueMap.put("BANK_ACH_ABA", BANK_ACH_ABA);
        valueMap.put("BANK_BBAN", BANK_BBAN);
        valueMap.put("BANK_BRANCH_CODE", BANK_BRANCH_CODE);
        valueMap.put("BANK_BRANCH_NAME", BANK_BRANCH_NAME);
        valueMap.put("BANK_BSB_CODE", BANK_BSB_CODE);
        valueMap.put("BANK_CITY", BANK_CITY);
        valueMap.put("BANK_CLABE", BANK_CLABE);
        valueMap.put("BANK_CODE", BANK_CODE);
        valueMap.put("BANK_CURP", BANK_CURP);
        valueMap.put("BANK_IBAN", BANK_IBAN);
        valueMap.put("BANK_NAME", BANK_NAME);
        valueMap.put("BANK_NON_SWIFT_BIC", BANK_NON_SWIFT_BIC);
        valueMap.put("BANK_NUBAN", BANK_NUBAN);
        valueMap.put("BANK_PHONE_NUMBER", BANK_PHONE_NUMBER);
        valueMap.put("BANK_POSTAL_CODE", BANK_POSTAL_CODE);
        valueMap.put("BANK_PURPOSE_OF_PAYMENT_CODE", BANK_PURPOSE_OF_PAYMENT_CODE);
        valueMap.put("BANK_REGION", BANK_REGION);
        valueMap.put("BANK_RFC", BANK_RFC);
        valueMap.put("BANK_SORT_CODE", BANK_SORT_CODE);
        valueMap.put("BANK_SSN", BANK_SSN);
        valueMap.put("BANK_STREET_ADDRESS", BANK_STREET_ADDRESS);
        valueMap.put("BANK_SWIFT_BIC", BANK_SWIFT_BIC);
        valueMap.put("BANK_TRANSIT_CODE", BANK_TRANSIT_CODE);
        valueMap.put("BANK_VALUE_ADD_TAX", BANK_VALUE_ADD_TAX);
        valueMap.put("BENEFICIARY_ACCOUNT_NUMBER", BENEFICIARY_ACCOUNT_NUMBER);
        valueMap.put("BENEFICIARY_ADDRESS", BENEFICIARY_ADDRESS);
        valueMap.put("BENEFICIARY_NAME", BENEFICIARY_NAME);
        valueMap.put("BENEFICIARY_PHONE_NUMBER", BENEFICIARY_PHONE_NUMBER);
        valueMap.put("BENEFICIARY_TAX_ID", BENEFICIARY_TAX_ID);
        valueMap.put("UNDEFINED", UNDEFINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BankAccountFields constructFromString(String toConvert) throws IOException {
        BankAccountFields enumValue = fromString(toConvert);
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
    public static BankAccountFields fromString(String toConvert) {
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
     * Convert list of BankAccountFields values to list of string values.
     * @param toConvert The list of BankAccountFields values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankAccountFields> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankAccountFields enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
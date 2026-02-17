/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ReceiptDetails type.
 */
public class ReceiptDetails
        extends BaseModel {
    private String bankAccountId;
    private BankAccountFields bankAccountIdType;
    private String bankName;
    private String bankId;
    private BankAccountFields bankIdType;
    private String branchAddress;
    private String branchCity;
    private String branchId;
    private String branchName;
    private String branchPostalCode;
    private String branchPhoneNumber;
    private String branchRegion;
    private String beneficaryTaxId;
    private BankAccountFields beneficaryTaxIdType;
    private String beneficaryName;
    private String memo;
    private String note;
    private String correlationToken;
    private String cardExpiryDate;
    private String cardHolderName;
    private String cardNumber;
    private String electronicWalletAccountNumber;
    private ElectronicWalletFields electronicWalletAccountNumberType;
    private String electronicWalletGovernmentId;
    private ElectronicWalletFields electronicWalletGovernmentIdType;
    private ElectronicWalletTypes electronicWalletType;
    private String mobilePhoneNumber;
    private ElectronicFundsTransferTypes electronicFundsTransferType;
    private ElectronicTransferFailureTypes electronicFundsTransferFailureType;
    private ElectronicTransferStatusTypes electronicTransferStatusType;

    /**
     * Default constructor.
     */
    public ReceiptDetails() {
    }

    /**
     * Initialization constructor.
     * @param  bankAccountId  String value for bankAccountId.
     * @param  bankAccountIdType  BankAccountFields value for bankAccountIdType.
     * @param  bankName  String value for bankName.
     * @param  bankId  String value for bankId.
     * @param  bankIdType  BankAccountFields value for bankIdType.
     * @param  branchAddress  String value for branchAddress.
     * @param  branchCity  String value for branchCity.
     * @param  branchId  String value for branchId.
     * @param  branchName  String value for branchName.
     * @param  branchPostalCode  String value for branchPostalCode.
     * @param  branchPhoneNumber  String value for branchPhoneNumber.
     * @param  branchRegion  String value for branchRegion.
     * @param  beneficaryTaxId  String value for beneficaryTaxId.
     * @param  beneficaryTaxIdType  BankAccountFields value for beneficaryTaxIdType.
     * @param  beneficaryName  String value for beneficaryName.
     * @param  memo  String value for memo.
     * @param  note  String value for note.
     * @param  correlationToken  String value for correlationToken.
     * @param  cardExpiryDate  String value for cardExpiryDate.
     * @param  cardHolderName  String value for cardHolderName.
     * @param  cardNumber  String value for cardNumber.
     * @param  electronicWalletAccountNumber  String value for electronicWalletAccountNumber.
     * @param  electronicWalletAccountNumberType  ElectronicWalletFields value for
     *         electronicWalletAccountNumberType.
     * @param  electronicWalletGovernmentId  String value for electronicWalletGovernmentId.
     * @param  electronicWalletGovernmentIdType  ElectronicWalletFields value for
     *         electronicWalletGovernmentIdType.
     * @param  electronicWalletType  ElectronicWalletTypes value for electronicWalletType.
     * @param  mobilePhoneNumber  String value for mobilePhoneNumber.
     * @param  electronicFundsTransferType  ElectronicFundsTransferTypes value for
     *         electronicFundsTransferType.
     * @param  electronicFundsTransferFailureType  ElectronicTransferFailureTypes value for
     *         electronicFundsTransferFailureType.
     * @param  electronicTransferStatusType  ElectronicTransferStatusTypes value for
     *         electronicTransferStatusType.
     */
    public ReceiptDetails(
            String bankAccountId,
            BankAccountFields bankAccountIdType,
            String bankName,
            String bankId,
            BankAccountFields bankIdType,
            String branchAddress,
            String branchCity,
            String branchId,
            String branchName,
            String branchPostalCode,
            String branchPhoneNumber,
            String branchRegion,
            String beneficaryTaxId,
            BankAccountFields beneficaryTaxIdType,
            String beneficaryName,
            String memo,
            String note,
            String correlationToken,
            String cardExpiryDate,
            String cardHolderName,
            String cardNumber,
            String electronicWalletAccountNumber,
            ElectronicWalletFields electronicWalletAccountNumberType,
            String electronicWalletGovernmentId,
            ElectronicWalletFields electronicWalletGovernmentIdType,
            ElectronicWalletTypes electronicWalletType,
            String mobilePhoneNumber,
            ElectronicFundsTransferTypes electronicFundsTransferType,
            ElectronicTransferFailureTypes electronicFundsTransferFailureType,
            ElectronicTransferStatusTypes electronicTransferStatusType) {
        this.bankAccountId = bankAccountId;
        this.bankAccountIdType = bankAccountIdType;
        this.bankName = bankName;
        this.bankId = bankId;
        this.bankIdType = bankIdType;
        this.branchAddress = branchAddress;
        this.branchCity = branchCity;
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchPostalCode = branchPostalCode;
        this.branchPhoneNumber = branchPhoneNumber;
        this.branchRegion = branchRegion;
        this.beneficaryTaxId = beneficaryTaxId;
        this.beneficaryTaxIdType = beneficaryTaxIdType;
        this.beneficaryName = beneficaryName;
        this.memo = memo;
        this.note = note;
        this.correlationToken = correlationToken;
        this.cardExpiryDate = cardExpiryDate;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.electronicWalletAccountNumber = electronicWalletAccountNumber;
        this.electronicWalletAccountNumberType = electronicWalletAccountNumberType;
        this.electronicWalletGovernmentId = electronicWalletGovernmentId;
        this.electronicWalletGovernmentIdType = electronicWalletGovernmentIdType;
        this.electronicWalletType = electronicWalletType;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.electronicFundsTransferType = electronicFundsTransferType;
        this.electronicFundsTransferFailureType = electronicFundsTransferFailureType;
        this.electronicTransferStatusType = electronicTransferStatusType;
    }

    /**
     * Getter for BankAccountId.
     * Bank account ID for the bank account
     * @return Returns the String
     */
    @JsonGetter("bankAccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Setter for BankAccountId.
     * Bank account ID for the bank account
     * @param bankAccountId Value for String
     */
    @JsonSetter("bankAccountId")
    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    /**
     * Getter for BankAccountIdType.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @return Returns the BankAccountFields
     */
    @JsonGetter("bankAccountIdType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountFields getBankAccountIdType() {
        return bankAccountIdType;
    }

    /**
     * Setter for BankAccountIdType.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @param bankAccountIdType Value for BankAccountFields
     */
    @JsonSetter("bankAccountIdType")
    public void setBankAccountIdType(BankAccountFields bankAccountIdType) {
        this.bankAccountIdType = bankAccountIdType;
    }

    /**
     * Getter for BankName.
     * Name of the bank the account is registered to
     * @return Returns the String
     */
    @JsonGetter("bankName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * Name of the bank the account is registered to
     * @param bankName Value for String
     */
    @JsonSetter("bankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for BankId.
     * The bank id
     * @return Returns the String
     */
    @JsonGetter("bankId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankId() {
        return bankId;
    }

    /**
     * Setter for BankId.
     * The bank id
     * @param bankId Value for String
     */
    @JsonSetter("bankId")
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * Getter for BankIdType.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @return Returns the BankAccountFields
     */
    @JsonGetter("bankIdType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountFields getBankIdType() {
        return bankIdType;
    }

    /**
     * Setter for BankIdType.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @param bankIdType Value for BankAccountFields
     */
    @JsonSetter("bankIdType")
    public void setBankIdType(BankAccountFields bankIdType) {
        this.bankIdType = bankIdType;
    }

    /**
     * Getter for BranchAddress.
     * The bank branch address
     * @return Returns the String
     */
    @JsonGetter("branchAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchAddress() {
        return branchAddress;
    }

    /**
     * Setter for BranchAddress.
     * The bank branch address
     * @param branchAddress Value for String
     */
    @JsonSetter("branchAddress")
    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    /**
     * Getter for BranchCity.
     * The bank branch city
     * @return Returns the String
     */
    @JsonGetter("branchCity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchCity() {
        return branchCity;
    }

    /**
     * Setter for BranchCity.
     * The bank branch city
     * @param branchCity Value for String
     */
    @JsonSetter("branchCity")
    public void setBranchCity(String branchCity) {
        this.branchCity = branchCity;
    }

    /**
     * Getter for BranchId.
     * The bank branch id
     * @return Returns the String
     */
    @JsonGetter("branchId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchId() {
        return branchId;
    }

    /**
     * Setter for BranchId.
     * The bank branch id
     * @param branchId Value for String
     */
    @JsonSetter("branchId")
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * Getter for BranchName.
     * The bank branch name
     * @return Returns the String
     */
    @JsonGetter("branchName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchName() {
        return branchName;
    }

    /**
     * Setter for BranchName.
     * The bank branch name
     * @param branchName Value for String
     */
    @JsonSetter("branchName")
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * Getter for BranchPostalCode.
     * The bank branch postal code
     * @return Returns the String
     */
    @JsonGetter("branchPostalCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchPostalCode() {
        return branchPostalCode;
    }

    /**
     * Setter for BranchPostalCode.
     * The bank branch postal code
     * @param branchPostalCode Value for String
     */
    @JsonSetter("branchPostalCode")
    public void setBranchPostalCode(String branchPostalCode) {
        this.branchPostalCode = branchPostalCode;
    }

    /**
     * Getter for BranchPhoneNumber.
     * The bank branch phone number
     * @return Returns the String
     */
    @JsonGetter("branchPhoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchPhoneNumber() {
        return branchPhoneNumber;
    }

    /**
     * Setter for BranchPhoneNumber.
     * The bank branch phone number
     * @param branchPhoneNumber Value for String
     */
    @JsonSetter("branchPhoneNumber")
    public void setBranchPhoneNumber(String branchPhoneNumber) {
        this.branchPhoneNumber = branchPhoneNumber;
    }

    /**
     * Getter for BranchRegion.
     * The bank branch region
     * @return Returns the String
     */
    @JsonGetter("branchRegion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchRegion() {
        return branchRegion;
    }

    /**
     * Setter for BranchRegion.
     * The bank branch region
     * @param branchRegion Value for String
     */
    @JsonSetter("branchRegion")
    public void setBranchRegion(String branchRegion) {
        this.branchRegion = branchRegion;
    }

    /**
     * Getter for BeneficaryTaxId.
     * The beneficiary's tax id
     * @return Returns the String
     */
    @JsonGetter("beneficaryTaxId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBeneficaryTaxId() {
        return beneficaryTaxId;
    }

    /**
     * Setter for BeneficaryTaxId.
     * The beneficiary's tax id
     * @param beneficaryTaxId Value for String
     */
    @JsonSetter("beneficaryTaxId")
    public void setBeneficaryTaxId(String beneficaryTaxId) {
        this.beneficaryTaxId = beneficaryTaxId;
    }

    /**
     * Getter for BeneficaryTaxIdType.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @return Returns the BankAccountFields
     */
    @JsonGetter("beneficaryTaxIdType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountFields getBeneficaryTaxIdType() {
        return beneficaryTaxIdType;
    }

    /**
     * Setter for BeneficaryTaxIdType.
     * Classifies bank account [field types](#/rest/models/structures/bank-account-fields)
     * @param beneficaryTaxIdType Value for BankAccountFields
     */
    @JsonSetter("beneficaryTaxIdType")
    public void setBeneficaryTaxIdType(BankAccountFields beneficaryTaxIdType) {
        this.beneficaryTaxIdType = beneficaryTaxIdType;
    }

    /**
     * Getter for BeneficaryName.
     * The name of the person chosen to inherit your account
     * @return Returns the String
     */
    @JsonGetter("beneficaryName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBeneficaryName() {
        return beneficaryName;
    }

    /**
     * Setter for BeneficaryName.
     * The name of the person chosen to inherit your account
     * @param beneficaryName Value for String
     */
    @JsonSetter("beneficaryName")
    public void setBeneficaryName(String beneficaryName) {
        this.beneficaryName = beneficaryName;
    }

    /**
     * Getter for Memo.
     * Optional internal [memo](#/rest/models/structures/memo) not visible to the user
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * Optional internal [memo](#/rest/models/structures/memo) not visible to the user
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Note.
     * [Optional comments](#/rest/models/structures/notes) visible to the user
     * @return Returns the String
     */
    @JsonGetter("note")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * [Optional comments](#/rest/models/structures/notes) visible to the user
     * @param note Value for String
     */
    @JsonSetter("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Getter for CorrelationToken.
     * [Token](#/rest/models/structures/token) representing the resource
     * @return Returns the String
     */
    @JsonGetter("correlationToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCorrelationToken() {
        return correlationToken;
    }

    /**
     * Setter for CorrelationToken.
     * [Token](#/rest/models/structures/token) representing the resource
     * @param correlationToken Value for String
     */
    @JsonSetter("correlationToken")
    public void setCorrelationToken(String correlationToken) {
        this.correlationToken = correlationToken;
    }

    /**
     * Getter for CardExpiryDate.
     * Date that the card will expire
     * @return Returns the String
     */
    @JsonGetter("cardExpiryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Setter for CardExpiryDate.
     * Date that the card will expire
     * @param cardExpiryDate Value for String
     */
    @JsonSetter("cardExpiryDate")
    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    /**
     * Getter for CardHolderName.
     * Name of the card's owner
     * @return Returns the String
     */
    @JsonGetter("cardHolderName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Setter for CardHolderName.
     * Name of the card's owner
     * @param cardHolderName Value for String
     */
    @JsonSetter("cardHolderName")
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * Getter for CardNumber.
     * Unique number on the prepaid card
     * @return Returns the String
     */
    @JsonGetter("cardNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter for CardNumber.
     * Unique number on the prepaid card
     * @param cardNumber Value for String
     */
    @JsonSetter("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Getter for ElectronicWalletAccountNumber.
     * Account number for the electronic wallet
     * @return Returns the String
     */
    @JsonGetter("electronicWalletAccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getElectronicWalletAccountNumber() {
        return electronicWalletAccountNumber;
    }

    /**
     * Setter for ElectronicWalletAccountNumber.
     * Account number for the electronic wallet
     * @param electronicWalletAccountNumber Value for String
     */
    @JsonSetter("electronicWalletAccountNumber")
    public void setElectronicWalletAccountNumber(String electronicWalletAccountNumber) {
        this.electronicWalletAccountNumber = electronicWalletAccountNumber;
    }

    /**
     * Getter for ElectronicWalletAccountNumberType.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @return Returns the ElectronicWalletFields
     */
    @JsonGetter("electronicWalletAccountNumberType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletFields getElectronicWalletAccountNumberType() {
        return electronicWalletAccountNumberType;
    }

    /**
     * Setter for ElectronicWalletAccountNumberType.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @param electronicWalletAccountNumberType Value for ElectronicWalletFields
     */
    @JsonSetter("electronicWalletAccountNumberType")
    public void setElectronicWalletAccountNumberType(ElectronicWalletFields electronicWalletAccountNumberType) {
        this.electronicWalletAccountNumberType = electronicWalletAccountNumberType;
    }

    /**
     * Getter for ElectronicWalletGovernmentId.
     * Government ID for the electronic wallet
     * @return Returns the String
     */
    @JsonGetter("electronicWalletGovernmentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getElectronicWalletGovernmentId() {
        return electronicWalletGovernmentId;
    }

    /**
     * Setter for ElectronicWalletGovernmentId.
     * Government ID for the electronic wallet
     * @param electronicWalletGovernmentId Value for String
     */
    @JsonSetter("electronicWalletGovernmentId")
    public void setElectronicWalletGovernmentId(String electronicWalletGovernmentId) {
        this.electronicWalletGovernmentId = electronicWalletGovernmentId;
    }

    /**
     * Getter for ElectronicWalletGovernmentIdType.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @return Returns the ElectronicWalletFields
     */
    @JsonGetter("electronicWalletGovernmentIdType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletFields getElectronicWalletGovernmentIdType() {
        return electronicWalletGovernmentIdType;
    }

    /**
     * Setter for ElectronicWalletGovernmentIdType.
     * Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields)
     * @param electronicWalletGovernmentIdType Value for ElectronicWalletFields
     */
    @JsonSetter("electronicWalletGovernmentIdType")
    public void setElectronicWalletGovernmentIdType(ElectronicWalletFields electronicWalletGovernmentIdType) {
        this.electronicWalletGovernmentIdType = electronicWalletGovernmentIdType;
    }

    /**
     * Getter for ElectronicWalletType.
     * Name of the electronic wallet
     * @return Returns the ElectronicWalletTypes
     */
    @JsonGetter("electronicWalletType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicWalletTypes getElectronicWalletType() {
        return electronicWalletType;
    }

    /**
     * Setter for ElectronicWalletType.
     * Name of the electronic wallet
     * @param electronicWalletType Value for ElectronicWalletTypes
     */
    @JsonSetter("electronicWalletType")
    public void setElectronicWalletType(ElectronicWalletTypes electronicWalletType) {
        this.electronicWalletType = electronicWalletType;
    }

    /**
     * Getter for MobilePhoneNumber.
     * @return Returns the String
     */
    @JsonGetter("mobilePhoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Setter for MobilePhoneNumber.
     * @param mobilePhoneNumber Value for String
     */
    @JsonSetter("mobilePhoneNumber")
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    /**
     * Getter for ElectronicFundsTransferType.
     * The type of transfer performed
     * @return Returns the ElectronicFundsTransferTypes
     */
    @JsonGetter("electronicFundsTransferType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicFundsTransferTypes getElectronicFundsTransferType() {
        return electronicFundsTransferType;
    }

    /**
     * Setter for ElectronicFundsTransferType.
     * The type of transfer performed
     * @param electronicFundsTransferType Value for ElectronicFundsTransferTypes
     */
    @JsonSetter("electronicFundsTransferType")
    public void setElectronicFundsTransferType(ElectronicFundsTransferTypes electronicFundsTransferType) {
        this.electronicFundsTransferType = electronicFundsTransferType;
    }

    /**
     * Getter for ElectronicFundsTransferFailureType.
     * The type of failure for a bank transfer
     * @return Returns the ElectronicTransferFailureTypes
     */
    @JsonGetter("electronicFundsTransferFailureType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicTransferFailureTypes getElectronicFundsTransferFailureType() {
        return electronicFundsTransferFailureType;
    }

    /**
     * Setter for ElectronicFundsTransferFailureType.
     * The type of failure for a bank transfer
     * @param electronicFundsTransferFailureType Value for ElectronicTransferFailureTypes
     */
    @JsonSetter("electronicFundsTransferFailureType")
    public void setElectronicFundsTransferFailureType(ElectronicTransferFailureTypes electronicFundsTransferFailureType) {
        this.electronicFundsTransferFailureType = electronicFundsTransferFailureType;
    }

    /**
     * Getter for ElectronicTransferStatusType.
     * The status of a bank transfer
     * @return Returns the ElectronicTransferStatusTypes
     */
    @JsonGetter("electronicTransferStatusType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ElectronicTransferStatusTypes getElectronicTransferStatusType() {
        return electronicTransferStatusType;
    }

    /**
     * Setter for ElectronicTransferStatusType.
     * The status of a bank transfer
     * @param electronicTransferStatusType Value for ElectronicTransferStatusTypes
     */
    @JsonSetter("electronicTransferStatusType")
    public void setElectronicTransferStatusType(ElectronicTransferStatusTypes electronicTransferStatusType) {
        this.electronicTransferStatusType = electronicTransferStatusType;
    }

    /**
     * Converts this ReceiptDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReceiptDetails [" + "bankAccountId=" + bankAccountId + ", bankAccountIdType="
                + bankAccountIdType + ", bankName=" + bankName + ", bankId=" + bankId
                + ", bankIdType=" + bankIdType + ", branchAddress=" + branchAddress
                + ", branchCity=" + branchCity + ", branchId=" + branchId + ", branchName="
                + branchName + ", branchPostalCode=" + branchPostalCode + ", branchPhoneNumber="
                + branchPhoneNumber + ", branchRegion=" + branchRegion + ", beneficaryTaxId="
                + beneficaryTaxId + ", beneficaryTaxIdType=" + beneficaryTaxIdType
                + ", beneficaryName=" + beneficaryName + ", memo=" + memo + ", note=" + note
                + ", correlationToken=" + correlationToken + ", cardExpiryDate=" + cardExpiryDate
                + ", cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber
                + ", electronicWalletAccountNumber=" + electronicWalletAccountNumber
                + ", electronicWalletAccountNumberType=" + electronicWalletAccountNumberType
                + ", electronicWalletGovernmentId=" + electronicWalletGovernmentId
                + ", electronicWalletGovernmentIdType=" + electronicWalletGovernmentIdType
                + ", electronicWalletType=" + electronicWalletType + ", mobilePhoneNumber="
                + mobilePhoneNumber + ", electronicFundsTransferType=" + electronicFundsTransferType
                + ", electronicFundsTransferFailureType=" + electronicFundsTransferFailureType
                + ", electronicTransferStatusType=" + electronicTransferStatusType
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ReceiptDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReceiptDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankAccountId(getBankAccountId())
                .bankAccountIdType(getBankAccountIdType())
                .bankName(getBankName())
                .bankId(getBankId())
                .bankIdType(getBankIdType())
                .branchAddress(getBranchAddress())
                .branchCity(getBranchCity())
                .branchId(getBranchId())
                .branchName(getBranchName())
                .branchPostalCode(getBranchPostalCode())
                .branchPhoneNumber(getBranchPhoneNumber())
                .branchRegion(getBranchRegion())
                .beneficaryTaxId(getBeneficaryTaxId())
                .beneficaryTaxIdType(getBeneficaryTaxIdType())
                .beneficaryName(getBeneficaryName())
                .memo(getMemo())
                .note(getNote())
                .correlationToken(getCorrelationToken())
                .cardExpiryDate(getCardExpiryDate())
                .cardHolderName(getCardHolderName())
                .cardNumber(getCardNumber())
                .electronicWalletAccountNumber(getElectronicWalletAccountNumber())
                .electronicWalletAccountNumberType(getElectronicWalletAccountNumberType())
                .electronicWalletGovernmentId(getElectronicWalletGovernmentId())
                .electronicWalletGovernmentIdType(getElectronicWalletGovernmentIdType())
                .electronicWalletType(getElectronicWalletType())
                .mobilePhoneNumber(getMobilePhoneNumber())
                .electronicFundsTransferType(getElectronicFundsTransferType())
                .electronicFundsTransferFailureType(getElectronicFundsTransferFailureType())
                .electronicTransferStatusType(getElectronicTransferStatusType());
        return builder;
    }

    /**
     * Class to build instances of {@link ReceiptDetails}.
     */
    public static class Builder {
        private String bankAccountId;
        private BankAccountFields bankAccountIdType;
        private String bankName;
        private String bankId;
        private BankAccountFields bankIdType;
        private String branchAddress;
        private String branchCity;
        private String branchId;
        private String branchName;
        private String branchPostalCode;
        private String branchPhoneNumber;
        private String branchRegion;
        private String beneficaryTaxId;
        private BankAccountFields beneficaryTaxIdType;
        private String beneficaryName;
        private String memo;
        private String note;
        private String correlationToken;
        private String cardExpiryDate;
        private String cardHolderName;
        private String cardNumber;
        private String electronicWalletAccountNumber;
        private ElectronicWalletFields electronicWalletAccountNumberType;
        private String electronicWalletGovernmentId;
        private ElectronicWalletFields electronicWalletGovernmentIdType;
        private ElectronicWalletTypes electronicWalletType;
        private String mobilePhoneNumber;
        private ElectronicFundsTransferTypes electronicFundsTransferType;
        private ElectronicTransferFailureTypes electronicFundsTransferFailureType;
        private ElectronicTransferStatusTypes electronicTransferStatusType;



        /**
         * Setter for bankAccountId.
         * @param  bankAccountId  String value for bankAccountId.
         * @return Builder
         */
        public Builder bankAccountId(String bankAccountId) {
            this.bankAccountId = bankAccountId;
            return this;
        }

        /**
         * Setter for bankAccountIdType.
         * @param  bankAccountIdType  BankAccountFields value for bankAccountIdType.
         * @return Builder
         */
        public Builder bankAccountIdType(BankAccountFields bankAccountIdType) {
            this.bankAccountIdType = bankAccountIdType;
            return this;
        }

        /**
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Setter for bankId.
         * @param  bankId  String value for bankId.
         * @return Builder
         */
        public Builder bankId(String bankId) {
            this.bankId = bankId;
            return this;
        }

        /**
         * Setter for bankIdType.
         * @param  bankIdType  BankAccountFields value for bankIdType.
         * @return Builder
         */
        public Builder bankIdType(BankAccountFields bankIdType) {
            this.bankIdType = bankIdType;
            return this;
        }

        /**
         * Setter for branchAddress.
         * @param  branchAddress  String value for branchAddress.
         * @return Builder
         */
        public Builder branchAddress(String branchAddress) {
            this.branchAddress = branchAddress;
            return this;
        }

        /**
         * Setter for branchCity.
         * @param  branchCity  String value for branchCity.
         * @return Builder
         */
        public Builder branchCity(String branchCity) {
            this.branchCity = branchCity;
            return this;
        }

        /**
         * Setter for branchId.
         * @param  branchId  String value for branchId.
         * @return Builder
         */
        public Builder branchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        /**
         * Setter for branchName.
         * @param  branchName  String value for branchName.
         * @return Builder
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        /**
         * Setter for branchPostalCode.
         * @param  branchPostalCode  String value for branchPostalCode.
         * @return Builder
         */
        public Builder branchPostalCode(String branchPostalCode) {
            this.branchPostalCode = branchPostalCode;
            return this;
        }

        /**
         * Setter for branchPhoneNumber.
         * @param  branchPhoneNumber  String value for branchPhoneNumber.
         * @return Builder
         */
        public Builder branchPhoneNumber(String branchPhoneNumber) {
            this.branchPhoneNumber = branchPhoneNumber;
            return this;
        }

        /**
         * Setter for branchRegion.
         * @param  branchRegion  String value for branchRegion.
         * @return Builder
         */
        public Builder branchRegion(String branchRegion) {
            this.branchRegion = branchRegion;
            return this;
        }

        /**
         * Setter for beneficaryTaxId.
         * @param  beneficaryTaxId  String value for beneficaryTaxId.
         * @return Builder
         */
        public Builder beneficaryTaxId(String beneficaryTaxId) {
            this.beneficaryTaxId = beneficaryTaxId;
            return this;
        }

        /**
         * Setter for beneficaryTaxIdType.
         * @param  beneficaryTaxIdType  BankAccountFields value for beneficaryTaxIdType.
         * @return Builder
         */
        public Builder beneficaryTaxIdType(BankAccountFields beneficaryTaxIdType) {
            this.beneficaryTaxIdType = beneficaryTaxIdType;
            return this;
        }

        /**
         * Setter for beneficaryName.
         * @param  beneficaryName  String value for beneficaryName.
         * @return Builder
         */
        public Builder beneficaryName(String beneficaryName) {
            this.beneficaryName = beneficaryName;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * Setter for correlationToken.
         * @param  correlationToken  String value for correlationToken.
         * @return Builder
         */
        public Builder correlationToken(String correlationToken) {
            this.correlationToken = correlationToken;
            return this;
        }

        /**
         * Setter for cardExpiryDate.
         * @param  cardExpiryDate  String value for cardExpiryDate.
         * @return Builder
         */
        public Builder cardExpiryDate(String cardExpiryDate) {
            this.cardExpiryDate = cardExpiryDate;
            return this;
        }

        /**
         * Setter for cardHolderName.
         * @param  cardHolderName  String value for cardHolderName.
         * @return Builder
         */
        public Builder cardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        /**
         * Setter for cardNumber.
         * @param  cardNumber  String value for cardNumber.
         * @return Builder
         */
        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * Setter for electronicWalletAccountNumber.
         * @param  electronicWalletAccountNumber  String value for electronicWalletAccountNumber.
         * @return Builder
         */
        public Builder electronicWalletAccountNumber(String electronicWalletAccountNumber) {
            this.electronicWalletAccountNumber = electronicWalletAccountNumber;
            return this;
        }

        /**
         * Setter for electronicWalletAccountNumberType.
         * @param  electronicWalletAccountNumberType  ElectronicWalletFields value for
         *         electronicWalletAccountNumberType.
         * @return Builder
         */
        public Builder electronicWalletAccountNumberType(
                ElectronicWalletFields electronicWalletAccountNumberType) {
            this.electronicWalletAccountNumberType = electronicWalletAccountNumberType;
            return this;
        }

        /**
         * Setter for electronicWalletGovernmentId.
         * @param  electronicWalletGovernmentId  String value for electronicWalletGovernmentId.
         * @return Builder
         */
        public Builder electronicWalletGovernmentId(String electronicWalletGovernmentId) {
            this.electronicWalletGovernmentId = electronicWalletGovernmentId;
            return this;
        }

        /**
         * Setter for electronicWalletGovernmentIdType.
         * @param  electronicWalletGovernmentIdType  ElectronicWalletFields value for
         *         electronicWalletGovernmentIdType.
         * @return Builder
         */
        public Builder electronicWalletGovernmentIdType(
                ElectronicWalletFields electronicWalletGovernmentIdType) {
            this.electronicWalletGovernmentIdType = electronicWalletGovernmentIdType;
            return this;
        }

        /**
         * Setter for electronicWalletType.
         * @param  electronicWalletType  ElectronicWalletTypes value for electronicWalletType.
         * @return Builder
         */
        public Builder electronicWalletType(ElectronicWalletTypes electronicWalletType) {
            this.electronicWalletType = electronicWalletType;
            return this;
        }

        /**
         * Setter for mobilePhoneNumber.
         * @param  mobilePhoneNumber  String value for mobilePhoneNumber.
         * @return Builder
         */
        public Builder mobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }

        /**
         * Setter for electronicFundsTransferType.
         * @param  electronicFundsTransferType  ElectronicFundsTransferTypes value for
         *         electronicFundsTransferType.
         * @return Builder
         */
        public Builder electronicFundsTransferType(
                ElectronicFundsTransferTypes electronicFundsTransferType) {
            this.electronicFundsTransferType = electronicFundsTransferType;
            return this;
        }

        /**
         * Setter for electronicFundsTransferFailureType.
         * @param  electronicFundsTransferFailureType  ElectronicTransferFailureTypes value for
         *         electronicFundsTransferFailureType.
         * @return Builder
         */
        public Builder electronicFundsTransferFailureType(
                ElectronicTransferFailureTypes electronicFundsTransferFailureType) {
            this.electronicFundsTransferFailureType = electronicFundsTransferFailureType;
            return this;
        }

        /**
         * Setter for electronicTransferStatusType.
         * @param  electronicTransferStatusType  ElectronicTransferStatusTypes value for
         *         electronicTransferStatusType.
         * @return Builder
         */
        public Builder electronicTransferStatusType(
                ElectronicTransferStatusTypes electronicTransferStatusType) {
            this.electronicTransferStatusType = electronicTransferStatusType;
            return this;
        }

        /**
         * Builds a new {@link ReceiptDetails} object using the set fields.
         * @return {@link ReceiptDetails}
         */
        public ReceiptDetails build() {
            return new ReceiptDetails(bankAccountId, bankAccountIdType, bankName, bankId,
                    bankIdType, branchAddress, branchCity, branchId, branchName, branchPostalCode,
                    branchPhoneNumber, branchRegion, beneficaryTaxId, beneficaryTaxIdType,
                    beneficaryName, memo, note, correlationToken, cardExpiryDate, cardHolderName,
                    cardNumber, electronicWalletAccountNumber, electronicWalletAccountNumberType,
                    electronicWalletGovernmentId, electronicWalletGovernmentIdType,
                    electronicWalletType, mobilePhoneNumber, electronicFundsTransferType,
                    electronicFundsTransferFailureType, electronicTransferStatusType);
        }
    }
}

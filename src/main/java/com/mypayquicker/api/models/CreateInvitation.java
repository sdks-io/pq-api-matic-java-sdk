/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mypayquicker.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for CreateInvitation type.
 */
public class CreateInvitation
        extends BaseModel {
    private Currencies currency;
    private String programUserId;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private TaxResidentStatuses taxResidentStatus;
    private String phoneNumber;
    private String mobileNumber;
    private Countries phoneNumberCountry;
    private Countries mobileNumberCountry;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String region;
    private Countries country;
    private String postalCode;
    private Genders gender;
    private UserTypes userType;
    private Languages language;
    private Countries countryOfBirth;
    private Countries countryOfNationality;
    private BusinessContactRoles businessContactRole;
    private GovernmentIds governmentIdType;
    private String governmentId;
    private String occupationTitle;
    private Occupations occupationType;
    private String mailingAddressLine1;
    private String mailingAddressLine2;
    private String mailingAddressLine3;
    private Countries mailingCountry;
    private String mailingCity;
    private String mailingRegion;
    private String mailingPostalCode;
    private String businessAddressLine1;
    private String businessAddressLine2;
    private String businessAddressLine3;
    private Countries businessCountry;
    private String businessCity;
    private String businessRegion;
    private String businessPostalCode;
    private String premiseNumber;
    private String programToken;
    private String primaryUserToken;

    /**
     * Default constructor.
     */
    public CreateInvitation() {
        currency = Currencies.USD;
    }

    /**
     * Initialization constructor.
     * @param  currency  Currencies value for currency.
     * @param  programUserId  String value for programUserId.
     * @param  email  String value for email.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  dateOfBirth  LocalDateTime value for dateOfBirth.
     * @param  taxResidentStatus  TaxResidentStatuses value for taxResidentStatus.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  mobileNumber  String value for mobileNumber.
     * @param  phoneNumberCountry  Countries value for phoneNumberCountry.
     * @param  mobileNumberCountry  Countries value for mobileNumberCountry.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressLine3  String value for addressLine3.
     * @param  city  String value for city.
     * @param  region  String value for region.
     * @param  country  Countries value for country.
     * @param  postalCode  String value for postalCode.
     * @param  gender  Genders value for gender.
     * @param  userType  UserTypes value for userType.
     * @param  language  Languages value for language.
     * @param  countryOfBirth  Countries value for countryOfBirth.
     * @param  countryOfNationality  Countries value for countryOfNationality.
     * @param  businessContactRole  BusinessContactRoles value for businessContactRole.
     * @param  governmentIdType  GovernmentIds value for governmentIdType.
     * @param  governmentId  String value for governmentId.
     * @param  occupationTitle  String value for occupationTitle.
     * @param  occupationType  Occupations value for occupationType.
     * @param  mailingAddressLine1  String value for mailingAddressLine1.
     * @param  mailingAddressLine2  String value for mailingAddressLine2.
     * @param  mailingAddressLine3  String value for mailingAddressLine3.
     * @param  mailingCountry  Countries value for mailingCountry.
     * @param  mailingCity  String value for mailingCity.
     * @param  mailingRegion  String value for mailingRegion.
     * @param  mailingPostalCode  String value for mailingPostalCode.
     * @param  businessAddressLine1  String value for businessAddressLine1.
     * @param  businessAddressLine2  String value for businessAddressLine2.
     * @param  businessAddressLine3  String value for businessAddressLine3.
     * @param  businessCountry  Countries value for businessCountry.
     * @param  businessCity  String value for businessCity.
     * @param  businessRegion  String value for businessRegion.
     * @param  businessPostalCode  String value for businessPostalCode.
     * @param  premiseNumber  String value for premiseNumber.
     * @param  programToken  String value for programToken.
     * @param  primaryUserToken  String value for primaryUserToken.
     */
    public CreateInvitation(
            Currencies currency,
            String programUserId,
            String email,
            String firstName,
            String lastName,
            LocalDateTime dateOfBirth,
            TaxResidentStatuses taxResidentStatus,
            String phoneNumber,
            String mobileNumber,
            Countries phoneNumberCountry,
            Countries mobileNumberCountry,
            String addressLine1,
            String addressLine2,
            String addressLine3,
            String city,
            String region,
            Countries country,
            String postalCode,
            Genders gender,
            UserTypes userType,
            Languages language,
            Countries countryOfBirth,
            Countries countryOfNationality,
            BusinessContactRoles businessContactRole,
            GovernmentIds governmentIdType,
            String governmentId,
            String occupationTitle,
            Occupations occupationType,
            String mailingAddressLine1,
            String mailingAddressLine2,
            String mailingAddressLine3,
            Countries mailingCountry,
            String mailingCity,
            String mailingRegion,
            String mailingPostalCode,
            String businessAddressLine1,
            String businessAddressLine2,
            String businessAddressLine3,
            Countries businessCountry,
            String businessCity,
            String businessRegion,
            String businessPostalCode,
            String premiseNumber,
            String programToken,
            String primaryUserToken) {
        this.currency = currency;
        this.programUserId = programUserId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.taxResidentStatus = taxResidentStatus;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.phoneNumberCountry = phoneNumberCountry;
        this.mobileNumberCountry = mobileNumberCountry;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.region = region;
        this.country = country;
        this.postalCode = postalCode;
        this.gender = gender;
        this.userType = userType;
        this.language = language;
        this.countryOfBirth = countryOfBirth;
        this.countryOfNationality = countryOfNationality;
        this.businessContactRole = businessContactRole;
        this.governmentIdType = governmentIdType;
        this.governmentId = governmentId;
        this.occupationTitle = occupationTitle;
        this.occupationType = occupationType;
        this.mailingAddressLine1 = mailingAddressLine1;
        this.mailingAddressLine2 = mailingAddressLine2;
        this.mailingAddressLine3 = mailingAddressLine3;
        this.mailingCountry = mailingCountry;
        this.mailingCity = mailingCity;
        this.mailingRegion = mailingRegion;
        this.mailingPostalCode = mailingPostalCode;
        this.businessAddressLine1 = businessAddressLine1;
        this.businessAddressLine2 = businessAddressLine2;
        this.businessAddressLine3 = businessAddressLine3;
        this.businessCountry = businessCountry;
        this.businessCity = businessCity;
        this.businessRegion = businessRegion;
        this.businessPostalCode = businessPostalCode;
        this.premiseNumber = premiseNumber;
        this.programToken = programToken;
        this.primaryUserToken = primaryUserToken;
    }

    /**
     * Getter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @return Returns the Currencies
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Currencies getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * [Currency code type](#/rest/models/structures/country) for the object
     * @param currency Value for Currencies
     */
    @JsonSetter("currency")
    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    /**
     * Getter for ProgramUserId.
     * [Program identifier](#/rest/models/structures/program-user-id) for the user
     * @return Returns the String
     */
    @JsonGetter("programUserId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProgramUserId() {
        return programUserId;
    }

    /**
     * Setter for ProgramUserId.
     * [Program identifier](#/rest/models/structures/program-user-id) for the user
     * @param programUserId Value for String
     */
    @JsonSetter("programUserId")
    public void setProgramUserId(String programUserId) {
        this.programUserId = programUserId;
    }

    /**
     * Getter for Email.
     * Contact [email address](#/rest/models/structures/email-address) for the user account for the
     * user account
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Contact [email address](#/rest/models/structures/email-address) for the user account for the
     * user account
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for FirstName.
     * First name
     * @return Returns the String
     */
    @JsonGetter("firstName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * First name
     * @param firstName Value for String
     */
    @JsonSetter("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * Last name
     * @return Returns the String
     */
    @JsonGetter("lastName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * Last name
     * @param lastName Value for String
     */
    @JsonSetter("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for DateOfBirth.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateOfBirth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for DateOfBirth.
     * @param dateOfBirth Value for LocalDateTime
     */
    @JsonSetter("dateOfBirth")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for TaxResidentStatus.
     * Tax [resident status type](#/rest/models/structures/tax-resident-status)
     * @return Returns the TaxResidentStatuses
     */
    @JsonGetter("taxResidentStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxResidentStatuses getTaxResidentStatus() {
        return taxResidentStatus;
    }

    /**
     * Setter for TaxResidentStatus.
     * Tax [resident status type](#/rest/models/structures/tax-resident-status)
     * @param taxResidentStatus Value for TaxResidentStatuses
     */
    @JsonSetter("taxResidentStatus")
    public void setTaxResidentStatus(TaxResidentStatuses taxResidentStatus) {
        this.taxResidentStatus = taxResidentStatus;
    }

    /**
     * Getter for PhoneNumber.
     * @return Returns the String
     */
    @JsonGetter("phoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * @param phoneNumber Value for String
     */
    @JsonSetter("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for MobileNumber.
     * @return Returns the String
     */
    @JsonGetter("mobileNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Setter for MobileNumber.
     * @param mobileNumber Value for String
     */
    @JsonSetter("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * Getter for PhoneNumberCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("phoneNumberCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getPhoneNumberCountry() {
        return phoneNumberCountry;
    }

    /**
     * Setter for PhoneNumberCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param phoneNumberCountry Value for Countries
     */
    @JsonSetter("phoneNumberCountry")
    public void setPhoneNumberCountry(Countries phoneNumberCountry) {
        this.phoneNumberCountry = phoneNumberCountry;
    }

    /**
     * Getter for MobileNumberCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("mobileNumberCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getMobileNumberCountry() {
        return mobileNumberCountry;
    }

    /**
     * Setter for MobileNumberCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param mobileNumberCountry Value for Countries
     */
    @JsonSetter("mobileNumberCountry")
    public void setMobileNumberCountry(Countries mobileNumberCountry) {
        this.mobileNumberCountry = mobileNumberCountry;
    }

    /**
     * Getter for AddressLine1.
     * Address Line 1
     * @return Returns the String
     */
    @JsonGetter("addressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * Address Line 1
     * @param addressLine1 Value for String
     */
    @JsonSetter("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressLine2.
     * @return Returns the String
     */
    @JsonGetter("addressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for AddressLine2.
     * @param addressLine2 Value for String
     */
    @JsonSetter("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter for AddressLine3.
     * @return Returns the String
     */
    @JsonGetter("addressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Setter for AddressLine3.
     * @param addressLine3 Value for String
     */
    @JsonSetter("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Region.
     * @return Returns the String
     */
    @JsonGetter("region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Setter for Region.
     * @param region Value for String
     */
    @JsonSetter("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for Country.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param country Value for Countries
     */
    @JsonSetter("country")
    public void setCountry(Countries country) {
        this.country = country;
    }

    /**
     * Getter for PostalCode.
     * @return Returns the String
     */
    @JsonGetter("postalCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter for PostalCode.
     * @param postalCode Value for String
     */
    @JsonSetter("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for Gender.
     * [Gender](#/rest/models/structures/gender) as a user identifies
     * @return Returns the Genders
     */
    @JsonGetter("gender")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Genders getGender() {
        return gender;
    }

    /**
     * Setter for Gender.
     * [Gender](#/rest/models/structures/gender) as a user identifies
     * @param gender Value for Genders
     */
    @JsonSetter("gender")
    public void setGender(Genders gender) {
        this.gender = gender;
    }

    /**
     * Getter for UserType.
     * Account holder's profile [type](#/rest/models/structures/user-type)
     * @return Returns the UserTypes
     */
    @JsonGetter("userType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserTypes getUserType() {
        return userType;
    }

    /**
     * Setter for UserType.
     * Account holder's profile [type](#/rest/models/structures/user-type)
     * @param userType Value for UserTypes
     */
    @JsonSetter("userType")
    public void setUserType(UserTypes userType) {
        this.userType = userType;
    }

    /**
     * Getter for Language.
     * The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format
     * @return Returns the Languages
     */
    @JsonGetter("language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Languages getLanguage() {
        return language;
    }

    /**
     * Setter for Language.
     * The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format
     * @param language Value for Languages
     */
    @JsonSetter("language")
    public void setLanguage(Languages language) {
        this.language = language;
    }

    /**
     * Getter for CountryOfBirth.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("countryOfBirth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Setter for CountryOfBirth.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param countryOfBirth Value for Countries
     */
    @JsonSetter("countryOfBirth")
    public void setCountryOfBirth(Countries countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    /**
     * Getter for CountryOfNationality.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("countryOfNationality")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getCountryOfNationality() {
        return countryOfNationality;
    }

    /**
     * Setter for CountryOfNationality.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param countryOfNationality Value for Countries
     */
    @JsonSetter("countryOfNationality")
    public void setCountryOfNationality(Countries countryOfNationality) {
        this.countryOfNationality = countryOfNationality;
    }

    /**
     * Getter for BusinessContactRole.
     * Business contact role
     * @return Returns the BusinessContactRoles
     */
    @JsonGetter("businessContactRole")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BusinessContactRoles getBusinessContactRole() {
        return businessContactRole;
    }

    /**
     * Setter for BusinessContactRole.
     * Business contact role
     * @param businessContactRole Value for BusinessContactRoles
     */
    @JsonSetter("businessContactRole")
    public void setBusinessContactRole(BusinessContactRoles businessContactRole) {
        this.businessContactRole = businessContactRole;
    }

    /**
     * Getter for GovernmentIdType.
     * Indicates the type of ID submitted for user verification purposes.
     * @return Returns the GovernmentIds
     */
    @JsonGetter("governmentIdType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GovernmentIds getGovernmentIdType() {
        return governmentIdType;
    }

    /**
     * Setter for GovernmentIdType.
     * Indicates the type of ID submitted for user verification purposes.
     * @param governmentIdType Value for GovernmentIds
     */
    @JsonSetter("governmentIdType")
    public void setGovernmentIdType(GovernmentIds governmentIdType) {
        this.governmentIdType = governmentIdType;
    }

    /**
     * Getter for GovernmentId.
     * @return Returns the String
     */
    @JsonGetter("governmentId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGovernmentId() {
        return governmentId;
    }

    /**
     * Setter for GovernmentId.
     * @param governmentId Value for String
     */
    @JsonSetter("governmentId")
    public void setGovernmentId(String governmentId) {
        this.governmentId = governmentId;
    }

    /**
     * Getter for OccupationTitle.
     * @return Returns the String
     */
    @JsonGetter("occupationTitle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOccupationTitle() {
        return occupationTitle;
    }

    /**
     * Setter for OccupationTitle.
     * @param occupationTitle Value for String
     */
    @JsonSetter("occupationTitle")
    public void setOccupationTitle(String occupationTitle) {
        this.occupationTitle = occupationTitle;
    }

    /**
     * Getter for OccupationType.
     * [Type of occupation](#/rest/models/structures/occupation) for the user
     * @return Returns the Occupations
     */
    @JsonGetter("occupationType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Occupations getOccupationType() {
        return occupationType;
    }

    /**
     * Setter for OccupationType.
     * [Type of occupation](#/rest/models/structures/occupation) for the user
     * @param occupationType Value for Occupations
     */
    @JsonSetter("occupationType")
    public void setOccupationType(Occupations occupationType) {
        this.occupationType = occupationType;
    }

    /**
     * Getter for MailingAddressLine1.
     * @return Returns the String
     */
    @JsonGetter("mailingAddressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMailingAddressLine1() {
        return mailingAddressLine1;
    }

    /**
     * Setter for MailingAddressLine1.
     * @param mailingAddressLine1 Value for String
     */
    @JsonSetter("mailingAddressLine1")
    public void setMailingAddressLine1(String mailingAddressLine1) {
        this.mailingAddressLine1 = mailingAddressLine1;
    }

    /**
     * Getter for MailingAddressLine2.
     * @return Returns the String
     */
    @JsonGetter("mailingAddressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMailingAddressLine2() {
        return mailingAddressLine2;
    }

    /**
     * Setter for MailingAddressLine2.
     * @param mailingAddressLine2 Value for String
     */
    @JsonSetter("mailingAddressLine2")
    public void setMailingAddressLine2(String mailingAddressLine2) {
        this.mailingAddressLine2 = mailingAddressLine2;
    }

    /**
     * Getter for MailingAddressLine3.
     * @return Returns the String
     */
    @JsonGetter("mailingAddressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMailingAddressLine3() {
        return mailingAddressLine3;
    }

    /**
     * Setter for MailingAddressLine3.
     * @param mailingAddressLine3 Value for String
     */
    @JsonSetter("mailingAddressLine3")
    public void setMailingAddressLine3(String mailingAddressLine3) {
        this.mailingAddressLine3 = mailingAddressLine3;
    }

    /**
     * Getter for MailingCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("mailingCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getMailingCountry() {
        return mailingCountry;
    }

    /**
     * Setter for MailingCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param mailingCountry Value for Countries
     */
    @JsonSetter("mailingCountry")
    public void setMailingCountry(Countries mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    /**
     * Getter for MailingCity.
     * @return Returns the String
     */
    @JsonGetter("mailingCity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMailingCity() {
        return mailingCity;
    }

    /**
     * Setter for MailingCity.
     * @param mailingCity Value for String
     */
    @JsonSetter("mailingCity")
    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    /**
     * Getter for MailingRegion.
     * @return Returns the String
     */
    @JsonGetter("mailingRegion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMailingRegion() {
        return mailingRegion;
    }

    /**
     * Setter for MailingRegion.
     * @param mailingRegion Value for String
     */
    @JsonSetter("mailingRegion")
    public void setMailingRegion(String mailingRegion) {
        this.mailingRegion = mailingRegion;
    }

    /**
     * Getter for MailingPostalCode.
     * @return Returns the String
     */
    @JsonGetter("mailingPostalCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    /**
     * Setter for MailingPostalCode.
     * @param mailingPostalCode Value for String
     */
    @JsonSetter("mailingPostalCode")
    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    /**
     * Getter for BusinessAddressLine1.
     * Business address line 1
     * @return Returns the String
     */
    @JsonGetter("businessAddressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusinessAddressLine1() {
        return businessAddressLine1;
    }

    /**
     * Setter for BusinessAddressLine1.
     * Business address line 1
     * @param businessAddressLine1 Value for String
     */
    @JsonSetter("businessAddressLine1")
    public void setBusinessAddressLine1(String businessAddressLine1) {
        this.businessAddressLine1 = businessAddressLine1;
    }

    /**
     * Getter for BusinessAddressLine2.
     * Business address line 2
     * @return Returns the String
     */
    @JsonGetter("businessAddressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusinessAddressLine2() {
        return businessAddressLine2;
    }

    /**
     * Setter for BusinessAddressLine2.
     * Business address line 2
     * @param businessAddressLine2 Value for String
     */
    @JsonSetter("businessAddressLine2")
    public void setBusinessAddressLine2(String businessAddressLine2) {
        this.businessAddressLine2 = businessAddressLine2;
    }

    /**
     * Getter for BusinessAddressLine3.
     * Business address line 3
     * @return Returns the String
     */
    @JsonGetter("businessAddressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusinessAddressLine3() {
        return businessAddressLine3;
    }

    /**
     * Setter for BusinessAddressLine3.
     * Business address line 3
     * @param businessAddressLine3 Value for String
     */
    @JsonSetter("businessAddressLine3")
    public void setBusinessAddressLine3(String businessAddressLine3) {
        this.businessAddressLine3 = businessAddressLine3;
    }

    /**
     * Getter for BusinessCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @return Returns the Countries
     */
    @JsonGetter("businessCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Countries getBusinessCountry() {
        return businessCountry;
    }

    /**
     * Setter for BusinessCountry.
     * Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the
     * country name, e.g., for bank country or residential country. The 2-letter codes adhere to the
     * ISO 3166-1 spec and are listed here for convenience.
     * @param businessCountry Value for Countries
     */
    @JsonSetter("businessCountry")
    public void setBusinessCountry(Countries businessCountry) {
        this.businessCountry = businessCountry;
    }

    /**
     * Getter for BusinessCity.
     * Business city
     * @return Returns the String
     */
    @JsonGetter("businessCity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusinessCity() {
        return businessCity;
    }

    /**
     * Setter for BusinessCity.
     * Business city
     * @param businessCity Value for String
     */
    @JsonSetter("businessCity")
    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }

    /**
     * Getter for BusinessRegion.
     * Region that the business is based out of
     * @return Returns the String
     */
    @JsonGetter("businessRegion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusinessRegion() {
        return businessRegion;
    }

    /**
     * Setter for BusinessRegion.
     * Region that the business is based out of
     * @param businessRegion Value for String
     */
    @JsonSetter("businessRegion")
    public void setBusinessRegion(String businessRegion) {
        this.businessRegion = businessRegion;
    }

    /**
     * Getter for BusinessPostalCode.
     * @return Returns the String
     */
    @JsonGetter("businessPostalCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusinessPostalCode() {
        return businessPostalCode;
    }

    /**
     * Setter for BusinessPostalCode.
     * @param businessPostalCode Value for String
     */
    @JsonSetter("businessPostalCode")
    public void setBusinessPostalCode(String businessPostalCode) {
        this.businessPostalCode = businessPostalCode;
    }

    /**
     * Getter for PremiseNumber.
     * @return Returns the String
     */
    @JsonGetter("premiseNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPremiseNumber() {
        return premiseNumber;
    }

    /**
     * Setter for PremiseNumber.
     * @param premiseNumber Value for String
     */
    @JsonSetter("premiseNumber")
    public void setPremiseNumber(String premiseNumber) {
        this.premiseNumber = premiseNumber;
    }

    /**
     * Getter for ProgramToken.
     * Auto-generated unique identifier representing a program, prefixed with prog-
     * @return Returns the String
     */
    @JsonGetter("programToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProgramToken() {
        return programToken;
    }

    /**
     * Setter for ProgramToken.
     * Auto-generated unique identifier representing a program, prefixed with prog-
     * @param programToken Value for String
     */
    @JsonSetter("programToken")
    public void setProgramToken(String programToken) {
        this.programToken = programToken;
    }

    /**
     * Getter for PrimaryUserToken.
     * Auto-generated unique identifier representing a user, prefixed with `user-`.
     * @return Returns the String
     */
    @JsonGetter("primaryUserToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrimaryUserToken() {
        return primaryUserToken;
    }

    /**
     * Setter for PrimaryUserToken.
     * Auto-generated unique identifier representing a user, prefixed with `user-`.
     * @param primaryUserToken Value for String
     */
    @JsonSetter("primaryUserToken")
    public void setPrimaryUserToken(String primaryUserToken) {
        this.primaryUserToken = primaryUserToken;
    }

    /**
     * Converts this CreateInvitation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvitation [" + "currency=" + currency + ", programUserId=" + programUserId
                + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
                + ", dateOfBirth=" + dateOfBirth + ", taxResidentStatus=" + taxResidentStatus
                + ", phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber
                + ", phoneNumberCountry=" + phoneNumberCountry + ", mobileNumberCountry="
                + mobileNumberCountry + ", addressLine1=" + addressLine1 + ", addressLine2="
                + addressLine2 + ", addressLine3=" + addressLine3 + ", city=" + city + ", region="
                + region + ", country=" + country + ", postalCode=" + postalCode + ", gender="
                + gender + ", userType=" + userType + ", language=" + language + ", countryOfBirth="
                + countryOfBirth + ", countryOfNationality=" + countryOfNationality
                + ", businessContactRole=" + businessContactRole + ", governmentIdType="
                + governmentIdType + ", governmentId=" + governmentId + ", occupationTitle="
                + occupationTitle + ", occupationType=" + occupationType + ", mailingAddressLine1="
                + mailingAddressLine1 + ", mailingAddressLine2=" + mailingAddressLine2
                + ", mailingAddressLine3=" + mailingAddressLine3 + ", mailingCountry="
                + mailingCountry + ", mailingCity=" + mailingCity + ", mailingRegion="
                + mailingRegion + ", mailingPostalCode=" + mailingPostalCode
                + ", businessAddressLine1=" + businessAddressLine1 + ", businessAddressLine2="
                + businessAddressLine2 + ", businessAddressLine3=" + businessAddressLine3
                + ", businessCountry=" + businessCountry + ", businessCity=" + businessCity
                + ", businessRegion=" + businessRegion + ", businessPostalCode="
                + businessPostalCode + ", premiseNumber=" + premiseNumber + ", programToken="
                + programToken + ", primaryUserToken=" + primaryUserToken
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateInvitation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvitation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currency(getCurrency())
                .programUserId(getProgramUserId())
                .email(getEmail())
                .firstName(getFirstName())
                .lastName(getLastName())
                .dateOfBirth(getDateOfBirth())
                .taxResidentStatus(getTaxResidentStatus())
                .phoneNumber(getPhoneNumber())
                .mobileNumber(getMobileNumber())
                .phoneNumberCountry(getPhoneNumberCountry())
                .mobileNumberCountry(getMobileNumberCountry())
                .addressLine1(getAddressLine1())
                .addressLine2(getAddressLine2())
                .addressLine3(getAddressLine3())
                .city(getCity())
                .region(getRegion())
                .country(getCountry())
                .postalCode(getPostalCode())
                .gender(getGender())
                .userType(getUserType())
                .language(getLanguage())
                .countryOfBirth(getCountryOfBirth())
                .countryOfNationality(getCountryOfNationality())
                .businessContactRole(getBusinessContactRole())
                .governmentIdType(getGovernmentIdType())
                .governmentId(getGovernmentId())
                .occupationTitle(getOccupationTitle())
                .occupationType(getOccupationType())
                .mailingAddressLine1(getMailingAddressLine1())
                .mailingAddressLine2(getMailingAddressLine2())
                .mailingAddressLine3(getMailingAddressLine3())
                .mailingCountry(getMailingCountry())
                .mailingCity(getMailingCity())
                .mailingRegion(getMailingRegion())
                .mailingPostalCode(getMailingPostalCode())
                .businessAddressLine1(getBusinessAddressLine1())
                .businessAddressLine2(getBusinessAddressLine2())
                .businessAddressLine3(getBusinessAddressLine3())
                .businessCountry(getBusinessCountry())
                .businessCity(getBusinessCity())
                .businessRegion(getBusinessRegion())
                .businessPostalCode(getBusinessPostalCode())
                .premiseNumber(getPremiseNumber())
                .programToken(getProgramToken())
                .primaryUserToken(getPrimaryUserToken());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvitation}.
     */
    public static class Builder {
        private Currencies currency = Currencies.USD;
        private String programUserId;
        private String email;
        private String firstName;
        private String lastName;
        private LocalDateTime dateOfBirth;
        private TaxResidentStatuses taxResidentStatus;
        private String phoneNumber;
        private String mobileNumber;
        private Countries phoneNumberCountry;
        private Countries mobileNumberCountry;
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String city;
        private String region;
        private Countries country;
        private String postalCode;
        private Genders gender;
        private UserTypes userType;
        private Languages language;
        private Countries countryOfBirth;
        private Countries countryOfNationality;
        private BusinessContactRoles businessContactRole;
        private GovernmentIds governmentIdType;
        private String governmentId;
        private String occupationTitle;
        private Occupations occupationType;
        private String mailingAddressLine1;
        private String mailingAddressLine2;
        private String mailingAddressLine3;
        private Countries mailingCountry;
        private String mailingCity;
        private String mailingRegion;
        private String mailingPostalCode;
        private String businessAddressLine1;
        private String businessAddressLine2;
        private String businessAddressLine3;
        private Countries businessCountry;
        private String businessCity;
        private String businessRegion;
        private String businessPostalCode;
        private String premiseNumber;
        private String programToken;
        private String primaryUserToken;



        /**
         * Setter for currency.
         * @param  currency  Currencies value for currency.
         * @return Builder
         */
        public Builder currency(Currencies currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for programUserId.
         * @param  programUserId  String value for programUserId.
         * @return Builder
         */
        public Builder programUserId(String programUserId) {
            this.programUserId = programUserId;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for dateOfBirth.
         * @param  dateOfBirth  LocalDateTime value for dateOfBirth.
         * @return Builder
         */
        public Builder dateOfBirth(LocalDateTime dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Setter for taxResidentStatus.
         * @param  taxResidentStatus  TaxResidentStatuses value for taxResidentStatus.
         * @return Builder
         */
        public Builder taxResidentStatus(TaxResidentStatuses taxResidentStatus) {
            this.taxResidentStatus = taxResidentStatus;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Setter for mobileNumber.
         * @param  mobileNumber  String value for mobileNumber.
         * @return Builder
         */
        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        /**
         * Setter for phoneNumberCountry.
         * @param  phoneNumberCountry  Countries value for phoneNumberCountry.
         * @return Builder
         */
        public Builder phoneNumberCountry(Countries phoneNumberCountry) {
            this.phoneNumberCountry = phoneNumberCountry;
            return this;
        }

        /**
         * Setter for mobileNumberCountry.
         * @param  mobileNumberCountry  Countries value for mobileNumberCountry.
         * @return Builder
         */
        public Builder mobileNumberCountry(Countries mobileNumberCountry) {
            this.mobileNumberCountry = mobileNumberCountry;
            return this;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        /**
         * Setter for addressLine3.
         * @param  addressLine3  String value for addressLine3.
         * @return Builder
         */
        public Builder addressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for region.
         * @param  region  String value for region.
         * @return Builder
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  Countries value for country.
         * @return Builder
         */
        public Builder country(Countries country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for postalCode.
         * @param  postalCode  String value for postalCode.
         * @return Builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Setter for gender.
         * @param  gender  Genders value for gender.
         * @return Builder
         */
        public Builder gender(Genders gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Setter for userType.
         * @param  userType  UserTypes value for userType.
         * @return Builder
         */
        public Builder userType(UserTypes userType) {
            this.userType = userType;
            return this;
        }

        /**
         * Setter for language.
         * @param  language  Languages value for language.
         * @return Builder
         */
        public Builder language(Languages language) {
            this.language = language;
            return this;
        }

        /**
         * Setter for countryOfBirth.
         * @param  countryOfBirth  Countries value for countryOfBirth.
         * @return Builder
         */
        public Builder countryOfBirth(Countries countryOfBirth) {
            this.countryOfBirth = countryOfBirth;
            return this;
        }

        /**
         * Setter for countryOfNationality.
         * @param  countryOfNationality  Countries value for countryOfNationality.
         * @return Builder
         */
        public Builder countryOfNationality(Countries countryOfNationality) {
            this.countryOfNationality = countryOfNationality;
            return this;
        }

        /**
         * Setter for businessContactRole.
         * @param  businessContactRole  BusinessContactRoles value for businessContactRole.
         * @return Builder
         */
        public Builder businessContactRole(BusinessContactRoles businessContactRole) {
            this.businessContactRole = businessContactRole;
            return this;
        }

        /**
         * Setter for governmentIdType.
         * @param  governmentIdType  GovernmentIds value for governmentIdType.
         * @return Builder
         */
        public Builder governmentIdType(GovernmentIds governmentIdType) {
            this.governmentIdType = governmentIdType;
            return this;
        }

        /**
         * Setter for governmentId.
         * @param  governmentId  String value for governmentId.
         * @return Builder
         */
        public Builder governmentId(String governmentId) {
            this.governmentId = governmentId;
            return this;
        }

        /**
         * Setter for occupationTitle.
         * @param  occupationTitle  String value for occupationTitle.
         * @return Builder
         */
        public Builder occupationTitle(String occupationTitle) {
            this.occupationTitle = occupationTitle;
            return this;
        }

        /**
         * Setter for occupationType.
         * @param  occupationType  Occupations value for occupationType.
         * @return Builder
         */
        public Builder occupationType(Occupations occupationType) {
            this.occupationType = occupationType;
            return this;
        }

        /**
         * Setter for mailingAddressLine1.
         * @param  mailingAddressLine1  String value for mailingAddressLine1.
         * @return Builder
         */
        public Builder mailingAddressLine1(String mailingAddressLine1) {
            this.mailingAddressLine1 = mailingAddressLine1;
            return this;
        }

        /**
         * Setter for mailingAddressLine2.
         * @param  mailingAddressLine2  String value for mailingAddressLine2.
         * @return Builder
         */
        public Builder mailingAddressLine2(String mailingAddressLine2) {
            this.mailingAddressLine2 = mailingAddressLine2;
            return this;
        }

        /**
         * Setter for mailingAddressLine3.
         * @param  mailingAddressLine3  String value for mailingAddressLine3.
         * @return Builder
         */
        public Builder mailingAddressLine3(String mailingAddressLine3) {
            this.mailingAddressLine3 = mailingAddressLine3;
            return this;
        }

        /**
         * Setter for mailingCountry.
         * @param  mailingCountry  Countries value for mailingCountry.
         * @return Builder
         */
        public Builder mailingCountry(Countries mailingCountry) {
            this.mailingCountry = mailingCountry;
            return this;
        }

        /**
         * Setter for mailingCity.
         * @param  mailingCity  String value for mailingCity.
         * @return Builder
         */
        public Builder mailingCity(String mailingCity) {
            this.mailingCity = mailingCity;
            return this;
        }

        /**
         * Setter for mailingRegion.
         * @param  mailingRegion  String value for mailingRegion.
         * @return Builder
         */
        public Builder mailingRegion(String mailingRegion) {
            this.mailingRegion = mailingRegion;
            return this;
        }

        /**
         * Setter for mailingPostalCode.
         * @param  mailingPostalCode  String value for mailingPostalCode.
         * @return Builder
         */
        public Builder mailingPostalCode(String mailingPostalCode) {
            this.mailingPostalCode = mailingPostalCode;
            return this;
        }

        /**
         * Setter for businessAddressLine1.
         * @param  businessAddressLine1  String value for businessAddressLine1.
         * @return Builder
         */
        public Builder businessAddressLine1(String businessAddressLine1) {
            this.businessAddressLine1 = businessAddressLine1;
            return this;
        }

        /**
         * Setter for businessAddressLine2.
         * @param  businessAddressLine2  String value for businessAddressLine2.
         * @return Builder
         */
        public Builder businessAddressLine2(String businessAddressLine2) {
            this.businessAddressLine2 = businessAddressLine2;
            return this;
        }

        /**
         * Setter for businessAddressLine3.
         * @param  businessAddressLine3  String value for businessAddressLine3.
         * @return Builder
         */
        public Builder businessAddressLine3(String businessAddressLine3) {
            this.businessAddressLine3 = businessAddressLine3;
            return this;
        }

        /**
         * Setter for businessCountry.
         * @param  businessCountry  Countries value for businessCountry.
         * @return Builder
         */
        public Builder businessCountry(Countries businessCountry) {
            this.businessCountry = businessCountry;
            return this;
        }

        /**
         * Setter for businessCity.
         * @param  businessCity  String value for businessCity.
         * @return Builder
         */
        public Builder businessCity(String businessCity) {
            this.businessCity = businessCity;
            return this;
        }

        /**
         * Setter for businessRegion.
         * @param  businessRegion  String value for businessRegion.
         * @return Builder
         */
        public Builder businessRegion(String businessRegion) {
            this.businessRegion = businessRegion;
            return this;
        }

        /**
         * Setter for businessPostalCode.
         * @param  businessPostalCode  String value for businessPostalCode.
         * @return Builder
         */
        public Builder businessPostalCode(String businessPostalCode) {
            this.businessPostalCode = businessPostalCode;
            return this;
        }

        /**
         * Setter for premiseNumber.
         * @param  premiseNumber  String value for premiseNumber.
         * @return Builder
         */
        public Builder premiseNumber(String premiseNumber) {
            this.premiseNumber = premiseNumber;
            return this;
        }

        /**
         * Setter for programToken.
         * @param  programToken  String value for programToken.
         * @return Builder
         */
        public Builder programToken(String programToken) {
            this.programToken = programToken;
            return this;
        }

        /**
         * Setter for primaryUserToken.
         * @param  primaryUserToken  String value for primaryUserToken.
         * @return Builder
         */
        public Builder primaryUserToken(String primaryUserToken) {
            this.primaryUserToken = primaryUserToken;
            return this;
        }

        /**
         * Builds a new {@link CreateInvitation} object using the set fields.
         * @return {@link CreateInvitation}
         */
        public CreateInvitation build() {
            return new CreateInvitation(currency, programUserId, email, firstName, lastName,
                    dateOfBirth, taxResidentStatus, phoneNumber, mobileNumber, phoneNumberCountry,
                    mobileNumberCountry, addressLine1, addressLine2, addressLine3, city, region,
                    country, postalCode, gender, userType, language, countryOfBirth,
                    countryOfNationality, businessContactRole, governmentIdType, governmentId,
                    occupationTitle, occupationType, mailingAddressLine1, mailingAddressLine2,
                    mailingAddressLine3, mailingCountry, mailingCity, mailingRegion,
                    mailingPostalCode, businessAddressLine1, businessAddressLine2,
                    businessAddressLine3, businessCountry, businessCity, businessRegion,
                    businessPostalCode, premiseNumber, programToken, primaryUserToken);
        }
    }
}

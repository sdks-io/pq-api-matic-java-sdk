
# Create or Update User

## Structure

`CreateOrUpdateUser`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | [`Currencies`](../../doc/models/currencies.md) | Optional | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getCurrency() | setCurrency(Currencies currency) |
| `ProgramUserId` | `String` | Optional | [Program identifier](#/rest/models/structures/program-user-id) for the user<br><br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `100` | String getProgramUserId() | setProgramUserId(String programUserId) |
| `Email` | `String` | Optional | Contact [email address](#/rest/models/structures/email-address) for the user account for the user account<br><br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `100`, *Pattern*: `^.+@.+\..+` | String getEmail() | setEmail(String email) |
| `FirstName` | `String` | Optional | First name<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | Last name<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getLastName() | setLastName(String lastName) |
| `DateOfBirth` | `LocalDateTime` | Optional | - | LocalDateTime getDateOfBirth() | setDateOfBirth(LocalDateTime dateOfBirth) |
| `TaxResidentStatus` | [`TaxResidentStatuses`](../../doc/models/tax-resident-statuses.md) | Optional | Tax [resident status type](#/rest/models/structures/tax-resident-status) | TaxResidentStatuses getTaxResidentStatus() | setTaxResidentStatus(TaxResidentStatuses taxResidentStatus) |
| `PhoneNumber` | `String` | Optional | - | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `MobileNumber` | `String` | Optional | - | String getMobileNumber() | setMobileNumber(String mobileNumber) |
| `PhoneNumberCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getPhoneNumberCountry() | setPhoneNumberCountry(Countries phoneNumberCountry) |
| `MobileNumberCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getMobileNumberCountry() | setMobileNumberCountry(Countries mobileNumberCountry) |
| `AddressLine1` | `String` | Optional | Address Line 1<br><br>**Constraints**: *Maximum Length*: `255` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `City` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getCity() | setCity(String city) |
| `Region` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getRegion() | setRegion(String region) |
| `Country` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountry() | setCountry(Countries country) |
| `PostalCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getPostalCode() | setPostalCode(String postalCode) |
| `Gender` | [`Genders`](../../doc/models/genders.md) | Optional | [Gender](#/rest/models/structures/gender) as a user identifies | Genders getGender() | setGender(Genders gender) |
| `UserType` | [`UserTypes`](../../doc/models/user-types.md) | Optional | Account holder's profile [type](#/rest/models/structures/user-type) | UserTypes getUserType() | setUserType(UserTypes userType) |
| `Language` | [`Languages`](../../doc/models/languages.md) | Optional | The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format | Languages getLanguage() | setLanguage(Languages language) |
| `CountryOfBirth` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountryOfBirth() | setCountryOfBirth(Countries countryOfBirth) |
| `CountryOfNationality` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountryOfNationality() | setCountryOfNationality(Countries countryOfNationality) |
| `BusinessContactRole` | [`BusinessContactRoles`](../../doc/models/business-contact-roles.md) | Optional | Business contact role<br><br>**Constraints**: *Maximum Length*: `20` | BusinessContactRoles getBusinessContactRole() | setBusinessContactRole(BusinessContactRoles businessContactRole) |
| `GovernmentIdType` | [`GovernmentIds`](../../doc/models/government-ids.md) | Optional | Indicates the type of ID submitted for user verification purposes. | GovernmentIds getGovernmentIdType() | setGovernmentIdType(GovernmentIds governmentIdType) |
| `GovernmentId` | `String` | Optional | **Constraints**: *Maximum Length*: `20` | String getGovernmentId() | setGovernmentId(String governmentId) |
| `OccupationTitle` | `String` | Optional | **Constraints**: *Maximum Length*: `20` | String getOccupationTitle() | setOccupationTitle(String occupationTitle) |
| `OccupationType` | [`Occupations`](../../doc/models/occupations.md) | Optional | [Type of occupation](#/rest/models/structures/occupation) for the user | Occupations getOccupationType() | setOccupationType(Occupations occupationType) |
| `MailingAddressLine1` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMailingAddressLine1() | setMailingAddressLine1(String mailingAddressLine1) |
| `MailingAddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMailingAddressLine2() | setMailingAddressLine2(String mailingAddressLine2) |
| `MailingAddressLine3` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMailingAddressLine3() | setMailingAddressLine3(String mailingAddressLine3) |
| `MailingCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getMailingCountry() | setMailingCountry(Countries mailingCountry) |
| `MailingCity` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getMailingCity() | setMailingCity(String mailingCity) |
| `MailingRegion` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getMailingRegion() | setMailingRegion(String mailingRegion) |
| `MailingPostalCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3` | String getMailingPostalCode() | setMailingPostalCode(String mailingPostalCode) |
| `BusinessAddressLine1` | `String` | Optional | Business address line 1<br><br>**Constraints**: *Maximum Length*: `255` | String getBusinessAddressLine1() | setBusinessAddressLine1(String businessAddressLine1) |
| `BusinessAddressLine2` | `String` | Optional | Business address line 2<br><br>**Constraints**: *Maximum Length*: `255` | String getBusinessAddressLine2() | setBusinessAddressLine2(String businessAddressLine2) |
| `BusinessAddressLine3` | `String` | Optional | Business address line 3<br><br>**Constraints**: *Maximum Length*: `255` | String getBusinessAddressLine3() | setBusinessAddressLine3(String businessAddressLine3) |
| `BusinessCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getBusinessCountry() | setBusinessCountry(Countries businessCountry) |
| `BusinessCity` | `String` | Optional | Business city<br><br>**Constraints**: *Maximum Length*: `50` | String getBusinessCity() | setBusinessCity(String businessCity) |
| `BusinessRegion` | `String` | Optional | Region that the business is based out of | String getBusinessRegion() | setBusinessRegion(String businessRegion) |
| `BusinessPostalCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getBusinessPostalCode() | setBusinessPostalCode(String businessPostalCode) |
| `PremiseNumber` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getPremiseNumber() | setPremiseNumber(String premiseNumber) |
| `ProgramToken` | `String` | Optional | Auto-generated unique identifier representing a program, prefixed with prog-<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^prog-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getProgramToken() | setProgramToken(String programToken) |
| `PrimaryUserToken` | `String` | Optional | Auto-generated unique identifier representing a user, prefixed with `user-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^user-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getPrimaryUserToken() | setPrimaryUserToken(String primaryUserToken) |

## Example (as JSON)

```json
{
  "currency": "USD",
  "programUserId": "pdekt",
  "email": "john.doe@email.com",
  "firstName": "John",
  "lastName": "Doe",
  "dateOfBirth": "2026-02-07T22:23:10.0141433Z",
  "taxResidentStatus": "NO",
  "phoneNumber": "+12345678901",
  "mobileNumber": "+12345678901",
  "phoneNumberCountry": "US",
  "mobileNumberCountry": "US",
  "addressLine1": "string",
  "addressLine2": "string",
  "addressLine3": "string",
  "city": "string",
  "region": "string",
  "country": "US",
  "postalCode": "uuk",
  "gender": "FEMALE",
  "userType": "BUSINESS",
  "language": "en-US",
  "countryOfBirth": "US",
  "countryOfNationality": "US",
  "businessContactRole": "MANAGER",
  "governmentIdType": "CURP",
  "governmentId": "string",
  "occupationTitle": "string",
  "occupationType": "ARTS",
  "mailingAddressLine1": "string",
  "mailingAddressLine2": "string",
  "mailingAddressLine3": "string",
  "mailingcountry": "US",
  "mailingCity": "string",
  "mailingRegion": "string",
  "mailingPostalCode": "jgl",
  "businessAddressLine1": "string",
  "businessAddressLine2": "string",
  "businessAddressLine3": "string",
  "businesscountry": "US",
  "businessCity": "string",
  "businessRegion": "string",
  "businessPostalCode": "uuk",
  "premiseNumber": "string",
  "programToken": "prog-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb",
  "primaryUserToken": "user-2bbfc967-d12e-4647-a887-d905172fb4bc"
}
```


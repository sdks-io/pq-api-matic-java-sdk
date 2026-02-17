
# User Result

## Structure

`UserResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `AddressLine1` | `String` | Optional | Address Line 1<br><br>**Constraints**: *Maximum Length*: `255` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `BusinessAddressLine1` | `String` | Optional | Business address line 1<br><br>**Constraints**: *Maximum Length*: `255` | String getBusinessAddressLine1() | setBusinessAddressLine1(String businessAddressLine1) |
| `BusinessAddressLine2` | `String` | Optional | Business address line 2<br><br>**Constraints**: *Maximum Length*: `255` | String getBusinessAddressLine2() | setBusinessAddressLine2(String businessAddressLine2) |
| `BusinessAddressLine3` | `String` | Optional | Business address line 3<br><br>**Constraints**: *Maximum Length*: `255` | String getBusinessAddressLine3() | setBusinessAddressLine3(String businessAddressLine3) |
| `BusinessAddressType` | [`Addresses`](../../doc/models/addresses.md) | Optional | Classifies the [address](#/rest/models/structures/address) type (*Residential*, *Business*, *Billing*, *Shipping*) | Addresses getBusinessAddressType() | setBusinessAddressType(Addresses businessAddressType) |
| `BusinessCity` | `String` | Optional | Business city<br><br>**Constraints**: *Maximum Length*: `50` | String getBusinessCity() | setBusinessCity(String businessCity) |
| `BusinessContactRole` | [`BusinessContactRoles`](../../doc/models/business-contact-roles.md) | Optional | Business contact role<br><br>**Constraints**: *Maximum Length*: `20` | BusinessContactRoles getBusinessContactRole() | setBusinessContactRole(BusinessContactRoles businessContactRole) |
| `BusinessCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getBusinessCountry() | setBusinessCountry(Countries businessCountry) |
| `BusinessName` | `String` | Optional | Business name | String getBusinessName() | setBusinessName(String businessName) |
| `BusinessPostalCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getBusinessPostalCode() | setBusinessPostalCode(String businessPostalCode) |
| `BusinessRegion` | `String` | Optional | Region that the business is based out of | String getBusinessRegion() | setBusinessRegion(String businessRegion) |
| `City` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getCity() | setCity(String city) |
| `Country` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountry() | setCountry(Countries country) |
| `CountryOfBirth` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountryOfBirth() | setCountryOfBirth(Countries countryOfBirth) |
| `CountryOfNationality` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountryOfNationality() | setCountryOfNationality(Countries countryOfNationality) |
| `CreatedOn` | `LocalDateTime` | Optional | Time object was [created](#/rest/models/structures/created-on) | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Currency` | [`Currencies`](../../doc/models/currencies.md) | Optional | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getCurrency() | setCurrency(Currencies currency) |
| `DateOfBirth` | `LocalDateTime` | Optional | - | LocalDateTime getDateOfBirth() | setDateOfBirth(LocalDateTime dateOfBirth) |
| `Email` | `String` | Optional | Contact [email address](#/rest/models/structures/email-address) for the user account for the user account<br><br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `100`, *Pattern*: `^.+@.+\..+` | String getEmail() | setEmail(String email) |
| `EmployerId` | `String` | Optional | Employer id | String getEmployerId() | setEmployerId(String employerId) |
| `FirstName` | `String` | Optional | First name<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getFirstName() | setFirstName(String firstName) |
| `Gender` | [`Genders`](../../doc/models/genders.md) | Optional | [Gender](#/rest/models/structures/gender) as a user identifies | Genders getGender() | setGender(Genders gender) |
| `GovernmentId` | `String` | Optional | **Constraints**: *Maximum Length*: `20` | String getGovernmentId() | setGovernmentId(String governmentId) |
| `GovernmentIdType` | [`GovernmentIds`](../../doc/models/government-ids.md) | Optional | Indicates the type of ID submitted for user verification purposes. | GovernmentIds getGovernmentIdType() | setGovernmentIdType(GovernmentIds governmentIdType) |
| `Language` | [`Languages`](../../doc/models/languages.md) | Optional | The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format | Languages getLanguage() | setLanguage(Languages language) |
| `LastName` | `String` | Optional | Last name<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getLastName() | setLastName(String lastName) |
| `MailingAddressLine1` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMailingAddressLine1() | setMailingAddressLine1(String mailingAddressLine1) |
| `MailingAddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMailingAddressLine2() | setMailingAddressLine2(String mailingAddressLine2) |
| `MailingAddressLine3` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getMailingAddressLine3() | setMailingAddressLine3(String mailingAddressLine3) |
| `MailingCity` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getMailingCity() | setMailingCity(String mailingCity) |
| `MailingCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getMailingCountry() | setMailingCountry(Countries mailingCountry) |
| `MailingPostalCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3` | String getMailingPostalCode() | setMailingPostalCode(String mailingPostalCode) |
| `MailingRegion` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getMailingRegion() | setMailingRegion(String mailingRegion) |
| `MobileNumber` | `String` | Optional | - | String getMobileNumber() | setMobileNumber(String mobileNumber) |
| `MobileNumberCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getMobileNumberCountry() | setMobileNumberCountry(Countries mobileNumberCountry) |
| `OccupationTitle` | `String` | Optional | **Constraints**: *Maximum Length*: `20` | String getOccupationTitle() | setOccupationTitle(String occupationTitle) |
| `OccupationType` | [`Occupations`](../../doc/models/occupations.md) | Optional | [Type of occupation](#/rest/models/structures/occupation) for the user | Occupations getOccupationType() | setOccupationType(Occupations occupationType) |
| `PhoneNumber` | `String` | Optional | - | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `PhoneNumberCountry` | [`Countries`](../../doc/models/countries.md) | Optional | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getPhoneNumberCountry() | setPhoneNumberCountry(Countries phoneNumberCountry) |
| `PostalCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getPostalCode() | setPostalCode(String postalCode) |
| `ProgramUserId` | `String` | Optional | [Program identifier](#/rest/models/structures/program-user-id) for the user<br><br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `100` | String getProgramUserId() | setProgramUserId(String programUserId) |
| `Region` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getRegion() | setRegion(String region) |
| `Status` | [`UserStatuses`](../../doc/models/user-statuses.md) | Optional | Status of the user [User status type](#/rest/models/structures/user-status) | UserStatuses getStatus() | setStatus(UserStatuses status) |
| `TaxResidentStatus` | [`TaxResidentStatuses`](../../doc/models/tax-resident-statuses.md) | Optional | Tax [resident status type](#/rest/models/structures/tax-resident-status) | TaxResidentStatuses getTaxResidentStatus() | setTaxResidentStatus(TaxResidentStatuses taxResidentStatus) |
| `UserType` | [`UserTypes`](../../doc/models/user-types.md) | Optional | Account holder's profile [type](#/rest/models/structures/user-type) | UserTypes getUserType() | setUserType(UserTypes userType) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |
| `Meta` | [`MetadataItems`](../../doc/models/metadata-items.md) | Optional | - | MetadataItems getMeta() | setMeta(MetadataItems meta) |

## Example (as JSON)

```json
{
  "token": "string",
  "addressLine1": "string",
  "addressLine2": "string",
  "addressLine3": "string",
  "businessAddressLine1": "string",
  "businessAddressLine2": "string",
  "businessAddressLine3": "string",
  "businessAddressType": "BUSINESS",
  "businessCity": "string",
  "businessContactRole": "MANAGER",
  "businesscountry": "US",
  "businessName": "string",
  "businessPostalCode": "uuk",
  "businessRegion": "string",
  "city": "string",
  "country": "US",
  "countryOfBirth": "US",
  "countryOfNationality": "US",
  "createdOn": "2026-02-07T22:23:09.9667010Z",
  "currency": "USD",
  "dateOfBirth": "2026-02-07T22:23:10.0141433Z",
  "email": "john.doe@email.com",
  "employerId": "string",
  "firstName": "John",
  "gender": "FEMALE",
  "governmentId": "string",
  "governmentIdType": "CURP",
  "language": "en-US",
  "lastName": "Doe",
  "mailingAddressLine1": "string",
  "mailingAddressLine2": "string",
  "mailingAddressLine3": "string",
  "mailingCity": "string",
  "mailingcountry": "US",
  "mailingPostalCode": "jgl",
  "mailingRegion": "string",
  "mobileNumber": "+12345678901",
  "mobileNumberCountry": "US",
  "occupationTitle": "string",
  "occupationType": "ARTS",
  "phoneNumber": "+12345678901",
  "phoneNumberCountry": "US",
  "postalCode": "uuk",
  "programUserId": "pdekt",
  "region": "string",
  "status": "ACTIVE",
  "taxResidentStatus": "NO",
  "userType": "BUSINESS",
  "links": [
    {
      "href": "string",
      "params": {
        "rel": "self"
      }
    }
  ],
  "meta": {
    "timezone": "GMT",
    "requestRef": "20260207T231757Z-r1d65bb46d495mgjhC1BL1qvx400000004rg00000000c2uh"
  }
}
```


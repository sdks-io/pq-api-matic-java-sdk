
# Bank Account Address

## Structure

`BankAccountAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address1` | `String` | Required | Address Line 1<br><br>**Constraints**: *Maximum Length*: `255` | String getAddress1() | setAddress1(String address1) |
| `Address2` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getAddress2() | setAddress2(String address2) |
| `Address3` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getAddress3() | setAddress3(String address3) |
| `City` | `String` | Required | **Constraints**: *Maximum Length*: `50` | String getCity() | setCity(String city) |
| `Region` | `String` | Optional | **Constraints**: *Maximum Length*: `50` | String getRegion() | setRegion(String region) |
| `PostalCode` | `String` | Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getPostalCode() | setPostalCode(String postalCode) |
| `Country` | [`Countries`](../../doc/models/countries.md) | Required | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getCountry() | setCountry(Countries country) |

## Example (as JSON)

```json
{
  "address1": "string",
  "address2": "string",
  "address3": "string",
  "city": "string",
  "region": "string",
  "postalCode": "nzl",
  "country": "US"
}
```


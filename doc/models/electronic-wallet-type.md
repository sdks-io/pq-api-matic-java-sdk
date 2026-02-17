
# Electronic Wallet Type

Classifies the electronic wallet [required](#/rest/models/structures/electronic-wallet-type) configuration

## Structure

`ElectronicWalletType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`ElectronicWalletTypes`](../../doc/models/electronic-wallet-types.md) | Required | Name of the electronic wallet | ElectronicWalletTypes getType() | setType(ElectronicWalletTypes type) |
| `ElectronicWalletCountry` | [`Countries`](../../doc/models/countries.md) | Required | Throughout the PayQuicker API, the usage of the 2-letter alpha code is used in place of the country name, e.g., for bank country or residential country.<br><br>The 2-letter codes adhere to the ISO 3166-1 spec and are listed here for convenience. | Countries getElectronicWalletCountry() | setElectronicWalletCountry(Countries electronicWalletCountry) |
| `ElectronicWalletCurrency` | [`Currencies`](../../doc/models/currencies.md) | Required | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getElectronicWalletCurrency() | setElectronicWalletCurrency(Currencies electronicWalletCurrency) |

## Example (as JSON)

```json
{
  "type": "AIRTEL_MONEY",
  "electronicWalletCountry": "US",
  "electronicWalletCurrency": "USD"
}
```


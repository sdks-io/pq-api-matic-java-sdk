
# Electronic Wallet Requirement Format Legend

Classifies the [legend format](#/rest/models/structures/electronic-wallet-requirement-format-legend) of the required information for a electronic wallet

## Structure

`ElectronicWalletRequirementFormatLegend`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Optional | - | String getKey() | setKey(String key) |
| `Descriptions` | [`List<Translation>`](../../doc/models/translation.md) | Optional | Localized requirement description for display purposes | List<Translation> getDescriptions() | setDescriptions(List<Translation> descriptions) |

## Example (as JSON)

```json
{
  "key": "string",
  "descriptions": [
    {
      "language": "en-US",
      "translation": "string"
    }
  ]
}
```


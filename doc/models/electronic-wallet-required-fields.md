
# Electronic Wallet Required Fields

Classifies the required [electronic wallet field](#/rest/models/structures/electronic-wallet-required-fields) objects

## Structure

`ElectronicWalletRequiredFields`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Format` | [`ElectronicWalletRequirementFormat`](../../doc/models/electronic-wallet-requirement-format.md) | Optional | Classifies the [format](#/rest/models/structures/electronic-wallet-requirement-format) of the required information for an electronic wallet | ElectronicWalletRequirementFormat getFormat() | setFormat(ElectronicWalletRequirementFormat format) |
| `Requirement` | [`ElectronicWalletFields`](../../doc/models/electronic-wallet-fields.md) | Optional | Classifies electronic wallet [field types](#/rest/models/structures/electronic-wallet-fields) | ElectronicWalletFields getRequirement() | setRequirement(ElectronicWalletFields requirement) |
| `Description` | [`List<Translation>`](../../doc/models/translation.md) | Optional | Localized requirement description for display purposes | List<Translation> getDescription() | setDescription(List<Translation> description) |
| `Validators` | [`List<ElectronicWalletRequirementValidator>`](../../doc/models/electronic-wallet-requirement-validator.md) | Optional | - | List<ElectronicWalletRequirementValidator> getValidators() | setValidators(List<ElectronicWalletRequirementValidator> validators) |

## Example (as JSON)

```json
{
  "format": {
    "example": "string",
    "legend": [
      {
        "key": "string",
        "descriptions": [
          {
            "language": "en-US",
            "translation": "string"
          }
        ]
      }
    ]
  },
  "requirement": "UNDEFINED",
  "description": [
    {
      "language": "en-US",
      "translation": "string"
    }
  ],
  "validators": [
    {
      "validatorType": "LENGTH",
      "expression": "string"
    }
  ]
}
```



# Bank Account Required Fields

Classifies the required [bank account field](#/rest/models/structures/bank-account-required-fields) objects

## Structure

`BankAccountRequiredFields`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Format` | [`BankAccountRequirementFormat`](../../doc/models/bank-account-requirement-format.md) | Optional | Classifies the [format](#/rest/models/structures/bank-account-requirement-format) of the required information for a bank account | BankAccountRequirementFormat getFormat() | setFormat(BankAccountRequirementFormat format) |
| `Requirement` | [`BankAccountFields`](../../doc/models/bank-account-fields.md) | Optional | Classifies bank account [field types](#/rest/models/structures/bank-account-fields) | BankAccountFields getRequirement() | setRequirement(BankAccountFields requirement) |
| `Description` | [`List<Translation>`](../../doc/models/translation.md) | Optional | Localized requirement description for display purposes | List<Translation> getDescription() | setDescription(List<Translation> description) |
| `Validators` | [`List<BankAccountRequirementValidator>`](../../doc/models/bank-account-requirement-validator.md) | Optional | - | List<BankAccountRequirementValidator> getValidators() | setValidators(List<BankAccountRequirementValidator> validators) |

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
  "requirement": "BANK_ACH_ABA",
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


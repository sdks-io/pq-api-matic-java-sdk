
# Bank Account Requirement Validator

[Validator type](#/rest/models/structures/bank-account-requirement-validator) that for the required bank account information.

## Structure

`BankAccountRequirementValidator`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ValidatorType` | [`ValidatorTypes`](../../doc/models/validator-types.md) | Optional | [Validator types](#/rest/models/structures/bank-account-requirement-validator) for the required bank account information. | ValidatorTypes getValidatorType() | setValidatorType(ValidatorTypes validatorType) |
| `Expression` | `String` | Required | Validation regular expression | String getExpression() | setExpression(String expression) |

## Example (as JSON)

```json
{
  "validatorType": "LENGTH",
  "expression": "string"
}
```



# Bank Account Field

1...N required [fields](#/rest/models/structures/key-value-pair-bank-field-types-string) as determined by call to get requirements

## Structure

`BankAccountField`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | [`BankAccountFields`](../../doc/models/bank-account-fields.md) | Required | Classifies bank account [field types](#/rest/models/structures/bank-account-fields) | BankAccountFields getKey() | setKey(BankAccountFields key) |
| `Value` | `String` | Required | - | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "BANK_ACH_ABA",
  "value": "string"
}
```


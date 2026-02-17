
# Fee Distribution

## Structure

`FeeDistribution`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Double` | Optional | Allocated money to be sent in the transaction.<br><br>**Default**: `1.02d` | Double getAmount() | setAmount(Double amount) |
| `Currency` | [`Currencies`](../../doc/models/currencies.md) | Optional | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getCurrency() | setCurrency(Currencies currency) |
| `Description` | [`List<ReceiptDescriptions>`](../../doc/models/receipt-descriptions.md) | Optional | - | List<ReceiptDescriptions> getDescription() | setDescription(List<ReceiptDescriptions> description) |
| `FormattedAmount` | `String` | Optional | Combination of the amount and currency type<br><br>**Default**: `"$0.05 USD"` | String getFormattedAmount() | setFormattedAmount(String formattedAmount) |
| `Percentage` | `Double` | Optional | Fee percentage that the responsible account pays | Double getPercentage() | setPercentage(Double percentage) |
| `Responsibility` | [`FeeResponsibilityParties`](../../doc/models/fee-responsibility-parties.md) | Optional | Fee responsibility types | FeeResponsibilityParties getResponsibility() | setResponsibility(FeeResponsibilityParties responsibility) |
| `ResponsibilitySource` | [`FeeResponsibilitySources`](../../doc/models/fee-responsibility-sources.md) | Optional | Fee responsibility source types | FeeResponsibilitySources getResponsibilitySource() | setResponsibilitySource(FeeResponsibilitySources responsibilitySource) |
| `SourceToken` | `String` | Optional | Unique identifier representing the [source of funds](#/rest/models/structures/source-token)<br><br>**Default**: `"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860"`<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^(acct\|user\|dest)-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getSourceToken() | setSourceToken(String sourceToken) |

## Example (as JSON)

```json
{
  "amount": 1.02,
  "currency": "USD",
  "description": [
    {
      "language": "en-US",
      "translation": "string"
    }
  ],
  "formattedAmount": "$0.05 USD",
  "percentage": 50.0,
  "responsibility": "COMPANY",
  "responsibilitySource": "CREDIT",
  "sourceToken": "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860"
}
```


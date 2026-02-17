
# Replace Prepaid Card

## Structure

`ReplacePrepaidCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPackage` | `String` | Optional | [Package](#/rest/models/structures/prepaid-card-package) for the card being displayed, including artwork, packaging, and delivery method | String getCardPackage() | setCardPackage(String cardPackage) |
| `CardReplacementReason` | [`PrepaidCardReplacementReasons`](../../doc/models/prepaid-card-replacement-reasons.md) | Optional | Reason for [prepaid card](page:resources/prepaid-cards) replacement. | PrepaidCardReplacementReasons getCardReplacementReason() | setCardReplacementReason(PrepaidCardReplacementReasons cardReplacementReason) |

## Example (as JSON)

```json
{
  "cardPackage": "71290",
  "cardReplacementReason": "COMPROMISED"
}
```


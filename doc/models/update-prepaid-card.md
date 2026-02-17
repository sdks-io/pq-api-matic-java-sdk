
# Update Prepaid Card

## Structure

`UpdatePrepaidCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPackage` | `String` | Optional | [Package](#/rest/models/structures/prepaid-card-package) for the card being displayed, including artwork, packaging, and delivery method | String getCardPackage() | setCardPackage(String cardPackage) |
| `Status` | [`PrepaidCardStatuses`](../../doc/models/prepaid-card-statuses.md) | Optional | Current [status](#/rest/models/structures/prepaid-card-status) of the prepaid card | PrepaidCardStatuses getStatus() | setStatus(PrepaidCardStatuses status) |

## Example (as JSON)

```json
{
  "cardPackage": "71290",
  "status": "ACTIVATED"
}
```


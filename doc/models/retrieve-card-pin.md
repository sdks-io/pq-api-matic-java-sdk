
# Retrieve Card Pin

## Structure

`RetrieveCardPin`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPinToken` | `String` | Optional | [Token](#/rest/models/structures/prepaid-card-pin-token) used as part of a two-leg card PIN reveal request sent directly from the client that generally involves a second piece of data, such as the CVV code on the back of the card. | String getCardPinToken() | setCardPinToken(String cardPinToken) |

## Example (as JSON)

```json
{
  "cardPinToken": "string"
}
```


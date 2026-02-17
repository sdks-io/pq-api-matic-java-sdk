
# Update Card Pin

## Structure

`UpdateCardPin`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardPinToken` | `String` | Optional | [Token](#/rest/models/structures/prepaid-card-pin-token) used as part of a two-leg card PIN reveal request sent directly from the client that generally involves a second piece of data, such as the CVV code on the back of the card. | String getCardPinToken() | setCardPinToken(String cardPinToken) |
| `CardPin` | `String` | Optional | [Card PIN](#/rest/models/structures/prepaid-card-pin) for ATM and Debit usage | String getCardPin() | setCardPin(String cardPin) |

## Example (as JSON)

```json
{
  "cardPinToken": "string",
  "cardPin": "string"
}
```


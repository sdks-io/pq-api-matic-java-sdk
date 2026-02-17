
# Fx Rate

Exchange rate

## Structure

`FxRate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DestinationAmount` | `Double` | Optional | Allocated money to be sent in the transaction. | Double getDestinationAmount() | setDestinationAmount(Double destinationAmount) |
| `DestinationCurrency` | [`Currencies`](../../doc/models/currencies.md) | Optional | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getDestinationCurrency() | setDestinationCurrency(Currencies destinationCurrency) |
| `DestinationFormattedAmount` | `String` | Optional | Combination of the amount and currency type<br><br>**Default**: `"$0.05 USD"` | String getDestinationFormattedAmount() | setDestinationFormattedAmount(String destinationFormattedAmount) |
| `Rate` | `Double` | Optional | Exchange [rate](#/rest/models/structures/rate)<br><br>**Constraints**: `>= 0`, `<= 1` | Double getRate() | setRate(Double rate) |
| `SourceAmount` | `Double` | Optional | Allocated money to be sent in the transaction.<br><br>**Default**: `1.02d` | Double getSourceAmount() | setSourceAmount(Double sourceAmount) |
| `SourceCurrency` | [`Currencies`](../../doc/models/currencies.md) | Optional | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getSourceCurrency() | setSourceCurrency(Currencies sourceCurrency) |
| `SourceFormattedAmount` | `String` | Optional | Combination of the amount and currency type<br><br>**Default**: `"$0.05 USD"` | String getSourceFormattedAmount() | setSourceFormattedAmount(String sourceFormattedAmount) |

## Example (as JSON)

```json
{
  "destinationAmount": 50.0,
  "destinationCurrency": "USD",
  "destinationFormattedAmount": "$0.05 USD",
  "rate": 0.85,
  "sourceAmount": 1.02,
  "sourceCurrency": "USD",
  "sourceFormattedAmount": "$0.05 USD"
}
```


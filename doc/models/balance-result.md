
# Balance Result

## Structure

`BalanceResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `double` | Required | Amount of money in the account<br><br>**Default**: `0d` | double getAmount() | setAmount(double amount) |
| `Currency` | [`Currencies`](../../doc/models/currencies.md) | Required | [Currency code type](#/rest/models/structures/country) for the object<br><br>**Default**: `Currencies.USD` | Currencies getCurrency() | setCurrency(Currencies currency) |
| `FormattedAmount` | `String` | Required | Combination of the amount and currency type<br><br>**Default**: `"$0.05 USD"` | String getFormattedAmount() | setFormattedAmount(String formattedAmount) |
| `Token` | `String` | Required | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |
| `Meta` | [`MetadataItems`](../../doc/models/metadata-items.md) | Optional | - | MetadataItems getMeta() | setMeta(MetadataItems meta) |

## Example (as JSON)

```json
{
  "amount": 0.0,
  "currency": "USD",
  "formattedAmount": "$0.05 USD",
  "token": "string",
  "links": [
    {
      "href": "string",
      "params": {
        "rel": "self"
      }
    }
  ],
  "meta": {
    "timezone": "GMT",
    "requestRef": "20260207T231757Z-r1d65bb46d495mgjhC1BL1qvx400000004rg00000000c2uh"
  }
}
```


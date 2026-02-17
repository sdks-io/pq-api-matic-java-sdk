
# Receipt Descriptions

## Structure

`ReceiptDescriptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Language` | [`Languages`](../../doc/models/languages.md) | Optional | The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format | Languages getLanguage() | setLanguage(Languages language) |
| `Translation` | `String` | Optional | Description translated to the indicated language | String getTranslation() | setTranslation(String translation) |

## Example (as JSON)

```json
{
  "language": "en-US",
  "translation": "string"
}
```


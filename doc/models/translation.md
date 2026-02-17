
# Translation

[Localized](#/rest/models/structures/key-value-pair-language-type-string) requirement description for display purposes

## Structure

`Translation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Language` | [`Languages`](../../doc/models/languages.md) | Optional | The [Language](#/rest/models/structures/language) type in IETF's BCP 47 format | Languages getLanguage() | setLanguage(Languages language) |
| `Translation` | `String` | Optional | Translated string in the specified language | String getTranslation() | setTranslation(String translation) |

## Example (as JSON)

```json
{
  "language": "en-US",
  "translation": "string"
}
```


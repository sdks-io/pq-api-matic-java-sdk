
# Prepaid Card Data Token Result

## Structure

`PrepaidCardDataTokenResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardProcessorType` | [`CardProcessors`](../../doc/models/card-processors.md) | Required | The processor type for the prepaid card | CardProcessors getCardProcessorType() | setCardProcessorType(CardProcessors cardProcessorType) |
| `ResourceValue` | `String` | Optional | Value of the target resource | String getResourceValue() | setResourceValue(String resourceValue) |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `TokenPurposeType` | [`TokenPurposes`](../../doc/models/token-purposes.md) | Required | Purpose of the token | TokenPurposes getTokenPurposeType() | setTokenPurposeType(TokenPurposes tokenPurposeType) |
| `Url` | `String` | Optional | Full path of the URI to perform the request action against a prepaid card that replaces the need to build the URL with query params. | String getUrl() | setUrl(String url) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |
| `Meta` | [`MetadataItems`](../../doc/models/metadata-items.md) | Optional | - | MetadataItems getMeta() | setMeta(MetadataItems meta) |

## Example (as JSON)

```json
{
  "cardProcessorType": "QOLO",
  "resourceValue": "string",
  "token": "string",
  "tokenPurposeType": "CARD_OPERATION",
  "url": "string",
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



# Agreement Object

## Structure

`AgreementObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `ContentBase64` | `String` | Optional | Program agreement content | String getContentBase64() | setContentBase64(String contentBase64) |
| `Url` | `String` | Optional | Full path of the URI to the content for the program agreement | String getUrl() | setUrl(String url) |
| `Type` | [`AgreementTypes`](../../doc/models/agreement-types.md) | Optional | - | AgreementTypes getType() | setType(AgreementTypes type) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |

## Example (as JSON)

```json
{
  "token": "string",
  "contentBase64": "string",
  "url": "string",
  "type": "CARD_HOLDER_AGREEMENT",
  "links": [
    {
      "href": "string",
      "params": {
        "rel": "self"
      }
    }
  ]
}
```



# Agreement List Result Json

## Structure

`AgreementListResultJson`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payload` | [`List<AgreementObject>`](../../doc/models/agreement-object.md) | Required | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<AgreementObject> getPayload() | setPayload(List<AgreementObject> payload) |
| `Meta` | [`ListMetadata`](../../doc/models/list-metadata.md) | Required | - | ListMetadata getMeta() | setMeta(ListMetadata meta) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |

## Example (as JSON)

```json
{
  "payload": [
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
  ],
  "meta": {
    "pageNo": "string",
    "pageSize": "string",
    "pageCount": "string",
    "recordCount": "string",
    "timezone": "GMT",
    "requestRef": "20260207T231757Z-r1d65bb46d495mgjhC1BL1qvx400000004rg00000000c2uh"
  },
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


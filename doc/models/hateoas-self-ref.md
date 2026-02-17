
# Hateoas Self Ref

Indicates the external link with the full URL of the same page on which the link appears.

## Structure

`HateoasSelfRef`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Href` | `String` | Optional | - | String getHref() | setHref(String href) |
| `Params` | [`HateoasRelationship`](../../doc/models/hateoas-relationship.md) | Optional | Indicates the HATEOS relationship between the target and current resources. | HateoasRelationship getParams() | setParams(HateoasRelationship params) |

## Example (as JSON)

```json
{
  "href": "string",
  "params": {
    "rel": "self"
  }
}
```


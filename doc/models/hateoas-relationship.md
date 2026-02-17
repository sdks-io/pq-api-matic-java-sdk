
# Hateoas Relationship

Indicates the HATEOS relationship between the target and current resources.

## Structure

`HateoasRelationship`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Rel` | `String` | Required | Indicates the relationship between the target and current resources.<br><br>**Default**: `"self"` | String getRel() | setRel(String rel) |

## Example (as JSON)

```json
{
  "rel": "self"
}
```


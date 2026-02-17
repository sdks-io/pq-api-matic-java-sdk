
# Document Details

1...N required [fields](#/rest/models/structures/key-value-pair-upload-field-types-string) as determined by call to get requirements

## Structure

`DocumentDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | [`UploadFields`](../../doc/models/upload-fields.md) | Required | - | UploadFields getKey() | setKey(UploadFields key) |
| `Value` | `String` | Required | - | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "EXPIRATION_DATE",
  "value": "string"
}
```


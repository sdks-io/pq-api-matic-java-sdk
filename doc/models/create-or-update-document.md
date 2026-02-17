
# Create or Update Document

## Structure

`CreateOrUpdateDocument`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Fields` | [`CreateOrUpdateDocumentFields`](../../doc/models/create-or-update-document-fields.md) | Optional | - | CreateOrUpdateDocumentFields getFields() | setFields(CreateOrUpdateDocumentFields fields) |
| `Upload` | `JsonValue` | Optional | Document to be uploaded | JsonValue getUpload() | setUpload(JsonValue upload) |

## Example (as JSON)

```json
{
  "fields": {
    "fields": [
      {
        "key": "EXPIRATION_DATE",
        "value": "string"
      }
    ]
  },
  "upload": {
    "key1": "val1",
    "key2": "val2"
  }
}
```


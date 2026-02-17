
# User Doc Req Item Docs Items Metadata Items

## Structure

`UserDocReqItemDocsItemsMetadataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DataType` | `String` | Optional | - | String getDataType() | setDataType(String dataType) |
| `FieldType` | `String` | Optional | - | String getFieldType() | setFieldType(String fieldType) |
| `Name` | [`List<UserDocReqItemDocsItemsMetadataItemsNameItems>`](../../doc/models/user-doc-req-item-docs-items-metadata-items-name-items.md) | Optional | - | List<UserDocReqItemDocsItemsMetadataItemsNameItems> getName() | setName(List<UserDocReqItemDocsItemsMetadataItemsNameItems> name) |

## Example (as JSON)

```json
{
  "dataType": "string",
  "fieldType": "string",
  "name": [
    {
      "language": "string",
      "translation": "string"
    }
  ]
}
```


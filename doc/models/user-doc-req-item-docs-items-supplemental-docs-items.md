
# User Doc Req Item Docs Items Supplemental Docs Items

## Structure

`UserDocReqItemDocsItemsSupplementalDocsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExampleImage` | `String` | Optional | Full path of the URI used for this object | String getExampleImage() | setExampleImage(String exampleImage) |
| `Status` | [`DocumentStatusTypes`](../../doc/models/document-status-types.md) | Optional | Status Type of a document | DocumentStatusTypes getStatus() | setStatus(DocumentStatusTypes status) |
| `Type` | [`DocumentTypes`](../../doc/models/document-types.md) | Optional | Indicates the enums for KYC. | DocumentTypes getType() | setType(DocumentTypes type) |

## Example (as JSON)

```json
{
  "exampleImage": "string",
  "status": "NOT_PROVIDED",
  "type": "UNDEFINED"
}
```


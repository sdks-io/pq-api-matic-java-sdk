
# User Document Requirement Item Documents Items

## Structure

`UserDocumentRequirementItemDocumentsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExampleImage` | `String` | Optional | Full path of the URI used for this object | String getExampleImage() | setExampleImage(String exampleImage) |
| `SupplementalDocuments` | [`List<UserDocReqItemDocsItemsSupplementalDocsItems>`](../../doc/models/user-doc-req-item-docs-items-supplemental-docs-items.md) | Optional | - | List<UserDocReqItemDocsItemsSupplementalDocsItems> getSupplementalDocuments() | setSupplementalDocuments(List<UserDocReqItemDocsItemsSupplementalDocsItems> supplementalDocuments) |
| `Metadata` | [`List<UserDocReqItemDocsItemsMetadataItems>`](../../doc/models/user-doc-req-item-docs-items-metadata-items.md) | Optional | - | List<UserDocReqItemDocsItemsMetadataItems> getMetadata() | setMetadata(List<UserDocReqItemDocsItemsMetadataItems> metadata) |
| `Status` | [`DocumentStatusTypes`](../../doc/models/document-status-types.md) | Optional | Status Type of a document | DocumentStatusTypes getStatus() | setStatus(DocumentStatusTypes status) |
| `Type` | [`DocumentTypes`](../../doc/models/document-types.md) | Optional | Indicates the enums for KYC. | DocumentTypes getType() | setType(DocumentTypes type) |

## Example (as JSON)

```json
{
  "exampleImage": "string",
  "supplementalDocuments": [
    {
      "exampleImage": "string",
      "status": "NOT_PROVIDED",
      "type": "UNDEFINED"
    }
  ],
  "metadata": [
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
  ],
  "status": "NOT_PROVIDED",
  "type": "UNDEFINED"
}
```


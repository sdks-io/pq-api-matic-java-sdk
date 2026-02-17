
# User Document Requirement Item

## Structure

`UserDocumentRequirementItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryOfBirth` | `String` | Optional | - | String getCountryOfBirth() | setCountryOfBirth(String countryOfBirth) |
| `CountryOfNationality` | `String` | Optional | - | String getCountryOfNationality() | setCountryOfNationality(String countryOfNationality) |
| `Documents` | [`List<UserDocumentRequirementItemDocumentsItems>`](../../doc/models/user-document-requirement-item-documents-items.md) | Optional | - | List<UserDocumentRequirementItemDocumentsItems> getDocuments() | setDocuments(List<UserDocumentRequirementItemDocumentsItems> documents) |

## Example (as JSON)

```json
{
  "countryOfBirth": "string",
  "countryOfNationality": "string",
  "documents": [
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
  ]
}
```


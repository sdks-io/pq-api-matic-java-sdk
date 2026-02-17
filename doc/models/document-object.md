
# Document Object

## Structure

`DocumentObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreateDate` | `LocalDateTime` | Required | Time object was [created](#/rest/models/structures/created-on) | LocalDateTime getCreateDate() | setCreateDate(LocalDateTime createDate) |
| `Fields` | [`List<DocumentDetails>`](../../doc/models/document-details.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<DocumentDetails> getFields() | setFields(List<DocumentDetails> fields) |
| `Filename` | `String` | Optional | The name given to a computer file in order to distinguish it from other files | String getFilename() | setFilename(String filename) |
| `MimeType` | `String` | Optional | A label used to identify a type of data.  Acts like a file extension on the internet. | String getMimeType() | setMimeType(String mimeType) |
| `Token` | `String` | Required | [Token](#/rest/models/structures/token) representing the document<br><br>**Default**: `"docu-2053aaad-c1a5-45e2-a2da-f71287f32800"`<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^docu-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getToken() | setToken(String token) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |

## Example (as JSON)

```json
{
  "createDate": "2026-02-07T22:23:09.9667010Z",
  "fields": [
    {
      "key": "EXPIRATION_DATE",
      "value": "string"
    }
  ],
  "filename": "exampleFile.jpg",
  "mimeType": "image/jpeg",
  "token": "docu-2053aaad-c1a5-45e2-a2da-f71287f32800",
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


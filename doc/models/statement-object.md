
# Statement Object

TODO: Make prepaidCardToken optional

## Structure

`StatementObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FileContents` | `String` | Optional | The string representation of the file content. | String getFileContents() | setFileContents(String fileContents) |
| `Filename` | `String` | Optional | The name given to a computer file in order to distinguish it from other files | String getFilename() | setFilename(String filename) |
| `MimeType` | `String` | Optional | A label used to identify a type of data.  Acts like a file extension on the internet. | String getMimeType() | setMimeType(String mimeType) |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `UserToken` | `String` | Optional | Auto-generated unique identifier representing a user, prefixed with `user-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^user-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getUserToken() | setUserToken(String userToken) |
| `PrepaidCardToken` | `String` | Optional | Auto-generated unique identifier representing a dest, prefixed with dest-. | String getPrepaidCardToken() | setPrepaidCardToken(String prepaidCardToken) |
| `From` | `LocalDateTime` | Optional | Beginning date and time of a prepaid card statement | LocalDateTime getFrom() | setFrom(LocalDateTime from) |
| `To` | `LocalDateTime` | Optional | Ending date and time of a prepaid card statement | LocalDateTime getTo() | setTo(LocalDateTime to) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |

## Example (as JSON)

```json
{
  "fileContents": "string",
  "filename": "exampleFile.jpg",
  "mimeType": "image/jpeg",
  "token": "string",
  "userToken": "user-2bbfc967-d12e-4647-a887-d905172fb4bc",
  "prepaidCardToken": "string",
  "from": "2026-02-07T22:23:11.2214335Z",
  "to": "2026-02-07T22:23:11.2356996Z",
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


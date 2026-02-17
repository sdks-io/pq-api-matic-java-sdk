
# Payment Job Object

Response from a payment job request

## Structure

`PaymentJobObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `PortalId` | `String` | Optional | Reference ID in the PayQuicker Hosted Portal, if applicable.<br><br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `100` | String getPortalId() | setPortalId(String portalId) |
| `Filename` | `String` | Optional | The name given to a computer file in order to distinguish it from other files | String getFilename() | setFilename(String filename) |
| `FileToken` | `String` | Optional | [Token](#/rest/models/structures/token) representing the document<br><br>**Default**: `"docu-2053aaad-c1a5-45e2-a2da-f71287f32800"`<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^docu-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getFileToken() | setFileToken(String fileToken) |
| `Created` | `LocalDateTime` | Optional | Time object was [created](#/rest/models/structures/created-on) | LocalDateTime getCreated() | setCreated(LocalDateTime created) |
| `NotBefore` | `LocalDateTime` | Optional | [Transfer](#/rest/models/structures/not-before-or-after) is scheduled and will not process before this time. | LocalDateTime getNotBefore() | setNotBefore(LocalDateTime notBefore) |
| `Count` | `Integer` | Optional | - | Integer getCount() | setCount(Integer count) |
| `Type` | [`JobTypes`](../../doc/models/job-types.md) | Optional | Job Types | JobTypes getType() | setType(JobTypes type) |
| `Status` | [`JobStatusTypes`](../../doc/models/job-status-types.md) | Optional | Job Status Types | JobStatusTypes getStatus() | setStatus(JobStatusTypes status) |
| `Items` | [`List<PaymentObject>`](../../doc/models/payment-object.md) | Optional | - | List<PaymentObject> getItems() | setItems(List<PaymentObject> items) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |

## Example (as JSON)

```json
{
  "token": "string",
  "portalId": "tjvbh",
  "filename": "exampleFile.jpg",
  "fileToken": "docu-2053aaad-c1a5-45e2-a2da-f71287f32800",
  "created": "2026-02-07T22:23:09.9667010Z",
  "notBefore": "2022-04-26T15:16:18Z",
  "count": 50,
  "type": "PAYMENTS",
  "status": "COMPLETED",
  "items": [
    {
      "token": "string",
      "portalId": "tjvbh",
      "amount": 1.02,
      "clientPaymentId": "d4b6f130-1d1c-4ce2-903a-0c1ad128f55e",
      "created": "2026-02-07T22:23:09.9667010Z",
      "currency": "USD",
      "destinationToken": "dest-631b200f-665d-4dbe-bd01-3063c9dec97d",
      "programUserId": "pdekt",
      "email": "john.doe@email.com",
      "memo": "string",
      "note": "string",
      "purpose": "BONUS",
      "sourceToken": "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860",
      "status": "ACCEPTED",
      "receiptToken": "rcpt-b7fda294-8d3a-48e8-9a11-ef7be07a732c",
      "links": [
        {
          "href": "string",
          "params": {
            "rel": "self"
          }
        }
      ]
    }
  ],
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


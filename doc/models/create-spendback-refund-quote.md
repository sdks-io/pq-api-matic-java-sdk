
# Create Spendback Refund Quote

## Structure

`CreateSpendbackRefundQuote`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Double` | Optional | Money to be refunded from original payment | Double getAmount() | setAmount(Double amount) |
| `SourceToken` | `String` | Optional | Unique identifier representing the [source of funds](#/rest/models/structures/source-token)<br><br>**Default**: `"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860"`<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^(acct\|user\|dest)-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getSourceToken() | setSourceToken(String sourceToken) |
| `ProgramUserId` | `String` | Optional | [Program identifier](#/rest/models/structures/program-user-id) for the user<br><br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `100` | String getProgramUserId() | setProgramUserId(String programUserId) |
| `Email` | `String` | Optional | Contact [email address](#/rest/models/structures/email-address) for the user account for the user account<br><br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `100`, *Pattern*: `^.+@.+\..+` | String getEmail() | setEmail(String email) |
| `DestinationToken` | `String` | Optional | Unique identifier representing the [destination of funds](#/rest/models/structures/destination-token)<br><br>**Default**: `"dest-631b200f-665d-4dbe-bd01-3063c9dec97d"`<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^(acct\|dest\|user)-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `Memo` | `String` | Optional | Optional internal [memo](#/rest/models/structures/memo) not visible to the user | String getMemo() | setMemo(String memo) |
| `Note` | `String` | Optional | [Optional comments](#/rest/models/structures/notes) visible to the user | String getNote() | setNote(String note) |
| `ClientSpendbackRefundId` | `String` | Optional | [Unique value](#/rest/models/structures/client-transfer-id) provided by the client for the transfer, utilized for reference and deduplication. | String getClientSpendbackRefundId() | setClientSpendbackRefundId(String clientSpendbackRefundId) |
| `AutoAcceptQuote` | `Boolean` | Optional | Determines whether the quote is [automatically accepted](#/rest/models/structures/auto-accept-quote) or if a `POST` utilizing the token for the quote is required. | Boolean getAutoAcceptQuote() | setAutoAcceptQuote(Boolean autoAcceptQuote) |

## Example (as JSON)

```json
{
  "amount": 1.23,
  "sourceToken": "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860",
  "programUserId": "pdekt",
  "email": "john.doe@email.com",
  "destinationToken": "dest-631b200f-665d-4dbe-bd01-3063c9dec97d",
  "memo": "string",
  "note": "string",
  "clientSpendbackRefundId": "rfnd-b7fda294-8d3a-48e8-9a11-ef7be07a732c",
  "autoAcceptQuote": true
}
```


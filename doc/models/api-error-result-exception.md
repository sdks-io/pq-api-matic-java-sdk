
# Api Error Result Exception

## Structure

`ApiErrorResultException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Severity` | `String` | Required | Error Severity | String getSeverity() | setSeverity(String severity) |
| `Error` | `String` | Required | Error Code Name | String getError() | setError(String error) |
| `Code` | `double` | Required | Error Code Number | double getCode() | setCode(double code) |
| `Message` | `String` | Required | Description of the error. | String getMessageField() | setMessageField(String messageField) |
| `ReferenceId` | `String` | Required | Reference ID for issue tracking. | String getReferenceId() | setReferenceId(String referenceId) |
| `Timestamp` | `String` | Required | Timestamp of when the error occurred. | String getTimestamp() | setTimestamp(String timestamp) |
| `RequestRef` | `String` | Optional | Request reference for issue tracking. | String getRequestRef() | setRequestRef(String requestRef) |

## Example (as JSON)

```json
{
  "severity": "string",
  "error": "string",
  "code": 50.0,
  "message": "string",
  "referenceId": "string",
  "timestamp": "string",
  "requestRef": "20260207T231757Z-r1d65bb46d495mgjhC1BL1qvx400000004rg00000000c2uh"
}
```


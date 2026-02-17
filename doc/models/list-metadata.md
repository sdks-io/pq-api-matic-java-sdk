
# List Metadata

## Structure

`ListMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PageNo` | `String` | Required | **Default**: `"1"` | String getPageNo() | setPageNo(String pageNo) |
| `PageSize` | `String` | Required | **Default**: `"10"` | String getPageSize() | setPageSize(String pageSize) |
| `PageCount` | `String` | Required | **Default**: `"1"` | String getPageCount() | setPageCount(String pageCount) |
| `RecordCount` | `String` | Required | - | String getRecordCount() | setRecordCount(String recordCount) |
| `Timezone` | `String` | Required | Timezone of the datetime objects in the response | String getTimezone() | setTimezone(String timezone) |
| `RequestRef` | `String` | Required | - | String getRequestRef() | setRequestRef(String requestRef) |

## Example (as JSON)

```json
{
  "pageNo": "string",
  "pageSize": "string",
  "pageCount": "string",
  "recordCount": "string",
  "timezone": "GMT",
  "requestRef": "20260207T231757Z-r1d65bb46d495mgjhC1BL1qvx400000004rg00000000c2uh"
}
```


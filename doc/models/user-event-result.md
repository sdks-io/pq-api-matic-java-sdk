
# User Event Result

## Structure

`UserEventResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `CanBeCancelled` | `Boolean` | Optional | - | Boolean getCanBeCancelled() | setCanBeCancelled(Boolean canBeCancelled) |
| `EventRequirementCategoryType` | [`EventRequirementCategories`](../../doc/models/event-requirement-categories.md) | Optional | - | EventRequirementCategories getEventRequirementCategoryType() | setEventRequirementCategoryType(EventRequirementCategories eventRequirementCategoryType) |
| `EventRequirementType` | [`EventRequirements`](../../doc/models/event-requirements.md) | Optional | - | EventRequirements getEventRequirementType() | setEventRequirementType(EventRequirements eventRequirementType) |
| `EventStatus` | [`EventStatuses`](../../doc/models/event-statuses.md) | Optional | Indicates the current verification status type of an event. | EventStatuses getEventStatus() | setEventStatus(EventStatuses eventStatus) |
| `EventType` | [`EventTypes`](../../doc/models/event-types.md) | Optional | - | EventTypes getEventType() | setEventType(EventTypes eventType) |
| `IsComplete` | `Boolean` | Optional | - | Boolean getIsComplete() | setIsComplete(Boolean isComplete) |
| `UserAction` | [`UserAction`](../../doc/models/user-action.md) | Optional | - | UserAction getUserAction() | setUserAction(UserAction userAction) |
| `UserImpact` | [`UserImpact`](../../doc/models/user-impact.md) | Optional | - | UserImpact getUserImpact() | setUserImpact(UserImpact userImpact) |
| `Event` | [`EventCategoryTypes`](../../doc/models/event-category-types.md) | Required | The type of Registration tied to a particular event | EventCategoryTypes getEvent() | setEvent(EventCategoryTypes event) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |
| `Meta` | [`MetadataItems`](../../doc/models/metadata-items.md) | Optional | - | MetadataItems getMeta() | setMeta(MetadataItems meta) |

## Example (as JSON)

```json
{
  "token": "string",
  "canBeCancelled": true,
  "eventRequirementCategoryType": "ACKNOWLEDGEMENT",
  "eventRequirementType": "ACH_UPGRADE_PII_DETAILS_VALIDATED",
  "eventStatus": "UNDEFINED",
  "eventType": "REQUIRED",
  "isComplete": true,
  "userAction": "NO_ACTION",
  "userImpact": "NO_IMPACT",
  "event": "WALLET_REGISTRATION",
  "links": [
    {
      "href": "string",
      "params": {
        "rel": "self"
      }
    }
  ],
  "meta": {
    "timezone": "GMT",
    "requestRef": "20260207T231757Z-r1d65bb46d495mgjhC1BL1qvx400000004rg00000000c2uh"
  }
}
```


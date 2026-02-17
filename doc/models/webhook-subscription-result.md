
# Webhook Subscription Result

## Structure

`WebhookSubscriptionResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `Created` | `LocalDateTime` | Optional | Time object was [created](#/rest/models/structures/created-on) | LocalDateTime getCreated() | setCreated(LocalDateTime created) |
| `LastUpdated` | `LocalDateTime` | Optional | Date and time that the object was last updated | LocalDateTime getLastUpdated() | setLastUpdated(LocalDateTime lastUpdated) |
| `Url` | `String` | Optional | Full path of the URI used for this object | String getUrl() | setUrl(String url) |
| `Namespace` | [`WebhookNamespaces`](../../doc/models/webhook-namespaces.md) | Optional | Namespace used to identify and refer to the object | WebhookNamespaces getNamespace() | setNamespace(WebhookNamespaces namespace) |
| `Status` | [`WebhookSubscriptionStatuses`](../../doc/models/webhook-subscription-statuses.md) | Optional | - | WebhookSubscriptionStatuses getStatus() | setStatus(WebhookSubscriptionStatuses status) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |
| `Meta` | [`MetadataItems`](../../doc/models/metadata-items.md) | Optional | - | MetadataItems getMeta() | setMeta(MetadataItems meta) |

## Example (as JSON)

```json
{
  "token": "string",
  "created": "2026-02-07T22:23:09.9667010Z",
  "lastUpdated": "2026-02-07T22:23:10.6448125Z",
  "url": "string",
  "namespace": "BANKACCOUNTS.CREATED",
  "status": "AVAILABLE",
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


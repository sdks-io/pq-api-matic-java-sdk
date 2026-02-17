
# Webhook Subscription Object

Webhook subscription object

## Structure

`WebhookSubscriptionObject`

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

## Example (as JSON)

```json
{
  "token": "string",
  "created": "02/07/2026 22:23:09",
  "lastUpdated": "02/07/2026 22:23:10",
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
  ]
}
```


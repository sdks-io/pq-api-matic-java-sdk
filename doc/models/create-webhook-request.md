
# Create Webhook Request

## Structure

`CreateWebhookRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Namespace` | [`WebhookNamespaces`](../../doc/models/webhook-namespaces.md) | Optional | Namespace used to identify and refer to the object | WebhookNamespaces getNamespace() | setNamespace(WebhookNamespaces namespace) |
| `Url` | `String` | Optional | Full path of the URI used for this object | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "namespace": "BANKACCOUNTS.CREATED",
  "url": "string"
}
```


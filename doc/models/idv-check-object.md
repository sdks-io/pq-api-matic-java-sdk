
# Idv Check Object

## Structure

`IdvCheckObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getToken() | setToken(String token) |
| `UserToken` | `String` | Optional | [Token](#/rest/models/structures/token) representing the resource | String getUserToken() | setUserToken(String userToken) |
| `IdvProviderReference` | `String` | Optional | [Provider reference](#/rest/models/structures/identity-verification-provider-reference) used for performing identity checks for the provider | String getIdvProviderReference() | setIdvProviderReference(String idvProviderReference) |
| `IdvResult` | [`IdentityVerificationResultTypes`](../../doc/models/identity-verification-result-types.md) | Optional | Result type of [verification](#/rest/models/structures/identity-verification-result-type) | IdentityVerificationResultTypes getIdvResult() | setIdvResult(IdentityVerificationResultTypes idvResult) |
| `IdvSubResult` | [`IdentityVerificationResultSubTypes`](../../doc/models/identity-verification-result-sub-types.md) | Optional | Sub result type of [verification](#/rest/models/structures/identity-verification-sub-result-type) | IdentityVerificationResultSubTypes getIdvSubResult() | setIdvSubResult(IdentityVerificationResultSubTypes idvSubResult) |
| `IdvProvider` | [`IdentityVerificationProviders`](../../doc/models/identity-verification-providers.md) | Optional | Provider types of [verification](#/rest/models/structures/identity-verification-provider-type) that can be used for performing identity checks | IdentityVerificationProviders getIdvProvider() | setIdvProvider(IdentityVerificationProviders idvProvider) |
| `CreatedOn` | `LocalDateTime` | Optional | Time object was [created](#/rest/models/structures/created-on) | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Raw` | `String` | Optional | Contains the raw (unprocessed) [output](/#/rest/models/structures/identity-verification-provider-raw-output) from the IDV provider | String getRaw() | setRaw(String raw) |
| `IdvCheckType` | `String` | Optional | [Type](#/rest/models/structures/identity-verification-check-type) of verification used for performing an identity check | String getIdvCheckType() | setIdvCheckType(String idvCheckType) |
| `IdvDisposition` | `String` | Optional | Disposition type of [verification](#/rest/models/structures/identity-verification-disposition-type) | String getIdvDisposition() | setIdvDisposition(String idvDisposition) |
| `Links` | [`List<HateoasSelfRef>`](../../doc/models/hateoas-self-ref.md) | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Unique Items Required* | List<HateoasSelfRef> getLinks() | setLinks(List<HateoasSelfRef> links) |

## Example (as JSON)

```json
{
  "token": "string",
  "userToken": "string",
  "idvProviderReference": "string",
  "idvResult": "PASS",
  "idvSubResult": "HARD",
  "idvProvider": "EQUIFAX",
  "createdOn": "2026-02-07T22:23:09.9667010Z",
  "raw": "string",
  "idvCheckType": "string",
  "idvDisposition": "string",
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



# Configuration Interface

This is the interface for client class that holds the configuration getters.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getSandboxInstance()` | Sandbox Environments | `SandboxInstance` |
| `getUatInstance()` | UAT Environments | `UatInstance` |
| `getXMyPayQuickerVersion()` | Date-based API Version specified in the header *required* on all calls. | `String` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](../doc/http-client-configuration.md) |
| `getLoggingConfig()` | Logging Configuration instance. | [`ReadonlyLoggingConfiguration`](../doc/api-logging-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment. | `String` |
| `getBaseUri()` | Get base URI by current environment. | `String` |


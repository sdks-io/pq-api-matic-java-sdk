
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| xMyPayQuickerVersion | `String` | Date-based API Version specified in the header *required* on all calls.<br>*Default*: `"2026.02.01"` |
| sandboxInstance | `SandboxInstance` | Sandbox Environments<br>*Default*: `SandboxInstance.SANDBOX` |
| uatInstance | `UatInstance` | UAT Environments<br>*Default*: `UatInstance.UAT1` |
| environment | [`Environment`](../README.md#environments) | The API environment. <br> **Default: `Environment.SANDBOX`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](../doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](../doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| serverCredentials | [`ServerCredentials`](auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| clientsideCredentials | [`ClientsideCredentials`](auth/oauth-2-bearer-token.md) | The Credentials Setter for OAuth 2 Bearer token |

The API client can be initialized as follows:

```java
import com.mypayquicker.api.Environment;
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.authentication.ClientsideModel;
import com.mypayquicker.api.authentication.ServerModel;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.OAuthScopeServer;
import com.mypayquicker.api.models.OAuthToken;
import com.mypayquicker.api.models.SandboxInstance;
import com.mypayquicker.api.models.UatInstance;
import java.io.IOException;
import java.util.Arrays;
import org.slf4j.event.Level;

public class Program {
    public static void main(String[] args) {
        PayQuickerSDKClient client = new PayQuickerSDKClient.Builder()
            .loggingConfig(builder -> builder
                    .level(Level.DEBUG)
                    .requestConfig(logConfigBuilder -> logConfigBuilder.body(true))
                    .responseConfig(logConfigBuilder -> logConfigBuilder.headers(true)))
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .xMyPayQuickerVersion("2026.02.01")
            .serverCredentials(new ServerModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oAuthScopes(Arrays.asList(
                        OAuthScopeServer.READONLY,
                        OAuthScopeServer.MODIFY
                    ))
                .build())
            .clientsideCredentials(new ClientsideModel.Builder(
                    "AccessToken"
                )
                .build())
            .environment(Environment.SANDBOX)
            .sandboxInstance(SandboxInstance.SANDBOX)
            .uatInstance(UatInstance.UAT1)
            .build();

    }
}
```

## PQ API v2Client Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAgreementsController()` | Provides access to Agreements controller. | `AgreementsController` |
| `getBalancesController()` | Provides access to Balances controller. | `BalancesController` |
| `getBankAccountsController()` | Provides access to BankAccounts controller. | `BankAccountsController` |
| `getClientSideController()` | Provides access to ClientSide controller. | `ClientSideController` |
| `getComplianceController()` | Provides access to Compliance controller. | `ComplianceController` |
| `getDocumentsController()` | Provides access to Documents controller. | `DocumentsController` |
| `getElectronicWalletsController()` | Provides access to ElectronicWallets controller. | `ElectronicWalletsController` |
| `getEventsController()` | Provides access to Events controller. | `EventsController` |
| `getPaymentsController()` | Provides access to Payments controller. | `PaymentsController` |
| `getPrepaidCardsController()` | Provides access to PrepaidCards controller. | `PrepaidCardsController` |
| `getProgramController()` | Provides access to Program controller. | `ProgramController` |
| `getReceiptsController()` | Provides access to Receipts controller. | `ReceiptsController` |
| `getSpendbackController()` | Provides access to Spendback controller. | `SpendbackController` |
| `getSpendbackRefundsController()` | Provides access to SpendbackRefunds controller. | `SpendbackRefundsController` |
| `getStatementsController()` | Provides access to Statements controller. | `StatementsController` |
| `getTransfersController()` | Provides access to Transfers controller. | `TransfersController` |
| `getUsersController()` | Provides access to Users controller. | `UsersController` |
| `getWebhooksController()` | Provides access to Webhooks controller. | `WebhooksController` |
| `getJobsController()` | Provides access to Jobs controller. | `JobsController` |
| `getInvitationsController()` | Provides access to Invitations controller. | `InvitationsController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getSandboxInstance()` | Sandbox Environments | `SandboxInstance` |
| `getUatInstance()` | UAT Environments | `UatInstance` |
| `getXMyPayQuickerVersion()` | Date-based API Version specified in the header *required* on all calls. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](../doc/http-client-configuration.md) |
| `getLoggingConfig()` | Logging Configuration instance. | [`ReadonlyLoggingConfiguration`](../doc/api-logging-configuration.md) |
| `getServerCredentials()` | The credentials to use with Server. | [`ServerCredentials`](auth/oauth-2-client-credentials-grant.md) |
| `getClientsideCredentials()` | The credentials to use with Clientside. | [`ClientsideCredentials`](auth/oauth-2-bearer-token.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |



# Getting Started with PQ API v2

## Introduction

PayQuicker offers a secure and instant payout platform that delivers payment to a payee-owned and insured bank account linked to a debit card, similar to a standard checking account.

As soon as the payment is made, funds are available in the insured account and available to spend instantly online through a virtual card, at retail with a plastic prepaid debit card, or by loading the card to a mobile wallet.

PayQuicker provides a RESTful API that allows authorized clients to send and receive payments, debit user's accounts for spendback, retrieve user account balance, retrieve user reports, and retrieve transaction reports.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>pq-api-matic-sdk</artifactId>
  <version>1.0.2</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/pq-api-matic-sdk/1.0.2

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| xMyPayQuickerVersion | `String` | Date-based API Version specified in the header *required* on all calls.<br>*Default*: `"2026.02.01"` |
| sandboxInstance | `SandboxInstance` | Sandbox Environments<br>*Default*: `SandboxInstance.SANDBOX` |
| uatInstance | `UatInstance` | UAT Environments<br>*Default*: `UatInstance.UAT1` |
| environment | [`Environment`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/README.md#environments) | The API environment. <br> **Default: `Environment.SANDBOX`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| serverCredentials | [`ServerCredentials`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| clientsideCredentials | [`ClientsideCredentials`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/auth/oauth-2-bearer-token.md) | The Credentials Setter for OAuth 2 Bearer token |

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

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| PRODUCTION | Production |
| SANDBOX | **Default** Sandbox is used for both sandbox testing and customer UAT. |
| UAT | UAT is used for both sandbox testing and customer UAT. |
| DEVELOPMENT | Development is used for local development testing. |

## Authorization

This API uses the following authentication schemes.

* [`server (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/auth/oauth-2-client-credentials-grant.md)
* [`clientside (OAuth 2 Bearer token)`](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/auth/oauth-2-bearer-token.md)

## List of APIs

* [Agreements](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/agreements.md)
* [Balances](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/balances.md)
* [Bank Accounts](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/bank-accounts.md)
* [Client Side](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/client-side.md)
* [Compliance](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/compliance.md)
* [Documents](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/documents.md)
* [Electronic Wallets](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/electronic-wallets.md)
* [Events](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/events.md)
* [Invitations](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/invitations.md)
* [Jobs](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/jobs.md)
* [Payments](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/payments.md)
* [Prepaid Cards](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/prepaid-cards.md)
* [Program](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/program.md)
* [Receipts](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/receipts.md)
* [Spendback](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/spendback.md)
* [Spendback Refunds](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/spendback-refunds.md)
* [Statements](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/statements.md)
* [Transfers](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/transfers.md)
* [Users](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/users.md)
* [Webhooks](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/controllers/webhooks.md)

## SDK Infrastructure

### Configuration

* [ApiLoggingConfiguration](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-response-logging-configuration-builder.md)
* [Configuration Interface](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-client-configuration-builder.md)
* [HttpProxyConfiguration](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-proxy-configuration.md)
* [HttpProxyConfiguration.Builder](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-proxy-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-exception.md)
* [ApiHelper](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/api-helper.md)
* [FileWrapper](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/file-wrapper.md)
* [JsonObject](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/json-object.md)
* [JsonValue](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/json-value.md)
* [DateTimeHelper](https://www.github.com/sdks-io/pq-api-matic-java-sdk/tree/1.0.2/doc/date-time-helper.md)


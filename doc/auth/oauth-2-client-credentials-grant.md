
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for server.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oAuthClientSecret` | `getOAuthClientSecret()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |
| OAuthScopes | `List<OAuthScopeServer>` | List of scopes that apply to the OAuth token | `oAuthScopes` | `getOAuthScopes()` |
| OAuthClockSkew | `long` | Clock skew time in seconds applied while checking the OAuth Token expiry. | `oAuthClockSkew` | `getOAuthClockSkew()` |
| OAuthTokenProvider | `BiFunction<OAuthToken, ServerCredentials, OAuthToken>` | Registers a callback for oAuth Token Provider used for automatic token fetching/refreshing. | `oAuthTokenProvider` | `getOAuthTokenProvider()` |
| OAuthOnTokenUpdate | `Consumer<OAuthToken>` | Registers a callback for token update event. | `oAuthOnTokenUpdate` | `getOAuthOnTokenUpdate()` |



**Note:** Auth credentials can be set using `serverCredentials` in the client builder and accessed through `getServerCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet. This will fetch the OAuth token automatically when any of the endpoints, requiring *OAuth 2.0 Client Credentials Grant* authentication, are called.

```java
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.authentication.ServerModel;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.OAuthScopeServer;
import com.mypayquicker.api.models.OAuthToken;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        PayQuickerSDKClient client = new PayQuickerSDKClient.Builder()
            .serverCredentials(new ServerModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oAuthScopes(Arrays.asList(
                        OAuthScopeServer.READONLY,
                        OAuthScopeServer.MODIFY
                    ))
                .build())
            .build();
    }
}
```



Your application can also manually provide an OAuthToken using the setter `oAuthToken` in `ServerModel` object. This function takes in an instance of OAuthToken containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with scopes for which you need permission to access.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OAuthScopeServer`](../../doc/models/o-auth-scope-server.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `READONLY` | readonly scope |
| `MODIFY` | modify scope |

### Adding OAuth Token Update Callback

Whenever the OAuth Token gets updated, the provided callback implementation will be executed. For instance, you may use it to store your access token whenever it gets updated.

```java
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.OAuthScopeServer;
import com.mypayquicker.api.models.OAuthToken;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        PayQuickerSDKClient client = new PayQuickerSDKClient.Builder()
            .serverCredentials(new ServerModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oAuthScopes(Arrays.asList(
                        OAuthScopeServer.READONLY,
                        OAuthScopeServer.MODIFY
                    ))
                .oAuthOnTokenUpdate(oAuthToken -> {
                        // Add the callback handler to perform operations like save to DB or file etc.
                        // It will be triggered whenever the token gets updated
                        saveTokenToDatabase(oAuthToken);
                })
                .build())
            .build();
    }
}
```

### Adding Custom OAuth Token Provider

To authorize a client using a stored access token, set up the `oAuthTokenProvider` in `ServerModel` builder along with the other auth parameters before creating the client:

```java
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.OAuthScopeServer;
import com.mypayquicker.api.models.OAuthToken;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        PayQuickerSDKClient client = new PayQuickerSDKClient.Builder()
            .serverCredentials(new ServerModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oAuthScopes(Arrays.asList(
                        OAuthScopeServer.READONLY,
                        OAuthScopeServer.MODIFY
                    ))
                .oAuthTokenProvider((lastOAuthToken, credentialsManager) -> {
                        // Add the callback handler to provide a new OAuth token
                        // It will be triggered whenever the lastOAuthToken is undefined or expired
                        OAuthToken oAuthToken = loadTokenFromDatabase();
                        if (oAuthToken != null && !credentialsManager.isTokenExpired(oAuthToken)) {
                            return oAuthToken;
                        }
                        return credentialsManager.fetchToken();
                })
                .build())
            .build();
    }
}
```



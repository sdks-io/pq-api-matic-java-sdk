
# OAuth 2 Bearer token



Documentation for accessing and setting credentials for clientside.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| AccessToken | `String` | The OAuth 2.0 Access Token to use for API requests. | `accessToken` | `getAccessToken()` |



**Note:** Auth credentials can be set using `clientsideCredentials` in the client builder and accessed through `getClientsideCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.authentication.ClientsideModel;

public class Program {
    public static void main(String[] args) {
        PayQuickerSDKClient client = new PayQuickerSDKClient.Builder()
            .clientsideCredentials(new ClientsideModel.Builder(
                    "AccessToken"
                )
                .build())
            .build();
    }
}
```



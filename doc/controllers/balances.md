# Balances

# Balances

---


The *Balances* resource represents your user, prepaid card, and account balances.

With this resource, you can perform the following request:

* `GET`: Retrieve a list of User, Prepaid Card, and Account balances.

For more information, see [Balances](page:resources/balances).

```java
BalancesController balancesController = client.getBalancesController();
```

## Class Name

`BalancesController`

## Methods

* [List Account Balances](../../doc/controllers/balances.md#list-account-balances)
* [List User Balances](../../doc/controllers/balances.md#list-user-balances)
* [Retrieve Card Balance](../../doc/controllers/balances.md#retrieve-card-balance)


# List Account Balances

Retrieve a list of bank account [balances](page:resources/balances) that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<BalanceListResult> listAccountBalancesAsync(
    final String accountToken,
    final int page,
    final int pageSize,
    final String filter,
    final String sort,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountToken` | `String` | Template, Required | Auto-generated unique identifier representing a company account, prefixed with `acct-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^acct-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `page` | `int` | Query, Required | Page number of specific page to return<br><br>**Constraints**: `>= 1` |
| `pageSize` | `int` | Query, Required | Number of items to be displayed per page<br><br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`BalanceListResult`](../../doc/models/balance-list-result.md)

## Example Usage

```java
String accountToken = "acct-b3f0570a-6586-4e00-8d6e-8a2bf93cfae4";
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

balancesController.listAccountBalancesAsync(accountToken, page, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ApiErrorResultException) {
        ApiErrorResultException apiErrorResultException = (ApiErrorResultException) cause;
        apiErrorResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "payload": [
    {
      "amount": 0,
      "currency": "USD",
      "formattedAmount": "$0.00 USD",
      "token": "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860",
      "links": [
        {
          "href": "https://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80-a63a7b147860/balances",
          "params": {
            "rel": "self"
          }
        }
      ]
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "20",
    "pageCount": "0",
    "recordCount": "0",
    "timezone": "GMT",
    "requestRef": "request-reference-value"
  },
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80-a63a7b147860/balances?page=1&pageSize=20&language=en-US",
      "params": {
        "rel": "self"
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


# List User Balances

Retrieve a list of user [balances](page:resources/balances) that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<BalanceListResult> listUserBalancesAsync(
    final String userToken,
    final int page,
    final int pageSize,
    final String filter,
    final String sort,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with `user-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^user-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `page` | `int` | Query, Required | Page number of specific page to return<br><br>**Constraints**: `>= 1` |
| `pageSize` | `int` | Query, Required | Number of items to be displayed per page<br><br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`BalanceListResult`](../../doc/models/balance-list-result.md)

## Example Usage

```java
String userToken = "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

balancesController.listUserBalancesAsync(userToken, page, pageSize, filter, sort, language).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ApiErrorResultException) {
        ApiErrorResultException apiErrorResultException = (ApiErrorResultException) cause;
        apiErrorResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "payload": [
    {
      "amount": 0,
      "currency": "USD",
      "formattedAmount": "$0.00 USD",
      "token": "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860",
      "links": [
        {
          "href": "https://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80-a63a7b147860/balances",
          "params": {
            "rel": "self"
          }
        }
      ]
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "20",
    "pageCount": "0",
    "recordCount": "0",
    "timezone": "GMT",
    "requestRef": "request-reference-value"
  },
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80-a63a7b147860/balances?page=1&pageSize=20&language=en-US",
      "params": {
        "rel": "self"
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


# Retrieve Card Balance

Retrieve a [prepaid card](page:resources/prepaid-cards) [balances](page:resources/balances) by destination token that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<BalanceResult> retrieveCardBalanceAsync(
    final String userToken,
    final String destinationToken,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with `user-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^user-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `destinationToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with `dest-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`BalanceResult`](../../doc/models/balance-result.md)

## Example Usage

```java
String userToken = "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
String destinationToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
Languages language = Languages.ENUS;

balancesController.retrieveCardBalanceAsync(userToken, destinationToken, language).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ApiErrorResultException) {
        ApiErrorResultException apiErrorResultException = (ApiErrorResultException) cause;
        apiErrorResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "amount": 0,
  "currency": "USD",
  "formattedAmount": "$0.00 USD",
  "token": "dest-2de9ddbf-2631-4c94-a699-90917f113b24",
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-2de9ddbf-2631-4c94-a699-90917f113b24/balances",
      "params": {
        "rel": "self"
      }
    }
  ],
  "meta": {
    "timezone": "GMT",
    "requestRef": "request-reference-value"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


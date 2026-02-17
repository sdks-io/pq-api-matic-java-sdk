# Statements

Statement-related operations

```java
StatementsController statementsController = client.getStatementsController();
```

## Class Name

`StatementsController`

## Methods

* [List Prepaid Card Statements](../../doc/controllers/statements.md#list-prepaid-card-statements)
* [List Statements](../../doc/controllers/statements.md#list-statements)
* [Retrieve Prepaid Card Statement](../../doc/controllers/statements.md#retrieve-prepaid-card-statement)
* [Retrieve Statement](../../doc/controllers/statements.md#retrieve-statement)


# List Prepaid Card Statements

List Prepaid Card Statements for specific user

```java
CompletableFuture<StatementListResult> listPrepaidCardStatementsAsync(
    final String userToken,
    final String destinationToken,
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
| `destinationToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with `dest-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `page` | `int` | Query, Required | Page number of specific page to return<br><br>**Constraints**: `>= 1` |
| `pageSize` | `int` | Query, Required | Number of items to be displayed per page<br><br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`StatementListResult`](../../doc/models/statement-list-result.md)

## Example Usage

```java
String userToken = "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
String destinationToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

statementsController.listPrepaidCardStatementsAsync(userToken, destinationToken, page, pageSize, filter, sort, language).thenAccept(result -> {
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
      "token": "docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
      "userToken": "user-02e4d25a-af16-4e74-8b8d-6fa45b78af72",
      "prepaidCardToken": "dest-0aeed588-494c-444a-8c76-d5df54bdc435",
      "from": "2021-10-18T00:00:00Z",
      "to": "2021-11-17T00:00:00Z",
      "links": [
        {
          "href": "https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
          "params": {
            "rel": "self"
          }
        }
      ]
    },
    {
      "token": "docu-b4879d40-372f-4dc5-ac85-c83b662a240e",
      "userToken": "user-02e4d25a-af16-4e74-8b8d-6fa45b78af72",
      "prepaidCardToken": "dest-0aeed588-494c-444a-8c76-d5df54bdc435",
      "from": "2021-11-18T00:00:00Z",
      "to": "2021-12-17T00:00:00Z",
      "links": [
        {
          "href": "https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-b4879d40-372f-4dc5-ac85-c83b662a240e",
          "params": {
            "rel": "self"
          }
        }
      ]
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "100",
    "pageCount": "0",
    "recordCount": "0",
    "timezone": "GMT",
    "requestRef": "request-reference-value"
  },
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements",
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


# List Statements

Returns all statements for the specified user

```java
CompletableFuture<StatementListResult> listStatementsAsync(
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

[`StatementListResult`](../../doc/models/statement-list-result.md)

## Example Usage

```java
String userToken = "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

statementsController.listStatementsAsync(userToken, page, pageSize, filter, sort, language).thenAccept(result -> {
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
      "token": "docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
      "userToken": "user-02e4d25a-af16-4e74-8b8d-6fa45b78af72",
      "prepaidCardToken": "dest-0aeed588-494c-444a-8c76-d5df54bdc435",
      "from": "2021-10-18T00:00:00Z",
      "to": "2021-11-17T00:00:00Z",
      "links": [
        {
          "href": "https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
          "params": {
            "rel": "self"
          }
        }
      ]
    },
    {
      "token": "docu-b4879d40-372f-4dc5-ac85-c83b662a240e",
      "userToken": "user-02e4d25a-af16-4e74-8b8d-6fa45b78af72",
      "prepaidCardToken": "dest-0aeed588-494c-444a-8c76-d5df54bdc435",
      "from": "2021-11-18T00:00:00Z",
      "to": "2021-12-17T00:00:00Z",
      "links": [
        {
          "href": "https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-b4879d40-372f-4dc5-ac85-c83b662a240e",
          "params": {
            "rel": "self"
          }
        }
      ]
    }
  ],
  "meta": {
    "pageNo": "1",
    "pageSize": "100",
    "pageCount": "0",
    "recordCount": "0",
    "timezone": "GMT",
    "requestRef": "request-reference-value"
  },
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements",
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


# Retrieve Prepaid Card Statement

Retrieve a single prepaid card agreement.

```java
CompletableFuture<StatementResult> retrievePrepaidCardStatementAsync(
    final String userToken,
    final String destinationToken,
    final String documentToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with `user-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^user-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `destinationToken` | `String` | Template, Required | Auto-generated unique identifier representing a transfer destination, including prepaid cards, bank accounts, paper checks, and other users, prefixed with `dest-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^dest-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `documentToken` | `String` | Template, Required | Auto-generated unique identifier representing an uploaded document, prefixed with `docu-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^docu-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`readonly`

## Response Type

[`StatementResult`](../../doc/models/statement-result.md)

## Example Usage

```java
String userToken = "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
String destinationToken = "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
String documentToken = "docu-6e582242-5dd4-4883-b0c2-488e09a26595";

statementsController.retrievePrepaidCardStatementAsync(userToken, destinationToken, documentToken).thenAccept(result -> {
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
  "fileContents": "JVBERi0xLj........QKg2MjcKJSVFT0YK",
  "filename": "Statement-9506c668-11-17-2021.pdf",
  "mimeType": "application/pdf",
  "token": "docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
  "userToken": "user-02e4d25a-af16-4e74-8b8d-6fa45b78af72",
  "prepaidCardToken": "dest-0aeed588-494c-444a-8c76-d5df54bdc435",
  "from": "2021-10-18T00:00:00Z",
  "to": "2021-11-17T00:00:00Z",
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
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


# Retrieve Statement

Return a specific statement

```java
CompletableFuture<StatementResult> retrieveStatementAsync(
    final String userToken,
    final String documentToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userToken` | `String` | Template, Required | Auto-generated unique identifier representing a user, prefixed with `user-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^user-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `documentToken` | `String` | Template, Required | Auto-generated unique identifier representing an uploaded document, prefixed with `docu-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^docu-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`readonly`

## Response Type

[`StatementResult`](../../doc/models/statement-result.md)

## Example Usage

```java
String userToken = "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
String documentToken = "docu-6e582242-5dd4-4883-b0c2-488e09a26595";

statementsController.retrieveStatementAsync(userToken, documentToken).thenAccept(result -> {
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
  "fileContents": "JVBERi0xLj........QKg2MjcKJSVFT0YK",
  "filename": "Statement-9506c668-11-17-2021.pdf",
  "mimeType": "application/pdf",
  "token": "docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
  "userToken": "user-02e4d25a-af16-4e74-8b8d-6fa45b78af72",
  "prepaidCardToken": "dest-0aeed588-494c-444a-8c76-d5df54bdc435",
  "from": "2021-10-18T00:00:00Z",
  "to": "2021-11-17T00:00:00Z",
  "links": [
    {
      "href": "https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48",
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


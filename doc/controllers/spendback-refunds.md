# Spendback Refunds

```java
SpendbackRefundsController spendbackRefundsController = client.getSpendbackRefundsController();
```

## Class Name

`SpendbackRefundsController`

## Methods

* [Accept Spendback Refund Quote](../../doc/controllers/spendback-refunds.md#accept-spendback-refund-quote)
* [Cancel Spendback Refund Quote](../../doc/controllers/spendback-refunds.md#cancel-spendback-refund-quote)
* [Create Spendback Refund Quote](../../doc/controllers/spendback-refunds.md#create-spendback-refund-quote)
* [List Spendback Refunds](../../doc/controllers/spendback-refunds.md#list-spendback-refunds)
* [Retrieve Spendback Refund](../../doc/controllers/spendback-refunds.md#retrieve-spendback-refund)


# Accept Spendback Refund Quote

Accept a spendback return quote.

```java
CompletableFuture<SpendbackRefundResult> acceptSpendbackRefundQuoteAsync(
    final String spendbackToken,
    final String refundToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spendbackToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back transaction and quote, prefixed with `spnd-`.<br><br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `refundToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back refund transaction and quote, prefixed with `rfnd-`.<br><br>**Constraints**: *Pattern*: `^rfnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`modify`

## Response Type

[`SpendbackRefundResult`](../../doc/models/spendback-refund-result.md)

## Example Usage

```java
String spendbackToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String refundToken = "rfnd-c39437e1-dc80-4293-8211-c14b5a32f762";

spendbackRefundsController.acceptSpendbackRefundQuoteAsync(spendbackToken, refundToken).thenAccept(result -> {
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

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


# Cancel Spendback Refund Quote

Cancel an spendback refund quote.

```java
CompletableFuture<SpendbackRefundResult> cancelSpendbackRefundQuoteAsync(
    final String spendbackToken,
    final String refundToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spendbackToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back transaction and quote, prefixed with `spnd-`.<br><br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `refundToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back refund transaction and quote, prefixed with `rfnd-`.<br><br>**Constraints**: *Pattern*: `^rfnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`modify`

## Response Type

[`SpendbackRefundResult`](../../doc/models/spendback-refund-result.md)

## Example Usage

```java
String spendbackToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String refundToken = "rfnd-c39437e1-dc80-4293-8211-c14b5a32f762";

spendbackRefundsController.cancelSpendbackRefundQuoteAsync(spendbackToken, refundToken).thenAccept(result -> {
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

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


# Create Spendback Refund Quote

Perform a [spendback](page:resources/spendbacks) refund for a partial amount.

```java
CompletableFuture<SpendbackRefundResult> createSpendbackRefundQuoteAsync(
    final String spendbackToken,
    final CreateSpendbackRefundQuote body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spendbackToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back transaction and quote, prefixed with `spnd-`.<br><br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `body` | [`CreateSpendbackRefundQuote`](../../doc/models/create-spendback-refund-quote.md) | Body, Optional | - |

## Requires scope

### server

`modify`

## Response Type

[`SpendbackRefundResult`](../../doc/models/spendback-refund-result.md)

## Example Usage

```java
String spendbackToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
CreateSpendbackRefundQuote body = new CreateSpendbackRefundQuote.Builder()
    .amount(1.13D)
    .build();

spendbackRefundsController.createSpendbackRefundQuoteAsync(spendbackToken, body).thenAccept(result -> {
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

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


# List Spendback Refunds

Retrieve a list of [spendbacks](page:resources/spendbacks) refunds that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<SpendbackRefundListResult> listSpendbackRefundsAsync(
    final String spendbackToken,
    final int page,
    final int pageSize,
    final String filter,
    final String sort,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spendbackToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back transaction and quote, prefixed with `spnd-`.<br><br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `page` | `int` | Query, Required | Page number of specific page to return<br><br>**Constraints**: `>= 1` |
| `pageSize` | `int` | Query, Required | Number of items to be displayed per page<br><br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`SpendbackRefundListResult`](../../doc/models/spendback-refund-list-result.md)

## Example Usage

```java
String spendbackToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

spendbackRefundsController.listSpendbackRefundsAsync(spendbackToken, page, pageSize, filter, sort, language).thenAccept(result -> {
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

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


# Retrieve Spendback Refund

Retrieve a single spendback refund using the rfnd token

```java
CompletableFuture<SpendbackRefundResult> retrieveSpendbackRefundAsync(
    final String spendbackToken,
    final String refundToken,
    final int page,
    final int pageSize,
    final String filter,
    final String sort,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `spendbackToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back transaction and quote, prefixed with `spnd-`.<br><br>**Constraints**: *Pattern*: `^spnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `refundToken` | `String` | Template, Required | Auto-generated unique identifier representing an individual spend back refund transaction and quote, prefixed with `rfnd-`.<br><br>**Constraints**: *Pattern*: `^rfnd-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `page` | `int` | Query, Required | Page number of specific page to return<br><br>**Constraints**: `>= 1` |
| `pageSize` | `int` | Query, Required | Number of items to be displayed per page<br><br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`SpendbackRefundResult`](../../doc/models/spendback-refund-result.md)

## Example Usage

```java
String spendbackToken = "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
String refundToken = "rfnd-c39437e1-dc80-4293-8211-c14b5a32f762";
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

spendbackRefundsController.retrieveSpendbackRefundAsync(spendbackToken, refundToken, page, pageSize, filter, sort, language).thenAccept(result -> {
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

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| 500 | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |
| Default | - | [`ApiErrorResultException`](../../doc/models/api-error-result-exception.md) |


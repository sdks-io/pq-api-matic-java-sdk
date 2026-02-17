# Jobs

# Jobs

---


The *Jobs* resource allows you to list, create, retrieve, and cancel jobs.

```java
JobsController jobsController = client.getJobsController();
```

## Class Name

`JobsController`

## Methods

* [Cancel Payment Job](../../doc/controllers/jobs.md#cancel-payment-job)
* [Create Payment Job](../../doc/controllers/jobs.md#create-payment-job)
* [List Payment Jobs](../../doc/controllers/jobs.md#list-payment-jobs)
* [Retrieve Payment Job](../../doc/controllers/jobs.md#retrieve-payment-job)


# Cancel Payment Job

Cancel an submitted payment [job](page:resources/jobs).

```java
CompletableFuture<PaymentJobResult> cancelPaymentJobAsync(
    final String jobToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `jobToken` | `String` | Template, Required | Auto-generated unique identifier representing a job, prefixed with `jobs-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^jobs-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`modify`

## Response Type

[`PaymentJobResult`](../../doc/models/payment-job-result.md)

## Example Usage

```java
String jobToken = "jobs-2bbfc967-d12e-4647-a887-d905172fb4bc";

jobsController.cancelPaymentJobAsync(jobToken).thenAccept(result -> {
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


# Create Payment Job

Create a [payment](page:resources/jobs).

```java
CompletableFuture<PaymentJobResult> createPaymentJobAsync(
    final PaymentJob body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PaymentJob`](../../doc/models/containers/payment-job.md) | Body, Optional | - |

## Requires scope

### server

`modify`

## Response Type

[`PaymentJobResult`](../../doc/models/payment-job-result.md)

## Example Usage

```java
PaymentJob body = PaymentJob.fromGatewayPaymentJob(
    new GatewayPaymentJob.Builder()
        .notBefore(DateTimeHelper.fromRfc8601DateTime("2022-04-26T15:16:18Z"))
        .notAfter(DateTimeHelper.fromRfc8601DateTime("2019-08-24T14:15:22Z"))
        .items(Arrays.asList(
            new GatewayPaymentJobQuote.Builder()
                .amount(1.02D)
                .currency(Currencies.USD)
                .sourceToken("acct-3908ab5a-6ce1-474d-8b80-a63a7b147860")
                .destinationToken("dest-631b200f-665d-4dbe-bd01-3063c9dec97d")
                .note("string")
                .memo("string")
                .purpose(PaymentPurposes.BONUS)
                .clientPaymentId("d4b6f130-1d1c-4ce2-903a-0c1ad128f55e")
                .build()
        ))
        .build()
);

jobsController.createPaymentJobAsync(body).thenAccept(result -> {
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


# List Payment Jobs

Retrieve a list of [jobs](page:resources/jobs) that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<PaymentJobListResult> listPaymentJobsAsync(
    final int page,
    final int pageSize,
    final String filter,
    final String sort,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `int` | Query, Required | Page number of specific page to return<br><br>**Constraints**: `>= 1` |
| `pageSize` | `int` | Query, Required | Number of items to be displayed per page<br><br>**Constraints**: `>= 1`, `<= 50` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `sort` | `String` | Query, Optional | Sort request results by specific attribute. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`PaymentJobListResult`](../../doc/models/payment-job-list-result.md)

## Example Usage

```java
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

jobsController.listPaymentJobsAsync(page, pageSize, filter, sort, language).thenAccept(result -> {
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


# Retrieve Payment Job

Retrieve a single payment [job](page:resources/jobs).

```java
CompletableFuture<PaymentJobResult> retrievePaymentJobAsync(
    final String jobToken,
    final String filter,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `jobToken` | `String` | Template, Required | Auto-generated unique identifier representing a job, prefixed with `jobs-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^jobs-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`PaymentJobResult`](../../doc/models/payment-job-result.md)

## Example Usage

```java
String jobToken = "jobs-2bbfc967-d12e-4647-a887-d905172fb4bc";
String filter = "string";
Languages language = Languages.ENUS;

jobsController.retrievePaymentJobAsync(jobToken, filter, language).thenAccept(result -> {
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


# Invitations

# Invitations

---


The *Invitations* resource allows you to list, create, retrieve, and modify invitations.

```java
InvitationsController invitationsController = client.getInvitationsController();
```

## Class Name

`InvitationsController`

## Methods

* [Cancel Invitation](../../doc/controllers/invitations.md#cancel-invitation)
* [Create Invitation](../../doc/controllers/invitations.md#create-invitation)
* [List Invitations](../../doc/controllers/invitations.md#list-invitations)
* [Retrieve Invitation](../../doc/controllers/invitations.md#retrieve-invitation)
* [Update Invitation](../../doc/controllers/invitations.md#update-invitation)


# Cancel Invitation

Cancel an open [invitation](page:resources/invitations) quote.

```java
CompletableFuture<InvitationResult> cancelInvitationAsync(
    final String invitationToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invitationToken` | `String` | Template, Required | Auto-generated unique identifier representing an invite, prefixed with `invt-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^invt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`modify`

## Response Type

[`InvitationResult`](../../doc/models/invitation-result.md)

## Example Usage

```java
String invitationToken = "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";

invitationsController.cancelInvitationAsync(invitationToken).thenAccept(result -> {
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


# Create Invitation

Create a [invitation](page:resources/invitations) quote.

```java
CompletableFuture<InvitationResult> createInvitationAsync(
    final CreateInvitation body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateInvitation`](../../doc/models/create-invitation.md) | Body, Optional | - |

## Requires scope

### server

`modify`

## Response Type

[`InvitationResult`](../../doc/models/invitation-result.md)

## Example Usage

```java
CreateInvitation body = new CreateInvitation.Builder()
    .currency(Currencies.USD)
    .build();

invitationsController.createInvitationAsync(body).thenAccept(result -> {
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


# List Invitations

Retrieve a list of [invitations](page:resources/invitations) that supports filtering, sorting, and pagination through existing mechanisms.

```java
CompletableFuture<InvitationListResult> listInvitationsAsync(
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

[`InvitationListResult`](../../doc/models/invitation-list-result.md)

## Example Usage

```java
int page = 1;
int pageSize = 20;
String filter = "string";
String sort = "string";
Languages language = Languages.ENUS;

invitationsController.listInvitationsAsync(page, pageSize, filter, sort, language).thenAccept(result -> {
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


# Retrieve Invitation

Retrieve a single [invitation](page:resources/invitations).

```java
CompletableFuture<InvitationResult> retrieveInvitationAsync(
    final String invitationToken,
    final String filter,
    final Languages language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invitationToken` | `String` | Template, Required | Auto-generated unique identifier representing an invite, prefixed with `invt-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^invt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |
| `filter` | `String` | Query, Optional | Filter request results by specific criteria. |
| `language` | [`Languages`](../../doc/models/languages.md) | Query, Optional | Filter results by language type. |

## Requires scope

### server

`readonly`

## Response Type

[`InvitationResult`](../../doc/models/invitation-result.md)

## Example Usage

```java
String invitationToken = "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";
String filter = "string";
Languages language = Languages.ENUS;

invitationsController.retrieveInvitationAsync(invitationToken, filter, language).thenAccept(result -> {
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


# Update Invitation

Accept an open [invitation](page:resources/invitations) quote.

```java
CompletableFuture<InvitationResult> updateInvitationAsync(
    final String invitationToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invitationToken` | `String` | Template, Required | Auto-generated unique identifier representing an invite, prefixed with `invt-`.<br><br>**Constraints**: *Minimum Length*: `41`, *Maximum Length*: `41`, *Pattern*: `^invt-[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$` |

## Requires scope

### server

`modify`

## Response Type

[`InvitationResult`](../../doc/models/invitation-result.md)

## Example Usage

```java
String invitationToken = "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";

invitationsController.updateInvitationAsync(invitationToken).thenAccept(result -> {
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


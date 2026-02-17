/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateWebhookRequest;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.WebhookSubscriptionListResult;
import com.mypayquicker.api.models.WebhookSubscriptionResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface WebhooksController {
    /**
     * Retrieve a list of all [webhook subscriptions](page:resources/webhooks) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the WebhookSubscriptionListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    WebhookSubscriptionListResult listSubscriptions(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of all [webhook subscriptions](page:resources/webhooks) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the WebhookSubscriptionListResult response from the API call
     */
    CompletableFuture<WebhookSubscriptionListResult> listSubscriptionsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Update a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    WebhookSubscriptionResult updateSubscription(
            final CreateWebhookRequest body) throws ApiException, IOException;

    /**
     * Update a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    CompletableFuture<WebhookSubscriptionResult> updateSubscriptionAsync(
            final CreateWebhookRequest body);

    /**
     * Create a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    WebhookSubscriptionResult createSubscription(
            final CreateWebhookRequest body) throws ApiException, IOException;

    /**
     * Create a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    CompletableFuture<WebhookSubscriptionResult> createSubscriptionAsync(
            final CreateWebhookRequest body);

    /**
     * Retrieve a single [webhook subscription](page:resources/webhooks) using the webhook token.
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    WebhookSubscriptionResult retrieveSubscription(
            final String webhookToken) throws ApiException, IOException;

    /**
     * Retrieve a single [webhook subscription](page:resources/webhooks) using the webhook token.
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    CompletableFuture<WebhookSubscriptionResult> retrieveSubscriptionAsync(
            final String webhookToken);

    /**
     * Delete a [webhook subscription](page:resources/webhooks).
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    WebhookSubscriptionResult deleteSubscription(
            final String webhookToken) throws ApiException, IOException;

    /**
     * Delete a [webhook subscription](page:resources/webhooks).
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    CompletableFuture<WebhookSubscriptionResult> deleteSubscriptionAsync(
            final String webhookToken);

}
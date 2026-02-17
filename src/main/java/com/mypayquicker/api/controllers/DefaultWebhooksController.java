/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.ApiHelper;
import com.mypayquicker.api.Server;
import com.mypayquicker.api.exceptions.ApiErrorResultException;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.http.request.HttpMethod;
import com.mypayquicker.api.models.CreateWebhookRequest;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.WebhookSubscriptionListResult;
import com.mypayquicker.api.models.WebhookSubscriptionResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultWebhooksController extends BaseController implements WebhooksController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultWebhooksController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

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
    public WebhookSubscriptionListResult listSubscriptions(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListSubscriptionsRequest(page, pageSize, filter, sort, language).execute();
    }

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
    public CompletableFuture<WebhookSubscriptionListResult> listSubscriptionsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListSubscriptionsRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listSubscriptions.
     */
    private ApiCall<WebhookSubscriptionListResult, ApiException> prepareListSubscriptionsRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<WebhookSubscriptionListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/webhooks")
                        .queryParam(param -> param.key("page")
                                .value(page).isRequired(false))
                        .queryParam(param -> param.key("pageSize")
                                .value(pageSize).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(filter).isRequired(false))
                        .queryParam(param -> param.key("sort")
                                .value(sort).isRequired(false))
                        .queryParam(param -> param.key("language")
                                .value((language != null) ? language.value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WebhookSubscriptionListResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Update a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookSubscriptionResult updateSubscription(
            final CreateWebhookRequest body) throws ApiException, IOException {
        return prepareUpdateSubscriptionRequest(body).execute();
    }

    /**
     * Update a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    public CompletableFuture<WebhookSubscriptionResult> updateSubscriptionAsync(
            final CreateWebhookRequest body) {
        try {
            return prepareUpdateSubscriptionRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateSubscription.
     */
    private ApiCall<WebhookSubscriptionResult, ApiException> prepareUpdateSubscriptionRequest(
            final CreateWebhookRequest body) {
        return new ApiCall.Builder<WebhookSubscriptionResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/webhooks")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WebhookSubscriptionResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Create a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookSubscriptionResult createSubscription(
            final CreateWebhookRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionRequest(body).execute();
    }

    /**
     * Create a [webhook subscription](page:resources/webhooks).
     * @param  body  Optional parameter:
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    public CompletableFuture<WebhookSubscriptionResult> createSubscriptionAsync(
            final CreateWebhookRequest body) {
        try {
            return prepareCreateSubscriptionRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createSubscription.
     */
    private ApiCall<WebhookSubscriptionResult, ApiException> prepareCreateSubscriptionRequest(
            final CreateWebhookRequest body) {
        return new ApiCall.Builder<WebhookSubscriptionResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/webhooks")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WebhookSubscriptionResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve a single [webhook subscription](page:resources/webhooks) using the webhook token.
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookSubscriptionResult retrieveSubscription(
            final String webhookToken) throws ApiException, IOException {
        return prepareRetrieveSubscriptionRequest(webhookToken).execute();
    }

    /**
     * Retrieve a single [webhook subscription](page:resources/webhooks) using the webhook token.
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    public CompletableFuture<WebhookSubscriptionResult> retrieveSubscriptionAsync(
            final String webhookToken) {
        try {
            return prepareRetrieveSubscriptionRequest(webhookToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveSubscription.
     */
    private ApiCall<WebhookSubscriptionResult, ApiException> prepareRetrieveSubscriptionRequest(
            final String webhookToken) {
        return new ApiCall.Builder<WebhookSubscriptionResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/webhooks/{webhook-token}")
                        .templateParam(param -> param.key("webhook-token").value(webhookToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WebhookSubscriptionResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Delete a [webhook subscription](page:resources/webhooks).
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WebhookSubscriptionResult deleteSubscription(
            final String webhookToken) throws ApiException, IOException {
        return prepareDeleteSubscriptionRequest(webhookToken).execute();
    }

    /**
     * Delete a [webhook subscription](page:resources/webhooks).
     * @param  webhookToken  Required parameter: Auto-generated unique identifier representing a
     *         webhook subscription, prefixed with `webh-`.
     * @return    Returns the WebhookSubscriptionResult response from the API call
     */
    public CompletableFuture<WebhookSubscriptionResult> deleteSubscriptionAsync(
            final String webhookToken) {
        try {
            return prepareDeleteSubscriptionRequest(webhookToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deleteSubscription.
     */
    private ApiCall<WebhookSubscriptionResult, ApiException> prepareDeleteSubscriptionRequest(
            final String webhookToken) {
        return new ApiCall.Builder<WebhookSubscriptionResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/webhooks/{webhook-token}")
                        .templateParam(param -> param.key("webhook-token").value(webhookToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WebhookSubscriptionResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}
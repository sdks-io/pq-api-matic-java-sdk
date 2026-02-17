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
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.SpendbackListResult;
import com.mypayquicker.api.models.SpendbackResult;
import com.mypayquicker.api.models.containers.SpendbackQuote;
import com.mypayquicker.api.utilities.JsonObject;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultSpendbackController extends BaseController implements SpendbackController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultSpendbackController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [spendbacks](page:resources/spendbacks) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackListResult listSpendbacks(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListSpendbacksRequest(page, pageSize, filter, sort, language).execute();
    }

    /**
     * Retrieve a list of [spendbacks](page:resources/spendbacks) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackListResult response from the API call
     */
    public CompletableFuture<SpendbackListResult> listSpendbacksAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListSpendbacksRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listSpendbacks.
     */
    private ApiCall<SpendbackListResult, ApiException> prepareListSpendbacksRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<SpendbackListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back")
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
                                response -> ApiHelper.deserialize(response, SpendbackListResult.class))
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
     * Create a [spendback](page:resources/spendbacks) quote.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackResult createSpendbackQuote(
            final SpendbackQuote body) throws ApiException, IOException {
        return prepareCreateSpendbackQuoteRequest(body).execute();
    }

    /**
     * Create a [spendback](page:resources/spendbacks) quote.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackResult response from the API call
     */
    public CompletableFuture<SpendbackResult> createSpendbackQuoteAsync(
            final SpendbackQuote body) {
        try {
            return prepareCreateSpendbackQuoteRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createSpendbackQuote.
     */
    private ApiCall<SpendbackResult, ApiException> prepareCreateSpendbackQuoteRequest(
            final SpendbackQuote body) {
        return new ApiCall.Builder<SpendbackResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackResult.class))
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
     * Retrieve a single [spendbacks](page:resources/spendbacks) quote using the spendback token.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackResult retrieveSpendback(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareRetrieveSpendbackRequest(spendbackToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a single [spendbacks](page:resources/spendbacks) quote using the spendback token.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackResult response from the API call
     */
    public CompletableFuture<SpendbackResult> retrieveSpendbackAsync(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareRetrieveSpendbackRequest(spendbackToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveSpendback.
     */
    private ApiCall<SpendbackResult, ApiException> prepareRetrieveSpendbackRequest(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<SpendbackResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}")
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
                        .templateParam(param -> param.key("spendback-token").value(spendbackToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackResult.class))
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
     * Accept an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackResult acceptSpendbackQuote(
            final String spendbackToken) throws ApiException, IOException {
        return prepareAcceptSpendbackQuoteRequest(spendbackToken).execute();
    }

    /**
     * Accept an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     */
    public CompletableFuture<SpendbackResult> acceptSpendbackQuoteAsync(
            final String spendbackToken) {
        try {
            return prepareAcceptSpendbackQuoteRequest(spendbackToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for acceptSpendbackQuote.
     */
    private ApiCall<SpendbackResult, ApiException> prepareAcceptSpendbackQuoteRequest(
            final String spendbackToken) {
        return new ApiCall.Builder<SpendbackResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}")
                        .templateParam(param -> param.key("spendback-token").value(spendbackToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackResult.class))
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
     * Cancel an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackResult cancelSpendbackQuote(
            final String spendbackToken) throws ApiException, IOException {
        return prepareCancelSpendbackQuoteRequest(spendbackToken).execute();
    }

    /**
     * Cancel an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     */
    public CompletableFuture<SpendbackResult> cancelSpendbackQuoteAsync(
            final String spendbackToken) {
        try {
            return prepareCancelSpendbackQuoteRequest(spendbackToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelSpendbackQuote.
     */
    private ApiCall<SpendbackResult, ApiException> prepareCancelSpendbackQuoteRequest(
            final String spendbackToken) {
        return new ApiCall.Builder<SpendbackResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}")
                        .templateParam(param -> param.key("spendback-token").value(spendbackToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackResult.class))
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
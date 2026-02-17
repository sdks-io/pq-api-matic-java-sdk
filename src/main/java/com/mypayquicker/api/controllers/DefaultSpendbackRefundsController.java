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
import com.mypayquicker.api.models.CreateSpendbackRefundQuote;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.SpendbackRefundListResult;
import com.mypayquicker.api.models.SpendbackRefundResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultSpendbackRefundsController extends BaseController implements SpendbackRefundsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultSpendbackRefundsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [spendbacks](page:resources/spendbacks) refunds that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackRefundListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackRefundListResult listSpendbackRefunds(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListSpendbackRefundsRequest(spendbackToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of [spendbacks](page:resources/spendbacks) refunds that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackRefundListResult response from the API call
     */
    public CompletableFuture<SpendbackRefundListResult> listSpendbackRefundsAsync(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListSpendbackRefundsRequest(spendbackToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listSpendbackRefunds.
     */
    private ApiCall<SpendbackRefundListResult, ApiException> prepareListSpendbackRefundsRequest(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<SpendbackRefundListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}/refund")
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
                                response -> ApiHelper.deserialize(response, SpendbackRefundListResult.class))
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
     * Perform a [spendback](page:resources/spendbacks) refund for a partial amount.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackRefundResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackRefundResult createSpendbackRefundQuote(
            final String spendbackToken,
            final CreateSpendbackRefundQuote body) throws ApiException, IOException {
        return prepareCreateSpendbackRefundQuoteRequest(spendbackToken, body).execute();
    }

    /**
     * Perform a [spendback](page:resources/spendbacks) refund for a partial amount.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    public CompletableFuture<SpendbackRefundResult> createSpendbackRefundQuoteAsync(
            final String spendbackToken,
            final CreateSpendbackRefundQuote body) {
        try {
            return prepareCreateSpendbackRefundQuoteRequest(spendbackToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createSpendbackRefundQuote.
     */
    private ApiCall<SpendbackRefundResult, ApiException> prepareCreateSpendbackRefundQuoteRequest(
            final String spendbackToken,
            final CreateSpendbackRefundQuote body) {
        return new ApiCall.Builder<SpendbackRefundResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}/refund")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("spendback-token").value(spendbackToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackRefundResult.class))
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
     * Cancel an spendback refund quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @return    Returns the SpendbackRefundResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackRefundResult cancelSpendbackRefundQuote(
            final String spendbackToken,
            final String refundToken) throws ApiException, IOException {
        return prepareCancelSpendbackRefundQuoteRequest(spendbackToken, refundToken).execute();
    }

    /**
     * Cancel an spendback refund quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    public CompletableFuture<SpendbackRefundResult> cancelSpendbackRefundQuoteAsync(
            final String spendbackToken,
            final String refundToken) {
        try {
            return prepareCancelSpendbackRefundQuoteRequest(spendbackToken, refundToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelSpendbackRefundQuote.
     */
    private ApiCall<SpendbackRefundResult, ApiException> prepareCancelSpendbackRefundQuoteRequest(
            final String spendbackToken,
            final String refundToken) {
        return new ApiCall.Builder<SpendbackRefundResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}/refund/{refund-token}")
                        .templateParam(param -> param.key("spendback-token").value(spendbackToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("refund-token").value(refundToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackRefundResult.class))
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
     * Retrieve a single spendback refund using the rfnd token.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackRefundResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackRefundResult retrieveSpendbackRefund(
            final String spendbackToken,
            final String refundToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareRetrieveSpendbackRefundRequest(spendbackToken, refundToken, page, pageSize,
                filter, sort, language).execute();
    }

    /**
     * Retrieve a single spendback refund using the rfnd token.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    public CompletableFuture<SpendbackRefundResult> retrieveSpendbackRefundAsync(
            final String spendbackToken,
            final String refundToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareRetrieveSpendbackRefundRequest(spendbackToken, refundToken, page, pageSize,
            filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveSpendbackRefund.
     */
    private ApiCall<SpendbackRefundResult, ApiException> prepareRetrieveSpendbackRefundRequest(
            final String spendbackToken,
            final String refundToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<SpendbackRefundResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}/refund/{refund-token}")
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
                        .templateParam(param -> param.key("refund-token").value(refundToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackRefundResult.class))
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
     * Accept a spendback return quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @return    Returns the SpendbackRefundResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SpendbackRefundResult acceptSpendbackRefundQuote(
            final String spendbackToken,
            final String refundToken) throws ApiException, IOException {
        return prepareAcceptSpendbackRefundQuoteRequest(spendbackToken, refundToken).execute();
    }

    /**
     * Accept a spendback return quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    public CompletableFuture<SpendbackRefundResult> acceptSpendbackRefundQuoteAsync(
            final String spendbackToken,
            final String refundToken) {
        try {
            return prepareAcceptSpendbackRefundQuoteRequest(spendbackToken, refundToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for acceptSpendbackRefundQuote.
     */
    private ApiCall<SpendbackRefundResult, ApiException> prepareAcceptSpendbackRefundQuoteRequest(
            final String spendbackToken,
            final String refundToken) {
        return new ApiCall.Builder<SpendbackRefundResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/spend-back/{spendback-token}/refund/{refund-token}")
                        .templateParam(param -> param.key("spendback-token").value(spendbackToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("refund-token").value(refundToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SpendbackRefundResult.class))
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
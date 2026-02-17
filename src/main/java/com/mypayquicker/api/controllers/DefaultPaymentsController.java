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
import com.mypayquicker.api.models.PaymentListResult;
import com.mypayquicker.api.models.PaymentResult;
import com.mypayquicker.api.models.containers.PaymentQuote;
import com.mypayquicker.api.utilities.JsonValue;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultPaymentsController extends BaseController implements PaymentsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultPaymentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [payments](page:resources/payments) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentListResult listPayments(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListPaymentsRequest(page, pageSize, filter, sort, language).execute();
    }

    /**
     * Retrieve a list of [payments](page:resources/payments) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentListResult response from the API call
     */
    public CompletableFuture<PaymentListResult> listPaymentsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListPaymentsRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listPayments.
     */
    private ApiCall<PaymentListResult, ApiException> prepareListPaymentsRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<PaymentListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments")
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
                                response -> ApiHelper.deserialize(response, PaymentListResult.class))
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
     * Create a [payment](page:resources/payments) quote.
     * @param  body  Optional parameter:
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentResult createPaymentQuote(
            final PaymentQuote body) throws ApiException, IOException {
        return prepareCreatePaymentQuoteRequest(body).execute();
    }

    /**
     * Create a [payment](page:resources/payments) quote.
     * @param  body  Optional parameter:
     * @return    Returns the PaymentResult response from the API call
     */
    public CompletableFuture<PaymentResult> createPaymentQuoteAsync(
            final PaymentQuote body) {
        try {
            return prepareCreatePaymentQuoteRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createPaymentQuote.
     */
    private ApiCall<PaymentResult, ApiException> prepareCreatePaymentQuoteRequest(
            final PaymentQuote body) {
        return new ApiCall.Builder<PaymentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments")
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
                                response -> ApiHelper.deserialize(response, PaymentResult.class))
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
     * Retrieve a single [payment](page:resources/payments).
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentResult retrievePayment(
            final String paymentToken,
            final String filter,
            final Languages language) throws ApiException, IOException {
        return prepareRetrievePaymentRequest(paymentToken, filter, language).execute();
    }

    /**
     * Retrieve a single [payment](page:resources/payments).
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentResult response from the API call
     */
    public CompletableFuture<PaymentResult> retrievePaymentAsync(
            final String paymentToken,
            final String filter,
            final Languages language) {
        try {
            return prepareRetrievePaymentRequest(paymentToken, filter, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrievePayment.
     */
    private ApiCall<PaymentResult, ApiException> prepareRetrievePaymentRequest(
            final String paymentToken,
            final String filter,
            final Languages language) {
        return new ApiCall.Builder<PaymentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/{payment-token}")
                        .queryParam(param -> param.key("filter")
                                .value(filter).isRequired(false))
                        .queryParam(param -> param.key("language")
                                .value((language != null) ? language.value() : null).isRequired(false))
                        .templateParam(param -> param.key("payment-token").value(paymentToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentResult.class))
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
     * Accept an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentResult acceptPaymentQuote(
            final String paymentToken) throws ApiException, IOException {
        return prepareAcceptPaymentQuoteRequest(paymentToken).execute();
    }

    /**
     * Accept an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     */
    public CompletableFuture<PaymentResult> acceptPaymentQuoteAsync(
            final String paymentToken) {
        try {
            return prepareAcceptPaymentQuoteRequest(paymentToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for acceptPaymentQuote.
     */
    private ApiCall<PaymentResult, ApiException> prepareAcceptPaymentQuoteRequest(
            final String paymentToken) {
        return new ApiCall.Builder<PaymentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/{payment-token}")
                        .templateParam(param -> param.key("payment-token").value(paymentToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentResult.class))
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
     * Cancel an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentResult cancelPaymentQuote(
            final String paymentToken) throws ApiException, IOException {
        return prepareCancelPaymentQuoteRequest(paymentToken).execute();
    }

    /**
     * Cancel an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     */
    public CompletableFuture<PaymentResult> cancelPaymentQuoteAsync(
            final String paymentToken) {
        try {
            return prepareCancelPaymentQuoteRequest(paymentToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelPaymentQuote.
     */
    private ApiCall<PaymentResult, ApiException> prepareCancelPaymentQuoteRequest(
            final String paymentToken) {
        return new ApiCall.Builder<PaymentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/{payment-token}")
                        .templateParam(param -> param.key("payment-token").value(paymentToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentResult.class))
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
     * Perform a [payment](page:resources/payments) retraction for the full payment amount.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentResult retractPayment(
            final String paymentToken) throws ApiException, IOException {
        return prepareRetractPaymentRequest(paymentToken).execute();
    }

    /**
     * Perform a [payment](page:resources/payments) retraction for the full payment amount.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     */
    public CompletableFuture<PaymentResult> retractPaymentAsync(
            final String paymentToken) {
        try {
            return prepareRetractPaymentRequest(paymentToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retractPayment.
     */
    private ApiCall<PaymentResult, ApiException> prepareRetractPaymentRequest(
            final String paymentToken) {
        return new ApiCall.Builder<PaymentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/{payment-token}/retract")
                        .templateParam(param -> param.key("payment-token").value(paymentToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentResult.class))
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
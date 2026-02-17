/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.PaymentListResult;
import com.mypayquicker.api.models.PaymentResult;
import com.mypayquicker.api.models.containers.PaymentQuote;
import com.mypayquicker.api.utilities.JsonValue;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface PaymentsController {
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
    PaymentListResult listPayments(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<PaymentListResult> listPaymentsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a [payment](page:resources/payments) quote.
     * @param  body  Optional parameter:
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentResult createPaymentQuote(
            final PaymentQuote body) throws ApiException, IOException;

    /**
     * Create a [payment](page:resources/payments) quote.
     * @param  body  Optional parameter:
     * @return    Returns the PaymentResult response from the API call
     */
    CompletableFuture<PaymentResult> createPaymentQuoteAsync(
            final PaymentQuote body);

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
    PaymentResult retrievePayment(
            final String paymentToken,
            final String filter,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a single [payment](page:resources/payments).
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentResult response from the API call
     */
    CompletableFuture<PaymentResult> retrievePaymentAsync(
            final String paymentToken,
            final String filter,
            final Languages language);

    /**
     * Accept an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentResult acceptPaymentQuote(
            final String paymentToken) throws ApiException, IOException;

    /**
     * Accept an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     */
    CompletableFuture<PaymentResult> acceptPaymentQuoteAsync(
            final String paymentToken);

    /**
     * Cancel an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentResult cancelPaymentQuote(
            final String paymentToken) throws ApiException, IOException;

    /**
     * Cancel an open [payment](page:resources/payments) quote.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     */
    CompletableFuture<PaymentResult> cancelPaymentQuoteAsync(
            final String paymentToken);

    /**
     * Perform a [payment](page:resources/payments) retraction for the full payment amount.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentResult retractPayment(
            final String paymentToken) throws ApiException, IOException;

    /**
     * Perform a [payment](page:resources/payments) retraction for the full payment amount.
     * @param  paymentToken  Required parameter: Auto-generated unique identifier representing an
     *         individual payment transaction and quote, prefixed with `pmnt-`.
     * @return    Returns the PaymentResult response from the API call
     */
    CompletableFuture<PaymentResult> retractPaymentAsync(
            final String paymentToken);

}
/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateSpendbackRefundQuote;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.SpendbackRefundListResult;
import com.mypayquicker.api.models.SpendbackRefundResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface SpendbackRefundsController {
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
    SpendbackRefundListResult listSpendbackRefunds(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<SpendbackRefundListResult> listSpendbackRefundsAsync(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Perform a [spendback](page:resources/spendbacks) refund for a partial amount.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackRefundResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SpendbackRefundResult createSpendbackRefundQuote(
            final String spendbackToken,
            final CreateSpendbackRefundQuote body) throws ApiException, IOException;

    /**
     * Perform a [spendback](page:resources/spendbacks) refund for a partial amount.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    CompletableFuture<SpendbackRefundResult> createSpendbackRefundQuoteAsync(
            final String spendbackToken,
            final CreateSpendbackRefundQuote body);

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
    SpendbackRefundResult cancelSpendbackRefundQuote(
            final String spendbackToken,
            final String refundToken) throws ApiException, IOException;

    /**
     * Cancel an spendback refund quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    CompletableFuture<SpendbackRefundResult> cancelSpendbackRefundQuoteAsync(
            final String spendbackToken,
            final String refundToken);

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
    SpendbackRefundResult retrieveSpendbackRefund(
            final String spendbackToken,
            final String refundToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<SpendbackRefundResult> retrieveSpendbackRefundAsync(
            final String spendbackToken,
            final String refundToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    SpendbackRefundResult acceptSpendbackRefundQuote(
            final String spendbackToken,
            final String refundToken) throws ApiException, IOException;

    /**
     * Accept a spendback return quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @param  refundToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back refund transaction and quote, prefixed with `rfnd-`.
     * @return    Returns the SpendbackRefundResult response from the API call
     */
    CompletableFuture<SpendbackRefundResult> acceptSpendbackRefundQuoteAsync(
            final String spendbackToken,
            final String refundToken);

}
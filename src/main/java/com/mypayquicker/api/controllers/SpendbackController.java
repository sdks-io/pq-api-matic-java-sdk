/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.SpendbackListResult;
import com.mypayquicker.api.models.SpendbackResult;
import com.mypayquicker.api.models.containers.SpendbackQuote;
import com.mypayquicker.api.utilities.JsonObject;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface SpendbackController {
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
    SpendbackListResult listSpendbacks(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<SpendbackListResult> listSpendbacksAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a [spendback](page:resources/spendbacks) quote.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SpendbackResult createSpendbackQuote(
            final SpendbackQuote body) throws ApiException, IOException;

    /**
     * Create a [spendback](page:resources/spendbacks) quote.
     * @param  body  Optional parameter:
     * @return    Returns the SpendbackResult response from the API call
     */
    CompletableFuture<SpendbackResult> createSpendbackQuoteAsync(
            final SpendbackQuote body);

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
    SpendbackResult retrieveSpendback(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<SpendbackResult> retrieveSpendbackAsync(
            final String spendbackToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Accept an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SpendbackResult acceptSpendbackQuote(
            final String spendbackToken) throws ApiException, IOException;

    /**
     * Accept an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     */
    CompletableFuture<SpendbackResult> acceptSpendbackQuoteAsync(
            final String spendbackToken);

    /**
     * Cancel an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SpendbackResult cancelSpendbackQuote(
            final String spendbackToken) throws ApiException, IOException;

    /**
     * Cancel an open [spendback](page:resources/spendbacks) quote.
     * @param  spendbackToken  Required parameter: Auto-generated unique identifier representing an
     *         individual spend back transaction and quote, prefixed with `spnd-`.
     * @return    Returns the SpendbackResult response from the API call
     */
    CompletableFuture<SpendbackResult> cancelSpendbackQuoteAsync(
            final String spendbackToken);

}
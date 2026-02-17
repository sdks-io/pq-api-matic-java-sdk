/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.TransferListResult;
import com.mypayquicker.api.models.TransferResult;
import com.mypayquicker.api.models.containers.TransferQuote;
import com.mypayquicker.api.utilities.JsonObject;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface TransfersController {
    /**
     * Retrieve a list of [transfers](page:resources/transfers) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferListResult listTransfers(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of [transfers](page:resources/transfers) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     */
    CompletableFuture<TransferListResult> listTransfersAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a new [transfer](page:resources/transfers) quote.
     * @param  body  Optional parameter:
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferResult createTransferQuote(
            final TransferQuote body) throws ApiException, IOException;

    /**
     * Create a new [transfer](page:resources/transfers) quote.
     * @param  body  Optional parameter:
     * @return    Returns the TransferResult response from the API call
     */
    CompletableFuture<TransferResult> createTransferQuoteAsync(
            final TransferQuote body);

    /**
     * Retrieve details of a specific [transfer](page:resources/transfers) represented by a transfer
     * token.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferResult retrieveTransfer(
            final String transferToken) throws ApiException, IOException;

    /**
     * Retrieve details of a specific [transfer](page:resources/transfers) represented by a transfer
     * token.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    CompletableFuture<TransferResult> retrieveTransferAsync(
            final String transferToken);

    /**
     * Accept a [transfer](page:resources/transfers) quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferResult acceptTransferQuote(
            final String transferToken) throws ApiException, IOException;

    /**
     * Accept a [transfer](page:resources/transfers) quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    CompletableFuture<TransferResult> acceptTransferQuoteAsync(
            final String transferToken);

    /**
     * Optional [transfer](page:resources/transfers) quote cancellation that auto-cancels after a
     * period organically expires or when account activity invalidates the quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferResult cancelTransferQuote(
            final String transferToken) throws ApiException, IOException;

    /**
     * Optional [transfer](page:resources/transfers) quote cancellation that auto-cancels after a
     * period organically expires or when account activity invalidates the quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    CompletableFuture<TransferResult> cancelTransferQuoteAsync(
            final String transferToken);

    /**
     * Retrieve a list of user [transfers](page:resources/transfers) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferListResult listUserTransfers(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of user [transfers](page:resources/transfers) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     */
    CompletableFuture<TransferListResult> listUserTransfersAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Retrieve a specific user bank [transfer](page:resources/transfers).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    TransferResult retrieveUserTransfer(
            final String userToken,
            final String transferToken) throws ApiException, IOException;

    /**
     * Retrieve a specific user bank [transfer](page:resources/transfers).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    CompletableFuture<TransferResult> retrieveUserTransferAsync(
            final String userToken,
            final String transferToken);

}
/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.StatementListResult;
import com.mypayquicker.api.models.StatementResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface StatementsController {
    /**
     * List Prepaid Card Statements for specific user.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the StatementListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    StatementListResult listPrepaidCardStatements(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * List Prepaid Card Statements for specific user.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the StatementListResult response from the API call
     */
    CompletableFuture<StatementListResult> listPrepaidCardStatementsAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Retrieve a single prepaid card agreement.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the StatementResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    StatementResult retrievePrepaidCardStatement(
            final String userToken,
            final String destinationToken,
            final String documentToken) throws ApiException, IOException;

    /**
     * Retrieve a single prepaid card agreement.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the StatementResult response from the API call
     */
    CompletableFuture<StatementResult> retrievePrepaidCardStatementAsync(
            final String userToken,
            final String destinationToken,
            final String documentToken);

    /**
     * Returns all statements for the specified user.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the StatementListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    StatementListResult listStatements(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Returns all statements for the specified user.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the StatementListResult response from the API call
     */
    CompletableFuture<StatementListResult> listStatementsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Return a specific statement.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the StatementResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    StatementResult retrieveStatement(
            final String userToken,
            final String documentToken) throws ApiException, IOException;

    /**
     * Return a specific statement.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the StatementResult response from the API call
     */
    CompletableFuture<StatementResult> retrieveStatementAsync(
            final String userToken,
            final String documentToken);

}
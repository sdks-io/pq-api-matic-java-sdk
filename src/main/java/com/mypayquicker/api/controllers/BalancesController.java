/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.BalanceListResult;
import com.mypayquicker.api.models.BalanceResult;
import com.mypayquicker.api.models.Languages;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface BalancesController {
    /**
     * Retrieve a list of bank account [balances](page:resources/balances) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BalanceListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    BalanceListResult listAccountBalances(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of bank account [balances](page:resources/balances) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BalanceListResult response from the API call
     */
    CompletableFuture<BalanceListResult> listAccountBalancesAsync(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Retrieve a list of user [balances](page:resources/balances) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BalanceListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    BalanceListResult listUserBalances(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of user [balances](page:resources/balances) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BalanceListResult response from the API call
     */
    CompletableFuture<BalanceListResult> listUserBalancesAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Retrieve a [prepaid card](page:resources/prepaid-cards) [balances](page:resources/balances)
     * by destination token that supports filtering, sorting, and pagination through existing
     * mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BalanceResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    BalanceResult retrieveCardBalance(
            final String userToken,
            final String destinationToken,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a [prepaid card](page:resources/prepaid-cards) [balances](page:resources/balances)
     * by destination token that supports filtering, sorting, and pagination through existing
     * mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BalanceResult response from the API call
     */
    CompletableFuture<BalanceResult> retrieveCardBalanceAsync(
            final String userToken,
            final String destinationToken,
            final Languages language);

}
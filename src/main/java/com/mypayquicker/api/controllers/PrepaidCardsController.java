/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.AuthorizationListResult;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OrderPrepaidCard;
import com.mypayquicker.api.models.PrepaidCardListResult;
import com.mypayquicker.api.models.PrepaidCardResult;
import com.mypayquicker.api.models.ReplacePrepaidCard;
import com.mypayquicker.api.models.UpdatePrepaidCard;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface PrepaidCardsController {
    /**
     * Retrieve a list of [prepaid cards](page:resources/prepaid-cards) by user token that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PrepaidCardListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PrepaidCardListResult listPrepaidCards(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of [prepaid cards](page:resources/prepaid-cards) by user token that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PrepaidCardListResult response from the API call
     */
    CompletableFuture<PrepaidCardListResult> listPrepaidCardsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Order a [prepaid card](page:resources/prepaid-cards) for the user by specifying a
     * cardPackage. Assign a prepaid card to a user when a program token and card reference number
     * are supplied.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PrepaidCardResult orderPrepaidCard(
            final String userToken,
            final OrderPrepaidCard body) throws ApiException, IOException;

    /**
     * Order a [prepaid card](page:resources/prepaid-cards) for the user by specifying a
     * cardPackage. Assign a prepaid card to a user when a program token and card reference number
     * are supplied.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardResult response from the API call
     */
    CompletableFuture<PrepaidCardResult> orderPrepaidCardAsync(
            final String userToken,
            final OrderPrepaidCard body);

    /**
     * Replace a [prepaid card](page:resources/prepaid-cards) by destination token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PrepaidCardResult replacePrepaidCard(
            final String userToken,
            final String destinationToken,
            final ReplacePrepaidCard body) throws ApiException, IOException;

    /**
     * Replace a [prepaid card](page:resources/prepaid-cards) by destination token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardResult response from the API call
     */
    CompletableFuture<PrepaidCardResult> replacePrepaidCardAsync(
            final String userToken,
            final String destinationToken,
            final ReplacePrepaidCard body);

    /**
     * Retrieve [prepaid card](page:resources/prepaid-cards) details by destination token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the PrepaidCardResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PrepaidCardResult retrievePrepaidCard(
            final String userToken,
            final String destinationToken) throws ApiException, IOException;

    /**
     * Retrieve [prepaid card](page:resources/prepaid-cards) details by destination token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the PrepaidCardResult response from the API call
     */
    CompletableFuture<PrepaidCardResult> retrievePrepaidCardAsync(
            final String userToken,
            final String destinationToken);

    /**
     * Partial [prepaid card](page:resources/prepaid-cards) update.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PrepaidCardResult updatePrepaidCard(
            final String userToken,
            final String destinationToken,
            final UpdatePrepaidCard body) throws ApiException, IOException;

    /**
     * Partial [prepaid card](page:resources/prepaid-cards) update.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardResult response from the API call
     */
    CompletableFuture<PrepaidCardResult> updatePrepaidCardAsync(
            final String userToken,
            final String destinationToken,
            final UpdatePrepaidCard body);

    /**
     * TODO.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the AuthorizationListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    AuthorizationListResult listCardAuthorizations(
            final String userToken,
            final String destinationToken) throws ApiException, IOException;

    /**
     * TODO.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the AuthorizationListResult response from the API call
     */
    CompletableFuture<AuthorizationListResult> listCardAuthorizationsAsync(
            final String userToken,
            final String destinationToken);

}
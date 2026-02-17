/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateOrUpdateUser;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.UserListResult;
import com.mypayquicker.api.models.UserResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface UsersController {
    /**
     * Retrieve a list of [users](page:resources/user) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the UserListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    UserListResult listUsers(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of [users](page:resources/user) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the UserListResult response from the API call
     */
    CompletableFuture<UserListResult> listUsersAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a new [user](page:resources/user).
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    UserResult createUser(
            final CreateOrUpdateUser body) throws ApiException, IOException;

    /**
     * Create a new [user](page:resources/user).
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     */
    CompletableFuture<UserResult> createUserAsync(
            final CreateOrUpdateUser body);

    /**
     * Update a [user](page:resources/user) object (change
     * [email](#/rest/models/structures/email-address)], [address](#/rest/models/structures/address)
     * change, etc.) using a user token.'.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    UserResult updateUser(
            final String userToken,
            final CreateOrUpdateUser body) throws ApiException, IOException;

    /**
     * Update a [user](page:resources/user) object (change
     * [email](#/rest/models/structures/email-address)], [address](#/rest/models/structures/address)
     * change, etc.) using a user token.'.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     */
    CompletableFuture<UserResult> updateUserAsync(
            final String userToken,
            final CreateOrUpdateUser body);

    /**
     * Retrieve a single [user](page:resources/user) record by user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the UserResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    UserResult retrieveUser(
            final String userToken) throws ApiException, IOException;

    /**
     * Retrieve a single [user](page:resources/user) record by user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the UserResult response from the API call
     */
    CompletableFuture<UserResult> retrieveUserAsync(
            final String userToken);

}
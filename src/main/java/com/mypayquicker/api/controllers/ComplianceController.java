/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.IdvCheckListResult;
import com.mypayquicker.api.models.IdvCheckResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ComplianceController {
    /**
     * Retrieve a list of [IDV checks](page:resources/user#list-user-idv-checks) by user token that
     * supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the IdvCheckListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    IdvCheckListResult listIdentityChecks(
            final String userToken) throws ApiException, IOException;

    /**
     * Retrieve a list of [IDV checks](page:resources/user#list-user-idv-checks) by user token that
     * supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the IdvCheckListResult response from the API call
     */
    CompletableFuture<IdvCheckListResult> listIdentityChecksAsync(
            final String userToken);

    /**
     * Retrieve a list of [IDV checks](page:resources/user#retrieve-user-idv-check) by IDVC token
     * that supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  idvcToken  Required parameter: Auto-generated unique identifier representing a user
     *         IDV check, prefixed with `idvc-`.
     * @return    Returns the IdvCheckResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    IdvCheckResult retrieveIdentityCheck(
            final String userToken,
            final String idvcToken) throws ApiException, IOException;

    /**
     * Retrieve a list of [IDV checks](page:resources/user#retrieve-user-idv-check) by IDVC token
     * that supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  idvcToken  Required parameter: Auto-generated unique identifier representing a user
     *         IDV check, prefixed with `idvc-`.
     * @return    Returns the IdvCheckResult response from the API call
     */
    CompletableFuture<IdvCheckResult> retrieveIdentityCheckAsync(
            final String userToken,
            final String idvcToken);

}
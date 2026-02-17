/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.OAuthToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface OAuthAuthorizationController {
    /**
     * Create a new OAuth 2 token.
     * @param  authorization  Required parameter: Authorization header in Basic auth format
     * @param  scope  Optional parameter: Requested scopes as a space-delimited list.
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    OAuthToken requestTokenServer(
            final String authorization,
            final String scope,
            final Map<String, Object> fieldParameters) throws ApiException, IOException;

    /**
     * Create a new OAuth 2 token.
     * @param  authorization  Required parameter: Authorization header in Basic auth format
     * @param  scope  Optional parameter: Requested scopes as a space-delimited list.
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken response from the API call
     */
    CompletableFuture<OAuthToken> requestTokenServerAsync(
            final String authorization,
            final String scope,
            final Map<String, Object> fieldParameters);

}
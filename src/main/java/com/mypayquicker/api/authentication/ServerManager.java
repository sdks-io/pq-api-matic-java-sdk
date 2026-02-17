/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.authentication;

import com.mypayquicker.api.controllers.DefaultOAuthAuthorizationController;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.OAuthScopeServer;
import com.mypayquicker.api.models.OAuthToken;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.core.authentication.HeaderAuth;
import io.apimatic.coreinterfaces.http.request.Request;
import java.io.IOException;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Utility class for OAuth 2 authorization and token management.
 */
public class ServerManager extends HeaderAuth implements ServerCredentials {

    /**
     * Private instance of OAuth 2 API controller.
     */
    private DefaultOAuthAuthorizationController oAuthApi;

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private ServerModel authModel;

    /**
     * Private instance of the latest auth token.
     */
    private OAuthToken oAuthToken;
    
    /**
     * Instance to use as mutex lock for auth token.
     */
    private static final Object lockObj = new Object();

    /**
     * Constructor.
     */
    public ServerManager(ServerModel authModel) {
        super(Collections.emptyMap());
        this.authModel = authModel;
        this.oAuthToken = authModel.getOAuthToken();
    }

    /**
    * Apply GlobalConfiguration for token management.
    * @param config GlobalConfiguration instance
    */
    public void applyGlobalConfiguration(GlobalConfiguration config) {
        this.oAuthApi = new DefaultOAuthAuthorizationController(config);
    }


    /**
     * String value for oAuthClientId.
     * @return oAuthClientId
     */
    public String getOAuthClientId() {
        return authModel.getOAuthClientId();
    }

    /**
     * String value for oAuthClientSecret.
     * @return oAuthClientSecret
     */
    public String getOAuthClientSecret() {
        return authModel.getOAuthClientSecret();
    }

    /**
     * OAuthToken value for oAuthToken.
     * @return oAuthToken
     */
    public OAuthToken getOAuthToken() {
        return authModel.getOAuthToken();
    }

    /**
     * List of OAuthScopeServer value for oAuthScopes.
     * @return oAuthScopes
     */
    public List<OAuthScopeServer> getOAuthScopes() {
        return authModel.getOAuthScopes();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param oAuthClientId String value for credentials.
     * @param oAuthClientSecret String value for credentials.
     * @param oAuthToken OAuthToken value for credentials.
     * @param oAuthScopes List of OAuthScopeServer value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String oAuthClientId, String oAuthClientSecret, OAuthToken oAuthToken,
            List<OAuthScopeServer> oAuthScopes) {
        return oAuthClientId.equals(getOAuthClientId())
                && oAuthClientSecret.equals(getOAuthClientSecret())
                && ((getOAuthToken() == null && oAuthToken == null)
                        || (getOAuthToken() != null && oAuthToken != null
                                && oAuthToken.toString().equals(getOAuthToken().toString())))
                && ((getOAuthScopes() == null && oAuthScopes == null)
                        || (getOAuthScopes() != null && oAuthScopes != null
                                && oAuthScopes.equals(getOAuthScopes())));
    }

    /**
     * Converts this ServerManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServerManager [" + "oAuthClientId=" + getOAuthClientId() + ", oAuthClientSecret="
                + getOAuthClientSecret() + ", oAuthToken=" + getOAuthToken() + ", oAuthScopes="
                + getOAuthScopes() + "]";
    }

    /**
     * Fetch the OAuth token asynchronously.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    public CompletableFuture<OAuthToken> fetchTokenAsync(
            final Map<String, Object> additionalParameters) {
        final Map<String, Object> aparams =
                additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;

        return oAuthApi.requestTokenServerAsync(
            getBasicAuthForClient(),
            stringJoin(getOAuthScopes(), " "),
            aparams).thenApply(token -> {
                Long expiresIn = token.getExpiresIn();
                if (expiresIn != null && expiresIn != 0) {
                    token.setExpiry((System.currentTimeMillis() / 1000L) + token.getExpiresIn());
                }
                return token;
            });
    }

    /**
     * Fetch the OAuth token asynchronously.
     */
    public CompletableFuture<OAuthToken> fetchTokenAsync() {
        return fetchTokenAsync(null);
    }

    /**
     * Fetch the OAuth token.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    public OAuthToken fetchToken(Map<String, Object> additionalParameters)
            throws ApiException, IOException {
        final Map<String, Object> aparams =
                additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;

        OAuthToken token = oAuthApi.requestTokenServer(
            getBasicAuthForClient(),
            stringJoin(getOAuthScopes(), " "),
            aparams);

        if (token.getExpiresIn() != null && token.getExpiresIn() != 0) {
            token.setExpiry((System.currentTimeMillis() / 1000L) + token.getExpiresIn());
        }

        return token;
    }

    /**
     * Fetch the OAuth token.
     */
    public OAuthToken fetchToken() throws ApiException, IOException {
        return fetchToken(null);
    }

    /**
     * Build authorization header value for basic auth.
     * @return Authorization header value for this client.
     */
    private String getBasicAuthForClient() {
        String val = getOAuthClientId() + ":" + getOAuthClientSecret();
        return "Basic " + new String(Base64.getEncoder().encodeToString(val.getBytes()));
    }

    /**
     * Join string collection elements using delimiter.
     * @param col String collection to join.
     * @param delim Delimiter.
     * @return String joined by delimiter.
     */
    private String stringJoin(Collection<?> col, String delim) {
        if (col == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> iter = col.iterator();
        if (iter.hasNext()) {
            sb.append(iter.next().toString());
        }
        while (iter.hasNext()) {
            sb.append(delim);
            sb.append(iter.next().toString());
        }
        return sb.toString();
    }

    /**
     * Has the OAuth token expired?.
     * @return True if expired
     */
    public boolean isTokenExpired() {
        return isTokenExpired(getOAuthToken());
    }

    /**
     * A utility to check the expiry of the OAuth Token.
     * @param oAuthToken The OAuth token for whose expiry is to check.
     * @return True if expired
     */
    public boolean isTokenExpired(OAuthToken oAuthToken) {
        if (oAuthToken == null) {
            throw new IllegalStateException("OAuth token is missing.");
        }

        return oAuthToken.getExpiry() != null 
            && oAuthToken.getExpiry() - authModel.getOAuthClockSkew()
                < (System.currentTimeMillis() / 1000L);
    }

    /**
     * This provides the OAuth Token from either the user configured callbacks or from default provider.
     * @return The fetched OAuth token.
     */
    private OAuthToken getTokenFromProvider() {
        if(oAuthToken != null && !isTokenExpired(oAuthToken)) {
            return this.oAuthToken;
        }

        if (authModel.getOAuthTokenProvider() != null) {
            OAuthToken token = authModel.getOAuthTokenProvider().apply(this.oAuthToken, this);
            applyOnTokenUpdateCallback(token);
            return token;
        }

        try {
            OAuthToken token = fetchToken();
            applyOnTokenUpdateCallback(token);
            return token;
        } catch (ApiException | IOException e) {
            return this.oAuthToken;
        }
    }

    /**
     * This applies the OAuth token update callback provided by the user.
     */
    private void applyOnTokenUpdateCallback(OAuthToken token) {
        if (authModel.getOAuthOnTokenUpdate() != null) {
            authModel.getOAuthOnTokenUpdate().accept(token.toBuilder().build());
        }
    }

    /**
    * Create authorization header for API calls.
    * @param token OAuth token
    * @return Authorization header
    */
    private static String getAuthorizationHeader(OAuthToken token) {
        if (token == null) {
            return null;
        }
        return "Bearer " + token.getAccessToken();
    }

    /**
    * Validate the authentication on the httpRequest
    */
    @Override
    public void validate() {
        synchronized (lockObj) {
            oAuthToken = getTokenFromProvider();
            if (oAuthToken == null) {
                setErrorMessage("Client is not authorized."
                    + " An OAuth token is needed to make API calls.");
                setValidity(false);
            } else if (isTokenExpired(oAuthToken)) {
                setErrorMessage("The oAuth token is expired."
                    + " A valid token is needed to make API calls.");
                setValidity(false);
            } else {
                setValidity(true);
            }
        }
    }

    /**
    * Apply the Header authentication.
    * @param httpRequest The HTTP request on which the auth is to be applied.
    * @return {@link Request} The HTTP request after applying auth.
    */
    @Override
    public Request apply(Request httpRequest) {
        httpRequest.getHeaders().remove("Authorization");
        httpRequest.getHeaders().add("Authorization", getAuthorizationHeader(oAuthToken));
        return httpRequest;
    }

    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "Server - " + errorMessage;
    }

}

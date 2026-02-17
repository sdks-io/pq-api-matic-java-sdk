/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api;

import com.mypayquicker.api.authentication.ClientsideCredentials;
import com.mypayquicker.api.authentication.ClientsideModel;
import com.mypayquicker.api.authentication.ServerCredentials;
import com.mypayquicker.api.authentication.ServerModel;
import com.mypayquicker.api.http.client.ReadonlyHttpClientConfiguration;
import com.mypayquicker.api.logging.configuration.ReadonlyLoggingConfiguration;
import com.mypayquicker.api.models.SandboxInstance;
import com.mypayquicker.api.models.UatInstance;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * Sandbox Environments
     * @return a copy of sandboxInstance
     */
    SandboxInstance getSandboxInstance();

    /**
     * UAT Environments
     * @return a copy of uatInstance
     */
    UatInstance getUatInstance();

    /**
     * Date-based API Version specified in the header *required* on all calls.
     * @return a copy of xMyPayQuickerVersion
     */
    String getXMyPayQuickerVersion();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * Logging Configuration instance.
     * @return a copy of loggingConfig
     */
    ReadonlyLoggingConfiguration getLoggingConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The credentials to use with Server.
     * @return serverCredentials
     */
    ServerCredentials getServerCredentials();

    /**
     * The auth credential model for Server.
     * @return the instance of ServerModel
     */
    ServerModel getServerModel();

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    String getAccessToken();

    /**
     * The credentials to use with Clientside.
     * @return clientsideCredentials
     */
    ClientsideCredentials getClientsideCredentials();

    /**
     * The auth credential model for Clientside.
     * @return the instance of ClientsideModel
     */
    ClientsideModel getClientsideModel();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}

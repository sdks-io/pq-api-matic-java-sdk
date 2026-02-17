/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.authentication;

/**
 * Interface to access authentication credentials.
 */
public interface ClientsideCredentials {

    /**
     * String value for accessToken.
     * @return accessToken
     */
    String getAccessToken();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param accessToken String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String accessToken);
}
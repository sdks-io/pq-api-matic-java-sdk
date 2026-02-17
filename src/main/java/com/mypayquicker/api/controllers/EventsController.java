/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.EventListResult;
import com.mypayquicker.api.models.UserEventResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface EventsController {
    /**
     * Retrieve a list of [user events](page:resources/user#list-user-events) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the EventListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    EventListResult listEvents(
            final String userToken) throws ApiException, IOException;

    /**
     * Retrieve a list of [user events](page:resources/user#list-user-events) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the EventListResult response from the API call
     */
    CompletableFuture<EventListResult> listEventsAsync(
            final String userToken);

    /**
     * Retrieve a single [user event](page:resources/user#get-user-event).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  eventToken  Required parameter: Auto-generated unique identifier representing an
     *         event, prefixed with `evnt-`.
     * @return    Returns the UserEventResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    UserEventResult retrieveEvent(
            final String userToken,
            final String eventToken) throws ApiException, IOException;

    /**
     * Retrieve a single [user event](page:resources/user#get-user-event).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  eventToken  Required parameter: Auto-generated unique identifier representing an
     *         event, prefixed with `evnt-`.
     * @return    Returns the UserEventResult response from the API call
     */
    CompletableFuture<UserEventResult> retrieveEventAsync(
            final String userToken,
            final String eventToken);

}
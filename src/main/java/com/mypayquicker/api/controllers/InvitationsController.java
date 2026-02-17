/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateInvitation;
import com.mypayquicker.api.models.InvitationListResult;
import com.mypayquicker.api.models.InvitationResult;
import com.mypayquicker.api.models.Languages;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface InvitationsController {
    /**
     * Retrieve a list of [invitations](page:resources/invitations) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the InvitationListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    InvitationListResult listInvitations(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of [invitations](page:resources/invitations) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the InvitationListResult response from the API call
     */
    CompletableFuture<InvitationListResult> listInvitationsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a [invitation](page:resources/invitations) quote.
     * @param  body  Optional parameter:
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    InvitationResult createInvitation(
            final CreateInvitation body) throws ApiException, IOException;

    /**
     * Create a [invitation](page:resources/invitations) quote.
     * @param  body  Optional parameter:
     * @return    Returns the InvitationResult response from the API call
     */
    CompletableFuture<InvitationResult> createInvitationAsync(
            final CreateInvitation body);

    /**
     * Retrieve a single [invitation](page:resources/invitations).
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    InvitationResult retrieveInvitation(
            final String invitationToken,
            final String filter,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a single [invitation](page:resources/invitations).
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the InvitationResult response from the API call
     */
    CompletableFuture<InvitationResult> retrieveInvitationAsync(
            final String invitationToken,
            final String filter,
            final Languages language);

    /**
     * Accept an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    InvitationResult updateInvitation(
            final String invitationToken) throws ApiException, IOException;

    /**
     * Accept an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     */
    CompletableFuture<InvitationResult> updateInvitationAsync(
            final String invitationToken);

    /**
     * Cancel an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    InvitationResult cancelInvitation(
            final String invitationToken) throws ApiException, IOException;

    /**
     * Cancel an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     */
    CompletableFuture<InvitationResult> cancelInvitationAsync(
            final String invitationToken);

}
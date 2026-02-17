/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.AgreementListResultJson;
import com.mypayquicker.api.models.AgreementResult;
import com.mypayquicker.api.models.Languages;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface AgreementsController {
    /**
     * Retrieve a list of program [agreements](page:resources/agreements) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the AgreementListResultJson response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    AgreementListResultJson listAgreements(
            final String programToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of program [agreements](page:resources/agreements) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the AgreementListResultJson response from the API call
     */
    CompletableFuture<AgreementListResultJson> listAgreementsAsync(
            final String programToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Retrieve a single program [agreement](page:resources/agreements).
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @return    Returns the AgreementResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    AgreementResult retrieveProgramAgreement(
            final String programToken,
            final String agreementToken) throws ApiException, IOException;

    /**
     * Retrieve a single program [agreement](page:resources/agreements).
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @return    Returns the AgreementResult response from the API call
     */
    CompletableFuture<AgreementResult> retrieveProgramAgreementAsync(
            final String programToken,
            final String agreementToken);

    /**
     * Accept a single program [agreement](page:resources/agreements).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    void acceptAgreement(
            final String userToken,
            final String agreementToken) throws ApiException, IOException;

    /**
     * Accept a single program [agreement](page:resources/agreements).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @return    Returns the void response from the API call
     */
    CompletableFuture<Void> acceptAgreementAsync(
            final String userToken,
            final String agreementToken);

}
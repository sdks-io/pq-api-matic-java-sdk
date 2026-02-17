/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.ProgramListResult;
import com.mypayquicker.api.models.ProgramResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ProgramController {
    /**
     * Retrieve a list of [programs](page:resources/programs) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ProgramListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ProgramListResult listPrograms(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of [programs](page:resources/programs) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ProgramListResult response from the API call
     */
    CompletableFuture<ProgramListResult> listProgramsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Retrieve a single [program](page:resources/programs) by its program token.
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ProgramResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ProgramResult retrieveProgram(
            final String programToken,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a single [program](page:resources/programs) by its program token.
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ProgramResult response from the API call
     */
    CompletableFuture<ProgramResult> retrieveProgramAsync(
            final String programToken,
            final Languages language);

}
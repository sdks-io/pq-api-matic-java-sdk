/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.PaymentJobListResult;
import com.mypayquicker.api.models.PaymentJobResult;
import com.mypayquicker.api.models.containers.PaymentJob;
import com.mypayquicker.api.utilities.JsonValue;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface JobsController {
    /**
     * Retrieve a list of [jobs](page:resources/jobs) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentJobListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentJobListResult listPaymentJobs(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of [jobs](page:resources/jobs) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentJobListResult response from the API call
     */
    CompletableFuture<PaymentJobListResult> listPaymentJobsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a [payment](page:resources/jobs).
     * @param  body  Optional parameter:
     * @return    Returns the PaymentJobResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentJobResult createPaymentJob(
            final PaymentJob body) throws ApiException, IOException;

    /**
     * Create a [payment](page:resources/jobs).
     * @param  body  Optional parameter:
     * @return    Returns the PaymentJobResult response from the API call
     */
    CompletableFuture<PaymentJobResult> createPaymentJobAsync(
            final PaymentJob body);

    /**
     * Retrieve a single payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentJobResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentJobResult retrievePaymentJob(
            final String jobToken,
            final String filter,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a single payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentJobResult response from the API call
     */
    CompletableFuture<PaymentJobResult> retrievePaymentJobAsync(
            final String jobToken,
            final String filter,
            final Languages language);

    /**
     * Cancel an submitted payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @return    Returns the PaymentJobResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    PaymentJobResult cancelPaymentJob(
            final String jobToken) throws ApiException, IOException;

    /**
     * Cancel an submitted payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @return    Returns the PaymentJobResult response from the API call
     */
    CompletableFuture<PaymentJobResult> cancelPaymentJobAsync(
            final String jobToken);

}
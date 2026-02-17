/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.ApiHelper;
import com.mypayquicker.api.Server;
import com.mypayquicker.api.exceptions.ApiErrorResultException;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.http.request.HttpMethod;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.PaymentJobListResult;
import com.mypayquicker.api.models.PaymentJobResult;
import com.mypayquicker.api.models.containers.PaymentJob;
import com.mypayquicker.api.utilities.JsonValue;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultJobsController extends BaseController implements JobsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultJobsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

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
    public PaymentJobListResult listPaymentJobs(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListPaymentJobsRequest(page, pageSize, filter, sort, language).execute();
    }

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
    public CompletableFuture<PaymentJobListResult> listPaymentJobsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListPaymentJobsRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listPaymentJobs.
     */
    private ApiCall<PaymentJobListResult, ApiException> prepareListPaymentJobsRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<PaymentJobListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/jobs")
                        .queryParam(param -> param.key("page")
                                .value(page).isRequired(false))
                        .queryParam(param -> param.key("pageSize")
                                .value(pageSize).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(filter).isRequired(false))
                        .queryParam(param -> param.key("sort")
                                .value(sort).isRequired(false))
                        .queryParam(param -> param.key("language")
                                .value((language != null) ? language.value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentJobListResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Create a [payment](page:resources/jobs).
     * @param  body  Optional parameter:
     * @return    Returns the PaymentJobResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentJobResult createPaymentJob(
            final PaymentJob body) throws ApiException, IOException {
        return prepareCreatePaymentJobRequest(body).execute();
    }

    /**
     * Create a [payment](page:resources/jobs).
     * @param  body  Optional parameter:
     * @return    Returns the PaymentJobResult response from the API call
     */
    public CompletableFuture<PaymentJobResult> createPaymentJobAsync(
            final PaymentJob body) {
        try {
            return prepareCreatePaymentJobRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createPaymentJob.
     */
    private ApiCall<PaymentJobResult, ApiException> prepareCreatePaymentJobRequest(
            final PaymentJob body) {
        return new ApiCall.Builder<PaymentJobResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/jobs")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentJobResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

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
    public PaymentJobResult retrievePaymentJob(
            final String jobToken,
            final String filter,
            final Languages language) throws ApiException, IOException {
        return prepareRetrievePaymentJobRequest(jobToken, filter, language).execute();
    }

    /**
     * Retrieve a single payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the PaymentJobResult response from the API call
     */
    public CompletableFuture<PaymentJobResult> retrievePaymentJobAsync(
            final String jobToken,
            final String filter,
            final Languages language) {
        try {
            return prepareRetrievePaymentJobRequest(jobToken, filter, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrievePaymentJob.
     */
    private ApiCall<PaymentJobResult, ApiException> prepareRetrievePaymentJobRequest(
            final String jobToken,
            final String filter,
            final Languages language) {
        return new ApiCall.Builder<PaymentJobResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/jobs/{job-token}")
                        .queryParam(param -> param.key("filter")
                                .value(filter).isRequired(false))
                        .queryParam(param -> param.key("language")
                                .value((language != null) ? language.value() : null).isRequired(false))
                        .templateParam(param -> param.key("job-token").value(jobToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentJobResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Cancel an submitted payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @return    Returns the PaymentJobResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentJobResult cancelPaymentJob(
            final String jobToken) throws ApiException, IOException {
        return prepareCancelPaymentJobRequest(jobToken).execute();
    }

    /**
     * Cancel an submitted payment [job](page:resources/jobs).
     * @param  jobToken  Required parameter: Auto-generated unique identifier representing a job,
     *         prefixed with `jobs-`.
     * @return    Returns the PaymentJobResult response from the API call
     */
    public CompletableFuture<PaymentJobResult> cancelPaymentJobAsync(
            final String jobToken) {
        try {
            return prepareCancelPaymentJobRequest(jobToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelPaymentJob.
     */
    private ApiCall<PaymentJobResult, ApiException> prepareCancelPaymentJobRequest(
            final String jobToken) {
        return new ApiCall.Builder<PaymentJobResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/payments/jobs/{job-token}")
                        .templateParam(param -> param.key("job-token").value(jobToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentJobResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("",
                                (reason, context) -> new ApiErrorResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}
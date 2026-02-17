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
import com.mypayquicker.api.models.IdvCheckListResult;
import com.mypayquicker.api.models.IdvCheckResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultComplianceController extends BaseController implements ComplianceController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultComplianceController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [IDV checks](page:resources/user#list-user-idv-checks) by user token that
     * supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the IdvCheckListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IdvCheckListResult listIdentityChecks(
            final String userToken) throws ApiException, IOException {
        return prepareListIdentityChecksRequest(userToken).execute();
    }

    /**
     * Retrieve a list of [IDV checks](page:resources/user#list-user-idv-checks) by user token that
     * supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the IdvCheckListResult response from the API call
     */
    public CompletableFuture<IdvCheckListResult> listIdentityChecksAsync(
            final String userToken) {
        try {
            return prepareListIdentityChecksRequest(userToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listIdentityChecks.
     */
    private ApiCall<IdvCheckListResult, ApiException> prepareListIdentityChecksRequest(
            final String userToken) {
        return new ApiCall.Builder<IdvCheckListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/idv-checks")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IdvCheckListResult.class))
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
     * Retrieve a list of [IDV checks](page:resources/user#retrieve-user-idv-check) by IDVC token
     * that supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  idvcToken  Required parameter: Auto-generated unique identifier representing a user
     *         IDV check, prefixed with `idvc-`.
     * @return    Returns the IdvCheckResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IdvCheckResult retrieveIdentityCheck(
            final String userToken,
            final String idvcToken) throws ApiException, IOException {
        return prepareRetrieveIdentityCheckRequest(userToken, idvcToken).execute();
    }

    /**
     * Retrieve a list of [IDV checks](page:resources/user#retrieve-user-idv-check) by IDVC token
     * that supports filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  idvcToken  Required parameter: Auto-generated unique identifier representing a user
     *         IDV check, prefixed with `idvc-`.
     * @return    Returns the IdvCheckResult response from the API call
     */
    public CompletableFuture<IdvCheckResult> retrieveIdentityCheckAsync(
            final String userToken,
            final String idvcToken) {
        try {
            return prepareRetrieveIdentityCheckRequest(userToken, idvcToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveIdentityCheck.
     */
    private ApiCall<IdvCheckResult, ApiException> prepareRetrieveIdentityCheckRequest(
            final String userToken,
            final String idvcToken) {
        return new ApiCall.Builder<IdvCheckResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/idv-checks/{idvc-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("idvc-token").value(idvcToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IdvCheckResult.class))
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
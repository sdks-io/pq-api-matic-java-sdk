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
import com.mypayquicker.api.models.AgreementListResultJson;
import com.mypayquicker.api.models.AgreementResult;
import com.mypayquicker.api.models.Languages;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultAgreementsController extends BaseController implements AgreementsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultAgreementsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

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
    public AgreementListResultJson listAgreements(
            final String programToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListAgreementsRequest(programToken, page, pageSize, filter, sort,
                language).execute();
    }

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
    public CompletableFuture<AgreementListResultJson> listAgreementsAsync(
            final String programToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListAgreementsRequest(programToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listAgreements.
     */
    private ApiCall<AgreementListResultJson, ApiException> prepareListAgreementsRequest(
            final String programToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<AgreementListResultJson, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/programs/{program-token}/agreements")
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
                        .templateParam(param -> param.key("program-token").value(programToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AgreementListResultJson.class))
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
     * Retrieve a single program [agreement](page:resources/agreements).
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @return    Returns the AgreementResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AgreementResult retrieveProgramAgreement(
            final String programToken,
            final String agreementToken) throws ApiException, IOException {
        return prepareRetrieveProgramAgreementRequest(programToken, agreementToken).execute();
    }

    /**
     * Retrieve a single program [agreement](page:resources/agreements).
     * @param  programToken  Required parameter: Auto-generated unique identifier representing a
     *         program, prefixed with `prog-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @return    Returns the AgreementResult response from the API call
     */
    public CompletableFuture<AgreementResult> retrieveProgramAgreementAsync(
            final String programToken,
            final String agreementToken) {
        try {
            return prepareRetrieveProgramAgreementRequest(programToken, agreementToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveProgramAgreement.
     */
    private ApiCall<AgreementResult, ApiException> prepareRetrieveProgramAgreementRequest(
            final String programToken,
            final String agreementToken) {
        return new ApiCall.Builder<AgreementResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/programs/{program-token}/agreements/{agreement-token}")
                        .templateParam(param -> param.key("program-token").value(programToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("agreement-token").value(agreementToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AgreementResult.class))
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
     * Accept a single program [agreement](page:resources/agreements).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void acceptAgreement(
            final String userToken,
            final String agreementToken) throws ApiException, IOException {
        prepareAcceptAgreementRequest(userToken, agreementToken).execute();
    }

    /**
     * Accept a single program [agreement](page:resources/agreements).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  agreementToken  Required parameter: Auto-generated unique identifier representing a
     *         program agreement, prefixed with `agmt-`.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> acceptAgreementAsync(
            final String userToken,
            final String agreementToken) {
        try {
            return prepareAcceptAgreementRequest(userToken, agreementToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for acceptAgreement.
     */
    private ApiCall<Void, ApiException> prepareAcceptAgreementRequest(
            final String userToken,
            final String agreementToken) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/agreements/{agreement-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("agreement-token").value(agreementToken)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
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
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
import com.mypayquicker.api.models.CreateInvitation;
import com.mypayquicker.api.models.InvitationListResult;
import com.mypayquicker.api.models.InvitationResult;
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
public final class DefaultInvitationsController extends BaseController implements InvitationsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultInvitationsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

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
    public InvitationListResult listInvitations(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListInvitationsRequest(page, pageSize, filter, sort, language).execute();
    }

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
    public CompletableFuture<InvitationListResult> listInvitationsAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListInvitationsRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listInvitations.
     */
    private ApiCall<InvitationListResult, ApiException> prepareListInvitationsRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<InvitationListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/invitations")
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
                                response -> ApiHelper.deserialize(response, InvitationListResult.class))
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
     * Create a [invitation](page:resources/invitations) quote.
     * @param  body  Optional parameter:
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvitationResult createInvitation(
            final CreateInvitation body) throws ApiException, IOException {
        return prepareCreateInvitationRequest(body).execute();
    }

    /**
     * Create a [invitation](page:resources/invitations) quote.
     * @param  body  Optional parameter:
     * @return    Returns the InvitationResult response from the API call
     */
    public CompletableFuture<InvitationResult> createInvitationAsync(
            final CreateInvitation body) {
        try {
            return prepareCreateInvitationRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createInvitation.
     */
    private ApiCall<InvitationResult, ApiException> prepareCreateInvitationRequest(
            final CreateInvitation body) {
        return new ApiCall.Builder<InvitationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/invitations")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, InvitationResult.class))
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
     * Retrieve a single [invitation](page:resources/invitations).
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvitationResult retrieveInvitation(
            final String invitationToken,
            final String filter,
            final Languages language) throws ApiException, IOException {
        return prepareRetrieveInvitationRequest(invitationToken, filter, language).execute();
    }

    /**
     * Retrieve a single [invitation](page:resources/invitations).
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the InvitationResult response from the API call
     */
    public CompletableFuture<InvitationResult> retrieveInvitationAsync(
            final String invitationToken,
            final String filter,
            final Languages language) {
        try {
            return prepareRetrieveInvitationRequest(invitationToken, filter, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveInvitation.
     */
    private ApiCall<InvitationResult, ApiException> prepareRetrieveInvitationRequest(
            final String invitationToken,
            final String filter,
            final Languages language) {
        return new ApiCall.Builder<InvitationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/invitations/{invitation-token}")
                        .queryParam(param -> param.key("filter")
                                .value(filter).isRequired(false))
                        .queryParam(param -> param.key("language")
                                .value((language != null) ? language.value() : null).isRequired(false))
                        .templateParam(param -> param.key("invitation-token").value(invitationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, InvitationResult.class))
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
     * Accept an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvitationResult updateInvitation(
            final String invitationToken) throws ApiException, IOException {
        return prepareUpdateInvitationRequest(invitationToken).execute();
    }

    /**
     * Accept an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     */
    public CompletableFuture<InvitationResult> updateInvitationAsync(
            final String invitationToken) {
        try {
            return prepareUpdateInvitationRequest(invitationToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateInvitation.
     */
    private ApiCall<InvitationResult, ApiException> prepareUpdateInvitationRequest(
            final String invitationToken) {
        return new ApiCall.Builder<InvitationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/invitations/{invitation-token}")
                        .templateParam(param -> param.key("invitation-token").value(invitationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, InvitationResult.class))
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
     * Cancel an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvitationResult cancelInvitation(
            final String invitationToken) throws ApiException, IOException {
        return prepareCancelInvitationRequest(invitationToken).execute();
    }

    /**
     * Cancel an open [invitation](page:resources/invitations) quote.
     * @param  invitationToken  Required parameter: Auto-generated unique identifier representing an
     *         invite, prefixed with `invt-`.
     * @return    Returns the InvitationResult response from the API call
     */
    public CompletableFuture<InvitationResult> cancelInvitationAsync(
            final String invitationToken) {
        try {
            return prepareCancelInvitationRequest(invitationToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelInvitation.
     */
    private ApiCall<InvitationResult, ApiException> prepareCancelInvitationRequest(
            final String invitationToken) {
        return new ApiCall.Builder<InvitationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/invitations/{invitation-token}")
                        .templateParam(param -> param.key("invitation-token").value(invitationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, InvitationResult.class))
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
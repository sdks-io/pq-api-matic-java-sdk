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
import com.mypayquicker.api.models.CreateOrUpdateUser;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.UserListResult;
import com.mypayquicker.api.models.UserResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultUsersController extends BaseController implements UsersController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultUsersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [users](page:resources/user) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the UserListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserListResult listUsers(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListUsersRequest(page, pageSize, filter, sort, language).execute();
    }

    /**
     * Retrieve a list of [users](page:resources/user) that supports filtering, sorting, and
     * pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the UserListResult response from the API call
     */
    public CompletableFuture<UserListResult> listUsersAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListUsersRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listUsers.
     */
    private ApiCall<UserListResult, ApiException> prepareListUsersRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<UserListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users")
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
                                response -> ApiHelper.deserialize(response, UserListResult.class))
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
     * Create a new [user](page:resources/user).
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResult createUser(
            final CreateOrUpdateUser body) throws ApiException, IOException {
        return prepareCreateUserRequest(body).execute();
    }

    /**
     * Create a new [user](page:resources/user).
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     */
    public CompletableFuture<UserResult> createUserAsync(
            final CreateOrUpdateUser body) {
        try {
            return prepareCreateUserRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createUser.
     */
    private ApiCall<UserResult, ApiException> prepareCreateUserRequest(
            final CreateOrUpdateUser body) {
        return new ApiCall.Builder<UserResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users")
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
                                response -> ApiHelper.deserialize(response, UserResult.class))
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
     * Update a [user](page:resources/user) object (change
     * [email](#/rest/models/structures/email-address)], [address](#/rest/models/structures/address)
     * change, etc.) using a user token.'.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResult updateUser(
            final String userToken,
            final CreateOrUpdateUser body) throws ApiException, IOException {
        return prepareUpdateUserRequest(userToken, body).execute();
    }

    /**
     * Update a [user](page:resources/user) object (change
     * [email](#/rest/models/structures/email-address)], [address](#/rest/models/structures/address)
     * change, etc.) using a user token.'.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the UserResult response from the API call
     */
    public CompletableFuture<UserResult> updateUserAsync(
            final String userToken,
            final CreateOrUpdateUser body) {
        try {
            return prepareUpdateUserRequest(userToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateUser.
     */
    private ApiCall<UserResult, ApiException> prepareUpdateUserRequest(
            final String userToken,
            final CreateOrUpdateUser body) {
        return new ApiCall.Builder<UserResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UserResult.class))
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
     * Retrieve a single [user](page:resources/user) record by user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the UserResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResult retrieveUser(
            final String userToken) throws ApiException, IOException {
        return prepareRetrieveUserRequest(userToken).execute();
    }

    /**
     * Retrieve a single [user](page:resources/user) record by user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @return    Returns the UserResult response from the API call
     */
    public CompletableFuture<UserResult> retrieveUserAsync(
            final String userToken) {
        try {
            return prepareRetrieveUserRequest(userToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveUser.
     */
    private ApiCall<UserResult, ApiException> prepareRetrieveUserRequest(
            final String userToken) {
        return new ApiCall.Builder<UserResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UserResult.class))
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
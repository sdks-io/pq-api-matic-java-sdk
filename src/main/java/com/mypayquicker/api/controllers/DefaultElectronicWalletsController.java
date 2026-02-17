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
import com.mypayquicker.api.models.Countries;
import com.mypayquicker.api.models.CreateOrUpdateElectronicWallet;
import com.mypayquicker.api.models.Currencies;
import com.mypayquicker.api.models.ElectronicWalletListResult;
import com.mypayquicker.api.models.ElectronicWalletRequirementListResult;
import com.mypayquicker.api.models.ElectronicWalletResult;
import com.mypayquicker.api.models.ElectronicWalletTypes;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OperationResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultElectronicWalletsController extends BaseController implements ElectronicWalletsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultElectronicWalletsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [electronic wallets](page:resources/electronic-wallets) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ElectronicWalletListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ElectronicWalletListResult listElectronicWallets(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListElectronicWalletsRequest(userToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of [electronic wallets](page:resources/electronic-wallets) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ElectronicWalletListResult response from the API call
     */
    public CompletableFuture<ElectronicWalletListResult> listElectronicWalletsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListElectronicWalletsRequest(userToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listElectronicWallets.
     */
    private ApiCall<ElectronicWalletListResult, ApiException> prepareListElectronicWalletsRequest(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<ElectronicWalletListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/electronic-wallets")
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
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ElectronicWalletListResult.class))
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
     * Create a new [electronic wallet](page:resources/electronic-wallets) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the ElectronicWalletResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ElectronicWalletResult createElectronicWallet(
            final String userToken,
            final CreateOrUpdateElectronicWallet body) throws ApiException, IOException {
        return prepareCreateElectronicWalletRequest(userToken, body).execute();
    }

    /**
     * Create a new [electronic wallet](page:resources/electronic-wallets) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the ElectronicWalletResult response from the API call
     */
    public CompletableFuture<ElectronicWalletResult> createElectronicWalletAsync(
            final String userToken,
            final CreateOrUpdateElectronicWallet body) {
        try {
            return prepareCreateElectronicWalletRequest(userToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createElectronicWallet.
     */
    private ApiCall<ElectronicWalletResult, ApiException> prepareCreateElectronicWalletRequest(
            final String userToken,
            final CreateOrUpdateElectronicWallet body) {
        return new ApiCall.Builder<ElectronicWalletResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/electronic-wallets")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ElectronicWalletResult.class))
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
     * Retrieve requirements for adding a [electronic wallet](page:resources/electronic-wallets)
     * using the parameters provided.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  electronicWalletType  Optional parameter: Filter results by electronic wallet type.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the ElectronicWalletRequirementListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ElectronicWalletRequirementListResult retrieveCreationRequirements(
            final String userToken,
            final ElectronicWalletTypes electronicWalletType,
            final Countries country,
            final Currencies currency) throws ApiException, IOException {
        return prepareRetrieveCreationRequirementsRequest(userToken, electronicWalletType, country,
                currency).execute();
    }

    /**
     * Retrieve requirements for adding a [electronic wallet](page:resources/electronic-wallets)
     * using the parameters provided.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  electronicWalletType  Optional parameter: Filter results by electronic wallet type.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the ElectronicWalletRequirementListResult response from the API call
     */
    public CompletableFuture<ElectronicWalletRequirementListResult> retrieveCreationRequirementsAsync(
            final String userToken,
            final ElectronicWalletTypes electronicWalletType,
            final Countries country,
            final Currencies currency) {
        try {
            return prepareRetrieveCreationRequirementsRequest(userToken, electronicWalletType, country,
            currency).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveCreationRequirements.
     */
    private ApiCall<ElectronicWalletRequirementListResult, ApiException> prepareRetrieveCreationRequirementsRequest(
            final String userToken,
            final ElectronicWalletTypes electronicWalletType,
            final Countries country,
            final Currencies currency) {
        return new ApiCall.Builder<ElectronicWalletRequirementListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/electronic-wallets/requirements")
                        .queryParam(param -> param.key("electronicWalletType")
                                .value((electronicWalletType != null) ? electronicWalletType.value() : null).isRequired(false))
                        .queryParam(param -> param.key("country")
                                .value((country != null) ? country.value() : null).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value((currency != null) ? currency.value() : null).isRequired(false))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ElectronicWalletRequirementListResult.class))
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
     * Retrieve a single [electronic wallet](page:resources/electronic-wallets) using a destination
     * token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ElectronicWalletResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ElectronicWalletResult retrieveElectronicWallet(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareRetrieveElectronicWalletRequest(userToken, destinationToken, page, pageSize,
                filter, sort, language).execute();
    }

    /**
     * Retrieve a single [electronic wallet](page:resources/electronic-wallets) using a destination
     * token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ElectronicWalletResult response from the API call
     */
    public CompletableFuture<ElectronicWalletResult> retrieveElectronicWalletAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareRetrieveElectronicWalletRequest(userToken, destinationToken, page, pageSize,
            filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveElectronicWallet.
     */
    private ApiCall<ElectronicWalletResult, ApiException> prepareRetrieveElectronicWalletRequest(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<ElectronicWalletResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/electronic-wallets/{destination-token}")
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
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ElectronicWalletResult.class))
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
     * Update a [electronic wallet](page:resources/electronic-wallets).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the ElectronicWalletResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ElectronicWalletResult updateElectronicWallet(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateElectronicWallet body) throws ApiException, IOException {
        return prepareUpdateElectronicWalletRequest(userToken, destinationToken, body).execute();
    }

    /**
     * Update a [electronic wallet](page:resources/electronic-wallets).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the ElectronicWalletResult response from the API call
     */
    public CompletableFuture<ElectronicWalletResult> updateElectronicWalletAsync(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateElectronicWallet body) {
        try {
            return prepareUpdateElectronicWalletRequest(userToken, destinationToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateElectronicWallet.
     */
    private ApiCall<ElectronicWalletResult, ApiException> prepareUpdateElectronicWalletRequest(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateElectronicWallet body) {
        return new ApiCall.Builder<ElectronicWalletResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/electronic-wallets/{destination-token}")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ElectronicWalletResult.class))
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
     * Delete a user [electronic wallet](page:resources/electronic-wallets).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OperationResult deleteElectronicWallet(
            final String userToken,
            final String destinationToken) throws ApiException, IOException {
        return prepareDeleteElectronicWalletRequest(userToken, destinationToken).execute();
    }

    /**
     * Delete a user [electronic wallet](page:resources/electronic-wallets).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     */
    public CompletableFuture<OperationResult> deleteElectronicWalletAsync(
            final String userToken,
            final String destinationToken) {
        try {
            return prepareDeleteElectronicWalletRequest(userToken, destinationToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deleteElectronicWallet.
     */
    private ApiCall<OperationResult, ApiException> prepareDeleteElectronicWalletRequest(
            final String userToken,
            final String destinationToken) {
        return new ApiCall.Builder<OperationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/electronic-wallets/{destination-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OperationResult.class))
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
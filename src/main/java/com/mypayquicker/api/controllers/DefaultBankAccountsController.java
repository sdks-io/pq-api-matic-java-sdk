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
import com.mypayquicker.api.models.BankAccountListResult;
import com.mypayquicker.api.models.BankAccountRequirementListResult;
import com.mypayquicker.api.models.BankAccountResult;
import com.mypayquicker.api.models.Countries;
import com.mypayquicker.api.models.CreateOrUpdateBankAccount;
import com.mypayquicker.api.models.Currencies;
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
public final class DefaultBankAccountsController extends BaseController implements BankAccountsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultBankAccountsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [bank accounts](page:resources/bank-accounts) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountListResult listBankAccounts(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListBankAccountsRequest(userToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of [bank accounts](page:resources/bank-accounts) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountListResult response from the API call
     */
    public CompletableFuture<BankAccountListResult> listBankAccountsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListBankAccountsRequest(userToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listBankAccounts.
     */
    private ApiCall<BankAccountListResult, ApiException> prepareListBankAccountsRequest(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<BankAccountListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/bank-accounts")
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
                                response -> ApiHelper.deserialize(response, BankAccountListResult.class))
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
     * Create a [bank account](page:resources/bank-accounts) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResult createBankAccount(
            final String userToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException {
        return prepareCreateBankAccountRequest(userToken, body).execute();
    }

    /**
     * Create a [bank account](page:resources/bank-accounts) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     */
    public CompletableFuture<BankAccountResult> createBankAccountAsync(
            final String userToken,
            final CreateOrUpdateBankAccount body) {
        try {
            return prepareCreateBankAccountRequest(userToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createBankAccount.
     */
    private ApiCall<BankAccountResult, ApiException> prepareCreateBankAccountRequest(
            final String userToken,
            final CreateOrUpdateBankAccount body) {
        return new ApiCall.Builder<BankAccountResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/bank-accounts")
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
                                response -> ApiHelper.deserialize(response, BankAccountResult.class))
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
     * Retrieve a single [bank account](page:resources/bank-accounts) using a destination token.
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
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResult retrieveBankAccount(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareRetrieveBankAccountRequest(userToken, destinationToken, page, pageSize,
                filter, sort, language).execute();
    }

    /**
     * Retrieve a single [bank account](page:resources/bank-accounts) using a destination token.
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
     * @return    Returns the BankAccountResult response from the API call
     */
    public CompletableFuture<BankAccountResult> retrieveBankAccountAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareRetrieveBankAccountRequest(userToken, destinationToken, page, pageSize, filter,
            sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveBankAccount.
     */
    private ApiCall<BankAccountResult, ApiException> prepareRetrieveBankAccountRequest(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<BankAccountResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/bank-accounts/{destination-token}")
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
                                response -> ApiHelper.deserialize(response, BankAccountResult.class))
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
     * Update a [bank account](page:resources/bank-accounts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResult updateBankAccount(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException {
        return prepareUpdateBankAccountRequest(userToken, destinationToken, body).execute();
    }

    /**
     * Update a [bank account](page:resources/bank-accounts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     */
    public CompletableFuture<BankAccountResult> updateBankAccountAsync(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) {
        try {
            return prepareUpdateBankAccountRequest(userToken, destinationToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateBankAccount.
     */
    private ApiCall<BankAccountResult, ApiException> prepareUpdateBankAccountRequest(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) {
        return new ApiCall.Builder<BankAccountResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/bank-accounts/{destination-token}")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccountResult.class))
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
     * Delete a user [bank account](page:resources/bank-accounts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OperationResult deleteBankAccount(
            final String userToken,
            final String destinationToken) throws ApiException, IOException {
        return prepareDeleteBankAccountRequest(userToken, destinationToken).execute();
    }

    /**
     * Delete a user [bank account](page:resources/bank-accounts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     */
    public CompletableFuture<OperationResult> deleteBankAccountAsync(
            final String userToken,
            final String destinationToken) {
        try {
            return prepareDeleteBankAccountRequest(userToken, destinationToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deleteBankAccount.
     */
    private ApiCall<OperationResult, ApiException> prepareDeleteBankAccountRequest(
            final String userToken,
            final String destinationToken) {
        return new ApiCall.Builder<OperationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/bank-accounts/{destination-token}")
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

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountRequirementListResult retrieveCreationRequirements(
            final String userToken,
            final Countries country,
            final Currencies currency) throws ApiException, IOException {
        return prepareRetrieveCreationRequirementsRequest(userToken, country, currency).execute();
    }

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     */
    public CompletableFuture<BankAccountRequirementListResult> retrieveCreationRequirementsAsync(
            final String userToken,
            final Countries country,
            final Currencies currency) {
        try {
            return prepareRetrieveCreationRequirementsRequest(userToken, country, currency).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveCreationRequirements.
     */
    private ApiCall<BankAccountRequirementListResult, ApiException> prepareRetrieveCreationRequirementsRequest(
            final String userToken,
            final Countries country,
            final Currencies currency) {
        return new ApiCall.Builder<BankAccountRequirementListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/bank-accounts/requirements")
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
                                response -> ApiHelper.deserialize(response, BankAccountRequirementListResult.class))
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
     * Retrieve a list of company [bank accounts](page:resources/bank-accounts) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountListResult listCompanyBankAccounts(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListCompanyBankAccountsRequest(accountToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of company [bank accounts](page:resources/bank-accounts) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountListResult response from the API call
     */
    public CompletableFuture<BankAccountListResult> listCompanyBankAccountsAsync(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListCompanyBankAccountsRequest(accountToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listCompanyBankAccounts.
     */
    private ApiCall<BankAccountListResult, ApiException> prepareListCompanyBankAccountsRequest(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<BankAccountListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/bank-accounts")
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
                        .templateParam(param -> param.key("account-token").value(accountToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccountListResult.class))
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
     * Create a company [bank account](page:resources/bank-accounts) using an account token.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResult createCompanyBankAccount(
            final String accountToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException {
        return prepareCreateCompanyBankAccountRequest(accountToken, body).execute();
    }

    /**
     * Create a company [bank account](page:resources/bank-accounts) using an account token.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     */
    public CompletableFuture<BankAccountResult> createCompanyBankAccountAsync(
            final String accountToken,
            final CreateOrUpdateBankAccount body) {
        try {
            return prepareCreateCompanyBankAccountRequest(accountToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createCompanyBankAccount.
     */
    private ApiCall<BankAccountResult, ApiException> prepareCreateCompanyBankAccountRequest(
            final String accountToken,
            final CreateOrUpdateBankAccount body) {
        return new ApiCall.Builder<BankAccountResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/bank-accounts")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account-token").value(accountToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccountResult.class))
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
     * Retrieve a single company [bank account](page:resources/bank-accounts) using a destination
     * token.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResult retrieveCompanyBankAccount(
            final String accountToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareRetrieveCompanyBankAccountRequest(accountToken, destinationToken, page,
                pageSize, filter, sort, language).execute();
    }

    /**
     * Retrieve a single company [bank account](page:resources/bank-accounts) using a destination
     * token.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the BankAccountResult response from the API call
     */
    public CompletableFuture<BankAccountResult> retrieveCompanyBankAccountAsync(
            final String accountToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareRetrieveCompanyBankAccountRequest(accountToken, destinationToken, page, pageSize,
            filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveCompanyBankAccount.
     */
    private ApiCall<BankAccountResult, ApiException> prepareRetrieveCompanyBankAccountRequest(
            final String accountToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<BankAccountResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/bank-accounts/{destination-token}")
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
                        .templateParam(param -> param.key("account-token").value(accountToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccountResult.class))
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
     * Update a company [bank account](page:resources/bank-accounts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountResult updateCompanyBankAccount(
            final String accountToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException {
        return prepareUpdateCompanyBankAccountRequest(accountToken, destinationToken,
                body).execute();
    }

    /**
     * Update a company [bank account](page:resources/bank-accounts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     */
    public CompletableFuture<BankAccountResult> updateCompanyBankAccountAsync(
            final String accountToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) {
        try {
            return prepareUpdateCompanyBankAccountRequest(accountToken, destinationToken,
            body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateCompanyBankAccount.
     */
    private ApiCall<BankAccountResult, ApiException> prepareUpdateCompanyBankAccountRequest(
            final String accountToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) {
        return new ApiCall.Builder<BankAccountResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/bank-accounts/{destination-token}")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account-token").value(accountToken)
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
                                response -> ApiHelper.deserialize(response, BankAccountResult.class))
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
     * Delete a company [bank account](page:resources/bank-accounts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OperationResult deleteCompanyBankAccount(
            final String accountToken,
            final String destinationToken) throws ApiException, IOException {
        return prepareDeleteCompanyBankAccountRequest(accountToken, destinationToken).execute();
    }

    /**
     * Delete a company [bank account](page:resources/bank-accounts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     */
    public CompletableFuture<OperationResult> deleteCompanyBankAccountAsync(
            final String accountToken,
            final String destinationToken) {
        try {
            return prepareDeleteCompanyBankAccountRequest(accountToken, destinationToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deleteCompanyBankAccount.
     */
    private ApiCall<OperationResult, ApiException> prepareDeleteCompanyBankAccountRequest(
            final String accountToken,
            final String destinationToken) {
        return new ApiCall.Builder<OperationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/bank-accounts/{destination-token}")
                        .templateParam(param -> param.key("account-token").value(accountToken)
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

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountRequirementListResult retrieveCompanyBankAccountCreationRequirements(
            final String accountToken,
            final Countries country,
            final Currencies currency) throws ApiException, IOException {
        return prepareRetrieveCompanyBankAccountCreationRequirementsRequest(accountToken, country,
                currency).execute();
    }

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     */
    public CompletableFuture<BankAccountRequirementListResult> retrieveCompanyBankAccountCreationRequirementsAsync(
            final String accountToken,
            final Countries country,
            final Currencies currency) {
        try {
            return prepareRetrieveCompanyBankAccountCreationRequirementsRequest(accountToken, country,
            currency).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveCompanyBankAccountCreationRequirements.
     */
    private ApiCall<BankAccountRequirementListResult, ApiException> prepareRetrieveCompanyBankAccountCreationRequirementsRequest(
            final String accountToken,
            final Countries country,
            final Currencies currency) {
        return new ApiCall.Builder<BankAccountRequirementListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/bank-accounts/requirements")
                        .queryParam(param -> param.key("country")
                                .value((country != null) ? country.value() : null).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value((currency != null) ? currency.value() : null).isRequired(false))
                        .templateParam(param -> param.key("account-token").value(accountToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccountRequirementListResult.class))
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
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * pre-paid card as the destination.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccountRequirementListResult retrieveBankAccountCreationRequirementsForAPrepaidCard(
            final String userToken,
            final String destinationToken,
            final Countries country,
            final Currencies currency) throws ApiException, IOException {
        return prepareRetrieveBankAccountCreationRequirementsForAPrepaidCardRequest(userToken,
                destinationToken, country, currency).execute();
    }

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * pre-paid card as the destination.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     */
    public CompletableFuture<BankAccountRequirementListResult> retrieveBankAccountCreationRequirementsForAPrepaidCardAsync(
            final String userToken,
            final String destinationToken,
            final Countries country,
            final Currencies currency) {
        try {
            return prepareRetrieveBankAccountCreationRequirementsForAPrepaidCardRequest(userToken,
            destinationToken, country, currency).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveBankAccountCreationRequirementsForAPrepaidCard.
     */
    private ApiCall<BankAccountRequirementListResult, ApiException> prepareRetrieveBankAccountCreationRequirementsForAPrepaidCardRequest(
            final String userToken,
            final String destinationToken,
            final Countries country,
            final Currencies currency) {
        return new ApiCall.Builder<BankAccountRequirementListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/bank-accounts/requirements")
                        .queryParam(param -> param.key("country")
                                .value((country != null) ? country.value() : null).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value((currency != null) ? currency.value() : null).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, BankAccountRequirementListResult.class))
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
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
import com.mypayquicker.api.models.ReceiptListResult;
import com.mypayquicker.api.models.ReceiptResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultReceiptsController extends BaseController implements ReceiptsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultReceiptsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of all account(s) [receipts](page:resources/receipts) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ReceiptListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptListResult listAccountReceipts(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListAccountReceiptsRequest(accountToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of all account(s) [receipts](page:resources/receipts) that supports
     * filtering, sorting, and pagination through existing mechanisms.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ReceiptListResult response from the API call
     */
    public CompletableFuture<ReceiptListResult> listAccountReceiptsAsync(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListAccountReceiptsRequest(accountToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listAccountReceipts.
     */
    private ApiCall<ReceiptListResult, ApiException> prepareListAccountReceiptsRequest(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<ReceiptListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/receipts")
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
                                response -> ApiHelper.deserialize(response, ReceiptListResult.class))
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
     * Retrieve a single account [receipt](page:resources/receipts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptResult retrieveAccountReceipt(
            final String accountToken,
            final String receiptToken) throws ApiException, IOException {
        return prepareRetrieveAccountReceiptRequest(accountToken, receiptToken).execute();
    }

    /**
     * Retrieve a single account [receipt](page:resources/receipts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     */
    public CompletableFuture<ReceiptResult> retrieveAccountReceiptAsync(
            final String accountToken,
            final String receiptToken) {
        try {
            return prepareRetrieveAccountReceiptRequest(accountToken, receiptToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveAccountReceipt.
     */
    private ApiCall<ReceiptResult, ApiException> prepareRetrieveAccountReceiptRequest(
            final String accountToken,
            final String receiptToken) {
        return new ApiCall.Builder<ReceiptResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/accounts/{account-token}/receipts/{receipt-token}")
                        .templateParam(param -> param.key("account-token").value(accountToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("receipt-token").value(receiptToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReceiptResult.class))
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
     * Retrieve a list of [prepaid card](page:resources/prepaid-cards)
     * [receipts](page:resources/receipts) that supports filtering, sorting, and pagination through
     * existing mechanisms.
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
     * @return    Returns the ReceiptListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptListResult listPrepaidCardReceipts(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListPrepaidCardReceiptsRequest(userToken, destinationToken, page, pageSize,
                filter, sort, language).execute();
    }

    /**
     * Retrieve a list of [prepaid card](page:resources/prepaid-cards)
     * [receipts](page:resources/receipts) that supports filtering, sorting, and pagination through
     * existing mechanisms.
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
     * @return    Returns the ReceiptListResult response from the API call
     */
    public CompletableFuture<ReceiptListResult> listPrepaidCardReceiptsAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListPrepaidCardReceiptsRequest(userToken, destinationToken, page, pageSize,
            filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listPrepaidCardReceipts.
     */
    private ApiCall<ReceiptListResult, ApiException> prepareListPrepaidCardReceiptsRequest(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<ReceiptListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/receipts")
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
                                response -> ApiHelper.deserialize(response, ReceiptListResult.class))
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
     * Retrieve a single user prepaid-card [receipt](page:resources/receipts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptResult retrievePrepaidCardReceipt(
            final String userToken,
            final String destinationToken,
            final String receiptToken) throws ApiException, IOException {
        return prepareRetrievePrepaidCardReceiptRequest(userToken, destinationToken,
                receiptToken).execute();
    }

    /**
     * Retrieve a single user prepaid-card [receipt](page:resources/receipts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     */
    public CompletableFuture<ReceiptResult> retrievePrepaidCardReceiptAsync(
            final String userToken,
            final String destinationToken,
            final String receiptToken) {
        try {
            return prepareRetrievePrepaidCardReceiptRequest(userToken, destinationToken,
            receiptToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrievePrepaidCardReceipt.
     */
    private ApiCall<ReceiptResult, ApiException> prepareRetrievePrepaidCardReceiptRequest(
            final String userToken,
            final String destinationToken,
            final String receiptToken) {
        return new ApiCall.Builder<ReceiptResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/receipts/{receipt-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("receipt-token").value(receiptToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReceiptResult.class))
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
     * Retrieve a list of user [receipts](page:resources/receipts) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ReceiptListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptListResult listUserReceipts(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListUserReceiptsRequest(userToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of user [receipts](page:resources/receipts) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the ReceiptListResult response from the API call
     */
    public CompletableFuture<ReceiptListResult> listUserReceiptsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListUserReceiptsRequest(userToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listUserReceipts.
     */
    private ApiCall<ReceiptListResult, ApiException> prepareListUserReceiptsRequest(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<ReceiptListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/receipts")
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
                                response -> ApiHelper.deserialize(response, ReceiptListResult.class))
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
     * Retrieve a single user [receipt](page:resources/receipts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReceiptResult retrieveUserReceipt(
            final String userToken,
            final String receiptToken) throws ApiException, IOException {
        return prepareRetrieveUserReceiptRequest(userToken, receiptToken).execute();
    }

    /**
     * Retrieve a single user [receipt](page:resources/receipts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     */
    public CompletableFuture<ReceiptResult> retrieveUserReceiptAsync(
            final String userToken,
            final String receiptToken) {
        try {
            return prepareRetrieveUserReceiptRequest(userToken, receiptToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveUserReceipt.
     */
    private ApiCall<ReceiptResult, ApiException> prepareRetrieveUserReceiptRequest(
            final String userToken,
            final String receiptToken) {
        return new ApiCall.Builder<ReceiptResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/receipts/{receipt-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("receipt-token").value(receiptToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReceiptResult.class))
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
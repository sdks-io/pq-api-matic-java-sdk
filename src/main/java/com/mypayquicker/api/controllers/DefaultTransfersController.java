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
import com.mypayquicker.api.models.TransferListResult;
import com.mypayquicker.api.models.TransferResult;
import com.mypayquicker.api.models.containers.TransferQuote;
import com.mypayquicker.api.utilities.JsonObject;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultTransfersController extends BaseController implements TransfersController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultTransfersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of [transfers](page:resources/transfers) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferListResult listTransfers(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListTransfersRequest(page, pageSize, filter, sort, language).execute();
    }

    /**
     * Retrieve a list of [transfers](page:resources/transfers) that supports filtering, sorting,
     * and pagination through existing mechanisms.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     */
    public CompletableFuture<TransferListResult> listTransfersAsync(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListTransfersRequest(page, pageSize, filter, sort, language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listTransfers.
     */
    private ApiCall<TransferListResult, ApiException> prepareListTransfersRequest(
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<TransferListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/transfers")
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
                                response -> ApiHelper.deserialize(response, TransferListResult.class))
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
     * Create a new [transfer](page:resources/transfers) quote.
     * @param  body  Optional parameter:
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResult createTransferQuote(
            final TransferQuote body) throws ApiException, IOException {
        return prepareCreateTransferQuoteRequest(body).execute();
    }

    /**
     * Create a new [transfer](page:resources/transfers) quote.
     * @param  body  Optional parameter:
     * @return    Returns the TransferResult response from the API call
     */
    public CompletableFuture<TransferResult> createTransferQuoteAsync(
            final TransferQuote body) {
        try {
            return prepareCreateTransferQuoteRequest(body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createTransferQuote.
     */
    private ApiCall<TransferResult, ApiException> prepareCreateTransferQuoteRequest(
            final TransferQuote body) {
        return new ApiCall.Builder<TransferResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/transfers")
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
                                response -> ApiHelper.deserialize(response, TransferResult.class))
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
     * Retrieve details of a specific [transfer](page:resources/transfers) represented by a transfer
     * token.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResult retrieveTransfer(
            final String transferToken) throws ApiException, IOException {
        return prepareRetrieveTransferRequest(transferToken).execute();
    }

    /**
     * Retrieve details of a specific [transfer](page:resources/transfers) represented by a transfer
     * token.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    public CompletableFuture<TransferResult> retrieveTransferAsync(
            final String transferToken) {
        try {
            return prepareRetrieveTransferRequest(transferToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveTransfer.
     */
    private ApiCall<TransferResult, ApiException> prepareRetrieveTransferRequest(
            final String transferToken) {
        return new ApiCall.Builder<TransferResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/transfers/{transfer-token}")
                        .templateParam(param -> param.key("transfer-token").value(transferToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, TransferResult.class))
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
     * Accept a [transfer](page:resources/transfers) quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResult acceptTransferQuote(
            final String transferToken) throws ApiException, IOException {
        return prepareAcceptTransferQuoteRequest(transferToken).execute();
    }

    /**
     * Accept a [transfer](page:resources/transfers) quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    public CompletableFuture<TransferResult> acceptTransferQuoteAsync(
            final String transferToken) {
        try {
            return prepareAcceptTransferQuoteRequest(transferToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for acceptTransferQuote.
     */
    private ApiCall<TransferResult, ApiException> prepareAcceptTransferQuoteRequest(
            final String transferToken) {
        return new ApiCall.Builder<TransferResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/transfers/{transfer-token}")
                        .templateParam(param -> param.key("transfer-token").value(transferToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, TransferResult.class))
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
     * Optional [transfer](page:resources/transfers) quote cancellation that auto-cancels after a
     * period organically expires or when account activity invalidates the quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResult cancelTransferQuote(
            final String transferToken) throws ApiException, IOException {
        return prepareCancelTransferQuoteRequest(transferToken).execute();
    }

    /**
     * Optional [transfer](page:resources/transfers) quote cancellation that auto-cancels after a
     * period organically expires or when account activity invalidates the quote.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing an
     *         individual transfer transaction, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    public CompletableFuture<TransferResult> cancelTransferQuoteAsync(
            final String transferToken) {
        try {
            return prepareCancelTransferQuoteRequest(transferToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelTransferQuote.
     */
    private ApiCall<TransferResult, ApiException> prepareCancelTransferQuoteRequest(
            final String transferToken) {
        return new ApiCall.Builder<TransferResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/transfers/{transfer-token}")
                        .templateParam(param -> param.key("transfer-token").value(transferToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, TransferResult.class))
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
     * Retrieve a list of user [transfers](page:resources/transfers) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferListResult listUserTransfers(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListUserTransfersRequest(userToken, page, pageSize, filter, sort,
                language).execute();
    }

    /**
     * Retrieve a list of user [transfers](page:resources/transfers) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the TransferListResult response from the API call
     */
    public CompletableFuture<TransferListResult> listUserTransfersAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListUserTransfersRequest(userToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listUserTransfers.
     */
    private ApiCall<TransferListResult, ApiException> prepareListUserTransfersRequest(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<TransferListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/transfers")
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
                                response -> ApiHelper.deserialize(response, TransferListResult.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve a specific user bank [transfer](page:resources/transfers).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransferResult retrieveUserTransfer(
            final String userToken,
            final String transferToken) throws ApiException, IOException {
        return prepareRetrieveUserTransferRequest(userToken, transferToken).execute();
    }

    /**
     * Retrieve a specific user bank [transfer](page:resources/transfers).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  transferToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer, prefixed with `xfer-`.
     * @return    Returns the TransferResult response from the API call
     */
    public CompletableFuture<TransferResult> retrieveUserTransferAsync(
            final String userToken,
            final String transferToken) {
        try {
            return prepareRetrieveUserTransferRequest(userToken, transferToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveUserTransfer.
     */
    private ApiCall<TransferResult, ApiException> prepareRetrieveUserTransferRequest(
            final String userToken,
            final String transferToken) {
        return new ApiCall.Builder<TransferResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/transfers/{transfer-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("transfer-token").value(transferToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, TransferResult.class))
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
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
import com.mypayquicker.api.models.OperationResult;
import com.mypayquicker.api.models.PrepaidCardDataResult;
import com.mypayquicker.api.models.PrepaidCardDataTokenResult;
import com.mypayquicker.api.models.PrepaidCardDataType;
import com.mypayquicker.api.models.PrepaidCardImageSide;
import com.mypayquicker.api.models.PrepaidCardPinResult;
import com.mypayquicker.api.models.PrepaidCardPinTokenResult;
import com.mypayquicker.api.models.RetrieveCardData;
import com.mypayquicker.api.models.RetrieveCardPin;
import com.mypayquicker.api.models.UpdateCardPin;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultClientSideController extends BaseController implements ClientSideController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultClientSideController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Generate a token used to reveal [prepaid card](page:resources/prepaid-cards) information in
     * the form of image data (base64) or JSON.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  format  Required parameter: Desired format for the prepaid card data.
     * @param  side  Optional parameter: Side to specify when retrieving a prepaid card's image
     *         data. *Required if IMAGE format specified.
     * @return    Returns the PrepaidCardDataTokenResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaidCardDataTokenResult createCardDataToken(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side) throws ApiException, IOException {
        return prepareCreateCardDataTokenRequest(userToken, destinationToken, format,
                side).execute();
    }

    /**
     * Generate a token used to reveal [prepaid card](page:resources/prepaid-cards) information in
     * the form of image data (base64) or JSON.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  format  Required parameter: Desired format for the prepaid card data.
     * @param  side  Optional parameter: Side to specify when retrieving a prepaid card's image
     *         data. *Required if IMAGE format specified.
     * @return    Returns the PrepaidCardDataTokenResult response from the API call
     */
    public CompletableFuture<PrepaidCardDataTokenResult> createCardDataTokenAsync(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side) {
        try {
            return prepareCreateCardDataTokenRequest(userToken, destinationToken, format,
            side).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createCardDataToken.
     */
    private ApiCall<PrepaidCardDataTokenResult, ApiException> prepareCreateCardDataTokenRequest(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side) {
        return new ApiCall.Builder<PrepaidCardDataTokenResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/pci")
                        .queryParam(param -> param.key("format")
                                .value((format != null) ? format.value() : null))
                        .queryParam(param -> param.key("side")
                                .value((side != null) ? side.value() : null).isRequired(false))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaidCardDataTokenResult.class))
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
     * Return [prepaid card](page:resources/prepaid-cards) data in the form of image data, text, or
     * both.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  format  Required parameter: Desired format for the prepaid card data.
     * @param  side  Optional parameter: Side to specify when retrieving a prepaid card's image
     *         data. *Required if IMAGE format specified.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardDataResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaidCardDataResult retrieveCardData(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side,
            final RetrieveCardData body) throws ApiException, IOException {
        return prepareRetrieveCardDataRequest(userToken, destinationToken, format, side,
                body).execute();
    }

    /**
     * Return [prepaid card](page:resources/prepaid-cards) data in the form of image data, text, or
     * both.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  format  Required parameter: Desired format for the prepaid card data.
     * @param  side  Optional parameter: Side to specify when retrieving a prepaid card's image
     *         data. *Required if IMAGE format specified.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardDataResult response from the API call
     */
    public CompletableFuture<PrepaidCardDataResult> retrieveCardDataAsync(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side,
            final RetrieveCardData body) {
        try {
            return prepareRetrieveCardDataRequest(userToken, destinationToken, format, side,
            body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveCardData.
     */
    private ApiCall<PrepaidCardDataResult, ApiException> prepareRetrieveCardDataRequest(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side,
            final RetrieveCardData body) {
        return new ApiCall.Builder<PrepaidCardDataResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/pci")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("format")
                                .value((format != null) ? format.value() : null))
                        .queryParam(param -> param.key("side")
                                .value((side != null) ? side.value() : null).isRequired(false))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("destination-token").value(destinationToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("clientside"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaidCardDataResult.class))
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
     * Retrieve one part of a two-part token required to reveal or set a client side [prepaid
     * card](page:resources/prepaid-cards) PIN.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the PrepaidCardPinTokenResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaidCardPinTokenResult createCardPINToken(
            final String userToken,
            final String destinationToken) throws ApiException, IOException {
        return prepareCreateCardPINTokenRequest(userToken, destinationToken).execute();
    }

    /**
     * Retrieve one part of a two-part token required to reveal or set a client side [prepaid
     * card](page:resources/prepaid-cards) PIN.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the PrepaidCardPinTokenResult response from the API call
     */
    public CompletableFuture<PrepaidCardPinTokenResult> createCardPINTokenAsync(
            final String userToken,
            final String destinationToken) {
        try {
            return prepareCreateCardPINTokenRequest(userToken, destinationToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createCardPINToken.
     */
    private ApiCall<PrepaidCardPinTokenResult, ApiException> prepareCreateCardPINTokenRequest(
            final String userToken,
            final String destinationToken) {
        return new ApiCall.Builder<PrepaidCardPinTokenResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/pin")
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
                                response -> ApiHelper.deserialize(response, PrepaidCardPinTokenResult.class))
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
     * Set a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards), if supported by program.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the OperationResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OperationResult updateCardPIN(
            final String userToken,
            final String destinationToken,
            final UpdateCardPin body) throws ApiException, IOException {
        return prepareUpdateCardPINRequest(userToken, destinationToken, body).execute();
    }

    /**
     * Set a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards), if supported by program.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the OperationResult response from the API call
     */
    public CompletableFuture<OperationResult> updateCardPINAsync(
            final String userToken,
            final String destinationToken,
            final UpdateCardPin body) {
        try {
            return prepareUpdateCardPINRequest(userToken, destinationToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateCardPIN.
     */
    private ApiCall<OperationResult, ApiException> prepareUpdateCardPINRequest(
            final String userToken,
            final String destinationToken,
            final UpdateCardPin body) {
        return new ApiCall.Builder<OperationResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/pin")
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
                                .add("clientside"))
                        .httpMethod(HttpMethod.PUT))
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
     * Reveal a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardPinResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaidCardPinResult retrieveCardPIN(
            final String userToken,
            final String destinationToken,
            final RetrieveCardPin body) throws ApiException, IOException {
        return prepareRetrieveCardPINRequest(userToken, destinationToken, body).execute();
    }

    /**
     * Reveal a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidCardPinResult response from the API call
     */
    public CompletableFuture<PrepaidCardPinResult> retrieveCardPINAsync(
            final String userToken,
            final String destinationToken,
            final RetrieveCardPin body) {
        try {
            return prepareRetrieveCardPINRequest(userToken, destinationToken, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveCardPIN.
     */
    private ApiCall<PrepaidCardPinResult, ApiException> prepareRetrieveCardPINRequest(
            final String userToken,
            final String destinationToken,
            final RetrieveCardPin body) {
        return new ApiCall.Builder<PrepaidCardPinResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/prepaid-cards/{destination-token}/pin")
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
                                .add("clientside"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaidCardPinResult.class))
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
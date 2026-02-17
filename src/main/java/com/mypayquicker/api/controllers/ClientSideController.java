/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
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
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ClientSideController {
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
    PrepaidCardDataTokenResult createCardDataToken(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side) throws ApiException, IOException;

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
    CompletableFuture<PrepaidCardDataTokenResult> createCardDataTokenAsync(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side);

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
    PrepaidCardDataResult retrieveCardData(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side,
            final RetrieveCardData body) throws ApiException, IOException;

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
    CompletableFuture<PrepaidCardDataResult> retrieveCardDataAsync(
            final String userToken,
            final String destinationToken,
            final PrepaidCardDataType format,
            final PrepaidCardImageSide side,
            final RetrieveCardData body);

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
    PrepaidCardPinTokenResult createCardPINToken(
            final String userToken,
            final String destinationToken) throws ApiException, IOException;

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
    CompletableFuture<PrepaidCardPinTokenResult> createCardPINTokenAsync(
            final String userToken,
            final String destinationToken);

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
    OperationResult updateCardPIN(
            final String userToken,
            final String destinationToken,
            final UpdateCardPin body) throws ApiException, IOException;

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
    CompletableFuture<OperationResult> updateCardPINAsync(
            final String userToken,
            final String destinationToken,
            final UpdateCardPin body);

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
    PrepaidCardPinResult retrieveCardPIN(
            final String userToken,
            final String destinationToken,
            final RetrieveCardPin body) throws ApiException, IOException;

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
    CompletableFuture<PrepaidCardPinResult> retrieveCardPINAsync(
            final String userToken,
            final String destinationToken,
            final RetrieveCardPin body);

}
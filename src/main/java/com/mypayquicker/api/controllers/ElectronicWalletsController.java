/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Countries;
import com.mypayquicker.api.models.CreateOrUpdateElectronicWallet;
import com.mypayquicker.api.models.Currencies;
import com.mypayquicker.api.models.ElectronicWalletListResult;
import com.mypayquicker.api.models.ElectronicWalletRequirementListResult;
import com.mypayquicker.api.models.ElectronicWalletResult;
import com.mypayquicker.api.models.ElectronicWalletTypes;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OperationResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ElectronicWalletsController {
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
    ElectronicWalletListResult listElectronicWallets(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<ElectronicWalletListResult> listElectronicWalletsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a new [electronic wallet](page:resources/electronic-wallets) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the ElectronicWalletResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ElectronicWalletResult createElectronicWallet(
            final String userToken,
            final CreateOrUpdateElectronicWallet body) throws ApiException, IOException;

    /**
     * Create a new [electronic wallet](page:resources/electronic-wallets) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the ElectronicWalletResult response from the API call
     */
    CompletableFuture<ElectronicWalletResult> createElectronicWalletAsync(
            final String userToken,
            final CreateOrUpdateElectronicWallet body);

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
    ElectronicWalletRequirementListResult retrieveCreationRequirements(
            final String userToken,
            final ElectronicWalletTypes electronicWalletType,
            final Countries country,
            final Currencies currency) throws ApiException, IOException;

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
    CompletableFuture<ElectronicWalletRequirementListResult> retrieveCreationRequirementsAsync(
            final String userToken,
            final ElectronicWalletTypes electronicWalletType,
            final Countries country,
            final Currencies currency);

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
    ElectronicWalletResult retrieveElectronicWallet(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<ElectronicWalletResult> retrieveElectronicWalletAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    ElectronicWalletResult updateElectronicWallet(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateElectronicWallet body) throws ApiException, IOException;

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
    CompletableFuture<ElectronicWalletResult> updateElectronicWalletAsync(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateElectronicWallet body);

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
    OperationResult deleteElectronicWallet(
            final String userToken,
            final String destinationToken) throws ApiException, IOException;

    /**
     * Delete a user [electronic wallet](page:resources/electronic-wallets).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     */
    CompletableFuture<OperationResult> deleteElectronicWalletAsync(
            final String userToken,
            final String destinationToken);

}
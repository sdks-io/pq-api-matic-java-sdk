/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.BankAccountListResult;
import com.mypayquicker.api.models.BankAccountRequirementListResult;
import com.mypayquicker.api.models.BankAccountResult;
import com.mypayquicker.api.models.Countries;
import com.mypayquicker.api.models.CreateOrUpdateBankAccount;
import com.mypayquicker.api.models.Currencies;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OperationResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface BankAccountsController {
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
    BankAccountListResult listBankAccounts(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<BankAccountListResult> listBankAccountsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a [bank account](page:resources/bank-accounts) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    BankAccountResult createBankAccount(
            final String userToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException;

    /**
     * Create a [bank account](page:resources/bank-accounts) using a user token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     */
    CompletableFuture<BankAccountResult> createBankAccountAsync(
            final String userToken,
            final CreateOrUpdateBankAccount body);

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
    BankAccountResult retrieveBankAccount(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<BankAccountResult> retrieveBankAccountAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    BankAccountResult updateBankAccount(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException;

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
    CompletableFuture<BankAccountResult> updateBankAccountAsync(
            final String userToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body);

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
    OperationResult deleteBankAccount(
            final String userToken,
            final String destinationToken) throws ApiException, IOException;

    /**
     * Delete a user [bank account](page:resources/bank-accounts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     */
    CompletableFuture<OperationResult> deleteBankAccountAsync(
            final String userToken,
            final String destinationToken);

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
    BankAccountRequirementListResult retrieveCreationRequirements(
            final String userToken,
            final Countries country,
            final Currencies currency) throws ApiException, IOException;

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     */
    CompletableFuture<BankAccountRequirementListResult> retrieveCreationRequirementsAsync(
            final String userToken,
            final Countries country,
            final Currencies currency);

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
    BankAccountListResult listCompanyBankAccounts(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<BankAccountListResult> listCompanyBankAccountsAsync(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Create a company [bank account](page:resources/bank-accounts) using an account token.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    BankAccountResult createCompanyBankAccount(
            final String accountToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException;

    /**
     * Create a company [bank account](page:resources/bank-accounts) using an account token.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  body  Optional parameter:
     * @return    Returns the BankAccountResult response from the API call
     */
    CompletableFuture<BankAccountResult> createCompanyBankAccountAsync(
            final String accountToken,
            final CreateOrUpdateBankAccount body);

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
    BankAccountResult retrieveCompanyBankAccount(
            final String accountToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<BankAccountResult> retrieveCompanyBankAccountAsync(
            final String accountToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    BankAccountResult updateCompanyBankAccount(
            final String accountToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body) throws ApiException, IOException;

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
    CompletableFuture<BankAccountResult> updateCompanyBankAccountAsync(
            final String accountToken,
            final String destinationToken,
            final CreateOrUpdateBankAccount body);

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
    OperationResult deleteCompanyBankAccount(
            final String accountToken,
            final String destinationToken) throws ApiException, IOException;

    /**
     * Delete a company [bank account](page:resources/bank-accounts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  destinationToken  Required parameter: Auto-generated unique identifier representing a
     *         transfer destination, including prepaid cards, bank accounts, paper checks, and other
     *         users, prefixed with `dest-`.
     * @return    Returns the OperationResult response from the API call
     */
    CompletableFuture<OperationResult> deleteCompanyBankAccountAsync(
            final String accountToken,
            final String destinationToken);

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
    BankAccountRequirementListResult retrieveCompanyBankAccountCreationRequirements(
            final String accountToken,
            final Countries country,
            final Currencies currency) throws ApiException, IOException;

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided.
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  country  Optional parameter: Filter results by country.
     * @param  currency  Optional parameter: Filter results by currency.
     * @return    Returns the BankAccountRequirementListResult response from the API call
     */
    CompletableFuture<BankAccountRequirementListResult> retrieveCompanyBankAccountCreationRequirementsAsync(
            final String accountToken,
            final Countries country,
            final Currencies currency);

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
    BankAccountRequirementListResult retrieveBankAccountCreationRequirementsForAPrepaidCard(
            final String userToken,
            final String destinationToken,
            final Countries country,
            final Currencies currency) throws ApiException, IOException;

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
    CompletableFuture<BankAccountRequirementListResult> retrieveBankAccountCreationRequirementsForAPrepaidCardAsync(
            final String userToken,
            final String destinationToken,
            final Countries country,
            final Currencies currency);

}
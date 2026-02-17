/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.ReceiptListResult;
import com.mypayquicker.api.models.ReceiptResult;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ReceiptsController {
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
    ReceiptListResult listAccountReceipts(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<ReceiptListResult> listAccountReceiptsAsync(
            final String accountToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    ReceiptResult retrieveAccountReceipt(
            final String accountToken,
            final String receiptToken) throws ApiException, IOException;

    /**
     * Retrieve a single account [receipt](page:resources/receipts).
     * @param  accountToken  Required parameter: Auto-generated unique identifier representing a
     *         company account, prefixed with `acct-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     */
    CompletableFuture<ReceiptResult> retrieveAccountReceiptAsync(
            final String accountToken,
            final String receiptToken);

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
    ReceiptListResult listPrepaidCardReceipts(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<ReceiptListResult> listPrepaidCardReceiptsAsync(
            final String userToken,
            final String destinationToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    ReceiptResult retrievePrepaidCardReceipt(
            final String userToken,
            final String destinationToken,
            final String receiptToken) throws ApiException, IOException;

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
    CompletableFuture<ReceiptResult> retrievePrepaidCardReceiptAsync(
            final String userToken,
            final String destinationToken,
            final String receiptToken);

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
    ReceiptListResult listUserReceipts(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

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
    CompletableFuture<ReceiptListResult> listUserReceiptsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

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
    ReceiptResult retrieveUserReceipt(
            final String userToken,
            final String receiptToken) throws ApiException, IOException;

    /**
     * Retrieve a single user [receipt](page:resources/receipts).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  receiptToken  Required parameter: Auto-generated unique identifier representing a
     *         receipt, prefixed with `rcpt-`.
     * @return    Returns the ReceiptResult response from the API call
     */
    CompletableFuture<ReceiptResult> retrieveUserReceiptAsync(
            final String userToken,
            final String receiptToken);

}
/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateOrUpdateDocumentFields;
import com.mypayquicker.api.models.DocumentListResult;
import com.mypayquicker.api.models.DocumentRequirementsListResult;
import com.mypayquicker.api.models.DocumentResult;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.utilities.FileWrapper;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface DocumentsController {
    /**
     * Retrieve a list of user [documents](page:resources/documents) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the DocumentListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DocumentListResult listDocuments(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Retrieve a list of user [documents](page:resources/documents) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the DocumentListResult response from the API call
     */
    CompletableFuture<DocumentListResult> listDocumentsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

    /**
     * Upload a user [document](page:resources/documents).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  fields  Optional parameter:
     * @param  upload  Optional parameter: Document to be uploaded
     * @return    Returns the DocumentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DocumentResult uploadDocument(
            final String userToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) throws ApiException, IOException;

    /**
     * Upload a user [document](page:resources/documents).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  fields  Optional parameter:
     * @param  upload  Optional parameter: Document to be uploaded
     * @return    Returns the DocumentResult response from the API call
     */
    CompletableFuture<DocumentResult> uploadDocumentAsync(
            final String userToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload);

    /**
     * Retrieve a single user [document](page:resources/documents) by its document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the DocumentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DocumentResult retrieveDocument(
            final String userToken,
            final String documentToken) throws ApiException, IOException;

    /**
     * Retrieve a single user [document](page:resources/documents) by its document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the DocumentResult response from the API call
     */
    CompletableFuture<DocumentResult> retrieveDocumentAsync(
            final String userToken,
            final String documentToken);

    /**
     * Replace the user [documents](page:resources/documents) at the given document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @param  fields  Optional parameter:
     * @param  upload  Optional parameter: Document to be uploaded
     * @return    Returns the DocumentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DocumentResult replaceDocument(
            final String userToken,
            final String documentToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) throws ApiException, IOException;

    /**
     * Replace the user [documents](page:resources/documents) at the given document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @param  fields  Optional parameter:
     * @param  upload  Optional parameter: Document to be uploaded
     * @return    Returns the DocumentResult response from the API call
     */
    CompletableFuture<DocumentResult> replaceDocumentAsync(
            final String userToken,
            final String documentToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload);

    /**
     * Returns a list of user documents that the user can provide.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the DocumentRequirementsListResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    DocumentRequirementsListResult listUserDocumentRequirements(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException;

    /**
     * Returns a list of user documents that the user can provide.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  page  Required parameter: Page number of specific page to return
     * @param  pageSize  Required parameter: Number of items to be displayed per page
     * @param  filter  Optional parameter: Filter request results by specific criteria.
     * @param  sort  Optional parameter: Sort request results by specific attribute.
     * @param  language  Optional parameter: Filter results by language type.
     * @return    Returns the DocumentRequirementsListResult response from the API call
     */
    CompletableFuture<DocumentRequirementsListResult> listUserDocumentRequirementsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language);

}
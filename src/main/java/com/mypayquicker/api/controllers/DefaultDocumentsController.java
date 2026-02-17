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
import com.mypayquicker.api.models.CreateOrUpdateDocumentFields;
import com.mypayquicker.api.models.DocumentListResult;
import com.mypayquicker.api.models.DocumentRequirementsListResult;
import com.mypayquicker.api.models.DocumentResult;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.utilities.FileWrapper;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.MutliPartRequestType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultDocumentsController extends BaseController implements DocumentsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultDocumentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

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
    public DocumentListResult listDocuments(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListDocumentsRequest(userToken, page, pageSize, filter, sort,
                language).execute();
    }

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
    public CompletableFuture<DocumentListResult> listDocumentsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListDocumentsRequest(userToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listDocuments.
     */
    private ApiCall<DocumentListResult, ApiException> prepareListDocumentsRequest(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<DocumentListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/documents")
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
                                response -> ApiHelper.deserialize(response, DocumentListResult.class))
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
     * Upload a user [document](page:resources/documents).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  fields  Optional parameter:
     * @param  upload  Optional parameter: Document to be uploaded
     * @return    Returns the DocumentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DocumentResult uploadDocument(
            final String userToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) throws ApiException, IOException {
        return prepareUploadDocumentRequest(userToken, fields, upload).execute();
    }

    /**
     * Upload a user [document](page:resources/documents).
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  fields  Optional parameter:
     * @param  upload  Optional parameter: Document to be uploaded
     * @return    Returns the DocumentResult response from the API call
     */
    public CompletableFuture<DocumentResult> uploadDocumentAsync(
            final String userToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) {
        try {
            return prepareUploadDocumentRequest(userToken, fields, upload).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for uploadDocument.
     */
    private ApiCall<DocumentResult, ApiException> prepareUploadDocumentRequest(
            final String userToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) {
        return new ApiCall.Builder<DocumentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/documents")
                        .formParam(param -> param.key("fields")
                                .value(fields)
                                .multipartSerializer(() -> 
                                        ApiHelper.serialize(fields))
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART)
                                .multipartHeaders("Content-Type", "application/json"))
                        .formParam(param -> param.key("upload")
                                .value(upload)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("Content-Type", "image/png")
                                .multipartHeaders("Content-Type", "image/jpeg")
                                .multipartHeaders("Content-Type", "application/pdf"))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, DocumentResult.class))
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
     * Retrieve a single user [document](page:resources/documents) by its document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the DocumentResult response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DocumentResult retrieveDocument(
            final String userToken,
            final String documentToken) throws ApiException, IOException {
        return prepareRetrieveDocumentRequest(userToken, documentToken).execute();
    }

    /**
     * Retrieve a single user [document](page:resources/documents) by its document token.
     * @param  userToken  Required parameter: Auto-generated unique identifier representing a user,
     *         prefixed with `user-`.
     * @param  documentToken  Required parameter: Auto-generated unique identifier representing an
     *         uploaded document, prefixed with `docu-`.
     * @return    Returns the DocumentResult response from the API call
     */
    public CompletableFuture<DocumentResult> retrieveDocumentAsync(
            final String userToken,
            final String documentToken) {
        try {
            return prepareRetrieveDocumentRequest(userToken, documentToken).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for retrieveDocument.
     */
    private ApiCall<DocumentResult, ApiException> prepareRetrieveDocumentRequest(
            final String userToken,
            final String documentToken) {
        return new ApiCall.Builder<DocumentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/documents/{document-token}")
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("document-token").value(documentToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, DocumentResult.class))
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
    public DocumentResult replaceDocument(
            final String userToken,
            final String documentToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) throws ApiException, IOException {
        return prepareReplaceDocumentRequest(userToken, documentToken, fields, upload).execute();
    }

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
    public CompletableFuture<DocumentResult> replaceDocumentAsync(
            final String userToken,
            final String documentToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) {
        try {
            return prepareReplaceDocumentRequest(userToken, documentToken, fields, upload).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for replaceDocument.
     */
    private ApiCall<DocumentResult, ApiException> prepareReplaceDocumentRequest(
            final String userToken,
            final String documentToken,
            final CreateOrUpdateDocumentFields fields,
            final FileWrapper upload) {
        return new ApiCall.Builder<DocumentResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/documents/{document-token}")
                        .formParam(param -> param.key("fields")
                                .value(fields)
                                .multipartSerializer(() -> 
                                        ApiHelper.serialize(fields))
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART)
                                .multipartHeaders("Content-Type", "application/json"))
                        .formParam(param -> param.key("upload")
                                .value(upload)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("Content-Type", "image/png")
                                .multipartHeaders("Content-Type", "image/jpeg")
                                .multipartHeaders("Content-Type", "application/pdf"))
                        .templateParam(param -> param.key("user-token").value(userToken)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("document-token").value(documentToken)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("server"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, DocumentResult.class))
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
    public DocumentRequirementsListResult listUserDocumentRequirements(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) throws ApiException, IOException {
        return prepareListUserDocumentRequirementsRequest(userToken, page, pageSize, filter, sort,
                language).execute();
    }

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
    public CompletableFuture<DocumentRequirementsListResult> listUserDocumentRequirementsAsync(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        try {
            return prepareListUserDocumentRequirementsRequest(userToken, page, pageSize, filter, sort,
            language).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listUserDocumentRequirements.
     */
    private ApiCall<DocumentRequirementsListResult, ApiException> prepareListUserDocumentRequirementsRequest(
            final String userToken,
            final int page,
            final int pageSize,
            final String filter,
            final String sort,
            final Languages language) {
        return new ApiCall.Builder<DocumentRequirementsListResult, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.API.value())
                        .path("/users/{user-token}/documents/requirements")
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
                                response -> ApiHelper.deserialize(response, DocumentRequirementsListResult.class))
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
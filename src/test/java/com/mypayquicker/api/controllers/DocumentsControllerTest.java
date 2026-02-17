/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mypayquicker.api.ApiHelper;
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateOrUpdateDocumentFields;
import com.mypayquicker.api.models.DocumentListResult;
import com.mypayquicker.api.models.DocumentResult;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.utilities.FileWrapper;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DocumentsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static DocumentsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getDocumentsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of user [documents](page:resources/documents) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListDocuments() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        DocumentListResult result = null;
        try {
            result = controller.listDocuments(userToken, page, pageSize, filter, sort, language);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"payload\":[{\"createDate\":\"2022-05-04T18:59:38Z\",\"fields\":[{\"key\":\"TYPE"
                + "\",\"value\":\"DRIVERS_LICENSE\"},{\"key\":\"STATUS\",\"value\":\"PROVIDED\"},{"
                + "\"key\":\"EXPIRATION_DATE\",\"value\":\"10-31-2021\"}],\"filename\":\"List.jpg"
                + "\",\"mimeType\":\"image/jpeg\",\"token\":\"docu-2053aaad-c1a5-45e2-a2da-f71287f3"
                + "2800\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/use"
                + "r-2bbfc967-d12e-4647-a887-d905172fb4bc/documents/docu-2053aaad-c1a5-45e2-a2da-f7"
                + "1287f32800\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1\",\"page"
                + "Size\":\"2\",\"pageCount\":\"0\",\"recordCount\":\"0\",\"timezone\":\"GMT\",\"re"
                + "questRef\":\"request-reference-value\"},\"links\":[{\"href\":\"https://api.sandb"
                + "ox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/document"
                + "s?page=1&pageSize=2\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Upload a user [document](page:resources/documents). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUploadDocument() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateDocumentFields fields = ApiHelper.deserialize(
                "{\r\n  \"fields\": [\r\n    {\r\n      \"key\": \"EXPIRATION_DATE\",\r\n      \"va"
                + "lue\": \"string\"\r\n    }\r\n  ]\r\n}",
                CreateOrUpdateDocumentFields.class);
        FileWrapper upload = null;

        // Set callback and perform API call
        DocumentResult result = null;
        try {
            result = controller.uploadDocument(userToken, fields, upload);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"createDate\":\"2022-05-04T18:59:38Z\",\"fields\":[{\"key\":\"EXPIRATION_DATE\","
                + "\"value\":\"10-31-2021\"},{\"key\":\"TYPE\",\"value\":\"DRIVERS_LICENSE\"},{\"ke"
                + "y\":\"STATUS\",\"value\":\"PROVIDED\"}],\"token\":\"docu-2053aaad-c1a5-45e2-a2da"
                + "-f71287f32800\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/documents/docu-2053aaad-c1a5-45e"
                + "2-a2da-f71287f32800\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"G"
                + "MT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Upload a user [document](page:resources/documents). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUploadDocument1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateDocumentFields fields = ApiHelper.deserialize(
                "{\r\n  \"fields\": [\r\n    {\r\n      \"key\": \"EXPIRATION_DATE\",\r\n      \"va"
                + "lue\": \"string\"\r\n    }\r\n  ]\r\n}",
                CreateOrUpdateDocumentFields.class);
        FileWrapper upload = null;

        // Set callback and perform API call
        DocumentResult result = null;
        try {
            result = controller.uploadDocument(userToken, fields, upload);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"createDate\":\"2022-05-04T18:59:38Z\",\"fields\":[{\"key\":\"EXPIRATION_DATE\","
                + "\"value\":\"10-31-2021\"},{\"key\":\"TYPE\",\"value\":\"DRIVERS_LICENSE\"},{\"ke"
                + "y\":\"STATUS\",\"value\":\"PROVIDED\"}],\"token\":\"docu-2053aaad-c1a5-45e2-a2da"
                + "-f71287f32800\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/documents/docu-2053aaad-c1a5-45e"
                + "2-a2da-f71287f32800\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"G"
                + "MT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single user [document](page:resources/documents) by its document token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveDocument() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String documentToken = 
                "docu-6e582242-5dd4-4883-b0c2-488e09a26595";

        // Set callback and perform API call
        DocumentResult result = null;
        try {
            result = controller.retrieveDocument(userToken, documentToken);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"createDate\":\"2022-05-04T18:59:38Z\",\"fields\":[{\"key\":\"EXPIRATION_DATE\","
                + "\"value\":\"10-31-2021\"},{\"key\":\"TYPE\",\"value\":\"DRIVERS_LICENSE\"},{\"ke"
                + "y\":\"STATUS\",\"value\":\"PROVIDED\"}],\"token\":\"docu-2053aaad-c1a5-45e2-a2da"
                + "-f71287f32800\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/documents/docu-2053aaad-c1a5-45e"
                + "2-a2da-f71287f32800\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"G"
                + "MT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Replace the user [documents](page:resources/documents) at the given document token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestReplaceDocument() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String documentToken = 
                "docu-6e582242-5dd4-4883-b0c2-488e09a26595";
        CreateOrUpdateDocumentFields fields = ApiHelper.deserialize(
                "{\r\n  \"fields\": [\r\n    {\r\n      \"key\": \"EXPIRATION_DATE\",\r\n      \"va"
                + "lue\": \"string\"\r\n    }\r\n  ]\r\n}",
                CreateOrUpdateDocumentFields.class);
        FileWrapper upload = null;

        // Set callback and perform API call
        DocumentResult result = null;
        try {
            result = controller.replaceDocument(userToken, documentToken, fields, upload);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"createDate\":\"2022-05-04T18:59:38Z\",\"fields\":[{\"key\":\"EXPIRATION_DATE\","
                + "\"value\":\"10-31-2021\"},{\"key\":\"TYPE\",\"value\":\"DRIVERS_LICENSE\"},{\"ke"
                + "y\":\"STATUS\",\"value\":\"PROVIDED\"}],\"token\":\"docu-2053aaad-c1a5-45e2-a2da"
                + "-f71287f32800\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/documents/docu-2053aaad-c1a5-45e"
                + "2-a2da-f71287f32800\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"G"
                + "MT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

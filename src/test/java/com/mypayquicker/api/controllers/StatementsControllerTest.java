/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.StatementListResult;
import com.mypayquicker.api.models.StatementResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StatementsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static StatementsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getStatementsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * List Prepaid Card Statements for specific user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPrepaidCardStatements() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        StatementListResult result = null;
        try {
            result = controller.listPrepaidCardStatements(userToken, destinationToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48\",\"userToken"
                + "\":\"user-02e4d25a-af16-4e74-8b8d-6fa45b78af72\",\"prepaidCardToken\":\"dest-0ae"
                + "ed588-494c-444a-8c76-d5df54bdc435\",\"from\":\"2021-10-18T00:00:00Z\",\"to\":\"2"
                + "021-11-17T00:00:00Z\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/a"
                + "pi/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed58"
                + "8-494c-444a-8c76-d5df54bdc435/statements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b"
                + "48\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"docu-b4879d40-372f-4dc5-ac85-"
                + "c83b662a240e\",\"userToken\":\"user-02e4d25a-af16-4e74-8b8d-6fa45b78af72\",\"pre"
                + "paidCardToken\":\"dest-0aeed588-494c-444a-8c76-d5df54bdc435\",\"from\":\"2021-11"
                + "-18T00:00:00Z\",\"to\":\"2021-12-17T00:00:00Z\",\"links\":[{\"href\":\"https://a"
                + "pi.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/"
                + "prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-b4879d40"
                + "-372f-4dc5-ac85-c83b662a240e\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pag"
                + "eNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0\",\"recordCount\":\"0\",\"tim"
                + "ezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01"
                + "-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements"
                + "\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single prepaid card agreement.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrievePrepaidCardStatement() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        String documentToken = 
                "docu-6e582242-5dd4-4883-b0c2-488e09a26595";

        // Set callback and perform API call
        StatementResult result = null;
        try {
            result = controller.retrievePrepaidCardStatement(userToken, destinationToken, documentToken);
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
                "{\"fileContents\":\"JVBERi0xLj........QKg2MjcKJSVFT0YK\",\"filename\":\"Statement-"
                + "9506c668-11-17-2021.pdf\",\"mimeType\":\"application/pdf\",\"token\":\"docu-17a0"
                + "da7e-dd4a-44ab-9bc5-73554d9c4b48\",\"userToken\":\"user-02e4d25a-af16-4e74-8b8d-"
                + "6fa45b78af72\",\"prepaidCardToken\":\"dest-0aeed588-494c-444a-8c76-d5df54bdc435"
                + "\",\"from\":\"2021-10-18T00:00:00Z\",\"to\":\"2021-11-17T00:00:00Z\",\"links\":["
                + "{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e"
                + "56-bdf5-c0189ac420a1/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/sta"
                + "tements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48\",\"params\":{\"rel\":\"self"
                + "\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}"
                + "}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Returns all statements for the specified user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListStatements() throws Exception {
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
        StatementListResult result = null;
        try {
            result = controller.listStatements(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48\",\"userToken"
                + "\":\"user-02e4d25a-af16-4e74-8b8d-6fa45b78af72\",\"prepaidCardToken\":\"dest-0ae"
                + "ed588-494c-444a-8c76-d5df54bdc435\",\"from\":\"2021-10-18T00:00:00Z\",\"to\":\"2"
                + "021-11-17T00:00:00Z\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/a"
                + "pi/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/prepaid-cards/dest-0aeed58"
                + "8-494c-444a-8c76-d5df54bdc435/statements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b"
                + "48\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"docu-b4879d40-372f-4dc5-ac85-"
                + "c83b662a240e\",\"userToken\":\"user-02e4d25a-af16-4e74-8b8d-6fa45b78af72\",\"pre"
                + "paidCardToken\":\"dest-0aeed588-494c-444a-8c76-d5df54bdc435\",\"from\":\"2021-11"
                + "-18T00:00:00Z\",\"to\":\"2021-12-17T00:00:00Z\",\"links\":[{\"href\":\"https://a"
                + "pi.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01-3063c9dec97d/"
                + "prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements/docu-b4879d40"
                + "-372f-4dc5-ac85-c83b662a240e\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pag"
                + "eNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0\",\"recordCount\":\"0\",\"tim"
                + "ezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/users/user-631b200f-665d-4dbe-bd01"
                + "-3063c9dec97d/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/statements"
                + "\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Return a specific statement.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveStatement() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String documentToken = 
                "docu-6e582242-5dd4-4883-b0c2-488e09a26595";

        // Set callback and perform API call
        StatementResult result = null;
        try {
            result = controller.retrieveStatement(userToken, documentToken);
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
                "{\"fileContents\":\"JVBERi0xLj........QKg2MjcKJSVFT0YK\",\"filename\":\"Statement-"
                + "9506c668-11-17-2021.pdf\",\"mimeType\":\"application/pdf\",\"token\":\"docu-17a0"
                + "da7e-dd4a-44ab-9bc5-73554d9c4b48\",\"userToken\":\"user-02e4d25a-af16-4e74-8b8d-"
                + "6fa45b78af72\",\"prepaidCardToken\":\"dest-0aeed588-494c-444a-8c76-d5df54bdc435"
                + "\",\"from\":\"2021-10-18T00:00:00Z\",\"to\":\"2021-11-17T00:00:00Z\",\"links\":["
                + "{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e"
                + "56-bdf5-c0189ac420a1/prepaid-cards/dest-0aeed588-494c-444a-8c76-d5df54bdc435/sta"
                + "tements/docu-17a0da7e-dd4a-44ab-9bc5-73554d9c4b48\",\"params\":{\"rel\":\"self"
                + "\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}"
                + "}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

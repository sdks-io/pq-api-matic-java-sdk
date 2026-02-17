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
import com.mypayquicker.api.models.IdvCheckListResult;
import com.mypayquicker.api.models.IdvCheckResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComplianceControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ComplianceController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getComplianceController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [IDV checks](page:resources/user#list-user-idv-checks) by user token that
     * supports filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListIdentityChecks() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        IdvCheckListResult result = null;
        try {
            result = controller.listIdentityChecks(userToken);
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
                "{\"payload\":[{\"idvProviderReference\":\"yPV0h4o1Yw3QzdLAvA7a\",\"idvResult\":\"P"
                + "ASS\",\"idvSubResult\":\"HARD\",\"idvProvider\":\"HOOYU\",\"createdOn\":\"2020-0"
                + "2-21T22:00:00Z\",\"raw\":\"<RAW IDV processor output, for informational /debuggi"
                + "ng purposes only>\",\"idvCheckType\":\"NON_DOCUMENTARY\",\"idvDisposition\":\"FI"
                + "NAL\",\"token\":\"idvc-7e7567e0-c2db-485d-896d-45901a10baa9\",\"userToken\":\"us"
                + "er-f012bc86-4d42-415b-a8b2-be5e0b90e59a\",\"links\":[{\"params\":{\"rel\":\"self"
                + "\"},\"href\":\"https://api.payquicker.io/api/v2/users/user-f012bc86-4d42-415b-a8"
                + "b2-be5e0b90e59a/idv-checks/idvc-7e7567e0-c2db-485d-896d-45901a10baa9\"}]}],\"lin"
                + "ks\":[{\"params\":{\"rel\":\"self\"},\"href\":\"https://api.payquicker.io/api/v2"
                + "/users/user-f012bc86-4d42-415b-a8b2-be5e0b90e59a/idv-checks\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of [IDV checks](page:resources/user#retrieve-user-idv-check) by IDVC token
     * that supports filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveIdentityCheck() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String idvcToken = 
                "idvc-7e7567e0-c2db-485d-896d-45901a10baa9";

        // Set callback and perform API call
        IdvCheckResult result = null;
        try {
            result = controller.retrieveIdentityCheck(userToken, idvcToken);
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
                "{\"createdOn\":\"2022-04-20T17:34:50Z\",\"idvCheckType\":\"PII\",\"idvDispostion"
                + "\":\"UNDEFINED\",\"idvProvider\":\"FISIDOLOGY\",\"idvResult\":\"PASS\",\"idvSubR"
                + "esult\":\"HARD\",\"token\":\"idvc-5a04bacf-f99c-4962-8c02-d8e744c625d6\",\"userT"
                + "oken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/idv-checks/idvc-5a04bacf-f99c-4962-8c02-d8e744c625d6\",\"params\":{\"rel\":"
                + "\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-va"
                + "lue\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

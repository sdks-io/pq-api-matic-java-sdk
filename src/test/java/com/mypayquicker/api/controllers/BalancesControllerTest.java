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
import com.mypayquicker.api.models.BalanceListResult;
import com.mypayquicker.api.models.BalanceResult;
import com.mypayquicker.api.models.Languages;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalancesControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static BalancesController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getBalancesController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of bank account [balances](page:resources/balances) that supports filtering,
     * sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAccountBalances() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        BalanceListResult result = null;
        try {
            result = controller.listAccountBalances(accountToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"amount\":0,\"currency\":\"USD\",\"formattedAmount\":\"$0.00 USD"
                + "\",\"token\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"links\":[{\"href\":"
                + "\"https://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80"
                + "-a63a7b147860/balances\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":"
                + "\"1\",\"pageSize\":\"20\",\"pageCount\":\"0\",\"recordCount\":\"0\",\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href\":\"ht"
                + "tps://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80-a63"
                + "a7b147860/balances?page=1&pageSize=20&language=en-US\",\"params\":{\"rel\":\"sel"
                + "f\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of user [balances](page:resources/balances) that supports filtering, sorting,
     * and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListUserBalances() throws Exception {
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
        BalanceListResult result = null;
        try {
            result = controller.listUserBalances(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"amount\":0,\"currency\":\"USD\",\"formattedAmount\":\"$0.00 USD"
                + "\",\"token\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"links\":[{\"href\":"
                + "\"https://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80"
                + "-a63a7b147860/balances\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":"
                + "\"1\",\"pageSize\":\"20\",\"pageCount\":\"0\",\"recordCount\":\"0\",\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href\":\"ht"
                + "tps://api.sandbox.payquicker.io/api/v2/accounts/acct-3908ab5a-6ce1-474d-8b80-a63"
                + "a7b147860/balances?page=1&pageSize=20&language=en-US\",\"params\":{\"rel\":\"sel"
                + "f\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a [prepaid card](page:resources/prepaid-cards) [balances](page:resources/balances)
     * by destination token that supports filtering, sorting, and pagination through existing
     * mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCardBalance() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        BalanceResult result = null;
        try {
            result = controller.retrieveCardBalance(userToken, destinationToken, language);
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
                "{\"amount\":0,\"currency\":\"USD\",\"formattedAmount\":\"$0.00 USD\",\"token\":\"d"
                + "est-2de9ddbf-2631-4c94-a699-90917f113b24\",\"links\":[{\"href\":\"https://api.sa"
                + "ndbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepa"
                + "id-cards/dest-2de9ddbf-2631-4c94-a699-90917f113b24/balances\",\"params\":{\"rel"
                + "\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference"
                + "-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

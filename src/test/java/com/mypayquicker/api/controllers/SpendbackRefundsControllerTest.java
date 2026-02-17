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
import com.mypayquicker.api.models.CreateSpendbackRefundQuote;
import com.mypayquicker.api.models.Languages;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpendbackRefundsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SpendbackRefundsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSpendbackRefundsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [spendbacks](page:resources/spendbacks) refunds that supports filtering,
     * sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListSpendbackRefunds() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        try {
            controller.listSpendbackRefunds(spendbackToken, page, pageSize, filter, sort, language);
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

    }

    /**
     * Perform a [spendback](page:resources/spendbacks) refund for a partial amount. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateSpendbackRefundQuote() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
        CreateSpendbackRefundQuote body = ApiHelper.deserialize(
                "{\"amount\":1.13}",
                CreateSpendbackRefundQuote.class);

        // Set callback and perform API call
        try {
            controller.createSpendbackRefundQuote(spendbackToken, body);
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

    }

    /**
     * Cancel an spendback refund quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelSpendbackRefundQuote() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
        String refundToken = 
                "rfnd-c39437e1-dc80-4293-8211-c14b5a32f762";

        // Set callback and perform API call
        try {
            controller.cancelSpendbackRefundQuote(spendbackToken, refundToken);
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

    }

    /**
     * Retrieve a single spendback refund using the rfnd token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveSpendbackRefund() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
        String refundToken = 
                "rfnd-c39437e1-dc80-4293-8211-c14b5a32f762";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        try {
            controller.retrieveSpendbackRefund(spendbackToken, refundToken, page, pageSize, filter, sort, language);
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

    }

    /**
     * Accept a spendback return quote.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptSpendbackRefundQuote() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";
        String refundToken = 
                "rfnd-c39437e1-dc80-4293-8211-c14b5a32f762";

        // Set callback and perform API call
        try {
            controller.acceptSpendbackRefundQuote(spendbackToken, refundToken);
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

    }

}

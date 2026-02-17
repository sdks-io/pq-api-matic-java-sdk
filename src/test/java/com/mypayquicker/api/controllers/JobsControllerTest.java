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
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.containers.PaymentJob;
import com.mypayquicker.api.utilities.JsonValue;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JobsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static JobsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getJobsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [jobs](page:resources/jobs) that supports filtering, sorting, and
     * pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPaymentJobs() throws Exception {
        // Parameters for the API call
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
            controller.listPaymentJobs(page, pageSize, filter, sort, language);
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
     * Create a [payment](page:resources/jobs). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreatePaymentJob() throws Exception {
        // Parameters for the API call
        PaymentJob body = null;

        // Set callback and perform API call
        try {
            controller.createPaymentJob(body);
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
     * Create a [payment](page:resources/jobs). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreatePaymentJob1() throws Exception {
        // Parameters for the API call
        PaymentJob body = null;

        // Set callback and perform API call
        try {
            controller.createPaymentJob(body);
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
     * Retrieve a single payment [job](page:resources/jobs). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrievePaymentJob() throws Exception {
        // Parameters for the API call
        String jobToken = 
                "jobs-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String filter = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        try {
            controller.retrievePaymentJob(jobToken, filter, language);
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
     * Cancel an submitted payment [job](page:resources/jobs). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelPaymentJob() throws Exception {
        // Parameters for the API call
        String jobToken = 
                "jobs-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        try {
            controller.cancelPaymentJob(jobToken);
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

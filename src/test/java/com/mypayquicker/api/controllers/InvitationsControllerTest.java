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
import com.mypayquicker.api.models.CreateInvitation;
import com.mypayquicker.api.models.Languages;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvitationsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static InvitationsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getInvitationsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [invitations](page:resources/invitations) that supports filtering,
     * sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListInvitations() throws Exception {
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
            controller.listInvitations(page, pageSize, filter, sort, language);
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
     * Create a [invitation](page:resources/invitations) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateInvitation() throws Exception {
        // Parameters for the API call
        CreateInvitation body = ApiHelper.deserialize(
                "{\"amount\":1500,\"currency\":\"USD\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b"
                + "80-a63a7b147860\",\"destinationToken\":\"dest-ae92315b-6190-4e56-bdf5-c0189ac420"
                + "a1\",\"note\":\"Payment 1 Note\",\"memo\":\"Payment 1 Memo\",\"purpose\":\"INCOM"
                + "E\",\"clientPaymentId\":\"929fcf00-5a4f-4613-bd78-ed8dc33797b9\",\"autoAcceptQuo"
                + "te\":false,\"notBefore\":\"2022-04-26T15:16:18Z\",\"notAfter\":\"2022-04-26T15:1"
                + "9:20Z\"}",
                CreateInvitation.class);

        // Set callback and perform API call
        try {
            controller.createInvitation(body);
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
     * Create a [invitation](page:resources/invitations) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateInvitation1() throws Exception {
        // Parameters for the API call
        CreateInvitation body = ApiHelper.deserialize(
                "{\"amount\":1500,\"currency\":\"USD\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b"
                + "80-a63a7b147860\",\"destinationToken\":\"dest-ae92315b-6190-4e56-bdf5-c0189ac420"
                + "a1\",\"note\":\"Payment 1 Note\",\"memo\":\"Payment 1 Memo\",\"purpose\":\"INCOM"
                + "E\",\"clientPaymentId\":\"929fcf00-5a4f-4613-bd78-ed8dc33797b9\",\"autoAcceptQuo"
                + "te\":false,\"notBefore\":\"2022-04-26T15:16:18Z\",\"notAfter\":\"2022-04-26T15:1"
                + "9:20Z\"}",
                CreateInvitation.class);

        // Set callback and perform API call
        try {
            controller.createInvitation(body);
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
     * Retrieve a single [invitation](page:resources/invitations). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveInvitation() throws Exception {
        // Parameters for the API call
        String invitationToken = 
                "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String filter = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        try {
            controller.retrieveInvitation(invitationToken, filter, language);
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
     * Accept an open [invitation](page:resources/invitations) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateInvitation() throws Exception {
        // Parameters for the API call
        String invitationToken = 
                "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        try {
            controller.updateInvitation(invitationToken);
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
     * Accept an open [invitation](page:resources/invitations) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateInvitation1() throws Exception {
        // Parameters for the API call
        String invitationToken = 
                "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        try {
            controller.updateInvitation(invitationToken);
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
     * Cancel an open [invitation](page:resources/invitations) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelInvitation() throws Exception {
        // Parameters for the API call
        String invitationToken = 
                "invt-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        try {
            controller.cancelInvitation(invitationToken);
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

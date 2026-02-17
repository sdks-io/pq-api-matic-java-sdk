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
import com.mypayquicker.api.models.EventListResult;
import com.mypayquicker.api.models.UserEventResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EventsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static EventsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getEventsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [user events](page:resources/user#list-user-events) that supports
     * filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListEvents() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        EventListResult result = null;
        try {
            result = controller.listEvents(userToken);
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
                "{\"payload\":[{\"token\":\"evnt-4e2f6663-3e37-4bb8-b8f8-4ab1b02bd292\",\"canBeCanc"
                + "elled\":false,\"eventRequirementCategoryType\":\"CATEGORY_UNDEFINED\",\"eventReq"
                + "uirementType\":\"TYPE_UNDEFINED\",\"eventStatus\":\"UNDEFINED\",\"eventType\":"
                + "\"REQUIRED\",\"isComplete\":false,\"userAction\":\"NO_ACTION\",\"userImpact\":"
                + "\"NO_IMPACT\",\"event\":\"WALLET_REGISTRATION\",\"links\":[{\"href\":\"https://a"
                + "pi.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/"
                + "events/evnt-4e2f6663-3e37-4bb8-b8f8-4ab1b02bd292\",\"params\":{\"rel\":\"self\"}"
                + "}]},{\"token\":\"evnt-fe7c9063-0c86-400e-89e3-068c2f7e4f65\",\"canBeCancelled\":"
                + "false,\"eventRequirementCategoryType\":\"CATEGORY_UNDEFINED\",\"eventRequirement"
                + "Type\":\"TYPE_UNDEFINED\",\"eventStatus\":\"UNDEFINED\",\"eventType\":\"REQUIRED"
                + "\",\"isComplete\":false,\"userAction\":\"NO_ACTION\",\"userImpact\":\"NO_IMPACT"
                + "\",\"event\":\"WALLET_REGISTRATION\",\"links\":[{\"href\":\"https://api.sandbox."
                + "payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/events/evnt"
                + "-fe7c9063-0c86-400e-89e3-068c2f7e4f65\",\"params\":{\"rel\":\"self\"}}]}],\"meta"
                + "\":{\"pageNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0\",\"recordCount\":"
                + "\"0\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"links"
                + "\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-619"
                + "0-4e56-bdf5-c0189ac420a1/events\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of [user events](page:resources/user#list-user-events) that supports
     * filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListEvents1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        EventListResult result = null;
        try {
            result = controller.listEvents(userToken);
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
                "{\"payload\":[{\"token\":\"evnt-4e2f6663-3e37-4bb8-b8f8-4ab1b02bd292\",\"canBeCanc"
                + "elled\":false,\"eventRequirementCategoryType\":\"CATEGORY_UNDEFINED\",\"eventReq"
                + "uirementType\":\"TYPE_UNDEFINED\",\"eventStatus\":\"UNDEFINED\",\"eventType\":"
                + "\"REQUIRED\",\"isComplete\":false,\"userAction\":\"NO_ACTION\",\"userImpact\":"
                + "\"NO_IMPACT\",\"event\":\"WALLET_REGISTRATION\",\"links\":[{\"href\":\"https://a"
                + "pi.sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/"
                + "events/evnt-4e2f6663-3e37-4bb8-b8f8-4ab1b02bd292\",\"params\":{\"rel\":\"self\"}"
                + "}]},{\"token\":\"evnt-fe7c9063-0c86-400e-89e3-068c2f7e4f65\",\"canBeCancelled\":"
                + "false,\"eventRequirementCategoryType\":\"CATEGORY_UNDEFINED\",\"eventRequirement"
                + "Type\":\"TYPE_UNDEFINED\",\"eventStatus\":\"UNDEFINED\",\"eventType\":\"REQUIRED"
                + "\",\"isComplete\":false,\"userAction\":\"NO_ACTION\",\"userImpact\":\"NO_IMPACT"
                + "\",\"event\":\"WALLET_REGISTRATION\",\"links\":[{\"href\":\"https://api.sandbox."
                + "payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/events/evnt"
                + "-fe7c9063-0c86-400e-89e3-068c2f7e4f65\",\"params\":{\"rel\":\"self\"}}]}],\"meta"
                + "\":{\"pageNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0\",\"recordCount\":"
                + "\"0\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"links"
                + "\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-619"
                + "0-4e56-bdf5-c0189ac420a1/events\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [user event](page:resources/user#get-user-event). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveEvent() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String eventToken = 
                "evnt-28491de2-5b22-4e30-028a-45901a10baa9";

        // Set callback and perform API call
        UserEventResult result = null;
        try {
            result = controller.retrieveEvent(userToken, eventToken);
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
                "{\"token\":\"evnt-4e2f6663-3e37-4bb8-b8f8-4ab1b02bd292\",\"canBeCancelled\":false,"
                + "\"eventRequirementCategoryType\":\"CATEGORY_UNDEFINED\",\"eventRequirementType"
                + "\":\"TYPE_UNDEFINED\",\"eventStatus\":\"UNDEFINED\",\"eventType\":\"REQUIRED\","
                + "\"isComplete\":false,\"userAction\":\"NO_ACTION\",\"userImpact\":\"NO_IMPACT\","
                + "\"event\":\"WALLET_REGISTRATION\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/events/evnt-4e"
                + "2f6663-3e37-4bb8-b8f8-4ab1b02bd292\",\"params\":{\"rel\":\"self\"}}],\"meta\":{"
                + "\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

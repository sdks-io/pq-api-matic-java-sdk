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
import com.mypayquicker.api.models.AgreementListResultJson;
import com.mypayquicker.api.models.AgreementResult;
import com.mypayquicker.api.models.Languages;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgreementsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AgreementsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAgreementsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of program [agreements](page:resources/agreements) that supports filtering,
     * sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAgreements() throws Exception {
        // Parameters for the API call
        String programToken = 
                "prog-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        AgreementListResultJson result = null;
        try {
            result = controller.listAgreements(programToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"agmt-b33d420f-6c1b-4a93-9455-d6585552b97d\",\"contentBa"
                + "se64\":\"DQogIGZvciB5b3VyIHBsYXN0aW...KPC9ib2R5Pg0KDQo8L2h0bWw+DQo=\",\"url\":"
                + "\"https://cdn.payquicker.io/content/Agreements/Cardholder/v1/Languages_EN_US/Car"
                + "dholderAgreement-Consumer-ACH-20k-MCB-USD.pdf\",\"type\":\"CARD_HOLDER_AGREEMENT"
                + "\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/programs/prog"
                + "-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb/agreements/agmt-b33d420f-6c1b-4a93-9455-d6"
                + "585552b97d\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1\",\"page"
                + "Size\":\"100\",\"pageCount\":\"0\",\"recordCount\":\"0\",\"timezone\":\"GMT\","
                + "\"requestRef\":\"request-reference-value\"},\"links\":[{\"href\":\"https://api.s"
                + "andbox.payquicker.io/api/v2/programs/prog-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb/a"
                + "greements\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single program [agreement](page:resources/agreements). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveProgramAgreement() throws Exception {
        // Parameters for the API call
        String programToken = 
                "prog-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb";
        String agreementToken = 
                "agmt-b33d420f-6c1b-4a93-9455-d6585552b97d";

        // Set callback and perform API call
        AgreementResult result = null;
        try {
            result = controller.retrieveProgramAgreement(programToken, agreementToken);
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
                "{\"token\":\"agmt-b33d420f-6c1b-4a93-9455-d6585552b97d\",\"contentBase64\":\"DQogI"
                + "GZvciB5b3VyIHBsYXN0aW...KPC9ib2R5Pg0KDQo8L2h0bWw+DQo=\",\"url\":\"https://cdn.pa"
                + "yquicker.io/content/Agreements/Cardholder/v1/Languages_EN_US/CardholderAgreement"
                + "-Consumer-ACH-20k-MCB-USD.pdf\",\"type\":\"CARD_HOLDER_AGREEMENT\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/programs/prog-6a272eca-9487-"
                + "d83a-c9e4-8df8c9a7f6eb/agreements/agmt-b33d420f-6c1b-4a93-9455-d6585552b97d\","
                + "\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":"
                + "\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept a single program [agreement](page:resources/agreements). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptAgreement() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String agreementToken = 
                "agmt-b33d420f-6c1b-4a93-9455-d6585552b97d";

        // Set callback and perform API call
        try {
            controller.acceptAgreement(userToken, agreementToken);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}

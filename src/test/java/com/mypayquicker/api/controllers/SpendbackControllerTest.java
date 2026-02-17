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
import com.mypayquicker.api.models.SpendbackListResult;
import com.mypayquicker.api.models.SpendbackResult;
import com.mypayquicker.api.models.containers.SpendbackQuote;
import com.mypayquicker.api.utilities.JsonObject;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpendbackControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SpendbackController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSpendbackController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [spendbacks](page:resources/spendbacks) that supports filtering, sorting,
     * and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListSpendbacks() throws Exception {
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
        SpendbackListResult result = null;
        try {
            result = controller.listSpendbacks(page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"spnd-c62fd949-78ef-4f32-aef7-5de8d0c6f4a7\",\"amount\":"
                + "300,\"autoAcceptQuote\":false,\"clientSpendbackId\":\"8c3b61d7-1f5a-4bb9-8ffc-ac"
                + "756c27a3e1\",\"created\":\"2021-06-08T19:30:03Z\",\"currency\":\"USD\",\"destina"
                + "tionToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1"
                + " Memo\",\"note\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":"
                + "\"user-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\",\"status\":\"ACCEPTED\",\"receiptT"
                + "oken\":\"rcpt-4aaa0738-24d9-40bd-a548-18932a6c7f5c\",\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/spend-back/spnd-c62fd949-78ef-4f32-aef7-5de"
                + "8d0c6f4a7\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"spnd-9d769a60-4d59-490"
                + "5-bb46-8f6856121f2a\",\"amount\":35,\"autoAcceptQuote\":false,\"clientSpendbackI"
                + "d\":\"37ebee96-eb48-4689-8079-b650e2a4e753\",\"created\":\"2021-06-08T19:31:56Z"
                + "\",\"currency\":\"USD\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a"
                + "7b147860\",\"memo\":\"Spendback 1 Memo\",\"note\":\"Spendback 1 Note\",\"purpose"
                + "\":\"EXPENSE\",\"sourceToken\":\"user-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\",\"s"
                + "tatus\":\"CANCELLED\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/a"
                + "pi/v2/spend-back/spnd-9d769a60-4d59-4905-bb46-8f6856121f2a\",\"params\":{\"rel"
                + "\":\"self\"}}]},{\"token\":\"spnd-bc16fb78-e391-4796-8a82-4fe7d7473c1a\",\"amoun"
                + "t\":100,\"autoAcceptQuote\":true,\"clientSpendbackId\":\"35bc04d0-e98f-4ca9-817b"
                + "-d62c3b320d6f\",\"created\":\"2021-06-08T19:33:18Z\",\"currency\":\"USD\",\"dest"
                + "inationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendbac"
                + "k 1 Memo\",\"note\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken"
                + "\":\"user-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\",\"status\":\"ACCEPTED\",\"recei"
                + "ptToken\":\"rcpt-6dbd9a70-75c9-49b7-aff6-34708ed491df\",\"links\":[{\"href\":\"h"
                + "ttps://api.sandbox.payquicker.io/api/v2/spend-back/spnd-bc16fb78-e391-4796-8a82-"
                + "4fe7d7473c1a\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"spnd-4d14117c-3e8b-"
                + "4275-9863-f85762ac32fb\",\"amount\":100,\"autoAcceptQuote\":true,\"clientSpendba"
                + "ckId\":\"SPENDBACKRETURN-79f6126943bd451f99bb38649da1ea10\",\"created\":\"2021-0"
                + "6-08T19:34:33Z\",\"currency\":\"USD\",\"destinationToken\":\"acct-70739320-c917-"
                + "425c-a77a-d647c65fd175\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b14"
                + "7860\",\"status\":\"FAILED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/spend-back/spnd-4d14117c-3e8b-4275-9863-f85762ac32fb\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"spnd-25b877b2-fb00-4c9a-a464-f91a6597e752\","
                + "\"amount\":20,\"autoAcceptQuote\":true,\"clientSpendbackId\":\"9b97af1c-53b6-42a"
                + "0-b19c-eaffdc48a854\",\"created\":\"2021-06-08T19:35:00Z\",\"currency\":\"USD\","
                + "\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Sp"
                + "endback 1 Memo\",\"note\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceT"
                + "oken\":\"user-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\",\"status\":\"ACCEPTED\",\"r"
                + "eceiptToken\":\"rcpt-e69b9edb-23c3-4a47-900c-60b7addbbae2\",\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-25b877b2-fb00-4c9a"
                + "-a464-f91a6597e752\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1"
                + "\",\"pageSize\":\"5\",\"pageCount\":\"13\",\"recordCount\":\"64\",\"timezone\":"
                + "\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href\":\"https"
                + "://api.sandbox.payquicker.io/api/v2/spend-back?page=1&pageSize=5&language=en-US"
                + "\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [spendback](page:resources/spendbacks) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateSpendbackQuote() throws Exception {
        // Parameters for the API call
        SpendbackQuote body = null;

        // Set callback and perform API call
        SpendbackResult result = null;
        try {
            result = controller.createSpendbackQuote(body);
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
                "{\"token\":\"spnd-4c414196-d3dd-4233-a729-6fc2da0810eb\",\"amount\":300,\"autoAcce"
                + "ptQuote\":false,\"clientSpendbackId\":\"08c6d59d-a04d-4603-8104-10c9d4c61f0d\","
                + "\"created\":\"2022-05-02T16:45:09Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1 Memo\",\"no"
                + "te\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":\"user-2bbfc96"
                + "7-d12e-4647-a887-d905172fb4bc\",\"status\":\"PENDING_ACCEPTANCE\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-4c414196-d3d"
                + "d-4233-a729-6fc2da0810eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [spendback](page:resources/spendbacks) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateSpendbackQuote1() throws Exception {
        // Parameters for the API call
        SpendbackQuote body = null;

        // Set callback and perform API call
        SpendbackResult result = null;
        try {
            result = controller.createSpendbackQuote(body);
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
                "{\"token\":\"spnd-4c414196-d3dd-4233-a729-6fc2da0810eb\",\"amount\":300,\"autoAcce"
                + "ptQuote\":false,\"clientSpendbackId\":\"08c6d59d-a04d-4603-8104-10c9d4c61f0d\","
                + "\"created\":\"2022-05-02T16:45:09Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1 Memo\",\"no"
                + "te\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":\"user-2bbfc96"
                + "7-d12e-4647-a887-d905172fb4bc\",\"status\":\"PENDING_ACCEPTANCE\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-4c414196-d3d"
                + "d-4233-a729-6fc2da0810eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [spendbacks](page:resources/spendbacks) quote using the spendback token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveSpendback() throws Exception {
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
        SpendbackResult result = null;
        try {
            result = controller.retrieveSpendback(spendbackToken, page, pageSize, filter, sort, language);
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
                "{\"token\":\"spnd-4c414196-d3dd-4233-a729-6fc2da0810eb\",\"amount\":300,\"autoAcce"
                + "ptQuote\":false,\"clientSpendbackId\":\"08c6d59d-a04d-4603-8104-10c9d4c61f0d\","
                + "\"created\":\"2022-05-02T16:45:09Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1 Memo\",\"no"
                + "te\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":\"user-2bbfc96"
                + "7-d12e-4647-a887-d905172fb4bc\",\"status\":\"PENDING_ACCEPTANCE\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-4c414196-d3d"
                + "d-4233-a729-6fc2da0810eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept an open [spendback](page:resources/spendbacks) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptSpendbackQuote() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";

        // Set callback and perform API call
        SpendbackResult result = null;
        try {
            result = controller.acceptSpendbackQuote(spendbackToken);
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
                "{\"token\":\"spnd-4c414196-d3dd-4233-a729-6fc2da0810eb\",\"amount\":300,\"autoAcce"
                + "ptQuote\":false,\"clientSpendbackId\":\"08c6d59d-a04d-4603-8104-10c9d4c61f0d\","
                + "\"created\":\"2022-05-02T16:45:09Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1 Memo\",\"no"
                + "te\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":\"user-2bbfc96"
                + "7-d12e-4647-a887-d905172fb4bc\",\"status\":\"PENDING_ACCEPTANCE\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-4c414196-d3d"
                + "d-4233-a729-6fc2da0810eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept an open [spendback](page:resources/spendbacks) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptSpendbackQuote1() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";

        // Set callback and perform API call
        SpendbackResult result = null;
        try {
            result = controller.acceptSpendbackQuote(spendbackToken);
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
                "{\"token\":\"spnd-4c414196-d3dd-4233-a729-6fc2da0810eb\",\"amount\":300,\"autoAcce"
                + "ptQuote\":false,\"clientSpendbackId\":\"08c6d59d-a04d-4603-8104-10c9d4c61f0d\","
                + "\"created\":\"2022-05-02T16:45:09Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1 Memo\",\"no"
                + "te\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":\"user-2bbfc96"
                + "7-d12e-4647-a887-d905172fb4bc\",\"status\":\"PENDING_ACCEPTANCE\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-4c414196-d3d"
                + "d-4233-a729-6fc2da0810eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Cancel an open [spendback](page:resources/spendbacks) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelSpendbackQuote() throws Exception {
        // Parameters for the API call
        String spendbackToken = 
                "spnd-c39437e1-dc80-4293-8211-c14b5a32f762";

        // Set callback and perform API call
        SpendbackResult result = null;
        try {
            result = controller.cancelSpendbackQuote(spendbackToken);
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
                "{\"token\":\"spnd-4c414196-d3dd-4233-a729-6fc2da0810eb\",\"amount\":300,\"autoAcce"
                + "ptQuote\":false,\"clientSpendbackId\":\"08c6d59d-a04d-4603-8104-10c9d4c61f0d\","
                + "\"created\":\"2022-05-02T16:45:09Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"memo\":\"Spendback 1 Memo\",\"no"
                + "te\":\"Spendback 1 Note\",\"purpose\":\"EXPENSE\",\"sourceToken\":\"user-2bbfc96"
                + "7-d12e-4647-a887-d905172fb4bc\",\"status\":\"PENDING_ACCEPTANCE\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/spend-back/spnd-4c414196-d3d"
                + "d-4233-a729-6fc2da0810eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone"
                + "\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

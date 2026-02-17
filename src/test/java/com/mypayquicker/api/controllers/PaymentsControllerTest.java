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
import com.mypayquicker.api.models.PaymentListResult;
import com.mypayquicker.api.models.PaymentResult;
import com.mypayquicker.api.models.containers.PaymentQuote;
import com.mypayquicker.api.utilities.JsonValue;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaymentsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static PaymentsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getPaymentsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [payments](page:resources/payments) that supports filtering, sorting, and
     * pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPayments() throws Exception {
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
        PaymentListResult result = null;
        try {
            result = controller.listPayments(page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"pmnt-9ed0cd25-aaf5-4683-9a29-b02a9dc40400\",\"amount\":"
                + "-1500,\"autoAcceptQuote\":false,\"clientPaymentId\":\"3cdb0e3f-666a-4a32-86e3-67"
                + "6c8593262a\",\"created\":\"2021-06-08T19:25:13Z\",\"currency\":\"USD\",\"destina"
                + "tionToken\":\"user-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\",\"memo\":\"Payment 1 M"
                + "emo\",\"note\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-"
                + "3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":"
                + "\"rcpt-c05ac500-c5b0-4870-8e66-1004eee26e4b\",\"links\":[{\"href\":\"https://api"
                + ".sandbox.payquicker.io/api/v2/payments/pmnt-9ed0cd25-aaf5-4683-9a29-b02a9dc40400"
                + "\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"pmnt-5cd70578-fabd-4bed-8e60-af"
                + "69addb21a1\",\"amount\":120,\"autoAcceptQuote\":false,\"clientPaymentId\":\"6739"
                + "f368-fa91-46d3-a221-5cd0d75be85a\",\"created\":\"2021-06-08T19:26:04Z\",\"curren"
                + "cy\":\"USD\",\"destinationToken\":\"user-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\","
                + "\"memo\":\"Payment 1 Memo\",\"note\":\"Payment 1 Note\",\"purpose\":\"INCOME\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"status\":\"CANCE"
                + "LLED\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/payments/"
                + "pmnt-5cd70578-fabd-4bed-8e60-af69addb21a1\",\"params\":{\"rel\":\"self\"}}]},{"
                + "\"token\":\"pmnt-cb279676-6ecf-46e5-b5c8-96f0b6b9ae59\",\"amount\":-50,\"autoAcc"
                + "eptQuote\":true,\"clientPaymentId\":\"9422dab5-2ea8-47af-8d25-a10aef6efa50\",\"c"
                + "reated\":\"2021-06-08T19:26:26Z\",\"currency\":\"USD\",\"destinationToken\":\"us"
                + "er-b41dee0e-f1ca-4e1b-9e1e-e95d13ad8fa2\",\"memo\":\"Payment 1 Memo\",\"note\":"
                + "\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce1-4"
                + "74d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-b1d53179"
                + "-dd25-4f53-b9ae-d3f23832b7a8\",\"links\":[{\"href\":\"https://api.sandbox.payqui"
                + "cker.io/api/v2/payments/pmnt-cb279676-6ecf-46e5-b5c8-96f0b6b9ae59\",\"params\":{"
                + "\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"3\",\"pageCount"
                + "\":\"99\",\"recordCount\":\"296\",\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/"
                + "v2/payments?page=1&pageSize=3&language=en-US\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [payment](page:resources/payments) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreatePaymentQuote() throws Exception {
        // Parameters for the API call
        PaymentQuote body = null;

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.createPaymentQuote(body);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [payment](page:resources/payments) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreatePaymentQuote1() throws Exception {
        // Parameters for the API call
        PaymentQuote body = null;

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.createPaymentQuote(body);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [payment](page:resources/payments). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrievePayment() throws Exception {
        // Parameters for the API call
        String paymentToken = 
                "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";
        String filter = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.retrievePayment(paymentToken, filter, language);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept an open [payment](page:resources/payments) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptPaymentQuote() throws Exception {
        // Parameters for the API call
        String paymentToken = 
                "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.acceptPaymentQuote(paymentToken);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept an open [payment](page:resources/payments) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptPaymentQuote1() throws Exception {
        // Parameters for the API call
        String paymentToken = 
                "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.acceptPaymentQuote(paymentToken);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Cancel an open [payment](page:resources/payments) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelPaymentQuote() throws Exception {
        // Parameters for the API call
        String paymentToken = 
                "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.cancelPaymentQuote(paymentToken);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Perform a [payment](page:resources/payments) retraction for the full payment amount. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetractPayment() throws Exception {
        // Parameters for the API call
        String paymentToken = 
                "pmnt-d3ff8a0d-aec9-49a6-a95b-6191aebeca20";

        // Set callback and perform API call
        PaymentResult result = null;
        try {
            result = controller.retractPayment(paymentToken);
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
                "{\"token\":\"pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"amount\":-1500,\"autoAc"
                + "ceptQuote\":false,\"clientPaymentId\":\"de6269af-e3b0-4d4b-801d-367776b32f63\","
                + "\"created\":\"2022-04-26T15:16:18Z\",\"currency\":\"USD\",\"destinationToken\":"
                + "\"dest-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"memo\":\"Payment 1 Memo\",\"note"
                + "\":\"Payment 1 Note\",\"purpose\":\"INCOME\",\"sourceToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-30bfa"
                + "af3-69bc-4ed5-ad6a-d38705cf0281\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/payments/pmnt-37be18b6-301a-4a37-8723-ddf645abcdb7\",\"params"
                + "\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-"
                + "reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

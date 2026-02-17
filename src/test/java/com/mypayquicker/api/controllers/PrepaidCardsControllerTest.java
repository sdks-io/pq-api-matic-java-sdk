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
import com.mypayquicker.api.models.AuthorizationListResult;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OrderPrepaidCard;
import com.mypayquicker.api.models.PrepaidCardListResult;
import com.mypayquicker.api.models.PrepaidCardResult;
import com.mypayquicker.api.models.ReplacePrepaidCard;
import com.mypayquicker.api.models.UpdatePrepaidCard;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrepaidCardsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static PrepaidCardsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getPrepaidCardsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [prepaid cards](page:resources/prepaid-cards) by user token that supports
     * filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPrepaidCards() throws Exception {
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
        PrepaidCardListResult result = null;
        try {
            result = controller.listPrepaidCards(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"dest-b61bc870-8ab8-4870-a209-6398b60269d5\",\"cardNetwo"
                + "rk\":\"VISA\",\"cardNumber\":\"483318******3940\",\"cardPackage\":\"712940\",\"c"
                + "ountry\":\"US\",\"createdOn\":\"2022-04-20T18:43:15Z\",\"currency\":\"USD\",\"cv"
                + "v\":\"***\",\"expires\":\"04/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDe"
                + "tails\":[{\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN"
                + "\",\"value\":\"8037390305203\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APP"
                + "LEPAY\",\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-2bbfc967-d12e-4647-a8"
                + "87-d905172fb4bc\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v"
                + "2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-cards/dest-b61bc870-8a"
                + "b8-4870-a209-6398b60269d5\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"dest-9"
                + "a8f1dc9-5e59-4ce5-a919-fc586d85d6e5\",\"cardNetwork\":\"VISA\",\"cardNumber\":"
                + "\"483318******4628\",\"cardPackage\":\"712940\",\"country\":\"US\",\"createdOn"
                + "\":\"2022-04-20T18:42:47Z\",\"currency\":\"USD\",\"cvv\":\"***\",\"expires\":\"0"
                + "6/2025\",\"status\":\"CLOSED_LOST_STOLEN_DAMAGED\",\"capabilities\":[\"BANK_IN"
                + "\",\"SET_PIN\",\"APPLEPAY\",\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-2"
                + "bbfc967-d12e-4647-a887-d905172fb4bc\",\"links\":[{\"href\":\"https://api.sandbox"
                + ".payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-ca"
                + "rds/dest-9a8f1dc9-5e59-4ce5-a919-fc586d85d6e5\",\"params\":{\"rel\":\"self\"}}]}"
                + ",{\"token\":\"dest-d9c6edab-ddec-4941-b980-f33cfe2f9f6b\",\"cardNetwork\":\"VISA"
                + "\",\"cardNumber\":\"483318******1805\",\"cardPackage\":\"712940\",\"country\":"
                + "\"US\",\"createdOn\":\"2022-04-20T18:36:16Z\",\"currency\":\"USD\",\"cvv\":\"***"
                + "\",\"expires\":\"10/2025\",\"status\":\"CLOSED_LOST_STOLEN_DAMAGED\",\"capabilit"
                + "ies\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\",\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"user"
                + "Token\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/prepaid-cards/dest-d9c6edab-ddec-4941-b980-f33cfe2f9f6b\",\"params\":{\"re"
                + "l\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":"
                + "\"1\",\"recordCount\":\"3\",\"timezone\":\"GMT\",\"requestRef\":\"request-refere"
                + "nce-value\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/use"
                + "rs/user-2bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-cards\",\"params\":{\"rel"
                + "\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Order a [prepaid card](page:resources/prepaid-cards) for the user by specifying a
     * cardPackage. Assign a prepaid card to a user when a program token and card reference number
     * are supplied.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestOrderPrepaidCard() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        OrderPrepaidCard body = ApiHelper.deserialize(
                "{\"cardPackage\":\"712940\",\"programToken\":\"prog-6a272eca-9487-d83a-c9e4-8df8c9"
                + "a7f6eb\"}",
                OrderPrepaidCard.class);

        // Set callback and perform API call
        PrepaidCardResult result = null;
        try {
            result = controller.orderPrepaidCard(userToken, body);
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
                "{\"token\":\"dest-fcd31b51-0968-4537-8722-f486bdd5cd74\",\"cardNetwork\":\"VISA\","
                + "\"cardNumber\":\"483318******2127\",\"cardPackage\":\"712940\",\"country\":\"US"
                + "\",\"createdOn\":\"2022-05-06T18:14:52Z\",\"currency\":\"USD\",\"cvv\":\"***\","
                + "\"expires\":\"06/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDetails\":[{"
                + "\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN\",\"value"
                + "\":\"8037390853101\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\","
                + "\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-ae92315b-6190-4e56-bdf5-c0189"
                + "ac420a1\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-fcd31b51-0968-4537-"
                + "8722-f486bdd5cd74\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Order a [prepaid card](page:resources/prepaid-cards) for the user by specifying a
     * cardPackage. Assign a prepaid card to a user when a program token and card reference number
     * are supplied.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestOrderPrepaidCard1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        OrderPrepaidCard body = ApiHelper.deserialize(
                "{\"cardPackage\":\"712940\",\"programToken\":\"prog-6a272eca-9487-d83a-c9e4-8df8c9"
                + "a7f6eb\"}",
                OrderPrepaidCard.class);

        // Set callback and perform API call
        PrepaidCardResult result = null;
        try {
            result = controller.orderPrepaidCard(userToken, body);
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
                "{\"token\":\"dest-fcd31b51-0968-4537-8722-f486bdd5cd74\",\"cardNetwork\":\"VISA\","
                + "\"cardNumber\":\"483318******2127\",\"cardPackage\":\"712940\",\"country\":\"US"
                + "\",\"createdOn\":\"2022-05-06T18:14:52Z\",\"currency\":\"USD\",\"cvv\":\"***\","
                + "\"expires\":\"06/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDetails\":[{"
                + "\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN\",\"value"
                + "\":\"8037390853101\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\","
                + "\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-ae92315b-6190-4e56-bdf5-c0189"
                + "ac420a1\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-fcd31b51-0968-4537-"
                + "8722-f486bdd5cd74\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Replace a [prepaid card](page:resources/prepaid-cards) by destination token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestReplacePrepaidCard() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        ReplacePrepaidCard body = ApiHelper.deserialize(
                "{\"cardPackage\":\"23654\",\"cardReplacementReason\":\"LOST\"}",
                ReplacePrepaidCard.class);

        // Set callback and perform API call
        PrepaidCardResult result = null;
        try {
            result = controller.replacePrepaidCard(userToken, destinationToken, body);
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
                "{\"token\":\"dest-fcd31b51-0968-4537-8722-f486bdd5cd74\",\"cardNetwork\":\"VISA\","
                + "\"cardNumber\":\"483318******2127\",\"cardPackage\":\"712940\",\"country\":\"US"
                + "\",\"createdOn\":\"2022-05-06T18:14:52Z\",\"currency\":\"USD\",\"cvv\":\"***\","
                + "\"expires\":\"06/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDetails\":[{"
                + "\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN\",\"value"
                + "\":\"8037390853101\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\","
                + "\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-ae92315b-6190-4e56-bdf5-c0189"
                + "ac420a1\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-fcd31b51-0968-4537-"
                + "8722-f486bdd5cd74\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Replace a [prepaid card](page:resources/prepaid-cards) by destination token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestReplacePrepaidCard1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        ReplacePrepaidCard body = ApiHelper.deserialize(
                "{\"cardPackage\":\"23654\",\"cardReplacementReason\":\"LOST\"}",
                ReplacePrepaidCard.class);

        // Set callback and perform API call
        PrepaidCardResult result = null;
        try {
            result = controller.replacePrepaidCard(userToken, destinationToken, body);
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
                "{\"token\":\"dest-fcd31b51-0968-4537-8722-f486bdd5cd74\",\"cardNetwork\":\"VISA\","
                + "\"cardNumber\":\"483318******2127\",\"cardPackage\":\"712940\",\"country\":\"US"
                + "\",\"createdOn\":\"2022-05-06T18:14:52Z\",\"currency\":\"USD\",\"cvv\":\"***\","
                + "\"expires\":\"06/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDetails\":[{"
                + "\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN\",\"value"
                + "\":\"8037390853101\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\","
                + "\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-ae92315b-6190-4e56-bdf5-c0189"
                + "ac420a1\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-fcd31b51-0968-4537-"
                + "8722-f486bdd5cd74\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve [prepaid card](page:resources/prepaid-cards) details by destination token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrievePrepaidCard() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";

        // Set callback and perform API call
        PrepaidCardResult result = null;
        try {
            result = controller.retrievePrepaidCard(userToken, destinationToken);
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
                "{\"token\":\"dest-fcd31b51-0968-4537-8722-f486bdd5cd74\",\"cardNetwork\":\"VISA\","
                + "\"cardNumber\":\"483318******2127\",\"cardPackage\":\"712940\",\"country\":\"US"
                + "\",\"createdOn\":\"2022-05-06T18:14:52Z\",\"currency\":\"USD\",\"cvv\":\"***\","
                + "\"expires\":\"06/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDetails\":[{"
                + "\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN\",\"value"
                + "\":\"8037390853101\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\","
                + "\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-ae92315b-6190-4e56-bdf5-c0189"
                + "ac420a1\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-fcd31b51-0968-4537-"
                + "8722-f486bdd5cd74\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Partial [prepaid card](page:resources/prepaid-cards) update. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdatePrepaidCard() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        UpdatePrepaidCard body = ApiHelper.deserialize(
                "{\"cardPackage\":\"\",\"status\":\"QUEUED\"}",
                UpdatePrepaidCard.class);

        // Set callback and perform API call
        PrepaidCardResult result = null;
        try {
            result = controller.updatePrepaidCard(userToken, destinationToken, body);
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
                "{\"token\":\"dest-fcd31b51-0968-4537-8722-f486bdd5cd74\",\"cardNetwork\":\"VISA\","
                + "\"cardNumber\":\"483318******2127\",\"cardPackage\":\"712940\",\"country\":\"US"
                + "\",\"createdOn\":\"2022-05-06T18:14:52Z\",\"currency\":\"USD\",\"cvv\":\"***\","
                + "\"expires\":\"06/2025\",\"status\":\"PENDING_ACTIVATION\",\"bankInDetails\":[{"
                + "\"key\":\"BANK_ACH_ABA\",\"value\":\"026014892\"},{\"key\":\"BANK_BBAN\",\"value"
                + "\":\"8037390853101\"}],\"capabilities\":[\"BANK_IN\",\"SET_PIN\",\"APPLEPAY\","
                + "\"GOOGLEPAY\",\"SAMSUNGPAY\"],\"userToken\":\"user-ae92315b-6190-4e56-bdf5-c0189"
                + "ac420a1\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-ae92315b-6190-4e56-bdf5-c0189ac420a1/prepaid-cards/dest-fcd31b51-0968-4537-"
                + "8722-f486bdd5cd74\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * TODO.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListCardAuthorizations() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";

        // Set callback and perform API call
        AuthorizationListResult result = null;
        try {
            result = controller.listCardAuthorizations(userToken, destinationToken);
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
                "{\"payload\":[{\"type\":\"UNSETTLED_AUTHORIZATION\",\"createdOn\":\"2022-05-04T13:"
                + "22:53Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"dest-8e35fc1b-82f4-4bf5-93d1-27f71"
                + "a192bc2\",\"amount\":-35,\"currency\":\"USD\",\"status\":\"UNSETTLED\",\"descrip"
                + "tions\":[{\"language\":\"en-US\",\"translation\":\"Completed Bank Transfer Reque"
                + "st\"}],\"authDate\":\"2022-05-04T13:22:53Z\",\"reference\":\"CC008AB44895\"}],"
                + "\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0\",\"recordCoun"
                + "t\":\"0\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"lin"
                + "ks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-cf6244d7-f"
                + "6b8-4625-906a-9f21fc8c774b/prepaid-cards/dest-8e35fc1b-82f4-4bf5-93d1-27f71a192b"
                + "c2/authorizations\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

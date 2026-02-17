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
import com.mypayquicker.api.models.OperationResult;
import com.mypayquicker.api.models.PrepaidCardDataResult;
import com.mypayquicker.api.models.PrepaidCardDataTokenResult;
import com.mypayquicker.api.models.PrepaidCardDataType;
import com.mypayquicker.api.models.PrepaidCardImageSide;
import com.mypayquicker.api.models.PrepaidCardPinResult;
import com.mypayquicker.api.models.PrepaidCardPinTokenResult;
import com.mypayquicker.api.models.RetrieveCardData;
import com.mypayquicker.api.models.RetrieveCardPin;
import com.mypayquicker.api.models.UpdateCardPin;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClientSideControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ClientSideController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getClientSideController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Generate a token used to reveal [prepaid card](page:resources/prepaid-cards) information in
     * the form of image data (base64) or JSON. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCardDataToken() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        PrepaidCardDataType format = PrepaidCardDataType.fromString(
                "TEXT");
        PrepaidCardImageSide side = PrepaidCardImageSide.fromString(
                "FRONT");

        // Set callback and perform API call
        PrepaidCardDataTokenResult result = null;
        try {
            result = controller.createCardDataToken(userToken, destinationToken, format, side);
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
                "{\"cardProcessorType\":\"QOLO\",\"resourceValue\":\"b61bc8708ab84870a2096398b60269"
                + "d5\",\"token\":\"iEureKuLW1gZQ7d3/2ijX4+6bDZuUwpp2QmhPfedarncS2Cde1Ebmby+dxfeP7+"
                + "Iaty9YYCLFwY42HHOm03dliH7Jp0Yo/sjOb/FmSQ3IOVYpNSYBcZYGmgpyBEG9gPa2HRIKK8+NcPVjjb"
                + "+0gfqFAI52Emk0P+VPaBZ2NgsENV/I4MuIkWsUXha3QZh49a0EK3wO14jwR4BosY/rk0/9F5uJEWUjv8"
                + "gvPej+dCFyMnybjj6jPK9f/gFlPUYVHuS\",\"tokenPurposeType\":\"CARD_OPERATION\",\"ur"
                + "l\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a209-6398b60269d5/pci?token"
                + "=iEureKuLW1gZQ7d3%2f2ijX4%2b6bDZuUwpp2QmhPfedarncS2Cde1Ebmby%2bdxfeP7%2bIaty9YYC"
                + "LFwY42HHOm03dliH7Jp0Yo%2fsjOb%2fFmSQ3IOVYpNSYBcZYGmgpyBEG9gPa2HRIKK8%2bNcPVjjb%2"
                + "b0gfqFAI52Emk0P%2bVPaBZ2NgsENV%2fI4MuIkWsUXha3QZh49a0EK3wO14jwR4BosY%2frk0%2f9F5"
                + "uJEWUjv8gvPej%2bdCFyMnybjj6jPK9f%2fgFlPUYVHuS&format=TEXT\",\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887"
                + "-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a209-6398b60269d5/pci/iEureK"
                + "uLW1gZQ7d3/2ijX4+6bDZuUwpp2QmhPfedarncS2Cde1Ebmby+dxfeP7+Iaty9YYCLFwY42HHOm03dli"
                + "H7Jp0Yo/sjOb/FmSQ3IOVYpNSYBcZYGmgpyBEG9gPa2HRIKK8+NcPVjjb+0gfqFAI52Emk0P+VPaBZ2N"
                + "gsENV/I4MuIkWsUXha3QZh49a0EK3wO14jwR4BosY/rk0/9F5uJEWUjv8gvPej+dCFyMnybjj6jPK9f/"
                + "gFlPUYVHuS\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"re"
                + "questRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Return [prepaid card](page:resources/prepaid-cards) data in the form of image data, text, or
     * both. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCardData() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        PrepaidCardDataType format = PrepaidCardDataType.fromString(
                "TEXT");
        PrepaidCardImageSide side = PrepaidCardImageSide.fromString(
                "FRONT");
        RetrieveCardData body = ApiHelper.deserialize(
                "{\"Token\":\"iEureKuLW1gZQ7d3/2ijX4+6bDZuUwpp2QmhPfedarncS2Cde1Ebmby+dxfeP7+Iaty9Y"
                + "YCLFwY42HHOm03dliH7Jp0Yo/sjOb/FmSQ3IOVYpNSYBcZYGmgpyBEG9gPa2HRIKK8+NcPVjjb+0gfqF"
                + "AI52Emk0P+VPaBZ2NgsENV/I4MuIkWsUXha3QZh49a0EK3wO14jwR4BosY/rk0/9F5uJEWUjv8gvPej+"
                + "dCFyMnybjj6jPK9f/gFlPUYVHuS\"}",
                RetrieveCardData.class);

        // Set callback and perform API call
        PrepaidCardDataResult result = null;
        try {
            result = controller.retrieveCardData(userToken, destinationToken, format, side, body);
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
                "{\"cardNumber\":4833180000103940,\"cvvNumber\":\"709\",\"expiration\":\"04/25\","
                + "\"nameOnCard\":\"SIDNEY MAYER\",\"token\":\"dest-b61bc870-8ab8-4870-a209-6398b60"
                + "269d5\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/us"
                + "er-2bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a2"
                + "09-6398b60269d5/pci\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"G"
                + "MT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Return [prepaid card](page:resources/prepaid-cards) data in the form of image data, text, or
     * both. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCardData1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        PrepaidCardDataType format = PrepaidCardDataType.fromString(
                "TEXT");
        PrepaidCardImageSide side = PrepaidCardImageSide.fromString(
                "FRONT");
        RetrieveCardData body = ApiHelper.deserialize(
                "{\"Token\":\"iEureKuLW1gZQ7d3/2ijX4+6bDZuUwpp2QmhPfedarncS2Cde1Ebmby+dxfeP7+Iaty9Y"
                + "YCLFwY42HHOm03dliH7Jp0Yo/sjOb/FmSQ3IOVYpNSYBcZYGmgpyBEG9gPa2HRIKK8+NcPVjjb+0gfqF"
                + "AI52Emk0P+VPaBZ2NgsENV/I4MuIkWsUXha3QZh49a0EK3wO14jwR4BosY/rk0/9F5uJEWUjv8gvPej+"
                + "dCFyMnybjj6jPK9f/gFlPUYVHuS\"}",
                RetrieveCardData.class);

        // Set callback and perform API call
        PrepaidCardDataResult result = null;
        try {
            result = controller.retrieveCardData(userToken, destinationToken, format, side, body);
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
                "{\"cardNumber\":4833180000103940,\"cvvNumber\":\"709\",\"expiration\":\"04/25\","
                + "\"nameOnCard\":\"SIDNEY MAYER\",\"token\":\"dest-b61bc870-8ab8-4870-a209-6398b60"
                + "269d5\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/us"
                + "er-2bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a2"
                + "09-6398b60269d5/pci\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"G"
                + "MT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve one part of a two-part token required to reveal or set a client side [prepaid
     * card](page:resources/prepaid-cards) PIN. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCardPINToken() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";

        // Set callback and perform API call
        PrepaidCardPinTokenResult result = null;
        try {
            result = controller.createCardPINToken(userToken, destinationToken);
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
                "{\"cardProcessorType\":\"QOLO\",\"cardPinToken\":\"/YnZvwn9Q5TczQhubfjB8Sq1inIVtMG"
                + "nKT9ywAcan60uavrMNeMAR1RGyuWj7N8XOiy7W2QrEXGzM/668UIJMzTFOlVqSrkQSn22ErWCb5BQTYX"
                + "l04sF1nW73u8aykRHi1c4lGhu3kSrTKxqqN/GtEJTcDV+SfBj/huWQZrdWTxdbnN2XX5jqNkGUHbfkFU"
                + "0s9oxxwX6cYYreBbtmo0WFSLS0o2RT+LGAtiEqgPvT5T6NlZlNa+TF17gbgxHi0sG\",\"token\":"
                + "\"dest-b61bc870-8ab8-4870-a209-6398b60269d5\",\"url\":\"https://api.sandbox.payq"
                + "uicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-cards/d"
                + "est-b61bc870-8ab8-4870-a209-6398b60269d5/pin?token=%2fYnZvwn9Q5TczQhubfjB8Sq1inI"
                + "VtMGnKT9ywAcan60uavrMNeMAR1RGyuWj7N8XOiy7W2QrEXGzM%2f668UIJMzTFOlVqSrkQSn22ErWCb"
                + "5BQTYXl04sF1nW73u8aykRHi1c4lGhu3kSrTKxqqN%2fGtEJTcDV%2bSfBj%2fhuWQZrdWTxdbnN2XX5"
                + "jqNkGUHbfkFU0s9oxxwX6cYYreBbtmo0WFSLS0o2RT%2bLGAtiEqgPvT5T6NlZlNa%2bTF17gbgxHi0s"
                + "G\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2"
                + "bbfc967-d12e-4647-a887-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a209-6"
                + "398b60269d5/pin\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT"
                + "\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Set a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards), if supported by program. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateCardPIN() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        UpdateCardPin body = ApiHelper.deserialize(
                "{\"cardPinToken\":\"05OQkdzRkzjP+qlhTrsko00cb58gGERv+g1Nd7/xK+Ol2+vJaOJnjQgdFA0Jqf"
                + "5TFdYZrjO7dw/2l1V9k8xNGVr3MyKHrQh/CZ+HMz2gdI3VkJVj0x50PStECnN0t1P4eXTZqmh93O24fX"
                + "RyvLn8XvmfyV7nF94IEwzwVe6Xdvl6mHQyyyNwtSNKHtNGGpM88hoX5PAvbqgYrsy5tBYi3CcN+Ld5Ia"
                + "8+nFq9pDAXs6dCLsidU9XJRzLLcWWdhzxR\",\"cardPin\":\"4444\"}",
                UpdateCardPin.class);

        // Set callback and perform API call
        OperationResult result = null;
        try {
            result = controller.updateCardPIN(userToken, destinationToken, body);
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
                "{\"result\":true,\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference"
                + "-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Reveal a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCardPIN() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        RetrieveCardPin body = ApiHelper.deserialize(
                "{\"cardPinToken\":\"IzPQ55SGbTumVRn7xscpjL9zgFV29503mQ+GJuKAzCYl8DhLkJKZSBqPLWx6rB"
                + "f/ky9FRqZCptCCVmZ3ZT+sR6sVmBDT9vfK+8Bbv/6Kftz+Pu9DJOXTwd7Hcs9PuaU5qirAq9rp3P5pKL"
                + "5Ilg+ZkU8b7TP2ZMBIchxYHZG5aJ3b96BdlMyEB4bu1UATKOjS2+vYFLUFprtwbnwp94QuaiFALG9NMC"
                + "lQ3CqWJqot/Z1DSbTnPqIq+BRzA8Xdbh1j\"}",
                RetrieveCardPin.class);

        // Set callback and perform API call
        PrepaidCardPinResult result = null;
        try {
            result = controller.retrieveCardPIN(userToken, destinationToken, body);
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
                "{\"cardPin\":\"4444\",\"token\":\"dest-b61bc870-8ab8-4870-a209-6398b60269d5\",\"li"
                + "nks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a209-6398b6026"
                + "9d5/pin\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"reque"
                + "stRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Reveal a [PIN](#/rest/models/structures/prepaid-card-pin) for a [prepaid
     * card](page:resources/prepaid-cards). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCardPIN1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        RetrieveCardPin body = ApiHelper.deserialize(
                "{\"cardPinToken\":\"IzPQ55SGbTumVRn7xscpjL9zgFV29503mQ+GJuKAzCYl8DhLkJKZSBqPLWx6rB"
                + "f/ky9FRqZCptCCVmZ3ZT+sR6sVmBDT9vfK+8Bbv/6Kftz+Pu9DJOXTwd7Hcs9PuaU5qirAq9rp3P5pKL"
                + "5Ilg+ZkU8b7TP2ZMBIchxYHZG5aJ3b96BdlMyEB4bu1UATKOjS2+vYFLUFprtwbnwp94QuaiFALG9NMC"
                + "lQ3CqWJqot/Z1DSbTnPqIq+BRzA8Xdbh1j\"}",
                RetrieveCardPin.class);

        // Set callback and perform API call
        PrepaidCardPinResult result = null;
        try {
            result = controller.retrieveCardPIN(userToken, destinationToken, body);
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
                "{\"cardPin\":\"4444\",\"token\":\"dest-b61bc870-8ab8-4870-a209-6398b60269d5\",\"li"
                + "nks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc/prepaid-cards/dest-b61bc870-8ab8-4870-a209-6398b6026"
                + "9d5/pin\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"reque"
                + "stRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

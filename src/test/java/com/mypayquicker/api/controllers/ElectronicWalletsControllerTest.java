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
import com.mypayquicker.api.models.Countries;
import com.mypayquicker.api.models.CreateOrUpdateElectronicWallet;
import com.mypayquicker.api.models.Currencies;
import com.mypayquicker.api.models.ElectronicWalletListResult;
import com.mypayquicker.api.models.ElectronicWalletRequirementListResult;
import com.mypayquicker.api.models.ElectronicWalletResult;
import com.mypayquicker.api.models.ElectronicWalletTypes;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OperationResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElectronicWalletsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ElectronicWalletsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getElectronicWalletsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [electronic wallets](page:resources/electronic-wallets) that supports
     * filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListElectronicWallets() throws Exception {
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
        ElectronicWalletListResult result = null;
        try {
            result = controller.listElectronicWallets(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"dest-969daa60-c743-4e4f-8609-559874f26d6c\",\"type\":"
                + "\"TIGO_MONEY\",\"electronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":"
                + "\"USD\",\"createdOn\":\"2022-05-20T15:48:54Z\",\"fields\":[{\"key\":\"ACCOUNT_NU"
                + "MBER\",\"value\":\"012345678\"},{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678"
                + "\"}],\"status\":\"VERIFIED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/electronic-wallets/"
                + "dest-969daa60-c743-4e4f-8609-559874f26d6c\",\"params\":{\"rel\":\"self\"}}]}],"
                + "\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"5\",\"pageCount\":\"1\",\"recordCount"
                + "\":\"1\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"link"
                + "s\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-ae92315b-61"
                + "90-4e56-bdf5-c0189ac420a1/electronic-wallets?page=1&pageSize=5&language=en-US\","
                + "\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a new [electronic wallet](page:resources/electronic-wallets) using a user token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateElectronicWallet() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateElectronicWallet body = ApiHelper.deserialize(
                "{\"type\":\"TIGO_MONEY\",\"electronicWalletCountry\":\"SV\",\"electronicWalletCurr"
                + "ency\":\"USD\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value\":\"012345678\"},"
                + "{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}]}",
                CreateOrUpdateElectronicWallet.class);

        // Set callback and perform API call
        ElectronicWalletResult result = null;
        try {
            result = controller.createElectronicWallet(userToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"type\":\"TIGO_MONEY\","
                + "\"electronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":\"USD\",\"create"
                + "dOn\":\"2022-05-20T15:48:54Z\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value"
                + "\":\"012345678\"},{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}],\"status"
                + "\":\"VERIFIED\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/electronic-wallets/dest-41579f58"
                + "-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timez"
                + "one\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a new [electronic wallet](page:resources/electronic-wallets) using a user token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateElectronicWallet1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateElectronicWallet body = ApiHelper.deserialize(
                "{\"type\":\"TIGO_MONEY\",\"electronicWalletCountry\":\"SV\",\"electronicWalletCurr"
                + "ency\":\"USD\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value\":\"012345678\"},"
                + "{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}]}",
                CreateOrUpdateElectronicWallet.class);

        // Set callback and perform API call
        ElectronicWalletResult result = null;
        try {
            result = controller.createElectronicWallet(userToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"type\":\"TIGO_MONEY\","
                + "\"electronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":\"USD\",\"create"
                + "dOn\":\"2022-05-20T15:48:54Z\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value"
                + "\":\"012345678\"},{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}],\"status"
                + "\":\"VERIFIED\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/electronic-wallets/dest-41579f58"
                + "-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timez"
                + "one\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve requirements for adding a [electronic wallet](page:resources/electronic-wallets)
     * using the parameters provided. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCreationRequirements() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        ElectronicWalletTypes electronicWalletType = ElectronicWalletTypes.fromString(
                "TIGO_MONEY");
        Countries country = Countries.fromString(
                "US");
        Currencies currency = Currencies.fromString(
                "USD");

        // Set callback and perform API call
        ElectronicWalletRequirementListResult result = null;
        try {
            result = controller.retrieveCreationRequirements(userToken, electronicWalletType, country, currency);
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
                "{\"payload\":[{\"electronicWalletType\":\"TIGO_MONEY\",\"electronicWalletCountry"
                + "\":\"SV\",\"electronicWalletCurrency\":\"USD\",\"requirements\":[{\"requirement"
                + "\":\"ACCOUNT_NUMBER\",\"format\":{\"example\":\"012345678\",\"legend\":[{\"key"
                + "\":\"012345678\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Exa"
                + "mple Account Number\"},{\"language\":\"it-IT\",\"translation\":\"Esempio Numero "
                + "del conto\"}]}]},\"description\":[{\"language\":\"en-US\",\"translation\":\"Acco"
                + "unt Number\"},{\"language\":\"it-IT\",\"translation\":\"Numero del conto\"}],\"v"
                + "alidators\":[{\"validatorType\":\"REGEX\",\"expression\":\"^[0-9]{8}$\"}]},{\"re"
                + "quirement\":\"GOVERNMENT_ID\",\"format\":{\"example\":\"012345678\",\"legend\":["
                + "{\"key\":\"012345678\",\"descriptions\":[{\"language\":\"en-US\",\"translation"
                + "\":\"Example Government Id\"},{\"language\":\"it-IT\",\"translation\":\"Esempio "
                + "Carta d'Identità\"}]}]},\"description\":[{\"language\":\"en-US\",\"translation"
                + "\":\"Government Id\"},{\"language\":\"it-IT\",\"translation\":\"Carta d'Identità"
                + "\"}],\"validators\":[{\"validatorType\":\"REGEX\",\"expression\":\"^[0-9]{8}$\"}"
                + "]}],\"quote\":{\"formattedAmount\":\"$4.32 USD (USD, en-US), 0,00 â‚¬ EUR (EUR, "
                + "fr-FR)\",\"amount\":4.32,\"currency\":\"USD\"},\"links\":[{\"params\":{\"rel\":"
                + "\"self\"},\"href\":\"string\"}]}],\"links\":[{\"params\":{\"rel\":\"self\"},\"hr"
                + "ef\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [electronic wallet](page:resources/electronic-wallets) using a destination
     * token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveElectronicWallet() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        ElectronicWalletResult result = null;
        try {
            result = controller.retrieveElectronicWallet(userToken, destinationToken, page, pageSize, filter, sort, language);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"type\":\"TIGO_MONEY\","
                + "\"electronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":\"USD\",\"create"
                + "dOn\":\"2022-05-20T15:48:54Z\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value"
                + "\":\"012345678\"},{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}],\"status"
                + "\":\"VERIFIED\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/electronic-wallets/dest-41579f58"
                + "-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timez"
                + "one\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Update a [electronic wallet](page:resources/electronic-wallets). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateElectronicWallet() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        CreateOrUpdateElectronicWallet body = ApiHelper.deserialize(
                "{\"type\":\"TIGO_MONEY\",\"electronicWalletCountry\":\"SV\",\"electronicWalletCurr"
                + "ency\":\"USD\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value\":\"012345678\"},"
                + "{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}]}",
                CreateOrUpdateElectronicWallet.class);

        // Set callback and perform API call
        ElectronicWalletResult result = null;
        try {
            result = controller.updateElectronicWallet(userToken, destinationToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"type\":\"TIGO_MONEY\","
                + "\"electronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":\"USD\",\"create"
                + "dOn\":\"2022-05-20T15:48:54Z\",\"fields\":[{\"key\":\"ACCOUNT_NUMBER\",\"value"
                + "\":\"012345678\"},{\"key\":\"GOVERNMENT_ID\",\"value\":\"012345678\"}],\"status"
                + "\":\"VERIFIED\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/"
                + "users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/electronic-wallets/dest-41579f58"
                + "-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timez"
                + "one\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Delete a user [electronic wallet](page:resources/electronic-wallets). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteElectronicWallet() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";

        // Set callback and perform API call
        OperationResult result = null;
        try {
            result = controller.deleteElectronicWallet(userToken, destinationToken);
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
                "{\"result\":true,\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference"
                + "-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

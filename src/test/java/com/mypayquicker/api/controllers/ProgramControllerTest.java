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
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.ProgramListResult;
import com.mypayquicker.api.models.ProgramResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProgramControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ProgramController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getProgramController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [programs](page:resources/programs) that supports filtering, sorting, and
     * pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPrograms() throws Exception {
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
        ProgramListResult result = null;
        try {
            result = controller.listPrograms(page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"prog-0146a716-4055-2598-ce14-df5ece519a98\",\"currency"
                + "\":\"USD\",\"bank\":\"PATHWARD\",\"electricWallets\":[{\"type\":\"TIGO_MONEY\","
                + "\"electronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":\"USD\"},{\"type"
                + "\":\"TIGO_MONEY\",\"electronicWalletCountry\":\"GT\",\"electronicWalletCurrency"
                + "\":\"GTQ\"},{\"type\":\"AIRTEL_MONEY\",\"electronicWalletCountry\":\"TZ\",\"elec"
                + "tronicWalletCurrency\":\"TZS\"},{\"type\":\"MCASH\",\"electronicWalletCountry\":"
                + "\"LK\",\"electronicWalletCurrency\":\"LKR\"}],\"type\":\"COMMERCIAL\",\"links\":"
                + "[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/programs/prog-0146a716-405"
                + "5-2598-ce14-df5ece519a98\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"prog-db"
                + "fe1489-f3ba-3f5a-6904-9b9ad91ceaf6\",\"currency\":\"MXN\",\"bank\":\"PATHWARD\","
                + "\"electricWallets\":[],\"type\":\"COMMERCIAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/programs/prog-dbfe1489-f3ba-3f5a-6904-9b9ad91ceaf"
                + "6\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"prog-8a9e37bf-d9a9-a40a-96c4-e"
                + "286d1fa8fc5\",\"currency\":\"USD\",\"bank\":\"PATHWARD\",\"electricWallets\":[{"
                + "\"type\":\"TIGO_MONEY\",\"electronicWalletCountry\":\"SV\",\"electronicWalletCur"
                + "rency\":\"USD\"},{\"type\":\"TIGO_MONEY\",\"electronicWalletCountry\":\"GT\",\"e"
                + "lectronicWalletCurrency\":\"GTQ\"},{\"type\":\"AIRTEL_MONEY\",\"electronicWallet"
                + "Country\":\"TZ\",\"electronicWalletCurrency\":\"TZS\"},{\"type\":\"MCASH\",\"ele"
                + "ctronicWalletCountry\":\"LK\",\"electronicWalletCurrency\":\"LKR\"}],\"type\":"
                + "\"COMMERCIAL\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/p"
                + "rograms/prog-8a9e37bf-d9a9-a40a-96c4-e286d1fa8fc5\",\"params\":{\"rel\":\"self"
                + "\"}}]},{\"token\":\"prog-76f58bb0-c8ae-d0fa-d1e4-15143ffb53fa\",\"currency\":\"E"
                + "UR\",\"bank\":\"PPS\",\"electricWallets\":[],\"type\":\"COMMERCIAL\",\"links\":["
                + "{\"href\":\"https://api.sandbox.payquicker.io/api/v2/programs/prog-76f58bb0-c8ae"
                + "-d0fa-d1e4-15143ffb53fa\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"prog-bbd"
                + "e39a9-04ca-1c0a-5d74-758a4ad47b84\",\"currency\":\"GBP\",\"bank\":\"PPS\",\"elec"
                + "tricWallets\":[],\"type\":\"COMMERCIAL\",\"links\":[{\"href\":\"https://api.sand"
                + "box.payquicker.io/api/v2/programs/prog-bbde39a9-04ca-1c0a-5d74-758a4ad47b84\","
                + "\"params\":{\"rel\":\"self\"}}]},{\"token\":\"prog-8136128b-3f5b-2f69-15a4-f2559"
                + "2ebce51\",\"currency\":\"MXN\",\"bank\":\"PATHWARD\",\"electricWallets\":[],\"ty"
                + "pe\":\"COMMERCIAL\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api"
                + "/v2/programs/prog-8136128b-3f5b-2f69-15a4-f25592ebce51\",\"params\":{\"rel\":\"s"
                + "elf\"}}]},{\"token\":\"prog-42469a3e-15c8-11f8-02a4-1053f176700e\",\"currency\":"
                + "\"EUR\",\"bank\":\"PATHWARD\",\"electricWallets\":[{\"type\":\"TIGO_MONEY\",\"el"
                + "ectronicWalletCountry\":\"SV\",\"electronicWalletCurrency\":\"USD\"},{\"type\":"
                + "\"TIGO_MONEY\",\"electronicWalletCountry\":\"GT\",\"electronicWalletCurrency\":"
                + "\"GTQ\"},{\"type\":\"AIRTEL_MONEY\",\"electronicWalletCountry\":\"TZ\",\"electro"
                + "nicWalletCurrency\":\"TZS\"},{\"type\":\"MCASH\",\"electronicWalletCountry\":\"L"
                + "K\",\"electronicWalletCurrency\":\"LKR\"}],\"type\":\"COMMERCIAL\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/programs/prog-42469a3e-15c8-"
                + "11f8-02a4-1053f176700e\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"prog-f872"
                + "5c56-b289-8f4b-1f94-cd27f2963cbf\",\"currency\":\"HKD\",\"bank\":\"PATHWARD\","
                + "\"electricWallets\":[],\"type\":\"COMMERCIAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/programs/prog-f8725c56-b289-8f4b-1f94-cd27f2963cb"
                + "f\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"prog-95753dc7-0b4a-65a9-7bd4-6"
                + "504b6774cb9\",\"currency\":\"USD\",\"bank\":\"MCB\",\"electricWallets\":[],\"typ"
                + "e\":\"CONSUMER_GPR\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/ap"
                + "i/v2/programs/prog-95753dc7-0b4a-65a9-7bd4-6504b6774cb9\",\"params\":{\"rel\":"
                + "\"self\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0"
                + "\",\"recordCount\":\"0\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference"
                + "-value\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/progra"
                + "ms\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [program](page:resources/programs) by its program token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveProgram() throws Exception {
        // Parameters for the API call
        String programToken = 
                "prog-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        ProgramResult result = null;
        try {
            result = controller.retrieveProgram(programToken, language);
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
                "{\"token\":\"prog-6a272eca-9487-d83a-c9e4-8df8c9a7f6eb\",\"currency\":\"USD\",\"ba"
                + "nk\":\"MCB\",\"electricWallets\":[{\"type\":\"TIGO_MONEY\",\"electronicWalletCou"
                + "ntry\":\"SV\",\"electronicWalletCurrency\":\"USD\"},{\"type\":\"TIGO_MONEY\",\"e"
                + "lectronicWalletCountry\":\"GT\",\"electronicWalletCurrency\":\"GTQ\"},{\"type\":"
                + "\"AIRTEL_MONEY\",\"electronicWalletCountry\":\"TZ\",\"electronicWalletCurrency"
                + "\":\"TZS\"},{\"type\":\"MCASH\",\"electronicWalletCountry\":\"LK\",\"electronicW"
                + "alletCurrency\":\"LKR\"}],\"type\":\"CONSUMER_GPR\",\"links\":[{\"href\":\"https"
                + "://api.sandbox.payquicker.io/api/v2/programs/prog-6a272eca-9487-d83a-c9e4-8df8c9"
                + "a7f6eb\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"reques"
                + "tRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

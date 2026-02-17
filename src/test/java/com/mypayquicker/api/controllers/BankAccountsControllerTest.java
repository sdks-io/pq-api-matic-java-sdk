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
import com.mypayquicker.api.models.BankAccountListResult;
import com.mypayquicker.api.models.BankAccountRequirementListResult;
import com.mypayquicker.api.models.BankAccountResult;
import com.mypayquicker.api.models.Countries;
import com.mypayquicker.api.models.CreateOrUpdateBankAccount;
import com.mypayquicker.api.models.Currencies;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.OperationResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static BankAccountsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getBankAccountsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [bank accounts](page:resources/bank-accounts) that supports filtering,
     * sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListBankAccounts() throws Exception {
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
        BankAccountListResult result = null;
        try {
            result = controller.listBankAccounts(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"dest-969daa60-c743-4e4f-8609-559874f26d6c\",\"bankAccou"
                + "ntOwnershipType\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\","
                + "\"createdOn\":\"2022-05-20T16:26:25Z\",\"description\":\"Official USD Testing Ba"
                + "nk Account 2\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7899\"},{\"key"
                + "\":\"BANK_ACH_ABA\",\"value\":\"****5688\"},{\"key\":\"BENEFICIARY_NAME\",\"valu"
                + "e\":\"Harry Grady\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 2\"}],"
                + "\"status\":\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api."
                + "sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/ban"
                + "k-accounts/dest-969daa60-c743-4e4f-8609-559874f26d6c\",\"params\":{\"rel\":\"sel"
                + "f\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"5\",\"pageCount\":\"1\",\"rec"
                + "ordCount\":\"1\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value"
                + "\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-a"
                + "e92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts?page=1&pageSize=5&language=en-"
                + "US\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [bank account](page:resources/bank-accounts) using a user token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateBankAccount() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateBankAccount body = ApiHelper.deserialize(
                "{\"bankAccountOwnershipType\":\"BUSINESS\",\"description\":\"Official USD Testing "
                + "Bank Account 1\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"type\":\"SAVI"
                + "NGS\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"01234567890\"},{\"key\":\"B"
                + "ANK_ACH_ABA\",\"value\":\"012345678\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2"
                + " USD BANK 1\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Hazel Mosciski\"}]}",
                CreateOrUpdateBankAccount.class);

        // Set callback and perform API call
        BankAccountResult result = null;
        try {
            result = controller.createBankAccount(userToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [bank account](page:resources/bank-accounts) using a user token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateBankAccount1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateBankAccount body = ApiHelper.deserialize(
                "{\"bankAccountOwnershipType\":\"BUSINESS\",\"description\":\"Official USD Testing "
                + "Bank Account 1\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"type\":\"SAVI"
                + "NGS\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"01234567890\"},{\"key\":\"B"
                + "ANK_ACH_ABA\",\"value\":\"012345678\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2"
                + " USD BANK 1\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Hazel Mosciski\"}]}",
                CreateOrUpdateBankAccount.class);

        // Set callback and perform API call
        BankAccountResult result = null;
        try {
            result = controller.createBankAccount(userToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [bank account](page:resources/bank-accounts) using a destination token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveBankAccount() throws Exception {
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
        BankAccountResult result = null;
        try {
            result = controller.retrieveBankAccount(userToken, destinationToken, page, pageSize, filter, sort, language);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Update a [bank account](page:resources/bank-accounts). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateBankAccount() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        CreateOrUpdateBankAccount body = ApiHelper.deserialize(
                "{\"bankAccountOwnershipType\":\"BUSINESS\",\"description\":\"Official USD Testing "
                + "Bank Account 1\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"type\":\"SAVI"
                + "NGS\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"01234567890\"},{\"key\":\"B"
                + "ANK_ACH_ABA\",\"value\":\"012345678\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2"
                + " USD BANK 1\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Hazel Mosciski\"}]}",
                CreateOrUpdateBankAccount.class);

        // Set callback and perform API call
        BankAccountResult result = null;
        try {
            result = controller.updateBankAccount(userToken, destinationToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Delete a user [bank account](page:resources/bank-accounts). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteBankAccount() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";

        // Set callback and perform API call
        OperationResult result = null;
        try {
            result = controller.deleteBankAccount(userToken, destinationToken);
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

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCreationRequirements() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        Countries country = Countries.fromString(
                "US");
        Currencies currency = Currencies.fromString(
                "USD");

        // Set callback and perform API call
        BankAccountRequirementListResult result = null;
        try {
            result = controller.retrieveCreationRequirements(userToken, country, currency);
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
                "{\"payload\":[{\"bankCountry\":\"IT\",\"bankCurrency\":\"EUR\",\"requirements\":[{"
                + "\"requirement\":\"BANK_IBAN\",\"format\":{\"example\":\"IT43K0310412701000000820"
                + "420\",\"legend\":[{\"key\":\"IT43K0310412701000000820420\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Example IBAN\"},{\"language\":\"it-IT"
                + "\",\"translation\":\"Esempio IBAN\"}]}]},\"description\":[{\"language\":\"en-US"
                + "\",\"translation\":\"IBAN\"},{\"language\":\"it-IT\",\"translation\":\"IBAN\"}],"
                + "\"validators\":[{\"validatorType\":\"REGEX\",\"expression\":\"^IT\\\\\\\\d{2}[A-"
                + "Z]\\\\\\\\d{10}[0-9A-Z]{12}$\"}]},{\"requirement\":\"BANK_SWIFT_BIC\",\"format"
                + "\":{\"example\":\"01234567890\",\"legend\":[{\"key\":\"01234567890\",\"descripti"
                + "ons\":[{\"language\":\"en-US\",\"translation\":\"Example Swift/BIC\"},{\"languag"
                + "e\":\"it-IT\",\"translation\":\"Esempio Swift/BIC\"}]}]},\"description\":[{\"lan"
                + "guage\":\"en-US\",\"translation\":\"Swift/BIC\"},{\"language\":\"it-IT\",\"trans"
                + "lation\":\"Swift/BIC\"}],\"validators\":[{\"validatorType\":\"REGEX\",\"expressi"
                + "on\":\"^[a-z0-9A-Z]{8,11}$\"}]}],\"quote\":{\"formattedAmount\":\"$4.32 USD (USD"
                + ", en-US), 0,00 â‚¬ EUR (EUR, fr-FR)\",\"amount\":4.32,\"currency\":\"USD\"},\"li"
                + "nks\":[{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}],\"links\":[{\"para"
                + "ms\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of company [bank accounts](page:resources/bank-accounts) that supports
     * filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListCompanyBankAccounts() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        BankAccountListResult result = null;
        try {
            result = controller.listCompanyBankAccounts(accountToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"dest-969daa60-c743-4e4f-8609-559874f26d6c\",\"bankAccou"
                + "ntOwnershipType\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\","
                + "\"createdOn\":\"2022-05-20T16:26:25Z\",\"description\":\"Official USD Testing Ba"
                + "nk Account 2\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7899\"},{\"key"
                + "\":\"BANK_ACH_ABA\",\"value\":\"****5688\"},{\"key\":\"BENEFICIARY_NAME\",\"valu"
                + "e\":\"Harry Grady\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 2\"}],"
                + "\"status\":\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api."
                + "sandbox.payquicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/ban"
                + "k-accounts/dest-969daa60-c743-4e4f-8609-559874f26d6c\",\"params\":{\"rel\":\"sel"
                + "f\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"5\",\"pageCount\":\"1\",\"rec"
                + "ordCount\":\"1\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value"
                + "\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-a"
                + "e92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts?page=1&pageSize=5&language=en-"
                + "US\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a company [bank account](page:resources/bank-accounts) using an account token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCompanyBankAccount() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        CreateOrUpdateBankAccount body = ApiHelper.deserialize(
                "{\"bankAccountOwnershipType\":\"BUSINESS\",\"description\":\"Official USD Testing "
                + "Bank Account 1\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"type\":\"SAVI"
                + "NGS\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"01234567890\"},{\"key\":\"B"
                + "ANK_ACH_ABA\",\"value\":\"012345678\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2"
                + " USD BANK 1\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Hazel Mosciski\"}]}",
                CreateOrUpdateBankAccount.class);

        // Set callback and perform API call
        BankAccountResult result = null;
        try {
            result = controller.createCompanyBankAccount(accountToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a company [bank account](page:resources/bank-accounts) using an account token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCompanyBankAccount1() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        CreateOrUpdateBankAccount body = ApiHelper.deserialize(
                "{\"bankAccountOwnershipType\":\"BUSINESS\",\"description\":\"Official USD Testing "
                + "Bank Account 1\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"type\":\"SAVI"
                + "NGS\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"01234567890\"},{\"key\":\"B"
                + "ANK_ACH_ABA\",\"value\":\"012345678\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2"
                + " USD BANK 1\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Hazel Mosciski\"}]}",
                CreateOrUpdateBankAccount.class);

        // Set callback and perform API call
        BankAccountResult result = null;
        try {
            result = controller.createCompanyBankAccount(accountToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single company [bank account](page:resources/bank-accounts) using a destination
     * token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCompanyBankAccount() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
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
        BankAccountResult result = null;
        try {
            result = controller.retrieveCompanyBankAccount(accountToken, destinationToken, page, pageSize, filter, sort, language);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Update a company [bank account](page:resources/bank-accounts). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateCompanyBankAccount() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        CreateOrUpdateBankAccount body = ApiHelper.deserialize(
                "{\"bankAccountOwnershipType\":\"BUSINESS\",\"description\":\"Official USD Testing "
                + "Bank Account 1\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"type\":\"SAVI"
                + "NGS\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"01234567890\"},{\"key\":\"B"
                + "ANK_ACH_ABA\",\"value\":\"012345678\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2"
                + " USD BANK 1\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Hazel Mosciski\"}]}",
                CreateOrUpdateBankAccount.class);

        // Set callback and perform API call
        BankAccountResult result = null;
        try {
            result = controller.updateCompanyBankAccount(accountToken, destinationToken, body);
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
                "{\"token\":\"dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"bankAccountOwnershipTyp"
                + "e\":\"BUSINESS\",\"bankCountry\":\"US\",\"bankCurrency\":\"USD\",\"createdOn\":"
                + "\"2022-05-20T15:48:54Z\",\"description\":\"Official USD Testing Bank Account 1"
                + "\",\"fields\":[{\"key\":\"BANK_BBAN\",\"value\":\"****7890\"},{\"key\":\"BANK_AC"
                + "H_ABA\",\"value\":\"****5678\"},{\"key\":\"BENEFICIARY_NAME\",\"value\":\"Dennis"
                + " Bruen\"},{\"key\":\"BANK_NAME\",\"value\":\"API V2 USD BANK 1\"}],\"status\":"
                + "\"VERIFIED\",\"type\":\"SAVINGS\",\"links\":[{\"href\":\"https://api.sandbox.pay"
                + "quicker.io/api/v2/users/user-ae92315b-6190-4e56-bdf5-c0189ac420a1/bank-accounts/"
                + "dest-41579f58-35dd-4f7b-9252-aa3e337a2eb4\",\"params\":{\"rel\":\"self\"}}],\"me"
                + "ta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Delete a company [bank account](page:resources/bank-accounts). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteCompanyBankAccount() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";

        // Set callback and perform API call
        OperationResult result = null;
        try {
            result = controller.deleteCompanyBankAccount(accountToken, destinationToken);
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

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * parameters provided. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveCompanyBankAccountCreationRequirements() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        Countries country = Countries.fromString(
                "US");
        Currencies currency = Currencies.fromString(
                "USD");

        // Set callback and perform API call
        BankAccountRequirementListResult result = null;
        try {
            result = controller.retrieveCompanyBankAccountCreationRequirements(accountToken, country, currency);
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
                "{\"payload\":[{\"bankCountry\":\"IT\",\"bankCurrency\":\"EUR\",\"requirements\":[{"
                + "\"requirement\":\"BANK_IBAN\",\"format\":{\"example\":\"IT43K0310412701000000820"
                + "420\",\"legend\":[{\"key\":\"IT43K0310412701000000820420\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Example IBAN\"},{\"language\":\"it-IT"
                + "\",\"translation\":\"Esempio IBAN\"}]}]},\"description\":[{\"language\":\"en-US"
                + "\",\"translation\":\"IBAN\"},{\"language\":\"it-IT\",\"translation\":\"IBAN\"}],"
                + "\"validators\":[{\"validatorType\":\"REGEX\",\"expression\":\"^IT\\\\\\\\d{2}[A-"
                + "Z]\\\\\\\\d{10}[0-9A-Z]{12}$\"}]},{\"requirement\":\"BANK_SWIFT_BIC\",\"format"
                + "\":{\"example\":\"01234567890\",\"legend\":[{\"key\":\"01234567890\",\"descripti"
                + "ons\":[{\"language\":\"en-US\",\"translation\":\"Example Swift/BIC\"},{\"languag"
                + "e\":\"it-IT\",\"translation\":\"Esempio Swift/BIC\"}]}]},\"description\":[{\"lan"
                + "guage\":\"en-US\",\"translation\":\"Swift/BIC\"},{\"language\":\"it-IT\",\"trans"
                + "lation\":\"Swift/BIC\"}],\"validators\":[{\"validatorType\":\"REGEX\",\"expressi"
                + "on\":\"^[a-z0-9A-Z]{8,11}$\"}]}],\"quote\":{\"formattedAmount\":\"$4.32 USD (USD"
                + ", en-US), 0,00 â‚¬ EUR (EUR, fr-FR)\",\"amount\":4.32,\"currency\":\"USD\"},\"li"
                + "nks\":[{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}],\"links\":[{\"para"
                + "ms\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve requirements for adding a [bank account](page:resources/bank-accounts) using the
     * pre-paid card as the destination. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveBankAccountCreationRequirementsForAPrepaidCard() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        Countries country = Countries.fromString(
                "US");
        Currencies currency = Currencies.fromString(
                "USD");

        // Set callback and perform API call
        BankAccountRequirementListResult result = null;
        try {
            result = controller.retrieveBankAccountCreationRequirementsForAPrepaidCard(userToken, destinationToken, country, currency);
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
                "{\"payload\":[{\"bankCountry\":\"IT\",\"bankCurrency\":\"EUR\",\"requirements\":[{"
                + "\"requirement\":\"BANK_IBAN\",\"format\":{\"example\":\"IT43K0310412701000000820"
                + "420\",\"legend\":[{\"key\":\"IT43K0310412701000000820420\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Example IBAN\"},{\"language\":\"it-IT"
                + "\",\"translation\":\"Esempio IBAN\"}]}]},\"description\":[{\"language\":\"en-US"
                + "\",\"translation\":\"IBAN\"},{\"language\":\"it-IT\",\"translation\":\"IBAN\"}],"
                + "\"validators\":[{\"validatorType\":\"REGEX\",\"expression\":\"^IT\\\\\\\\d{2}[A-"
                + "Z]\\\\\\\\d{10}[0-9A-Z]{12}$\"}]},{\"requirement\":\"BANK_SWIFT_BIC\",\"format"
                + "\":{\"example\":\"01234567890\",\"legend\":[{\"key\":\"01234567890\",\"descripti"
                + "ons\":[{\"language\":\"en-US\",\"translation\":\"Example Swift/BIC\"},{\"languag"
                + "e\":\"it-IT\",\"translation\":\"Esempio Swift/BIC\"}]}]},\"description\":[{\"lan"
                + "guage\":\"en-US\",\"translation\":\"Swift/BIC\"},{\"language\":\"it-IT\",\"trans"
                + "lation\":\"Swift/BIC\"}],\"validators\":[{\"validatorType\":\"REGEX\",\"expressi"
                + "on\":\"^[a-z0-9A-Z]{8,11}$\"}]}],\"quote\":{\"formattedAmount\":\"$4.32 USD (USD"
                + ", en-US), 0,00 â‚¬ EUR (EUR, fr-FR)\",\"amount\":4.32,\"currency\":\"USD\"},\"li"
                + "nks\":[{\"params\":{\"rel\":\"self\"},\"href\":\"string\"}]}],\"links\":[{\"para"
                + "ms\":{\"rel\":\"self\"},\"href\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

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
import com.mypayquicker.api.models.ReceiptListResult;
import com.mypayquicker.api.models.ReceiptResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReceiptsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ReceiptsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getReceiptsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of all account(s) [receipts](page:resources/receipts) that supports
     * filtering, sorting, and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAccountReceipts() throws Exception {
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
        ReceiptListResult result = null;
        try {
            result = controller.listAccountReceipts(accountToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"rcpt-86674764-9b7a-4b31-adce-bd3299172f1f\",\"type\":"
                + "\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-05-04T18:50:36Z\",\"sign\":"
                + "\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destin"
                + "ationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97d\",\"amount\":-96.82,\"c"
                + "urrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-U"
                + "S\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hilpert)\"}],\"details\":{"
                + "\"memo\":\"User To User - memo\",\"note\":\"User To User - note\",\"correlationT"
                + "oken\":\"xfer-25c89128-733a-49c2-ac47-31fdfb7e2629\"},\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/receipts/rcpt-86674764-9b7a-4b31-adce-bd3299172f1f\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-09b52cad-9e83-46d9-b36f-5d59e560de3a\",\"type\":"
                + "\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-05-04T06:48:44Z\",\"sign\":"
                + "\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destin"
                + "ationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97d\",\"amount\":-96.82,\"c"
                + "urrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-U"
                + "S\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hilpert)\"}],\"details\":{"
                + "\"memo\":\"User To User - memo\",\"note\":\"User To User - note\",\"correlationT"
                + "oken\":\"xfer-bc1571c2-f748-4478-9748-56018209c2a9\"},\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/receipts/rcpt-09b52cad-9e83-46d9-b36f-5d59e560de3a\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-5a7542e4-1bfe-4112-bbe6-8b8db53ffe1e\",\"type\":"
                + "\"SPENDBACK_RETURN\",\"createdOn\":\"2022-05-04T06:04:43Z\",\"sign\":\"CREDIT\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken"
                + "\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":78.98,\"currency\":"
                + "\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"tran"
                + "slation\":\"Refund for purchase ARIS07D7VANJRJN2C from \"}],\"details\":{\"corre"
                + "lationToken\":\"spnd-42a5c7e9-63be-4686-988f-e184fce663cd\"},\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887"
                + "-d905172fb4bc/receipts/rcpt-5a7542e4-1bfe-4112-bbe6-8b8db53ffe1e\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"rcpt-19b7dd3b-e597-4759-b55e-608a8efbd7cc\","
                + "\"type\":\"SPENDBACK\",\"createdOn\":\"2022-05-04T06:04:14Z\",\"sign\":\"DEBIT"
                + "\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationTo"
                + "ken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-78.98,\"currency"
                + "\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"t"
                + "ranslation\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToke"
                + "n\":\"spnd-7daae4c3-3766-4beb-9b26-c2b3d4dadf27\"},\"links\":[{\"href\":\"https:"
                + "//api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4"
                + "bc/receipts/rcpt-19b7dd3b-e597-4759-b55e-608a8efbd7cc\",\"params\":{\"rel\":\"se"
                + "lf\"}}]},{\"token\":\"rcpt-1736aaff-b952-40bf-96bf-742cb12f092d\",\"type\":\"SPE"
                + "NDBACK_RETURN\",\"createdOn\":\"2022-05-03T18:57:33Z\",\"sign\":\"CREDIT\",\"sou"
                + "rceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":"
                + "\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":300,\"currency\":\"USD"
                + "\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Refund for purchase ARIS07D7VANJRJN07 from \"}],\"details\":{\"correlatio"
                + "nToken\":\"spnd-28b73a28-8b9b-4a75-98ca-b9492d777695\"},\"links\":[{\"href\":\"h"
                + "ttps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d9051"
                + "72fb4bc/receipts/rcpt-1736aaff-b952-40bf-96bf-742cb12f092d\",\"params\":{\"rel"
                + "\":\"self\"}}]},{\"token\":\"rcpt-ad5e8d05-be48-492d-8368-aa0122e805de\",\"type"
                + "\":\"SPENDBACK\",\"createdOn\":\"2022-05-03T18:57:25Z\",\"sign\":\"DEBIT\",\"sou"
                + "rceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD"
                + "\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"sp"
                + "nd-ac4ad980-2b72-415e-80ef-890ba4bc107e\"},\"links\":[{\"href\":\"https://api.sa"
                + "ndbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/recei"
                + "pts/rcpt-ad5e8d05-be48-492d-8368-aa0122e805de\",\"params\":{\"rel\":\"self\"}}]}"
                + ",{\"token\":\"rcpt-2de81d8a-573b-46a1-ab4b-ec691a100f2e\",\"type\":\"SPENDBACK_R"
                + "ETURN\",\"createdOn\":\"2022-05-03T16:53:21Z\",\"sign\":\"CREDIT\",\"sourceToken"
                + "\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":\"user-2bb"
                + "fc967-d12e-4647-a887-d905172fb4bc\",\"amount\":15,\"currency\":\"USD\",\"status"
                + "\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Part"
                + "ial refund for purchase ARIS07D7UN68D27PP from \"}],\"details\":{\"correlationTo"
                + "ken\":\"spnd-16e75c71-dc71-4c49-8500-475715c098ac\"},\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/receipts/rcpt-2de81d8a-573b-46a1-ab4b-ec691a100f2e\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-c5a43c8c-be7a-4297-a348-6010d4342935\",\"type\":"
                + "\"SPENDBACK\",\"createdOn\":\"2022-05-03T16:53:00Z\",\"sign\":\"DEBIT\",\"source"
                + "Token\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"acc"
                + "t-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD\","
                + "\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation"
                + "\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"spnd"
                + "-59c3529d-18c2-460e-b422-ad548fab256c\"},\"links\":[{\"href\":\"https://api.sand"
                + "box.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipt"
                + "s/rcpt-c5a43c8c-be7a-4297-a348-6010d4342935\",\"params\":{\"rel\":\"self\"}}]},{"
                + "\"token\":\"rcpt-220101e5-b2b6-429f-bd76-0a790b70b42d\",\"type\":\"SPENDBACK\","
                + "\"createdOn\":\"2022-05-02T20:40:39Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user"
                + "-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD\",\"status\":\"COM"
                + "PLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Purchase fro"
                + "m Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"spnd-4c414196-d3dd-42"
                + "33-a729-6fc2da0810eb\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io"
                + "/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-220101e5-b"
                + "2b6-429f-bd76-0a790b70b42d\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-"
                + "bf34989d-0b13-47ee-bd51-b96b0ecbe866\",\"type\":\"PREPAID_CARD_LOAD\",\"createdO"
                + "n\":\"2022-04-29T19:27:08Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"dest-b61bc870-8ab8-4870-a20"
                + "9-6398b60269d5\",\"amount\":-25,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"d"
                + "escriptions\":[{\"language\":\"en-US\",\"translation\":\"Transfer to Arco MCB Ga"
                + "teway Commission Account (USD) - $25.00 USD (Conversion rate: 1)\"}],\"details"
                + "\":{\"cardExpiryDate\":\"04/2025\",\"cardHolderName\":\"Timothy Mueller\",\"card"
                + "Number\":\"************3940\",\"memo\":\"Memo - Card Transfer 1\",\"note\":\"Not"
                + "e - Card Transfer 1\",\"correlationToken\":\"xfer-bf34989d-0b13-47ee-bd51-b96b0e"
                + "cbe866\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-bf34989d-0b13-47ee-bd51-"
                + "b96b0ecbe866\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-022b3730-e62e-"
                + "4ee3-8af9-714a06dadf3c\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-29T19:20:2"
                + "2Z\",\"sign\":\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b14"
                + "7860\",\"destinationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amou"
                + "nt\":1500,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"lang"
                + "uage\":\"en-US\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],"
                + "\"details\":{\"correlationToken\":\"pmnt-87c94572-8241-4c46-976e-0f0dfe3211a6\"}"
                + ",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbf"
                + "c967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-022b3730-e62e-4ee3-8af9-714a06dad"
                + "f3c\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-24e6c58c-5819-41fa-8dd4"
                + "-15f8920a68e9\",\"type\":\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-04"
                + "-28T22:08:43Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc\",\"destinationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97"
                + "d\",\"amount\":-10,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions"
                + "\":[{\"language\":\"en-US\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hi"
                + "lpert)\"}],\"details\":{\"memo\":\"User To User - memo\",\"note\":\"User To User"
                + " - note\",\"correlationToken\":\"xfer-aa657951-d6bc-4023-a3a7-377738650b28\"},"
                + "\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc"
                + "967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-24e6c58c-5819-41fa-8dd4-15f8920a68"
                + "e9\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-20c97ff0-b83c-403a-aad7-"
                + "25a00bdd80af\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-27T22:23:"
                + "57Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amou"
                + "nt\":-1000.22,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Retraction for ARIS07D0RVW6VKY02\"}],"
                + "\"details\":{\"correlationToken\":\"pmnt-4c19e750-c901-484c-acba-12979e8c6b58\"}"
                + ",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbf"
                + "c967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-20c97ff0-b83c-403a-aad7-25a00bdd8"
                + "0af\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-ddc68526-8b18-42b6-9fac"
                + "-75a04d580d6f\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-27T22:23:31Z\",\"si"
                + "gn\":\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\","
                + "\"destinationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":10"
                + "00.22,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language"
                + "\":\"en-US\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],\"det"
                + "ails\":{\"correlationToken\":\"pmnt-51297345-c803-44ab-9e2e-70713142dd58\"},\"li"
                + "nks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc/receipts/rcpt-ddc68526-8b18-42b6-9fac-75a04d580d6f"
                + "\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-be174879-7829-4275-a0e6-16"
                + "4a7d5b5251\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-27T22:19:17"
                + "Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4"
                + "bc\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount"
                + "\":-1500,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"langu"
                + "age\":\"en-US\",\"translation\":\"Retraction for ARIS07D0RVW6VKXZS\"}],\"details"
                + "\":{\"correlationToken\":\"pmnt-61db2938-fa74-48e9-a3f1-b83d21f492d8\"},\"links"
                + "\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12"
                + "e-4647-a887-d905172fb4bc/receipts/rcpt-be174879-7829-4275-a0e6-164a7d5b5251\","
                + "\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-3baa92d6-a443-4b45-a245-b34ad"
                + "51c85f6\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-27T22:18:56Z\",\"sign\":"
                + "\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"desti"
                + "nationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":1500,\"cu"
                + "rrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US"
                + "\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],\"details\":{"
                + "\"correlationToken\":\"pmnt-c99be127-65b2-474b-bf3a-80f4f6133f6a\"},\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-464"
                + "7-a887-d905172fb4bc/receipts/rcpt-3baa92d6-a443-4b45-a245-b34ad51c85f6\",\"param"
                + "s\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-d91a1d65-adab-43b1-8f33-9f5a9fac8da7"
                + "\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-26T17:45:22Z\",\"sign"
                + "\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"des"
                + "tinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-78.98,"
                + "\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"e"
                + "n-US\",\"translation\":\"Retraction for ARIS07CW0646GSO3H\"}],\"details\":{\"cor"
                + "relationToken\":\"pmnt-f293a55f-fae4-45cd-b63c-3023e02ef699\"},\"links\":[{\"hre"
                + "f\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc/receipts/rcpt-d91a1d65-adab-43b1-8f33-9f5a9fac8da7\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"rcpt-5c1ec450-09c5-4f97-828f-94f843f755f1\","
                + "\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-26T17:11:29Z\",\"sign\":\"CREDIT\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken"
                + "\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":78.98,\"currency\":"
                + "\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"tran"
                + "slation\":\"Payment received from  Arco MCB Gateway\"}],\"details\":{\"correlati"
                + "onToken\":\"pmnt-9d60431b-8bcd-41a7-a002-1669426dac21\"},\"links\":[{\"href\":"
                + "\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d9"
                + "05172fb4bc/receipts/rcpt-5c1ec450-09c5-4f97-828f-94f843f755f1\",\"params\":{\"re"
                + "l\":\"self\"}}]},{\"token\":\"rcpt-74abe865-7719-438d-8fa2-b27cdb03ec06\",\"type"
                + "\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-26T15:47:39Z\",\"sign\":\"DEBI"
                + "T\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationT"
                + "oken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-1500,\"currency"
                + "\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"t"
                + "ranslation\":\"Retraction for ARIS07CVR5THWRZML\"}],\"details\":{\"correlationTo"
                + "ken\":\"pmnt-ab72dd70-37f1-4024-9b44-525ae6e634a4\"},\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/receipts/rcpt-74abe865-7719-438d-8fa2-b27cdb03ec06\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-e3abab12-bcaa-41fd-91d3-3819f27e8eba\",\"type\":"
                + "\"PAYMENT\",\"createdOn\":\"2022-04-26T15:47:31Z\",\"sign\":\"CREDIT\",\"sourceT"
                + "oken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":\"user"
                + "-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":1500,\"currency\":\"USD\",\"s"
                + "tatus\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":"
                + "\"Payment received from  Arco MCB Gateway\"}],\"details\":{\"correlationToken\":"
                + "\"pmnt-9aca4986-fab9-4d39-8370-a7724b71ace1\"},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/r"
                + "eceipts/rcpt-e3abab12-bcaa-41fd-91d3-3819f27e8eba\",\"params\":{\"rel\":\"self"
                + "\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"20\",\"pageCount\":\"2\",\"rec"
                + "ordCount\":\"22\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value"
                + "\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2"
                + "bbfc967-d12e-4647-a887-d905172fb4bc/receipts?pageSize=20&language=en-US\",\"para"
                + "ms\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single account [receipt](page:resources/receipts) .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveAccountReceipt() throws Exception {
        // Parameters for the API call
        String accountToken = 
                "acct-3908ab5a-6ce1-474d-8b80-a63a7b147860";
        String receiptToken = 
                "rcpt-86674764-9b7a-4b31-adce-bd3299172f1f";

        // Set callback and perform API call
        ReceiptResult result = null;
        try {
            result = controller.retrieveAccountReceipt(accountToken, receiptToken);
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
                "{\"token\":\"rcpt-b58721a3-33e8-4a62-b51d-a997b46fbce0\",\"type\":\"PAYMENT\",\"cr"
                + "eatedOn\":\"2022-05-04T13:19:38Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"acct-443"
                + "3f040-4ad5-41e5-a6e3-c9611a7be95e\",\"destinationToken\":\"user-cf6244d7-f6b8-46"
                + "25-906a-9f21fc8c774b\",\"amount\":-1500,\"currency\":\"USD\",\"status\":\"COMPLE"
                + "TE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Payment sent to"
                + " Boutique Partner Cale Cruickshank (Izaiah_McCullough)\"}],\"details\":{\"memo"
                + "\":\"Payment 1 Memo\",\"note\":\"Payment 1 Note\",\"correlationToken\":\"pmnt-1d"
                + "4ae3b0-09c9-402a-8d38-3de1bfdbd1e3\"},\"links\":[{\"href\":\"https://api.sandbox"
                + ".payquicker.io/api/v2/accounts/acct-4433f040-4ad5-41e5-a6e3-c9611a7be95e/receipt"
                + "s/rcpt-b58721a3-33e8-4a62-b51d-a997b46fbce0\",\"params\":{\"rel\":\"self\"}}],"
                + "\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of [prepaid card](page:resources/prepaid-cards)
     * [receipts](page:resources/receipts) that supports filtering, sorting, and pagination through
     * existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListPrepaidCardReceipts() throws Exception {
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
        ReceiptListResult result = null;
        try {
            result = controller.listPrepaidCardReceipts(userToken, destinationToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"rcpt-86674764-9b7a-4b31-adce-bd3299172f1f\",\"type\":"
                + "\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-05-04T18:50:36Z\",\"sign\":"
                + "\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destin"
                + "ationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97d\",\"amount\":-96.82,\"c"
                + "urrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-U"
                + "S\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hilpert)\"}],\"details\":{"
                + "\"memo\":\"User To User - memo\",\"note\":\"User To User - note\",\"correlationT"
                + "oken\":\"xfer-25c89128-733a-49c2-ac47-31fdfb7e2629\"},\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/receipts/rcpt-86674764-9b7a-4b31-adce-bd3299172f1f\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-09b52cad-9e83-46d9-b36f-5d59e560de3a\",\"type\":"
                + "\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-05-04T06:48:44Z\",\"sign\":"
                + "\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destin"
                + "ationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97d\",\"amount\":-96.82,\"c"
                + "urrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-U"
                + "S\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hilpert)\"}],\"details\":{"
                + "\"memo\":\"User To User - memo\",\"note\":\"User To User - note\",\"correlationT"
                + "oken\":\"xfer-bc1571c2-f748-4478-9748-56018209c2a9\"},\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/receipts/rcpt-09b52cad-9e83-46d9-b36f-5d59e560de3a\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-5a7542e4-1bfe-4112-bbe6-8b8db53ffe1e\",\"type\":"
                + "\"SPENDBACK_RETURN\",\"createdOn\":\"2022-05-04T06:04:43Z\",\"sign\":\"CREDIT\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken"
                + "\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":78.98,\"currency\":"
                + "\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"tran"
                + "slation\":\"Refund for purchase ARIS07D7VANJRJN2C from \"}],\"details\":{\"corre"
                + "lationToken\":\"spnd-42a5c7e9-63be-4686-988f-e184fce663cd\"},\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887"
                + "-d905172fb4bc/receipts/rcpt-5a7542e4-1bfe-4112-bbe6-8b8db53ffe1e\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"rcpt-19b7dd3b-e597-4759-b55e-608a8efbd7cc\","
                + "\"type\":\"SPENDBACK\",\"createdOn\":\"2022-05-04T06:04:14Z\",\"sign\":\"DEBIT"
                + "\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationTo"
                + "ken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-78.98,\"currency"
                + "\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"t"
                + "ranslation\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToke"
                + "n\":\"spnd-7daae4c3-3766-4beb-9b26-c2b3d4dadf27\"},\"links\":[{\"href\":\"https:"
                + "//api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4"
                + "bc/receipts/rcpt-19b7dd3b-e597-4759-b55e-608a8efbd7cc\",\"params\":{\"rel\":\"se"
                + "lf\"}}]},{\"token\":\"rcpt-1736aaff-b952-40bf-96bf-742cb12f092d\",\"type\":\"SPE"
                + "NDBACK_RETURN\",\"createdOn\":\"2022-05-03T18:57:33Z\",\"sign\":\"CREDIT\",\"sou"
                + "rceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":"
                + "\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":300,\"currency\":\"USD"
                + "\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Refund for purchase ARIS07D7VANJRJN07 from \"}],\"details\":{\"correlatio"
                + "nToken\":\"spnd-28b73a28-8b9b-4a75-98ca-b9492d777695\"},\"links\":[{\"href\":\"h"
                + "ttps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d9051"
                + "72fb4bc/receipts/rcpt-1736aaff-b952-40bf-96bf-742cb12f092d\",\"params\":{\"rel"
                + "\":\"self\"}}]},{\"token\":\"rcpt-ad5e8d05-be48-492d-8368-aa0122e805de\",\"type"
                + "\":\"SPENDBACK\",\"createdOn\":\"2022-05-03T18:57:25Z\",\"sign\":\"DEBIT\",\"sou"
                + "rceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD"
                + "\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"sp"
                + "nd-ac4ad980-2b72-415e-80ef-890ba4bc107e\"},\"links\":[{\"href\":\"https://api.sa"
                + "ndbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/recei"
                + "pts/rcpt-ad5e8d05-be48-492d-8368-aa0122e805de\",\"params\":{\"rel\":\"self\"}}]}"
                + ",{\"token\":\"rcpt-2de81d8a-573b-46a1-ab4b-ec691a100f2e\",\"type\":\"SPENDBACK_R"
                + "ETURN\",\"createdOn\":\"2022-05-03T16:53:21Z\",\"sign\":\"CREDIT\",\"sourceToken"
                + "\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":\"user-2bb"
                + "fc967-d12e-4647-a887-d905172fb4bc\",\"amount\":15,\"currency\":\"USD\",\"status"
                + "\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Part"
                + "ial refund for purchase ARIS07D7UN68D27PP from \"}],\"details\":{\"correlationTo"
                + "ken\":\"spnd-16e75c71-dc71-4c49-8500-475715c098ac\"},\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/receipts/rcpt-2de81d8a-573b-46a1-ab4b-ec691a100f2e\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-c5a43c8c-be7a-4297-a348-6010d4342935\",\"type\":"
                + "\"SPENDBACK\",\"createdOn\":\"2022-05-03T16:53:00Z\",\"sign\":\"DEBIT\",\"source"
                + "Token\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"acc"
                + "t-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD\","
                + "\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation"
                + "\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"spnd"
                + "-59c3529d-18c2-460e-b422-ad548fab256c\"},\"links\":[{\"href\":\"https://api.sand"
                + "box.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipt"
                + "s/rcpt-c5a43c8c-be7a-4297-a348-6010d4342935\",\"params\":{\"rel\":\"self\"}}]},{"
                + "\"token\":\"rcpt-220101e5-b2b6-429f-bd76-0a790b70b42d\",\"type\":\"SPENDBACK\","
                + "\"createdOn\":\"2022-05-02T20:40:39Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user"
                + "-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD\",\"status\":\"COM"
                + "PLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Purchase fro"
                + "m Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"spnd-4c414196-d3dd-42"
                + "33-a729-6fc2da0810eb\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io"
                + "/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-220101e5-b"
                + "2b6-429f-bd76-0a790b70b42d\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-"
                + "bf34989d-0b13-47ee-bd51-b96b0ecbe866\",\"type\":\"PREPAID_CARD_LOAD\",\"createdO"
                + "n\":\"2022-04-29T19:27:08Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"dest-b61bc870-8ab8-4870-a20"
                + "9-6398b60269d5\",\"amount\":-25,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"d"
                + "escriptions\":[{\"language\":\"en-US\",\"translation\":\"Transfer to Arco MCB Ga"
                + "teway Commission Account (USD) - $25.00 USD (Conversion rate: 1)\"}],\"details"
                + "\":{\"cardExpiryDate\":\"04/2025\",\"cardHolderName\":\"Timothy Mueller\",\"card"
                + "Number\":\"************3940\",\"memo\":\"Memo - Card Transfer 1\",\"note\":\"Not"
                + "e - Card Transfer 1\",\"correlationToken\":\"xfer-bf34989d-0b13-47ee-bd51-b96b0e"
                + "cbe866\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-bf34989d-0b13-47ee-bd51-"
                + "b96b0ecbe866\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-022b3730-e62e-"
                + "4ee3-8af9-714a06dadf3c\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-29T19:20:2"
                + "2Z\",\"sign\":\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b14"
                + "7860\",\"destinationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amou"
                + "nt\":1500,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"lang"
                + "uage\":\"en-US\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],"
                + "\"details\":{\"correlationToken\":\"pmnt-87c94572-8241-4c46-976e-0f0dfe3211a6\"}"
                + ",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbf"
                + "c967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-022b3730-e62e-4ee3-8af9-714a06dad"
                + "f3c\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-24e6c58c-5819-41fa-8dd4"
                + "-15f8920a68e9\",\"type\":\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-04"
                + "-28T22:08:43Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc\",\"destinationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97"
                + "d\",\"amount\":-10,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions"
                + "\":[{\"language\":\"en-US\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hi"
                + "lpert)\"}],\"details\":{\"memo\":\"User To User - memo\",\"note\":\"User To User"
                + " - note\",\"correlationToken\":\"xfer-aa657951-d6bc-4023-a3a7-377738650b28\"},"
                + "\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc"
                + "967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-24e6c58c-5819-41fa-8dd4-15f8920a68"
                + "e9\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-20c97ff0-b83c-403a-aad7-"
                + "25a00bdd80af\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-27T22:23:"
                + "57Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amou"
                + "nt\":-1000.22,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Retraction for ARIS07D0RVW6VKY02\"}],"
                + "\"details\":{\"correlationToken\":\"pmnt-4c19e750-c901-484c-acba-12979e8c6b58\"}"
                + ",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbf"
                + "c967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-20c97ff0-b83c-403a-aad7-25a00bdd8"
                + "0af\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-ddc68526-8b18-42b6-9fac"
                + "-75a04d580d6f\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-27T22:23:31Z\",\"si"
                + "gn\":\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\","
                + "\"destinationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":10"
                + "00.22,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language"
                + "\":\"en-US\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],\"det"
                + "ails\":{\"correlationToken\":\"pmnt-51297345-c803-44ab-9e2e-70713142dd58\"},\"li"
                + "nks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc/receipts/rcpt-ddc68526-8b18-42b6-9fac-75a04d580d6f"
                + "\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-be174879-7829-4275-a0e6-16"
                + "4a7d5b5251\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-27T22:19:17"
                + "Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4"
                + "bc\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount"
                + "\":-1500,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"langu"
                + "age\":\"en-US\",\"translation\":\"Retraction for ARIS07D0RVW6VKXZS\"}],\"details"
                + "\":{\"correlationToken\":\"pmnt-61db2938-fa74-48e9-a3f1-b83d21f492d8\"},\"links"
                + "\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12"
                + "e-4647-a887-d905172fb4bc/receipts/rcpt-be174879-7829-4275-a0e6-164a7d5b5251\","
                + "\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-3baa92d6-a443-4b45-a245-b34ad"
                + "51c85f6\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-27T22:18:56Z\",\"sign\":"
                + "\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"desti"
                + "nationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":1500,\"cu"
                + "rrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US"
                + "\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],\"details\":{"
                + "\"correlationToken\":\"pmnt-c99be127-65b2-474b-bf3a-80f4f6133f6a\"},\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-464"
                + "7-a887-d905172fb4bc/receipts/rcpt-3baa92d6-a443-4b45-a245-b34ad51c85f6\",\"param"
                + "s\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-d91a1d65-adab-43b1-8f33-9f5a9fac8da7"
                + "\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-26T17:45:22Z\",\"sign"
                + "\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"des"
                + "tinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-78.98,"
                + "\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"e"
                + "n-US\",\"translation\":\"Retraction for ARIS07CW0646GSO3H\"}],\"details\":{\"cor"
                + "relationToken\":\"pmnt-f293a55f-fae4-45cd-b63c-3023e02ef699\"},\"links\":[{\"hre"
                + "f\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc/receipts/rcpt-d91a1d65-adab-43b1-8f33-9f5a9fac8da7\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"rcpt-5c1ec450-09c5-4f97-828f-94f843f755f1\","
                + "\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-26T17:11:29Z\",\"sign\":\"CREDIT\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken"
                + "\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":78.98,\"currency\":"
                + "\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"tran"
                + "slation\":\"Payment received from  Arco MCB Gateway\"}],\"details\":{\"correlati"
                + "onToken\":\"pmnt-9d60431b-8bcd-41a7-a002-1669426dac21\"},\"links\":[{\"href\":"
                + "\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d9"
                + "05172fb4bc/receipts/rcpt-5c1ec450-09c5-4f97-828f-94f843f755f1\",\"params\":{\"re"
                + "l\":\"self\"}}]},{\"token\":\"rcpt-74abe865-7719-438d-8fa2-b27cdb03ec06\",\"type"
                + "\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-26T15:47:39Z\",\"sign\":\"DEBI"
                + "T\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationT"
                + "oken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-1500,\"currency"
                + "\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"t"
                + "ranslation\":\"Retraction for ARIS07CVR5THWRZML\"}],\"details\":{\"correlationTo"
                + "ken\":\"pmnt-ab72dd70-37f1-4024-9b44-525ae6e634a4\"},\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/receipts/rcpt-74abe865-7719-438d-8fa2-b27cdb03ec06\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-e3abab12-bcaa-41fd-91d3-3819f27e8eba\",\"type\":"
                + "\"PAYMENT\",\"createdOn\":\"2022-04-26T15:47:31Z\",\"sign\":\"CREDIT\",\"sourceT"
                + "oken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":\"user"
                + "-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":1500,\"currency\":\"USD\",\"s"
                + "tatus\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":"
                + "\"Payment received from  Arco MCB Gateway\"}],\"details\":{\"correlationToken\":"
                + "\"pmnt-9aca4986-fab9-4d39-8370-a7724b71ace1\"},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/r"
                + "eceipts/rcpt-e3abab12-bcaa-41fd-91d3-3819f27e8eba\",\"params\":{\"rel\":\"self"
                + "\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"20\",\"pageCount\":\"2\",\"rec"
                + "ordCount\":\"22\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value"
                + "\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2"
                + "bbfc967-d12e-4647-a887-d905172fb4bc/receipts?pageSize=20&language=en-US\",\"para"
                + "ms\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single user prepaid-card [receipt](page:resources/receipts).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrievePrepaidCardReceipt() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String destinationToken = 
                "dest-4aed86e2-4929-45bf-814d-9030aef21e79";
        String receiptToken = 
                "rcpt-86674764-9b7a-4b31-adce-bd3299172f1f";

        // Set callback and perform API call
        ReceiptResult result = null;
        try {
            result = controller.retrievePrepaidCardReceipt(userToken, destinationToken, receiptToken);
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
                "{\"token\":\"rcpt-b58721a3-33e8-4a62-b51d-a997b46fbce0\",\"type\":\"PAYMENT\",\"cr"
                + "eatedOn\":\"2022-05-04T13:19:38Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"acct-443"
                + "3f040-4ad5-41e5-a6e3-c9611a7be95e\",\"destinationToken\":\"user-cf6244d7-f6b8-46"
                + "25-906a-9f21fc8c774b\",\"amount\":-1500,\"currency\":\"USD\",\"status\":\"COMPLE"
                + "TE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Payment sent to"
                + " Boutique Partner Cale Cruickshank (Izaiah_McCullough)\"}],\"details\":{\"memo"
                + "\":\"Payment 1 Memo\",\"note\":\"Payment 1 Note\",\"correlationToken\":\"pmnt-1d"
                + "4ae3b0-09c9-402a-8d38-3de1bfdbd1e3\"},\"links\":[{\"href\":\"https://api.sandbox"
                + ".payquicker.io/api/v2/accounts/acct-4433f040-4ad5-41e5-a6e3-c9611a7be95e/receipt"
                + "s/rcpt-b58721a3-33e8-4a62-b51d-a997b46fbce0\",\"params\":{\"rel\":\"self\"}}],"
                + "\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of user [receipts](page:resources/receipts) that supports filtering, sorting,
     * and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListUserReceipts() throws Exception {
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
        ReceiptListResult result = null;
        try {
            result = controller.listUserReceipts(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"rcpt-86674764-9b7a-4b31-adce-bd3299172f1f\",\"type\":"
                + "\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-05-04T18:50:36Z\",\"sign\":"
                + "\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destin"
                + "ationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97d\",\"amount\":-96.82,\"c"
                + "urrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-U"
                + "S\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hilpert)\"}],\"details\":{"
                + "\"memo\":\"User To User - memo\",\"note\":\"User To User - note\",\"correlationT"
                + "oken\":\"xfer-25c89128-733a-49c2-ac47-31fdfb7e2629\"},\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/receipts/rcpt-86674764-9b7a-4b31-adce-bd3299172f1f\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-09b52cad-9e83-46d9-b36f-5d59e560de3a\",\"type\":"
                + "\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-05-04T06:48:44Z\",\"sign\":"
                + "\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destin"
                + "ationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97d\",\"amount\":-96.82,\"c"
                + "urrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-U"
                + "S\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hilpert)\"}],\"details\":{"
                + "\"memo\":\"User To User - memo\",\"note\":\"User To User - note\",\"correlationT"
                + "oken\":\"xfer-bc1571c2-f748-4478-9748-56018209c2a9\"},\"links\":[{\"href\":\"htt"
                + "ps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172"
                + "fb4bc/receipts/rcpt-09b52cad-9e83-46d9-b36f-5d59e560de3a\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-5a7542e4-1bfe-4112-bbe6-8b8db53ffe1e\",\"type\":"
                + "\"SPENDBACK_RETURN\",\"createdOn\":\"2022-05-04T06:04:43Z\",\"sign\":\"CREDIT\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken"
                + "\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":78.98,\"currency\":"
                + "\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"tran"
                + "slation\":\"Refund for purchase ARIS07D7VANJRJN2C from \"}],\"details\":{\"corre"
                + "lationToken\":\"spnd-42a5c7e9-63be-4686-988f-e184fce663cd\"},\"links\":[{\"href"
                + "\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887"
                + "-d905172fb4bc/receipts/rcpt-5a7542e4-1bfe-4112-bbe6-8b8db53ffe1e\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"rcpt-19b7dd3b-e597-4759-b55e-608a8efbd7cc\","
                + "\"type\":\"SPENDBACK\",\"createdOn\":\"2022-05-04T06:04:14Z\",\"sign\":\"DEBIT"
                + "\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationTo"
                + "ken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-78.98,\"currency"
                + "\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"t"
                + "ranslation\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToke"
                + "n\":\"spnd-7daae4c3-3766-4beb-9b26-c2b3d4dadf27\"},\"links\":[{\"href\":\"https:"
                + "//api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4"
                + "bc/receipts/rcpt-19b7dd3b-e597-4759-b55e-608a8efbd7cc\",\"params\":{\"rel\":\"se"
                + "lf\"}}]},{\"token\":\"rcpt-1736aaff-b952-40bf-96bf-742cb12f092d\",\"type\":\"SPE"
                + "NDBACK_RETURN\",\"createdOn\":\"2022-05-03T18:57:33Z\",\"sign\":\"CREDIT\",\"sou"
                + "rceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":"
                + "\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":300,\"currency\":\"USD"
                + "\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Refund for purchase ARIS07D7VANJRJN07 from \"}],\"details\":{\"correlatio"
                + "nToken\":\"spnd-28b73a28-8b9b-4a75-98ca-b9492d777695\"},\"links\":[{\"href\":\"h"
                + "ttps://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d9051"
                + "72fb4bc/receipts/rcpt-1736aaff-b952-40bf-96bf-742cb12f092d\",\"params\":{\"rel"
                + "\":\"self\"}}]},{\"token\":\"rcpt-ad5e8d05-be48-492d-8368-aa0122e805de\",\"type"
                + "\":\"SPENDBACK\",\"createdOn\":\"2022-05-03T18:57:25Z\",\"sign\":\"DEBIT\",\"sou"
                + "rceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":"
                + "\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD"
                + "\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"sp"
                + "nd-ac4ad980-2b72-415e-80ef-890ba4bc107e\"},\"links\":[{\"href\":\"https://api.sa"
                + "ndbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/recei"
                + "pts/rcpt-ad5e8d05-be48-492d-8368-aa0122e805de\",\"params\":{\"rel\":\"self\"}}]}"
                + ",{\"token\":\"rcpt-2de81d8a-573b-46a1-ab4b-ec691a100f2e\",\"type\":\"SPENDBACK_R"
                + "ETURN\",\"createdOn\":\"2022-05-03T16:53:21Z\",\"sign\":\"CREDIT\",\"sourceToken"
                + "\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":\"user-2bb"
                + "fc967-d12e-4647-a887-d905172fb4bc\",\"amount\":15,\"currency\":\"USD\",\"status"
                + "\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Part"
                + "ial refund for purchase ARIS07D7UN68D27PP from \"}],\"details\":{\"correlationTo"
                + "ken\":\"spnd-16e75c71-dc71-4c49-8500-475715c098ac\"},\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/receipts/rcpt-2de81d8a-573b-46a1-ab4b-ec691a100f2e\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-c5a43c8c-be7a-4297-a348-6010d4342935\",\"type\":"
                + "\"SPENDBACK\",\"createdOn\":\"2022-05-03T16:53:00Z\",\"sign\":\"DEBIT\",\"source"
                + "Token\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"acc"
                + "t-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD\","
                + "\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation"
                + "\":\"Purchase from Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"spnd"
                + "-59c3529d-18c2-460e-b422-ad548fab256c\"},\"links\":[{\"href\":\"https://api.sand"
                + "box.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipt"
                + "s/rcpt-c5a43c8c-be7a-4297-a348-6010d4342935\",\"params\":{\"rel\":\"self\"}}]},{"
                + "\"token\":\"rcpt-220101e5-b2b6-429f-bd76-0a790b70b42d\",\"type\":\"SPENDBACK\","
                + "\"createdOn\":\"2022-05-02T20:40:39Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user"
                + "-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"acct-3908ab5a-6ce"
                + "1-474d-8b80-a63a7b147860\",\"amount\":-300,\"currency\":\"USD\",\"status\":\"COM"
                + "PLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Purchase fro"
                + "m Arco MCB Gateway\"}],\"details\":{\"correlationToken\":\"spnd-4c414196-d3dd-42"
                + "33-a729-6fc2da0810eb\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io"
                + "/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-220101e5-b"
                + "2b6-429f-bd76-0a790b70b42d\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-"
                + "bf34989d-0b13-47ee-bd51-b96b0ecbe866\",\"type\":\"PREPAID_CARD_LOAD\",\"createdO"
                + "n\":\"2022-04-29T19:27:08Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc\",\"destinationToken\":\"dest-b61bc870-8ab8-4870-a20"
                + "9-6398b60269d5\",\"amount\":-25,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"d"
                + "escriptions\":[{\"language\":\"en-US\",\"translation\":\"Transfer to Arco MCB Ga"
                + "teway Commission Account (USD) - $25.00 USD (Conversion rate: 1)\"}],\"details"
                + "\":{\"cardExpiryDate\":\"04/2025\",\"cardHolderName\":\"Timothy Mueller\",\"card"
                + "Number\":\"************3940\",\"memo\":\"Memo - Card Transfer 1\",\"note\":\"Not"
                + "e - Card Transfer 1\",\"correlationToken\":\"xfer-bf34989d-0b13-47ee-bd51-b96b0e"
                + "cbe866\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/"
                + "user-2bbfc967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-bf34989d-0b13-47ee-bd51-"
                + "b96b0ecbe866\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-022b3730-e62e-"
                + "4ee3-8af9-714a06dadf3c\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-29T19:20:2"
                + "2Z\",\"sign\":\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b14"
                + "7860\",\"destinationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amou"
                + "nt\":1500,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"lang"
                + "uage\":\"en-US\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],"
                + "\"details\":{\"correlationToken\":\"pmnt-87c94572-8241-4c46-976e-0f0dfe3211a6\"}"
                + ",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbf"
                + "c967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-022b3730-e62e-4ee3-8af9-714a06dad"
                + "f3c\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-24e6c58c-5819-41fa-8dd4"
                + "-15f8920a68e9\",\"type\":\"ACCOUNT_TO_ACCOUNT_TRANSFER\",\"createdOn\":\"2022-04"
                + "-28T22:08:43Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc\",\"destinationToken\":\"user-631b200f-665d-4dbe-bd01-3063c9dec97"
                + "d\",\"amount\":-10,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions"
                + "\":[{\"language\":\"en-US\",\"translation\":\"Transfer to Brannon Mertz (Cruz.Hi"
                + "lpert)\"}],\"details\":{\"memo\":\"User To User - memo\",\"note\":\"User To User"
                + " - note\",\"correlationToken\":\"xfer-aa657951-d6bc-4023-a3a7-377738650b28\"},"
                + "\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc"
                + "967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-24e6c58c-5819-41fa-8dd4-15f8920a68"
                + "e9\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-20c97ff0-b83c-403a-aad7-"
                + "25a00bdd80af\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-27T22:23:"
                + "57Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amou"
                + "nt\":-1000.22,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{"
                + "\"language\":\"en-US\",\"translation\":\"Retraction for ARIS07D0RVW6VKY02\"}],"
                + "\"details\":{\"correlationToken\":\"pmnt-4c19e750-c901-484c-acba-12979e8c6b58\"}"
                + ",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbf"
                + "c967-d12e-4647-a887-d905172fb4bc/receipts/rcpt-20c97ff0-b83c-403a-aad7-25a00bdd8"
                + "0af\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-ddc68526-8b18-42b6-9fac"
                + "-75a04d580d6f\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-27T22:23:31Z\",\"si"
                + "gn\":\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\","
                + "\"destinationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":10"
                + "00.22,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language"
                + "\":\"en-US\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],\"det"
                + "ails\":{\"correlationToken\":\"pmnt-51297345-c803-44ab-9e2e-70713142dd58\"},\"li"
                + "nks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-"
                + "d12e-4647-a887-d905172fb4bc/receipts/rcpt-ddc68526-8b18-42b6-9fac-75a04d580d6f"
                + "\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-be174879-7829-4275-a0e6-16"
                + "4a7d5b5251\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-27T22:19:17"
                + "Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4"
                + "bc\",\"destinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount"
                + "\":-1500,\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"langu"
                + "age\":\"en-US\",\"translation\":\"Retraction for ARIS07D0RVW6VKXZS\"}],\"details"
                + "\":{\"correlationToken\":\"pmnt-61db2938-fa74-48e9-a3f1-b83d21f492d8\"},\"links"
                + "\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12"
                + "e-4647-a887-d905172fb4bc/receipts/rcpt-be174879-7829-4275-a0e6-164a7d5b5251\","
                + "\"params\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-3baa92d6-a443-4b45-a245-b34ad"
                + "51c85f6\",\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-27T22:18:56Z\",\"sign\":"
                + "\"CREDIT\",\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"desti"
                + "nationToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":1500,\"cu"
                + "rrency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US"
                + "\",\"translation\":\"Payment received from  Arco MCB Gateway\"}],\"details\":{"
                + "\"correlationToken\":\"pmnt-c99be127-65b2-474b-bf3a-80f4f6133f6a\"},\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-464"
                + "7-a887-d905172fb4bc/receipts/rcpt-3baa92d6-a443-4b45-a245-b34ad51c85f6\",\"param"
                + "s\":{\"rel\":\"self\"}}]},{\"token\":\"rcpt-d91a1d65-adab-43b1-8f33-9f5a9fac8da7"
                + "\",\"type\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-26T17:45:22Z\",\"sign"
                + "\":\"DEBIT\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"des"
                + "tinationToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-78.98,"
                + "\"currency\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"e"
                + "n-US\",\"translation\":\"Retraction for ARIS07CW0646GSO3H\"}],\"details\":{\"cor"
                + "relationToken\":\"pmnt-f293a55f-fae4-45cd-b63c-3023e02ef699\"},\"links\":[{\"hre"
                + "f\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a88"
                + "7-d905172fb4bc/receipts/rcpt-d91a1d65-adab-43b1-8f33-9f5a9fac8da7\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"token\":\"rcpt-5c1ec450-09c5-4f97-828f-94f843f755f1\","
                + "\"type\":\"PAYMENT\",\"createdOn\":\"2022-04-26T17:11:29Z\",\"sign\":\"CREDIT\","
                + "\"sourceToken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken"
                + "\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":78.98,\"currency\":"
                + "\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"tran"
                + "slation\":\"Payment received from  Arco MCB Gateway\"}],\"details\":{\"correlati"
                + "onToken\":\"pmnt-9d60431b-8bcd-41a7-a002-1669426dac21\"},\"links\":[{\"href\":"
                + "\"https://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d9"
                + "05172fb4bc/receipts/rcpt-5c1ec450-09c5-4f97-828f-94f843f755f1\",\"params\":{\"re"
                + "l\":\"self\"}}]},{\"token\":\"rcpt-74abe865-7719-438d-8fa2-b27cdb03ec06\",\"type"
                + "\":\"PAYMENT_RETRACTION\",\"createdOn\":\"2022-04-26T15:47:39Z\",\"sign\":\"DEBI"
                + "T\",\"sourceToken\":\"user-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"destinationT"
                + "oken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"amount\":-1500,\"currency"
                + "\":\"USD\",\"status\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"t"
                + "ranslation\":\"Retraction for ARIS07CVR5THWRZML\"}],\"details\":{\"correlationTo"
                + "ken\":\"pmnt-ab72dd70-37f1-4024-9b44-525ae6e634a4\"},\"links\":[{\"href\":\"http"
                + "s://api.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172f"
                + "b4bc/receipts/rcpt-74abe865-7719-438d-8fa2-b27cdb03ec06\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"rcpt-e3abab12-bcaa-41fd-91d3-3819f27e8eba\",\"type\":"
                + "\"PAYMENT\",\"createdOn\":\"2022-04-26T15:47:31Z\",\"sign\":\"CREDIT\",\"sourceT"
                + "oken\":\"acct-3908ab5a-6ce1-474d-8b80-a63a7b147860\",\"destinationToken\":\"user"
                + "-2bbfc967-d12e-4647-a887-d905172fb4bc\",\"amount\":1500,\"currency\":\"USD\",\"s"
                + "tatus\":\"COMPLETE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":"
                + "\"Payment received from  Arco MCB Gateway\"}],\"details\":{\"correlationToken\":"
                + "\"pmnt-9aca4986-fab9-4d39-8370-a7724b71ace1\"},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-2bbfc967-d12e-4647-a887-d905172fb4bc/r"
                + "eceipts/rcpt-e3abab12-bcaa-41fd-91d3-3819f27e8eba\",\"params\":{\"rel\":\"self"
                + "\"}}]}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"20\",\"pageCount\":\"2\",\"rec"
                + "ordCount\":\"22\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value"
                + "\"},\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2"
                + "bbfc967-d12e-4647-a887-d905172fb4bc/receipts?pageSize=20&language=en-US\",\"para"
                + "ms\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single user [receipt](page:resources/receipts) .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveUserReceipt() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String receiptToken = 
                "rcpt-86674764-9b7a-4b31-adce-bd3299172f1f";

        // Set callback and perform API call
        ReceiptResult result = null;
        try {
            result = controller.retrieveUserReceipt(userToken, receiptToken);
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
                "{\"token\":\"rcpt-b58721a3-33e8-4a62-b51d-a997b46fbce0\",\"type\":\"PAYMENT\",\"cr"
                + "eatedOn\":\"2022-05-04T13:19:38Z\",\"sign\":\"DEBIT\",\"sourceToken\":\"acct-443"
                + "3f040-4ad5-41e5-a6e3-c9611a7be95e\",\"destinationToken\":\"user-cf6244d7-f6b8-46"
                + "25-906a-9f21fc8c774b\",\"amount\":-1500,\"currency\":\"USD\",\"status\":\"COMPLE"
                + "TE\",\"descriptions\":[{\"language\":\"en-US\",\"translation\":\"Payment sent to"
                + " Boutique Partner Cale Cruickshank (Izaiah_McCullough)\"}],\"details\":{\"memo"
                + "\":\"Payment 1 Memo\",\"note\":\"Payment 1 Note\",\"correlationToken\":\"pmnt-1d"
                + "4ae3b0-09c9-402a-8d38-3de1bfdbd1e3\"},\"links\":[{\"href\":\"https://api.sandbox"
                + ".payquicker.io/api/v2/accounts/acct-4433f040-4ad5-41e5-a6e3-c9611a7be95e/receipt"
                + "s/rcpt-b58721a3-33e8-4a62-b51d-a997b46fbce0\",\"params\":{\"rel\":\"self\"}}],"
                + "\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

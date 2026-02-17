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
import com.mypayquicker.api.models.CreateWebhookRequest;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.WebhookSubscriptionListResult;
import com.mypayquicker.api.models.WebhookSubscriptionResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WebhooksControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static WebhooksController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getWebhooksController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of all [webhook subscriptions](page:resources/webhooks) that supports
     * filtering, sorting, and pagination through existing mechanisms .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListSubscriptions() throws Exception {
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
        WebhookSubscriptionListResult result = null;
        try {
            result = controller.listSubscriptions(page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"webh-4cdcb012-8b3f-453f-af4f-c29e6091db92\",\"created"
                + "\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2021-08-09T18:31:55Z\",\"url\":\"h"
                + "ttps://api.sandbox.payquicker.io/integrations/internal/twohundred\",\"namespace"
                + "\":\"PREPAIDCARDS.UPDATED.STATUS.CLOSEDSTOLEN\",\"status\":\"SUBSCRIBED\",\"link"
                + "s\":[{\"href\":\"https://platform.mypayquicker.dev/api/v2/webhooks/webh-4cdcb012"
                + "-8b3f-453f-af4f-c29e6091db92\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"web"
                + "h-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\","
                + "\"lastUpdated\":\"2021-08-09T18:31:55Z\",\"url\":\"https://fawebhookreceiver.azu"
                + "rewebsites.net/api/receive\",\"namespace\":\"PAPERCHECKS.UPDATED.STATUS.REDEEMED"
                + "\",\"status\":\"SUBSCRIBED\",\"links\":[{\"href\":\"https://platform.mypayquicke"
                + "r.dev/api/v2/webhooks/webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"params\":{"
                + "\"rel\":\"self\"}}]},{\"namespace\":\"USERS.CREATED\",\"status\":\"AVAILABLE\","
                + "\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24"
                + "T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhoo"
                + "kreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"USERS.UPDATED.STATUS"
                + ".REGISTRATIONINPROGRESS\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04"
                + "a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":"
                + "\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/a"
                + "pi/receive\"},{\"namespace\":\"USERS.UPDATED.STATUS.REGISTRATIONCOMPLETE\",\"sta"
                + "tus\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"cr"
                + "eated\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url"
                + "\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":"
                + "\"USERS.UPDATED.KYC.REQUIRED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d"
                + "8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdat"
                + "ed\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites."
                + "net/api/receive\"},{\"namespace\":\"USERS.UPDATED.KYC.PROVIDED\",\"status\":\"AV"
                + "AILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":"
                + "\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"http"
                + "s://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"USERS.UP"
                + "DATED.KYC.REJECTED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe"
                + "1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"202"
                + "0-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/re"
                + "ceive\"},{\"namespace\":\"USERS.UPDATED.KYC.APPROVED\",\"status\":\"AVAILABLE\","
                + "\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24"
                + "T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhoo"
                + "kreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"PREPAIDCARDS.CREATED"
                + "\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24"
                + "e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z"
                + "\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"names"
                + "pace\":\"PREPAIDCARDS.UPDATED.STATUS.ACTIVE\",\"status\":\"AVAILABLE\",\"token"
                + "\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:"
                + "08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiv"
                + "er.azurewebsites.net/api/receive\"},{\"namespace\":\"PREPAIDCARDS.UPDATED.STATUS"
                + ".CLOSED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d34"
                + "3295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:"
                + "53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{"
                + "\"namespace\":\"PREPAIDCARDS.UPDATED.STATUS.CLOSEDLOST\",\"status\":\"AVAILABLE"
                + "\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07"
                + "-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://faweb"
                + "hookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"PREPAIDCARDS.UPDA"
                + "TED.STATUS.PENDINGACTIVATION\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d"
                + "8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdat"
                + "ed\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites."
                + "net/api/receive\"},{\"namespace\":\"PREPAIDCARDS.UPDATED.STATUS.PENDINGORDER\","
                + "\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e"
                + "\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z"
                + "\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"names"
                + "pace\":\"PREPAIDCARDS.UPDATED.STATUS.SUSPENDED\",\"status\":\"AVAILABLE\",\"toke"
                + "n\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53"
                + ":08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookrecei"
                + "ver.azurewebsites.net/api/receive\"},{\"namespace\":\"BANKACCOUNTS.CREATED\",\"s"
                + "tatus\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\","
                + "\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\","
                + "\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespac"
                + "e\":\"BANKACCOUNTS.UPDATED.STATUS.APPROVED\",\"status\":\"AVAILABLE\",\"token\":"
                + "\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z"
                + "\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver."
                + "azurewebsites.net/api/receive\"},{\"namespace\":\"BANKACCOUNTS.UPDATED.STATUS.DE"
                + "LETED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d3432"
                + "95f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53"
                + ":08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"n"
                + "amespace\":\"BANKACCOUNTS.UPDATED.STATUS.COMPLIANCEHOLD\",\"status\":\"AVAILABLE"
                + "\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07"
                + "-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://faweb"
                + "hookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"BANKACCOUNTS.UPDA"
                + "TED.DETAILS.MODIFIED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4"
                + "fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2"
                + "020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/"
                + "receive\"},{\"namespace\":\"PAPERCHECKS.CREATED\",\"status\":\"AVAILABLE\",\"tok"
                + "en\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:5"
                + "3:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookrece"
                + "iver.azurewebsites.net/api/receive\"},{\"namespace\":\"PAPERCHECKS.UPDATED.STATU"
                + "S.INPROGRESS\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0"
                + "-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-2"
                + "4T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive"
                + "\"},{\"namespace\":\"PAPERCHECKS.UPDATED.STATUS.CANCELLED\",\"status\":\"AVAILAB"
                + "LE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-"
                + "07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://faw"
                + "ebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"PAPERCHECKS.UPD"
                + "ATED.DETAILS.MODIFIED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-"
                + "4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":"
                + "\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/a"
                + "pi/receive\"},{\"namespace\":\"TRANSFERQUOTES.CREATED\",\"status\":\"AVAILABLE"
                + "\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07"
                + "-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://faweb"
                + "hookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"TRANSFERQUOTES.AC"
                + "CEPTED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343"
                + "295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:5"
                + "3:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{"
                + "\"namespace\":\"TRANSFERQUOTES.VOIDED\",\"status\":\"AVAILABLE\",\"token\":\"web"
                + "h-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\","
                + "\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azu"
                + "rewebsites.net/api/receive\"},{\"namespace\":\"TRANSFERQUOTES.CANCELLED\",\"stat"
                + "us\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"cre"
                + "ated\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url"
                + "\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":"
                + "\"PAYMENTQUOTES.CREATED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04"
                + "a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":"
                + "\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/a"
                + "pi/receive\"},{\"namespace\":\"PAYMENTQUOTES.ACCEPTED\",\"status\":\"AVAILABLE"
                + "\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07"
                + "-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://faweb"
                + "hookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"PAYMENTQUOTES.VOI"
                + "DED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295"
                + "f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:0"
                + "8Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"nam"
                + "espace\":\"PAYMENTQUOTES.CANCELLED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4"
                + "de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"las"
                + "tUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azureweb"
                + "sites.net/api/receive\"},{\"namespace\":\"SPENDBACKQUOTES.CREATED\",\"status\":"
                + "\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created"
                + "\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"h"
                + "ttps://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"SPEND"
                + "BACKQUOTES.ACCEPTED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4f"
                + "e1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"20"
                + "20-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/r"
                + "eceive\"},{\"namespace\":\"SPENDBACKQUOTES.VOIDED\",\"status\":\"AVAILABLE\",\"t"
                + "oken\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14"
                + ":53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookre"
                + "ceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"SPENDBACKQUOTES.CANCELL"
                + "ED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f"
                + "24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08"
                + "Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"name"
                + "space\":\"RECEIPTS.CREATED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-"
                + "f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated"
                + "\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.ne"
                + "t/api/receive\"},{\"namespace\":\"RECEIPTS.UPDATED.STATUS.COMPLETED\",\"status"
                + "\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"creat"
                + "ed\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":"
                + "\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"RE"
                + "CEIPTS.UPDATED.STATUS.CANCELLED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2"
                + "d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUp"
                + "dated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsit"
                + "es.net/api/receive\"},{\"namespace\":\"RECEIPTS.UPDATED.STATUS.REFUNDED\",\"stat"
                + "us\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"cre"
                + "ated\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url"
                + "\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":"
                + "\"RECEIPTS.UPDATED.STATUS.FAILED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de"
                + "2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastU"
                + "pdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsi"
                + "tes.net/api/receive\"},{\"namespace\":\"RECEIPTS.UPDATED.STATUS.PENDING\",\"stat"
                + "us\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"cre"
                + "ated\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url"
                + "\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":"
                + "\"RECEIPTS.UPDATED.STATUS.SCHEDULED\",\"status\":\"AVAILABLE\",\"token\":\"webh-"
                + "4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"la"
                + "stUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewe"
                + "bsites.net/api/receive\"},{\"namespace\":\"RECEIPTS.UPDATED.STATUS.PROCESSING\","
                + "\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e"
                + "\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z"
                + "\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"names"
                + "pace\":\"RECEIPTS.UPDATED.STATUS.REVERSED\",\"status\":\"AVAILABLE\",\"token\":"
                + "\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z"
                + "\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver."
                + "azurewebsites.net/api/receive\"},{\"namespace\":\"RECEIPTS.UPDATED.DETAILS.MODIF"
                + "IED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295"
                + "f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:0"
                + "8Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"nam"
                + "espace\":\"USEREVENTS.STARTED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5"
                + "d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpda"
                + "ted\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites"
                + ".net/api/receive\"},{\"namespace\":\"USEREVENTS.UPDATED\",\"status\":\"AVAILABLE"
                + "\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07"
                + "-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://faweb"
                + "hookreceiver.azurewebsites.net/api/receive\"},{\"namespace\":\"USEREVENTS.COMPLE"
                + "TED\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295"
                + "f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-07-24T14:53:0"
                + "8Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/receive\"},{\"nam"
                + "espace\":\"RECEIPTS.UPDATED.STATUS.RETURNED\",\"status\":\"AVAILABLE\",\"token"
                + "\":\"webh-4de2d5d8-f04a-4fe1-bff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:"
                + "08Z\",\"lastUpdated\":\"2020-07-24T14:53:08Z\",\"url\":\"https://fawebhookreceiv"
                + "er.azurewebsites.net/api/receive\"},{\"namespace\":\"PREPAIDCARDS.UPDATED.STATUS"
                + ".PENDINGRELEASE\",\"status\":\"AVAILABLE\",\"token\":\"webh-4de2d5d8-f04a-4fe1-b"
                + "ff0-8d343295f24e\",\"created\":\"2020-07-24T14:53:08Z\",\"lastUpdated\":\"2020-0"
                + "7-24T14:53:08Z\",\"url\":\"https://fawebhookreceiver.azurewebsites.net/api/recei"
                + "ve\"}],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"100\",\"pageCount\":\"0\",\"rec"
                + "ordCount\":\"0\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value"
                + "\"},\"links\":[{\"href\":\"https://platform.mypayquicker.dev/api/v2/webhooks\","
                + "\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Update a [webhook subscription](page:resources/webhooks).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateSubscription() throws Exception {
        // Parameters for the API call
        CreateWebhookRequest body = ApiHelper.deserialize(
                "{\"namespace\":\"PAYMENTQUOTES.ACCEPTED\",\"url\":\"https://fawebhookreceiver.azur"
                + "ewebsites.net/api/receive\"}",
                CreateWebhookRequest.class);

        // Set callback and perform API call
        WebhookSubscriptionResult result = null;
        try {
            result = controller.updateSubscription(body);
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
                "{\"token\":\"webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"created\":\"2020-07-24T"
                + "14:53:08Z\",\"lastUpdated\":\"2022-04-13T05:53:48Z\",\"url\":\"https://fawebhook"
                + "receiver.azurewebsites.net/api/receive\",\"namespace\":\"PAYMENTQUOTES.ACCEPTED"
                + "\",\"status\":\"SUBSCRIBED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/webhooks/webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"params\":{"
                + "\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-refe"
                + "rence-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [webhook subscription](page:resources/webhooks).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateSubscription() throws Exception {
        // Parameters for the API call
        CreateWebhookRequest body = ApiHelper.deserialize(
                "{\"namespace\":\"PAYMENTQUOTES.ACCEPTED\",\"url\":\"https://fawebhookreceiver.azur"
                + "ewebsites.net/api/receive\"}",
                CreateWebhookRequest.class);

        // Set callback and perform API call
        WebhookSubscriptionResult result = null;
        try {
            result = controller.createSubscription(body);
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
                "{\"token\":\"webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"created\":\"2020-07-24T"
                + "14:53:08Z\",\"lastUpdated\":\"2022-04-13T05:53:48Z\",\"url\":\"https://fawebhook"
                + "receiver.azurewebsites.net/api/receive\",\"namespace\":\"PAYMENTQUOTES.ACCEPTED"
                + "\",\"status\":\"SUBSCRIBED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/webhooks/webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"params\":{"
                + "\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-refe"
                + "rence-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a [webhook subscription](page:resources/webhooks).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateSubscription1() throws Exception {
        // Parameters for the API call
        CreateWebhookRequest body = ApiHelper.deserialize(
                "{\"namespace\":\"PAYMENTQUOTES.ACCEPTED\",\"url\":\"https://fawebhookreceiver.azur"
                + "ewebsites.net/api/receive\"}",
                CreateWebhookRequest.class);

        // Set callback and perform API call
        WebhookSubscriptionResult result = null;
        try {
            result = controller.createSubscription(body);
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
                "{\"token\":\"webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"created\":\"2020-07-24T"
                + "14:53:08Z\",\"lastUpdated\":\"2022-04-13T05:53:48Z\",\"url\":\"https://fawebhook"
                + "receiver.azurewebsites.net/api/receive\",\"namespace\":\"PAYMENTQUOTES.ACCEPTED"
                + "\",\"status\":\"SUBSCRIBED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/webhooks/webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"params\":{"
                + "\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-refe"
                + "rence-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [webhook subscription](page:resources/webhooks) using the webhook token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveSubscription() throws Exception {
        // Parameters for the API call
        String webhookToken = 
                "webh-2dd54a53-3814-4ce1-862f-dc06b09ead4a";

        // Set callback and perform API call
        WebhookSubscriptionResult result = null;
        try {
            result = controller.retrieveSubscription(webhookToken);
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
                "{\"token\":\"webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"created\":\"2020-07-24T"
                + "14:53:08Z\",\"lastUpdated\":\"2022-04-13T05:53:48Z\",\"url\":\"https://fawebhook"
                + "receiver.azurewebsites.net/api/receive\",\"namespace\":\"PAYMENTQUOTES.ACCEPTED"
                + "\",\"status\":\"SUBSCRIBED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/webhooks/webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"params\":{"
                + "\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-refe"
                + "rence-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Delete a [webhook subscription](page:resources/webhooks). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteSubscription() throws Exception {
        // Parameters for the API call
        String webhookToken = 
                "webh-2dd54a53-3814-4ce1-862f-dc06b09ead4a";

        // Set callback and perform API call
        WebhookSubscriptionResult result = null;
        try {
            result = controller.deleteSubscription(webhookToken);
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
                "{\"token\":\"webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"created\":\"2020-07-24T"
                + "14:53:08Z\",\"lastUpdated\":\"2022-04-13T05:53:48Z\",\"url\":\"https://fawebhook"
                + "receiver.azurewebsites.net/api/receive\",\"namespace\":\"PAYMENTQUOTES.ACCEPTED"
                + "\",\"status\":\"SUBSCRIBED\",\"links\":[{\"href\":\"https://api.sandbox.payquick"
                + "er.io/api/v2/webhooks/webh-c33c81ab-9fd7-4835-8cf9-1b23473e1163\",\"params\":{"
                + "\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef\":\"request-refe"
                + "rence-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

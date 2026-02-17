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
import com.mypayquicker.api.models.TransferListResult;
import com.mypayquicker.api.models.TransferResult;
import com.mypayquicker.api.models.containers.TransferQuote;
import com.mypayquicker.api.utilities.JsonObject;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransfersControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static TransfersController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getTransfersController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [transfers](page:resources/transfers) that supports filtering, sorting,
     * and pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListTransfers() throws Exception {
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
        TransferListResult result = null;
        try {
            result = controller.listTransfers(page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"xfer-337b4c59-821d-4bac-a1dd-c9d7c15e41e8\",\"clientTra"
                + "nsferId\":\"1066ab05-84d0-453f-a827-1bd3b2ad9e3d\",\"created\":\"2025-06-23T19:1"
                + "7:22Z\",\"destinationAmount\":-14,\"destinationCurrency\":\"USD\",\"destinationT"
                + "oken\":\"dest-80611686-e311-4acd-aeeb-244609a3b12b\",\"fee\":{\"category\":\"USE"
                + "R\",\"destinationCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distributio"
                + "n\":[{\"amount\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US"
                + "\",\"translation\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"transla"
                + "tion\":\"Poplatek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":"
                + "\"Transfer zu einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Cost"
                + "e de la transferencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pa"
                + "nkkiin siirto -maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virem"
                + "ent vers une banque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasfer"
                + "imento Bancario\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"la"
                + "nguage\":\"ko-KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"tr"
                + "anslation\":\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation"
                + "\":\"Opłata za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Tax"
                + "a de Transferência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Ко"
                + "миссия за перевод на банковский счет\"},{\"language\":\"en-US\",\"translation\":"
                + "\"Avgift för överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation"
                + "\":\"转账到银行手续费\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"lang"
                + "uage\":\"fr-CA\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":"
                + "\"pt-PT\",\"translation\":\"Taxa de Transferência para um Banco\"},{\"language"
                + "\":\"es-MX\",\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"languag"
                + "e\":\"en-GB\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":"
                + "\"$1.50 USD\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySourc"
                + "e\":\"SCHEDULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}]"
                + ",\"source\":\"TRANSACTION\",\"totalAmount\":-12.5,\"transactionAmount\":-14,\"ty"
                + "pe\":\"BANK_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":"
                + "{\"destinationAmount\":-14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAm"
                + "ount\":-14,\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"($14.00) USD"
                + "\",\"destinationFormattedAmount\":\"($14.00) USD\"},\"memo\":\"Bank transfer - m"
                + "emo\",\"note\":\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41b"
                + "b-8822-ed58c69e678e\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-337b4c59-8"
                + "21d-4bac-a1dd-c9d7c15e41e8\",\"destinationFormattedAmount\":\"($14.00) USD\",\"a"
                + "mount\":-14,\"formattedAmount\":\"($14.00) USD\",\"transferLockSide\":\"SOURCE"
                + "\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMinutes"
                + "\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://api.san"
                + "dbox.payquicker.io/api/v2/users/user-65ec33d0-4518-41bb-8822-ed58c69e678e/transf"
                + "ers/xfer-337b4c59-821d-4bac-a1dd-c9d7c15e41e8\",\"params\":{\"rel\":\"self\"}}]}"
                + "],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"2\",\"pageCount\":\"1\",\"recordCoun"
                + "t\":\"1\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"lin"
                + "ks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-65ec33d0-4"
                + "518-41bb-8822-ed58c69e678e/transfers?page=1&language=en-US&filter=%27transfertyp"
                + "e%27=%27BANK_TRANSFER%27&pageSize=2\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a new [transfer](page:resources/transfers) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateTransferQuote() throws Exception {
        // Parameters for the API call
        TransferQuote body = null;

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.createTransferQuote(body);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a new [transfer](page:resources/transfers) quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateTransferQuote1() throws Exception {
        // Parameters for the API call
        TransferQuote body = null;

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.createTransferQuote(body);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve details of a specific [transfer](page:resources/transfers) represented by a transfer
     * token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveTransfer() throws Exception {
        // Parameters for the API call
        String transferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.retrieveTransfer(transferToken);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept a [transfer](page:resources/transfers) quote.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptTransferQuote() throws Exception {
        // Parameters for the API call
        String transferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.acceptTransferQuote(transferToken);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Accept a [transfer](page:resources/transfers) quote.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestAcceptTransferQuote1() throws Exception {
        // Parameters for the API call
        String transferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.acceptTransferQuote(transferToken);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Optional [transfer](page:resources/transfers) quote cancellation that auto-cancels after a
     * period organically expires or when account activity invalidates the quote. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelTransferQuote() throws Exception {
        // Parameters for the API call
        String transferToken = 
                "xfer-0fac4aa8-43ac-447e-95f9-827f908a82ff";

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.cancelTransferQuote(transferToken);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of user [transfers](page:resources/transfers) that supports filtering,
     * sorting, and pagination through existing mechanisms.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListUserTransfers() throws Exception {
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
        TransferListResult result = null;
        try {
            result = controller.listUserTransfers(userToken, page, pageSize, filter, sort, language);
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
                "{\"payload\":[{\"token\":\"xfer-337b4c59-821d-4bac-a1dd-c9d7c15e41e8\",\"clientTra"
                + "nsferId\":\"1066ab05-84d0-453f-a827-1bd3b2ad9e3d\",\"created\":\"2025-06-23T19:1"
                + "7:22Z\",\"destinationAmount\":-14,\"destinationCurrency\":\"USD\",\"destinationT"
                + "oken\":\"dest-80611686-e311-4acd-aeeb-244609a3b12b\",\"fee\":{\"category\":\"USE"
                + "R\",\"destinationCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distributio"
                + "n\":[{\"amount\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US"
                + "\",\"translation\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"transla"
                + "tion\":\"Poplatek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":"
                + "\"Transfer zu einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Cost"
                + "e de la transferencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pa"
                + "nkkiin siirto -maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virem"
                + "ent vers une banque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasfer"
                + "imento Bancario\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"la"
                + "nguage\":\"ko-KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"tr"
                + "anslation\":\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation"
                + "\":\"Opłata za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Tax"
                + "a de Transferência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Ко"
                + "миссия за перевод на банковский счет\"},{\"language\":\"en-US\",\"translation\":"
                + "\"Avgift för överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation"
                + "\":\"转账到银行手续费\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"lang"
                + "uage\":\"fr-CA\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":"
                + "\"pt-PT\",\"translation\":\"Taxa de Transferência para um Banco\"},{\"language"
                + "\":\"es-MX\",\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"languag"
                + "e\":\"en-GB\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":"
                + "\"$1.50 USD\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySourc"
                + "e\":\"SCHEDULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}]"
                + ",\"source\":\"TRANSACTION\",\"totalAmount\":-12.5,\"transactionAmount\":-14,\"ty"
                + "pe\":\"BANK_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":"
                + "{\"destinationAmount\":-14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAm"
                + "ount\":-14,\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"($14.00) USD"
                + "\",\"destinationFormattedAmount\":\"($14.00) USD\"},\"memo\":\"Bank transfer - m"
                + "emo\",\"note\":\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41b"
                + "b-8822-ed58c69e678e\",\"status\":\"ACCEPTED\",\"receiptToken\":\"rcpt-337b4c59-8"
                + "21d-4bac-a1dd-c9d7c15e41e8\",\"destinationFormattedAmount\":\"($14.00) USD\",\"a"
                + "mount\":-14,\"formattedAmount\":\"($14.00) USD\",\"transferLockSide\":\"SOURCE"
                + "\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMinutes"
                + "\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://api.san"
                + "dbox.payquicker.io/api/v2/users/user-65ec33d0-4518-41bb-8822-ed58c69e678e/transf"
                + "ers/xfer-337b4c59-821d-4bac-a1dd-c9d7c15e41e8\",\"params\":{\"rel\":\"self\"}}]}"
                + "],\"meta\":{\"pageNo\":\"1\",\"pageSize\":\"2\",\"pageCount\":\"1\",\"recordCoun"
                + "t\":\"1\",\"timezone\":\"GMT\",\"requestRef\":\"request-reference-value\"},\"lin"
                + "ks\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-65ec33d0-4"
                + "518-41bb-8822-ed58c69e678e/transfers?page=1&language=en-US&filter=%27transfertyp"
                + "e%27=%27BANK_TRANSFER%27&pageSize=2\",\"params\":{\"rel\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a specific user bank [transfer](page:resources/transfers).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveUserTransfer() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        String transferToken = 
                "xfer-bf34989d-0b13-47ee-bd51-b96b0ecbe866";

        // Set callback and perform API call
        TransferResult result = null;
        try {
            result = controller.retrieveUserTransfer(userToken, transferToken);
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
                "{\"token\":\"xfer-0722428d-7929-4bb5-a7eb-8526e8fe49e2\",\"clientTransferId\":\"af"
                + "1d26c4-07d8-4bba-bdf6-104fda46e896\",\"created\":\"2025-06-24T12:40:53Z\",\"dest"
                + "inationAmount\":14,\"destinationCurrency\":\"USD\",\"destinationToken\":\"dest-8"
                + "0611686-e311-4acd-aeeb-224609a3b12b\",\"fee\":{\"category\":\"USER\",\"destinati"
                + "onCountry\":\"USA\",\"destinationCurrency\":\"USD\",\"distribution\":[{\"amount"
                + "\":1.5,\"currency\":\"USD\",\"description\":[{\"language\":\"en-US\",\"translati"
                + "on\":\"Transfer to a Bank Fee\"},{\"language\":\"en-US\",\"translation\":\"Popla"
                + "tek za převod do banky\"},{\"language\":\"de-DE\",\"translation\":\"Transfer zu "
                + "einer Bankgebühr\"},{\"language\":\"es-ES\",\"translation\":\"Coste de la transf"
                + "erencia a un banco\"},{\"language\":\"en-US\",\"translation\":\"Pankkiin siirto "
                + "-maksu\"},{\"language\":\"fr-FR\",\"translation\":\"Frais de virement vers une b"
                + "anque\"},{\"language\":\"it-IT\",\"translation\":\"Tariffa Trasferimento Bancari"
                + "o\"},{\"language\":\"ja-JP\",\"translation\":\"銀行への送金の手数料\"},{\"language\":\"ko-"
                + "KR\",\"translation\":\"은행으로 송금 수수료\"},{\"language\":\"nl-NL\",\"translation\":"
                + "\"Kosten bankoverschrijving\"},{\"language\":\"pl-PL\",\"translation\":\"Opłata "
                + "za przelew do banku\"},{\"language\":\"pt-BR\",\"translation\":\"Taxa de Transfe"
                + "rência para um Banco\"},{\"language\":\"ru-RU\",\"translation\":\"Комиссия за пе"
                + "ревод на банковский счет\"},{\"language\":\"en-US\",\"translation\":\"Avgift för"
                + " överföring till en bank\"},{\"language\":\"zh-Hans\",\"translation\":\"转账到银行手续费"
                + "\"},{\"language\":\"zh-Hant\",\"translation\":\"轉帳至銀行手續費\"},{\"language\":\"fr-C"
                + "A\",\"translation\":\"Frais de transfert bancaire\"},{\"language\":\"pt-PT\",\"t"
                + "ranslation\":\"Taxa de Transferência para um Banco\"},{\"language\":\"es-MX\","
                + "\"translation\":\"Transferencia a una Tarifa Bancaria\"},{\"language\":\"en-GB"
                + "\",\"translation\":\"Transfer to a Bank Fee\"}],\"formattedAmount\":\"$1.50 USD"
                + "\",\"percentage\":1,\"responsibility\":\"USER\",\"responsibilitySource\":\"SCHED"
                + "ULE\",\"sourceToken\":\"user-65ec33d0-4518-41bb-8822-ed58c69e678e\"}],\"source"
                + "\":\"TRANSACTION\",\"totalAmount\":15.5,\"transactionAmount\":14,\"type\":\"BANK"
                + "_TRANSFER\",\"valueAmount\":1.5,\"valueType\":\"STATIC\"},\"fxRate\":{\"destinat"
                + "ionAmount\":14,\"destinationCurrency\":\"USD\",\"rate\":1,\"sourceAmount\":14,"
                + "\"sourceCurrency\":\"USD\",\"sourceFormattedAmount\":\"$14.00 USD\",\"destinatio"
                + "nFormattedAmount\":\"$14.00 USD\"},\"memo\":\"Bank transfer - memo\",\"note\":"
                + "\"Bank transfer - note\",\"sourceToken\":\"user-65ec33d0-4518-41bb-2822-ed58c69e"
                + "678e\",\"status\":\"PENDING_ACCEPTANCE\",\"destinationFormattedAmount\":\"$14.00"
                + " USD\",\"amount\":14,\"formattedAmount\":\"$14.00 USD\",\"transferLockSide\":\"S"
                + "OURCE\",\"transferMethodType\":\"IACH\",\"deliveryDetails\":{\"minimumDeliveryMi"
                + "nutes\":4320,\"maximumDeliveryMinutes\":10080},\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/transfers/xfer-0722448d-7929-4bb5-a7eb-8526e8fe49"
                + "e2\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}

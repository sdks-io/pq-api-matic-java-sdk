/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mypayquicker.api.ApiHelper;
import com.mypayquicker.api.models.GatewayPaymentQuote;
import com.mypayquicker.api.models.PortalPaymentQuote;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PaymentQuote.PaymentQuoteDeserializer.class)
public abstract class PaymentQuote {
    
    /**
     * This is Gateway Payment Quote case.
     * @param gatewayPaymentQuote GatewayPaymentQuote value for gatewayPaymentQuote.
     * @return The GatewayPaymentQuoteCase object.
     */
    public static PaymentQuote fromGatewayPaymentQuote(GatewayPaymentQuote gatewayPaymentQuote) {
        return gatewayPaymentQuote == null ? null : new GatewayPaymentQuoteCase(gatewayPaymentQuote);
    }

    /**
     * This is PortalPaymentQuote case.
     * @param portalPaymentQuote PortalPaymentQuote value for portalPaymentQuote.
     * @return The PortalPaymentQuoteCase object.
     */
    public static PaymentQuote fromPortalPaymentQuote(PortalPaymentQuote portalPaymentQuote) {
        return portalPaymentQuote == null ? null : new PortalPaymentQuoteCase(portalPaymentQuote);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R gatewayPaymentQuote(GatewayPaymentQuote gatewayPaymentQuote);

        R portalPaymentQuote(PortalPaymentQuote portalPaymentQuote);
    }

    /**
     * This is a implementation class for GatewayPaymentQuoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GatewayPaymentQuote")
    private static class GatewayPaymentQuoteCase extends PaymentQuote {

        @JsonValue
        private GatewayPaymentQuote gatewayPaymentQuote;

        GatewayPaymentQuoteCase(GatewayPaymentQuote gatewayPaymentQuote) {
            this.gatewayPaymentQuote = gatewayPaymentQuote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.gatewayPaymentQuote(this.gatewayPaymentQuote);
        }

        @JsonCreator
        private GatewayPaymentQuoteCase(JsonNode jsonNode) throws IOException {
            this.gatewayPaymentQuote = ApiHelper.deserialize(jsonNode,
                GatewayPaymentQuote.class);
        }

        @Override
        public String toString() {
            return gatewayPaymentQuote.toString();
        }
    }

    /**
     * This is a implementation class for PortalPaymentQuoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PortalPaymentQuote")
    private static class PortalPaymentQuoteCase extends PaymentQuote {

        @JsonValue
        private PortalPaymentQuote portalPaymentQuote;

        PortalPaymentQuoteCase(PortalPaymentQuote portalPaymentQuote) {
            this.portalPaymentQuote = portalPaymentQuote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.portalPaymentQuote(this.portalPaymentQuote);
        }

        @JsonCreator
        private PortalPaymentQuoteCase(JsonNode jsonNode) throws IOException {
            this.portalPaymentQuote = ApiHelper.deserialize(jsonNode,
                PortalPaymentQuote.class);
        }

        @Override
        public String toString() {
            return portalPaymentQuote.toString();
        }
    }

    /**
     * This is a custom deserializer class for PaymentQuote.
     */
    protected static class PaymentQuoteDeserializer
            extends JsonDeserializer<PaymentQuote> {

        @Override
        public PaymentQuote deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(GatewayPaymentQuoteCase.class,
                    PortalPaymentQuoteCase.class), true);
        }
    }

}

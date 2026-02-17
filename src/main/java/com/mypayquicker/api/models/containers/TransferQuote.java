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
import com.mypayquicker.api.models.GatewayTransferQuote;
import com.mypayquicker.api.models.PortalTransferQuote;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = TransferQuote.TransferQuoteDeserializer.class)
public abstract class TransferQuote {
    
    /**
     * This is GatewayTransferQuote case.
     * @param gatewayTransferQuote GatewayTransferQuote value for gatewayTransferQuote.
     * @return The GatewayTransferQuoteCase object.
     */
    public static TransferQuote fromGatewayTransferQuote(
            GatewayTransferQuote gatewayTransferQuote) {
        return gatewayTransferQuote == null ? null : new GatewayTransferQuoteCase(gatewayTransferQuote);
    }

    /**
     * This is PortalTransferQuote case.
     * @param portalTransferQuote PortalTransferQuote value for portalTransferQuote.
     * @return The PortalTransferQuoteCase object.
     */
    public static TransferQuote fromPortalTransferQuote(PortalTransferQuote portalTransferQuote) {
        return portalTransferQuote == null ? null : new PortalTransferQuoteCase(portalTransferQuote);
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
        R gatewayTransferQuote(GatewayTransferQuote gatewayTransferQuote);

        R portalTransferQuote(PortalTransferQuote portalTransferQuote);
    }

    /**
     * This is a implementation class for GatewayTransferQuoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GatewayTransferQuote")
    private static class GatewayTransferQuoteCase extends TransferQuote {

        @JsonValue
        private GatewayTransferQuote gatewayTransferQuote;

        GatewayTransferQuoteCase(GatewayTransferQuote gatewayTransferQuote) {
            this.gatewayTransferQuote = gatewayTransferQuote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.gatewayTransferQuote(this.gatewayTransferQuote);
        }

        @JsonCreator
        private GatewayTransferQuoteCase(JsonNode jsonNode) throws IOException {
            this.gatewayTransferQuote = ApiHelper.deserialize(jsonNode,
                GatewayTransferQuote.class);
        }

        @Override
        public String toString() {
            return gatewayTransferQuote.toString();
        }
    }

    /**
     * This is a implementation class for PortalTransferQuoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PortalTransferQuote")
    private static class PortalTransferQuoteCase extends TransferQuote {

        @JsonValue
        private PortalTransferQuote portalTransferQuote;

        PortalTransferQuoteCase(PortalTransferQuote portalTransferQuote) {
            this.portalTransferQuote = portalTransferQuote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.portalTransferQuote(this.portalTransferQuote);
        }

        @JsonCreator
        private PortalTransferQuoteCase(JsonNode jsonNode) throws IOException {
            this.portalTransferQuote = ApiHelper.deserialize(jsonNode,
                PortalTransferQuote.class);
        }

        @Override
        public String toString() {
            return portalTransferQuote.toString();
        }
    }

    /**
     * This is a custom deserializer class for TransferQuote.
     */
    protected static class TransferQuoteDeserializer
            extends JsonDeserializer<TransferQuote> {

        @Override
        public TransferQuote deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(GatewayTransferQuoteCase.class,
                    PortalTransferQuoteCase.class), true);
        }
    }

}

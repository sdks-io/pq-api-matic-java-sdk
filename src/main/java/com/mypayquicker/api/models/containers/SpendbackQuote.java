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
import com.mypayquicker.api.models.GatewaySpendbackQuote;
import com.mypayquicker.api.models.PortalSpendbackQuote;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = SpendbackQuote.SpendbackQuoteDeserializer.class)
public abstract class SpendbackQuote {
    
    /**
     * This is GatewaySpendbackQuote case.
     * @param gatewaySpendbackQuote GatewaySpendbackQuote value for gatewaySpendbackQuote.
     * @return The GatewaySpendbackQuoteCase object.
     */
    public static SpendbackQuote fromGatewaySpendbackQuote(
            GatewaySpendbackQuote gatewaySpendbackQuote) {
        return gatewaySpendbackQuote == null ? null : new GatewaySpendbackQuoteCase(gatewaySpendbackQuote);
    }

    /**
     * This is PortalSpendbackQuote case.
     * @param portalSpendbackQuote PortalSpendbackQuote value for portalSpendbackQuote.
     * @return The PortalSpendbackQuoteCase object.
     */
    public static SpendbackQuote fromPortalSpendbackQuote(
            PortalSpendbackQuote portalSpendbackQuote) {
        return portalSpendbackQuote == null ? null : new PortalSpendbackQuoteCase(portalSpendbackQuote);
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
        R gatewaySpendbackQuote(GatewaySpendbackQuote gatewaySpendbackQuote);

        R portalSpendbackQuote(PortalSpendbackQuote portalSpendbackQuote);
    }

    /**
     * This is a implementation class for GatewaySpendbackQuoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GatewaySpendbackQuote")
    private static class GatewaySpendbackQuoteCase extends SpendbackQuote {

        @JsonValue
        private GatewaySpendbackQuote gatewaySpendbackQuote;

        GatewaySpendbackQuoteCase(GatewaySpendbackQuote gatewaySpendbackQuote) {
            this.gatewaySpendbackQuote = gatewaySpendbackQuote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.gatewaySpendbackQuote(this.gatewaySpendbackQuote);
        }

        @JsonCreator
        private GatewaySpendbackQuoteCase(JsonNode jsonNode) throws IOException {
            this.gatewaySpendbackQuote = ApiHelper.deserialize(jsonNode,
                GatewaySpendbackQuote.class);
        }

        @Override
        public String toString() {
            return gatewaySpendbackQuote.toString();
        }
    }

    /**
     * This is a implementation class for PortalSpendbackQuoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PortalSpendbackQuote")
    private static class PortalSpendbackQuoteCase extends SpendbackQuote {

        @JsonValue
        private PortalSpendbackQuote portalSpendbackQuote;

        PortalSpendbackQuoteCase(PortalSpendbackQuote portalSpendbackQuote) {
            this.portalSpendbackQuote = portalSpendbackQuote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.portalSpendbackQuote(this.portalSpendbackQuote);
        }

        @JsonCreator
        private PortalSpendbackQuoteCase(JsonNode jsonNode) throws IOException {
            this.portalSpendbackQuote = ApiHelper.deserialize(jsonNode,
                PortalSpendbackQuote.class);
        }

        @Override
        public String toString() {
            return portalSpendbackQuote.toString();
        }
    }

    /**
     * This is a custom deserializer class for SpendbackQuote.
     */
    protected static class SpendbackQuoteDeserializer
            extends JsonDeserializer<SpendbackQuote> {

        @Override
        public SpendbackQuote deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(GatewaySpendbackQuoteCase.class,
                    PortalSpendbackQuoteCase.class), true);
        }
    }

}

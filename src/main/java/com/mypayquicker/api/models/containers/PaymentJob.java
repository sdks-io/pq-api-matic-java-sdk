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
import com.mypayquicker.api.models.GatewayPaymentJob;
import com.mypayquicker.api.models.PortalPaymentJob;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PaymentJob.PaymentJobDeserializer.class)
public abstract class PaymentJob {
    
    /**
     * This is Gateway Payment Job case.
     * @param gatewayPaymentJob GatewayPaymentJob value for gatewayPaymentJob.
     * @return The GatewayPaymentJobCase object.
     */
    public static PaymentJob fromGatewayPaymentJob(GatewayPaymentJob gatewayPaymentJob) {
        return gatewayPaymentJob == null ? null : new GatewayPaymentJobCase(gatewayPaymentJob);
    }

    /**
     * This is Portal Payment Job case.
     * @param portalPaymentJob PortalPaymentJob value for portalPaymentJob.
     * @return The PortalPaymentJobCase object.
     */
    public static PaymentJob fromPortalPaymentJob(PortalPaymentJob portalPaymentJob) {
        return portalPaymentJob == null ? null : new PortalPaymentJobCase(portalPaymentJob);
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
        R gatewayPaymentJob(GatewayPaymentJob gatewayPaymentJob);

        R portalPaymentJob(PortalPaymentJob portalPaymentJob);
    }

    /**
     * This is a implementation class for GatewayPaymentJobCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "GatewayPaymentJob")
    private static class GatewayPaymentJobCase extends PaymentJob {

        @JsonValue
        private GatewayPaymentJob gatewayPaymentJob;

        GatewayPaymentJobCase(GatewayPaymentJob gatewayPaymentJob) {
            this.gatewayPaymentJob = gatewayPaymentJob;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.gatewayPaymentJob(this.gatewayPaymentJob);
        }

        @JsonCreator
        private GatewayPaymentJobCase(JsonNode jsonNode) throws IOException {
            this.gatewayPaymentJob = ApiHelper.deserialize(jsonNode,
                GatewayPaymentJob.class);
        }

        @Override
        public String toString() {
            return gatewayPaymentJob.toString();
        }
    }

    /**
     * This is a implementation class for PortalPaymentJobCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PortalPaymentJob")
    private static class PortalPaymentJobCase extends PaymentJob {

        @JsonValue
        private PortalPaymentJob portalPaymentJob;

        PortalPaymentJobCase(PortalPaymentJob portalPaymentJob) {
            this.portalPaymentJob = portalPaymentJob;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.portalPaymentJob(this.portalPaymentJob);
        }

        @JsonCreator
        private PortalPaymentJobCase(JsonNode jsonNode) throws IOException {
            this.portalPaymentJob = ApiHelper.deserialize(jsonNode,
                PortalPaymentJob.class);
        }

        @Override
        public String toString() {
            return portalPaymentJob.toString();
        }
    }

    /**
     * This is a custom deserializer class for PaymentJob.
     */
    protected static class PaymentJobDeserializer
            extends JsonDeserializer<PaymentJob> {

        @Override
        public PaymentJob deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(GatewayPaymentJobCase.class,
                    PortalPaymentJobCase.class), true);
        }
    }

}

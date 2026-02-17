/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import com.mypayquicker.api.Environment;
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.authentication.ClientsideModel;
import com.mypayquicker.api.authentication.ServerModel;
import com.mypayquicker.api.models.SandboxInstance;
import com.mypayquicker.api.models.UatInstance;
import com.mypayquicker.api.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static PayQuickerSDKClient createConfigurationFromEnvironment() {
        PayQuickerSDKClient.Builder builder = new PayQuickerSDKClient.Builder();

        final String environment = System.getenv("PAY_QUICKER_SDK_ENVIRONMENT");
        final String sandboxInstance = System.getenv("PAY_QUICKER_SDK_SANDBOX_INSTANCE");
        final String uatInstance = System.getenv("PAY_QUICKER_SDK_UAT_INSTANCE");
        final String xMyPayQuickerVersion =
                System.getenv("PAY_QUICKER_SDK_X_MY_PAY_QUICKER_VERSION");
        final String timeout = System.getenv("PAY_QUICKER_SDK_TIMEOUT");
        final String oAuthClientId = System.getenv("PAY_QUICKER_SDK_O_AUTH_CLIENT_ID");
        final String oAuthClientSecret = System.getenv("PAY_QUICKER_SDK_O_AUTH_CLIENT_SECRET");
        final String accessToken = System.getenv("PAY_QUICKER_SDK_ACCESS_TOKEN");

        if (oAuthClientId != null && oAuthClientSecret != null) {
            builder.serverCredentials(new ServerModel
                    .Builder(oAuthClientId, oAuthClientSecret)
                    .build());
        }
        if (accessToken != null) {
            builder.clientsideCredentials(new ClientsideModel
                    .Builder(accessToken)
                    .build());
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (sandboxInstance != null) {
            builder.sandboxInstance(SandboxInstance.fromString(sandboxInstance));
        }
        if (uatInstance != null) {
            builder.uatInstance(UatInstance.fromString(uatInstance));
        }
        if (xMyPayQuickerVersion != null) {
            builder.xMyPayQuickerVersion(xMyPayQuickerVersion);
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    /**
     * Create test configuration.
     */
    protected static PayQuickerSDKClient createConfiguration() {
        // Set Configuration parameters for test execution
        PayQuickerSDKClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();

        return config;
    }
}

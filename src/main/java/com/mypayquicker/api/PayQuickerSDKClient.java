/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api;

import com.mypayquicker.api.authentication.ClientsideCredentials;
import com.mypayquicker.api.authentication.ClientsideManager;
import com.mypayquicker.api.authentication.ClientsideModel;
import com.mypayquicker.api.authentication.ServerCredentials;
import com.mypayquicker.api.authentication.ServerManager;
import com.mypayquicker.api.authentication.ServerModel;
import com.mypayquicker.api.controllers.AgreementsController;
import com.mypayquicker.api.controllers.BalancesController;
import com.mypayquicker.api.controllers.BankAccountsController;
import com.mypayquicker.api.controllers.ClientSideController;
import com.mypayquicker.api.controllers.ComplianceController;
import com.mypayquicker.api.controllers.DefaultAgreementsController;
import com.mypayquicker.api.controllers.DefaultBalancesController;
import com.mypayquicker.api.controllers.DefaultBankAccountsController;
import com.mypayquicker.api.controllers.DefaultClientSideController;
import com.mypayquicker.api.controllers.DefaultComplianceController;
import com.mypayquicker.api.controllers.DefaultDocumentsController;
import com.mypayquicker.api.controllers.DefaultElectronicWalletsController;
import com.mypayquicker.api.controllers.DefaultEventsController;
import com.mypayquicker.api.controllers.DefaultInvitationsController;
import com.mypayquicker.api.controllers.DefaultJobsController;
import com.mypayquicker.api.controllers.DefaultOAuthAuthorizationController;
import com.mypayquicker.api.controllers.DefaultPaymentsController;
import com.mypayquicker.api.controllers.DefaultPrepaidCardsController;
import com.mypayquicker.api.controllers.DefaultProgramController;
import com.mypayquicker.api.controllers.DefaultReceiptsController;
import com.mypayquicker.api.controllers.DefaultSpendbackController;
import com.mypayquicker.api.controllers.DefaultSpendbackRefundsController;
import com.mypayquicker.api.controllers.DefaultStatementsController;
import com.mypayquicker.api.controllers.DefaultTransfersController;
import com.mypayquicker.api.controllers.DefaultUsersController;
import com.mypayquicker.api.controllers.DefaultWebhooksController;
import com.mypayquicker.api.controllers.DocumentsController;
import com.mypayquicker.api.controllers.ElectronicWalletsController;
import com.mypayquicker.api.controllers.EventsController;
import com.mypayquicker.api.controllers.InvitationsController;
import com.mypayquicker.api.controllers.JobsController;
import com.mypayquicker.api.controllers.OAuthAuthorizationController;
import com.mypayquicker.api.controllers.PaymentsController;
import com.mypayquicker.api.controllers.PrepaidCardsController;
import com.mypayquicker.api.controllers.ProgramController;
import com.mypayquicker.api.controllers.ReceiptsController;
import com.mypayquicker.api.controllers.SpendbackController;
import com.mypayquicker.api.controllers.SpendbackRefundsController;
import com.mypayquicker.api.controllers.StatementsController;
import com.mypayquicker.api.controllers.TransfersController;
import com.mypayquicker.api.controllers.UsersController;
import com.mypayquicker.api.controllers.WebhooksController;
import com.mypayquicker.api.http.client.HttpCallback;
import com.mypayquicker.api.http.client.HttpClientConfiguration;
import com.mypayquicker.api.http.client.ReadonlyHttpClientConfiguration;
import com.mypayquicker.api.logging.configuration.ApiLoggingConfiguration;
import com.mypayquicker.api.logging.configuration.ReadonlyLoggingConfiguration;
import com.mypayquicker.api.models.SandboxInstance;
import com.mypayquicker.api.models.UatInstance;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class PayQuickerSDKClient implements PayQuickerSDKClientInterface {

    /**
     * Private store for controllers.
     */
    private AgreementsController agreements;
    private BalancesController balances;
    private BankAccountsController bankAccounts;
    private ClientSideController clientSide;
    private ComplianceController compliance;
    private DocumentsController documents;
    private ElectronicWalletsController electronicWallets;
    private EventsController events;
    private PaymentsController payments;
    private PrepaidCardsController prepaidCards;
    private ProgramController program;
    private ReceiptsController receipts;
    private SpendbackController spendback;
    private SpendbackRefundsController spendbackRefunds;
    private StatementsController statements;
    private TransfersController transfers;
    private UsersController users;
    private WebhooksController webhooks;
    private JobsController jobs;
    private InvitationsController invitations;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "PayQuicker SDK 2026.02.01";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * Sandbox Environments
     */
    private final SandboxInstance sandboxInstance;

    /**
     * UAT Environments
     */
    private final UatInstance uatInstance;

    /**
     * Date-based API Version specified in the header *required* on all calls.
     */
    private final String xMyPayQuickerVersion;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Logging Configuration instance.
     */
    private final ReadonlyLoggingConfiguration loggingConfig;

    /**
     * ServerManager.
     */
    private ServerManager serverManager;

    /**
     * The instance of ServerModel.
     */
    private ServerModel serverModel;

    /**
     * ClientsideManager.
     */
    private ClientsideManager clientsideManager;

    /**
     * The instance of ClientsideModel.
     */
    private ClientsideModel clientsideModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private PayQuickerSDKClient(Environment environment, SandboxInstance sandboxInstance,
            UatInstance uatInstance, String xMyPayQuickerVersion, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig,
            ReadonlyLoggingConfiguration loggingConfig, ServerModel serverModel,
            ClientsideModel clientsideModel, HttpCallback httpCallback) {
        this.environment = environment;
        this.sandboxInstance = sandboxInstance;
        this.uatInstance = uatInstance;
        this.xMyPayQuickerVersion = xMyPayQuickerVersion;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.loggingConfig = loggingConfig;
        this.httpCallback = httpCallback;

        this.serverModel = serverModel;
        this.clientsideModel = clientsideModel;

        this.serverManager = new ServerManager(serverModel);
        this.authentications.put("server", serverManager);

        this.clientsideManager = new ClientsideManager(clientsideModel);
        this.authentications.put("clientside", clientsideManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .loggingConfiguration(((ApiLoggingConfiguration) loggingConfig).getConfiguration())
                .globalHeader("X-MyPayQuicker-Version", xMyPayQuickerVersion)
                .build();
        this.serverManager.applyGlobalConfiguration(globalConfig);

        agreements = new DefaultAgreementsController(globalConfig);
        balances = new DefaultBalancesController(globalConfig);
        bankAccounts = new DefaultBankAccountsController(globalConfig);
        clientSide = new DefaultClientSideController(globalConfig);
        compliance = new DefaultComplianceController(globalConfig);
        documents = new DefaultDocumentsController(globalConfig);
        electronicWallets = new DefaultElectronicWalletsController(globalConfig);
        events = new DefaultEventsController(globalConfig);
        payments = new DefaultPaymentsController(globalConfig);
        prepaidCards = new DefaultPrepaidCardsController(globalConfig);
        program = new DefaultProgramController(globalConfig);
        receipts = new DefaultReceiptsController(globalConfig);
        spendback = new DefaultSpendbackController(globalConfig);
        spendbackRefunds = new DefaultSpendbackRefundsController(globalConfig);
        statements = new DefaultStatementsController(globalConfig);
        transfers = new DefaultTransfersController(globalConfig);
        users = new DefaultUsersController(globalConfig);
        webhooks = new DefaultWebhooksController(globalConfig);
        jobs = new DefaultJobsController(globalConfig);
        invitations = new DefaultInvitationsController(globalConfig);
        oAuthAuthorization = new DefaultOAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of AgreementsController.
     * @return agreements
     */
    public AgreementsController getAgreementsController() {
        return agreements;
    }

    /**
     * Get the instance of BalancesController.
     * @return balances
     */
    public BalancesController getBalancesController() {
        return balances;
    }

    /**
     * Get the instance of BankAccountsController.
     * @return bankAccounts
     */
    public BankAccountsController getBankAccountsController() {
        return bankAccounts;
    }

    /**
     * Get the instance of ClientSideController.
     * @return clientSide
     */
    public ClientSideController getClientSideController() {
        return clientSide;
    }

    /**
     * Get the instance of ComplianceController.
     * @return compliance
     */
    public ComplianceController getComplianceController() {
        return compliance;
    }

    /**
     * Get the instance of DocumentsController.
     * @return documents
     */
    public DocumentsController getDocumentsController() {
        return documents;
    }

    /**
     * Get the instance of ElectronicWalletsController.
     * @return electronicWallets
     */
    public ElectronicWalletsController getElectronicWalletsController() {
        return electronicWallets;
    }

    /**
     * Get the instance of EventsController.
     * @return events
     */
    public EventsController getEventsController() {
        return events;
    }

    /**
     * Get the instance of PaymentsController.
     * @return payments
     */
    public PaymentsController getPaymentsController() {
        return payments;
    }

    /**
     * Get the instance of PrepaidCardsController.
     * @return prepaidCards
     */
    public PrepaidCardsController getPrepaidCardsController() {
        return prepaidCards;
    }

    /**
     * Get the instance of ProgramController.
     * @return program
     */
    public ProgramController getProgramController() {
        return program;
    }

    /**
     * Get the instance of ReceiptsController.
     * @return receipts
     */
    public ReceiptsController getReceiptsController() {
        return receipts;
    }

    /**
     * Get the instance of SpendbackController.
     * @return spendback
     */
    public SpendbackController getSpendbackController() {
        return spendback;
    }

    /**
     * Get the instance of SpendbackRefundsController.
     * @return spendbackRefunds
     */
    public SpendbackRefundsController getSpendbackRefundsController() {
        return spendbackRefunds;
    }

    /**
     * Get the instance of StatementsController.
     * @return statements
     */
    public StatementsController getStatementsController() {
        return statements;
    }

    /**
     * Get the instance of TransfersController.
     * @return transfers
     */
    public TransfersController getTransfersController() {
        return transfers;
    }

    /**
     * Get the instance of UsersController.
     * @return users
     */
    public UsersController getUsersController() {
        return users;
    }

    /**
     * Get the instance of WebhooksController.
     * @return webhooks
     */
    public WebhooksController getWebhooksController() {
        return webhooks;
    }

    /**
     * Get the instance of JobsController.
     * @return jobs
     */
    public JobsController getJobsController() {
        return jobs;
    }

    /**
     * Get the instance of InvitationsController.
     * @return invitations
     */
    public InvitationsController getInvitationsController() {
        return invitations;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Sandbox Environments
     * @return sandboxInstance
     */
    public SandboxInstance getSandboxInstance() {
        return sandboxInstance;
    }

    /**
     * UAT Environments
     * @return uatInstance
     */
    public UatInstance getUatInstance() {
        return uatInstance;
    }

    /**
     * Date-based API Version specified in the header *required* on all calls.
     * @return xMyPayQuickerVersion
     */
    public String getXMyPayQuickerVersion() {
        return xMyPayQuickerVersion;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * Logging Configuration instance.
     * @return loggingConfig
     */
    public ReadonlyLoggingConfiguration getLoggingConfig() {
        return loggingConfig;
    }

    /**
     * The credentials to use with Server.
     * @return serverCredentials
     */
    public ServerCredentials getServerCredentials() {
        return serverManager;
    }

    /**
     * The auth credential model for Server.
     * @return the instance of ServerModel
     */
    public ServerModel getServerModel() {
        return serverModel;
    }
    /**
     * The credentials to use with Clientside.
     * @return clientsideCredentials
     */
    public ClientsideCredentials getClientsideCredentials() {
        return clientsideManager;
    }

    /**
     * The auth credential model for Clientside.
     * @return the instance of ClientsideModel
     */
    public ClientsideModel getClientsideModel() {
        return clientsideModel;
    }

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    public String getAccessToken() {
        return getClientsideCredentials().getAccessToken();
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("sandbox_instance",
                new SimpleEntry<Object, Boolean>(this.sandboxInstance, false));
        parameters.put("uat_instance",
                new SimpleEntry<Object, Boolean>(this.uatInstance, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.API);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.API)) {
                return "https://api.payquicker.io/api/v2";
            }
        }
        if (environment.equals(Environment.SANDBOX)) {
            if (server.equals(Server.API)) {
                return "https://api.{sandbox_instance}.payquicker.io/api/v2";
            }
        }
        if (environment.equals(Environment.UAT)) {
            if (server.equals(Server.API)) {
                return "https://api.{uat_instance}.payquicker.io/api/v2";
            }
        }
        if (environment.equals(Environment.DEVELOPMENT)) {
            if (server.equals(Server.API)) {
                return "https://api.local.payquicker.io/api/v2";
            }
        }
        return "https://api.{sandbox_instance}.payquicker.io/api/v2";
    }

    /**
     * Converts this PayQuickerSDKClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayQuickerSDKClient [" + "environment=" + environment + ", sandboxInstance="
                + sandboxInstance + ", uatInstance=" + uatInstance + ", xMyPayQuickerVersion="
                + xMyPayQuickerVersion + ", httpClientConfig=" + httpClientConfig
                + ", loggingConfig=" + loggingConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link PayQuickerSDKClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link PayQuickerSDKClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.sandboxInstance = getSandboxInstance();
        builder.uatInstance = getUatInstance();
        builder.xMyPayQuickerVersion = getXMyPayQuickerVersion();
        builder.httpClient = getHttpClient();
        builder.serverCredentials(getServerModel()
                .toBuilder().build());
        builder.clientsideCredentials(getClientsideModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        builder.loggingConfig(() -> ((ApiLoggingConfiguration) loggingConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link PayQuickerSDKClient}.
     */
    public static class Builder {

        private Environment environment = Environment.SANDBOX;
        private SandboxInstance sandboxInstance = SandboxInstance.SANDBOX;
        private UatInstance uatInstance = UatInstance.UAT1;
        private String xMyPayQuickerVersion = "2026.02.01";
        private HttpClient httpClient;
        private ServerModel serverModel = new ServerModel.Builder("", "").build();
        private ClientsideModel clientsideModel = new ClientsideModel.Builder("").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();
        private ApiLoggingConfiguration.Builder loggingConfigBuilder = null;


        /**
         * Credentials setter for ServerCredentials.
         * @param serverModel The instance of ServerModel.
         * @return The current instance of builder.
         */
        public Builder serverCredentials(ServerModel serverModel) {
            this.serverModel = serverModel;
            return this;
        }

        /**
         * Credentials setter for ClientsideCredentials.
         * @param clientsideModel The instance of ClientsideModel.
         * @return The current instance of builder.
         */
        public Builder clientsideCredentials(ClientsideModel clientsideModel) {
            this.clientsideModel = clientsideModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Sandbox Environments
         * @param sandboxInstance The sandboxInstance for client.
         * @return Builder
         */
        public Builder sandboxInstance(SandboxInstance sandboxInstance) {
            this.sandboxInstance = sandboxInstance;
            return this;
        }

        /**
         * UAT Environments
         * @param uatInstance The uatInstance for client.
         * @return Builder
         */
        public Builder uatInstance(UatInstance uatInstance) {
            this.uatInstance = uatInstance;
            return this;
        }

        /**
         * Date-based API Version specified in the header *required* on all calls.
         * @param xMyPayQuickerVersion The xMyPayQuickerVersion for client.
         * @return Builder
         */
        public Builder xMyPayQuickerVersion(String xMyPayQuickerVersion) {
            if (xMyPayQuickerVersion == null) {
                throw new NullPointerException("xMyPayQuickerVersion cannot be null");
            }
            this.xMyPayQuickerVersion = xMyPayQuickerVersion;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration, takes in an operation to be
         * performed on the builder instance of logging configuration.
         * @param action Consumer for the builder of LoggingConfiguration.
         * @return Builder
         */
        public Builder loggingConfig(Consumer<ApiLoggingConfiguration.Builder> action) {
            if (loggingConfigBuilder == null) {
                loggingConfigBuilder = new ApiLoggingConfiguration.Builder();
            }

            if (loggingConfigBuilder.build().getLogger() == null) {
                loggingConfigBuilder.useDefaultLogger();
            }

            action.accept(loggingConfigBuilder);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration with Console Logging.
         *
         * @return Builder
         */
        public Builder loggingConfig() {
            loggingConfigBuilder = new ApiLoggingConfiguration.Builder();
            loggingConfigBuilder.useDefaultLogger();
            return this;
        }

		/**
		 * Private setter for the Builder of LoggingConfiguration, takes in an operation to be
		 * performed on the builder instance of logging configuration.
		 * 
		 * @param supplier Supplier for the builder of LoggingConfiguration.
		 * @return Builder
		 */
		private Builder loggingConfig(Supplier<ApiLoggingConfiguration.Builder> supplier) {
			loggingConfigBuilder = supplier.get();
			return this;
		}

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new PayQuickerSDKClient object using the set fields.
         * @return PayQuickerSDKClient
         */
        public PayQuickerSDKClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            ReadonlyLoggingConfiguration loggingConfig = loggingConfigBuilder != null ? loggingConfigBuilder.build() 
                    : new ApiLoggingConfiguration.Builder().build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new PayQuickerSDKClient(environment, sandboxInstance, uatInstance,
                    xMyPayQuickerVersion, httpClient, httpClientConfig, loggingConfig, serverModel,
                    clientsideModel, httpCallback);
        }
    }
}
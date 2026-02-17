/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api;

import com.mypayquicker.api.controllers.AgreementsController;
import com.mypayquicker.api.controllers.BalancesController;
import com.mypayquicker.api.controllers.BankAccountsController;
import com.mypayquicker.api.controllers.ClientSideController;
import com.mypayquicker.api.controllers.ComplianceController;
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

/**
 * Gateway interface for the library.
 * This acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public interface PayQuickerSDKClientInterface extends Configuration {
    
    /**
     * Provides access to Agreements controller.
     * @return Returns the AgreementsController instance
     */
    AgreementsController getAgreementsController();

    /**
     * Provides access to Balances controller.
     * @return Returns the BalancesController instance
     */
    BalancesController getBalancesController();

    /**
     * Provides access to BankAccounts controller.
     * @return Returns the BankAccountsController instance
     */
    BankAccountsController getBankAccountsController();

    /**
     * Provides access to ClientSide controller.
     * @return Returns the ClientSideController instance
     */
    ClientSideController getClientSideController();

    /**
     * Provides access to Compliance controller.
     * @return Returns the ComplianceController instance
     */
    ComplianceController getComplianceController();

    /**
     * Provides access to Documents controller.
     * @return Returns the DocumentsController instance
     */
    DocumentsController getDocumentsController();

    /**
     * Provides access to ElectronicWallets controller.
     * @return Returns the ElectronicWalletsController instance
     */
    ElectronicWalletsController getElectronicWalletsController();

    /**
     * Provides access to Events controller.
     * @return Returns the EventsController instance
     */
    EventsController getEventsController();

    /**
     * Provides access to Payments controller.
     * @return Returns the PaymentsController instance
     */
    PaymentsController getPaymentsController();

    /**
     * Provides access to PrepaidCards controller.
     * @return Returns the PrepaidCardsController instance
     */
    PrepaidCardsController getPrepaidCardsController();

    /**
     * Provides access to Program controller.
     * @return Returns the ProgramController instance
     */
    ProgramController getProgramController();

    /**
     * Provides access to Receipts controller.
     * @return Returns the ReceiptsController instance
     */
    ReceiptsController getReceiptsController();

    /**
     * Provides access to Spendback controller.
     * @return Returns the SpendbackController instance
     */
    SpendbackController getSpendbackController();

    /**
     * Provides access to SpendbackRefunds controller.
     * @return Returns the SpendbackRefundsController instance
     */
    SpendbackRefundsController getSpendbackRefundsController();

    /**
     * Provides access to Statements controller.
     * @return Returns the StatementsController instance
     */
    StatementsController getStatementsController();

    /**
     * Provides access to Transfers controller.
     * @return Returns the TransfersController instance
     */
    TransfersController getTransfersController();

    /**
     * Provides access to Users controller.
     * @return Returns the UsersController instance
     */
    UsersController getUsersController();

    /**
     * Provides access to Webhooks controller.
     * @return Returns the WebhooksController instance
     */
    WebhooksController getWebhooksController();

    /**
     * Provides access to Jobs controller.
     * @return Returns the JobsController instance
     */
    JobsController getJobsController();

    /**
     * Provides access to Invitations controller.
     * @return Returns the InvitationsController instance
     */
    InvitationsController getInvitationsController();

    /**
     * Provides access to OAuthAuthorization controller.
     * @return Returns the OAuthAuthorizationController instance
     */
    OAuthAuthorizationController getOAuthAuthorizationController();

}
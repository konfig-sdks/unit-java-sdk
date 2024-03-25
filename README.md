<div align="center">

[![Visit Unit](./header.png)](https://unit.co)

# [Unit](https://unit.co)

An OpenAPI specifications for unit-sdk clients

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Unit&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>unit-java-sdk</artifactId>
  <version>0.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:unit-java-sdk:0.0.2"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/unit-java-sdk-0.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActivateControlAgreementForAccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.s.unit.sh";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Unit client = new Unit(configuration);
    String accountId = "accountId_example"; // ID of the account
    try {
      Object result = client
              .activateControlAgreementForAccount
              .byId(accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivateControlAgreementForAccountApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .activateControlAgreementForAccount
              .byId(accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivateControlAgreementForAccountApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.s.unit.sh*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivateControlAgreementForAccountApi* | [**byId**](docs/ActivateControlAgreementForAccountApi.md#byId) | **POST** /accounts/{accountId}/activate-daca | Activate Account Control Agreement by Id
*AdvanceReceivedPaymentApi* | [**byId**](docs/AdvanceReceivedPaymentApi.md#byId) | **POST** /received-payments/{paymentId}/advance | Advance Received Payment by Id
*ApproveAuthorizationRequestApi* | [**byId**](docs/ApproveAuthorizationRequestApi.md#byId) | **POST** /authorization-requests/{authorizationId}/approve | Approve Authorization Request by Id
*ApproveCheckPaymentApi* | [**byId**](docs/ApproveCheckPaymentApi.md#byId) | **POST** /check-payments/{checkPaymentId}/approve | Approve Check Payment by Id
*ArchiveCustomerApi* | [**byId**](docs/ArchiveCustomerApi.md#byId) | **POST** /customers/{customerId}/archive | Archive Customer by Id
*CancelApplicationApi* | [**byId**](docs/CancelApplicationApi.md#byId) | **POST** /applications/{applicationId}/cancel | Cancel Application by Id
*CancelCheckPaymentApi* | [**byId**](docs/CancelCheckPaymentApi.md#byId) | **POST** /check-payments/{checkPaymentId}/cancel | Cancel Check Payment by Id
*CancelPaymentApi* | [**byId**](docs/CancelPaymentApi.md#byId) | **POST** /payments/{paymentId}/cancel | Cancel a Payment by Id
*CloseACardApi* | [**viaApi**](docs/CloseACardApi.md#viaApi) | **POST** /cards/{cardId}/close | Close a Card
*CloseAnAccountApi* | [**byId**](docs/CloseAnAccountApi.md#byId) | **POST** /accounts/{accountId}/close | Close an Account by Id
*ConfirmCheckDepositApi* | [**byId**](docs/ConfirmCheckDepositApi.md#byId) | **POST** /check-deposits/{checkDepositId}/confirm | Confirm by Id
*CreateAccountApi* | [**viaApi**](docs/CreateAccountApi.md#viaApi) | **POST** /accounts | Create Account
*CreateApplicationApi* | [**viaApi**](docs/CreateApplicationApi.md#viaApi) | **POST** /applications | Create Application
*CreateApplicationFormApi* | [**viaApi**](docs/CreateApplicationFormApi.md#viaApi) | **POST** /application-forms | Create Application Form
*CreateCheckDepositApi* | [**viaApi**](docs/CreateCheckDepositApi.md#viaApi) | **POST** /check-deposits | Create Check Deposit
*CreateCheckPaymentApi* | [**viaApi**](docs/CreateCheckPaymentApi.md#viaApi) | **POST** /check-payments | Create Check Payment
*CreateCounterpartyApi* | [**viaApi**](docs/CreateCounterpartyApi.md#viaApi) | **POST** /counterparties | Create Counterparty
*CreateCustomerTokenApi* | [**viaApi**](docs/CreateCustomerTokenApi.md#viaApi) | **POST** /customers/{customerId}/token | Create Customer Token
*CreateCustomerTokenVerificationApi* | [**viaApi**](docs/CreateCustomerTokenVerificationApi.md#viaApi) | **POST** /customers/{customerId}/token/verification | Create Customer Token Verification
*CreateFeeApi* | [**viaApi**](docs/CreateFeeApi.md#viaApi) | **POST** /fees | Create Fee
*CreateOrgApiTokenApi* | [**viaApi**](docs/CreateOrgApiTokenApi.md#viaApi) | **POST** /users/{userId}/api-tokens | Create Org API Token
*CreateRecurringPaymentApi* | [**viaApi**](docs/CreateRecurringPaymentApi.md#viaApi) | **POST** /recurring-payments | Create Recurring Payment
*CreateRewardApi* | [**viaApi**](docs/CreateRewardApi.md#viaApi) | **POST** /rewards | Create Reward
*CreateWebhookApi* | [**viaApi**](docs/CreateWebhookApi.md#viaApi) | **POST** /webhooks | Create Webhook
*CreateACardApi* | [**viaApi**](docs/CreateACardApi.md#viaApi) | **POST** /cards | Create a Card
*CreateADocumentForAnApplicationApi* | [**viaApi**](docs/CreateADocumentForAnApplicationApi.md#viaApi) | **POST** /applications/{applicationId}/documents | Create a document
*CreateAPaymentApi* | [**viaApi**](docs/CreateAPaymentApi.md#viaApi) | **POST** /payments | Create a Payment
*CreateARepaymentApi* | [**viaApi**](docs/CreateARepaymentApi.md#viaApi) | **POST** /repayments | Create a Repayment
*DeactivateControlAgreementForAccountApi* | [**byId**](docs/DeactivateControlAgreementForAccountApi.md#byId) | **POST** /accounts/{accountId}/deactivate-daca | Deactivate Account Control Agreement by Id
*DeclineAuthorizationRequestApi* | [**viaApi**](docs/DeclineAuthorizationRequestApi.md#viaApi) | **POST** /authorization-requests/{authorizationId}/decline | Decline Authorization Request
*DeleteCounterpartyApi* | [**byId**](docs/DeleteCounterpartyApi.md#byId) | **DELETE** /counterparties/{counterpartyId} | Delete Counterparty by Id
*DisableRecurringPaymentApi* | [**viaApi**](docs/DisableRecurringPaymentApi.md#viaApi) | **POST** /recurring-payments/{paymentId}/disable | Disable Recurring Payment
*DisableWebhookApi* | [**viaApi**](docs/DisableWebhookApi.md#viaApi) | **POST** /webhooks/{webhookId}/disable | Disable a Webhook
*DownloadADocumentApi* | [**viaApi**](docs/DownloadADocumentApi.md#viaApi) | **GET** /applications/{applicationId}/documents/{documentId}/download | Download a Document
*DownloadADocumentBackSideApi* | [**viaApi**](docs/DownloadADocumentBackSideApi.md#viaApi) | **GET** /applications/{applicationId}/documents/{documentId}/download/back | Download a Document - Back Side
*EnableRecurringPaymentApi* | [**viaApi**](docs/EnableRecurringPaymentApi.md#viaApi) | **POST** /recurring-payments/{paymentId}/enable | Enable Recurring Payment
*EnableWebhookApi* | [**viaApi**](docs/EnableWebhookApi.md#viaApi) | **POST** /webhooks/{webhookId}/enable | Enable Webhook
*EnterControlAgreementForAccountApi* | [**byId**](docs/EnterControlAgreementForAccountApi.md#byId) | **POST** /accounts/{accountId}/enter-daca | Enter Account Control Agreement by Id
*FireEventApi* | [**byId**](docs/FireEventApi.md#byId) | **POST** /events/{eventId} | Fire Event by Id
*FreezeACardApi* | [**viaApi**](docs/FreezeACardApi.md#viaApi) | **POST** /cards/{cardId}/freeze | Freeze a Card
*FreezeAnAccountApi* | [**byId**](docs/FreezeAnAccountApi.md#byId) | **POST** /accounts/{accountId}/freeze | Freeze Account by Id
*GetAtmLocationsListApi* | [**fromApi**](docs/GetAtmLocationsListApi.md#fromApi) | **GET** /atm-locations | Get List ATM Locations
*GetAccountApi* | [**byId**](docs/GetAccountApi.md#byId) | **GET** /accounts/{accountId} | Get Account by Id
*GetAccountLimitsApi* | [**byId**](docs/GetAccountLimitsApi.md#byId) | **GET** /accounts/{accountId}/limits | Get Account Limits by Id
*GetApplicationApi* | [**byId**](docs/GetApplicationApi.md#byId) | **GET** /applications/{applicationId} | Get Application by Id
*GetApplicationFormApi* | [**byId**](docs/GetApplicationFormApi.md#byId) | **GET** /application-forms/{applicationFormId} | Get ApplicationForm by Id
*GetAuthorizationApi* | [**byId**](docs/GetAuthorizationApi.md#byId) | **GET** /authorizations/{authorizationId} | Get Authorization by Id
*GetAuthorizationRequestApi* | [**byId**](docs/GetAuthorizationRequestApi.md#byId) | **GET** /authorization-requests/{authorizationId} | Get Authorization Request by Id
*GetBankVerificationPdfApi* | [**fromApi**](docs/GetBankVerificationPdfApi.md#fromApi) | **GET** /statements/{accountId}/bank/pdf | Get Bank verification PDF
*GetCardApi* | [**byId**](docs/GetCardApi.md#byId) | **GET** /cards/{cardId} | Get Card by Id
*GetCardLimitsApi* | [**byId**](docs/GetCardLimitsApi.md#byId) | **GET** /cards/{cardId}/limits | Get Card Limit by Id
*GetCardPinStatusApi* | [**pinStatus**](docs/GetCardPinStatusApi.md#pinStatus) | **GET** /cards/{cardId}/secure-data/pin/status | Get Card PIN Status
*GetCheckDepositApi* | [**byId**](docs/GetCheckDepositApi.md#byId) | **GET** /check-deposits/{checkDepositId} | Get Check Deposit by Id
*GetCheckDepositBackImageApi* | [**byId**](docs/GetCheckDepositBackImageApi.md#byId) | **GET** /check-deposits/{checkDepositId}/back | Get Back Check Deposit Image by Id
*GetCheckDepositFrontImageApi* | [**byId**](docs/GetCheckDepositFrontImageApi.md#byId) | **GET** /check-deposits/{checkDepositId}/front | Get Front Check Deposit Image by Id
*GetCheckPaymentApi* | [**byId**](docs/GetCheckPaymentApi.md#byId) | **GET** /check-payments/{checkPaymentId} | Get Check Payment by Id
*GetCounterpartyApi* | [**byId**](docs/GetCounterpartyApi.md#byId) | **GET** /counterparties/{counterpartyId} | Get Counterparty by Id
*GetCounterpartyBalanceApi* | [**recurringPaymentFromApi**](docs/GetCounterpartyBalanceApi.md#recurringPaymentFromApi) | **GET** /counterparties/{counterpartyId}/balance | Get Counterparty Balance
*GetCustomerApi* | [**byId**](docs/GetCustomerApi.md#byId) | **GET** /customers/{customerId} | Get Customer by Id
*GetDisputeApi* | [**byId**](docs/GetDisputeApi.md#byId) | **GET** /disputes/{disputeId} | Get Dispute by Id
*GetEventApi* | [**byId**](docs/GetEventApi.md#byId) | **GET** /events/{eventId} | Get Event by Id
*GetInstitutionApi* | [**byRoutingNumber**](docs/GetInstitutionApi.md#byRoutingNumber) | **GET** /institutions/{routingNumber} | Get Institution by Routing Number
*GetListAccountsApi* | [**fromApi**](docs/GetListAccountsApi.md#fromApi) | **GET** /accounts | Get List Accounts
*GetListApplicationFormsApi* | [**viaApi**](docs/GetListApplicationFormsApi.md#viaApi) | **GET** /application-forms | Get List Application Forms
*GetListApplicationsApi* | [**fromApi**](docs/GetListApplicationsApi.md#fromApi) | **GET** /applications | Get List Application
*GetListAuthorizationRequestsApi* | [**fromApi**](docs/GetListAuthorizationRequestsApi.md#fromApi) | **GET** /authorization-requests | Get List Authorization Requests
*GetListAuthorizationsApi* | [**fromApi**](docs/GetListAuthorizationsApi.md#fromApi) | **GET** /authorizations | Get List authorizations
*GetListCheckDepositsApi* | [**fromApi**](docs/GetListCheckDepositsApi.md#fromApi) | **GET** /check-deposits | Get List Check Deposits
*GetListCheckPaymentsApi* | [**fromApi**](docs/GetListCheckPaymentsApi.md#fromApi) | **GET** /check-payments | Get List Check Payments
*GetListCounterpartiesApi* | [**fromApi**](docs/GetListCounterpartiesApi.md#fromApi) | **GET** /counterparties | Get Counterparties List
*GetListCustomersApi* | [**apiList**](docs/GetListCustomersApi.md#apiList) | **GET** /customers | Get Customers List
*GetListDisputesApi* | [**fromApi**](docs/GetListDisputesApi.md#fromApi) | **GET** /disputes | Get List Disputes
*GetListEventsApi* | [**fromApi**](docs/GetListEventsApi.md#fromApi) | **GET** /events | Get Events List
*GetListOrgApiTokensApi* | [**fromApi**](docs/GetListOrgApiTokensApi.md#fromApi) | **GET** /users/{userId}/api-tokens | Get List Org API Tokens
*GetListPaymentsApi* | [**fromApi**](docs/GetListPaymentsApi.md#fromApi) | **GET** /payments | Get List Payments
*GetListRecurringPaymentsApi* | [**fromApi**](docs/GetListRecurringPaymentsApi.md#fromApi) | **GET** /recurring-payments | Get Recurring Payments List
*GetListRepaymentsApi* | [**fromApi**](docs/GetListRepaymentsApi.md#fromApi) | **GET** /repayments | Get List Repayments
*GetListRewardsApi* | [**fromApi**](docs/GetListRewardsApi.md#fromApi) | **GET** /rewards | Get Rewards List
*GetListStatementsApi* | [**fromApi**](docs/GetListStatementsApi.md#fromApi) | **GET** /statements | Get List Statements
*GetListTransactionsApi* | [**fromApi**](docs/GetListTransactionsApi.md#fromApi) | **GET** /transactions | Get List Transactions
*GetListWebhooksApi* | [**fromApi**](docs/GetListWebhooksApi.md#fromApi) | **GET** /webhooks | Get List Webhooks
*GetListOfCardsApi* | [**fromApi**](docs/GetListOfCardsApi.md#fromApi) | **GET** /cards | Get List of Cards
*GetListOfDocumentsApi* | [**viaApi**](docs/GetListOfDocumentsApi.md#viaApi) | **GET** /applications/{applicationId}/documents | Get List of Documents
*GetPaymentApi* | [**byId**](docs/GetPaymentApi.md#byId) | **GET** /payments/{paymentId} | Get Payment by Id
*GetReceivedPaymentApi* | [**byId**](docs/GetReceivedPaymentApi.md#byId) | **GET** /received-payments/{paymentId} | Get Received Payment by Id
*GetReceivedPaymentsListApi* | [**fromApi**](docs/GetReceivedPaymentsListApi.md#fromApi) | **GET** /received-payments | Get Received Payments List
*GetRecurringPaymentApi* | [**byId**](docs/GetRecurringPaymentApi.md#byId) | **GET** /recurring-payments/{paymentId} | Get Recurring Payment
*GetRepaymentApi* | [**byId**](docs/GetRepaymentApi.md#byId) | **GET** /repayments/{repaymentId} | Get Repayment by Id
*GetRewardApi* | [**byId**](docs/GetRewardApi.md#byId) | **GET** /rewards/{rewardId} | Get Reward by Id
*GetStatementHtmlApi* | [**byId**](docs/GetStatementHtmlApi.md#byId) | **GET** /statements/{statementId}/html | Get HTML Statement by Id
*GetStatementPdfApi* | [**byId**](docs/GetStatementPdfApi.md#byId) | **GET** /statements/{statementId}/pdf | Get PDF Statement by Id
*GetTransactionApi* | [**byId**](docs/GetTransactionApi.md#byId) | **GET** /accounts/{accountId}/transactions/{transactionId} | Get Transaction by Id
*GetWebhookApi* | [**byId**](docs/GetWebhookApi.md#byId) | **GET** /webhooks/{webhookId} | Get Webhook Id
*GetABackImageApi* | [**byApi**](docs/GetABackImageApi.md#byApi) | **GET** /check-payments/{checkPaymentId}/back | Get back image
*GetAFrontImageApi* | [**viaApi**](docs/GetAFrontImageApi.md#viaApi) | **GET** /check-payments/{checkPaymentId}/front | Get front image
*GetListAccountEndOfDayBalancesHistoryApi* | [**fromApi**](docs/GetListAccountEndOfDayBalancesHistoryApi.md#fromApi) | **GET** /account-end-of-day | Get AccountEndOfDay List
*ReopenAnAccountApi* | [**byId**](docs/ReopenAnAccountApi.md#byId) | **POST** /accounts/{accountId}/reopen | Reopen an Account by Id
*ReportCardAsLostApi* | [**viaApi**](docs/ReportCardAsLostApi.md#viaApi) | **POST** /cards/{cardId}/report-lost | Report lost as stolen
*ReportCardAsStolenApi* | [**viaApi**](docs/ReportCardAsStolenApi.md#viaApi) | **POST** /cards/{cardId}/report-stolen | Report card as stolen
*ReturnCheckPaymentApi* | [**byId**](docs/ReturnCheckPaymentApi.md#byId) | **POST** /check-payments/{checkPaymentId}/return | Return Check Payment by Id
*RevokeOrgApiTokenApi* | [**rewardById**](docs/RevokeOrgApiTokenApi.md#rewardById) | **DELETE** /users/{userId}/api-tokens/{tokenId} | Get Reward by Id
*StopPaymentApi* | [**cancel**](docs/StopPaymentApi.md#cancel) | **DELETE** /stop-payments/{stop_payment_id} | Cancel a stop payment
*StopPaymentApi* | [**create**](docs/StopPaymentApi.md#create) | **POST** /stop-payments | Create Stop Payment
*StopPaymentApi* | [**disableStopPayment**](docs/StopPaymentApi.md#disableStopPayment) | **POST** /stop-payments/{stop_payment_id}/disable | Disable a stop payment
*StopPaymentApi* | [**getDetails**](docs/StopPaymentApi.md#getDetails) | **GET** /stop-payments/{stop_payment_id} | Get details of a specific stop payment
*StopPaymentApi* | [**getList**](docs/StopPaymentApi.md#getList) | **GET** /stop-payments | Get a list of stop payments
*UnfreezeAccountApi* | [**byId**](docs/UnfreezeAccountApi.md#byId) | **POST** /accounts/{accountId}/unfreeze | Unfreeze Account by Id
*UnfreezeACardApi* | [**byId**](docs/UnfreezeACardApi.md#byId) | **POST** /cards/{cardId}/unfreeze | Unfreeze a Card
*UpdateAccountApi* | [**viaApi**](docs/UpdateAccountApi.md#viaApi) | **PATCH** /accounts/{accountId} | Update Account
*UpdateApplicationApi* | [**viaApi**](docs/UpdateApplicationApi.md#viaApi) | **PATCH** /applications/{applicationId} | Update Application
*UpdateCardApi* | [**viaApi**](docs/UpdateCardApi.md#viaApi) | **PATCH** /cards/{cardId} | Update Card
*UpdateCheckDepositApi* | [**byId**](docs/UpdateCheckDepositApi.md#byId) | **PATCH** /check-deposits/{checkDepositId} | Update Check Deposit
*UpdateCounterpartyApi* | [**viaApi**](docs/UpdateCounterpartyApi.md#viaApi) | **PATCH** /counterparties/{counterpartyId} | Update Counterparty
*UpdateCustomerApi* | [**viaApi**](docs/UpdateCustomerApi.md#viaApi) | **PATCH** /customers/{customerId} | Update Customer
*UpdatePaymentApi* | [**viaApi**](docs/UpdatePaymentApi.md#viaApi) | **PATCH** /payments/{paymentId} | Update Payment
*UpdateReceivedPaymentApi* | [**viaApi**](docs/UpdateReceivedPaymentApi.md#viaApi) | **PATCH** /received-payments/{paymentId} | Update Received Payment
*UpdateTransactionApi* | [**viaApi**](docs/UpdateTransactionApi.md#viaApi) | **PATCH** /accounts/{accountId}/transactions/{transactionId} | Update Transaction
*UpdateWebhookApi* | [**viaApi**](docs/UpdateWebhookApi.md#viaApi) | **PATCH** /webhooks/{webhookId} | Update Webhook
*UploadAJpegDocumentForAnApplicationApi* | [**viaApi**](docs/UploadAJpegDocumentForAnApplicationApi.md#viaApi) | **PUT** /applications/{applicationId}/documents/{documentId}/? | Upload a JPEG document
*UploadAJpegDocumentForAnApplicationBackSideApi* | [**put**](docs/UploadAJpegDocumentForAnApplicationBackSideApi.md#put) | **PUT** /applications/{applicationId}/documents/{documentId}/back/? | Upload a JPEG document - Back Side
*UploadAPngDocumentForAnApplicationApi* | [**byId**](docs/UploadAPngDocumentForAnApplicationApi.md#byId) | **PUT** /applications/{applicationId}/documents/{documentId} | Upload a PNG document
*UploadAPngDocumentForAnApplicationBackSideApi* | [**put**](docs/UploadAPngDocumentForAnApplicationBackSideApi.md#put) | **PUT** /applications/{applicationId}/documents/{documentId}/back | Upload a PNG document - Back Side
*VerifyADocumentForAnApplicationApi* | [**put**](docs/VerifyADocumentForAnApplicationApi.md#put) | **PUT** /applications/{applicationId}/documents/{documentId}/verify | Verify a document


## Documentation for Models

 - [AccountDocument](docs/AccountDocument.md)
 - [AccountEndOfDayResourceProperty](docs/AccountEndOfDayResourceProperty.md)
 - [AccountEndOfDayResourcePropertyAttributes](docs/AccountEndOfDayResourcePropertyAttributes.md)
 - [AccountLimitsResourceProperty](docs/AccountLimitsResourceProperty.md)
 - [ApiTokenProperty](docs/ApiTokenProperty.md)
 - [ApiTokenPropertyAttributes](docs/ApiTokenPropertyAttributes.md)
 - [ApplicationDocumentDocument](docs/ApplicationDocumentDocument.md)
 - [ApplicationDocumentDocumentAttributes](docs/ApplicationDocumentDocumentAttributes.md)
 - [ApplicationFormProperty](docs/ApplicationFormProperty.md)
 - [ApplicationFormPropertyAttributes](docs/ApplicationFormPropertyAttributes.md)
 - [ApplicationProperty](docs/ApplicationProperty.md)
 - [ApproveAuthorizationRequestByIdRequest](docs/ApproveAuthorizationRequestByIdRequest.md)
 - [ApproveAuthorizationRequestByIdResponse](docs/ApproveAuthorizationRequestByIdResponse.md)
 - [ApproveCheckPaymentByIdRequest](docs/ApproveCheckPaymentByIdRequest.md)
 - [ApproveCheckPaymentByIdRequestData](docs/ApproveCheckPaymentByIdRequestData.md)
 - [ArchiveCustomerByIdRequest](docs/ArchiveCustomerByIdRequest.md)
 - [ArchiveCustomerByIdRequestAttributes](docs/ArchiveCustomerByIdRequestAttributes.md)
 - [AtmLocation](docs/AtmLocation.md)
 - [AtmLocationAttributes](docs/AtmLocationAttributes.md)
 - [AtmLocationAttributesCoordinates](docs/AtmLocationAttributesCoordinates.md)
 - [AuthorizationDocumentProperty](docs/AuthorizationDocumentProperty.md)
 - [AuthorizationDocumentPropertyAttributes](docs/AuthorizationDocumentPropertyAttributes.md)
 - [AuthorizationRequestDocumentProperty](docs/AuthorizationRequestDocumentProperty.md)
 - [CancelApplicationByIdRequest](docs/CancelApplicationByIdRequest.md)
 - [CancelApplicationByIdRequestData](docs/CancelApplicationByIdRequestData.md)
 - [CancelApplicationByIdRequestDataAttributes](docs/CancelApplicationByIdRequestDataAttributes.md)
 - [CancelApplicationByIdResponse](docs/CancelApplicationByIdResponse.md)
 - [CardDocumentProperty](docs/CardDocumentProperty.md)
 - [CardVerificationDataProperty](docs/CardVerificationDataProperty.md)
 - [CheckDepositProperty](docs/CheckDepositProperty.md)
 - [CheckDepositPropertyAttributes](docs/CheckDepositPropertyAttributes.md)
 - [CheckPaymentResource](docs/CheckPaymentResource.md)
 - [CheckPaymentResourceAttributes](docs/CheckPaymentResourceAttributes.md)
 - [CheckPaymentResourceAttributesCounterparty](docs/CheckPaymentResourceAttributesCounterparty.md)
 - [CheckPaymentResourceRelationships](docs/CheckPaymentResourceRelationships.md)
 - [CheckPaymentResourceRelationshipsAccount](docs/CheckPaymentResourceRelationshipsAccount.md)
 - [CheckPaymentResourceRelationshipsAccountData](docs/CheckPaymentResourceRelationshipsAccountData.md)
 - [CheckPaymentResourceRelationshipsCustomer](docs/CheckPaymentResourceRelationshipsCustomer.md)
 - [CheckPaymentResourceRelationshipsCustomerData](docs/CheckPaymentResourceRelationshipsCustomerData.md)
 - [CheckPaymentResourceRelationshipsTransaction](docs/CheckPaymentResourceRelationshipsTransaction.md)
 - [CheckPaymentResourceRelationshipsTransactionData](docs/CheckPaymentResourceRelationshipsTransactionData.md)
 - [CloseACardViaApiResponse](docs/CloseACardViaApiResponse.md)
 - [CloseAccountRequestProperty](docs/CloseAccountRequestProperty.md)
 - [CloseAccountRequestPropertyAttributes](docs/CloseAccountRequestPropertyAttributes.md)
 - [CloseAnAccountByIdRequest](docs/CloseAnAccountByIdRequest.md)
 - [ConfirmCheckDepositByIdResponse](docs/ConfirmCheckDepositByIdResponse.md)
 - [ContactNullable](docs/ContactNullable.md)
 - [CounterpartyBalanceProperty](docs/CounterpartyBalanceProperty.md)
 - [CounterpartyBalancePropertyAttributes](docs/CounterpartyBalancePropertyAttributes.md)
 - [CounterpartyDocumentProperty](docs/CounterpartyDocumentProperty.md)
 - [CounterpartyDocumentPropertyAttributes](docs/CounterpartyDocumentPropertyAttributes.md)
 - [CreateACardViaApiRequest](docs/CreateACardViaApiRequest.md)
 - [CreateACardViaApiResponse](docs/CreateACardViaApiResponse.md)
 - [CreateADocumentForAnApplicationViaApiResponse](docs/CreateADocumentForAnApplicationViaApiResponse.md)
 - [CreateAPaymentViaApiRequest](docs/CreateAPaymentViaApiRequest.md)
 - [CreateARepaymentViaApiRequest](docs/CreateARepaymentViaApiRequest.md)
 - [CreateARepaymentViaApiResponse](docs/CreateARepaymentViaApiResponse.md)
 - [CreateAccountViaApiRequest](docs/CreateAccountViaApiRequest.md)
 - [CreateApplicationFormRelationshipsProperty](docs/CreateApplicationFormRelationshipsProperty.md)
 - [CreateApplicationFormViaApiRequest](docs/CreateApplicationFormViaApiRequest.md)
 - [CreateApplicationFormViaApiRequestData](docs/CreateApplicationFormViaApiRequestData.md)
 - [CreateApplicationFormViaApiRequestDataAttributes](docs/CreateApplicationFormViaApiRequestDataAttributes.md)
 - [CreateApplicationFormViaApiResponse](docs/CreateApplicationFormViaApiResponse.md)
 - [CreateApplicationViaApiRequest](docs/CreateApplicationViaApiRequest.md)
 - [CreateApplicationViaApiResponse](docs/CreateApplicationViaApiResponse.md)
 - [CreateCheckDepositViaApiRequest](docs/CreateCheckDepositViaApiRequest.md)
 - [CreateCheckDepositViaApiRequestData](docs/CreateCheckDepositViaApiRequestData.md)
 - [CreateCheckDepositViaApiRequestDataAttributes](docs/CreateCheckDepositViaApiRequestDataAttributes.md)
 - [CreateCheckDepositViaApiResponse](docs/CreateCheckDepositViaApiResponse.md)
 - [CreateCheckPaymentViaApiRequest](docs/CreateCheckPaymentViaApiRequest.md)
 - [CreateCheckPaymentViaApiResponse](docs/CreateCheckPaymentViaApiResponse.md)
 - [CreateCounterpartyViaApiRequest](docs/CreateCounterpartyViaApiRequest.md)
 - [CreateCounterpartyViaApiResponse](docs/CreateCounterpartyViaApiResponse.md)
 - [CreateCustomerTokenVerificationViaApiRequest](docs/CreateCustomerTokenVerificationViaApiRequest.md)
 - [CreateCustomerTokenVerificationViaApiRequestData](docs/CreateCustomerTokenVerificationViaApiRequestData.md)
 - [CreateCustomerTokenVerificationViaApiRequestDataAttributes](docs/CreateCustomerTokenVerificationViaApiRequestDataAttributes.md)
 - [CreateCustomerTokenVerificationViaApiResponse](docs/CreateCustomerTokenVerificationViaApiResponse.md)
 - [CreateCustomerTokenViaApiRequest](docs/CreateCustomerTokenViaApiRequest.md)
 - [CreateCustomerTokenViaApiRequestData](docs/CreateCustomerTokenViaApiRequestData.md)
 - [CreateCustomerTokenViaApiRequestDataAttributes](docs/CreateCustomerTokenViaApiRequestDataAttributes.md)
 - [CreateCustomerTokenViaApiResponse](docs/CreateCustomerTokenViaApiResponse.md)
 - [CreateFeeViaApiResponse](docs/CreateFeeViaApiResponse.md)
 - [CreateOrgApiTokenViaApiRequest](docs/CreateOrgApiTokenViaApiRequest.md)
 - [CreateOrgApiTokenViaApiRequestData](docs/CreateOrgApiTokenViaApiRequestData.md)
 - [CreateOrgApiTokenViaApiRequestDataAttributes](docs/CreateOrgApiTokenViaApiRequestDataAttributes.md)
 - [CreateOrgApiTokenViaApiRequestDataAttributesResourcesInner](docs/CreateOrgApiTokenViaApiRequestDataAttributesResourcesInner.md)
 - [CreateOrgApiTokenViaApiResponse](docs/CreateOrgApiTokenViaApiResponse.md)
 - [CreateRecurringPaymentViaApiRequest](docs/CreateRecurringPaymentViaApiRequest.md)
 - [CreateRecurringPaymentViaApiResponse](docs/CreateRecurringPaymentViaApiResponse.md)
 - [CreateRewardViaApiRequest](docs/CreateRewardViaApiRequest.md)
 - [CreateRewardViaApiRequestData](docs/CreateRewardViaApiRequestData.md)
 - [CreateRewardViaApiRequestDataAttributes](docs/CreateRewardViaApiRequestDataAttributes.md)
 - [CreateRewardViaApiResponse](docs/CreateRewardViaApiResponse.md)
 - [CreateWebhookViaApiRequest](docs/CreateWebhookViaApiRequest.md)
 - [CreateWebhookViaApiRequestData](docs/CreateWebhookViaApiRequestData.md)
 - [CreateWebhookViaApiRequestDataAttributes](docs/CreateWebhookViaApiRequestDataAttributes.md)
 - [CreateWebhookViaApiResponse](docs/CreateWebhookViaApiResponse.md)
 - [Customer](docs/Customer.md)
 - [CustomerTokenProperty](docs/CustomerTokenProperty.md)
 - [CustomerTokenPropertyAttributes](docs/CustomerTokenPropertyAttributes.md)
 - [CustomerTokenVerificationProperty](docs/CustomerTokenVerificationProperty.md)
 - [CustomerTokenVerificationPropertyAttributes](docs/CustomerTokenVerificationPropertyAttributes.md)
 - [DeclineAuthorizationRequestViaApiRequest](docs/DeclineAuthorizationRequestViaApiRequest.md)
 - [DeclineAuthorizationRequestViaApiResponse](docs/DeclineAuthorizationRequestViaApiResponse.md)
 - [DisableWebhookViaApiResponse](docs/DisableWebhookViaApiResponse.md)
 - [DisputeDocument](docs/DisputeDocument.md)
 - [DisputeDocumentAttributes](docs/DisputeDocumentAttributes.md)
 - [DisputeDocumentAttributesStatusHistoryInner](docs/DisputeDocumentAttributesStatusHistoryInner.md)
 - [EnableWebhookViaApiResponse](docs/EnableWebhookViaApiResponse.md)
 - [EventResourceProperty](docs/EventResourceProperty.md)
 - [FeeProperty](docs/FeeProperty.md)
 - [FeePropertyAttributes](docs/FeePropertyAttributes.md)
 - [FireEventByIdResponse](docs/FireEventByIdResponse.md)
 - [FreezeACardViaApiResponse](docs/FreezeACardViaApiResponse.md)
 - [FreezeAnAccountByIdRequest](docs/FreezeAnAccountByIdRequest.md)
 - [FreezeAnAccountByIdRequestData](docs/FreezeAnAccountByIdRequestData.md)
 - [FreezeAnAccountByIdRequestDataAttributes](docs/FreezeAnAccountByIdRequestDataAttributes.md)
 - [GetAccountByIdResponse](docs/GetAccountByIdResponse.md)
 - [GetAccountLimitsByIdResponse](docs/GetAccountLimitsByIdResponse.md)
 - [GetAccountLimitsByIdResponseData](docs/GetAccountLimitsByIdResponseData.md)
 - [GetAccountLimitsByIdResponseDataAttributes](docs/GetAccountLimitsByIdResponseDataAttributes.md)
 - [GetAccountLimitsByIdResponseDataAttributesCard](docs/GetAccountLimitsByIdResponseDataAttributesCard.md)
 - [GetAccountLimitsByIdResponseDataAttributesCardLimits](docs/GetAccountLimitsByIdResponseDataAttributesCardLimits.md)
 - [GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily](docs/GetAccountLimitsByIdResponseDataAttributesCardTotalsDaily.md)
 - [GetApplicationByIdResponse](docs/GetApplicationByIdResponse.md)
 - [GetApplicationFormByIdResponse](docs/GetApplicationFormByIdResponse.md)
 - [GetAtmLocationsListFromApiFilterParameter](docs/GetAtmLocationsListFromApiFilterParameter.md)
 - [GetAuthorizationByIdResponse](docs/GetAuthorizationByIdResponse.md)
 - [GetAuthorizationRequestByIdResponse](docs/GetAuthorizationRequestByIdResponse.md)
 - [GetCardByIdResponse](docs/GetCardByIdResponse.md)
 - [GetCardLimitsByIdResponse](docs/GetCardLimitsByIdResponse.md)
 - [GetCardPinStatusPinStatusResponse](docs/GetCardPinStatusPinStatusResponse.md)
 - [GetCheckDepositBackImageByIdResponse](docs/GetCheckDepositBackImageByIdResponse.md)
 - [GetCheckDepositByIdResponse](docs/GetCheckDepositByIdResponse.md)
 - [GetCheckDepositFrontImageByIdResponse](docs/GetCheckDepositFrontImageByIdResponse.md)
 - [GetCounterpartyBalanceRecurringPaymentFromApiResponse](docs/GetCounterpartyBalanceRecurringPaymentFromApiResponse.md)
 - [GetCounterpartyByIdResponse](docs/GetCounterpartyByIdResponse.md)
 - [GetDisputeByIdResponse](docs/GetDisputeByIdResponse.md)
 - [GetEventByIdResponse](docs/GetEventByIdResponse.md)
 - [GetInstitutionByRoutingNumberResponse](docs/GetInstitutionByRoutingNumberResponse.md)
 - [GetListAccountEndofdayBalancesHistoryFromApiResponse](docs/GetListAccountEndofdayBalancesHistoryFromApiResponse.md)
 - [GetListAccountsFromApiFilterParameter](docs/GetListAccountsFromApiFilterParameter.md)
 - [GetListAccountsFromApiResponse](docs/GetListAccountsFromApiResponse.md)
 - [GetListApplicationFormsViaApiFilterParameter](docs/GetListApplicationFormsViaApiFilterParameter.md)
 - [GetListApplicationFormsViaApiResponse](docs/GetListApplicationFormsViaApiResponse.md)
 - [GetListApplicationsFromApi200Response](docs/GetListApplicationsFromApi200Response.md)
 - [GetListApplicationsFromApi200ResponseMeta](docs/GetListApplicationsFromApi200ResponseMeta.md)
 - [GetListApplicationsFromApi200ResponseMetaPagination](docs/GetListApplicationsFromApi200ResponseMetaPagination.md)
 - [GetListApplicationsFromApiFilterParameter](docs/GetListApplicationsFromApiFilterParameter.md)
 - [GetListAuthorizationRequestsFromApiFilterParameter](docs/GetListAuthorizationRequestsFromApiFilterParameter.md)
 - [GetListAuthorizationRequestsFromApiResponse](docs/GetListAuthorizationRequestsFromApiResponse.md)
 - [GetListAuthorizationsFromApiFilterParameter](docs/GetListAuthorizationsFromApiFilterParameter.md)
 - [GetListAuthorizationsFromApiResponse](docs/GetListAuthorizationsFromApiResponse.md)
 - [GetListCheckDepositsFromApiFilterParameter](docs/GetListCheckDepositsFromApiFilterParameter.md)
 - [GetListCheckDepositsFromApiResponse](docs/GetListCheckDepositsFromApiResponse.md)
 - [GetListCheckPaymentsFromApiFilterParameter](docs/GetListCheckPaymentsFromApiFilterParameter.md)
 - [GetListCheckPaymentsFromApiResponse](docs/GetListCheckPaymentsFromApiResponse.md)
 - [GetListCounterpartiesFromApiFilterParameter](docs/GetListCounterpartiesFromApiFilterParameter.md)
 - [GetListCounterpartiesFromApiResponse](docs/GetListCounterpartiesFromApiResponse.md)
 - [GetListCustomersApiListFilterParameter](docs/GetListCustomersApiListFilterParameter.md)
 - [GetListCustomersApiListResponse](docs/GetListCustomersApiListResponse.md)
 - [GetListDisputesFromApiFilterParameter](docs/GetListDisputesFromApiFilterParameter.md)
 - [GetListEventsFromApiFilterParameter](docs/GetListEventsFromApiFilterParameter.md)
 - [GetListEventsFromApiResponse](docs/GetListEventsFromApiResponse.md)
 - [GetListOfCardsFromApiFilterParameter](docs/GetListOfCardsFromApiFilterParameter.md)
 - [GetListOfCardsFromApiPageParameter](docs/GetListOfCardsFromApiPageParameter.md)
 - [GetListOfCardsFromApiResponse](docs/GetListOfCardsFromApiResponse.md)
 - [GetListOfDocumentsViaApiResponse](docs/GetListOfDocumentsViaApiResponse.md)
 - [GetListOrgApiTokensFromApiResponse](docs/GetListOrgApiTokensFromApiResponse.md)
 - [GetListPaymentsFromApiFilterParameter](docs/GetListPaymentsFromApiFilterParameter.md)
 - [GetListPaymentsFromApiResponse](docs/GetListPaymentsFromApiResponse.md)
 - [GetListRecurringPaymentsFromApiFilterParameter](docs/GetListRecurringPaymentsFromApiFilterParameter.md)
 - [GetListRecurringPaymentsFromApiResponse](docs/GetListRecurringPaymentsFromApiResponse.md)
 - [GetListRepaymentsFromApiFilterParameter](docs/GetListRepaymentsFromApiFilterParameter.md)
 - [GetListRepaymentsFromApiResponse](docs/GetListRepaymentsFromApiResponse.md)
 - [GetListRewardsFromApiFilterParameter](docs/GetListRewardsFromApiFilterParameter.md)
 - [GetListRewardsFromApiResponse](docs/GetListRewardsFromApiResponse.md)
 - [GetListStatementsFromApiFilterParameter](docs/GetListStatementsFromApiFilterParameter.md)
 - [GetListStatementsFromApiResponse](docs/GetListStatementsFromApiResponse.md)
 - [GetListTransactionsFromApiFilterParameter](docs/GetListTransactionsFromApiFilterParameter.md)
 - [GetListTransactionsFromApiResponse](docs/GetListTransactionsFromApiResponse.md)
 - [GetListTransactionsFromApiResponseIncludedInner](docs/GetListTransactionsFromApiResponseIncludedInner.md)
 - [GetListWebhooksFromApiFilterParameter](docs/GetListWebhooksFromApiFilterParameter.md)
 - [GetListWebhooksFromApiResponse](docs/GetListWebhooksFromApiResponse.md)
 - [GetPaymentByIdResponse](docs/GetPaymentByIdResponse.md)
 - [GetReceivedPaymentByIdResponse](docs/GetReceivedPaymentByIdResponse.md)
 - [GetReceivedPaymentsListFromApiResponse](docs/GetReceivedPaymentsListFromApiResponse.md)
 - [GetRewardByIdResponse](docs/GetRewardByIdResponse.md)
 - [GetTransactionByIdResponse](docs/GetTransactionByIdResponse.md)
 - [GetWebhookByIdResponse](docs/GetWebhookByIdResponse.md)
 - [InstitutionResourceProperty](docs/InstitutionResourceProperty.md)
 - [InstitutionResourcePropertyAttributes](docs/InstitutionResourcePropertyAttributes.md)
 - [MerchantProperty](docs/MerchantProperty.md)
 - [PaymentResourceProperty](docs/PaymentResourceProperty.md)
 - [ReceivedPaymentResourceProperty](docs/ReceivedPaymentResourceProperty.md)
 - [ReceivedPaymentResourcePropertyAttributes](docs/ReceivedPaymentResourcePropertyAttributes.md)
 - [RecurringPaymentResource](docs/RecurringPaymentResource.md)
 - [RepaymentResource](docs/RepaymentResource.md)
 - [ReportCardAsLostViaApiResponse](docs/ReportCardAsLostViaApiResponse.md)
 - [ReportCardAsStolenViaApiResponse](docs/ReportCardAsStolenViaApiResponse.md)
 - [ReturnCheckPaymentByIdRequest](docs/ReturnCheckPaymentByIdRequest.md)
 - [ReturnCheckPaymentByIdRequestData](docs/ReturnCheckPaymentByIdRequestData.md)
 - [ReturnCheckPaymentByIdRequestDataAttributes](docs/ReturnCheckPaymentByIdRequestDataAttributes.md)
 - [RevokeOrgApiTokenRewardByIdResponse](docs/RevokeOrgApiTokenRewardByIdResponse.md)
 - [RewardProperty](docs/RewardProperty.md)
 - [RewardPropertyAttributes](docs/RewardPropertyAttributes.md)
 - [Statement](docs/Statement.md)
 - [StatementAttributes](docs/StatementAttributes.md)
 - [StopPaymentCreateRequest](docs/StopPaymentCreateRequest.md)
 - [StopPaymentCreateResponse](docs/StopPaymentCreateResponse.md)
 - [StopPaymentGetListFilterParameter](docs/StopPaymentGetListFilterParameter.md)
 - [StopPaymentGetListResponse](docs/StopPaymentGetListResponse.md)
 - [StopPaymentProperty](docs/StopPaymentProperty.md)
 - [StopPaymentPropertyAttributes](docs/StopPaymentPropertyAttributes.md)
 - [StopPaymentPropertyRelationships](docs/StopPaymentPropertyRelationships.md)
 - [StopPaymentPropertyRelationshipsCheckPayments](docs/StopPaymentPropertyRelationshipsCheckPayments.md)
 - [StopPaymentPropertyRelationshipsCheckPaymentsDataInner](docs/StopPaymentPropertyRelationshipsCheckPaymentsDataInner.md)
 - [TransactionResourceProperty](docs/TransactionResourceProperty.md)
 - [UnfreezeACardByIdResponse](docs/UnfreezeACardByIdResponse.md)
 - [UpdateAccountViaApiRequest](docs/UpdateAccountViaApiRequest.md)
 - [UpdateAccountViaApiResponse](docs/UpdateAccountViaApiResponse.md)
 - [UpdateApplicationViaApiRequest](docs/UpdateApplicationViaApiRequest.md)
 - [UpdateCardViaApiRequest](docs/UpdateCardViaApiRequest.md)
 - [UpdateCardViaApiResponse](docs/UpdateCardViaApiResponse.md)
 - [UpdateCheckDepositByIdRequest](docs/UpdateCheckDepositByIdRequest.md)
 - [UpdateCheckDepositByIdResponse](docs/UpdateCheckDepositByIdResponse.md)
 - [UpdateCounterpartyViaApiRequest](docs/UpdateCounterpartyViaApiRequest.md)
 - [UpdateCounterpartyViaApiResponse](docs/UpdateCounterpartyViaApiResponse.md)
 - [UpdateCustomerViaApiRequest](docs/UpdateCustomerViaApiRequest.md)
 - [UpdateCustomerViaApiResponse](docs/UpdateCustomerViaApiResponse.md)
 - [UpdatePaymentViaApiRequest](docs/UpdatePaymentViaApiRequest.md)
 - [UpdatePaymentViaApiResponse](docs/UpdatePaymentViaApiResponse.md)
 - [UpdateReceivedPaymentViaApiRequest](docs/UpdateReceivedPaymentViaApiRequest.md)
 - [UpdateReceivedPaymentViaApiResponse](docs/UpdateReceivedPaymentViaApiResponse.md)
 - [UpdateTransactionViaApiRequest](docs/UpdateTransactionViaApiRequest.md)
 - [UpdateTransactionViaApiResponse](docs/UpdateTransactionViaApiResponse.md)
 - [UpdateWebhookViaApiRequest](docs/UpdateWebhookViaApiRequest.md)
 - [UpdateWebhookViaApiRequestData](docs/UpdateWebhookViaApiRequestData.md)
 - [UpdateWebhookViaApiRequestDataAttributes](docs/UpdateWebhookViaApiRequestDataAttributes.md)
 - [UpdateWebhookViaApiResponse](docs/UpdateWebhookViaApiResponse.md)
 - [VerifyADocumentForAnApplicationPutRequest](docs/VerifyADocumentForAnApplicationPutRequest.md)
 - [WebhookProperty](docs/WebhookProperty.md)
 - [WebhookPropertyAttributes](docs/WebhookPropertyAttributes.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

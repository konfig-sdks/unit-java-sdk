# UpdateTransactionApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viaApi**](UpdateTransactionApi.md#viaApi) | **PATCH** /accounts/{accountId}/transactions/{transactionId} | Update Transaction |


<a name="viaApi"></a>
# **viaApi**
> UpdateTransactionViaApiResponse viaApi(accountId, transactionId, updateTransactionViaApiRequest).execute();

Update Transaction

Update a Transaction via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UpdateTransactionApi;
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
    Object data = null;
    String accountId = "accountId_example"; // ID of the account to update transaction from
    String transactionId = "transactionId_example"; // ID of the transaction to update
    try {
      UpdateTransactionViaApiResponse result = client
              .updateTransaction
              .viaApi(data, accountId, transactionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateTransactionApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateTransactionViaApiResponse> response = client
              .updateTransaction
              .viaApi(data, accountId, transactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateTransactionApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| ID of the account to update transaction from | |
| **transactionId** | **String**| ID of the transaction to update | |
| **updateTransactionViaApiRequest** | [**UpdateTransactionViaApiRequest**](UpdateTransactionViaApiRequest.md)| Update Transaction Request | |

### Return type

[**UpdateTransactionViaApiResponse**](UpdateTransactionViaApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


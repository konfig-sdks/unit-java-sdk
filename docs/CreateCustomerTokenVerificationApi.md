# CreateCustomerTokenVerificationApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viaApi**](CreateCustomerTokenVerificationApi.md#viaApi) | **POST** /customers/{customerId}/token/verification | Create Customer Token Verification |


<a name="viaApi"></a>
# **viaApi**
> CreateCustomerTokenVerificationViaApiResponse viaApi(customerId, createCustomerTokenVerificationViaApiRequest).execute();

Create Customer Token Verification

Create a Customer Token Verification via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CreateCustomerTokenVerificationApi;
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
    String customerId = "customerId_example"; // ID of the customer to create token for
    CreateCustomerTokenVerificationViaApiRequestData data = new CreateCustomerTokenVerificationViaApiRequestData();
    try {
      CreateCustomerTokenVerificationViaApiResponse result = client
              .createCustomerTokenVerification
              .viaApi(customerId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateCustomerTokenVerificationApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateCustomerTokenVerificationViaApiResponse> response = client
              .createCustomerTokenVerification
              .viaApi(customerId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateCustomerTokenVerificationApi#viaApi");
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
| **customerId** | **String**| ID of the customer to create token for | |
| **createCustomerTokenVerificationViaApiRequest** | [**CreateCustomerTokenVerificationViaApiRequest**](CreateCustomerTokenVerificationViaApiRequest.md)| Create Customer Token Verification Request | |

### Return type

[**CreateCustomerTokenVerificationViaApiResponse**](CreateCustomerTokenVerificationViaApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


# UpdateReceivedPaymentApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viaApi**](UpdateReceivedPaymentApi.md#viaApi) | **PATCH** /received-payments/{paymentId} | Update Received Payment |


<a name="viaApi"></a>
# **viaApi**
> UpdateReceivedPaymentViaApiResponse viaApi(paymentId, updateReceivedPaymentViaApiRequest).execute();

Update Received Payment

Update a Received Payment via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UpdateReceivedPaymentApi;
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
    String paymentId = "paymentId_example"; // ID of the payment to update
    try {
      UpdateReceivedPaymentViaApiResponse result = client
              .updateReceivedPayment
              .viaApi(data, paymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateReceivedPaymentApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateReceivedPaymentViaApiResponse> response = client
              .updateReceivedPayment
              .viaApi(data, paymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateReceivedPaymentApi#viaApi");
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
| **paymentId** | **String**| ID of the payment to update | |
| **updateReceivedPaymentViaApiRequest** | [**UpdateReceivedPaymentViaApiRequest**](UpdateReceivedPaymentViaApiRequest.md)| Update Received Payment Request | |

### Return type

[**UpdateReceivedPaymentViaApiResponse**](UpdateReceivedPaymentViaApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


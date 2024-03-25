# GetReceivedPaymentsListApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fromApi**](GetReceivedPaymentsListApi.md#fromApi) | **GET** /received-payments | Get Received Payments List |


<a name="fromApi"></a>
# **fromApi**
> GetReceivedPaymentsListFromApiResponse fromApi().included(included).execute();

Get Received Payments List

Get Received Payments from API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GetReceivedPaymentsListApi;
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
    String included = "included_example";
    try {
      GetReceivedPaymentsListFromApiResponse result = client
              .getReceivedPaymentsList
              .fromApi()
              .included(included)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIncluded());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetReceivedPaymentsListApi#fromApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetReceivedPaymentsListFromApiResponse> response = client
              .getReceivedPaymentsList
              .fromApi()
              .included(included)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetReceivedPaymentsListApi#fromApi");
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
| **included** | **String**|  | [optional] |

### Return type

[**GetReceivedPaymentsListFromApiResponse**](GetReceivedPaymentsListFromApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


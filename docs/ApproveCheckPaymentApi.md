# ApproveCheckPaymentApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byId**](ApproveCheckPaymentApi.md#byId) | **POST** /check-payments/{checkPaymentId}/approve | Approve Check Payment by Id |


<a name="byId"></a>
# **byId**
> Object byId(checkPaymentId, approveCheckPaymentByIdRequest).execute();

Approve Check Payment by Id

Approve a Check Payment via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApproveCheckPaymentApi;
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
    String checkPaymentId = "checkPaymentId_example"; // ID of the check payment to approve
    ApproveCheckPaymentByIdRequestData data = new ApproveCheckPaymentByIdRequestData();
    try {
      Object result = client
              .approveCheckPayment
              .byId(checkPaymentId)
              .data(data)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApproveCheckPaymentApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .approveCheckPayment
              .byId(checkPaymentId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApproveCheckPaymentApi#byId");
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
| **checkPaymentId** | **String**| ID of the check payment to approve | |
| **approveCheckPaymentByIdRequest** | [**ApproveCheckPaymentByIdRequest**](ApproveCheckPaymentByIdRequest.md)| Approve Check Payment Request | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


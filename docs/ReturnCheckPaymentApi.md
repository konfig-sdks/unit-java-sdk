# ReturnCheckPaymentApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byId**](ReturnCheckPaymentApi.md#byId) | **POST** /check-payments/{checkPaymentId}/return | Return Check Payment by Id |


<a name="byId"></a>
# **byId**
> Object byId(checkPaymentId, returnCheckPaymentByIdRequest).execute();

Return Check Payment by Id

Return a Check Payment via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReturnCheckPaymentApi;
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
    String checkPaymentId = "checkPaymentId_example"; // ID of the check payment to return
    ReturnCheckPaymentByIdRequestData data = new ReturnCheckPaymentByIdRequestData();
    try {
      Object result = client
              .returnCheckPayment
              .byId(checkPaymentId)
              .data(data)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnCheckPaymentApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .returnCheckPayment
              .byId(checkPaymentId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnCheckPaymentApi#byId");
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
| **checkPaymentId** | **String**| ID of the check payment to return | |
| **returnCheckPaymentByIdRequest** | [**ReturnCheckPaymentByIdRequest**](ReturnCheckPaymentByIdRequest.md)| Return Check Payment Request | |

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


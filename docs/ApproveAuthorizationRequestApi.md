# ApproveAuthorizationRequestApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byId**](ApproveAuthorizationRequestApi.md#byId) | **POST** /authorization-requests/{authorizationId}/approve | Approve Authorization Request by Id |


<a name="byId"></a>
# **byId**
> ApproveAuthorizationRequestByIdResponse byId(authorizationId, approveAuthorizationRequestByIdRequest).execute();

Approve Authorization Request by Id

Approve a Authorization Request via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApproveAuthorizationRequestApi;
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
    String authorizationId = "authorizationId_example"; // ID of the authorization request to approve
    Object data = null;
    try {
      ApproveAuthorizationRequestByIdResponse result = client
              .approveAuthorizationRequest
              .byId(authorizationId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApproveAuthorizationRequestApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApproveAuthorizationRequestByIdResponse> response = client
              .approveAuthorizationRequest
              .byId(authorizationId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApproveAuthorizationRequestApi#byId");
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
| **authorizationId** | **String**| ID of the authorization request to approve | |
| **approveAuthorizationRequestByIdRequest** | [**ApproveAuthorizationRequestByIdRequest**](ApproveAuthorizationRequestByIdRequest.md)| Approve Authorization Request | |

### Return type

[**ApproveAuthorizationRequestByIdResponse**](ApproveAuthorizationRequestByIdResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


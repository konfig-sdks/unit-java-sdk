# DeclineAuthorizationRequestApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viaApi**](DeclineAuthorizationRequestApi.md#viaApi) | **POST** /authorization-requests/{authorizationId}/decline | Decline Authorization Request |


<a name="viaApi"></a>
# **viaApi**
> DeclineAuthorizationRequestViaApiResponse viaApi(authorizationId, declineAuthorizationRequestViaApiRequest).execute();

Decline Authorization Request

Decline Authorization Request via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeclineAuthorizationRequestApi;
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
    String authorizationId = "authorizationId_example"; // ID of the authorization request to decline
    Object data = null;
    try {
      DeclineAuthorizationRequestViaApiResponse result = client
              .declineAuthorizationRequest
              .viaApi(authorizationId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeclineAuthorizationRequestApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeclineAuthorizationRequestViaApiResponse> response = client
              .declineAuthorizationRequest
              .viaApi(authorizationId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeclineAuthorizationRequestApi#viaApi");
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
| **authorizationId** | **String**| ID of the authorization request to decline | |
| **declineAuthorizationRequestViaApiRequest** | [**DeclineAuthorizationRequestViaApiRequest**](DeclineAuthorizationRequestViaApiRequest.md)| Decline Authorization Request | |

### Return type

[**DeclineAuthorizationRequestViaApiResponse**](DeclineAuthorizationRequestViaApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


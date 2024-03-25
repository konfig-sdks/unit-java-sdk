# CreateOrgApiTokenApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viaApi**](CreateOrgApiTokenApi.md#viaApi) | **POST** /users/{userId}/api-tokens | Create Org API Token |


<a name="viaApi"></a>
# **viaApi**
> CreateOrgApiTokenViaApiResponse viaApi(userId, createOrgApiTokenViaApiRequest).execute();

Create Org API Token

Create an Org API Token via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CreateOrgApiTokenApi;
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
    String userId = "userId_example"; // ID of the user to create token for
    CreateOrgApiTokenViaApiRequestData data = new CreateOrgApiTokenViaApiRequestData();
    try {
      CreateOrgApiTokenViaApiResponse result = client
              .createOrgApiToken
              .viaApi(userId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateOrgApiTokenApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateOrgApiTokenViaApiResponse> response = client
              .createOrgApiToken
              .viaApi(userId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateOrgApiTokenApi#viaApi");
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
| **userId** | **String**| ID of the user to create token for | |
| **createOrgApiTokenViaApiRequest** | [**CreateOrgApiTokenViaApiRequest**](CreateOrgApiTokenViaApiRequest.md)| Create Org API Token Request | |

### Return type

[**CreateOrgApiTokenViaApiResponse**](CreateOrgApiTokenViaApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


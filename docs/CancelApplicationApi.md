# CancelApplicationApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byId**](CancelApplicationApi.md#byId) | **POST** /applications/{applicationId}/cancel | Cancel Application by Id |


<a name="byId"></a>
# **byId**
> CancelApplicationByIdResponse byId(applicationId, cancelApplicationByIdRequest).execute();

Cancel Application by Id

Cancel a Application via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CancelApplicationApi;
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
    String applicationId = "applicationId_example"; // ID of the application to get
    CancelApplicationByIdRequestData data = new CancelApplicationByIdRequestData();
    try {
      CancelApplicationByIdResponse result = client
              .cancelApplication
              .byId(applicationId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIncluded());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancelApplicationApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CancelApplicationByIdResponse> response = client
              .cancelApplication
              .byId(applicationId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancelApplicationApi#byId");
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
| **applicationId** | **String**| ID of the application to get | |
| **cancelApplicationByIdRequest** | [**CancelApplicationByIdRequest**](CancelApplicationByIdRequest.md)| Cancel Application Request | |

### Return type

[**CancelApplicationByIdResponse**](CancelApplicationByIdResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


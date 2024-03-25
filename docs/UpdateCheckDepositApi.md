# UpdateCheckDepositApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byId**](UpdateCheckDepositApi.md#byId) | **PATCH** /check-deposits/{checkDepositId} | Update Check Deposit |


<a name="byId"></a>
# **byId**
> UpdateCheckDepositByIdResponse byId(checkDepositId, updateCheckDepositByIdRequest).execute();

Update Check Deposit

Update a Check Deposit via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UpdateCheckDepositApi;
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
    String checkDepositId = "checkDepositId_example"; // ID of the check deposit to update
    try {
      UpdateCheckDepositByIdResponse result = client
              .updateCheckDeposit
              .byId(data, checkDepositId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateCheckDepositApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateCheckDepositByIdResponse> response = client
              .updateCheckDeposit
              .byId(data, checkDepositId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateCheckDepositApi#byId");
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
| **checkDepositId** | **String**| ID of the check deposit to update | |
| **updateCheckDepositByIdRequest** | [**UpdateCheckDepositByIdRequest**](UpdateCheckDepositByIdRequest.md)| Update Check Deposit Request | |

### Return type

[**UpdateCheckDepositByIdResponse**](UpdateCheckDepositByIdResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


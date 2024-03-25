# GetListAccountsApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fromApi**](GetListAccountsApi.md#fromApi) | **GET** /accounts | Get List Accounts |


<a name="fromApi"></a>
# **fromApi**
> GetListAccountsFromApiResponse fromApi().page(page).filter(filter).include(include).execute();

Get List Accounts

Get List Accounts from API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GetListAccountsApi;
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
    ERRORUNKNOWN page = new ERRORUNKNOWN();
    GetListAccountsFromApiFilterParameter filter = new HashMap();
    String include = "include_example";
    try {
      GetListAccountsFromApiResponse result = client
              .getListAccounts
              .fromApi()
              .page(page)
              .filter(filter)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIncluded());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetListAccountsApi#fromApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListAccountsFromApiResponse> response = client
              .getListAccounts
              .fromApi()
              .page(page)
              .filter(filter)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetListAccountsApi#fromApi");
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
| **page** | [**ERRORUNKNOWN**](.md)|  | [optional] |
| **filter** | [**GetListAccountsFromApiFilterParameter**](.md)|  | [optional] |
| **include** | **String**|  | [optional] |

### Return type

[**GetListAccountsFromApiResponse**](GetListAccountsFromApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | UnitError |  -  |


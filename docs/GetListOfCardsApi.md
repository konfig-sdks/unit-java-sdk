# GetListOfCardsApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fromApi**](GetListOfCardsApi.md#fromApi) | **GET** /cards | Get List of Cards |


<a name="fromApi"></a>
# **fromApi**
> GetListOfCardsFromApiResponse fromApi().page(page).filter(filter).include(include).sort(sort).execute();

Get List of Cards

Get List of Cards from API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GetListOfCardsApi;
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
    GetListOfCardsFromApiPageParameter page = new HashMap();
    GetListOfCardsFromApiFilterParameter filter = new HashMap();
    String include = "include_example";
    String sort = "sort_example";
    try {
      GetListOfCardsFromApiResponse result = client
              .getListOfCards
              .fromApi()
              .page(page)
              .filter(filter)
              .include(include)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIncluded());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetListOfCardsApi#fromApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetListOfCardsFromApiResponse> response = client
              .getListOfCards
              .fromApi()
              .page(page)
              .filter(filter)
              .include(include)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetListOfCardsApi#fromApi");
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
| **page** | [**GetListOfCardsFromApiPageParameter**](.md)|  | [optional] |
| **filter** | [**GetListOfCardsFromApiFilterParameter**](.md)|  | [optional] |
| **include** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |

### Return type

[**GetListOfCardsFromApiResponse**](GetListOfCardsFromApiResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


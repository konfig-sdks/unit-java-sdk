# ArchiveCustomerApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byId**](ArchiveCustomerApi.md#byId) | **POST** /customers/{customerId}/archive | Archive Customer by Id |


<a name="byId"></a>
# **byId**
> Object byId(customerId, archiveCustomerByIdRequest).execute();

Archive Customer by Id

Archive a Customer via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArchiveCustomerApi;
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
    String customerId = "customerId_example"; // ID of the customer to archive
    String type = "archiveCustomer";
    ArchiveCustomerByIdRequestAttributes attributes = new ArchiveCustomerByIdRequestAttributes();
    try {
      Object result = client
              .archiveCustomer
              .byId(customerId)
              .type(type)
              .attributes(attributes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchiveCustomerApi#byId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .archiveCustomer
              .byId(customerId)
              .type(type)
              .attributes(attributes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchiveCustomerApi#byId");
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
| **customerId** | **String**| ID of the customer to archive | |
| **archiveCustomerByIdRequest** | [**ArchiveCustomerByIdRequest**](ArchiveCustomerByIdRequest.md)| Archive Customer Request | |

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


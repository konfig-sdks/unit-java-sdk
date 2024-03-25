# VerifyADocumentForAnApplicationApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**put**](VerifyADocumentForAnApplicationApi.md#put) | **PUT** /applications/{applicationId}/documents/{documentId}/verify | Verify a document |


<a name="put"></a>
# **put**
> Object put(applicationId, documentId, verifyADocumentForAnApplicationPutRequest).execute();

Verify a document

Verify a document via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyADocumentForAnApplicationApi;
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
    String applicationId = "applicationId_example"; // ID of the application to verify a file for
    String documentId = "documentId_example"; // ID of the document to verify
    String jobId = "jobId_example";
    try {
      Object result = client
              .verifyADocumentForAnApplication
              .put(applicationId, documentId)
              .jobId(jobId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyADocumentForAnApplicationApi#put");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .verifyADocumentForAnApplication
              .put(applicationId, documentId)
              .jobId(jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyADocumentForAnApplicationApi#put");
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
| **applicationId** | **String**| ID of the application to verify a file for | |
| **documentId** | **String**| ID of the document to verify | |
| **verifyADocumentForAnApplicationPutRequest** | [**VerifyADocumentForAnApplicationPutRequest**](VerifyADocumentForAnApplicationPutRequest.md)| Verify Document | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


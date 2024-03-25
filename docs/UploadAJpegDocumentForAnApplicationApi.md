# UploadAJpegDocumentForAnApplicationApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viaApi**](UploadAJpegDocumentForAnApplicationApi.md#viaApi) | **PUT** /applications/{applicationId}/documents/{documentId}/? | Upload a JPEG document |


<a name="viaApi"></a>
# **viaApi**
> Object viaApi(applicationId, documentId, body).execute();

Upload a JPEG document

Upload a JPEG file via API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadAJpegDocumentForAnApplicationApi;
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
    String applicationId = "applicationId_example"; // ID of the application to upload a file to
    String documentId = "documentId_example"; // ID of the document to upload a file for
    try {
      Object result = client
              .uploadAJpegDocumentForAnApplication
              .viaApi(applicationId, documentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadAJpegDocumentForAnApplicationApi#viaApi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .uploadAJpegDocumentForAnApplication
              .viaApi(applicationId, documentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadAJpegDocumentForAnApplicationApi#viaApi");
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
| **applicationId** | **String**| ID of the application to upload a file to | |
| **documentId** | **String**| ID of the document to upload a file for | |
| **body** | **Object**| Upload JPEG File | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: image/jpeg
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


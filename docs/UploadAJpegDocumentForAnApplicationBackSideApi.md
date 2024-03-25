# UploadAJpegDocumentForAnApplicationBackSideApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**put**](UploadAJpegDocumentForAnApplicationBackSideApi.md#put) | **PUT** /applications/{applicationId}/documents/{documentId}/back/? | Upload a JPEG document - Back Side |


<a name="put"></a>
# **put**
> Object put(applicationId, documentId, body).execute();

Upload a JPEG document - Back Side

Upload a JPEG file via API - Back Side

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadAJpegDocumentForAnApplicationBackSideApi;
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
              .uploadAJpegDocumentForAnApplicationBackSide
              .put(applicationId, documentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadAJpegDocumentForAnApplicationBackSideApi#put");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .uploadAJpegDocumentForAnApplicationBackSide
              .put(applicationId, documentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadAJpegDocumentForAnApplicationBackSideApi#put");
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
| **body** | **Object**| Upload JPEG File - Back Side | |

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


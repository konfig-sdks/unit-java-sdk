# RevokeOrgApiTokenApi

All URIs are relative to *https://api.s.unit.sh*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rewardById**](RevokeOrgApiTokenApi.md#rewardById) | **DELETE** /users/{userId}/api-tokens/{tokenId} | Get Reward by Id |


<a name="rewardById"></a>
# **rewardById**
> RevokeOrgApiTokenRewardByIdResponse rewardById(userId, tokenId).execute();

Get Reward by Id

Get a Reward from API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unit;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RevokeOrgApiTokenApi;
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
    String userId = "userId_example"; // ID of the user to revoke token
    String tokenId = "tokenId_example"; // ID of the token to revoke
    try {
      RevokeOrgApiTokenRewardByIdResponse result = client
              .revokeOrgApiToken
              .rewardById(userId, tokenId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RevokeOrgApiTokenApi#rewardById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RevokeOrgApiTokenRewardByIdResponse> response = client
              .revokeOrgApiToken
              .rewardById(userId, tokenId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RevokeOrgApiTokenApi#rewardById");
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
| **userId** | **String**| ID of the user to revoke token | |
| **tokenId** | **String**| ID of the token to revoke | |

### Return type

[**RevokeOrgApiTokenRewardByIdResponse**](RevokeOrgApiTokenRewardByIdResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


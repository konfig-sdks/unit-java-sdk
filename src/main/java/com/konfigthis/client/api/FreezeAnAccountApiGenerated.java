/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.FreezeAnAccountByIdRequest;
import com.konfigthis.client.model.FreezeAnAccountByIdRequestData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FreezeAnAccountApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FreezeAnAccountApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public FreezeAnAccountApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call byIdCall(String accountId, FreezeAnAccountByIdRequest freezeAnAccountByIdRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = freezeAnAccountByIdRequest;

        // create path and map variables
        String localVarPath = "/accounts/{accountId}/freeze"
            .replace("{" + "accountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call byIdValidateBeforeCall(String accountId, FreezeAnAccountByIdRequest freezeAnAccountByIdRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling byId(Async)");
        }

        // verify the required parameter 'freezeAnAccountByIdRequest' is set
        if (freezeAnAccountByIdRequest == null) {
            throw new ApiException("Missing the required parameter 'freezeAnAccountByIdRequest' when calling byId(Async)");
        }

        return byIdCall(accountId, freezeAnAccountByIdRequest, _callback);

    }


    private ApiResponse<Object> byIdWithHttpInfo(String accountId, FreezeAnAccountByIdRequest freezeAnAccountByIdRequest) throws ApiException {
        okhttp3.Call localVarCall = byIdValidateBeforeCall(accountId, freezeAnAccountByIdRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call byIdAsync(String accountId, FreezeAnAccountByIdRequest freezeAnAccountByIdRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = byIdValidateBeforeCall(accountId, freezeAnAccountByIdRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ByIdRequestBuilder {
        private final String accountId;
        private FreezeAnAccountByIdRequestData data;

        private ByIdRequestBuilder(String accountId) {
            this.accountId = accountId;
        }

        /**
         * Set data
         * @param data  (optional)
         * @return ByIdRequestBuilder
         */
        public ByIdRequestBuilder data(FreezeAnAccountByIdRequestData data) {
            this.data = data;
            return this;
        }
        
        /**
         * Build call for byId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            FreezeAnAccountByIdRequest freezeAnAccountByIdRequest = buildBodyParams();
            return byIdCall(accountId, freezeAnAccountByIdRequest, _callback);
        }

        private FreezeAnAccountByIdRequest buildBodyParams() {
            FreezeAnAccountByIdRequest freezeAnAccountByIdRequest = new FreezeAnAccountByIdRequest();
            freezeAnAccountByIdRequest.data(this.data);
            return freezeAnAccountByIdRequest;
        }

        /**
         * Execute byId request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            FreezeAnAccountByIdRequest freezeAnAccountByIdRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = byIdWithHttpInfo(accountId, freezeAnAccountByIdRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute byId request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            FreezeAnAccountByIdRequest freezeAnAccountByIdRequest = buildBodyParams();
            return byIdWithHttpInfo(accountId, freezeAnAccountByIdRequest);
        }

        /**
         * Execute byId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            FreezeAnAccountByIdRequest freezeAnAccountByIdRequest = buildBodyParams();
            return byIdAsync(accountId, freezeAnAccountByIdRequest, _callback);
        }
    }

    /**
     * Freeze Account by Id
     * Freeze Account via API 
     * @param accountId ID of the account to freeze (required)
     * @param freezeAnAccountByIdRequest Freeze Account Request (required)
     * @return ByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ByIdRequestBuilder byId(String accountId) throws IllegalArgumentException {
        if (accountId == null) throw new IllegalArgumentException("\"accountId\" is required but got null");
            

        return new ByIdRequestBuilder(accountId);
    }
}

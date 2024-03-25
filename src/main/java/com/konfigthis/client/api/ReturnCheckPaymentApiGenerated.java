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


import com.konfigthis.client.model.ReturnCheckPaymentByIdRequest;
import com.konfigthis.client.model.ReturnCheckPaymentByIdRequestData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReturnCheckPaymentApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReturnCheckPaymentApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ReturnCheckPaymentApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call byIdCall(String checkPaymentId, ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = returnCheckPaymentByIdRequest;

        // create path and map variables
        String localVarPath = "/check-payments/{checkPaymentId}/return"
            .replace("{" + "checkPaymentId" + "}", localVarApiClient.escapeString(checkPaymentId.toString()));

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
    private okhttp3.Call byIdValidateBeforeCall(String checkPaymentId, ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'checkPaymentId' is set
        if (checkPaymentId == null) {
            throw new ApiException("Missing the required parameter 'checkPaymentId' when calling byId(Async)");
        }

        // verify the required parameter 'returnCheckPaymentByIdRequest' is set
        if (returnCheckPaymentByIdRequest == null) {
            throw new ApiException("Missing the required parameter 'returnCheckPaymentByIdRequest' when calling byId(Async)");
        }

        return byIdCall(checkPaymentId, returnCheckPaymentByIdRequest, _callback);

    }


    private ApiResponse<Object> byIdWithHttpInfo(String checkPaymentId, ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest) throws ApiException {
        okhttp3.Call localVarCall = byIdValidateBeforeCall(checkPaymentId, returnCheckPaymentByIdRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call byIdAsync(String checkPaymentId, ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = byIdValidateBeforeCall(checkPaymentId, returnCheckPaymentByIdRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ByIdRequestBuilder {
        private final String checkPaymentId;
        private ReturnCheckPaymentByIdRequestData data;

        private ByIdRequestBuilder(String checkPaymentId) {
            this.checkPaymentId = checkPaymentId;
        }

        /**
         * Set data
         * @param data  (optional)
         * @return ByIdRequestBuilder
         */
        public ByIdRequestBuilder data(ReturnCheckPaymentByIdRequestData data) {
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
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest = buildBodyParams();
            return byIdCall(checkPaymentId, returnCheckPaymentByIdRequest, _callback);
        }

        private ReturnCheckPaymentByIdRequest buildBodyParams() {
            ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest = new ReturnCheckPaymentByIdRequest();
            returnCheckPaymentByIdRequest.data(this.data);
            return returnCheckPaymentByIdRequest;
        }

        /**
         * Execute byId request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = byIdWithHttpInfo(checkPaymentId, returnCheckPaymentByIdRequest);
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
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest = buildBodyParams();
            return byIdWithHttpInfo(checkPaymentId, returnCheckPaymentByIdRequest);
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
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            ReturnCheckPaymentByIdRequest returnCheckPaymentByIdRequest = buildBodyParams();
            return byIdAsync(checkPaymentId, returnCheckPaymentByIdRequest, _callback);
        }
    }

    /**
     * Return Check Payment by Id
     * Return a Check Payment via API 
     * @param checkPaymentId ID of the check payment to return (required)
     * @param returnCheckPaymentByIdRequest Return Check Payment Request (required)
     * @return ByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ByIdRequestBuilder byId(String checkPaymentId) throws IllegalArgumentException {
        if (checkPaymentId == null) throw new IllegalArgumentException("\"checkPaymentId\" is required but got null");
            

        return new ByIdRequestBuilder(checkPaymentId);
    }
}

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


import com.konfigthis.client.model.UpdateCheckDepositByIdRequest;
import com.konfigthis.client.model.UpdateCheckDepositByIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UpdateCheckDepositApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UpdateCheckDepositApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UpdateCheckDepositApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call byIdCall(String checkDepositId, UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateCheckDepositByIdRequest;

        // create path and map variables
        String localVarPath = "/check-deposits/{checkDepositId}"
            .replace("{" + "checkDepositId" + "}", localVarApiClient.escapeString(checkDepositId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call byIdValidateBeforeCall(String checkDepositId, UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'checkDepositId' is set
        if (checkDepositId == null) {
            throw new ApiException("Missing the required parameter 'checkDepositId' when calling byId(Async)");
        }

        // verify the required parameter 'updateCheckDepositByIdRequest' is set
        if (updateCheckDepositByIdRequest == null) {
            throw new ApiException("Missing the required parameter 'updateCheckDepositByIdRequest' when calling byId(Async)");
        }

        return byIdCall(checkDepositId, updateCheckDepositByIdRequest, _callback);

    }


    private ApiResponse<UpdateCheckDepositByIdResponse> byIdWithHttpInfo(String checkDepositId, UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest) throws ApiException {
        okhttp3.Call localVarCall = byIdValidateBeforeCall(checkDepositId, updateCheckDepositByIdRequest, null);
        Type localVarReturnType = new TypeToken<UpdateCheckDepositByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call byIdAsync(String checkDepositId, UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest, final ApiCallback<UpdateCheckDepositByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = byIdValidateBeforeCall(checkDepositId, updateCheckDepositByIdRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateCheckDepositByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ByIdRequestBuilder {
        private final Object data;
        private final String checkDepositId;

        private ByIdRequestBuilder(Object data, String checkDepositId) {
            this.data = data;
            this.checkDepositId = checkDepositId;
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
            UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest = buildBodyParams();
            return byIdCall(checkDepositId, updateCheckDepositByIdRequest, _callback);
        }

        private UpdateCheckDepositByIdRequest buildBodyParams() {
            UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest = new UpdateCheckDepositByIdRequest();
            updateCheckDepositByIdRequest.data(this.data);
            return updateCheckDepositByIdRequest;
        }

        /**
         * Execute byId request
         * @return UpdateCheckDepositByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public UpdateCheckDepositByIdResponse execute() throws ApiException {
            UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest = buildBodyParams();
            ApiResponse<UpdateCheckDepositByIdResponse> localVarResp = byIdWithHttpInfo(checkDepositId, updateCheckDepositByIdRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute byId request with HTTP info returned
         * @return ApiResponse&lt;UpdateCheckDepositByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<UpdateCheckDepositByIdResponse> executeWithHttpInfo() throws ApiException {
            UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest = buildBodyParams();
            return byIdWithHttpInfo(checkDepositId, updateCheckDepositByIdRequest);
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
        public okhttp3.Call executeAsync(final ApiCallback<UpdateCheckDepositByIdResponse> _callback) throws ApiException {
            UpdateCheckDepositByIdRequest updateCheckDepositByIdRequest = buildBodyParams();
            return byIdAsync(checkDepositId, updateCheckDepositByIdRequest, _callback);
        }
    }

    /**
     * Update Check Deposit
     * Update a Check Deposit via API 
     * @param checkDepositId ID of the check deposit to update (required)
     * @param updateCheckDepositByIdRequest Update Check Deposit Request (required)
     * @return ByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ByIdRequestBuilder byId(Object data, String checkDepositId) throws IllegalArgumentException {
        if (data == null) throw new IllegalArgumentException("\"data\" is required but got null");
        if (checkDepositId == null) throw new IllegalArgumentException("\"checkDepositId\" is required but got null");
            

        return new ByIdRequestBuilder(data, checkDepositId);
    }
}

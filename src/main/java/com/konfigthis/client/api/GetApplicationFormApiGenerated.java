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


import com.konfigthis.client.model.GetApplicationFormByIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GetApplicationFormApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GetApplicationFormApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public GetApplicationFormApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call byIdCall(String applicationFormId, String included, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/application-forms/{applicationFormId}"
            .replace("{" + "applicationFormId" + "}", localVarApiClient.escapeString(applicationFormId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (included != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("included", included));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call byIdValidateBeforeCall(String applicationFormId, String included, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationFormId' is set
        if (applicationFormId == null) {
            throw new ApiException("Missing the required parameter 'applicationFormId' when calling byId(Async)");
        }

        return byIdCall(applicationFormId, included, _callback);

    }


    private ApiResponse<GetApplicationFormByIdResponse> byIdWithHttpInfo(String applicationFormId, String included) throws ApiException {
        okhttp3.Call localVarCall = byIdValidateBeforeCall(applicationFormId, included, null);
        Type localVarReturnType = new TypeToken<GetApplicationFormByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call byIdAsync(String applicationFormId, String included, final ApiCallback<GetApplicationFormByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = byIdValidateBeforeCall(applicationFormId, included, _callback);
        Type localVarReturnType = new TypeToken<GetApplicationFormByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ByIdRequestBuilder {
        private final String applicationFormId;
        private String included;

        private ByIdRequestBuilder(String applicationFormId) {
            this.applicationFormId = applicationFormId;
        }

        /**
         * Set included
         * @param included  (optional)
         * @return ByIdRequestBuilder
         */
        public ByIdRequestBuilder included(String included) {
            this.included = included;
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
            return byIdCall(applicationFormId, included, _callback);
        }


        /**
         * Execute byId request
         * @return GetApplicationFormByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public GetApplicationFormByIdResponse execute() throws ApiException {
            ApiResponse<GetApplicationFormByIdResponse> localVarResp = byIdWithHttpInfo(applicationFormId, included);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute byId request with HTTP info returned
         * @return ApiResponse&lt;GetApplicationFormByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetApplicationFormByIdResponse> executeWithHttpInfo() throws ApiException {
            return byIdWithHttpInfo(applicationFormId, included);
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
        public okhttp3.Call executeAsync(final ApiCallback<GetApplicationFormByIdResponse> _callback) throws ApiException {
            return byIdAsync(applicationFormId, included, _callback);
        }
    }

    /**
     * Get ApplicationForm by Id
     * Get an Application Form from API 
     * @param applicationFormId ID of the application form to get (required)
     * @return ByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ByIdRequestBuilder byId(String applicationFormId) throws IllegalArgumentException {
        if (applicationFormId == null) throw new IllegalArgumentException("\"applicationFormId\" is required but got null");
            

        return new ByIdRequestBuilder(applicationFormId);
    }
}

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


import com.konfigthis.client.model.GetListStatementsFromApiFilterParameter;
import com.konfigthis.client.model.GetListStatementsFromApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GetListStatementsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GetListStatementsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public GetListStatementsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call fromApiCall(ERRORUNKNOWN page, GetListStatementsFromApiFilterParameter filter, String sort, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/statements";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
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
    private okhttp3.Call fromApiValidateBeforeCall(ERRORUNKNOWN page, GetListStatementsFromApiFilterParameter filter, String sort, final ApiCallback _callback) throws ApiException {
        return fromApiCall(page, filter, sort, _callback);

    }


    private ApiResponse<GetListStatementsFromApiResponse> fromApiWithHttpInfo(ERRORUNKNOWN page, GetListStatementsFromApiFilterParameter filter, String sort) throws ApiException {
        okhttp3.Call localVarCall = fromApiValidateBeforeCall(page, filter, sort, null);
        Type localVarReturnType = new TypeToken<GetListStatementsFromApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call fromApiAsync(ERRORUNKNOWN page, GetListStatementsFromApiFilterParameter filter, String sort, final ApiCallback<GetListStatementsFromApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fromApiValidateBeforeCall(page, filter, sort, _callback);
        Type localVarReturnType = new TypeToken<GetListStatementsFromApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class FromApiRequestBuilder {
        private ERRORUNKNOWN page;
        private GetListStatementsFromApiFilterParameter filter;
        private String sort;

        private FromApiRequestBuilder() {
        }

        /**
         * Set page
         * @param page  (optional)
         * @return FromApiRequestBuilder
         */
        public FromApiRequestBuilder page(ERRORUNKNOWN page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set filter
         * @param filter  (optional)
         * @return FromApiRequestBuilder
         */
        public FromApiRequestBuilder filter(GetListStatementsFromApiFilterParameter filter) {
            this.filter = filter;
            return this;
        }
        
        /**
         * Set sort
         * @param sort  (optional)
         * @return FromApiRequestBuilder
         */
        public FromApiRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }
        
        /**
         * Build call for fromApi
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
            return fromApiCall(page, filter, sort, _callback);
        }


        /**
         * Execute fromApi request
         * @return GetListStatementsFromApiResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public GetListStatementsFromApiResponse execute() throws ApiException {
            ApiResponse<GetListStatementsFromApiResponse> localVarResp = fromApiWithHttpInfo(page, filter, sort);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute fromApi request with HTTP info returned
         * @return ApiResponse&lt;GetListStatementsFromApiResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetListStatementsFromApiResponse> executeWithHttpInfo() throws ApiException {
            return fromApiWithHttpInfo(page, filter, sort);
        }

        /**
         * Execute fromApi request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetListStatementsFromApiResponse> _callback) throws ApiException {
            return fromApiAsync(page, filter, sort, _callback);
        }
    }

    /**
     * Get List Statements
     * Get List Statements from API 
     * @return FromApiRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public FromApiRequestBuilder fromApi() throws IllegalArgumentException {
        return new FromApiRequestBuilder();
    }
}

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


import com.konfigthis.client.model.CreateACardViaApiRequest;
import com.konfigthis.client.model.CreateACardViaApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CreateACardApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreateACardApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CreateACardApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call viaApiCall(CreateACardViaApiRequest createACardViaApiRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createACardViaApiRequest;

        // create path and map variables
        String localVarPath = "/cards";

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
    private okhttp3.Call viaApiValidateBeforeCall(CreateACardViaApiRequest createACardViaApiRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createACardViaApiRequest' is set
        if (createACardViaApiRequest == null) {
            throw new ApiException("Missing the required parameter 'createACardViaApiRequest' when calling viaApi(Async)");
        }

        return viaApiCall(createACardViaApiRequest, _callback);

    }


    private ApiResponse<CreateACardViaApiResponse> viaApiWithHttpInfo(CreateACardViaApiRequest createACardViaApiRequest) throws ApiException {
        okhttp3.Call localVarCall = viaApiValidateBeforeCall(createACardViaApiRequest, null);
        Type localVarReturnType = new TypeToken<CreateACardViaApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call viaApiAsync(CreateACardViaApiRequest createACardViaApiRequest, final ApiCallback<CreateACardViaApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = viaApiValidateBeforeCall(createACardViaApiRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateACardViaApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ViaApiRequestBuilder {
        private Object data;

        private ViaApiRequestBuilder() {
        }

        /**
         * Set data
         * @param data  (optional)
         * @return ViaApiRequestBuilder
         */
        public ViaApiRequestBuilder data(Object data) {
            this.data = data;
            return this;
        }
        
        /**
         * Build call for viaApi
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CreateACardViaApiRequest createACardViaApiRequest = buildBodyParams();
            return viaApiCall(createACardViaApiRequest, _callback);
        }

        private CreateACardViaApiRequest buildBodyParams() {
            CreateACardViaApiRequest createACardViaApiRequest = new CreateACardViaApiRequest();
            createACardViaApiRequest.data(this.data);
            return createACardViaApiRequest;
        }

        /**
         * Execute viaApi request
         * @return CreateACardViaApiResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public CreateACardViaApiResponse execute() throws ApiException {
            CreateACardViaApiRequest createACardViaApiRequest = buildBodyParams();
            ApiResponse<CreateACardViaApiResponse> localVarResp = viaApiWithHttpInfo(createACardViaApiRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute viaApi request with HTTP info returned
         * @return ApiResponse&lt;CreateACardViaApiResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CreateACardViaApiResponse> executeWithHttpInfo() throws ApiException {
            CreateACardViaApiRequest createACardViaApiRequest = buildBodyParams();
            return viaApiWithHttpInfo(createACardViaApiRequest);
        }

        /**
         * Execute viaApi request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CreateACardViaApiResponse> _callback) throws ApiException {
            CreateACardViaApiRequest createACardViaApiRequest = buildBodyParams();
            return viaApiAsync(createACardViaApiRequest, _callback);
        }
    }

    /**
     * Create a Card
     * Create a Card via API 
     * @param createACardViaApiRequest Create Card Request (required)
     * @return ViaApiRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ViaApiRequestBuilder viaApi() throws IllegalArgumentException {
        return new ViaApiRequestBuilder();
    }
}

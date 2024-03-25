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


import com.konfigthis.client.model.CreateCounterpartyViaApiRequest;
import com.konfigthis.client.model.CreateCounterpartyViaApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CreateCounterpartyApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreateCounterpartyApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CreateCounterpartyApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call viaApiCall(CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createCounterpartyViaApiRequest;

        // create path and map variables
        String localVarPath = "/counterparties";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call viaApiValidateBeforeCall(CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createCounterpartyViaApiRequest' is set
        if (createCounterpartyViaApiRequest == null) {
            throw new ApiException("Missing the required parameter 'createCounterpartyViaApiRequest' when calling viaApi(Async)");
        }

        return viaApiCall(createCounterpartyViaApiRequest, _callback);

    }


    private ApiResponse<CreateCounterpartyViaApiResponse> viaApiWithHttpInfo(CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest) throws ApiException {
        okhttp3.Call localVarCall = viaApiValidateBeforeCall(createCounterpartyViaApiRequest, null);
        Type localVarReturnType = new TypeToken<CreateCounterpartyViaApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call viaApiAsync(CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest, final ApiCallback<CreateCounterpartyViaApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = viaApiValidateBeforeCall(createCounterpartyViaApiRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateCounterpartyViaApiResponse>(){}.getType();
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
            CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest = buildBodyParams();
            return viaApiCall(createCounterpartyViaApiRequest, _callback);
        }

        private CreateCounterpartyViaApiRequest buildBodyParams() {
            CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest = new CreateCounterpartyViaApiRequest();
            createCounterpartyViaApiRequest.data(this.data);
            return createCounterpartyViaApiRequest;
        }

        /**
         * Execute viaApi request
         * @return CreateCounterpartyViaApiResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public CreateCounterpartyViaApiResponse execute() throws ApiException {
            CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest = buildBodyParams();
            ApiResponse<CreateCounterpartyViaApiResponse> localVarResp = viaApiWithHttpInfo(createCounterpartyViaApiRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute viaApi request with HTTP info returned
         * @return ApiResponse&lt;CreateCounterpartyViaApiResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CreateCounterpartyViaApiResponse> executeWithHttpInfo() throws ApiException {
            CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest = buildBodyParams();
            return viaApiWithHttpInfo(createCounterpartyViaApiRequest);
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
        public okhttp3.Call executeAsync(final ApiCallback<CreateCounterpartyViaApiResponse> _callback) throws ApiException {
            CreateCounterpartyViaApiRequest createCounterpartyViaApiRequest = buildBodyParams();
            return viaApiAsync(createCounterpartyViaApiRequest, _callback);
        }
    }

    /**
     * Create Counterparty
     * Create a counterparty via API 
     * @param createCounterpartyViaApiRequest Create Counterparty Request (required)
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

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


import com.konfigthis.client.model.CreateCustomerTokenVerificationViaApiRequest;
import com.konfigthis.client.model.CreateCustomerTokenVerificationViaApiRequestData;
import com.konfigthis.client.model.CreateCustomerTokenVerificationViaApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CreateCustomerTokenVerificationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreateCustomerTokenVerificationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CreateCustomerTokenVerificationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call viaApiCall(String customerId, CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createCustomerTokenVerificationViaApiRequest;

        // create path and map variables
        String localVarPath = "/customers/{customerId}/token/verification"
            .replace("{" + "customerId" + "}", localVarApiClient.escapeString(customerId.toString()));

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
    private okhttp3.Call viaApiValidateBeforeCall(String customerId, CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling viaApi(Async)");
        }

        // verify the required parameter 'createCustomerTokenVerificationViaApiRequest' is set
        if (createCustomerTokenVerificationViaApiRequest == null) {
            throw new ApiException("Missing the required parameter 'createCustomerTokenVerificationViaApiRequest' when calling viaApi(Async)");
        }

        return viaApiCall(customerId, createCustomerTokenVerificationViaApiRequest, _callback);

    }


    private ApiResponse<CreateCustomerTokenVerificationViaApiResponse> viaApiWithHttpInfo(String customerId, CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest) throws ApiException {
        okhttp3.Call localVarCall = viaApiValidateBeforeCall(customerId, createCustomerTokenVerificationViaApiRequest, null);
        Type localVarReturnType = new TypeToken<CreateCustomerTokenVerificationViaApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call viaApiAsync(String customerId, CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest, final ApiCallback<CreateCustomerTokenVerificationViaApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = viaApiValidateBeforeCall(customerId, createCustomerTokenVerificationViaApiRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateCustomerTokenVerificationViaApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ViaApiRequestBuilder {
        private final String customerId;
        private CreateCustomerTokenVerificationViaApiRequestData data;

        private ViaApiRequestBuilder(String customerId) {
            this.customerId = customerId;
        }

        /**
         * Set data
         * @param data  (optional)
         * @return ViaApiRequestBuilder
         */
        public ViaApiRequestBuilder data(CreateCustomerTokenVerificationViaApiRequestData data) {
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
            CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest = buildBodyParams();
            return viaApiCall(customerId, createCustomerTokenVerificationViaApiRequest, _callback);
        }

        private CreateCustomerTokenVerificationViaApiRequest buildBodyParams() {
            CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest = new CreateCustomerTokenVerificationViaApiRequest();
            createCustomerTokenVerificationViaApiRequest.data(this.data);
            return createCustomerTokenVerificationViaApiRequest;
        }

        /**
         * Execute viaApi request
         * @return CreateCustomerTokenVerificationViaApiResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public CreateCustomerTokenVerificationViaApiResponse execute() throws ApiException {
            CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest = buildBodyParams();
            ApiResponse<CreateCustomerTokenVerificationViaApiResponse> localVarResp = viaApiWithHttpInfo(customerId, createCustomerTokenVerificationViaApiRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute viaApi request with HTTP info returned
         * @return ApiResponse&lt;CreateCustomerTokenVerificationViaApiResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CreateCustomerTokenVerificationViaApiResponse> executeWithHttpInfo() throws ApiException {
            CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest = buildBodyParams();
            return viaApiWithHttpInfo(customerId, createCustomerTokenVerificationViaApiRequest);
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
        public okhttp3.Call executeAsync(final ApiCallback<CreateCustomerTokenVerificationViaApiResponse> _callback) throws ApiException {
            CreateCustomerTokenVerificationViaApiRequest createCustomerTokenVerificationViaApiRequest = buildBodyParams();
            return viaApiAsync(customerId, createCustomerTokenVerificationViaApiRequest, _callback);
        }
    }

    /**
     * Create Customer Token Verification
     * Create a Customer Token Verification via API 
     * @param customerId ID of the customer to create token for (required)
     * @param createCustomerTokenVerificationViaApiRequest Create Customer Token Verification Request (required)
     * @return ViaApiRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ViaApiRequestBuilder viaApi(String customerId) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        return new ViaApiRequestBuilder(customerId);
    }
}

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


import com.konfigthis.client.model.GetCardByIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GetCardApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GetCardApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public GetCardApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call byIdCall(String cardId, String included, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/cards/{cardId}"
            .replace("{" + "cardId" + "}", localVarApiClient.escapeString(cardId.toString()));

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
    private okhttp3.Call byIdValidateBeforeCall(String cardId, String included, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new ApiException("Missing the required parameter 'cardId' when calling byId(Async)");
        }

        return byIdCall(cardId, included, _callback);

    }


    private ApiResponse<GetCardByIdResponse> byIdWithHttpInfo(String cardId, String included) throws ApiException {
        okhttp3.Call localVarCall = byIdValidateBeforeCall(cardId, included, null);
        Type localVarReturnType = new TypeToken<GetCardByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call byIdAsync(String cardId, String included, final ApiCallback<GetCardByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = byIdValidateBeforeCall(cardId, included, _callback);
        Type localVarReturnType = new TypeToken<GetCardByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ByIdRequestBuilder {
        private final String cardId;
        private String included;

        private ByIdRequestBuilder(String cardId) {
            this.cardId = cardId;
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
            return byIdCall(cardId, included, _callback);
        }


        /**
         * Execute byId request
         * @return GetCardByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public GetCardByIdResponse execute() throws ApiException {
            ApiResponse<GetCardByIdResponse> localVarResp = byIdWithHttpInfo(cardId, included);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute byId request with HTTP info returned
         * @return ApiResponse&lt;GetCardByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetCardByIdResponse> executeWithHttpInfo() throws ApiException {
            return byIdWithHttpInfo(cardId, included);
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
        public okhttp3.Call executeAsync(final ApiCallback<GetCardByIdResponse> _callback) throws ApiException {
            return byIdAsync(cardId, included, _callback);
        }
    }

    /**
     * Get Card by Id
     * Get a Card from API 
     * @param cardId ID of the card to get (required)
     * @return ByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ByIdRequestBuilder byId(String cardId) throws IllegalArgumentException {
        if (cardId == null) throw new IllegalArgumentException("\"cardId\" is required but got null");
            

        return new ByIdRequestBuilder(cardId);
    }
}

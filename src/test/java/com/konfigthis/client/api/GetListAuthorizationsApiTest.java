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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.GetListAuthorizationsFromApiFilterParameter;
import com.konfigthis.client.model.GetListAuthorizationsFromApiResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetListAuthorizationsApi
 */
@Disabled
public class GetListAuthorizationsApiTest {

    private static GetListAuthorizationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GetListAuthorizationsApi(apiClient);
    }

    /**
     * Get List authorizations
     *
     * Get List Authorizations from API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fromApiTest() throws ApiException {
        ERRORUNKNOWN page = null;
        GetListAuthorizationsFromApiFilterParameter filter = null;
        String sort = null;
        GetListAuthorizationsFromApiResponse response = api.fromApi()
                .page(page)
                .filter(filter)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

}

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
import com.konfigthis.client.model.DisputeDocument;
import com.konfigthis.client.model.GetListDisputesFromApiFilterParameter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetListDisputesApi
 */
@Disabled
public class GetListDisputesApiTest {

    private static GetListDisputesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GetListDisputesApi(apiClient);
    }

    /**
     * Get List Disputes
     *
     * Get List Disputes from API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fromApiTest() throws ApiException {
        ERRORUNKNOWN page = null;
        GetListDisputesFromApiFilterParameter filter = null;
        List<DisputeDocument> response = api.fromApi()
                .page(page)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

}

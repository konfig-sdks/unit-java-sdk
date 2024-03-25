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
import com.konfigthis.client.model.GetListOfCardsFromApiFilterParameter;
import com.konfigthis.client.model.GetListOfCardsFromApiPageParameter;
import com.konfigthis.client.model.GetListOfCardsFromApiResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetListOfCardsApi
 */
@Disabled
public class GetListOfCardsApiTest {

    private static GetListOfCardsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GetListOfCardsApi(apiClient);
    }

    /**
     * Get List of Cards
     *
     * Get List of Cards from API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fromApiTest() throws ApiException {
        GetListOfCardsFromApiPageParameter page = null;
        GetListOfCardsFromApiFilterParameter filter = null;
        String include = null;
        String sort = null;
        GetListOfCardsFromApiResponse response = api.fromApi()
                .page(page)
                .filter(filter)
                .include(include)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

}

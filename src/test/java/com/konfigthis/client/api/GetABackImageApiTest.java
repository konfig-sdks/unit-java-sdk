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
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetABackImageApi
 */
@Disabled
public class GetABackImageApiTest {

    private static GetABackImageApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GetABackImageApi(apiClient);
    }

    /**
     * Get back image
     *
     * Get back image via API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void byApiTest() throws ApiException {
        String checkPaymentId = null;
        File response = api.byApi(checkPaymentId)
                .execute();
        // TODO: test validations
    }

}

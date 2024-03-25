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
import com.konfigthis.client.model.ApproveCheckPaymentByIdRequest;
import com.konfigthis.client.model.ApproveCheckPaymentByIdRequestData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApproveCheckPaymentApi
 */
@Disabled
public class ApproveCheckPaymentApiTest {

    private static ApproveCheckPaymentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ApproveCheckPaymentApi(apiClient);
    }

    /**
     * Approve Check Payment by Id
     *
     * Approve a Check Payment via API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void byIdTest() throws ApiException {
        String checkPaymentId = null;
        ApproveCheckPaymentByIdRequestData data = null;
        Object response = api.byId(checkPaymentId)
                .data(data)
                .execute();
        // TODO: test validations
    }

}

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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivateControlAgreementForAccountApi
 */
@Disabled
public class ActivateControlAgreementForAccountApiTest {

    private static ActivateControlAgreementForAccountApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ActivateControlAgreementForAccountApi(apiClient);
    }

    /**
     * Activate Account Control Agreement by Id
     *
     * Activate Control Agreement for Account via API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void byIdTest() throws ApiException {
        String accountId = null;
        Object response = api.byId(accountId)
                .execute();
        // TODO: test validations
    }

}

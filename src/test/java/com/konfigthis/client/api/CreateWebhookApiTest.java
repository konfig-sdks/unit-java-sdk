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
import com.konfigthis.client.model.CreateWebhookViaApiRequest;
import com.konfigthis.client.model.CreateWebhookViaApiRequestData;
import com.konfigthis.client.model.CreateWebhookViaApiResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateWebhookApi
 */
@Disabled
public class CreateWebhookApiTest {

    private static CreateWebhookApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CreateWebhookApi(apiClient);
    }

    /**
     * Create Webhook
     *
     * Create a Webhook via API 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viaApiTest() throws ApiException {
        CreateWebhookViaApiRequestData data = null;
        CreateWebhookViaApiResponse response = api.viaApi()
                .data(data)
                .execute();
        // TODO: test validations
    }

}

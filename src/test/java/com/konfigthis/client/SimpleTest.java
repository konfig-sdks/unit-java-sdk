package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.s.unit.sh";
        
        // Configure HTTP bearer authorization: bearerAuth
        configuration.token = "BEARER TOKEN";
        Unit client = new Unit(configuration);
        assertNotNull(client);
    }
}

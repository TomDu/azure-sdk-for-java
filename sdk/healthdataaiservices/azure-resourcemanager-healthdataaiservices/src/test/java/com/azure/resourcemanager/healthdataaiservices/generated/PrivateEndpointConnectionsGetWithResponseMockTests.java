// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.healthdataaiservices.HealthDataAIServicesManager;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupIds\":[\"abnetshh\"],\"privateEndpoint\":{\"id\":\"edplvwiwubmw\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"ldnkwwtppjfl\",\"actionsRequired\":\"ogaok\"},\"provisioningState\":\"Succeeded\"},\"id\":\"nsikvmkqzeqqkdl\",\"name\":\"fzxmhhvhgureodkw\",\"type\":\"bdagxt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HealthDataAIServicesManager manager = HealthDataAIServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnectionResource response = manager.privateEndpointConnections()
            .getWithResponse("erscdntne", "fiwjmygtdssls", "tmweriofzpyq", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ldnkwwtppjfl",
            response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ogaok", response.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}

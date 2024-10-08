// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mongocluster.MongoClusterManager;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupIds\":[\"nwvlryavwhheunmm\",\"hgyxzkonoc\"],\"privateEndpoint\":{\"id\":\"klyaxuconu\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"kbeype\",\"actionsRequired\":\"mjmwvvjektcx\"},\"provisioningState\":\"Failed\"},\"id\":\"wlrsffrzpwv\",\"name\":\"qdqgbi\",\"type\":\"ylihkaetckt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MongoClusterManager manager = MongoClusterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnectionResource response = manager.privateEndpointConnections()
            .getWithResponse("uzoqft", "yqzrnkcqvyxlw", "zlsico", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("kbeype", response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("mjmwvvjektcx",
            response.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}

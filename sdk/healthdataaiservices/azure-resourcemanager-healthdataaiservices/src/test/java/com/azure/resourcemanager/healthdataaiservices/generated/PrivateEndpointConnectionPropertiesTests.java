// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpoint;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.healthdataaiservices.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"groupIds\":[\"jfddgmbmbe\"],\"privateEndpoint\":{\"id\":\"bhtqqrolfpfpsa\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"uxig\",\"actionsRequired\":\"jgzjaoyfhrtx\"},\"provisioningState\":\"Succeeded\"}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("uxig", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("jgzjaoyfhrtx", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("uxig")
                        .withActionsRequired("jgzjaoyfhrtx"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("uxig", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("jgzjaoyfhrtx", model.privateLinkServiceConnectionState().actionsRequired());
    }
}

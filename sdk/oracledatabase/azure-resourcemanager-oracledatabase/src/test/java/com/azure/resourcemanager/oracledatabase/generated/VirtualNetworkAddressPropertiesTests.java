// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.VirtualNetworkAddressProperties;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkAddressPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkAddressProperties model = BinaryData.fromString(
            "{\"ipAddress\":\"bycnunvjsrtkf\",\"vmOcid\":\"nopqgikyzirtx\",\"ocid\":\"uxzejntpsew\",\"domain\":\"oi\",\"lifecycleDetails\":\"ukry\",\"provisioningState\":\"Failed\",\"lifecycleState\":\"Available\",\"timeAssigned\":\"2021-10-17T09:44:38Z\"}")
            .toObject(VirtualNetworkAddressProperties.class);
        Assertions.assertEquals("bycnunvjsrtkf", model.ipAddress());
        Assertions.assertEquals("nopqgikyzirtx", model.vmOcid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkAddressProperties model
            = new VirtualNetworkAddressProperties().withIpAddress("bycnunvjsrtkf").withVmOcid("nopqgikyzirtx");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkAddressProperties.class);
        Assertions.assertEquals("bycnunvjsrtkf", model.ipAddress());
        Assertions.assertEquals("nopqgikyzirtx", model.vmOcid());
    }
}

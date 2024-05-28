// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.PrivateIpAddressesFilter;
import org.junit.jupiter.api.Assertions;

public final class PrivateIpAddressesFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateIpAddressesFilter model
            = BinaryData.fromString("{\"subnetId\":\"tronzmyhgfi\",\"vnicId\":\"nsxkmcwaekrrjr\"}")
                .toObject(PrivateIpAddressesFilter.class);
        Assertions.assertEquals("tronzmyhgfi", model.subnetId());
        Assertions.assertEquals("nsxkmcwaekrrjr", model.vnicId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateIpAddressesFilter model
            = new PrivateIpAddressesFilter().withSubnetId("tronzmyhgfi").withVnicId("nsxkmcwaekrrjr");
        model = BinaryData.fromObject(model).toObject(PrivateIpAddressesFilter.class);
        Assertions.assertEquals("tronzmyhgfi", model.subnetId());
        Assertions.assertEquals("nsxkmcwaekrrjr", model.vnicId());
    }
}

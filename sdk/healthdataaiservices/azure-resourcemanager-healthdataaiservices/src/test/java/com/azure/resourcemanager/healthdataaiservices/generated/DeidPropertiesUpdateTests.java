// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthdataaiservices.models.DeidPropertiesUpdate;
import com.azure.resourcemanager.healthdataaiservices.models.PublicNetworkAccess;
import org.junit.jupiter.api.Assertions;

public final class DeidPropertiesUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeidPropertiesUpdate model
            = BinaryData.fromString("{\"publicNetworkAccess\":\"Enabled\"}").toObject(DeidPropertiesUpdate.class);
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeidPropertiesUpdate model = new DeidPropertiesUpdate().withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(DeidPropertiesUpdate.class);
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.AllConnectionStringType;
import org.junit.jupiter.api.Assertions;

public final class AllConnectionStringTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllConnectionStringType model
            = BinaryData.fromString("{\"high\":\"wzo\",\"low\":\"j\",\"medium\":\"elluwfziton\"}")
                .toObject(AllConnectionStringType.class);
        Assertions.assertEquals("wzo", model.high());
        Assertions.assertEquals("j", model.low());
        Assertions.assertEquals("elluwfziton", model.medium());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllConnectionStringType model
            = new AllConnectionStringType().withHigh("wzo").withLow("j").withMedium("elluwfziton");
        model = BinaryData.fromObject(model).toObject(AllConnectionStringType.class);
        Assertions.assertEquals("wzo", model.high());
        Assertions.assertEquals("j", model.low());
        Assertions.assertEquals("elluwfziton", model.medium());
    }
}

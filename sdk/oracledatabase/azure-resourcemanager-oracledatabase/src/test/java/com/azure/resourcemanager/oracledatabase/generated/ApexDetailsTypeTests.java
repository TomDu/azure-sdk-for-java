// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.ApexDetailsType;
import org.junit.jupiter.api.Assertions;

public final class ApexDetailsTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApexDetailsType model = BinaryData.fromString("{\"apexVersion\":\"kvnipjoxz\",\"ordsVersion\":\"chgejspodm\"}")
            .toObject(ApexDetailsType.class);
        Assertions.assertEquals("kvnipjoxz", model.apexVersion());
        Assertions.assertEquals("chgejspodm", model.ordsVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApexDetailsType model = new ApexDetailsType().withApexVersion("kvnipjoxz").withOrdsVersion("chgejspodm");
        model = BinaryData.fromObject(model).toObject(ApexDetailsType.class);
        Assertions.assertEquals("kvnipjoxz", model.apexVersion());
        Assertions.assertEquals("chgejspodm", model.ordsVersion());
    }
}

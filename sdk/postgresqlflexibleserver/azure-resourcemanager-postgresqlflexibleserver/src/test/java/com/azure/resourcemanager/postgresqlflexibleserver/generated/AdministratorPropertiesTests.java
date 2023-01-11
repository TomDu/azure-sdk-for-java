// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.AdministratorProperties;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;
import org.junit.jupiter.api.Assertions;

public final class AdministratorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdministratorProperties model =
            BinaryData
                .fromString(
                    "{\"principalType\":\"Group\",\"principalName\":\"nrbtcqqjnq\",\"objectId\":\"hqgnufooojywif\",\"tenantId\":\"esaagdfm\"}")
                .toObject(AdministratorProperties.class);
        Assertions.assertEquals(PrincipalType.GROUP, model.principalType());
        Assertions.assertEquals("nrbtcqqjnq", model.principalName());
        Assertions.assertEquals("hqgnufooojywif", model.objectId());
        Assertions.assertEquals("esaagdfm", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdministratorProperties model =
            new AdministratorProperties()
                .withPrincipalType(PrincipalType.GROUP)
                .withPrincipalName("nrbtcqqjnq")
                .withObjectId("hqgnufooojywif")
                .withTenantId("esaagdfm");
        model = BinaryData.fromObject(model).toObject(AdministratorProperties.class);
        Assertions.assertEquals(PrincipalType.GROUP, model.principalType());
        Assertions.assertEquals("nrbtcqqjnq", model.principalName());
        Assertions.assertEquals("hqgnufooojywif", model.objectId());
        Assertions.assertEquals("esaagdfm", model.tenantId());
    }
}

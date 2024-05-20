// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.fluent.models.UpdateInner;
import com.azure.resourcemanager.maintenance.models.ImpactType;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class UpdateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateInner model = BinaryData.fromString(
            "{\"maintenanceScope\":\"SQLDB\",\"impactType\":\"Redeploy\",\"status\":\"Cancel\",\"impactDurationInSec\":1073043267,\"notBefore\":\"2021-07-12T01:35:59Z\",\"properties\":{\"resourceId\":\"e\"}}")
            .toObject(UpdateInner.class);
        Assertions.assertEquals(MaintenanceScope.SQLDB, model.maintenanceScope());
        Assertions.assertEquals(ImpactType.REDEPLOY, model.impactType());
        Assertions.assertEquals(UpdateStatus.CANCEL, model.status());
        Assertions.assertEquals(1073043267, model.impactDurationInSec());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-12T01:35:59Z"), model.notBefore());
        Assertions.assertEquals("e", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateInner model = new UpdateInner().withMaintenanceScope(MaintenanceScope.SQLDB)
            .withImpactType(ImpactType.REDEPLOY)
            .withStatus(UpdateStatus.CANCEL)
            .withImpactDurationInSec(1073043267)
            .withNotBefore(OffsetDateTime.parse("2021-07-12T01:35:59Z"))
            .withResourceId("e");
        model = BinaryData.fromObject(model).toObject(UpdateInner.class);
        Assertions.assertEquals(MaintenanceScope.SQLDB, model.maintenanceScope());
        Assertions.assertEquals(ImpactType.REDEPLOY, model.impactType());
        Assertions.assertEquals(UpdateStatus.CANCEL, model.status());
        Assertions.assertEquals(1073043267, model.impactDurationInSec());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-12T01:35:59Z"), model.notBefore());
        Assertions.assertEquals("e", model.resourceId());
    }
}

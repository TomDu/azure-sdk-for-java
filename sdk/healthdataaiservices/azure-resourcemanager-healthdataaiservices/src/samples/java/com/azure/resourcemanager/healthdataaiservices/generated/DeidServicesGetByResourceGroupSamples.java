// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

/**
 * Samples for DeidServices GetByResourceGroup.
 */
public final class DeidServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/healthdataaiservices/HealthDataAIServices.Management/examples/2024-02-28-preview/
     * DeidServices_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: DeidServices_Get - generated by [MaximumSet] rule - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to HealthDataAIServicesManager.
     */
    public static void deidServicesGetGeneratedByMaximumSetRuleGeneratedByMaximumSetRule(
        com.azure.resourcemanager.healthdataaiservices.HealthDataAIServicesManager manager) {
        manager.deidServices()
            .getByResourceGroupWithResponse("rgopenapi", "deidTest", com.azure.core.util.Context.NONE);
    }
}

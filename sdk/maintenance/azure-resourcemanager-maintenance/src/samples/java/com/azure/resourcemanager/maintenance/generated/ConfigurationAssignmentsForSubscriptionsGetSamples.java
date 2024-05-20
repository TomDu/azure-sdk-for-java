// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

/**
 * Samples for ConfigurationAssignmentsForSubscriptions Get.
 */
public final class ConfigurationAssignmentsForSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/preview/2023-10-01-preview/examples/ConfigurationAssignmentsForSubscriptions_Get.json
     */
    /**
     * Sample code: ConfigurationAssignments_GetParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsGetParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForSubscriptions()
            .getWithResponse("workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for BackupWorkloadItems List. */
public final class BackupWorkloadItemsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2021-12-01/examples/AzureWorkload/BackupWorkloadItems_List.json
     */
    /**
     * Sample code: List Workload Items in Container.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void listWorkloadItemsInContainer(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupWorkloadItems()
            .list(
                "suchandr-seacan-rsv",
                "testRg",
                "Azure",
                "VMAppContainer;Compute;bvtdtestag;sqlserver-1",
                "backupManagementType eq 'AzureWorkload'",
                null,
                Context.NONE);
    }
}

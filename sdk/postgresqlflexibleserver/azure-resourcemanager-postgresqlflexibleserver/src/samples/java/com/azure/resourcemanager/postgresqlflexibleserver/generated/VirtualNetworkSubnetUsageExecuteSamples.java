// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualNetworkSubnetUsageParameter;

/** Samples for VirtualNetworkSubnetUsage Execute. */
public final class VirtualNetworkSubnetUsageExecuteSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-12-01/examples/VirtualNetworkSubnetUsage.json
     */
    /**
     * Sample code: VirtualNetworkSubnetUsageList.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void virtualNetworkSubnetUsageList(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager
            .virtualNetworkSubnetUsages()
            .executeWithResponse(
                "westus",
                new VirtualNetworkSubnetUsageParameter()
                    .withVirtualNetworkArmResourceId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/testvnet"),
                com.azure.core.util.Context.NONE);
    }
}

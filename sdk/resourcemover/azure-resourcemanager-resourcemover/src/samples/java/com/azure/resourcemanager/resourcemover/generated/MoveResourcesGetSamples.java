// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

/** Samples for MoveResources Get. */
public final class MoveResourcesGetSamples {
    /*
     * x-ms-original-file: specification/resourcemover/resource-manager/Microsoft.Migrate/stable/2023-08-01/examples/MoveResources_Get.json
     */
    /**
     * Sample code: MoveResources_Get.
     *
     * @param manager Entry point to ResourceMoverManager.
     */
    public static void moveResourcesGet(com.azure.resourcemanager.resourcemover.ResourceMoverManager manager) {
        manager
            .moveResources()
            .getWithResponse("rg1", "movecollection1", "moveresourcename1", com.azure.core.util.Context.NONE);
    }
}

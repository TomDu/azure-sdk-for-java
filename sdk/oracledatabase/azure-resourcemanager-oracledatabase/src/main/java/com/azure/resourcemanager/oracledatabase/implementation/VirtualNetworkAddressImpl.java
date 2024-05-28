// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.oracledatabase.fluent.models.VirtualNetworkAddressInner;
import com.azure.resourcemanager.oracledatabase.models.VirtualNetworkAddress;
import com.azure.resourcemanager.oracledatabase.models.VirtualNetworkAddressProperties;

public final class VirtualNetworkAddressImpl
    implements VirtualNetworkAddress, VirtualNetworkAddress.Definition, VirtualNetworkAddress.Update {
    private VirtualNetworkAddressInner innerObject;

    private final com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public VirtualNetworkAddressProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualNetworkAddressInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String cloudvmclustername;

    private String virtualnetworkaddressname;

    public VirtualNetworkAddressImpl withExistingCloudVmCluster(String resourceGroupName, String cloudvmclustername) {
        this.resourceGroupName = resourceGroupName;
        this.cloudvmclustername = cloudvmclustername;
        return this;
    }

    public VirtualNetworkAddress create() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworkAddresses()
            .createOrUpdate(resourceGroupName, cloudvmclustername, virtualnetworkaddressname, this.innerModel(),
                Context.NONE);
        return this;
    }

    public VirtualNetworkAddress create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworkAddresses()
            .createOrUpdate(resourceGroupName, cloudvmclustername, virtualnetworkaddressname, this.innerModel(),
                context);
        return this;
    }

    VirtualNetworkAddressImpl(String name,
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager) {
        this.innerObject = new VirtualNetworkAddressInner();
        this.serviceManager = serviceManager;
        this.virtualnetworkaddressname = name;
    }

    public VirtualNetworkAddressImpl update() {
        return this;
    }

    public VirtualNetworkAddress apply() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworkAddresses()
            .createOrUpdate(resourceGroupName, cloudvmclustername, virtualnetworkaddressname, this.innerModel(),
                Context.NONE);
        return this;
    }

    public VirtualNetworkAddress apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworkAddresses()
            .createOrUpdate(resourceGroupName, cloudvmclustername, virtualnetworkaddressname, this.innerModel(),
                context);
        return this;
    }

    VirtualNetworkAddressImpl(VirtualNetworkAddressInner innerObject,
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.cloudvmclustername = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "cloudVmClusters");
        this.virtualnetworkaddressname
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualNetworkAddresses");
    }

    public VirtualNetworkAddress refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworkAddresses()
            .getWithResponse(resourceGroupName, cloudvmclustername, virtualnetworkaddressname, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualNetworkAddress refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworkAddresses()
            .getWithResponse(resourceGroupName, cloudvmclustername, virtualnetworkaddressname, context)
            .getValue();
        return this;
    }

    public VirtualNetworkAddressImpl withProperties(VirtualNetworkAddressProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}

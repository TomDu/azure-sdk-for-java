// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateViewProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DnsPrivateView resource definition.
 */
@Fluent
public final class DnsPrivateViewInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private DnsPrivateViewProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of DnsPrivateViewInner class.
     */
    public DnsPrivateViewInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public DnsPrivateViewProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the DnsPrivateViewInner object itself.
     */
    public DnsPrivateViewInner withProperties(DnsPrivateViewProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}

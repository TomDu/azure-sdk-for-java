// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Delegated subnet usage data. */
@Immutable
public final class DelegatedSubnetUsage {
    /*
     * Name of the delegated subnet for which IP addresses are in use
     */
    @JsonProperty(value = "subnetName", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetName;

    /*
     * Number of IP addresses used by the delegated subnet
     */
    @JsonProperty(value = "usage", access = JsonProperty.Access.WRITE_ONLY)
    private Long usage;

    /** Creates an instance of DelegatedSubnetUsage class. */
    public DelegatedSubnetUsage() {
    }

    /**
     * Get the subnetName property: Name of the delegated subnet for which IP addresses are in use.
     *
     * @return the subnetName value.
     */
    public String subnetName() {
        return this.subnetName;
    }

    /**
     * Get the usage property: Number of IP addresses used by the delegated subnet.
     *
     * @return the usage value.
     */
    public Long usage() {
        return this.usage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

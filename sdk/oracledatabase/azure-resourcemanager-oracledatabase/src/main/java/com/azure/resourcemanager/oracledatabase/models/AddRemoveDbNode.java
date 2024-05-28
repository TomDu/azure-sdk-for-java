// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Add/Remove (Virtual Machine) DbNode model.
 */
@Fluent
public final class AddRemoveDbNode {
    /*
     * Db servers ocids
     */
    @JsonProperty(value = "dbServers", required = true)
    private List<String> dbServers;

    /**
     * Creates an instance of AddRemoveDbNode class.
     */
    public AddRemoveDbNode() {
    }

    /**
     * Get the dbServers property: Db servers ocids.
     * 
     * @return the dbServers value.
     */
    public List<String> dbServers() {
        return this.dbServers;
    }

    /**
     * Set the dbServers property: Db servers ocids.
     * 
     * @param dbServers the dbServers value to set.
     * @return the AddRemoveDbNode object itself.
     */
    public AddRemoveDbNode withDbServers(List<String> dbServers) {
        this.dbServers = dbServers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dbServers() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property dbServers in model AddRemoveDbNode"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AddRemoveDbNode.class);
}

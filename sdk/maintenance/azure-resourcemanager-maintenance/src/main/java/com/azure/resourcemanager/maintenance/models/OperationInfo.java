// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an operation.
 */
@Fluent
public final class OperationInfo {
    /*
     * Name of the provider
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Name of the resource type
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Name of the operation
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Description of the operation
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of OperationInfo class.
     */
    public OperationInfo() {
    }

    /**
     * Get the provider property: Name of the provider.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Name of the provider.
     * 
     * @param provider the provider value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Name of the resource type.
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Name of the resource type.
     * 
     * @param resource the resource value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Name of the operation.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Name of the operation.
     * 
     * @param operation the operation value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Description of the operation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the operation.
     * 
     * @param description the description value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection string profile to allow clients to group, filter and select connection string values based on
 * structured metadata.
 */
@Fluent
public final class AllConnectionStringType {
    /*
     * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     */
    @JsonProperty(value = "high")
    private String high;

    /*
     * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     */
    @JsonProperty(value = "low")
    private String low;

    /*
     * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     */
    @JsonProperty(value = "medium")
    private String medium;

    /**
     * Creates an instance of AllConnectionStringType class.
     */
    public AllConnectionStringType() {
    }

    /**
     * Get the high property: The High database service provides the highest level of resources to each SQL statement
     * resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     * 
     * @return the high value.
     */
    public String high() {
        return this.high;
    }

    /**
     * Set the high property: The High database service provides the highest level of resources to each SQL statement
     * resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     * 
     * @param high the high value to set.
     * @return the AllConnectionStringType object itself.
     */
    public AllConnectionStringType withHigh(String high) {
        this.high = high;
        return this;
    }

    /**
     * Get the low property: The Low database service provides the least level of resources to each SQL statement, but
     * supports the most number of concurrent SQL statements.
     * 
     * @return the low value.
     */
    public String low() {
        return this.low;
    }

    /**
     * Set the low property: The Low database service provides the least level of resources to each SQL statement, but
     * supports the most number of concurrent SQL statements.
     * 
     * @param low the low value to set.
     * @return the AllConnectionStringType object itself.
     */
    public AllConnectionStringType withLow(String low) {
        this.low = low;
        return this;
    }

    /**
     * Get the medium property: The Medium database service provides a lower level of resources to each SQL statement
     * potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     * 
     * @return the medium value.
     */
    public String medium() {
        return this.medium;
    }

    /**
     * Set the medium property: The Medium database service provides a lower level of resources to each SQL statement
     * potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     * 
     * @param medium the medium value to set.
     * @return the AllConnectionStringType object itself.
     */
    public AllConnectionStringType withMedium(String medium) {
        this.medium = medium;
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

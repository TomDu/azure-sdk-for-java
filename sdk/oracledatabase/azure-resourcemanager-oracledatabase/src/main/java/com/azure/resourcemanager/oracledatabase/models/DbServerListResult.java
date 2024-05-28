// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.oracledatabase.fluent.models.DbServerInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of a DbServer list operation.
 */
@Fluent
public final class DbServerListResult {
    /*
     * The DbServer items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<DbServerInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of DbServerListResult class.
     */
    public DbServerListResult() {
    }

    /**
     * Get the value property: The DbServer items on this page.
     * 
     * @return the value value.
     */
    public List<DbServerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The DbServer items on this page.
     * 
     * @param value the value value to set.
     * @return the DbServerListResult object itself.
     */
    public DbServerListResult withValue(List<DbServerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model DbServerListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DbServerListResult.class);
}

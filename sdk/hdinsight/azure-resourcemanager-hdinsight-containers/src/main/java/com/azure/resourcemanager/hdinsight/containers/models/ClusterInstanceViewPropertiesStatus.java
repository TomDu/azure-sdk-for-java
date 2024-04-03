// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;

/**
 * Status of the instance view.
 */
@Fluent
public final class ClusterInstanceViewPropertiesStatus extends ClusterInstanceViewStatus {
    /**
     * Creates an instance of ClusterInstanceViewPropertiesStatus class.
     */
    public ClusterInstanceViewPropertiesStatus() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInstanceViewPropertiesStatus withReady(String ready) {
        super.withReady(ready);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInstanceViewPropertiesStatus withReason(String reason) {
        super.withReason(reason);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInstanceViewPropertiesStatus withMessage(String message) {
        super.withMessage(message);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

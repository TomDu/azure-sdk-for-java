// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.inference;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of ModelClient.
 */
public enum ModelServiceVersion implements ServiceVersion {
    /**
     * Enum value 2024-05-01-preview.
     */
    V2024_05_01_PREVIEW("2024-05-01-preview");

    private final String version;

    ModelServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link ModelServiceVersion}.
     */
    public static ModelServiceVersion getLatest() {
        return V2024_05_01_PREVIEW;
    }
}

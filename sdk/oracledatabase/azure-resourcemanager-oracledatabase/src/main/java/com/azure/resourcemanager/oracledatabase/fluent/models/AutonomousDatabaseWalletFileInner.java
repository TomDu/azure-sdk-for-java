// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Autonomous Database Wallet File resource model.
 */
@Fluent
public final class AutonomousDatabaseWalletFileInner {
    /*
     * The base64 encoded wallet files
     */
    @JsonProperty(value = "walletFiles", required = true)
    private String walletFiles;

    /**
     * Creates an instance of AutonomousDatabaseWalletFileInner class.
     */
    public AutonomousDatabaseWalletFileInner() {
    }

    /**
     * Get the walletFiles property: The base64 encoded wallet files.
     * 
     * @return the walletFiles value.
     */
    public String walletFiles() {
        return this.walletFiles;
    }

    /**
     * Set the walletFiles property: The base64 encoded wallet files.
     * 
     * @param walletFiles the walletFiles value to set.
     * @return the AutonomousDatabaseWalletFileInner object itself.
     */
    public AutonomousDatabaseWalletFileInner withWalletFiles(String walletFiles) {
        this.walletFiles = walletFiles;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (walletFiles() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property walletFiles in model AutonomousDatabaseWalletFileInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutonomousDatabaseWalletFileInner.class);
}

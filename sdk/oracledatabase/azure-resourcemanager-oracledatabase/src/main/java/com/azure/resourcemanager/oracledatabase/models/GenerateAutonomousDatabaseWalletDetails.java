// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Autonomous Database Generate Wallet resource model.
 */
@Fluent
public final class GenerateAutonomousDatabaseWalletDetails {
    /*
     * The type of wallet to generate.
     */
    @JsonProperty(value = "generateType")
    private GenerateType generateType;

    /*
     * True when requesting regional connection strings in PDB connect info, applicable to cross-region DG only.
     */
    @JsonProperty(value = "isRegional")
    private Boolean isRegional;

    /*
     * The password to encrypt the keys inside the wallet
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Creates an instance of GenerateAutonomousDatabaseWalletDetails class.
     */
    public GenerateAutonomousDatabaseWalletDetails() {
    }

    /**
     * Get the generateType property: The type of wallet to generate.
     * 
     * @return the generateType value.
     */
    public GenerateType generateType() {
        return this.generateType;
    }

    /**
     * Set the generateType property: The type of wallet to generate.
     * 
     * @param generateType the generateType value to set.
     * @return the GenerateAutonomousDatabaseWalletDetails object itself.
     */
    public GenerateAutonomousDatabaseWalletDetails withGenerateType(GenerateType generateType) {
        this.generateType = generateType;
        return this;
    }

    /**
     * Get the isRegional property: True when requesting regional connection strings in PDB connect info, applicable to
     * cross-region DG only.
     * 
     * @return the isRegional value.
     */
    public Boolean isRegional() {
        return this.isRegional;
    }

    /**
     * Set the isRegional property: True when requesting regional connection strings in PDB connect info, applicable to
     * cross-region DG only.
     * 
     * @param isRegional the isRegional value to set.
     * @return the GenerateAutonomousDatabaseWalletDetails object itself.
     */
    public GenerateAutonomousDatabaseWalletDetails withIsRegional(Boolean isRegional) {
        this.isRegional = isRegional;
        return this;
    }

    /**
     * Get the password property: The password to encrypt the keys inside the wallet.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password to encrypt the keys inside the wallet.
     * 
     * @param password the password value to set.
     * @return the GenerateAutonomousDatabaseWalletDetails object itself.
     */
    public GenerateAutonomousDatabaseWalletDetails withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property password in model GenerateAutonomousDatabaseWalletDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GenerateAutonomousDatabaseWalletDetails.class);
}

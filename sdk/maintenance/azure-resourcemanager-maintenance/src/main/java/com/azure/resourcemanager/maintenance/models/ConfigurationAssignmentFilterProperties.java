// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Azure query for the update configuration.
 */
@Fluent
public final class ConfigurationAssignmentFilterProperties {
    /*
     * List of allowed resources.
     */
    @JsonProperty(value = "resourceTypes")
    private List<String> resourceTypes;

    /*
     * List of allowed resource groups.
     */
    @JsonProperty(value = "resourceGroups")
    private List<String> resourceGroups;

    /*
     * List of allowed operating systems.
     */
    @JsonProperty(value = "osTypes")
    private List<String> osTypes;

    /*
     * List of locations to scope the query to.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * Tag settings for the VM.
     */
    @JsonProperty(value = "tagSettings")
    private TagSettingsProperties tagSettings;

    /**
     * Creates an instance of ConfigurationAssignmentFilterProperties class.
     */
    public ConfigurationAssignmentFilterProperties() {
    }

    /**
     * Get the resourceTypes property: List of allowed resources.
     * 
     * @return the resourceTypes value.
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: List of allowed resources.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the ConfigurationAssignmentFilterProperties object itself.
     */
    public ConfigurationAssignmentFilterProperties withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the resourceGroups property: List of allowed resource groups.
     * 
     * @return the resourceGroups value.
     */
    public List<String> resourceGroups() {
        return this.resourceGroups;
    }

    /**
     * Set the resourceGroups property: List of allowed resource groups.
     * 
     * @param resourceGroups the resourceGroups value to set.
     * @return the ConfigurationAssignmentFilterProperties object itself.
     */
    public ConfigurationAssignmentFilterProperties withResourceGroups(List<String> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    /**
     * Get the osTypes property: List of allowed operating systems.
     * 
     * @return the osTypes value.
     */
    public List<String> osTypes() {
        return this.osTypes;
    }

    /**
     * Set the osTypes property: List of allowed operating systems.
     * 
     * @param osTypes the osTypes value to set.
     * @return the ConfigurationAssignmentFilterProperties object itself.
     */
    public ConfigurationAssignmentFilterProperties withOsTypes(List<String> osTypes) {
        this.osTypes = osTypes;
        return this;
    }

    /**
     * Get the locations property: List of locations to scope the query to.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: List of locations to scope the query to.
     * 
     * @param locations the locations value to set.
     * @return the ConfigurationAssignmentFilterProperties object itself.
     */
    public ConfigurationAssignmentFilterProperties withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the tagSettings property: Tag settings for the VM.
     * 
     * @return the tagSettings value.
     */
    public TagSettingsProperties tagSettings() {
        return this.tagSettings;
    }

    /**
     * Set the tagSettings property: Tag settings for the VM.
     * 
     * @param tagSettings the tagSettings value to set.
     * @return the ConfigurationAssignmentFilterProperties object itself.
     */
    public ConfigurationAssignmentFilterProperties withTagSettings(TagSettingsProperties tagSettings) {
        this.tagSettings = tagSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tagSettings() != null) {
            tagSettings().validate();
        }
    }
}

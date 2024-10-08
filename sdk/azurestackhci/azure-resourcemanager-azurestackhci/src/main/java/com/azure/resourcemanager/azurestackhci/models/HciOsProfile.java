// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * OS configurations for HCI device.
 */
@Immutable
public final class HciOsProfile implements JsonSerializable<HciOsProfile> {
    /*
     * The boot type of the device. e.g. UEFI, Legacy etc
     */
    private String bootType;

    /*
     * Version of assembly present on device
     */
    private String assemblyVersion;

    /**
     * Creates an instance of HciOsProfile class.
     */
    public HciOsProfile() {
    }

    /**
     * Get the bootType property: The boot type of the device. e.g. UEFI, Legacy etc.
     * 
     * @return the bootType value.
     */
    public String bootType() {
        return this.bootType;
    }

    /**
     * Get the assemblyVersion property: Version of assembly present on device.
     * 
     * @return the assemblyVersion value.
     */
    public String assemblyVersion() {
        return this.assemblyVersion;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HciOsProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HciOsProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HciOsProfile.
     */
    public static HciOsProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HciOsProfile deserializedHciOsProfile = new HciOsProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bootType".equals(fieldName)) {
                    deserializedHciOsProfile.bootType = reader.getString();
                } else if ("assemblyVersion".equals(fieldName)) {
                    deserializedHciOsProfile.assemblyVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHciOsProfile;
        });
    }
}

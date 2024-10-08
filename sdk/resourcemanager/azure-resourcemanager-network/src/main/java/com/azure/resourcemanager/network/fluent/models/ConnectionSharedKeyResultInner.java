// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.SharedKeyProperties;
import java.io.IOException;

/**
 * SharedKey Resource .
 */
@Fluent
public final class ConnectionSharedKeyResultInner extends SubResource {
    /*
     * Properties of the shared key.
     */
    private SharedKeyProperties properties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * Resource type.
     */
    private String type;

    /**
     * Creates an instance of ConnectionSharedKeyResultInner class.
     */
    public ConnectionSharedKeyResultInner() {
    }

    /**
     * Get the properties property: Properties of the shared key.
     * 
     * @return the properties value.
     */
    public SharedKeyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the shared key.
     * 
     * @param properties the properties value to set.
     * @return the ConnectionSharedKeyResultInner object itself.
     */
    public ConnectionSharedKeyResultInner withProperties(SharedKeyProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the ConnectionSharedKeyResultInner object itself.
     */
    public ConnectionSharedKeyResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionSharedKeyResultInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionSharedKeyResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionSharedKeyResultInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionSharedKeyResultInner.
     */
    public static ConnectionSharedKeyResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionSharedKeyResultInner deserializedConnectionSharedKeyResultInner
                = new ConnectionSharedKeyResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedConnectionSharedKeyResultInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedConnectionSharedKeyResultInner.properties = SharedKeyProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedConnectionSharedKeyResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedConnectionSharedKeyResultInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionSharedKeyResultInner;
        });
    }
}

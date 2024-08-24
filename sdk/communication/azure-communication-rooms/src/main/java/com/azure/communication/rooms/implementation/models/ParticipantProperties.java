// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ParticipantProperties model.
 */
@Fluent
public final class ParticipantProperties implements JsonSerializable<ParticipantProperties> {
    /*
     * The role of a room participant. The default value is Attendee.
     */
    private ParticipantRole role;

    /**
     * Creates an instance of ParticipantProperties class.
     */
    public ParticipantProperties() {
    }

    /**
     * Get the role property: The role of a room participant. The default value is Attendee.
     * 
     * @return the role value.
     */
    public ParticipantRole getRole() {
        return this.role;
    }

    /**
     * Set the role property: The role of a room participant. The default value is Attendee.
     * 
     * @param role the role value to set.
     * @return the ParticipantProperties object itself.
     */
    public ParticipantProperties setRole(ParticipantRole role) {
        this.role = role;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParticipantProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParticipantProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ParticipantProperties.
     */
    public static ParticipantProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParticipantProperties deserializedParticipantProperties = new ParticipantProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("role".equals(fieldName)) {
                    deserializedParticipantProperties.role = ParticipantRole.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedParticipantProperties;
        });
    }
}

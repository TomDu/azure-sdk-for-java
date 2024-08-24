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
 * A participant of the room.
 */
@Fluent
public final class RoomParticipant implements JsonSerializable<RoomParticipant> {
    /*
     * Raw ID representation of the communication identifier. Please refer to the following document for additional
     * information on Raw ID. <br>
     * https://learn.microsoft.com/azure/communication-services/concepts/identifiers?pivots=programming-language-rest#
     * raw-id-representation
     */
    private String rawId;

    /*
     * The role of a room participant. The default value is Attendee.
     */
    private ParticipantRole role;

    /**
     * Creates an instance of RoomParticipant class.
     */
    public RoomParticipant() {
    }

    /**
     * Get the rawId property: Raw ID representation of the communication identifier. Please refer to the following
     * document for additional information on Raw ID. &lt;br&gt;
     * https://learn.microsoft.com/azure/communication-services/concepts/identifiers?pivots=programming-language-rest#raw-id-representation.
     * 
     * @return the rawId value.
     */
    public String getRawId() {
        return this.rawId;
    }

    /**
     * Set the rawId property: Raw ID representation of the communication identifier. Please refer to the following
     * document for additional information on Raw ID. &lt;br&gt;
     * https://learn.microsoft.com/azure/communication-services/concepts/identifiers?pivots=programming-language-rest#raw-id-representation.
     * 
     * @param rawId the rawId value to set.
     * @return the RoomParticipant object itself.
     */
    public RoomParticipant setRawId(String rawId) {
        this.rawId = rawId;
        return this;
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
     * @return the RoomParticipant object itself.
     */
    public RoomParticipant setRole(ParticipantRole role) {
        this.role = role;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("rawId", this.rawId);
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoomParticipant from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoomParticipant if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoomParticipant.
     */
    public static RoomParticipant fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoomParticipant deserializedRoomParticipant = new RoomParticipant();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rawId".equals(fieldName)) {
                    deserializedRoomParticipant.rawId = reader.getString();
                } else if ("role".equals(fieldName)) {
                    deserializedRoomParticipant.role = ParticipantRole.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoomParticipant;
        });
    }
}

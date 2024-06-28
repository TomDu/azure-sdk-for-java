// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The RecordingStateResponseInternal model.
 */
@Fluent
public final class RecordingStateResponseInternal implements JsonSerializable<RecordingStateResponseInternal> {
    /*
     * The recordingId property.
     */
    private String recordingId;

    /*
     * The recordingState property.
     */
    private RecordingStateInternal recordingState;

    /*
     * The recordingKind property.
     */
    private RecordingKind recordingKind;

    /**
     * Creates an instance of RecordingStateResponseInternal class.
     */
    public RecordingStateResponseInternal() {
    }

    /**
     * Get the recordingId property: The recordingId property.
     * 
     * @return the recordingId value.
     */
    public String getRecordingId() {
        return this.recordingId;
    }

    /**
     * Set the recordingId property: The recordingId property.
     * 
     * @param recordingId the recordingId value to set.
     * @return the RecordingStateResponseInternal object itself.
     */
    public RecordingStateResponseInternal setRecordingId(String recordingId) {
        this.recordingId = recordingId;
        return this;
    }

    /**
     * Get the recordingState property: The recordingState property.
     * 
     * @return the recordingState value.
     */
    public RecordingStateInternal getRecordingState() {
        return this.recordingState;
    }

    /**
     * Set the recordingState property: The recordingState property.
     * 
     * @param recordingState the recordingState value to set.
     * @return the RecordingStateResponseInternal object itself.
     */
    public RecordingStateResponseInternal setRecordingState(RecordingStateInternal recordingState) {
        this.recordingState = recordingState;
        return this;
    }

    /**
     * Get the recordingKind property: The recordingKind property.
     * 
     * @return the recordingKind value.
     */
    public RecordingKind getRecordingKind() {
        return this.recordingKind;
    }

    /**
     * Set the recordingKind property: The recordingKind property.
     * 
     * @param recordingKind the recordingKind value to set.
     * @return the RecordingStateResponseInternal object itself.
     */
    public RecordingStateResponseInternal setRecordingKind(RecordingKind recordingKind) {
        this.recordingKind = recordingKind;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("recordingId", this.recordingId);
        jsonWriter.writeStringField("recordingState",
            this.recordingState == null ? null : this.recordingState.toString());
        jsonWriter.writeStringField("recordingKind", this.recordingKind == null ? null : this.recordingKind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecordingStateResponseInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecordingStateResponseInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecordingStateResponseInternal.
     */
    public static RecordingStateResponseInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecordingStateResponseInternal deserializedRecordingStateResponseInternal
                = new RecordingStateResponseInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recordingId".equals(fieldName)) {
                    deserializedRecordingStateResponseInternal.recordingId = reader.getString();
                } else if ("recordingState".equals(fieldName)) {
                    deserializedRecordingStateResponseInternal.recordingState
                        = RecordingStateInternal.fromString(reader.getString());
                } else if ("recordingKind".equals(fieldName)) {
                    deserializedRecordingStateResponseInternal.recordingKind
                        = RecordingKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecordingStateResponseInternal;
        });
    }
}

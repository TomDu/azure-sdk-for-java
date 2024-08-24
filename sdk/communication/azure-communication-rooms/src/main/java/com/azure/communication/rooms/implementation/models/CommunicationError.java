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
import java.util.List;

/**
 * The Communication Services error.
 */
@Fluent
public final class CommunicationError implements JsonSerializable<CommunicationError> {
    /*
     * The error code.
     */
    private String code;

    /*
     * The error message.
     */
    private String message;

    /*
     * The error target.
     */
    private String target;

    /*
     * Further details about specific errors that led to this error.
     */
    private List<CommunicationError> details;

    /*
     * The inner error if any.
     */
    private CommunicationError innerError;

    /**
     * Creates an instance of CommunicationError class.
     */
    public CommunicationError() {
    }

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     * 
     * @param code the code value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     * 
     * @param message the message value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The error target.
     * 
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: Further details about specific errors that led to this error.
     * 
     * @return the details value.
     */
    public List<CommunicationError> getDetails() {
        return this.details;
    }

    /**
     * Get the innerError property: The inner error if any.
     * 
     * @return the innerError value.
     */
    public CommunicationError getInnerError() {
        return this.innerError;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommunicationError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunicationError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommunicationError.
     */
    public static CommunicationError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationError deserializedCommunicationError = new CommunicationError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedCommunicationError.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedCommunicationError.message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedCommunicationError.target = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<CommunicationError> details
                        = reader.readArray(reader1 -> CommunicationError.fromJson(reader1));
                    deserializedCommunicationError.details = details;
                } else if ("innererror".equals(fieldName)) {
                    deserializedCommunicationError.innerError = CommunicationError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommunicationError;
        });
    }
}

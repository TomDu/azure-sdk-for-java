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
 * The request payload for rejecting the call.
 */
@Fluent
public final class RejectCallRequestInternal implements JsonSerializable<RejectCallRequestInternal> {
    /*
     * The context associated with the call.
     */
    private String incomingCallContext;

    /*
     * The rejection reason.
     */
    private CallRejectReasonInternal callRejectReason;

    /**
     * Creates an instance of RejectCallRequestInternal class.
     */
    public RejectCallRequestInternal() {
    }

    /**
     * Get the incomingCallContext property: The context associated with the call.
     * 
     * @return the incomingCallContext value.
     */
    public String getIncomingCallContext() {
        return this.incomingCallContext;
    }

    /**
     * Set the incomingCallContext property: The context associated with the call.
     * 
     * @param incomingCallContext the incomingCallContext value to set.
     * @return the RejectCallRequestInternal object itself.
     */
    public RejectCallRequestInternal setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
        return this;
    }

    /**
     * Get the callRejectReason property: The rejection reason.
     * 
     * @return the callRejectReason value.
     */
    public CallRejectReasonInternal getCallRejectReason() {
        return this.callRejectReason;
    }

    /**
     * Set the callRejectReason property: The rejection reason.
     * 
     * @param callRejectReason the callRejectReason value to set.
     * @return the RejectCallRequestInternal object itself.
     */
    public RejectCallRequestInternal setCallRejectReason(CallRejectReasonInternal callRejectReason) {
        this.callRejectReason = callRejectReason;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("incomingCallContext", this.incomingCallContext);
        jsonWriter.writeStringField("callRejectReason",
            this.callRejectReason == null ? null : this.callRejectReason.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RejectCallRequestInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RejectCallRequestInternal if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RejectCallRequestInternal.
     */
    public static RejectCallRequestInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RejectCallRequestInternal deserializedRejectCallRequestInternal = new RejectCallRequestInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("incomingCallContext".equals(fieldName)) {
                    deserializedRejectCallRequestInternal.incomingCallContext = reader.getString();
                } else if ("callRejectReason".equals(fieldName)) {
                    deserializedRejectCallRequestInternal.callRejectReason
                        = CallRejectReasonInternal.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRejectCallRequestInternal;
        });
    }
}

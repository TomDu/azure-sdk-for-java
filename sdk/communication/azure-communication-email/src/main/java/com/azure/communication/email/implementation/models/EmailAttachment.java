// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Attachment to the email.
 */
@Fluent
public final class EmailAttachment implements JsonSerializable<EmailAttachment> {
    /*
     * Name of the attachment
     */
    private final String name;

    /*
     * MIME type of the content being attached.
     */
    private final String contentType;

    /*
     * Base64 encoded contents of the attachment
     */
    private final BinaryData contentInBase64;

    /*
     * Unique identifier (CID) to reference an inline attachment.
     */
    private String contentId;

    /**
     * Creates an instance of EmailAttachment class.
     *
     * @param name the name value to set.
     * @param contentType the contentType value to set.
     * @param contentInBase64 the contentInBase64 value to set.
     */
    public EmailAttachment(String name, String contentType, BinaryData contentInBase64) {
        this.name = name;
        this.contentType = contentType;
        this.contentInBase64 = contentInBase64;
    }

    /**
     * Get the name property: Name of the attachment.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the contentType property: MIME type of the content being attached.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @deprecated Use {@link #getContentInBase64()} instead.
     * Returns the content of the attachment.
     *
     * @return The content of the attachment as BinaryData.
     */
    @Deprecated
    public BinaryData getContent() {
        return this.contentInBase64;
    }

    /**
     * Get the contentInBase64 property: Base64 encoded contents of the attachment.
     *
     * @return the contentInBase64 value.
     */
    public BinaryData getContentInBase64() {
        return this.contentInBase64;
    }

    /**
     * Get the contentId property: Unique identifier (CID) to reference an inline attachment.
     *
     * @return the contentId value.
     */
    public String getContentId() {
        return this.contentId;
    }

    /**
     * Set the contentId property: Unique identifier (CID) to reference an inline attachment.
     *
     * @param contentId the contentId value to set.
     * @return the EmailAttachment object itself.
     */
    public EmailAttachment setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeStringField("contentInBase64", this.contentInBase64.toString());
        jsonWriter.writeStringField("contentId", this.contentId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EmailAttachment from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of EmailAttachment if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EmailAttachment.
     */
    public static EmailAttachment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean contentTypeFound = false;
            String contentType = null;
            boolean contentInBase64Found = false;
            BinaryData contentInBase64 = null;
            String contentId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("contentType".equals(fieldName)) {
                    contentType = reader.getString();
                    contentTypeFound = true;
                } else if ("contentInBase64".equals(fieldName)) {
                    contentInBase64 = BinaryData.fromString(reader.getBinary().toString());
                    contentInBase64Found = true;
                } else if ("contentId".equals(fieldName)) {
                    contentId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && contentTypeFound && contentInBase64Found) {
                EmailAttachment deserializedEmailAttachment = new EmailAttachment(name, contentType, contentInBase64);
                deserializedEmailAttachment.contentId = contentId;

                return deserializedEmailAttachment;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!contentTypeFound) {
                missingProperties.add("contentType");
            }
            if (!contentInBase64Found) {
                missingProperties.add("contentInBase64");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 * Represents a response update to a chat completions request, when the service is streaming updates
 * using Server Sent Events (SSE).
 * Completions support a wide variety of tasks and generate text that continues from or "completes"
 * provided prompt data.
 */
@Immutable
public final class StreamingChatCompletionsUpdate implements JsonSerializable<StreamingChatCompletionsUpdate> {

    /*
     * A unique identifier associated with this chat completions response.
     */
    @Generated
    private final String id;

    /*
     * The first timestamp associated with generation activity for this completions response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     */
    @Generated
    private final long created;

    /*
     * The model used for the chat completion.
     */
    @Generated
    private final String model;

    /*
     * Usage information for tokens processed and generated as part of this completions operation.
     */
    @Generated
    private final CompletionsUsage usage;

    /*
     * An update to the collection of completion choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     */
    @Generated
    private final List<StreamingChatChoiceUpdate> choices;

    /**
     * Creates an instance of StreamingChatCompletionsUpdate class.
     *
     * @param id the id value to set.
     * @param created the created value to set.
     * @param model the model value to set.
     * @param usage the usage value to set.
     * @param choices the choices value to set.
     */
    @Generated
    private StreamingChatCompletionsUpdate(String id, OffsetDateTime created, String model, CompletionsUsage usage,
        List<StreamingChatChoiceUpdate> choices) {
        this.id = id;
        if (created == null) {
            this.created = 0L;
        } else {
            this.created = created.toEpochSecond();
        }
        this.model = model;
        this.usage = usage;
        this.choices = choices;
    }

    /**
     * Get the id property: A unique identifier associated with this chat completions response.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the created property: The first timestamp associated with generation activity for this completions response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     *
     * @return the created value.
     */
    @Generated
    public OffsetDateTime getCreated() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.created), ZoneOffset.UTC);
    }

    /**
     * Get the model property: The model used for the chat completion.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Get the usage property: Usage information for tokens processed and generated as part of this completions
     * operation.
     *
     * @return the usage value.
     */
    @Generated
    public CompletionsUsage getUsage() {
        return this.usage;
    }

    /**
     * Get the choices property: An update to the collection of completion choices associated with this completions
     * response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     *
     * @return the choices value.
     */
    @Generated
    public List<StreamingChatChoiceUpdate> getChoices() {
        return this.choices;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeLongField("created", this.created);
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeJsonField("usage", this.usage);
        jsonWriter.writeArrayField("choices", this.choices, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StreamingChatCompletionsUpdate from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StreamingChatCompletionsUpdate if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StreamingChatCompletionsUpdate.
     */
    @Generated
    public static StreamingChatCompletionsUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime created = null;
            String model = null;
            CompletionsUsage usage = null;
            List<StreamingChatChoiceUpdate> choices = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created".equals(fieldName)) {
                    created = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("usage".equals(fieldName)) {
                    usage = CompletionsUsage.fromJson(reader);
                } else if ("choices".equals(fieldName)) {
                    choices = reader.readArray(reader1 -> StreamingChatChoiceUpdate.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new StreamingChatCompletionsUpdate(id, created, model, usage, choices);
        });
    }
}

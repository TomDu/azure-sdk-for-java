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
 * The TextSourceInternal model.
 */
@Fluent
public final class TextSourceInternal implements JsonSerializable<TextSourceInternal> {
    /*
     * Text for the cognitive service to be played
     */
    private String text;

    /*
     * Source language locale to be played
     * Refer to available locales here: <seealso href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts" />
     */
    private String sourceLocale;

    /*
     * Voice kind type
     */
    private VoiceKindInternal voiceKind;

    /*
     * Voice name to be played
     * Refer to available Text-to-speech voices here: <seealso href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts" />
     */
    private String voiceName;

    /*
     * Endpoint where the custom voice was deployed.
     */
    private String customVoiceEndpointId;

    /**
     * Creates an instance of TextSourceInternal class.
     */
    public TextSourceInternal() {
    }

    /**
     * Get the text property: Text for the cognitive service to be played.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Text for the cognitive service to be played.
     * 
     * @param text the text value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the sourceLocale property: Source language locale to be played
     * Refer to available locales here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     * 
     * @return the sourceLocale value.
     */
    public String getSourceLocale() {
        return this.sourceLocale;
    }

    /**
     * Set the sourceLocale property: Source language locale to be played
     * Refer to available locales here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     * 
     * @param sourceLocale the sourceLocale value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setSourceLocale(String sourceLocale) {
        this.sourceLocale = sourceLocale;
        return this;
    }

    /**
     * Get the voiceKind property: Voice kind type.
     * 
     * @return the voiceKind value.
     */
    public VoiceKindInternal getVoiceKind() {
        return this.voiceKind;
    }

    /**
     * Set the voiceKind property: Voice kind type.
     * 
     * @param voiceKind the voiceKind value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setVoiceKind(VoiceKindInternal voiceKind) {
        this.voiceKind = voiceKind;
        return this;
    }

    /**
     * Get the voiceName property: Voice name to be played
     * Refer to available Text-to-speech voices here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     * 
     * @return the voiceName value.
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    /**
     * Set the voiceName property: Voice name to be played
     * Refer to available Text-to-speech voices here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     * 
     * @param voiceName the voiceName value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * Get the customVoiceEndpointId property: Endpoint where the custom voice was deployed.
     * 
     * @return the customVoiceEndpointId value.
     */
    public String getCustomVoiceEndpointId() {
        return this.customVoiceEndpointId;
    }

    /**
     * Set the customVoiceEndpointId property: Endpoint where the custom voice was deployed.
     * 
     * @param customVoiceEndpointId the customVoiceEndpointId value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setCustomVoiceEndpointId(String customVoiceEndpointId) {
        this.customVoiceEndpointId = customVoiceEndpointId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeStringField("sourceLocale", this.sourceLocale);
        jsonWriter.writeStringField("voiceKind", this.voiceKind == null ? null : this.voiceKind.toString());
        jsonWriter.writeStringField("voiceName", this.voiceName);
        jsonWriter.writeStringField("customVoiceEndpointId", this.customVoiceEndpointId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TextSourceInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TextSourceInternal if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TextSourceInternal.
     */
    public static TextSourceInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TextSourceInternal deserializedTextSourceInternal = new TextSourceInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    deserializedTextSourceInternal.text = reader.getString();
                } else if ("sourceLocale".equals(fieldName)) {
                    deserializedTextSourceInternal.sourceLocale = reader.getString();
                } else if ("voiceKind".equals(fieldName)) {
                    deserializedTextSourceInternal.voiceKind = VoiceKindInternal.fromString(reader.getString());
                } else if ("voiceName".equals(fieldName)) {
                    deserializedTextSourceInternal.voiceName = reader.getString();
                } else if ("customVoiceEndpointId".equals(fieldName)) {
                    deserializedTextSourceInternal.customVoiceEndpointId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTextSourceInternal;
        });
    }
}

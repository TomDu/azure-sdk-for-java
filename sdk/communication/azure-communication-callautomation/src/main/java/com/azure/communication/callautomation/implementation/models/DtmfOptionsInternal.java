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
import java.util.List;

/**
 * Options for DTMF recognition.
 */
@Fluent
public final class DtmfOptionsInternal implements JsonSerializable<DtmfOptionsInternal> {
    /*
     * Time to wait between DTMF inputs to stop recognizing.
     */
    private Integer interToneTimeoutInSeconds;

    /*
     * Maximum number of DTMF tones to be collected.
     */
    private Integer maxTonesToCollect;

    /*
     * List of tones that will stop recognizing.
     */
    private List<DtmfToneInternal> stopTones;

    /**
     * Creates an instance of DtmfOptionsInternal class.
     */
    public DtmfOptionsInternal() {
    }

    /**
     * Get the interToneTimeoutInSeconds property: Time to wait between DTMF inputs to stop recognizing.
     * 
     * @return the interToneTimeoutInSeconds value.
     */
    public Integer getInterToneTimeoutInSeconds() {
        return this.interToneTimeoutInSeconds;
    }

    /**
     * Set the interToneTimeoutInSeconds property: Time to wait between DTMF inputs to stop recognizing.
     * 
     * @param interToneTimeoutInSeconds the interToneTimeoutInSeconds value to set.
     * @return the DtmfOptionsInternal object itself.
     */
    public DtmfOptionsInternal setInterToneTimeoutInSeconds(Integer interToneTimeoutInSeconds) {
        this.interToneTimeoutInSeconds = interToneTimeoutInSeconds;
        return this;
    }

    /**
     * Get the maxTonesToCollect property: Maximum number of DTMF tones to be collected.
     * 
     * @return the maxTonesToCollect value.
     */
    public Integer getMaxTonesToCollect() {
        return this.maxTonesToCollect;
    }

    /**
     * Set the maxTonesToCollect property: Maximum number of DTMF tones to be collected.
     * 
     * @param maxTonesToCollect the maxTonesToCollect value to set.
     * @return the DtmfOptionsInternal object itself.
     */
    public DtmfOptionsInternal setMaxTonesToCollect(Integer maxTonesToCollect) {
        this.maxTonesToCollect = maxTonesToCollect;
        return this;
    }

    /**
     * Get the stopTones property: List of tones that will stop recognizing.
     * 
     * @return the stopTones value.
     */
    public List<DtmfToneInternal> getStopTones() {
        return this.stopTones;
    }

    /**
     * Set the stopTones property: List of tones that will stop recognizing.
     * 
     * @param stopTones the stopTones value to set.
     * @return the DtmfOptionsInternal object itself.
     */
    public DtmfOptionsInternal setStopTones(List<DtmfToneInternal> stopTones) {
        this.stopTones = stopTones;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("interToneTimeoutInSeconds", this.interToneTimeoutInSeconds);
        jsonWriter.writeNumberField("maxTonesToCollect", this.maxTonesToCollect);
        jsonWriter.writeArrayField("stopTones", this.stopTones,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DtmfOptionsInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DtmfOptionsInternal if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DtmfOptionsInternal.
     */
    public static DtmfOptionsInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DtmfOptionsInternal deserializedDtmfOptionsInternal = new DtmfOptionsInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("interToneTimeoutInSeconds".equals(fieldName)) {
                    deserializedDtmfOptionsInternal.interToneTimeoutInSeconds = reader.getNullable(JsonReader::getInt);
                } else if ("maxTonesToCollect".equals(fieldName)) {
                    deserializedDtmfOptionsInternal.maxTonesToCollect = reader.getNullable(JsonReader::getInt);
                } else if ("stopTones".equals(fieldName)) {
                    List<DtmfToneInternal> stopTones
                        = reader.readArray(reader1 -> DtmfToneInternal.fromString(reader1.getString()));
                    deserializedDtmfOptionsInternal.stopTones = stopTones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDtmfOptionsInternal;
        });
    }
}

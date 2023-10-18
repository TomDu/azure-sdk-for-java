// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes a condition that must be met against a set of labels for worker selection. */
@Fluent
public final class RouterWorkerSelector {
    /*
     * The label key to query against
     */
    @Generated
    @JsonProperty(value = "key")
    private String key;

    /*
     * Describes how the value of the label is compared to the value defined on the
     * label selector
     */
    @Generated
    @JsonProperty(value = "labelOperator")
    private LabelOperator labelOperator;

    /*
     * The value to compare against the actual label value with the given operator
     */
    @Generated
    @JsonProperty(value = "value")
    private Object value;

    /*
     * Describes how long this label selector is valid in seconds.
     */
    @Generated
    @JsonProperty(value = "expiresAfterSeconds")
    private Double expiresAfterSeconds;

    /*
     * Pushes the job to the front of the queue as long as this selector is active.
     */
    @Generated
    @JsonProperty(value = "expedite")
    private Boolean expedite;

    /*
     * The status of the worker selector.
     */
    @Generated
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private RouterWorkerSelectorStatus status;

    /*
     * The time at which this worker selector expires in UTC
     */
    @Generated
    @JsonProperty(value = "expiresAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiresAt;

    /**
     * Creates an instance of RouterWorkerSelector class.
     *
     * @param key the key value to set.
     * @param labelOperator the labelOperator value to set.
     */
    @Generated
    @JsonCreator
    public RouterWorkerSelector(
            @JsonProperty(value = "key") String key,
            @JsonProperty(value = "labelOperator") LabelOperator labelOperator) {
        this.key = key;
        this.labelOperator = labelOperator;
    }

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @return the labelOperator value.
     */
    @Generated
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Get the value property: The value to compare against the actual label value with the given operator.
     *
     * @return the value value.
     */
    @Generated
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value to compare against the actual label value with the given operator.
     *
     * @param value the value value to set.
     * @return the RouterWorkerSelector object itself.
     */
    @Generated
    public RouterWorkerSelector setValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the expiresAfterSeconds property: Describes how long this label selector is valid in seconds.
     *
     * @return the expiresAfterSeconds value.
     */
    @Generated
    public Double getExpiresAfterSeconds() {
        return this.expiresAfterSeconds;
    }

    /**
     * Set the expiresAfterSeconds property: Describes how long this label selector is valid in seconds.
     *
     * @param expiresAfterSeconds the expiresAfterSeconds value to set.
     * @return the RouterWorkerSelector object itself.
     */
    @Generated
    public RouterWorkerSelector setExpiresAfterSeconds(Double expiresAfterSeconds) {
        this.expiresAfterSeconds = expiresAfterSeconds;
        return this;
    }

    /**
     * Get the expedite property: Pushes the job to the front of the queue as long as this selector is active.
     *
     * @return the expedite value.
     */
    @Generated
    public Boolean isExpedite() {
        return this.expedite;
    }

    /**
     * Set the expedite property: Pushes the job to the front of the queue as long as this selector is active.
     *
     * @param expedite the expedite value to set.
     * @return the RouterWorkerSelector object itself.
     */
    @Generated
    public RouterWorkerSelector setExpedite(Boolean expedite) {
        this.expedite = expedite;
        return this;
    }

    /**
     * Get the status property: The status of the worker selector.
     *
     * @return the status value.
     */
    @Generated
    public RouterWorkerSelectorStatus getStatus() {
        return this.status;
    }

    /**
     * Get the expiresAt property: The time at which this worker selector expires in UTC.
     *
     * @return the expiresAt value.
     */
    @Generated
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
}

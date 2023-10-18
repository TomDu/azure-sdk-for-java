// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enums used to filters jobs by state. */
public final class RouterJobStatusSelector extends ExpandableStringEnum<RouterJobStatusSelector> {
    /** Default. */
    @Generated public static final RouterJobStatusSelector ALL = fromString("all");

    /** Job is waiting to be classified. */
    @Generated public static final RouterJobStatusSelector PENDING_CLASSIFICATION = fromString("pendingClassification");

    /** Job has been queued. */
    @Generated public static final RouterJobStatusSelector QUEUED = fromString("queued");

    /** Job has been assigned to a worker. */
    @Generated public static final RouterJobStatusSelector ASSIGNED = fromString("assigned");

    /** Job has been completed by a worker. */
    @Generated public static final RouterJobStatusSelector COMPLETED = fromString("completed");

    /** Job has been closed by a worker. */
    @Generated public static final RouterJobStatusSelector CLOSED = fromString("closed");

    /** Job has been cancelled. */
    @Generated public static final RouterJobStatusSelector CANCELLED = fromString("cancelled");

    /** Classification process failed for the job. */
    @Generated public static final RouterJobStatusSelector CLASSIFICATION_FAILED = fromString("classificationFailed");

    /** Job has been created. */
    @Generated public static final RouterJobStatusSelector CREATED = fromString("created");

    /** Job has been created but not been scheduled yet. */
    @Generated public static final RouterJobStatusSelector PENDING_SCHEDULE = fromString("pendingSchedule");

    /** Job has been scheduled successfully. */
    @Generated public static final RouterJobStatusSelector SCHEDULED = fromString("scheduled");

    /** Job scheduling failed. */
    @Generated public static final RouterJobStatusSelector SCHEDULE_FAILED = fromString("scheduleFailed");

    /** Job is in a suspended state and waiting for an update. */
    @Generated public static final RouterJobStatusSelector WAITING_FOR_ACTIVATION = fromString("waitingForActivation");

    /**
     * Job is in a state of PendingClassification or Queued or Assigned or ClassificationFailed or Completed or
     * PendingSchedule or Scheduled or ScheduleFailed or WaitingForActivation.
     */
    @Generated public static final RouterJobStatusSelector ACTIVE = fromString("active");

    /**
     * Creates a new instance of RouterJobStatusSelector value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RouterJobStatusSelector() {}

    /**
     * Creates or finds a RouterJobStatusSelector from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterJobStatusSelector.
     */
    @Generated
    @JsonCreator
    public static RouterJobStatusSelector fromString(String name) {
        return fromString(name, RouterJobStatusSelector.class);
    }

    /**
     * Gets known RouterJobStatusSelector values.
     *
     * @return known RouterJobStatusSelector values.
     */
    @Generated
    public static Collection<RouterJobStatusSelector> values() {
        return values(RouterJobStatusSelector.class);
    }
}

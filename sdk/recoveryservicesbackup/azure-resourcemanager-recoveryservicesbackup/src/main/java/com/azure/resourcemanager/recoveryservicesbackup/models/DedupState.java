// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DedupState. */
public final class DedupState extends ExpandableStringEnum<DedupState> {
    /** Static value Invalid for DedupState. */
    public static final DedupState INVALID = fromString("Invalid");

    /** Static value Enabled for DedupState. */
    public static final DedupState ENABLED = fromString("Enabled");

    /** Static value Disabled for DedupState. */
    public static final DedupState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a DedupState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DedupState.
     */
    @JsonCreator
    public static DedupState fromString(String name) {
        return fromString(name, DedupState.class);
    }

    /** @return known DedupState values. */
    public static Collection<DedupState> values() {
        return values(DedupState.class);
    }
}

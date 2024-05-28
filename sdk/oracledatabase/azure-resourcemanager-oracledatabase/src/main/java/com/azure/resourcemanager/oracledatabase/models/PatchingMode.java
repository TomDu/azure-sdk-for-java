// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * PatchingMode enum.
 */
public final class PatchingMode extends ExpandableStringEnum<PatchingMode> {
    /**
     * Static value Rolling for PatchingMode.
     */
    public static final PatchingMode ROLLING = fromString("Rolling");

    /**
     * Static value NonRolling for PatchingMode.
     */
    public static final PatchingMode NON_ROLLING = fromString("NonRolling");

    /**
     * Creates a new instance of PatchingMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PatchingMode() {
    }

    /**
     * Creates or finds a PatchingMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PatchingMode.
     */
    @JsonCreator
    public static PatchingMode fromString(String name) {
        return fromString(name, PatchingMode.class);
    }

    /**
     * Gets known PatchingMode values.
     * 
     * @return known PatchingMode values.
     */
    public static Collection<PatchingMode> values() {
        return values(PatchingMode.class);
    }
}

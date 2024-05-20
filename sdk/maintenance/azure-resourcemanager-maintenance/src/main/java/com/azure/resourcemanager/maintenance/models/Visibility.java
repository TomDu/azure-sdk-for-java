// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Gets or sets the visibility of the configuration. The default value is 'Custom'.
 */
public final class Visibility extends ExpandableStringEnum<Visibility> {
    /**
     * Static value Custom for Visibility.
     */
    public static final Visibility CUSTOM = fromString("Custom");

    /**
     * Static value Public for Visibility.
     */
    public static final Visibility PUBLIC = fromString("Public");

    /**
     * Creates a new instance of Visibility value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Visibility() {
    }

    /**
     * Creates or finds a Visibility from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Visibility.
     */
    @JsonCreator
    public static Visibility fromString(String name) {
        return fromString(name, Visibility.class);
    }

    /**
     * Gets known Visibility values.
     * 
     * @return known Visibility values.
     */
    public static Collection<Visibility> values() {
        return values(Visibility.class);
    }
}

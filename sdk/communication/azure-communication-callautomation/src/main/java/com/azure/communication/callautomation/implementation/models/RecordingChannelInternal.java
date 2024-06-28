// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The channel type of call recording.
 */
public final class RecordingChannelInternal extends ExpandableStringEnum<RecordingChannelInternal> {
    /**
     * Static value mixed for RecordingChannelInternal.
     */
    public static final RecordingChannelInternal MIXED = fromString("mixed");

    /**
     * Static value unmixed for RecordingChannelInternal.
     */
    public static final RecordingChannelInternal UNMIXED = fromString("unmixed");

    /**
     * Creates a new instance of RecordingChannelInternal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecordingChannelInternal() {
    }

    /**
     * Creates or finds a RecordingChannelInternal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecordingChannelInternal.
     */
    public static RecordingChannelInternal fromString(String name) {
        return fromString(name, RecordingChannelInternal.class);
    }

    /**
     * Gets known RecordingChannelInternal values.
     * 
     * @return known RecordingChannelInternal values.
     */
    public static Collection<RecordingChannelInternal> values() {
        return values(RecordingChannelInternal.class);
    }
}

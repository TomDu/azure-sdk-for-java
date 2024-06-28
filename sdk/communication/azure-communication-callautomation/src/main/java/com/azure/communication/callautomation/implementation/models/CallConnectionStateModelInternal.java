// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The state of the call connection.
 */
public final class CallConnectionStateModelInternal extends ExpandableStringEnum<CallConnectionStateModelInternal> {
    /**
     * Static value unknown for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal UNKNOWN = fromString("unknown");

    /**
     * Static value connecting for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal CONNECTING = fromString("connecting");

    /**
     * Static value connected for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal CONNECTED = fromString("connected");

    /**
     * Static value transferring for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal TRANSFERRING = fromString("transferring");

    /**
     * Static value transferAccepted for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal TRANSFER_ACCEPTED = fromString("transferAccepted");

    /**
     * Static value disconnecting for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal DISCONNECTING = fromString("disconnecting");

    /**
     * Static value disconnected for CallConnectionStateModelInternal.
     */
    public static final CallConnectionStateModelInternal DISCONNECTED = fromString("disconnected");

    /**
     * Creates a new instance of CallConnectionStateModelInternal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CallConnectionStateModelInternal() {
    }

    /**
     * Creates or finds a CallConnectionStateModelInternal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CallConnectionStateModelInternal.
     */
    public static CallConnectionStateModelInternal fromString(String name) {
        return fromString(name, CallConnectionStateModelInternal.class);
    }

    /**
     * Gets known CallConnectionStateModelInternal values.
     * 
     * @return known CallConnectionStateModelInternal values.
     */
    public static Collection<CallConnectionStateModelInternal> values() {
        return values(CallConnectionStateModelInternal.class);
    }
}

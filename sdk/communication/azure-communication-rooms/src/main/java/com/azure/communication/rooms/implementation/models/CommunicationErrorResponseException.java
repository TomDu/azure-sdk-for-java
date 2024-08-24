// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with CommunicationErrorResponse information.
 */
public final class CommunicationErrorResponseException extends HttpResponseException {
    /**
     * Initializes a new instance of the CommunicationErrorResponseException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public CommunicationErrorResponseException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the CommunicationErrorResponseException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public CommunicationErrorResponseException(String message, HttpResponse response,
        CommunicationErrorResponse value) {
        super(message, response, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommunicationErrorResponse getValue() {
        return (CommunicationErrorResponse) super.getValue();
    }
}

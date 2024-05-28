// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AutonomousDatabaseCharacterSets.
 */
public interface AutonomousDatabaseCharacterSets {
    /**
     * List AutonomousDatabaseCharacterSet resources by Location.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseCharacterSet list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AutonomousDatabaseCharacterSet> listByLocation(String location);

    /**
     * List AutonomousDatabaseCharacterSet resources by Location.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseCharacterSet list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AutonomousDatabaseCharacterSet> listByLocation(String location, Context context);

    /**
     * Get a AutonomousDatabaseCharacterSet.
     * 
     * @param location The name of the Azure region.
     * @param adbscharsetname AutonomousDatabaseCharacterSet name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabaseCharacterSet along with {@link Response}.
     */
    Response<AutonomousDatabaseCharacterSet> getWithResponse(String location, String adbscharsetname, Context context);

    /**
     * Get a AutonomousDatabaseCharacterSet.
     * 
     * @param location The name of the Azure region.
     * @param adbscharsetname AutonomousDatabaseCharacterSet name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabaseCharacterSet.
     */
    AutonomousDatabaseCharacterSet get(String location, String adbscharsetname);
}

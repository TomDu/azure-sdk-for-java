// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of VirtualNetworkAddresses.
 */
public interface VirtualNetworkAddresses {
    /**
     * List VirtualNetworkAddress resources by CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VirtualNetworkAddress list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualNetworkAddress> listByCloudVmCluster(String resourceGroupName, String cloudvmclustername);

    /**
     * List VirtualNetworkAddress resources by CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VirtualNetworkAddress list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualNetworkAddress> listByCloudVmCluster(String resourceGroupName, String cloudvmclustername,
        Context context);

    /**
     * Get a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VirtualNetworkAddress along with {@link Response}.
     */
    Response<VirtualNetworkAddress> getWithResponse(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname, Context context);

    /**
     * Get a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VirtualNetworkAddress.
     */
    VirtualNetworkAddress get(String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname, Context context);

    /**
     * Get a VirtualNetworkAddress.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VirtualNetworkAddress along with {@link Response}.
     */
    VirtualNetworkAddress getById(String id);

    /**
     * Get a VirtualNetworkAddress.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VirtualNetworkAddress along with {@link Response}.
     */
    Response<VirtualNetworkAddress> getByIdWithResponse(String id, Context context);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualNetworkAddress resource.
     * 
     * @param name resource name.
     * @return the first stage of the new VirtualNetworkAddress definition.
     */
    VirtualNetworkAddress.DefinitionStages.Blank define(String name);
}

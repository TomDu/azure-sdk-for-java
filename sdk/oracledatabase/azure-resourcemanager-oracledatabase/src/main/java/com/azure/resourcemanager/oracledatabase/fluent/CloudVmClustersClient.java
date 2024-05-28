// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.oracledatabase.fluent.models.CloudVmClusterInner;
import com.azure.resourcemanager.oracledatabase.fluent.models.PrivateIpAddressPropertiesInner;
import com.azure.resourcemanager.oracledatabase.models.AddRemoveDbNode;
import com.azure.resourcemanager.oracledatabase.models.CloudVmClusterUpdate;
import com.azure.resourcemanager.oracledatabase.models.PrivateIpAddressesFilter;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in CloudVmClustersClient.
 */
public interface CloudVmClustersClient {
    /**
     * List CloudVmCluster resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudVmClusterInner> list();

    /**
     * List CloudVmCluster resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudVmClusterInner> list(Context context);

    /**
     * List CloudVmCluster resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudVmClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * List CloudVmCluster resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudVmCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudVmClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CloudVmCluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudVmClusterInner> getByResourceGroupWithResponse(String resourceGroupName, String cloudvmclustername,
        Context context);

    /**
     * Get a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CloudVmCluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner getByResourceGroup(String resourceGroupName, String cloudvmclustername);

    /**
     * Create a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginCreateOrUpdate(String resourceGroupName,
        String cloudvmclustername, CloudVmClusterInner resource);

    /**
     * Create a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginCreateOrUpdate(String resourceGroupName,
        String cloudvmclustername, CloudVmClusterInner resource, Context context);

    /**
     * Create a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner createOrUpdate(String resourceGroupName, String cloudvmclustername,
        CloudVmClusterInner resource);

    /**
     * Create a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner createOrUpdate(String resourceGroupName, String cloudvmclustername,
        CloudVmClusterInner resource, Context context);

    /**
     * Update a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginUpdate(String resourceGroupName,
        String cloudvmclustername, CloudVmClusterUpdate properties);

    /**
     * Update a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginUpdate(String resourceGroupName,
        String cloudvmclustername, CloudVmClusterUpdate properties, Context context);

    /**
     * Update a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner update(String resourceGroupName, String cloudvmclustername, CloudVmClusterUpdate properties);

    /**
     * Update a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner update(String resourceGroupName, String cloudvmclustername, CloudVmClusterUpdate properties,
        Context context);

    /**
     * Delete a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudvmclustername);

    /**
     * Delete a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudvmclustername,
        Context context);

    /**
     * Delete a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudvmclustername);

    /**
     * Delete a CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudvmclustername, Context context);

    /**
     * Add VMs to the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginAddVms(String resourceGroupName,
        String cloudvmclustername, AddRemoveDbNode body);

    /**
     * Add VMs to the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginAddVms(String resourceGroupName,
        String cloudvmclustername, AddRemoveDbNode body, Context context);

    /**
     * Add VMs to the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner addVms(String resourceGroupName, String cloudvmclustername, AddRemoveDbNode body);

    /**
     * Add VMs to the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner addVms(String resourceGroupName, String cloudvmclustername, AddRemoveDbNode body,
        Context context);

    /**
     * List Private IP Addresses by the provided filter.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of PrivateIpAddressProperties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<PrivateIpAddressPropertiesInner>> listPrivateIpAddressesWithResponse(String resourceGroupName,
        String cloudvmclustername, PrivateIpAddressesFilter body, Context context);

    /**
     * List Private IP Addresses by the provided filter.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of PrivateIpAddressProperties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<PrivateIpAddressPropertiesInner> listPrivateIpAddresses(String resourceGroupName, String cloudvmclustername,
        PrivateIpAddressesFilter body);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginRemoveVms(String resourceGroupName,
        String cloudvmclustername, AddRemoveDbNode body);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudVmClusterInner>, CloudVmClusterInner> beginRemoveVms(String resourceGroupName,
        String cloudvmclustername, AddRemoveDbNode body, Context context);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner removeVms(String resourceGroupName, String cloudvmclustername, AddRemoveDbNode body);

    /**
     * Remove VMs from the VM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudVmCluster resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudVmClusterInner removeVms(String resourceGroupName, String cloudvmclustername, AddRemoveDbNode body,
        Context context);
}

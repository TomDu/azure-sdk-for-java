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
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseInner;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseWalletFileInner;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseUpdate;
import com.azure.resourcemanager.oracledatabase.models.GenerateAutonomousDatabaseWalletDetails;
import com.azure.resourcemanager.oracledatabase.models.PeerDbDetails;

/**
 * An instance of this class provides access to all the operations defined in AutonomousDatabasesClient.
 */
public interface AutonomousDatabasesClient {
    /**
     * List AutonomousDatabase resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutonomousDatabaseInner> list();

    /**
     * List AutonomousDatabase resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutonomousDatabaseInner> list(Context context);

    /**
     * List AutonomousDatabase resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutonomousDatabaseInner> listByResourceGroup(String resourceGroupName);

    /**
     * List AutonomousDatabase resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutonomousDatabaseInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabase along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutonomousDatabaseInner> getByResourceGroupWithResponse(String resourceGroupName,
        String autonomousdatabasename, Context context);

    /**
     * Get a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabase.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner getByResourceGroup(String resourceGroupName, String autonomousdatabasename);

    /**
     * Create a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner>
        beginCreateOrUpdate(String resourceGroupName, String autonomousdatabasename, AutonomousDatabaseInner resource);

    /**
     * Create a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginCreateOrUpdate(
        String resourceGroupName, String autonomousdatabasename, AutonomousDatabaseInner resource, Context context);

    /**
     * Create a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner createOrUpdate(String resourceGroupName, String autonomousdatabasename,
        AutonomousDatabaseInner resource);

    /**
     * Create a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner createOrUpdate(String resourceGroupName, String autonomousdatabasename,
        AutonomousDatabaseInner resource, Context context);

    /**
     * Update a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginUpdate(String resourceGroupName,
        String autonomousdatabasename, AutonomousDatabaseUpdate properties);

    /**
     * Update a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginUpdate(String resourceGroupName,
        String autonomousdatabasename, AutonomousDatabaseUpdate properties, Context context);

    /**
     * Update a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner update(String resourceGroupName, String autonomousdatabasename,
        AutonomousDatabaseUpdate properties);

    /**
     * Update a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner update(String resourceGroupName, String autonomousdatabasename,
        AutonomousDatabaseUpdate properties, Context context);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String autonomousdatabasename);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String autonomousdatabasename,
        Context context);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String autonomousdatabasename);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String autonomousdatabasename, Context context);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginFailover(String resourceGroupName,
        String autonomousdatabasename, PeerDbDetails body);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginFailover(String resourceGroupName,
        String autonomousdatabasename, PeerDbDetails body, Context context);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner failover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner failover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body,
        Context context);

    /**
     * Generate wallet action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database Wallet File resource model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutonomousDatabaseWalletFileInner> generateWalletWithResponse(String resourceGroupName,
        String autonomousdatabasename, GenerateAutonomousDatabaseWalletDetails body, Context context);

    /**
     * Generate wallet action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database Wallet File resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseWalletFileInner generateWallet(String resourceGroupName, String autonomousdatabasename,
        GenerateAutonomousDatabaseWalletDetails body);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginSwitchover(String resourceGroupName,
        String autonomousdatabasename, PeerDbDetails body);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AutonomousDatabaseInner>, AutonomousDatabaseInner> beginSwitchover(String resourceGroupName,
        String autonomousdatabasename, PeerDbDetails body, Context context);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner switchover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutonomousDatabaseInner switchover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body,
        Context context);
}

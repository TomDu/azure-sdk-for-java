// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.SecurityUserRuleInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SecurityUserRulesClient.
 */
public interface SecurityUserRulesClient {
    /**
     * Lists all Security User Rules in a rule collection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security user rule list result as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SecurityUserRuleInner> listAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, Integer top, String skipToken);

    /**
     * Lists all Security User Rules in a rule collection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security user rule list result as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SecurityUserRuleInner> listAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName);

    /**
     * Lists all Security User Rules in a rule collection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security user rule list result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityUserRuleInner> list(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName);

    /**
     * Lists all Security User Rules in a rule collection.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security user rule list result as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityUserRuleInner> list(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, Integer top, String skipToken, Context context);

    /**
     * Gets a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security user rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SecurityUserRuleInner>> getWithResponseAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName);

    /**
     * Gets a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security user rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityUserRuleInner> getAsync(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName);

    /**
     * Gets a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security user rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityUserRuleInner> getWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, Context context);

    /**
     * Gets a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security user rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityUserRuleInner get(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName);

    /**
     * Creates or updates a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param securityUserRule The security user rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security user rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SecurityUserRuleInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String networkManagerName, String configurationName, String ruleCollectionName, String ruleName,
        SecurityUserRuleInner securityUserRule);

    /**
     * Creates or updates a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param securityUserRule The security user rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security user rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecurityUserRuleInner> createOrUpdateAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, SecurityUserRuleInner securityUserRule);

    /**
     * Creates or updates a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param securityUserRule The security user rule to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security user rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityUserRuleInner> createOrUpdateWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, SecurityUserRuleInner securityUserRule,
        Context context);

    /**
     * Creates or updates a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param securityUserRule The security user rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security user rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityUserRuleInner createOrUpdate(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName, SecurityUserRuleInner securityUserRule);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, Boolean force);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, Boolean force);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkManagerName,
        String configurationName, String ruleCollectionName, String ruleName, Boolean force, Context context);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName, Boolean force);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName);

    /**
     * Deletes a security user rule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkManagerName The name of the network manager.
     * @param configurationName The name of the network manager Security Configuration.
     * @param ruleCollectionName The name of the network manager security Configuration rule collection.
     * @param ruleName The name of the rule.
     * @param force Deletes the resource even if it is part of a deployed configuration. If the configuration has been
     * deployed, the service will do a cleanup deployment in the background, prior to the delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String configurationName,
        String ruleCollectionName, String ruleName, Boolean force, Context context);
}

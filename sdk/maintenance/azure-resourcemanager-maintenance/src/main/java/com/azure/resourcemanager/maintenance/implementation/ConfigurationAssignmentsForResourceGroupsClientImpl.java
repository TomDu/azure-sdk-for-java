// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ConfigurationAssignmentsForResourceGroupsClient.
 */
public final class ConfigurationAssignmentsForResourceGroupsClientImpl
    implements ConfigurationAssignmentsForResourceGroupsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ConfigurationAssignmentsForResourceGroupsService service;

    /**
     * The service client containing this operation class.
     */
    private final MaintenanceManagementClientImpl client;

    /**
     * Initializes an instance of ConfigurationAssignmentsForResourceGroupsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ConfigurationAssignmentsForResourceGroupsClientImpl(MaintenanceManagementClientImpl client) {
        this.service = RestProxy.create(ConfigurationAssignmentsForResourceGroupsService.class,
            client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MaintenanceManagementClientConfigurationAssignmentsForResourceGroups
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MaintenanceManagemen")
    public interface ConfigurationAssignmentsForResourceGroupsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/configurationAssignments/{configurationAssignmentName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationAssignmentInner>> getByResourceGroup(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configurationAssignmentName") String configurationAssignmentName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/configurationAssignments/{configurationAssignmentName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationAssignmentInner>> createOrUpdate(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configurationAssignmentName") String configurationAssignmentName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ConfigurationAssignmentInner configurationAssignment,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/configurationAssignments/{configurationAssignmentName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationAssignmentInner>> update(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configurationAssignmentName") String configurationAssignmentName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ConfigurationAssignmentInner configurationAssignment,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Maintenance/configurationAssignments/{configurationAssignmentName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ConfigurationAssignmentInner>> delete(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configurationAssignmentName") String configurationAssignmentName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get configuration assignment
     * 
     * Get configuration assignment for resource..
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration assignment for resource. along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> getByResourceGroupWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.getByResourceGroup(this.client.getEndpoint(), this.client.getSubscriptionId(),
                    resourceGroupName, configurationAssignmentName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get configuration assignment
     * 
     * Get configuration assignment for resource..
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration assignment for resource. along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> getByResourceGroupWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getByResourceGroup(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configurationAssignmentName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get configuration assignment
     * 
     * Get configuration assignment for resource..
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration assignment for resource. on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationAssignmentInner> getByResourceGroupAsync(String resourceGroupName,
        String configurationAssignmentName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, configurationAssignmentName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get configuration assignment
     * 
     * Get configuration assignment for resource..
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration assignment for resource. along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationAssignmentInner> getByResourceGroupWithResponse(String resourceGroupName,
        String configurationAssignmentName, Context context) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, configurationAssignmentName, context).block();
    }

    /**
     * Get configuration assignment
     * 
     * Get configuration assignment for resource..
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration assignment for resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationAssignmentInner getByResourceGroup(String resourceGroupName,
        String configurationAssignmentName) {
        return getByResourceGroupWithResponse(resourceGroupName, configurationAssignmentName, Context.NONE).getValue();
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        if (configurationAssignment == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignment is required and cannot be null."));
        } else {
            configurationAssignment.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, configurationAssignmentName, this.client.getApiVersion(), configurationAssignment,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        if (configurationAssignment == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignment is required and cannot be null."));
        } else {
            configurationAssignment.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configurationAssignmentName, this.client.getApiVersion(), configurationAssignment, accept, context);
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationAssignmentInner> createOrUpdateAsync(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment) {
        return createOrUpdateWithResponseAsync(resourceGroupName, configurationAssignmentName, configurationAssignment)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationAssignmentInner> createOrUpdateWithResponse(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, configurationAssignmentName, configurationAssignment,
            context).block();
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationAssignmentInner createOrUpdate(String resourceGroupName, String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment) {
        return createOrUpdateWithResponse(resourceGroupName, configurationAssignmentName, configurationAssignment,
            Context.NONE).getValue();
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> updateWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        if (configurationAssignment == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignment is required and cannot be null."));
        } else {
            configurationAssignment.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.update(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
                    configurationAssignmentName, this.client.getApiVersion(), configurationAssignment, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> updateWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        if (configurationAssignment == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignment is required and cannot be null."));
        } else {
            configurationAssignment.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configurationAssignmentName, this.client.getApiVersion(), configurationAssignment, accept, context);
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationAssignmentInner> updateAsync(String resourceGroupName, String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment) {
        return updateWithResponseAsync(resourceGroupName, configurationAssignmentName, configurationAssignment)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationAssignmentInner> updateWithResponse(String resourceGroupName,
        String configurationAssignmentName, ConfigurationAssignmentInner configurationAssignment, Context context) {
        return updateWithResponseAsync(resourceGroupName, configurationAssignmentName, configurationAssignment, context)
            .block();
    }

    /**
     * Create configuration assignment
     * 
     * Register configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationAssignmentInner update(String resourceGroupName, String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment) {
        return updateWithResponse(resourceGroupName, configurationAssignmentName, configurationAssignment, Context.NONE)
            .getValue();
    }

    /**
     * Unregister configuration for resource
     * 
     * Unregister configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> deleteWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, configurationAssignmentName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Unregister configuration for resource
     * 
     * Unregister configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ConfigurationAssignmentInner>> deleteWithResponseAsync(String resourceGroupName,
        String configurationAssignmentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (configurationAssignmentName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter configurationAssignmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            configurationAssignmentName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Unregister configuration for resource
     * 
     * Unregister configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ConfigurationAssignmentInner> deleteAsync(String resourceGroupName,
        String configurationAssignmentName) {
        return deleteWithResponseAsync(resourceGroupName, configurationAssignmentName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Unregister configuration for resource
     * 
     * Unregister configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationAssignmentInner> deleteWithResponse(String resourceGroupName,
        String configurationAssignmentName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, configurationAssignmentName, context).block();
    }

    /**
     * Unregister configuration for resource
     * 
     * Unregister configuration for resource.
     * 
     * @param resourceGroupName Resource group name.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationAssignmentInner delete(String resourceGroupName, String configurationAssignmentName) {
        return deleteWithResponse(resourceGroupName, configurationAssignmentName, Context.NONE).getValue();
    }
}

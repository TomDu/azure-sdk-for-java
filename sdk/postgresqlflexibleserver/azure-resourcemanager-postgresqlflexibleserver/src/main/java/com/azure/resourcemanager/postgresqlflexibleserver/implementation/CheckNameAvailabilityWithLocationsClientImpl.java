// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.CheckNameAvailabilityWithLocationsClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in CheckNameAvailabilityWithLocationsClient.
 */
public final class CheckNameAvailabilityWithLocationsClientImpl implements CheckNameAvailabilityWithLocationsClient {
    /** The proxy service used to perform REST calls. */
    private final CheckNameAvailabilityWithLocationsService service;

    /** The service client containing this operation class. */
    private final PostgreSqlManagementClientImpl client;

    /**
     * Initializes an instance of CheckNameAvailabilityWithLocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CheckNameAvailabilityWithLocationsClientImpl(PostgreSqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    CheckNameAvailabilityWithLocationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PostgreSqlManagementClientCheckNameAvailabilityWithLocations to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PostgreSqlManagement")
    public interface CheckNameAvailabilityWithLocationsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DBforPostgreSQL/locations/{locationName}"
                + "/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NameAvailabilityInner>> execute(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @BodyParam("application/json") CheckNameAvailabilityRequest nameAvailabilityRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityInner>> executeWithResponseAsync(
        String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (nameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null."));
        } else {
            nameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .execute(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            locationName,
                            nameAvailabilityRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityInner>> executeWithResponseAsync(
        String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (nameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null."));
        } else {
            nameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .execute(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                locationName,
                nameAvailabilityRequest,
                accept,
                context);
    }

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NameAvailabilityInner> executeAsync(
        String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest) {
        return executeWithResponseAsync(locationName, nameAvailabilityRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NameAvailabilityInner> executeWithResponse(
        String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest, Context context) {
        return executeWithResponseAsync(locationName, nameAvailabilityRequest, context).block();
    }

    /**
     * Check the availability of name for resource.
     *
     * @param locationName The name of the location.
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NameAvailabilityInner execute(String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest) {
        return executeWithResponse(locationName, nameAvailabilityRequest, Context.NONE).getValue();
    }
}

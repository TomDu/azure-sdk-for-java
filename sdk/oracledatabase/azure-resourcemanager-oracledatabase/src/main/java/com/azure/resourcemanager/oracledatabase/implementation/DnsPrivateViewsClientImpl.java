// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.oracledatabase.fluent.DnsPrivateViewsClient;
import com.azure.resourcemanager.oracledatabase.fluent.models.DnsPrivateViewInner;
import com.azure.resourcemanager.oracledatabase.models.DnsPrivateViewListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DnsPrivateViewsClient.
 */
public final class DnsPrivateViewsClientImpl implements DnsPrivateViewsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DnsPrivateViewsService service;

    /**
     * The service client containing this operation class.
     */
    private final OracleDatabaseResourceManagerImpl client;

    /**
     * Initializes an instance of DnsPrivateViewsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DnsPrivateViewsClientImpl(OracleDatabaseResourceManagerImpl client) {
        this.service
            = RestProxy.create(DnsPrivateViewsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OracleDatabaseResourceManagerDnsPrivateViews to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "OracleDatabaseResour")
    public interface DnsPrivateViewsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Oracle.Database/locations/{location}/dnsPrivateViews")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DnsPrivateViewListResult>> listByLocation(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Oracle.Database/locations/{location}/dnsPrivateViews/{dnsprivateviewocid}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DnsPrivateViewInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @PathParam("dnsprivateviewocid") String dnsprivateviewocid,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DnsPrivateViewListResult>> listByLocationNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DnsPrivateViewInner>> listByLocationSinglePageAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByLocation(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, accept, context))
            .<PagedResponse<DnsPrivateViewInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DnsPrivateViewInner>> listByLocationSinglePageAsync(String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByLocation(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                location, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DnsPrivateViewInner> listByLocationAsync(String location) {
        return new PagedFlux<>(() -> listByLocationSinglePageAsync(location),
            nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DnsPrivateViewInner> listByLocationAsync(String location, Context context) {
        return new PagedFlux<>(() -> listByLocationSinglePageAsync(location, context),
            nextLink -> listByLocationNextSinglePageAsync(nextLink, context));
    }

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DnsPrivateViewInner> listByLocation(String location) {
        return new PagedIterable<>(listByLocationAsync(location));
    }

    /**
     * List DnsPrivateView resources by Location.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DnsPrivateViewInner> listByLocation(String location, Context context) {
        return new PagedIterable<>(listByLocationAsync(location, context));
    }

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DnsPrivateViewInner>> getWithResponseAsync(String location, String dnsprivateviewocid) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (dnsprivateviewocid == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter dnsprivateviewocid is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, dnsprivateviewocid, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DnsPrivateViewInner>> getWithResponseAsync(String location, String dnsprivateviewocid,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (dnsprivateviewocid == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter dnsprivateviewocid is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            location, dnsprivateviewocid, accept, context);
    }

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DnsPrivateViewInner> getAsync(String location, String dnsprivateviewocid) {
        return getWithResponseAsync(location, dnsprivateviewocid).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DnsPrivateViewInner> getWithResponse(String location, String dnsprivateviewocid, Context context) {
        return getWithResponseAsync(location, dnsprivateviewocid, context).block();
    }

    /**
     * Get a DnsPrivateView.
     * 
     * @param location The name of the Azure region.
     * @param dnsprivateviewocid DnsPrivateView OCID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DnsPrivateView.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DnsPrivateViewInner get(String location, String dnsprivateviewocid) {
        return getWithResponse(location, dnsprivateviewocid, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DnsPrivateViewInner>> listByLocationNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByLocationNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DnsPrivateViewInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DnsPrivateView list operation along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DnsPrivateViewInner>> listByLocationNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByLocationNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}

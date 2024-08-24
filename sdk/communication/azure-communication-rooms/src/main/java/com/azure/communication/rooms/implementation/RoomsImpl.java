// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation;

import com.azure.communication.rooms.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.rooms.implementation.models.CreateRoomRequest;
import com.azure.communication.rooms.implementation.models.RoomModel;
import com.azure.communication.rooms.implementation.models.RoomsCollection;
import com.azure.communication.rooms.implementation.models.UpdateRoomRequest;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.core.util.Context;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.FluxUtil;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Rooms.
 */
public final class RoomsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RoomsService service;

    /**
     * The service client containing this operation class.
     */
    private final AzureCommunicationRoomServiceImpl client;

    /**
     * Initializes an instance of RoomsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RoomsImpl(AzureCommunicationRoomServiceImpl client) {
        this.service = RestProxy.create(RoomsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationRoomServiceRooms to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationRo")
    public interface RoomsService {
        @Post("/rooms")
        @ExpectedResponses({ 201 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RoomModel>> create(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CreateRoomRequest createRoomRequest, @HeaderParam("Accept") String accept,
            @HeaderParam("repeatability-request-id") String repeatabilityRequestId,
            @HeaderParam("repeatability-first-sent") String repeatabilityFirstSent, Context context);

        @Post("/rooms")
        @ExpectedResponses({ 201 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Response<RoomModel> createSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CreateRoomRequest createRoomRequest, @HeaderParam("Accept") String accept,
            @HeaderParam("repeatability-request-id") String repeatabilityRequestId,
            @HeaderParam("repeatability-first-sent") String repeatabilityFirstSent, Context context);

        @Get("/rooms")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RoomsCollection>> list(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Get("/rooms")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Response<RoomsCollection> listSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Get("/rooms/{roomId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RoomModel>> get(@HostParam("endpoint") String endpoint, @PathParam("roomId") String roomId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Get("/rooms/{roomId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Response<RoomModel> getSync(@HostParam("endpoint") String endpoint, @PathParam("roomId") String roomId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Patch("/rooms/{roomId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RoomModel>> update(@HostParam("endpoint") String endpoint, @PathParam("roomId") String roomId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/merge-patch+json") UpdateRoomRequest updateRoomRequest,
            @HeaderParam("Accept") String accept, Context context);

        @Patch("/rooms/{roomId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Response<RoomModel> updateSync(@HostParam("endpoint") String endpoint, @PathParam("roomId") String roomId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/merge-patch+json") UpdateRoomRequest updateRoomRequest,
            @HeaderParam("Accept") String accept, Context context);

        @Delete("/rooms/{roomId}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> delete(@HostParam("endpoint") String endpoint, @PathParam("roomId") String roomId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Delete("/rooms/{roomId}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Response<Void> deleteSync(@HostParam("endpoint") String endpoint, @PathParam("roomId") String roomId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RoomsCollection>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Response<RoomsCollection> listNextSync(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Creates a new room.
     * 
     * @param createRoomRequest The create room request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoomModel>> createWithResponseAsync(CreateRoomRequest createRoomRequest) {
        final String accept = "application/json";
        String repeatabilityRequestId = UUID.randomUUID().toString();
        String repeatabilityFirstSent = DateTimeRfc1123.toRfc1123String(OffsetDateTime.now());
        return FluxUtil.withContext(context -> service.create(this.client.getEndpoint(), this.client.getApiVersion(),
            createRoomRequest, accept, repeatabilityRequestId, repeatabilityFirstSent, context));
    }

    /**
     * Creates a new room.
     * 
     * @param createRoomRequest The create room request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoomModel>> createWithResponseAsync(CreateRoomRequest createRoomRequest, Context context) {
        final String accept = "application/json";
        String repeatabilityRequestId = UUID.randomUUID().toString();
        String repeatabilityFirstSent = DateTimeRfc1123.toRfc1123String(OffsetDateTime.now());
        return service.create(this.client.getEndpoint(), this.client.getApiVersion(), createRoomRequest, accept,
            repeatabilityRequestId, repeatabilityFirstSent, context);
    }

    /**
     * Creates a new room.
     * 
     * @param createRoomRequest The create room request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoomModel> createAsync(CreateRoomRequest createRoomRequest) {
        return createWithResponseAsync(createRoomRequest).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates a new room.
     * 
     * @param createRoomRequest The create room request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoomModel> createAsync(CreateRoomRequest createRoomRequest, Context context) {
        return createWithResponseAsync(createRoomRequest, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates a new room.
     * 
     * @param createRoomRequest The create room request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoomModel> createWithResponse(CreateRoomRequest createRoomRequest, Context context) {
        final String accept = "application/json";
        String repeatabilityRequestId = UUID.randomUUID().toString();
        String repeatabilityFirstSent = DateTimeRfc1123.toRfc1123String(OffsetDateTime.now());
        return service.createSync(this.client.getEndpoint(), this.client.getApiVersion(), createRoomRequest, accept,
            repeatabilityRequestId, repeatabilityFirstSent, context);
    }

    /**
     * Creates a new room.
     * 
     * @param createRoomRequest The create room request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoomModel create(CreateRoomRequest createRoomRequest) {
        return createWithResponse(createRoomRequest, Context.NONE).getValue();
    }

    /**
     * Retrieves all created rooms.
     * 
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoomModel>> listSinglePageAsync() {
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Retrieves all created rooms.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoomModel>> listSinglePageAsync(Context context) {
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Retrieves all created rooms.
     * 
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoomModel> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all created rooms.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoomModel> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Retrieves all created rooms.
     * 
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoomModel> listSinglePage() {
        final String accept = "application/json";
        Response<RoomsCollection> res
            = service.listSync(this.client.getEndpoint(), this.client.getApiVersion(), accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            res.getValue().getValue(), res.getValue().getNextLink(), null);
    }

    /**
     * Retrieves all created rooms.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoomModel> listSinglePage(Context context) {
        final String accept = "application/json";
        Response<RoomsCollection> res
            = service.listSync(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            res.getValue().getValue(), res.getValue().getNextLink(), null);
    }

    /**
     * Retrieves all created rooms.
     * 
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoomModel> list() {
        return new PagedIterable<>(() -> listSinglePage(Context.NONE), nextLink -> listNextSinglePage(nextLink));
    }

    /**
     * Retrieves all created rooms.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoomModel> list(Context context) {
        return new PagedIterable<>(() -> listSinglePage(context), nextLink -> listNextSinglePage(nextLink, context));
    }

    /**
     * Retrieves an existing room by id.
     * 
     * @param roomId The id of the room requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoomModel>> getWithResponseAsync(String roomId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.get(this.client.getEndpoint(), roomId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Retrieves an existing room by id.
     * 
     * @param roomId The id of the room requested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoomModel>> getWithResponseAsync(String roomId, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), roomId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Retrieves an existing room by id.
     * 
     * @param roomId The id of the room requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoomModel> getAsync(String roomId) {
        return getWithResponseAsync(roomId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves an existing room by id.
     * 
     * @param roomId The id of the room requested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoomModel> getAsync(String roomId, Context context) {
        return getWithResponseAsync(roomId, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves an existing room by id.
     * 
     * @param roomId The id of the room requested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoomModel> getWithResponse(String roomId, Context context) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), roomId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Retrieves an existing room by id.
     * 
     * @param roomId The id of the room requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoomModel get(String roomId) {
        return getWithResponse(roomId, Context.NONE).getValue();
    }

    /**
     * Update a room with given changes.
     * 
     * @param roomId The id of the room requested.
     * @param updateRoomRequest The update room request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoomModel>> updateWithResponseAsync(String roomId, UpdateRoomRequest updateRoomRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.update(this.client.getEndpoint(), roomId,
            this.client.getApiVersion(), updateRoomRequest, accept, context));
    }

    /**
     * Update a room with given changes.
     * 
     * @param roomId The id of the room requested.
     * @param updateRoomRequest The update room request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoomModel>> updateWithResponseAsync(String roomId, UpdateRoomRequest updateRoomRequest,
        Context context) {
        final String accept = "application/json";
        return service.update(this.client.getEndpoint(), roomId, this.client.getApiVersion(), updateRoomRequest, accept,
            context);
    }

    /**
     * Update a room with given changes.
     * 
     * @param roomId The id of the room requested.
     * @param updateRoomRequest The update room request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoomModel> updateAsync(String roomId, UpdateRoomRequest updateRoomRequest) {
        return updateWithResponseAsync(roomId, updateRoomRequest).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a room with given changes.
     * 
     * @param roomId The id of the room requested.
     * @param updateRoomRequest The update room request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoomModel> updateAsync(String roomId, UpdateRoomRequest updateRoomRequest, Context context) {
        return updateWithResponseAsync(roomId, updateRoomRequest, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a room with given changes.
     * 
     * @param roomId The id of the room requested.
     * @param updateRoomRequest The update room request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoomModel> updateWithResponse(String roomId, UpdateRoomRequest updateRoomRequest, Context context) {
        final String accept = "application/json";
        return service.updateSync(this.client.getEndpoint(), roomId, this.client.getApiVersion(), updateRoomRequest,
            accept, context);
    }

    /**
     * Update a room with given changes.
     * 
     * @param roomId The id of the room requested.
     * @param updateRoomRequest The update room request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the meeting room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoomModel update(String roomId, UpdateRoomRequest updateRoomRequest) {
        return updateWithResponse(roomId, updateRoomRequest, Context.NONE).getValue();
    }

    /**
     * Delete a room.
     * 
     * @param roomId The id of the room to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String roomId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.delete(this.client.getEndpoint(), roomId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Delete a room.
     * 
     * @param roomId The id of the room to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String roomId, Context context) {
        final String accept = "application/json";
        return service.delete(this.client.getEndpoint(), roomId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Delete a room.
     * 
     * @param roomId The id of the room to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String roomId) {
        return deleteWithResponseAsync(roomId).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete a room.
     * 
     * @param roomId The id of the room to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String roomId, Context context) {
        return deleteWithResponseAsync(roomId, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete a room.
     * 
     * @param roomId The id of the room to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String roomId, Context context) {
        final String accept = "application/json";
        return service.deleteSync(this.client.getEndpoint(), roomId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Delete a room.
     * 
     * @param roomId The id of the room to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String roomId) {
        deleteWithResponse(roomId, Context.NONE);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoomModel>> listNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoomModel>> listNextSinglePageAsync(String nextLink, Context context) {
        final String accept = "application/json";
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoomModel> listNextSinglePage(String nextLink) {
        final String accept = "application/json";
        Response<RoomsCollection> res = service.listNextSync(nextLink, this.client.getEndpoint(), accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            res.getValue().getValue(), res.getValue().getNextLink(), null);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of rooms along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<RoomModel> listNextSinglePage(String nextLink, Context context) {
        final String accept = "application/json";
        Response<RoomsCollection> res = service.listNextSync(nextLink, this.client.getEndpoint(), accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            res.getValue().getValue(), res.getValue().getNextLink(), null);
    }
}

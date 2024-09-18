// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.inference.implementation;

import com.azure.ai.inference.ModelServiceVersion;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the ChatCompletionsClient type.
 */
public final class ChatCompletionsClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ChatCompletionsClientService service;

    /**
     * Service host.
     */
    private final String endpoint;

    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final ModelServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public ModelServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of ChatCompletionsClient client.
     * 
     * @param endpoint Service host.
     * @param serviceVersion Service version.
     */
    public ChatCompletionsClientImpl(String endpoint, ModelServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ChatCompletionsClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Service host.
     * @param serviceVersion Service version.
     */
    public ChatCompletionsClientImpl(HttpPipeline httpPipeline, String endpoint, ModelServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ChatCompletionsClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Service host.
     * @param serviceVersion Service version.
     */
    public ChatCompletionsClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        ModelServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service
            = RestProxy.create(ChatCompletionsClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for ChatCompletionsClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ChatCompletionsClien")
    public interface ChatCompletionsClientService {
        @Post("/chat/completions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> complete(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") BinaryData completeRequest,
            RequestOptions requestOptions, Context context);

        @Post("/chat/completions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> completeSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") BinaryData completeRequest,
            RequestOptions requestOptions, Context context);

        @Get("/info")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> getModelInfo(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/info")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getModelInfoSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);
    }

    /**
     * Gets chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes"
     * provided prompt data. The method makes a REST API call to the `/chat/completions` route
     * on the given endpoint.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>extra-parameters</td><td>String</td><td>No</td><td>Controls what happens if extra parameters, undefined
     * by the REST API,
     * are passed in the JSON request payload.
     * This sets the HTTP request header `extra-parameters`. Allowed values: "error", "drop", "pass-through".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     messages (Required): [
     *          (Required){
     *             role: String(system/user/assistant/tool) (Required)
     *         }
     *     ]
     *     frequency_penalty: Double (Optional)
     *     stream: Boolean (Optional)
     *     presence_penalty: Double (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     max_tokens: Integer (Optional)
     *     response_format (Optional): {
     *         type: String (Required)
     *     }
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     tools (Optional): [
     *          (Optional){
     *             type: String (Required)
     *             function (Required): {
     *                 name: String (Required)
     *                 description: String (Optional)
     *                 parameters: Object (Optional)
     *             }
     *         }
     *     ]
     *     tool_choice: BinaryData (Optional)
     *     seed: Long (Optional)
     *     model: String (Optional)
     *      (Optional): {
     *         String: Object (Required)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: long (Required)
     *     model: String (Required)
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     *     choices (Required): [
     *          (Required){
     *             index: int (Required)
     *             finish_reason: String(stop/length/content_filter/tool_calls) (Required)
     *             message (Required): {
     *                 role: String(system/user/assistant/tool) (Required)
     *                 content: String (Required)
     *                 tool_calls (Optional): [
     *                      (Optional){
     *                         id: String (Required)
     *                         type: String (Required)
     *                         function (Required): {
     *                             name: String (Required)
     *                             arguments: String (Required)
     *                         }
     *                     }
     *                 ]
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param completeRequest The completeRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes"
     * provided prompt data along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> completeWithResponseAsync(BinaryData completeRequest,
        RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.complete(this.getEndpoint(),
            this.getServiceVersion().getVersion(), contentType, accept, completeRequest, requestOptions, context));
    }

    /**
     * Gets chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes"
     * provided prompt data. The method makes a REST API call to the `/chat/completions` route
     * on the given endpoint.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>extra-parameters</td><td>String</td><td>No</td><td>Controls what happens if extra parameters, undefined
     * by the REST API,
     * are passed in the JSON request payload.
     * This sets the HTTP request header `extra-parameters`. Allowed values: "error", "drop", "pass-through".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     messages (Required): [
     *          (Required){
     *             role: String(system/user/assistant/tool) (Required)
     *         }
     *     ]
     *     frequency_penalty: Double (Optional)
     *     stream: Boolean (Optional)
     *     presence_penalty: Double (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     max_tokens: Integer (Optional)
     *     response_format (Optional): {
     *         type: String (Required)
     *     }
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     tools (Optional): [
     *          (Optional){
     *             type: String (Required)
     *             function (Required): {
     *                 name: String (Required)
     *                 description: String (Optional)
     *                 parameters: Object (Optional)
     *             }
     *         }
     *     ]
     *     tool_choice: BinaryData (Optional)
     *     seed: Long (Optional)
     *     model: String (Optional)
     *      (Optional): {
     *         String: Object (Required)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: long (Required)
     *     model: String (Required)
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     *     choices (Required): [
     *          (Required){
     *             index: int (Required)
     *             finish_reason: String(stop/length/content_filter/tool_calls) (Required)
     *             message (Required): {
     *                 role: String(system/user/assistant/tool) (Required)
     *                 content: String (Required)
     *                 tool_calls (Optional): [
     *                      (Optional){
     *                         id: String (Required)
     *                         type: String (Required)
     *                         function (Required): {
     *                             name: String (Required)
     *                             arguments: String (Required)
     *                         }
     *                     }
     *                 ]
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param completeRequest The completeRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes"
     * provided prompt data along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> completeWithResponse(BinaryData completeRequest, RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.completeSync(this.getEndpoint(), this.getServiceVersion().getVersion(), contentType, accept,
            completeRequest, requestOptions, Context.NONE);
    }

    /**
     * Returns information about the AI model.
     * The method makes a REST API call to the `/info` route on the given endpoint.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model_name: String (Required)
     *     model_type: String(embeddings/image_generation/text_generation/image_embeddings/audio_generation/chat) (Required)
     *     model_provider_name: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents some basic information about the AI model along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getModelInfoWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getModelInfo(this.getEndpoint(),
            this.getServiceVersion().getVersion(), accept, requestOptions, context));
    }

    /**
     * Returns information about the AI model.
     * The method makes a REST API call to the `/info` route on the given endpoint.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model_name: String (Required)
     *     model_type: String(embeddings/image_generation/text_generation/image_embeddings/audio_generation/chat) (Required)
     *     model_provider_name: String (Required)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents some basic information about the AI model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getModelInfoWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getModelInfoSync(this.getEndpoint(), this.getServiceVersion().getVersion(), accept,
            requestOptions, Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference;

import com.azure.ai.inference.implementation.ChatCompletionsClientImpl;
import com.azure.ai.inference.implementation.models.CompleteRequest;
import com.azure.ai.inference.models.ChatCompletions;
import com.azure.ai.inference.models.ExtraParameters;
import com.azure.ai.inference.models.ModelInfo;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.azure.ai.inference.implementation.accesshelpers.ChatCompletionsOptionsAccessHelper;
import com.azure.ai.inference.implementation.InferenceServerSentEvents;
import com.azure.ai.inference.implementation.ChatCompletionsUtils;
import com.azure.ai.inference.models.ChatCompletionsOptions;
import com.azure.ai.inference.models.StreamingChatCompletionsUpdate;
import java.nio.ByteBuffer;

/**
 * Initializes a new instance of the asynchronous ChatCompletionsClient type.
 */
@ServiceClient(builder = ChatCompletionsClientBuilder.class, isAsync = true)
public final class ChatCompletionsAsyncClient {

    @Generated
    private final ChatCompletionsClientImpl serviceClient;

    /**
     * Initializes an instance of ChatCompletionsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ChatCompletionsAsyncClient(ChatCompletionsClientImpl serviceClient) {
        this.serviceClient = serviceClient;
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
    private Mono<Response<BinaryData>> completeWithResponse(BinaryData completeRequest, RequestOptions requestOptions) {
        return this.serviceClient.completeWithResponseAsync(completeRequest, requestOptions);
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
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BinaryData>> getModelInfoWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getModelInfoWithResponseAsync(requestOptions);
    }

    /**
     * Gets chat completions for the provided chat messages. Chat completions support a wide variety of tasks and
     * generate text that continues from or "completes" provided prompt data.
     *
     * @param options The configuration information for a chat completions request. Completions support a
     * wide variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return chat completions stream for the provided chat messages. Completions support a wide variety of tasks and
     * generate text that continues from or "completes" provided prompt data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Flux<StreamingChatCompletionsUpdate> completeStream(ChatCompletionsOptions options) {
        ChatCompletionsOptionsAccessHelper.setStream(options, true);
        RequestOptions requestOptions = new RequestOptions();
        Flux<ByteBuffer> responseStream = completeWithResponse(BinaryData.fromObject(options), requestOptions)
            .flatMapMany(response -> response.getValue().toFluxByteBuffer());
        InferenceServerSentEvents<StreamingChatCompletionsUpdate> chatCompletionsStream
            = new InferenceServerSentEvents<>(responseStream, StreamingChatCompletionsUpdate.class);
        return chatCompletionsStream.getEvents();
    }

    /**
     * Gets completions for the provided input prompt. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data.
     *
     * @param prompt The prompt to generate completion text from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChatCompletions> complete(String prompt) {
        return complete(ChatCompletionsUtils.defaultCompleteOptions(prompt));
    }

    /**
     * Gets chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes"
     * provided prompt data. The method makes a REST API call to the `/chat/completions` route
     * on the given endpoint.
     *
     * @param options Options for complete API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes"
     * provided prompt data on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChatCompletions> complete(ChatCompletionsOptions options) {
        // Generated convenience method for completeWithResponse
        RequestOptions requestOptions = new RequestOptions();
        CompleteRequest completeRequestObj
            = new CompleteRequest(options.getMessages()).setFrequencyPenalty(options.getFrequencyPenalty())
                .setStream(options.isStream())
                .setPresencePenalty(options.getPresencePenalty())
                .setTemperature(options.getTemperature())
                .setTopP(options.getTopP())
                .setMaxTokens(options.getMaxTokens())
                .setResponseFormat(options.getResponseFormat())
                .setStop(options.getStop())
                .setTools(options.getTools())
                .setToolChoice(options.getToolChoice())
                .setSeed(options.getSeed())
                .setModel(options.getModel());
        BinaryData completeRequest = BinaryData.fromObject(completeRequestObj);
        ExtraParameters extraParams = options.getExtraParams();
        if (extraParams != null) {
            requestOptions.setHeader(HttpHeaderName.fromString("extra-parameters"), extraParams.toString());
        }
        return completeWithResponse(completeRequest, requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(ChatCompletions.class));
    }

    /**
     * Returns information about the AI model.
     * The method makes a REST API call to the `/info` route on the given endpoint.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents some basic information about the AI model on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ModelInfo> getModelInfo() {
        // Generated convenience method for getModelInfoWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getModelInfoWithResponse(requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(ModelInfo.class));
    }
}

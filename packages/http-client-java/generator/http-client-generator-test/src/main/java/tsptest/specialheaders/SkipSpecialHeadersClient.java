// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.specialheaders;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import tsptest.specialheaders.implementation.SkipSpecialHeadersImpl;

/**
 * Initializes a new instance of the synchronous SpecialHeadersClient type.
 */
@ServiceClient(builder = SpecialHeadersClientBuilder.class)
public final class SkipSpecialHeadersClient {
    @Generated
    private final SkipSpecialHeadersImpl serviceClient;

    /**
     * Initializes an instance of SkipSpecialHeadersClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    SkipSpecialHeadersClient(SkipSpecialHeadersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * skip special headers.
     * 
     * @param name The name parameter.
     * @param foo The foo parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithSpecialHeadersWithResponse(String name, String foo, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithSpecialHeadersWithResponse(name, foo, requestOptions);
    }

    /**
     * skip special headers.
     * 
     * @param name The name parameter.
     * @param foo The foo parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteWithSpecialHeaders(String name, String foo) {
        // Generated convenience method for deleteWithSpecialHeadersWithResponse
        RequestOptions requestOptions = new RequestOptions();
        deleteWithSpecialHeadersWithResponse(name, foo, requestOptions).getValue();
    }
}
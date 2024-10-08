// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.RegistryEnvironmentVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentVersionInner;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersion;
import com.azure.resourcemanager.machinelearning.models.ListViewType;
import com.azure.resourcemanager.machinelearning.models.RegistryEnvironmentVersions;

public final class RegistryEnvironmentVersionsImpl implements RegistryEnvironmentVersions {
    private static final ClientLogger LOGGER = new ClientLogger(RegistryEnvironmentVersionsImpl.class);

    private final RegistryEnvironmentVersionsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public RegistryEnvironmentVersionsImpl(RegistryEnvironmentVersionsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EnvironmentVersion> list(String resourceGroupName, String registryName,
        String environmentName) {
        PagedIterable<EnvironmentVersionInner> inner
            = this.serviceClient().list(resourceGroupName, registryName, environmentName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EnvironmentVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<EnvironmentVersion> list(String resourceGroupName, String registryName, String environmentName,
        String orderBy, Integer top, String skip, ListViewType listViewType, Context context) {
        PagedIterable<EnvironmentVersionInner> inner = this.serviceClient()
            .list(resourceGroupName, registryName, environmentName, orderBy, top, skip, listViewType, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new EnvironmentVersionImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String registryName, String environmentName, String version) {
        this.serviceClient().delete(resourceGroupName, registryName, environmentName, version);
    }

    public void delete(String resourceGroupName, String registryName, String environmentName, String version,
        Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, environmentName, version, context);
    }

    public Response<EnvironmentVersion> getWithResponse(String resourceGroupName, String registryName,
        String environmentName, String version, Context context) {
        Response<EnvironmentVersionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, registryName, environmentName, version, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EnvironmentVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EnvironmentVersion get(String resourceGroupName, String registryName, String environmentName,
        String version) {
        EnvironmentVersionInner inner
            = this.serviceClient().get(resourceGroupName, registryName, environmentName, version);
        if (inner != null) {
            return new EnvironmentVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EnvironmentVersion createOrUpdate(String resourceGroupName, String registryName, String environmentName,
        String version, EnvironmentVersionInner body) {
        EnvironmentVersionInner inner
            = this.serviceClient().createOrUpdate(resourceGroupName, registryName, environmentName, version, body);
        if (inner != null) {
            return new EnvironmentVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EnvironmentVersion createOrUpdate(String resourceGroupName, String registryName, String environmentName,
        String version, EnvironmentVersionInner body, Context context) {
        EnvironmentVersionInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, registryName, environmentName, version, body, context);
        if (inner != null) {
            return new EnvironmentVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private RegistryEnvironmentVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}

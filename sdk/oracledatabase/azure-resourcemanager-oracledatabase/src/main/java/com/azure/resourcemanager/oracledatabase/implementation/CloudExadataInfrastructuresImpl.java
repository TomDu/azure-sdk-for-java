// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.oracledatabase.fluent.CloudExadataInfrastructuresClient;
import com.azure.resourcemanager.oracledatabase.fluent.models.CloudExadataInfrastructureInner;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructure;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructures;

public final class CloudExadataInfrastructuresImpl implements CloudExadataInfrastructures {
    private static final ClientLogger LOGGER = new ClientLogger(CloudExadataInfrastructuresImpl.class);

    private final CloudExadataInfrastructuresClient innerClient;

    private final com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager;

    public CloudExadataInfrastructuresImpl(CloudExadataInfrastructuresClient innerClient,
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CloudExadataInfrastructure> list() {
        PagedIterable<CloudExadataInfrastructureInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new CloudExadataInfrastructureImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudExadataInfrastructure> list(Context context) {
        PagedIterable<CloudExadataInfrastructureInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new CloudExadataInfrastructureImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudExadataInfrastructure> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CloudExadataInfrastructureInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new CloudExadataInfrastructureImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudExadataInfrastructure> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CloudExadataInfrastructureInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new CloudExadataInfrastructureImpl(inner1, this.manager()));
    }

    public Response<CloudExadataInfrastructure> getByResourceGroupWithResponse(String resourceGroupName,
        String cloudexadatainfrastructurename, Context context) {
        Response<CloudExadataInfrastructureInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, cloudexadatainfrastructurename, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CloudExadataInfrastructureImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CloudExadataInfrastructure getByResourceGroup(String resourceGroupName,
        String cloudexadatainfrastructurename) {
        CloudExadataInfrastructureInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, cloudexadatainfrastructurename);
        if (inner != null) {
            return new CloudExadataInfrastructureImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String cloudexadatainfrastructurename) {
        this.serviceClient().delete(resourceGroupName, cloudexadatainfrastructurename);
    }

    public void delete(String resourceGroupName, String cloudexadatainfrastructurename, Context context) {
        this.serviceClient().delete(resourceGroupName, cloudexadatainfrastructurename, context);
    }

    public CloudExadataInfrastructure addStorageCapacity(String resourceGroupName,
        String cloudexadatainfrastructurename) {
        CloudExadataInfrastructureInner inner
            = this.serviceClient().addStorageCapacity(resourceGroupName, cloudexadatainfrastructurename);
        if (inner != null) {
            return new CloudExadataInfrastructureImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CloudExadataInfrastructure addStorageCapacity(String resourceGroupName,
        String cloudexadatainfrastructurename, Context context) {
        CloudExadataInfrastructureInner inner
            = this.serviceClient().addStorageCapacity(resourceGroupName, cloudexadatainfrastructurename, context);
        if (inner != null) {
            return new CloudExadataInfrastructureImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CloudExadataInfrastructure getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudexadatainfrastructurename
            = ResourceManagerUtils.getValueFromIdByName(id, "cloudExadataInfrastructures");
        if (cloudexadatainfrastructurename == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'cloudExadataInfrastructures'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudexadatainfrastructurename, Context.NONE)
            .getValue();
    }

    public Response<CloudExadataInfrastructure> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudexadatainfrastructurename
            = ResourceManagerUtils.getValueFromIdByName(id, "cloudExadataInfrastructures");
        if (cloudexadatainfrastructurename == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'cloudExadataInfrastructures'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudexadatainfrastructurename, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudexadatainfrastructurename
            = ResourceManagerUtils.getValueFromIdByName(id, "cloudExadataInfrastructures");
        if (cloudexadatainfrastructurename == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'cloudExadataInfrastructures'.", id)));
        }
        this.delete(resourceGroupName, cloudexadatainfrastructurename, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudexadatainfrastructurename
            = ResourceManagerUtils.getValueFromIdByName(id, "cloudExadataInfrastructures");
        if (cloudexadatainfrastructurename == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'cloudExadataInfrastructures'.", id)));
        }
        this.delete(resourceGroupName, cloudexadatainfrastructurename, context);
    }

    private CloudExadataInfrastructuresClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager() {
        return this.serviceManager;
    }

    public CloudExadataInfrastructureImpl define(String name) {
        return new CloudExadataInfrastructureImpl(name, this.manager());
    }
}

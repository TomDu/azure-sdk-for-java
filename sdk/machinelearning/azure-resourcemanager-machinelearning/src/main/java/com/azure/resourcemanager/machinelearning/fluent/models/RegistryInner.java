// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.ArmResourceId;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.RegistryPrivateEndpointConnection;
import com.azure.resourcemanager.machinelearning.models.RegistryRegionArmDetails;
import com.azure.resourcemanager.machinelearning.models.Sku;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The Registry model.
 */
@Fluent
public final class RegistryInner extends Resource {
    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    private ManagedServiceIdentity identity;

    /*
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     */
    private String kind;

    /*
     * [Required] Additional attributes of the entity.
     */
    private RegistryProperties innerProperties = new RegistryProperties();

    /*
     * Sku details required for ARM contract for Autoscaling.
     */
    private Sku sku;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of RegistryInner class.
     */
    public RegistryInner() {
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type.
     * 
     * @param kind the kind value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the innerProperties property: [Required] Additional attributes of the entity.
     * 
     * @return the innerProperties value.
     */
    private RegistryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Sku details required for ARM contract for Autoscaling.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku details required for ARM contract for Autoscaling.
     * 
     * @param sku the sku value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegistryInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegistryInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the discoveryUrl property: Discovery URL for the Registry.
     * 
     * @return the discoveryUrl value.
     */
    public String discoveryUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().discoveryUrl();
    }

    /**
     * Set the discoveryUrl property: Discovery URL for the Registry.
     * 
     * @param discoveryUrl the discoveryUrl value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withDiscoveryUrl(String discoveryUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withDiscoveryUrl(discoveryUrl);
        return this;
    }

    /**
     * Get the intellectualPropertyPublisher property: IntellectualPropertyPublisher for the registry.
     * 
     * @return the intellectualPropertyPublisher value.
     */
    public String intellectualPropertyPublisher() {
        return this.innerProperties() == null ? null : this.innerProperties().intellectualPropertyPublisher();
    }

    /**
     * Set the intellectualPropertyPublisher property: IntellectualPropertyPublisher for the registry.
     * 
     * @param intellectualPropertyPublisher the intellectualPropertyPublisher value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withIntellectualPropertyPublisher(String intellectualPropertyPublisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withIntellectualPropertyPublisher(intellectualPropertyPublisher);
        return this;
    }

    /**
     * Get the managedResourceGroup property: ResourceId of the managed RG if the registry has system created resources.
     * 
     * @return the managedResourceGroup value.
     */
    public ArmResourceId managedResourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().managedResourceGroup();
    }

    /**
     * Set the managedResourceGroup property: ResourceId of the managed RG if the registry has system created resources.
     * 
     * @param managedResourceGroup the managedResourceGroup value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withManagedResourceGroup(ArmResourceId managedResourceGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withManagedResourceGroup(managedResourceGroup);
        return this;
    }

    /**
     * Get the mlFlowRegistryUri property: MLFlow Registry URI for the Registry.
     * 
     * @return the mlFlowRegistryUri value.
     */
    public String mlFlowRegistryUri() {
        return this.innerProperties() == null ? null : this.innerProperties().mlFlowRegistryUri();
    }

    /**
     * Set the mlFlowRegistryUri property: MLFlow Registry URI for the Registry.
     * 
     * @param mlFlowRegistryUri the mlFlowRegistryUri value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withMlFlowRegistryUri(String mlFlowRegistryUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withMlFlowRegistryUri(mlFlowRegistryUri);
        return this;
    }

    /**
     * Get the registryPrivateEndpointConnections property: Private endpoint connections info used for pending
     * connections in private link portal.
     * 
     * @return the registryPrivateEndpointConnections value.
     */
    public List<RegistryPrivateEndpointConnection> registryPrivateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().registryPrivateEndpointConnections();
    }

    /**
     * Set the registryPrivateEndpointConnections property: Private endpoint connections info used for pending
     * connections in private link portal.
     * 
     * @param registryPrivateEndpointConnections the registryPrivateEndpointConnections value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withRegistryPrivateEndpointConnections(
        List<RegistryPrivateEndpointConnection> registryPrivateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withRegistryPrivateEndpointConnections(registryPrivateEndpointConnections);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Is the Registry accessible from the internet?
     * Possible values: "Enabled" or "Disabled".
     * 
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Is the Registry accessible from the internet?
     * Possible values: "Enabled" or "Disabled".
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withPublicNetworkAccess(String publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the regionDetails property: Details of each region the registry is in.
     * 
     * @return the regionDetails value.
     */
    public List<RegistryRegionArmDetails> regionDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().regionDetails();
    }

    /**
     * Set the regionDetails property: Details of each region the registry is in.
     * 
     * @param regionDetails the regionDetails value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withRegionDetails(List<RegistryRegionArmDetails> regionDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistryProperties();
        }
        this.innerProperties().withRegionDetails(regionDetails);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model RegistryInner"));
        } else {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegistryInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistryInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistryInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RegistryInner.
     */
    public static RegistryInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistryInner deserializedRegistryInner = new RegistryInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRegistryInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRegistryInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRegistryInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRegistryInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedRegistryInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedRegistryInner.innerProperties = RegistryProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedRegistryInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedRegistryInner.kind = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedRegistryInner.sku = Sku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedRegistryInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistryInner;
        });
    }
}

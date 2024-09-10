// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.qumulo.models.ManagedServiceIdentity;
import com.azure.resourcemanager.qumulo.models.MarketplaceDetails;
import com.azure.resourcemanager.qumulo.models.ProvisioningState;
import com.azure.resourcemanager.qumulo.models.UserDetails;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Concrete tracked resource types can be created by aliasing this type using a specific property type.
 */
@Fluent
public final class FileSystemResourceInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    private FileSystemResourceProperties innerProperties;

    /*
     * The managed service identities assigned to this resource.
     */
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of FileSystemResourceInner class.
     */
    public FileSystemResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private FileSystemResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed service identities assigned to this resource.
     * 
     * @param identity the identity value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
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
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileSystemResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileSystemResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the marketplaceDetails property: Marketplace details.
     * 
     * @return the marketplaceDetails value.
     */
    public MarketplaceDetails marketplaceDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplaceDetails();
    }

    /**
     * Set the marketplaceDetails property: Marketplace details.
     * 
     * @param marketplaceDetails the marketplaceDetails value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withMarketplaceDetails(MarketplaceDetails marketplaceDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withMarketplaceDetails(marketplaceDetails);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning State of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the storageSku property: Storage Sku.
     * 
     * @return the storageSku value.
     */
    public String storageSku() {
        return this.innerProperties() == null ? null : this.innerProperties().storageSku();
    }

    /**
     * Set the storageSku property: Storage Sku.
     * 
     * @param storageSku the storageSku value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withStorageSku(String storageSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withStorageSku(storageSku);
        return this;
    }

    /**
     * Get the userDetails property: User Details.
     * 
     * @return the userDetails value.
     */
    public UserDetails userDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().userDetails();
    }

    /**
     * Set the userDetails property: User Details.
     * 
     * @param userDetails the userDetails value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withUserDetails(UserDetails userDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withUserDetails(userDetails);
        return this;
    }

    /**
     * Get the delegatedSubnetId property: Delegated subnet id for Vnet injection.
     * 
     * @return the delegatedSubnetId value.
     */
    public String delegatedSubnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().delegatedSubnetId();
    }

    /**
     * Set the delegatedSubnetId property: Delegated subnet id for Vnet injection.
     * 
     * @param delegatedSubnetId the delegatedSubnetId value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withDelegatedSubnetId(String delegatedSubnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withDelegatedSubnetId(delegatedSubnetId);
        return this;
    }

    /**
     * Get the clusterLoginUrl property: File system Id of the resource.
     * 
     * @return the clusterLoginUrl value.
     */
    public String clusterLoginUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterLoginUrl();
    }

    /**
     * Set the clusterLoginUrl property: File system Id of the resource.
     * 
     * @param clusterLoginUrl the clusterLoginUrl value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withClusterLoginUrl(String clusterLoginUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withClusterLoginUrl(clusterLoginUrl);
        return this;
    }

    /**
     * Get the privateIPs property: Private IPs of the resource.
     * 
     * @return the privateIPs value.
     */
    public List<String> privateIPs() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIPs();
    }

    /**
     * Set the privateIPs property: Private IPs of the resource.
     * 
     * @param privateIPs the privateIPs value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withPrivateIPs(List<String> privateIPs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withPrivateIPs(privateIPs);
        return this;
    }

    /**
     * Get the adminPassword property: Initial administrator password of the resource.
     * 
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().adminPassword();
    }

    /**
     * Set the adminPassword property: Initial administrator password of the resource.
     * 
     * @param adminPassword the adminPassword value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withAdminPassword(String adminPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withAdminPassword(adminPassword);
        return this;
    }

    /**
     * Get the availabilityZone property: Availability zone.
     * 
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityZone();
    }

    /**
     * Set the availabilityZone property: Availability zone.
     * 
     * @param availabilityZone the availabilityZone value to set.
     * @return the FileSystemResourceInner object itself.
     */
    public FileSystemResourceInner withAvailabilityZone(String availabilityZone) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileSystemResourceProperties();
        }
        this.innerProperties().withAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model FileSystemResourceInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileSystemResourceInner.class);

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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileSystemResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileSystemResourceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FileSystemResourceInner.
     */
    public static FileSystemResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileSystemResourceInner deserializedFileSystemResourceInner = new FileSystemResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFileSystemResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFileSystemResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFileSystemResourceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedFileSystemResourceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedFileSystemResourceInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedFileSystemResourceInner.innerProperties = FileSystemResourceProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedFileSystemResourceInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedFileSystemResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileSystemResourceInner;
        });
    }
}

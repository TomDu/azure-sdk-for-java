// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HyperscaleNodeEditionCapability;

public final class HyperscaleNodeEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperscaleNodeEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"nohjt\",\"supportedStorageEditions\":[{\"name\":\"dsoifiyipj\",\"supportedStorageMB\":[],\"status\":\"pgrjbz\"},{\"name\":\"rcjxvsnbyxqabn\",\"supportedStorageMB\":[],\"status\":\"cyshurzafbljjgp\"},{\"name\":\"oq\",\"supportedStorageMB\":[],\"status\":\"ljavbqid\"}],\"supportedServerVersions\":[{\"name\":\"zyulp\",\"supportedVersionsToUpgrade\":[\"jkrlkhbzhfepg\"],\"supportedVcores\":[],\"status\":\"xzlocxscp\"},{\"name\":\"erhhbcsglumm\",\"supportedVersionsToUpgrade\":[\"j\",\"odxobnbdxkqpxok\",\"jionpimexgstxgc\"],\"supportedVcores\":[],\"status\":\"maajrmvdjwzrlo\"}],\"supportedNodeTypes\":[{\"name\":\"whijcoejctbza\",\"nodeType\":\"qsycbkbfkgu\",\"status\":\"kexxppof\"},{\"name\":\"axcfjpgddtocjjx\",\"nodeType\":\"pmouexhdz\",\"status\":\"bqe\"},{\"name\":\"nxqbzvddn\",\"nodeType\":\"ndei\",\"status\":\"twnpzaoqvuhrhcf\"},{\"name\":\"yd\",\"nodeType\":\"lmjthjq\",\"status\":\"pyeicxm\"}],\"status\":\"iwqvhkh\"}")
                .toObject(HyperscaleNodeEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperscaleNodeEditionCapability model = new HyperscaleNodeEditionCapability();
        model = BinaryData.fromObject(model).toObject(HyperscaleNodeEditionCapability.class);
    }
}

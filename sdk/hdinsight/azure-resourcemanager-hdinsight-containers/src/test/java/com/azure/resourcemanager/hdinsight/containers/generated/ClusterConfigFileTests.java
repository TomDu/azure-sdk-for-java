// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterConfigFile;
import com.azure.resourcemanager.hdinsight.containers.models.ContentEncoding;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterConfigFileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterConfigFile model = BinaryData.fromString(
            "{\"fileName\":\"iukbldngkpoci\",\"content\":\"z\",\"encoding\":\"Base64\",\"path\":\"gukgjnpiucgygevq\",\"values\":{\"rbpizc\":\"yp\",\"j\":\"r\",\"yhxdeoejzicwi\":\"dpydn\",\"bkh\":\"sjttgzfbish\"}}")
            .toObject(ClusterConfigFile.class);
        Assertions.assertEquals("iukbldngkpoci", model.fileName());
        Assertions.assertEquals("z", model.content());
        Assertions.assertEquals(ContentEncoding.BASE64, model.encoding());
        Assertions.assertEquals("gukgjnpiucgygevq", model.path());
        Assertions.assertEquals("yp", model.values().get("rbpizc"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterConfigFile model = new ClusterConfigFile().withFileName("iukbldngkpoci").withContent("z")
            .withEncoding(ContentEncoding.BASE64).withPath("gukgjnpiucgygevq")
            .withValues(mapOf("rbpizc", "yp", "j", "r", "yhxdeoejzicwi", "dpydn", "bkh", "sjttgzfbish"));
        model = BinaryData.fromObject(model).toObject(ClusterConfigFile.class);
        Assertions.assertEquals("iukbldngkpoci", model.fileName());
        Assertions.assertEquals("z", model.content());
        Assertions.assertEquals(ContentEncoding.BASE64, model.encoding());
        Assertions.assertEquals("gukgjnpiucgygevq", model.path());
        Assertions.assertEquals("yp", model.values().get("rbpizc"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

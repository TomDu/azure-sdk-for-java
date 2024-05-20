// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TagSettingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagSettingsProperties model = BinaryData
            .fromString(
                "{\"tags\":{\"slpvlop\":[\"u\",\"uosvmkfssxqukk\",\"plgmgsxnk\",\"zkd\"]},\"filterOperator\":\"All\"}")
            .toObject(TagSettingsProperties.class);
        Assertions.assertEquals("u", model.tags().get("slpvlop").get(0));
        Assertions.assertEquals(TagOperators.ALL, model.filterOperator());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagSettingsProperties model = new TagSettingsProperties()
            .withTags(mapOf("slpvlop", Arrays.asList("u", "uosvmkfssxqukk", "plgmgsxnk", "zkd")))
            .withFilterOperator(TagOperators.ALL);
        model = BinaryData.fromObject(model).toObject(TagSettingsProperties.class);
        Assertions.assertEquals("u", model.tags().get("slpvlop").get(0));
        Assertions.assertEquals(TagOperators.ALL, model.filterOperator());
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

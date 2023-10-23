// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.PublicIpAddressResourceSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PublicIpAddressResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PublicIpAddressResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Network/publicIPAddresses\",\"tags\":{\"srfbjfdtwss\":\"fsubcgjbirxbpy\",\"tpvjzbexilzznfqq\":\"t\",\"taruoujmkcj\":\"vwpm\"},\"domainNameLabel\":\"qytjrybnwjewgd\",\"fqdn\":\"ervnaenqpehi\",\"publicIpAllocationMethod\":\"oygmift\",\"sku\":\"zdnds\",\"zones\":\"nayqi\",\"targetResourceName\":\"nduhavhqlkthum\",\"targetResourceGroupName\":\"olbgycduiertgccy\"}")
                .toObject(PublicIpAddressResourceSettings.class);
        Assertions.assertEquals("nduhavhqlkthum", model.targetResourceName());
        Assertions.assertEquals("olbgycduiertgccy", model.targetResourceGroupName());
        Assertions.assertEquals("fsubcgjbirxbpy", model.tags().get("srfbjfdtwss"));
        Assertions.assertEquals("qytjrybnwjewgd", model.domainNameLabel());
        Assertions.assertEquals("ervnaenqpehi", model.fqdn());
        Assertions.assertEquals("oygmift", model.publicIpAllocationMethod());
        Assertions.assertEquals("zdnds", model.sku());
        Assertions.assertEquals("nayqi", model.zones());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PublicIpAddressResourceSettings model =
            new PublicIpAddressResourceSettings()
                .withTargetResourceName("nduhavhqlkthum")
                .withTargetResourceGroupName("olbgycduiertgccy")
                .withTags(mapOf("srfbjfdtwss", "fsubcgjbirxbpy", "tpvjzbexilzznfqq", "t", "taruoujmkcj", "vwpm"))
                .withDomainNameLabel("qytjrybnwjewgd")
                .withFqdn("ervnaenqpehi")
                .withPublicIpAllocationMethod("oygmift")
                .withSku("zdnds")
                .withZones("nayqi");
        model = BinaryData.fromObject(model).toObject(PublicIpAddressResourceSettings.class);
        Assertions.assertEquals("nduhavhqlkthum", model.targetResourceName());
        Assertions.assertEquals("olbgycduiertgccy", model.targetResourceGroupName());
        Assertions.assertEquals("fsubcgjbirxbpy", model.tags().get("srfbjfdtwss"));
        Assertions.assertEquals("qytjrybnwjewgd", model.domainNameLabel());
        Assertions.assertEquals("ervnaenqpehi", model.fqdn());
        Assertions.assertEquals("oygmift", model.publicIpAllocationMethod());
        Assertions.assertEquals("zdnds", model.sku());
        Assertions.assertEquals("nayqi", model.zones());
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

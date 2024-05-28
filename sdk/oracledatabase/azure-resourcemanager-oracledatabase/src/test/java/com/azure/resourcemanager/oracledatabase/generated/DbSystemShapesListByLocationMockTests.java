// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShape;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DbSystemShapesListByLocationMockTests {
    @Test
    public void testListByLocation() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"shapeFamily\":\"nxzhcze\",\"availableCoreCount\":1780974098,\"minimumCoreCount\":1436327406,\"runtimeMinimumCoreCount\":301256467,\"coreCountIncrement\":1698645983,\"minStorageCount\":434766918,\"maxStorageCount\":1272649211,\"availableDataStoragePerServerInTbs\":79.03815608831361,\"availableMemoryPerNodeInGbs\":389072329,\"availableDbNodePerNodeInGbs\":134126740,\"minCoreCountPerNode\":586806572,\"availableMemoryInGbs\":1381152834,\"minMemoryPerNodeInGbs\":1337568543,\"availableDbNodeStorageInGbs\":1051874879,\"minDbNodeStoragePerNodeInGbs\":100699091,\"availableDataStorageInTbs\":155304322,\"minDataStorageInTbs\":411068196,\"minimumNodeCount\":1456062548,\"maximumNodeCount\":785052924,\"availableCoreCountPerNode\":1694403926},\"id\":\"z\",\"name\":\"ofizehtdhgbj\",\"type\":\"vreljea\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DbSystemShape> response
            = manager.dbSystemShapes().listByLocation("iosrsjuivfcdis", com.azure.core.util.Context.NONE);

    }
}

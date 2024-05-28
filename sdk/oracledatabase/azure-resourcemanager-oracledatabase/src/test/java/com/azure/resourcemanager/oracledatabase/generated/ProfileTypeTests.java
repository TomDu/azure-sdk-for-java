// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.ConsumerGroup;
import com.azure.resourcemanager.oracledatabase.models.HostFormatType;
import com.azure.resourcemanager.oracledatabase.models.ProfileType;
import com.azure.resourcemanager.oracledatabase.models.ProtocolType;
import com.azure.resourcemanager.oracledatabase.models.SessionModeType;
import com.azure.resourcemanager.oracledatabase.models.SyntaxFormatType;
import com.azure.resourcemanager.oracledatabase.models.TlsAuthenticationType;
import org.junit.jupiter.api.Assertions;

public final class ProfileTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProfileType model = BinaryData.fromString(
            "{\"consumerGroup\":\"Tpurgent\",\"displayName\":\"fpjkjlxofp\",\"hostFormat\":\"Ip\",\"isRegional\":false,\"protocol\":\"TCPS\",\"sessionMode\":\"Redirect\",\"syntaxFormat\":\"Ezconnect\",\"tlsAuthentication\":\"Server\",\"value\":\"ininmay\"}")
            .toObject(ProfileType.class);
        Assertions.assertEquals(ConsumerGroup.TPURGENT, model.consumerGroup());
        Assertions.assertEquals("fpjkjlxofp", model.displayName());
        Assertions.assertEquals(HostFormatType.IP, model.hostFormat());
        Assertions.assertEquals(false, model.isRegional());
        Assertions.assertEquals(ProtocolType.TCPS, model.protocol());
        Assertions.assertEquals(SessionModeType.REDIRECT, model.sessionMode());
        Assertions.assertEquals(SyntaxFormatType.EZCONNECT, model.syntaxFormat());
        Assertions.assertEquals(TlsAuthenticationType.SERVER, model.tlsAuthentication());
        Assertions.assertEquals("ininmay", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProfileType model = new ProfileType().withConsumerGroup(ConsumerGroup.TPURGENT)
            .withDisplayName("fpjkjlxofp")
            .withHostFormat(HostFormatType.IP)
            .withIsRegional(false)
            .withProtocol(ProtocolType.TCPS)
            .withSessionMode(SessionModeType.REDIRECT)
            .withSyntaxFormat(SyntaxFormatType.EZCONNECT)
            .withTlsAuthentication(TlsAuthenticationType.SERVER)
            .withValue("ininmay");
        model = BinaryData.fromObject(model).toObject(ProfileType.class);
        Assertions.assertEquals(ConsumerGroup.TPURGENT, model.consumerGroup());
        Assertions.assertEquals("fpjkjlxofp", model.displayName());
        Assertions.assertEquals(HostFormatType.IP, model.hostFormat());
        Assertions.assertEquals(false, model.isRegional());
        Assertions.assertEquals(ProtocolType.TCPS, model.protocol());
        Assertions.assertEquals(SessionModeType.REDIRECT, model.sessionMode());
        Assertions.assertEquals(SyntaxFormatType.EZCONNECT, model.syntaxFormat());
        Assertions.assertEquals(TlsAuthenticationType.SERVER, model.tlsAuthentication());
        Assertions.assertEquals("ininmay", model.value());
    }
}

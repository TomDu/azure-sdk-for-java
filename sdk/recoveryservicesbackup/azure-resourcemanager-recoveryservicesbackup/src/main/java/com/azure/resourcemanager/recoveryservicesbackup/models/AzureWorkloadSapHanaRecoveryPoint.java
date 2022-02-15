// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** SAPHana specific recoverypoint, specifically encapsulates full/diff recoverypoints. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSAPHanaRecoveryPoint")
@Fluent
public final class AzureWorkloadSapHanaRecoveryPoint extends AzureWorkloadRecoveryPoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadSapHanaRecoveryPoint.class);

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint withRecoveryPointTimeInUtc(OffsetDateTime recoveryPointTimeInUtc) {
        super.withRecoveryPointTimeInUtc(recoveryPointTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint withType(RestorePointType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint withRecoveryPointTierDetails(
        List<RecoveryPointTierInformationV2> recoveryPointTierDetails) {
        super.withRecoveryPointTierDetails(recoveryPointTierDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRecoveryPoint withRecoveryPointMoveReadinessInfo(
        Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        super.withRecoveryPointMoveReadinessInfo(recoveryPointMoveReadinessInfo);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

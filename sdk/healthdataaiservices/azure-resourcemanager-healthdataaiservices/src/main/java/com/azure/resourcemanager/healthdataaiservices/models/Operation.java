// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.models;

import com.azure.resourcemanager.healthdataaiservices.fluent.models.OperationInner;

/**
 * An immutable client-side representation of Operation.
 */
public interface Operation {
    /**
     * Gets the name property: The name of the operation, as per Resource-Based Access Control (RBAC). Examples:
     * "Microsoft.Compute/virtualMachines/write", "Microsoft.Compute/virtualMachines/capture/action".
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Whether the operation applies to data-plane. This is "true" for data-plane
     * operations and "false" for Azure Resource Manager/control-plane operations.
     * 
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: Localized display information for this particular operation.
     * 
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: The intended executor of the operation; as in Resource Based Access Control (RBAC) and
     * audit logs UX. Default value is "user,system".
     * 
     * @return the origin value.
     */
    Origin origin();

    /**
     * Gets the actionType property: Extensible enum. Indicates the action type. "Internal" refers to actions that are
     * for internal only APIs.
     * 
     * @return the actionType value.
     */
    ActionType actionType();

    /**
     * Gets the inner com.azure.resourcemanager.healthdataaiservices.fluent.models.OperationInner object.
     * 
     * @return the inner object.
     */
    OperationInner innerModel();
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.MaintenanceConfigurationInner;
import java.util.Map;

/**
 * An immutable client-side representation of MaintenanceConfiguration.
 */
public interface MaintenanceConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: Gets or sets location of the resource.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Gets or sets tags of the resource.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the namespace property: Gets or sets namespace of the resource.
     * 
     * @return the namespace value.
     */
    String namespace();

    /**
     * Gets the extensionProperties property: Gets or sets extensionProperties of the maintenanceConfiguration.
     * 
     * @return the extensionProperties value.
     */
    Map<String, String> extensionProperties();

    /**
     * Gets the maintenanceScope property: Gets or sets maintenanceScope of the configuration.
     * 
     * @return the maintenanceScope value.
     */
    MaintenanceScope maintenanceScope();

    /**
     * Gets the visibility property: Gets or sets the visibility of the configuration. The default value is 'Custom'.
     * 
     * @return the visibility value.
     */
    Visibility visibility();

    /**
     * Gets the installPatches property: The input parameters to be passed to the patch run operation.
     * 
     * @return the installPatches value.
     */
    InputPatchConfiguration installPatches();

    /**
     * Gets the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The
     * start date can be set to either the current date or future date. The window will be created in the time zone
     * provided and adjusted to daylight savings according to that time zone.
     * 
     * @return the startDateTime value.
     */
    String startDateTime();

    /**
     * Gets the expirationDateTime property: Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm
     * format. The window will be created in the time zone provided and adjusted to daylight savings according to that
     * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum datetime
     * 9999-12-31 23:59:59.
     * 
     * @return the expirationDateTime value.
     */
    String expirationDateTime();

    /**
     * Gets the duration property: Duration of the maintenance window in HH:mm format. If not provided, default value
     * will be used based on maintenance scope provided. Example: 05:00.
     * 
     * @return the duration value.
     */
    String duration();

    /**
     * Gets the timeZone property: Name of the timezone. List of timezones can be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
     * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
     * 
     * @return the timeZone value.
     */
    String timeZone();

    /**
     * Gets the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can be expressed
     * as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
     * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
     * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
     * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples are
     * recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency as
     * integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week of Month
     * (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday] [Optional Offset(No. of days)]. Offset value must
     * be between -6 to 6 inclusive. Monthly schedule examples are recurEvery: Month, recurEvery: 2Months, recurEvery:
     * Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month Fourth Monday, recurEvery: Month Last Sunday
     * Offset-3, recurEvery: Month Third Sunday Offset6.
     * 
     * @return the recurEvery value.
     */
    String recurEvery();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.maintenance.fluent.models.MaintenanceConfigurationInner object.
     * 
     * @return the inner object.
     */
    MaintenanceConfigurationInner innerModel();

    /**
     * The entirety of the MaintenanceConfiguration definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The MaintenanceConfiguration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MaintenanceConfiguration definition.
         */
        interface Blank extends WithResourceGroup {
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName Resource Group Name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the MaintenanceConfiguration definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithTags,
            DefinitionStages.WithNamespace, DefinitionStages.WithExtensionProperties,
            DefinitionStages.WithMaintenanceScope, DefinitionStages.WithVisibility, DefinitionStages.WithInstallPatches,
            DefinitionStages.WithStartDateTime, DefinitionStages.WithExpirationDateTime, DefinitionStages.WithDuration,
            DefinitionStages.WithTimeZone, DefinitionStages.WithRecurEvery {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MaintenanceConfiguration create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MaintenanceConfiguration create(Context context);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location Gets or sets location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location Gets or sets location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets tags of the resource.
             * 
             * @param tags Gets or sets tags of the resource.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify namespace.
         */
        interface WithNamespace {
            /**
             * Specifies the namespace property: Gets or sets namespace of the resource.
             * 
             * @param namespace Gets or sets namespace of the resource.
             * @return the next definition stage.
             */
            WithCreate withNamespace(String namespace);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify extensionProperties.
         */
        interface WithExtensionProperties {
            /**
             * Specifies the extensionProperties property: Gets or sets extensionProperties of the
             * maintenanceConfiguration.
             * 
             * @param extensionProperties Gets or sets extensionProperties of the maintenanceConfiguration.
             * @return the next definition stage.
             */
            WithCreate withExtensionProperties(Map<String, String> extensionProperties);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify maintenanceScope.
         */
        interface WithMaintenanceScope {
            /**
             * Specifies the maintenanceScope property: Gets or sets maintenanceScope of the configuration.
             * 
             * @param maintenanceScope Gets or sets maintenanceScope of the configuration.
             * @return the next definition stage.
             */
            WithCreate withMaintenanceScope(MaintenanceScope maintenanceScope);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify visibility.
         */
        interface WithVisibility {
            /**
             * Specifies the visibility property: Gets or sets the visibility of the configuration. The default value is
             * 'Custom'.
             * 
             * @param visibility Gets or sets the visibility of the configuration. The default value is 'Custom'.
             * @return the next definition stage.
             */
            WithCreate withVisibility(Visibility visibility);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify installPatches.
         */
        interface WithInstallPatches {
            /**
             * Specifies the installPatches property: The input parameters to be passed to the patch run operation..
             * 
             * @param installPatches The input parameters to be passed to the patch run operation.
             * @return the next definition stage.
             */
            WithCreate withInstallPatches(InputPatchConfiguration installPatches);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify startDateTime.
         */
        interface WithStartDateTime {
            /**
             * Specifies the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm
             * format. The start date can be set to either the current date or future date. The window will be created
             * in the time zone provided and adjusted to daylight savings according to that time zone..
             * 
             * @param startDateTime Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The start
             * date can be set to either the current date or future date. The window will be created in the time zone
             * provided and adjusted to daylight savings according to that time zone.
             * @return the next definition stage.
             */
            WithCreate withStartDateTime(String startDateTime);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify expirationDateTime.
         */
        interface WithExpirationDateTime {
            /**
             * Specifies the expirationDateTime property: Effective expiration date of the maintenance window in
             * YYYY-MM-DD hh:mm format. The window will be created in the time zone provided and adjusted to daylight
             * savings according to that time zone. Expiration date must be set to a future date. If not provided, it
             * will be set to the maximum datetime 9999-12-31 23:59:59..
             * 
             * @param expirationDateTime Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format.
             * The window will be created in the time zone provided and adjusted to daylight savings according to that
             * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum
             * datetime 9999-12-31 23:59:59.
             * @return the next definition stage.
             */
            WithCreate withExpirationDateTime(String expirationDateTime);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify duration.
         */
        interface WithDuration {
            /**
             * Specifies the duration property: Duration of the maintenance window in HH:mm format. If not provided,
             * default value will be used based on maintenance scope provided. Example: 05:00..
             * 
             * @param duration Duration of the maintenance window in HH:mm format. If not provided, default value will
             * be used based on maintenance scope provided. Example: 05:00.
             * @return the next definition stage.
             */
            WithCreate withDuration(String duration);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify timeZone.
         */
        interface WithTimeZone {
            /**
             * Specifies the timeZone property: Name of the timezone. List of timezones can be obtained by executing
             * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
             * Standard Time, Korea Standard Time, Cen. Australia Standard Time..
             * 
             * @param timeZone Name of the timezone. List of timezones can be obtained by executing
             * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
             * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
             * @return the next definition stage.
             */
            WithCreate withTimeZone(String timeZone);
        }

        /**
         * The stage of the MaintenanceConfiguration definition allowing to specify recurEvery.
         */
        interface WithRecurEvery {
            /**
             * Specifies the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can
             * be expressed as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery:
             * [Frequency as integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule
             * examples are recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency
             * as integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule
             * examples are recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as
             * [Frequency as integer]['Month(s)'] [Comma separated list of month days] or [Frequency as
             * integer]['Month(s)'] [Week of Month (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday]
             * [Optional Offset(No. of days)]. Offset value must be between -6 to 6 inclusive. Monthly schedule examples
             * are recurEvery: Month, recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery: Month Last Sunday,
             * recurEvery: Month Fourth Monday, recurEvery: Month Last Sunday Offset-3, recurEvery: Month Third Sunday
             * Offset6..
             * 
             * @param recurEvery Rate at which a Maintenance window is expected to recur. The rate can be expressed as
             * daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
             * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
             * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
             * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples
             * are recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency
             * as integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week
             * of Month (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday] [Optional Offset(No. of days)].
             * Offset value must be between -6 to 6 inclusive. Monthly schedule examples are recurEvery: Month,
             * recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month
             * Fourth Monday, recurEvery: Month Last Sunday Offset-3, recurEvery: Month Third Sunday Offset6.
             * @return the next definition stage.
             */
            WithCreate withRecurEvery(String recurEvery);
        }
    }

    /**
     * Begins update for the MaintenanceConfiguration resource.
     * 
     * @return the stage of resource update.
     */
    MaintenanceConfiguration.Update update();

    /**
     * The template for MaintenanceConfiguration update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithNamespace, UpdateStages.WithExtensionProperties,
        UpdateStages.WithMaintenanceScope, UpdateStages.WithVisibility, UpdateStages.WithInstallPatches,
        UpdateStages.WithStartDateTime, UpdateStages.WithExpirationDateTime, UpdateStages.WithDuration,
        UpdateStages.WithTimeZone, UpdateStages.WithRecurEvery {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MaintenanceConfiguration apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MaintenanceConfiguration apply(Context context);
    }

    /**
     * The MaintenanceConfiguration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MaintenanceConfiguration update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets tags of the resource.
             * 
             * @param tags Gets or sets tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify namespace.
         */
        interface WithNamespace {
            /**
             * Specifies the namespace property: Gets or sets namespace of the resource.
             * 
             * @param namespace Gets or sets namespace of the resource.
             * @return the next definition stage.
             */
            Update withNamespace(String namespace);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify extensionProperties.
         */
        interface WithExtensionProperties {
            /**
             * Specifies the extensionProperties property: Gets or sets extensionProperties of the
             * maintenanceConfiguration.
             * 
             * @param extensionProperties Gets or sets extensionProperties of the maintenanceConfiguration.
             * @return the next definition stage.
             */
            Update withExtensionProperties(Map<String, String> extensionProperties);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify maintenanceScope.
         */
        interface WithMaintenanceScope {
            /**
             * Specifies the maintenanceScope property: Gets or sets maintenanceScope of the configuration.
             * 
             * @param maintenanceScope Gets or sets maintenanceScope of the configuration.
             * @return the next definition stage.
             */
            Update withMaintenanceScope(MaintenanceScope maintenanceScope);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify visibility.
         */
        interface WithVisibility {
            /**
             * Specifies the visibility property: Gets or sets the visibility of the configuration. The default value is
             * 'Custom'.
             * 
             * @param visibility Gets or sets the visibility of the configuration. The default value is 'Custom'.
             * @return the next definition stage.
             */
            Update withVisibility(Visibility visibility);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify installPatches.
         */
        interface WithInstallPatches {
            /**
             * Specifies the installPatches property: The input parameters to be passed to the patch run operation..
             * 
             * @param installPatches The input parameters to be passed to the patch run operation.
             * @return the next definition stage.
             */
            Update withInstallPatches(InputPatchConfiguration installPatches);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify startDateTime.
         */
        interface WithStartDateTime {
            /**
             * Specifies the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm
             * format. The start date can be set to either the current date or future date. The window will be created
             * in the time zone provided and adjusted to daylight savings according to that time zone..
             * 
             * @param startDateTime Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The start
             * date can be set to either the current date or future date. The window will be created in the time zone
             * provided and adjusted to daylight savings according to that time zone.
             * @return the next definition stage.
             */
            Update withStartDateTime(String startDateTime);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify expirationDateTime.
         */
        interface WithExpirationDateTime {
            /**
             * Specifies the expirationDateTime property: Effective expiration date of the maintenance window in
             * YYYY-MM-DD hh:mm format. The window will be created in the time zone provided and adjusted to daylight
             * savings according to that time zone. Expiration date must be set to a future date. If not provided, it
             * will be set to the maximum datetime 9999-12-31 23:59:59..
             * 
             * @param expirationDateTime Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format.
             * The window will be created in the time zone provided and adjusted to daylight savings according to that
             * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum
             * datetime 9999-12-31 23:59:59.
             * @return the next definition stage.
             */
            Update withExpirationDateTime(String expirationDateTime);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify duration.
         */
        interface WithDuration {
            /**
             * Specifies the duration property: Duration of the maintenance window in HH:mm format. If not provided,
             * default value will be used based on maintenance scope provided. Example: 05:00..
             * 
             * @param duration Duration of the maintenance window in HH:mm format. If not provided, default value will
             * be used based on maintenance scope provided. Example: 05:00.
             * @return the next definition stage.
             */
            Update withDuration(String duration);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify timeZone.
         */
        interface WithTimeZone {
            /**
             * Specifies the timeZone property: Name of the timezone. List of timezones can be obtained by executing
             * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
             * Standard Time, Korea Standard Time, Cen. Australia Standard Time..
             * 
             * @param timeZone Name of the timezone. List of timezones can be obtained by executing
             * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
             * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
             * @return the next definition stage.
             */
            Update withTimeZone(String timeZone);
        }

        /**
         * The stage of the MaintenanceConfiguration update allowing to specify recurEvery.
         */
        interface WithRecurEvery {
            /**
             * Specifies the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can
             * be expressed as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery:
             * [Frequency as integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule
             * examples are recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency
             * as integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule
             * examples are recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as
             * [Frequency as integer]['Month(s)'] [Comma separated list of month days] or [Frequency as
             * integer]['Month(s)'] [Week of Month (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday]
             * [Optional Offset(No. of days)]. Offset value must be between -6 to 6 inclusive. Monthly schedule examples
             * are recurEvery: Month, recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery: Month Last Sunday,
             * recurEvery: Month Fourth Monday, recurEvery: Month Last Sunday Offset-3, recurEvery: Month Third Sunday
             * Offset6..
             * 
             * @param recurEvery Rate at which a Maintenance window is expected to recur. The rate can be expressed as
             * daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
             * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
             * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
             * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples
             * are recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency
             * as integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week
             * of Month (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday] [Optional Offset(No. of days)].
             * Offset value must be between -6 to 6 inclusive. Monthly schedule examples are recurEvery: Month,
             * recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month
             * Fourth Monday, recurEvery: Month Last Sunday Offset-3, recurEvery: Month Third Sunday Offset6.
             * @return the next definition stage.
             */
            Update withRecurEvery(String recurEvery);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MaintenanceConfiguration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MaintenanceConfiguration refresh(Context context);
}

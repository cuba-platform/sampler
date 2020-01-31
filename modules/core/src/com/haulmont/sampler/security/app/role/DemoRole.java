package com.haulmont.sampler.security.app.role;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.KeyValueEntity;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.app.role.annotation.*;
import com.haulmont.cuba.security.entity.*;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;
import com.haulmont.cuba.security.role.SpecificPermissionsContainer;
import com.haulmont.sampler.entity.*;

@Role(name = DemoRole.ROLE_NAME)
public class DemoRole extends AnnotatedRoleDefinition {

    public static final String ROLE_NAME = "demo-access";

    @EntityAccess(target = FileDescriptor.class, allow = {EntityOp.READ})
    @EntityAccess(target = KeyValueEntity.class, allow = {EntityOp.READ})
    @EntityAccess(target = FilterEntity.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = UserSetting.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = CalendarEvent.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Color.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = CountryGrowth.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = CountryLitres.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = CountrySales.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Customer.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = DateSegment.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = DateTaskSpan.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = DateValue.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = DateValueVolume.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = IncomeExpenses.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Order.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = OrderItem.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = PointPair.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = PointValue.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Product.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Segment.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = StockData.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Task.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = TaskSpan.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = TipInfo.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = TitleValue.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = TransportCount.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = ValueDescription.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = DateValueGap.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(target = Employee.class,
            allow = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(target = Customer.class, view = {"avatar"})
    @DefaultEntityAttributeAccess(EntityAttrAccess.MODIFY)
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }

    @ScreenAccess(allow = {
            /* CUBA screens */
            "addCondition",
            "backgroundWorkProgressWindow",
            "backgroundWorkWindow",
            "bulkEditor",
            "cuba.gui.bulkEdit",
            "customConditionEditor",
            "customConditionFrame",
            "dynamicAttributesConditionEditor",
            "dynamicAttributesConditionFrame",
            "editWindowActions",
            "extendedEditWindowActions",
            "fileUploadDialog",
            "filterEditor",
            "filterSelect",
            "groupConditionFrame",
            "layoutAnalyzer",
            "mainWindow",
            "main",
            "loginWindow",
            "login",
            "notFoundScreen",
            "multiuploadDialog",
            "propertyConditionFrame",
            "runtimePropertiesFrame",
            "saveFilter",
            "saveSetInFolder",
            "inputDialog",
            "thirdpartyLicenseWindow",
            /* Charts screens */
            "chart$pivotTableScreen",
            /* Sampler screens */
            "sample-browser",
            "event-window",
            "sampler$Customer.browse",
            "sampler$Customer.edit",
            "sampler$Order.edit",
            "sampler$OrderItem.browse",
            "sampler$OrderItem.edit",
            "sampler$Product.edit",
            "visible-buttonspanel",
            "invisible-buttonspanel"
    })
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @Override
    @SpecificAccess(target = "cuba.gui.loginToClient", access = Access.ALLOW)
    @SpecificAccess(target = "cuba.gui.bulkEdit", access = Access.ALLOW)
    @SpecificAccess(target = "cuba.gui.filter.edit", access = Access.ALLOW)
    public SpecificPermissionsContainer specificPermissions() {
        return super.specificPermissions();
    }

    @Override
    public String getLocName() {
        return "Demo users";
    }
}

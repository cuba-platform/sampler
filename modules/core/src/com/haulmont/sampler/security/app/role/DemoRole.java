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

    @EntityAccess(entityClass = FileDescriptor.class, operations = {EntityOp.READ})
    @EntityAccess(entityClass = KeyValueEntity.class, operations = {EntityOp.READ})
    @EntityAccess(entityClass = FilterEntity.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = UserSetting.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = CalendarEvent.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Color.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = CountryGrowth.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = CountryLitres.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = CountrySales.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Customer.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = DateSegment.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = DateTaskSpan.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = DateValue.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = DateValueVolume.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = IncomeExpenses.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Order.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = OrderItem.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = PointPair.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = PointValue.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Product.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Segment.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = StockData.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Task.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = TaskSpan.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = TipInfo.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = TitleValue.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = TransportCount.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = ValueDescription.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = DateValueGap.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Employee.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @EntityAccess(entityClass = Location.class,
            operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Customer.class, view = {"avatar"})
    @EntityAttributeAccess(entityName = "*", modify = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }

    @ScreenAccess(screenIds = {
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
    @SpecificAccess(permissions = {"cuba.gui.loginToClient", "cuba.gui.bulkEdit", "cuba.gui.filter.edit"})
    public SpecificPermissionsContainer specificPermissions() {
        return super.specificPermissions();
    }

    @Override
    public String getLocName() {
        return "Demo users";
    }
}

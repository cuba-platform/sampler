package com.haulmont.sampler.web.ui.dialogsandnotifications.dialog.input;

import com.google.common.base.Strings;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions;
import com.haulmont.cuba.gui.app.core.inputdialog.InputDialog;
import com.haulmont.cuba.gui.app.core.inputdialog.InputParameter;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.components.inputdialog.InputDialogAction;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;

@UiController("input-dialog")
@UiDescriptor("input-dialog.xml")
public class InputDialogSample extends ScreenFragment {

    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private MetadataTools metadataTools;
    @Inject
    private DataManager dataManager;

    @Subscribe("standardDialogBtn")
    private void onStandardDialogBtnClick(Button.ClickEvent event) {
        dialogs.createInputDialog(this)
                .withCaption("Enter values")
                .withParameters(
                        InputParameter.stringParameter("name")
                                .withCaption("Name").withRequired(true),
                        InputParameter.doubleParameter("quantity")
                                .withCaption("Quantity").withDefaultValue(1.0),
                        InputParameter.entityParameter("customer", Customer.class)
                                .withCaption("Customer"),
                        InputParameter.enumParameter("grade", CustomerGrade.class)
                                .withCaption("Grade")
                )
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.getCloseAction().equals(InputDialog.INPUT_DIALOG_OK_ACTION)) {
                        String name = closeEvent.getValue("name");
                        Double quantity = closeEvent.getValue("quantity");
                        Customer customer = closeEvent.getValue("customer");
                        CustomerGrade grade = closeEvent.getValue("grade");

                        notifications.create()
                                .withCaption("Entered Values")
                                .withDescription("<strong>Name:</strong> " + name +
                                        "<br/><strong>Quantity:</strong> " + quantity +
                                        "<br/><strong>Customer:</strong> " + metadataTools.format(customer) +
                                        "<br/><strong>Grade:</strong> " + metadataTools.format(grade))
                                .withContentMode(ContentMode.HTML)
                                .show();
                    }
                })
                .show();
    }

    @Subscribe("customParameterBtn")
    private void onCustomParameterBtnClick(Button.ClickEvent event) {
        dialogs.createInputDialog(this)
                .withCaption("Enter values")
                .withParameters(
                        InputParameter.stringParameter("name").withCaption("Name"),
                        InputParameter.parameter("customer")
                                .withField(() -> {
                                    LookupField<Customer> field = uiComponents.create(
                                            LookupField.of(Customer.class));
                                    field.setOptionsList(dataManager.load(Customer.class).list());
                                    field.setCaption("Customer");
                                    field.setWidthFull();
                                    return field;
                                })
                )
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.getCloseAction().equals(InputDialog.INPUT_DIALOG_OK_ACTION)) {
                        String name = closeEvent.getValue("name");
                        Customer customer = closeEvent.getValue("customer");

                        notifications.create()
                                .withCaption("Entered Values")
                                .withDescription("<strong>Name:</strong> " + name +
                                        "<br/><strong>Customer:</strong> " + metadataTools.format(customer))
                                .withContentMode(ContentMode.HTML)
                                .show();
                    }
                })
                .show();
    }

    @Subscribe("customActionsBtn")
    private void onCustomActionsBtnClick(Button.ClickEvent event) {
        dialogs.createInputDialog(this)
                .withCaption("Enter values")
                .withParameters(
                        InputParameter.stringParameter("name").withCaption("Name")
                )
                .withActions(
                        InputDialogAction.action("confirm")
                                .withCaption("Confirm")
                                .withPrimary(true)
                                .withHandler(actionEvent -> {
                                    InputDialog dialog = actionEvent.getInputDialog();
                                    String name = dialog.getValue("name");
                                    dialog.closeWithDefaultAction();

                                    notifications.create()
                                            .withCaption("Entered Values")
                                            .withDescription("<strong>Name:</strong> " + name)
                                            .withContentMode(ContentMode.HTML)
                                            .show();
                                }),
                        InputDialogAction.action("refuse")
                                .withCaption("Refuse")
                                .withValidationRequired(false)
                                .withHandler(actionEvent ->
                                        actionEvent.getInputDialog().closeWithDefaultAction())
                )
                .show();
    }

    @Subscribe("validationBtn")
    private void onValidationBtnClick(Button.ClickEvent event) {
        dialogs.createInputDialog(this)
                .withCaption("Enter values")
                .withParameters(
                        InputParameter.stringParameter("name").withCaption("Name"),
                        InputParameter.entityParameter("customer", Customer.class).withCaption("Customer")
                )
                .withValidator(context -> {
                    String name = context.getValue("name");
                    Customer customer = context.getValue("customer");
                    if (Strings.isNullOrEmpty(name) && customer == null) {
                        return ValidationErrors.of("Enter name or select a customer");
                    }
                    return ValidationErrors.none();
                })
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.getCloseAction().equals(InputDialog.INPUT_DIALOG_OK_ACTION)) {
                        String name = closeEvent.getValue("name");
                        Customer customer = closeEvent.getValue("customer");

                        notifications.create()
                                .withCaption("Entered Values")
                                .withDescription("<strong>Name:</strong> " + name +
                                        "<br/><strong>Customer:</strong> " + metadataTools.format(customer))
                                .withContentMode(ContentMode.HTML)
                                .show();
                    }
                })
                .show();
    }
}
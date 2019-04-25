package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.event.ActionEvent;

public class RegisterFailedController implements Controller {

    RegisterFailedModel registerFailedModel;

    public void button_abort_onAction(ActionEvent actionEvent) {
        registerFailedModel.setRetry(false);
        registerFailedModel.close();
    }

    public void button_retry_onAction(ActionEvent actionEvent) {
        registerFailedModel.setRetry(true);
        registerFailedModel.close();
    }

    public void update() {

    }

    public void initialize(Model model) {
        registerFailedModel = (RegisterFailedModel) model;
        registerFailedModel.getErrorMessage();
    }
}

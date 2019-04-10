package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.event.ActionEvent;

public class RegisterFailedController implements Controller {

    RegisterFailedModel registerFailedModel;

    public void update(Model model) {
        registerFailedModel = (RegisterFailedModel) model;
        registerFailedModel.getErrorMessage();
    }

    public void button_abort_onAction(ActionEvent actionEvent) {
    }

    public void button_retry_onAction(ActionEvent actionEvent) {
    }
}

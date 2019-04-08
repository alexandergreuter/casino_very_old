/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ch.bbbaden.programmierwoche.casino.Scenes;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import main.ch.bbbaden.programmierwoche.casino.Controller;
import main.ch.bbbaden.programmierwoche.casino.Model;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author felix
 */
public class LoginFailedController implements Initializable, Controller {

    public Button button_retry;
    @FXML
    private Label errorMessage;
    @FXML
    private Button button_abort;
    @FXML
    private Button button_abort1;

    private LoginFailedModel loginFailedModel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void button_abort_onAction() {
        loginFailedModel.setRetry(false);
        loginFailedModel.close();
    }

    public void button_retry_onAction() {
        loginFailedModel.setRetry(true);
        loginFailedModel.close();
    }

    @Override
    public void update(Model model) {
        loginFailedModel = (LoginFailedModel) model;
        errorMessage.setText(loginFailedModel.getErrorMessage());
    }
}

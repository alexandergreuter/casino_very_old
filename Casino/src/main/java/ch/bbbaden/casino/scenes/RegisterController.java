/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author felix
 */
public class RegisterController implements Initializable, Controller {

    public Button login;
    public TextField username;
    public Button register;
    public PasswordField password;
    public TextField startCoins;
    RegisterModel registerModel;

    /**
     * Initializes the controller class.
     */

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    public void update(Model model) {
        registerModel = (RegisterModel) model;
    }

    public void on_register(ActionEvent actionEvent) throws NumberFormatException {
        registerModel.register(username.getText(), password.getText(), Integer.parseInt(startCoins.getText()));
    }
}

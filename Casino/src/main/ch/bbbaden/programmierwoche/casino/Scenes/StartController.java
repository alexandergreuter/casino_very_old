/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ch.bbbaden.programmierwoche.casino.Scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import main.ch.bbbaden.programmierwoche.casino.Controller;
import main.ch.bbbaden.programmierwoche.casino.Model;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author felix
 */
public class StartController implements Initializable, Controller {

    @FXML
    private Button login;
    @FXML
    private Button registrieren;
    @FXML
    private Button adminLogin;

    private StartModel model;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void login(ActionEvent event) {
        model.openLogin();
    }

    @FXML
    private void registrieren(ActionEvent event) {
        model.openRegister();
    }

    @FXML
    private void adminLogin(ActionEvent event) {
    }

    @Override
    public void update(Model model) {
        this.model = (StartModel) model;
    }
}

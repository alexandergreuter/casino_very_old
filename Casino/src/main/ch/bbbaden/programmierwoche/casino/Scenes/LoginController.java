package main.ch.bbbaden.programmierwoche.casino.Scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import main.ch.bbbaden.programmierwoche.casino.Controller;
import main.ch.bbbaden.programmierwoche.casino.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable, Controller {

    public Button btn_back;
    private Label label;
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    private LoginModel loginModel;

    private void handleButtonAction(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void on_login(ActionEvent event) {
        loginModel.login(username.getText(), password.getText());
    }

    @Override
    public void update(Model model) {
        loginModel = (LoginModel) model;
        username.setText(loginModel.getUsername());
        password.setText(loginModel.getPassword());
    }

    public void on_username_key(KeyEvent keyEvent) {
        if (keyEvent.getCharacter().equals("\r")) {
            password.requestFocus();
            password.selectAll();
        }
    }

    public void on_password_key(KeyEvent keyEvent) {
        if (keyEvent.getCharacter().equals("\r")) {
            if (username.getText().equals("")) {
                username.requestFocus();
            } else {
                loginModel.login(username.getText(), password.getText());
            }
        }
    }

    public void btn_back_onAction(ActionEvent actionEvent) {
        loginModel.showStartMenu();
    }
}

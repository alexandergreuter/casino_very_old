/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ch.bbbaden.programmierwoche.casino.Scenes;

import main.ch.bbbaden.programmierwoche.casino.Model;
import main.ch.bbbaden.programmierwoche.casino.User;

import java.sql.SQLException;

/**
 * @author greut
 */
class LoginModel extends Model {
    private User user;

    private String username = "";
    private String password = "";

    LoginModel() {
        super("/fxml/Login.fxml", "Login", true);
    }

    private void showErrorMessage(String message) {
        LoginFailedModel errView = new LoginFailedModel(message);
        changeScene(errView);
        if (errView.doRetry()) {
            username = "";
            password = "";
            show();
        } else {
            changeScene(new StartModel());
        }
        errView.close();
    }

    void login(String username, String password) {
        boolean loginSuccessful = false;
        user = new User();
        try {
            user.login(username, password);
            loginSuccessful = true;
        } catch (SQLException ex) {
            showErrorMessage(ex.getLocalizedMessage());
        }

        if (loginSuccessful) {
            changeScene(new HomeModel(user));
        }
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

    void showStartMenu() {
        changeScene(new StartModel());
    }
}

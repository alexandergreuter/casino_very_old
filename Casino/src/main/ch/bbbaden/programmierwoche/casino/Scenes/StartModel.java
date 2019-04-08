/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ch.bbbaden.programmierwoche.casino.Scenes;

import main.ch.bbbaden.programmierwoche.casino.Model;

/**
 * @author greut
 */
public class StartModel extends Model {

    public StartModel() {
        super("/fxml/Start.fxml", "Casino", true);
    }

    void openLogin() {
        changeScene(new LoginModel());
    }

    void openRegister() {
        changeScene(new RegisterModel());
    }
}

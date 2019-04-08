package main.ch.bbbaden.programmierwoche.casino.Games;

import javafx.fxml.Initializable;
import main.ch.bbbaden.programmierwoche.casino.Controller;
import main.ch.bbbaden.programmierwoche.casino.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class TestGame2Controller implements Initializable, Controller {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @Override
    public void update(Model model) {
        System.out.println(this);
    }
}

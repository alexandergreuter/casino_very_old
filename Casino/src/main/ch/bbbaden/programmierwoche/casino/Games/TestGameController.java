package main.ch.bbbaden.programmierwoche.casino.Games;


import javafx.fxml.Initializable;
import main.ch.bbbaden.programmierwoche.casino.Controller;
import main.ch.bbbaden.programmierwoche.casino.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class TestGameController implements Initializable, Controller {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(this);
    }

    @Override
    public void update(Model model) {
        System.out.println(this);
    }
}

package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class TestGame2Controller implements Initializable, Controller {

    public void initialize(URL location, ResourceBundle resources) {
    }

    public void update(Model model) {
        System.out.println(this);
    }
}

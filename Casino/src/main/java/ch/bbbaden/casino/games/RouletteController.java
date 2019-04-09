package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RouletteController implements Controller, Initializable {

    private RouletteModel rouletteModel;
    private ArrayList<Button> buttons = new ArrayList<Button>();
    @FXML
    private GridPane gridPane;

    public void update(Model model) {
        rouletteModel = (RouletteModel) model;
        int rows = gridPane.getRowConstraints().size();
        int columns = gridPane.getColumnConstraints().size();

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Button button = new Button("Text");
                button.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        handleButtonAction((Button) e.getSource());
                    }
                });
                button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                gridPane.add(button, column, row);
                System.out.println(row);
            }
        }
    }

    private void handleButtonAction(Button button) {
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}

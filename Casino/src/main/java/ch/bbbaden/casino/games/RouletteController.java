package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class RouletteController implements Controller {

    public Button besbutt;
    public Button abbbutt;
    public AnchorPane anchorPane;
    public ImageView jeton5;
    private RouletteModel rouletteModel;
    private ArrayList<Button> buttons = new ArrayList<Button>();
    @FXML
    private GridPane gridPane;

    public void update(Model model) {

    }

    private void handleButtonAction(Button button, ActionEvent actionEvent) {
        System.out.println(button);
        ImageView iv = new ImageView("/images/jeton-red.png");
        System.out.println(GridPane.getColumnIndex(button));
        System.out.println(GridPane.getRowIndex(button));
        gridPane.add(iv, GridPane.getColumnIndex(button), GridPane.getRowIndex(button));
        //anchorPane.getChildren().add(iv);
        //iv.setX(button.getLayoutX() + button.getParent().getLayoutX());
        //iv.setY(button.getLayoutY() + button.getParent().getLayoutY());
        iv.setScaleX(0.1);
        iv.setScaleY(0.1);
    }

    public void abbmethod(ActionEvent actionEvent) {
        Stage stage = (Stage) abbbutt.getScene().getWindow();
        stage.close();
    }

    public void update() {

    }

    public void initialize(Model model) {

        rouletteModel = (RouletteModel) model;

        int rows = gridPane.getRowConstraints().size();
        int columns = gridPane.getColumnConstraints().size();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Button button = new Button("Text");
                gridPane.add(button, column, row);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        handleButtonAction((Button) e.getSource(), e);
                    }
                });
                button.setOpacity(0);
                button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        }
    }

    public void jeton5click(MouseEvent mouseEvent) {
        jeton5.setImage(new Image("/images/Roulette_Bilder/Jetons5-Ausgewählt.png"));
    }
}

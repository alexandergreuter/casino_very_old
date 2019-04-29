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

    public ImageView jeton100;
    SelectedJeton selectedJeton;

    public Button besbutt;
    public Button abbbutt;
    public AnchorPane anchorPane;
    public ImageView jeton5;
    public ImageView jeton25;
    public ImageView jeton50;
    public ImageView jeton1001;
    public ImageView jeton10;
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



    public void handleJeton5(MouseEvent mouseEvent) {
        jeton5.setImage(new Image("/images/Roulette_Bilder/Jetons-5-Ausgewählt.png"));
        jeton10.setImage(new Image("/images/Roulette_Bilder/jetons-10.png"));
        jeton25.setImage(new Image("/images/Roulette_Bilder/jetons-25.png"));
        jeton50.setImage(new Image("/images/Roulette_Bilder/jetons-50.png"));
        jeton100.setImage(new Image("/images/Roulette_Bilder/jetons-100.png"));
    }

    public void handleJeton10(MouseEvent mouseEvent) {
        jeton10.setImage(new Image("/images/Roulette_Bilder/Jetons-10-Ausgewählt.png"));
        jeton5.setImage(new Image("/images/Roulette_Bilder/Jetons-5.png"));
        jeton25.setImage(new Image("/images/Roulette_Bilder/jetons-25.png"));
        jeton50.setImage(new Image("/images/Roulette_Bilder/jetons-50.png"));
        jeton100.setImage(new Image("/images/Roulette_Bilder/jetons-100.png"));
    }

    public void handleJeton25(MouseEvent mouseEvent) {
        jeton25.setImage(new Image("/images/Roulette_Bilder/Jetons-25-Ausgewählt.png"));
        jeton5.setImage(new Image("/images/Roulette_Bilder/Jetons-5.png"));
        jeton10.setImage(new Image("/images/Roulette_Bilder/jetons-10.png"));
        jeton50.setImage(new Image("/images/Roulette_Bilder/jetons-50.png"));
        jeton100.setImage(new Image("/images/Roulette_Bilder/jetons-100.png"));
    }

    public void handleJeton50(MouseEvent mouseEvent) {
        jeton50.setImage(new Image("/images/Roulette_Bilder/Jetons-50-Ausgewählt.png"));
        jeton5.setImage(new Image("/images/Roulette_Bilder/Jetons-5.png"));
        jeton10.setImage(new Image("/images/Roulette_Bilder/jetons-10.png"));
        jeton25.setImage(new Image("/images/Roulette_Bilder/jetons-25.png"));
        jeton100.setImage(new Image("/images/Roulette_Bilder/jetons-100.png"));
    }

    public void handleJeton100(MouseEvent mouseEvent) {
        jeton100.setImage(new Image("/images/Roulette_Bilder/Jetons-100-Ausgewählt.png"));
        jeton5.setImage(new Image("/images/Roulette_Bilder/Jetons-5.png"));
        jeton10.setImage(new Image("/images/Roulette_Bilder/jetons-10.png"));
        jeton25.setImage(new Image("/images/Roulette_Bilder/jetons-25.png"));
        jeton50.setImage(new Image("/images/Roulette_Bilder/jetons-50.png"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ch.bbbaden.programmierwoche.casino.Scenes;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import main.ch.bbbaden.programmierwoche.casino.Controller;
import main.ch.bbbaden.programmierwoche.casino.Model;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author felix
 */
public class HomeController implements Initializable, Controller {

    public Button btn_play;
    public Label coins;
    public ImageView game_image;
    public Button btn_left;
    public Button btn_right;
    @FXML
    private Pane gameView;

    private HomeModel homeModel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void update(Model model) {
        homeModel = (HomeModel) model;
        coins.setText(homeModel.getCoins());
        game_image.setImage(new Image(homeModel.getImagePath()));
    }

    public void btn_play_onAction(ActionEvent actionEvent) {
        homeModel.playGame();
    }

    public void btn_right_onAction(ActionEvent actionEvent) {
        fade(20, 0, 1, 0);
        homeModel.changeGame(1);
        fade(0, -20, 0, 1);
    }

    public void btn_left_onAction(ActionEvent actionEvent) {
        fade(-20, 0, 1, 0);
        homeModel.changeGame(-1);
        fade(0, 20, 0, 1);
    }

    private void fade(int moveTo, int moveFrom, float fadeFrom, float fadeTo) {
        FadeTransition fadeTransition =
                new FadeTransition(Duration.millis(500), gameView);
        fadeTransition.setFromValue(fadeFrom);
        fadeTransition.setToValue(fadeTo);
        TranslateTransition translateTransition =
                new TranslateTransition(Duration.millis(490), gameView);
        translateTransition.setFromX(moveFrom);
        translateTransition.setToX(moveTo);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                fadeTransition,
                translateTransition
        );
        parallelTransition.play();
    }
}

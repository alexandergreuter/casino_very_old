package main.ch.bbbaden.programmierwoche.casino;

import javafx.application.Application;
import javafx.stage.Stage;
import main.ch.bbbaden.programmierwoche.casino.Scenes.StartModel;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        new ModelManager(stage).setModel(new StartModel());
    }

    public static void main(String[] args) {
        launch(args);
    }

}

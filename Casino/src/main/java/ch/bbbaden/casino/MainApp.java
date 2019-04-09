package ch.bbbaden.casino;

import ch.bbbaden.casino.scenes.StartModel;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        new ModelManager(stage).setModel(new StartModel());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

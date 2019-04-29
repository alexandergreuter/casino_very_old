package ch.bbbaden.casino;

import ch.bbbaden.casino.scenes.StartModel;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws SQLException {
        new ModelManager(stage).setModel(new StartModel());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

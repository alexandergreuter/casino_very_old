package ch.bbbaden.casino;

import ch.bbbaden.casino.games.PennyPusherModel;
import ch.bbbaden.casino.scenes.StartModel;
import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws SQLException {
        new ModelManager(stage).setModel(new StartModel());
    }
}

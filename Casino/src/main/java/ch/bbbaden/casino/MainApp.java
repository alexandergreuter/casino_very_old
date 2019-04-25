package ch.bbbaden.casino;

import ch.bbbaden.casino.games.PennyPusherModel;
import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws SQLException {
        NormalUser normalUser = new NormalUser();
        normalUser.login("OTTO", "OTTO");
        new ModelManager(stage).setModel(new PennyPusherModel(normalUser));
    }

    public static void main(String[] args) {
        launch(args);
    }
}

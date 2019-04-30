package ch.bbbaden.casino;

import ch.bbbaden.casino.games.RouletteModel;
import ch.bbbaden.casino.scenes.StartModel;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws SQLException {
        NormalUser user = new NormalUser();
        user.login("Lijan","0987");
        new ModelManager(stage).setModel(new RouletteModel(user));
    }

    public static void main(String[] args) {
        launch(args);
    }
}

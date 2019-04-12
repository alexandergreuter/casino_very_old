package ch.bbbaden.casino;

import ch.bbbaden.casino.games.BaccaratModel;
import ch.bbbaden.casino.scenes.StartModel;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws SQLException, NoSuchAlgorithmException {
        NormalUser normalUser = new NormalUser();
        normalUser.login("FELIX", "XILEFTON");
        new ModelManager(stage).setModel(new StartModel());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

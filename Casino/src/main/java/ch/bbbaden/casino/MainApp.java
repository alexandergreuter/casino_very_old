package ch.bbbaden.casino;

import ch.bbbaden.casino.games.RouletteModel;
import ch.bbbaden.casino.scenes.StartModel;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        NormalUser user = new NormalUser();
        user.purchaseCoins(200);
        new ModelManager(stage).setModel(new RouletteModel(user));
    }

    public static void main(String[] args) {
        launch(args);
    }

}

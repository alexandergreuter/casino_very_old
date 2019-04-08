package main.ch.bbbaden.programmierwoche.casino.Games;

import main.ch.bbbaden.programmierwoche.casino.User;

public class TestGameModel extends Game {
    public TestGameModel(User user) {
        super("/fxml/TestGame.fxml", "Test", "/images/Roulette_Logo.png", user);
    }
}

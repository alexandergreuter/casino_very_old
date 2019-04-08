package ch.bbbaden.casino.games;

import ch.bbbaden.casino.User;

public class TestGameModel extends Game {
    public TestGameModel(User user) {
        super("/fxml/TestGame.fxml", "Test", "/images/Roulette_Logo.png", user);
    }
}

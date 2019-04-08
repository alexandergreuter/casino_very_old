package ch.bbbaden.casino.games;

import ch.bbbaden.casino.User;

public class TestGame2Model extends Game {
    public TestGame2Model(User user) {
        super("/fxml/TestGame.fxml", "Test", "/images/Baccarat_Logo.png", user);
    }

}

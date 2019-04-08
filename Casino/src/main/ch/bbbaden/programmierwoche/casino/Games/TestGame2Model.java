package main.ch.bbbaden.programmierwoche.casino.Games;

import main.ch.bbbaden.programmierwoche.casino.User;

public class TestGame2Model extends Game {
    public TestGame2Model(User user) {
        super("/fxml/TestGame.fxml", "Test", "/images/Baccarat_Logo.png", user);
    }

}

package ch.bbbaden.casino.games;

public class TestGameModel extends Game {
    public TestGameModel(oldNormalUser normalUser) {
        super("/fxml/TestGame.fxml", "Test", "/images/Roulette_Logo.png", normalUser);
    }
}

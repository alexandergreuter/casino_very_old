package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Model;
import ch.bbbaden.casino.NormalUser;

public class RouletteModel extends Game {
    public RouletteModel(NormalUser normalUser) {
        super("/fxml/Roulette.fxml", "Roulette","/images/Roulette_Logo.png", normalUser);
    }
}

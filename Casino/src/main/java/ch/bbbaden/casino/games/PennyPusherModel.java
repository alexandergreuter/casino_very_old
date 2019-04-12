package ch.bbbaden.casino.games;

import ch.bbbaden.casino.NormalUser;

public class PennyPusherModel extends Game {
    public PennyPusherModel(NormalUser normalUser) {
        super("/fxml/PennyPusher.fxml", "PennyPusher by AlexiBexi", "/images/PennyPusher_Logo.png", normalUser);
    }
}

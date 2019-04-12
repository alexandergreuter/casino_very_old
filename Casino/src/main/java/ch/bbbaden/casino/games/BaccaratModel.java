package ch.bbbaden.casino.games;

import ch.bbbaden.casino.NormalUser;

public class BaccaratModel extends Game{
    public BaccaratModel(NormalUser normalUser) {
        super("/fxml/Baccarat.fxml", "Baccarat by Felix", "/images/Baccarat_Logo.png", normalUser);
    }
}

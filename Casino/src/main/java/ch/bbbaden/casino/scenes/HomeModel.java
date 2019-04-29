package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.NormalUser;
import ch.bbbaden.casino.games.BaccaratModel;
import ch.bbbaden.casino.games.Game;
import ch.bbbaden.casino.Model;

import java.sql.SQLException;


class HomeModel extends Model {

    private NormalUser normalUser;
    private Game[] games;
    private int currIndex = 0;

    HomeModel(NormalUser normalUser) {
        super("/fxml/Home.fxml", "Welcome", true);
        this.normalUser = normalUser;
        games = new Game[]{new BaccaratModel(normalUser)};
    }

    String getCoins() {
        try {
            return Integer.toString(normalUser.getCoins());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    void playGame() {
        hide();
        changeScene(games[currIndex]);
        show();
    }

    void changeGame(int indexOffset) {
        if (currIndex + indexOffset < 0) {
            currIndex = games.length + (currIndex + indexOffset);
        } else if (currIndex + indexOffset >= games.length) {
            currIndex = -(games.length - (currIndex + indexOffset));
        } else {
            currIndex += indexOffset;
        }
        notifyController();
    }

    String getImagePath() {
        return games[currIndex].getImagePath();
    }
}

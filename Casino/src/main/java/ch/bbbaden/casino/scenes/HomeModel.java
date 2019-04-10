package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.NormalUser;
import ch.bbbaden.casino.games.Game;
import ch.bbbaden.casino.games.TestGame2Model;
import ch.bbbaden.casino.games.TestGameModel;
import ch.bbbaden.casino.Model;


class HomeModel extends Model {

    private NormalUser normalUser;
    private Game[] games;
    private int currIndex = 0;

    HomeModel(NormalUser normalUser) {
        super("/fxml/Home.fxml", "Welcome", true);
        this.normalUser = normalUser;
        games = new Game[]{new TestGameModel(normalUser), new TestGame2Model(normalUser)};
    }

    String getCoins() {
        return Integer.toString(normalUser.getCoins());
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

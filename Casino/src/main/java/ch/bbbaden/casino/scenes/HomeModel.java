package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.games.Game;
import ch.bbbaden.casino.games.TestGame2Model;
import ch.bbbaden.casino.games.TestGameModel;
import ch.bbbaden.casino.Model;
import ch.bbbaden.casino.User;


class HomeModel extends Model {

    private User user;
    private Game[] games;
    private int currIndex = 0;

    HomeModel(User user) {
        super("/fxml/Home.fxml", "Welcome", true);
        this.user = user;
        games = new Game[]{new TestGameModel(user), new TestGame2Model(user)};
    }

    String getCoins() {
        return Integer.toString(user.getCoins());
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

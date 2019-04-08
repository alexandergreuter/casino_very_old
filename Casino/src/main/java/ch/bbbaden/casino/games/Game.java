package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Model;
import ch.bbbaden.casino.User;

public abstract class Game extends Model {

    private String imagePath;
    private User user;

    Game(String fxmlDocument, String windowTitle, String imagePath, User user) {
        super(fxmlDocument, windowTitle, false);
        this.imagePath = imagePath;
        this.user = user;
    }

    public String getImagePath() {
        return imagePath;
    }

    public User getUser() {
        return user;
    }
}

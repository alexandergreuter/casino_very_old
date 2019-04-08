package main.ch.bbbaden.programmierwoche.casino.Games;

import main.ch.bbbaden.programmierwoche.casino.Model;
import main.ch.bbbaden.programmierwoche.casino.User;

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

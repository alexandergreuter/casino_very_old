package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Model;

public class Game extends Model {

    private String imagePath;
    private oldNormalUser normalUser;

    Game(String fxmlDocument, String windowTitle, String imagePath, oldNormalUser normalUser) {
        super(fxmlDocument, windowTitle, false);
        this.imagePath = imagePath;
        this.normalUser = normalUser;
    }

    public String getImagePath() {
        return imagePath;
    }

    public oldNormalUser getNormalUser() {
        return normalUser;
    }
}

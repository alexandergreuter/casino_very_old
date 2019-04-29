package ch.bbbaden.casino.games;

import ch.bbbaden.casino.NormalUser;

import java.sql.SQLException;

public class PennyPusherModel extends Game{

    private int field;

    public PennyPusherModel(NormalUser normalUser) {
        super("/fxml/PennyPusher.fxml", "Penny Pusher", "/images/PennyPusher_Logo.png", normalUser);
    }

    public String getCoins() {
        try {
            return Integer.toString(getNormalUser().getCoins());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    public int[][] getField() {
        return new int[][] {{0},{0}};
    }
}

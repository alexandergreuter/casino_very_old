package ch.bbbaden.casino;

import java.sql.SQLException;
import java.util.Random;

public class NormalUser extends User {

    private int coins;
    private int purchasedCoins;

    public void addCoins(int coins) {
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }

    public void purchaseCoins(int coins) {
        this.purchasedCoins += coins;
        this.coins += coins;
    }

    public void register(String login, String password) throws SQLException {
        if (!login.equals("hans")) {
            Random rnd = new Random();
            if (rnd.nextBoolean()) {
                throw new SQLException("wrong password");
            }
        } else {
            throw new SQLException("user already exists");
        }
    }

}
package ch.bbbaden.casino;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class NormalUser extends User {

    private int coins;
    private int purchasedCoins;
    private boolean changed = true;
    private String update;
    private ResultSet rs;
    private Statement st;

    public NormalUser() {
        super(false);
    }


    public void addCoins(int coins) {
        this.coins = coins;
    }

    public int getCoins() throws SQLException {
        if (changed) {
            rs = st.executeQuery("SELECT `coins` FROM `normalusers` WHERE `username` = \"" + super.getUsername() + "\"");
            rs.next();
            changed = false;
            coins = Integer.parseInt(rs.getString(1));
            return coins;
        } else {
            return coins;
        }
    }

    public void purchaseCoins(int coins) {
        this.purchasedCoins += coins;
        this.coins += coins;
    }

    public void register(String username, String password, int coins) throws SQLException {
        openConnection();
        if (!userExists(username)) {
            try {
                try {
                    update = "INSERT INTO `normalusers`(`username`, `password`, `coins`, `purchased`) VALUES ('" + username + "','" + calculateHash(password) + "','" + coins + "','" + coins + "')";
                } catch (NoSuchAlgorithmException e) {
                    throw new SQLException("damn critical error");
                }
                st = connie.createStatement();
                st.executeUpdate(update);
            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        } else {
            throw new SQLException("User existiert bereits");
        }
    }

}
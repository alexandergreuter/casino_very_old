package ch.bbbaden.casino;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

public class User {

    String username, password;

    public User() throws SQLException {
        Connection connie = DriverManager.getConnection("jdbc:mysql://localhost:3306/casino", "root", "");
    }

    public void login(String username, String password) throws SQLException {
        this.username = username;
        this.password = password;
        if (username.equals("hans")) {
            if (password.equals("1234")) {
                Random rnd = new Random();
                if (rnd.nextBoolean()) {
                    throw new SQLException("Zugriff auf die Datenbank ist fehlgeschlagen");
                }
            } else {
                throw new SQLException("Falsches Passwort");
            }
        } else {
            throw new SQLException("Benutzer wurde nicht gefunden");
        }
    }


    public String calculateHash(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return myHash;
    }

    private boolean searchUserExistance(String username) {
        return false;
    }
}

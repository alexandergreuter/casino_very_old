package ch.bbbaden.casino;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.Random;

public class User {

    private String username, password;
    Connection connie;
    private Statement statement;
    private ResultSet rs;

    public void login(String username, String password) throws SQLException {
        this.username = username;
        this.password = password;

        connie = DriverManager.getConnection("jdbc:mysql://localhost:3306/casino", "root", "");
        statement = connie.createStatement();
        rs = statement.executeQuery("SELECT * FROM users");

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

    private boolean searchUserExistance(String username) throws SQLException {
        while (rs.next()) {
            System.out.println("| " + rs.getString(1));
            System.out.println("|");
        }
        return false;
    }
}

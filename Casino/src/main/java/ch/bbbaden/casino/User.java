package ch.bbbaden.casino;

import java.sql.SQLException;
import java.util.Random;

public class User {
    public void login(String login, String password) throws SQLException {
        if (login.equals("hans")) {
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
}

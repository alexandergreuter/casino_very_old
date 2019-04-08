/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ch.bbbaden.programmierwoche.casino;

import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author greut
 */
public class User {

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

package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;

public class BaccaratController implements Controller {
    private BaccaratModel baccaratModel;

    public void update(Model model) {
        baccaratModel = (BaccaratModel) model;
    }

    public void update() {

    }

    public void initialize(Model model) {

    }
}
